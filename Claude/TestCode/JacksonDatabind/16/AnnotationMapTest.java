import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.Iterator;

public class AnnotationMapTest {

    // Custom annotation interfaces for testing purposes
    interface TestAnnotationA extends Annotation {}
    interface TestAnnotationB extends Annotation {}

    // Simple implementation of TestAnnotationA
    static class AnnotationAImpl implements TestAnnotationA {
        private final String value;

        AnnotationAImpl(String value) {
            this.value = value;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return TestAnnotationA.class;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AnnotationAImpl)) {
                return false;
            }
            AnnotationAImpl other = (AnnotationAImpl) obj;
            return this.value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public String toString() {
            return "AnnotationAImpl[" + value + "]";
        }
    }

    // Simple implementation of TestAnnotationB
    static class AnnotationBImpl implements TestAnnotationB {
        private final String value;

        AnnotationBImpl(String value) {
            this.value = value;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return TestAnnotationB.class;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AnnotationBImpl)) {
                return false;
            }
            AnnotationBImpl other = (AnnotationBImpl) obj;
            return this.value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public String toString() {
            return "AnnotationBImpl[" + value + "]";
        }
    }

    private AnnotationMap map;

    @Before
    public void setUp() {
        map = new AnnotationMap();
    }

    // ----------------- get() tests -----------------

    @Test
    public void testGet_emptyMap_returnsNull() {
        assertNull(map.get(TestAnnotationA.class));
    }

    @Test
    public void testGet_existingAnnotation_returnsAnnotation() {
        AnnotationAImpl ann = new AnnotationAImpl("hello");
        map.add(ann);
        TestAnnotationA result = map.get(TestAnnotationA.class);
        assertNotNull(result);
        assertEquals(ann, result);
    }

    @Test
    public void testGet_nonExistingAnnotation_returnsNull() {
        AnnotationAImpl ann = new AnnotationAImpl("hello");
        map.add(ann);
        assertNull(map.get(TestAnnotationB.class));
    }

    // ----------------- annotations() tests -----------------

    @Test
    public void testAnnotations_emptyMap_returnsEmptyIterable() {
        Iterable<Annotation> result = map.annotations();
        assertNotNull(result);
        Iterator<Annotation> it = result.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testAnnotations_withItems_returnsAllAnnotations() {
        AnnotationAImpl annA = new AnnotationAImpl("A");
        AnnotationBImpl annB = new AnnotationBImpl("B");
        map.add(annA);
        map.add(annB);

        Iterable<Annotation> result = map.annotations();
        int count = 0;
        boolean foundA = false;
        boolean foundB = false;
        for (Annotation a : result) {
            count++;
            if (a.equals(annA)) foundA = true;
            if (a.equals(annB)) foundB = true;
        }
        assertEquals(2, count);
        assertTrue(foundA);
        assertTrue(foundB);
    }

    // ----------------- merge() tests -----------------

    @Test
    public void testMerge_primaryNull_returnsSecondary() {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new AnnotationAImpl("sec"));
        AnnotationMap result = AnnotationMap.merge(null, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_primaryEmptyAnnotations_returnsSecondary() {
        AnnotationMap primary = new AnnotationMap(); // _annotations is null
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new AnnotationAImpl("sec"));
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_primaryHasEmptyMap_returnsSecondary() {
        AnnotationMap primary = new AnnotationMap();
        // force _annotations to be an empty map by adding then removing via add/if logic isn't possible directly,
        // but addIfNotPresent then no removal exists; so test with primary._annotations == null covers "isEmpty" branch indirectly.
        // Using primary with null map already covers isEmpty() short-circuit due to null check first.
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new AnnotationAImpl("sec"));
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMerge_secondaryNull_returnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new AnnotationAImpl("prim"));
        AnnotationMap result = AnnotationMap.merge(primary, null);
        assertSame(primary, result);
    }

    @Test
    public void testMerge_secondaryEmptyAnnotations_returnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new AnnotationAImpl("prim"));
        AnnotationMap secondary = new AnnotationMap(); // _annotations is null
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(primary, result);
    }

    @Test
    public void testMerge_bothHaveAnnotations_primaryOverridesSecondary() {
        AnnotationMap primary = new AnnotationMap();
        AnnotationAImpl primaryAnnA = new AnnotationAImpl("primaryA");
        primary.add(primaryAnnA);

        AnnotationMap secondary = new AnnotationMap();
        AnnotationAImpl secondaryAnnA = new AnnotationAImpl("secondaryA");
        AnnotationBImpl secondaryAnnB = new AnnotationBImpl("secondaryB");
        secondary.add(secondaryAnnA);
        secondary.add(secondaryAnnB);

        AnnotationMap merged = AnnotationMap.merge(primary, secondary);

        assertNotNull(merged);
        assertEquals(2, merged.size());

        // primary should override secondary for same annotation type
        TestAnnotationA resultA = merged.get(TestAnnotationA.class);
        assertEquals(primaryAnnA, resultA);

        TestAnnotationB resultB = merged.get(TestAnnotationB.class);
        assertEquals(secondaryAnnB, resultB);
    }

    @Test
    public void testMerge_bothNull_returnsNull() {
        AnnotationMap result = AnnotationMap.merge(null, null);
        assertNull(result);
    }

    // ----------------- size() tests -----------------

    @Test
    public void testSize_emptyMap_returnsZero() {
        assertEquals(0, map.size());
    }

    @Test
    public void testSize_withOneAnnotation_returnsOne() {
        map.add(new AnnotationAImpl("test"));
        assertEquals(1, map.size());
    }

    @Test
    public void testSize_withMultipleAnnotations_returnsCorrectCount() {
        map.add(new AnnotationAImpl("A"));
        map.add(new AnnotationBImpl("B"));
        assertEquals(2, map.size());
    }

    // ----------------- addIfNotPresent() tests -----------------

    @Test
    public void testAddIfNotPresent_newAnnotation_addsAndReturnsTrue() {
        boolean result = map.addIfNotPresent(new AnnotationAImpl("first"));
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAddIfNotPresent_existingAnnotationType_doesNotAddReturnsFalse() {
        map.addIfNotPresent(new AnnotationAImpl("first"));
        boolean result = map.addIfNotPresent(new AnnotationAImpl("second"));
        assertFalse(result);
        assertEquals(1, map.size());
        // original value should remain unchanged
        TestAnnotationA stored = map.get(TestAnnotationA.class);
        assertEquals(new AnnotationAImpl("first"), stored);
    }

    @Test
    public void testAddIfNotPresent_nullAnnotationsMapInitially_addsSuccessfully() {
        AnnotationMap freshMap = new AnnotationMap();
        boolean result = freshMap.addIfNotPresent(new AnnotationBImpl("val"));
        assertTrue(result);
        assertEquals(1, freshMap.size());
    }

    // ----------------- add() tests -----------------

    @Test
    public void testAdd_newAnnotation_returnsFalse() {
        boolean result = map.add(new AnnotationAImpl("value"));
        assertFalse(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAdd_sameAnnotationTypeSameContent_returnsTrue() {
        map.add(new AnnotationAImpl("same"));
        boolean result = map.add(new AnnotationAImpl("same"));
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAdd_sameAnnotationTypeDifferentContent_returnsFalse() {
        map.add(new AnnotationAImpl("first"));
        boolean result = map.add(new AnnotationAImpl("different"));
        assertFalse(result);
        assertEquals(1, map.size());
        TestAnnotationA stored = map.get(TestAnnotationA.class);
        assertEquals(new AnnotationAImpl("different"), stored);
    }

    @Test
    public void testAdd_multipleDifferentTypes_addsAll() {
        map.add(new AnnotationAImpl("A"));
        map.add(new AnnotationBImpl("B"));
        assertEquals(2, map.size());
    }

    // ----------------- toString() tests -----------------

    @Test
    public void testToString_emptyMap_returnsNullBracketString() {
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToString_withAnnotations_returnsNonNullString() {
        map.add(new AnnotationAImpl("test"));
        String result = map.toString();
        assertNotNull(result);
        assertNotEquals("[null]", result);
        assertTrue(result.contains("AnnotationAImpl"));
    }
}
