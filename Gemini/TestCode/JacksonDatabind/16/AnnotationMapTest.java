package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class AnnotationMapTest {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnOne {
        String value() default "";
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnTwo {
        int value() default 0;
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnThree {
    }

    @TestAnnOne("value1")
    @TestAnnTwo(10)
    private static class SampleHolderOne {}

    @TestAnnOne("value1")
    private static class SampleHolderSameAnnOne {}

    @TestAnnOne("value2")
    private static class SampleHolderDiffAnnOne {}

    @TestAnnThree
    private static class SampleHolderThree {}

    private final TestAnnOne annOne = SampleHolderOne.class.getAnnotation(TestAnnOne.class);
    private final TestAnnOne annOneSame = SampleHolderSameAnnOne.class.getAnnotation(TestAnnOne.class);
    private final TestAnnOne annOneDiff = SampleHolderDiffAnnOne.class.getAnnotation(TestAnnOne.class);
    private final TestAnnTwo annTwo = SampleHolderOne.class.getAnnotation(TestAnnTwo.class);
    private final TestAnnThree annThree = SampleHolderThree.class.getAnnotation(TestAnnThree.class);

    @Test
    public void testConstructor_default_initializesWithNullAnnotations() {
        AnnotationMap map = new AnnotationMap();
        assertNull(map._annotations);
        assertEquals(0, map.size());
    }

    @Test
    public void testGet_whenAnnotationsNull_returnsNull() {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(TestAnnOne.class));
    }

    @Test
    public void testGet_whenAnnotationExists_returnsAnnotation() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        TestAnnOne retrieved = map.get(TestAnnOne.class);
        assertNotNull(retrieved);
        assertEquals("value1", retrieved.value());
    }

    @Test
    public void testGet_whenAnnotationDoesNotExist_returnsNull() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        assertNull(map.get(TestAnnTwo.class));
    }

    @Test
    public void testAnnotations_whenAnnotationsNull_returnsEmptyIterable() {
        AnnotationMap map = new AnnotationMap();
        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        assertFalse(iterable.iterator().hasNext());
    }

    @Test
    public void testAnnotations_whenAnnotationsExplicitlyEmpty_returnsEmptyIterable() {
        AnnotationMap map = new AnnotationMap();
        map._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        assertFalse(iterable.iterator().hasNext());
    }

    @Test
    public void testAnnotations_whenNotEmpty_returnsAllAnnotations() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        map.add(annTwo);

        Iterable<Annotation> iterable = map.annotations();
        int count = 0;
        for (Annotation ann : iterable) {
            assertNotNull(ann);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testSize_whenNull_returnsZero() {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testSize_whenPopulated_returnsCorrectCount() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        assertEquals(1, map.size());
        map.add(annTwo);
        assertEquals(2, map.size());
    }

    @Test
    public void testAddIfNotPresent_whenAnnotationsNull_addsAndReturnsTrue() {
        AnnotationMap map = new AnnotationMap();
        boolean result = map.addIfNotPresent(annOne);
        assertTrue(result);
        assertEquals(1, map.size());
        assertEquals(annOne, map.get(TestAnnOne.class));
    }

    @Test
    public void testAddIfNotPresent_whenNewAnnotationType_addsAndReturnsTrue() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        boolean result = map.addIfNotPresent(annTwo);
        assertTrue(result);
        assertEquals(2, map.size());
        assertEquals(annTwo, map.get(TestAnnTwo.class));
    }

    @Test
    public void testAddIfNotPresent_whenAnnotationTypeAlreadyPresent_returnsFalse() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        boolean result = map.addIfNotPresent(annOneDiff);
        assertFalse(result);
        assertEquals(1, map.size());
        assertEquals("value1", map.get(TestAnnOne.class).value());
    }

    @Test
    public void testAdd_whenNewAnnotation_returnsFalse() {
        AnnotationMap map = new AnnotationMap();
        boolean result = map.add(annOne);
        assertFalse(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAdd_whenReplacingWithEqualAnnotation_returnsTrue() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        boolean result = map.add(annOneSame);
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAdd_whenReplacingWithDifferentAnnotation_returnsFalse() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        boolean result = map.add(annOneDiff);
        assertFalse(result);
        assertEquals(1, map.size());
        assertEquals("value2", map.get(TestAnnOne.class).value());
    }

    @Test
    public void testToString_whenAnnotationsNull_returnsNullString() {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToString_whenAnnotationsPopulated_returnsMapString() {
        AnnotationMap map = new AnnotationMap();
        map.add(annOne);
        String str = map.toString();
        assertNotNull(str);
        assertTrue(str.contains(TestAnnOne.class.getName()));
    }

    @Test
    public void testMerge_whenPrimaryIsNull_returnsSecondary() {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(annOne);
        AnnotationMap result = AnnotationMap.merge(null, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_whenPrimaryAnnotationsNull_returnsSecondary() {
        AnnotationMap primary = new AnnotationMap();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(annOne);
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_whenPrimaryAnnotationsEmpty_returnsSecondary() {
        AnnotationMap primary = new AnnotationMap();
        primary._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(annOne);
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_whenSecondaryIsNull_returnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(annOne);
        AnnotationMap result = AnnotationMap.merge(primary, null);
        assertSame(primary, result);
    }

    @Test
    public void testMerge_whenSecondaryAnnotationsNull_returnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(annOne);
        AnnotationMap secondary = new AnnotationMap();
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(primary, result);
    }

    @Test
    public void testMerge_whenSecondaryAnnotationsEmpty_returnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(annOne);
        AnnotationMap secondary = new AnnotationMap();
        secondary._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(primary, result);
    }

    @Test
    public void testMerge_whenBothNull_returnsNull() {
        AnnotationMap result = AnnotationMap.merge(null, null);
        assertNull(result);
    }

    @Test
    public void testMerge_whenBothPopulated_primaryOverridesSecondary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(annOne);
        primary.add(annTwo);

        AnnotationMap secondary = new AnnotationMap();
        secondary.add(annOneDiff);
        secondary.add(annThree);

        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertNotSame(primary, merged);
        assertNotSame(secondary, merged);
        assertEquals(3, merged.size());

        assertEquals("value1", merged.get(TestAnnOne.class).value());
        assertEquals(10, merged.get(TestAnnTwo.class).value());
        assertNotNull(merged.get(TestAnnThree.class));
    }
}
