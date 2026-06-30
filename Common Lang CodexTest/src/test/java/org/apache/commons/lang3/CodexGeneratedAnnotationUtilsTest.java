package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.jupiter.api.Test;

class CodexGeneratedAnnotationUtilsTest {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Nested {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Sample {
        int number();
        String text();
        int[] numbers();
        Nested nested();
    }

    @Sample(number = 7, text = "alpha", numbers = { 1, 2 }, nested = @Nested("inner"))
    static class First {
    }

    @Sample(number = 7, text = "alpha", numbers = { 1, 2 }, nested = @Nested("inner"))
    static class SameAsFirst {
    }

    @Sample(number = 8, text = "beta", numbers = { 2, 1 }, nested = @Nested("other"))
    static class Different {
    }

    @Test
    void equalsHonorsAnnotationMembersIncludingArraysAndNestedAnnotations() {
        final Sample first = First.class.getAnnotation(Sample.class);
        final Sample same = SameAsFirst.class.getAnnotation(Sample.class);
        final Sample different = Different.class.getAnnotation(Sample.class);

        assertTrue(AnnotationUtils.equals(first, same));
        assertFalse(AnnotationUtils.equals(first, different));
        assertFalse(AnnotationUtils.equals(first, null));
    }

    @Test
    void hashCodeAndToStringAreStableForEquivalentAnnotations() {
        final Sample first = First.class.getAnnotation(Sample.class);
        final Sample same = SameAsFirst.class.getAnnotation(Sample.class);

        assertEquals(AnnotationUtils.hashCode(first), AnnotationUtils.hashCode(same));
        assertNotNull(AnnotationUtils.toString(first));
        assertTrue(AnnotationUtils.toString(first).contains("number=7"));
    }

    @Test
    void validMemberTypesMatchAnnotationContract() {
        assertTrue(AnnotationUtils.isValidAnnotationMemberType(String.class));
        assertTrue(AnnotationUtils.isValidAnnotationMemberType(int[].class));
        assertTrue(AnnotationUtils.isValidAnnotationMemberType(Nested.class));
        assertFalse(AnnotationUtils.isValidAnnotationMemberType(Object.class));
        assertFalse(AnnotationUtils.isValidAnnotationMemberType(null));
        assertNotEquals(AnnotationUtils.hashCode(First.class.getAnnotation(Sample.class)),
                AnnotationUtils.hashCode(Different.class.getAnnotation(Sample.class)));
    }
}
