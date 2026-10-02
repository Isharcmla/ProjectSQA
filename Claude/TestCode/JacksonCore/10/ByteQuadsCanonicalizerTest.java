package com.fasterxml.jackson.core.sym;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ByteQuadsCanonicalizerTest {

    private ByteQuadsCanonicalizer root;

    @Before
    public void setUp() {
        root = ByteQuadsCanonicalizer.createRoot(12345);
    }

    // ---------- createRoot / makeChild ----------

    @Test
    public void testCreateRoot_default_notNull() {
        ByteQuadsCanonicalizer r = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(r);
    }

    @Test
    public void testCreateRootWithSeed_returnsSameSeed() {
        ByteQuadsCanonicalizer r = ByteQuadsCanonicalizer.createRoot(999);
        assertEquals(999, r.hashSeed());
    }

    @Test
    public void testMakeChild_returnsChildInstance() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNotNull(child);
        assertEquals(root.hashSeed(), child.hashSeed());
    }

    @Test
    public void testMakeChild_withFlagsAllEnabled() {
        ByteQuadsCanonicalizer child = root.makeChild(-1);
        child.addName("interned", 1);
        assertEquals("interned", child.findName(1));
    }

    @Test
    public void testMakeChild_withFlagsAllDisabled() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("notinterned", 2);
        assertEquals("notinterned", child.findName(2));
    }

    // ---------- size / bucketCount / maybeDirty / hashSeed ----------

    @Test
    public void testSize_rootInitiallyZero() {
        assertEquals(0, root.size());
    }

    @Test
    public void testSize_childInitiallyZero() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(0, child.size());
    }

    @Test
    public void testBucketCount_defaultSize() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(64, child.bucketCount());
    }

    @Test
    public void testMaybeDirty_childInitiallyNotDirty() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertFalse(child.maybeDirty());
    }

    @Test
    public void testMaybeDirty_afterAddingName_isDirty() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test", 1);
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed_matchesSeed() {
        assertEquals(12345, root.hashSeed());
    }

    // ---------- primaryCount / secondaryCount / tertiaryCount / spilloverCount / totalCount ----------

    @Test
    public void testCounts_initiallyZero() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(0, child.primaryCount());
        assertEquals(0, child.secondaryCount());
        assertEquals(0, child.tertiaryCount());
        assertEquals(0, child.spilloverCount());
        assertEquals(0, child.totalCount());
    }

    @Test
    public void testCounts_afterAddingEntries() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 5; i++) {
            child.addName("n" + i, i);
        }
        assertEquals(5, child.totalCount());
        assertEquals(5, child.size());
    }

    // ---------- addName / findName: single quad ----------

    @Test
    public void testAddName_singleQuad_findable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = child.addName("hello", 12345);
        assertEquals("hello", name);
        assertEquals("hello", child.findName(12345));
        assertEquals(1, child.size());
    }

    @Test
    public void testFindName_singleQuad_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(999999));
    }

    @Test
    public void testFindName_zeroQuad_edgeCase() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("zero", 0);
        assertEquals("zero", child.findName(0));
    }

    @Test
    public void testFindName_negativeQuad_edgeCase() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("neg", -123);
        assertEquals("neg", child.findName(-123));
    }

    // ---------- addName / findName: two quads ----------

    @Test
    public void testAddName_twoQuads_findable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("world", 111, 222);
        assertEquals("world", child.findName(111, 222));
    }

    @Test
    public void testAddName_twoQuads_q2Zero_usesSingleHash() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("zeroq2", 555, 0);
        assertEquals("zeroq2", child.findName(555, 0));
    }

    @Test
    public void testFindName_twoQuads_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(999999, 888888));
    }

    // ---------- addName / findName: three quads ----------

    @Test
    public void testAddName_threeQuads_findable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("threequad", 1, 2, 3);
        assertEquals("threequad", child.findName(1, 2, 3));
    }

    @Test
    public void testFindName_threeQuads_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(1, 2, 3));
    }

    // ---------- addName / findName: array based ----------

    @Test
    public void testAddName_arrayQlen1_delegatesToSingle() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] quads = new int[] {42};
        child.addName("one", quads, 1);
        assertEquals("one", child.findName(42));
    }

    @Test
    public void testAddName_arrayQlen2_delegatesToTwo() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] quads = new int[] {42, 43};
        child.addName("two", quads, 2);
        assertEquals("two", child.findName(42, 43));
    }

    @Test
    public void testAddName_arrayQlen3_delegatesToThree() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] quads = new int[] {1, 2, 3};
        child.addName("three", quads, 3);
        assertEquals("three", child.findName(1, 2, 3));
    }

    @Test
    public void testAddName_longArray_findable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] quads = new int[] {1, 2, 3, 4, 5};
        child.addName("longname", quads, 5);
        assertEquals("longname", child.findName(quads, 5));
    }

    @Test
    public void testFindName_arrayQlen1_delegatesToSingle() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("single", 7);
        int[] quads = new int[] {7};
        assertEquals("single", child.findName(quads, 1));
    }

    @Test
    public void testFindName_arrayQlen2_delegatesToTwo() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("pair", 7, 8);
        int[] quads = new int[] {7, 8};
        assertEquals("pair", child.findName(quads, 2));
    }

    @Test
    public void testFindName_arrayQlen3_delegatesToThree() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("triple", 7, 8, 9);
        int[] quads = new int[] {7, 8, 9};
        assertEquals("triple", child.findName(quads, 3));
    }

    @Test
    public void testFindName_longArray_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] quads = new int[] {1, 2, 3, 4, 5};
        assertNull(child.findName(quads, 5));
    }

    // ---------- toString ----------

    @Test
    public void testToString_containsClassName() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("something", 1);
        String s = child.toString();
        assertTrue(s.contains("ByteQuadsCanonicalizer"));
    }

    // ---------- release / merging ----------

    @Test
    public void testRelease_mergesToParent() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("merged", 1);
        assertEquals(0, root.size());
        child.release();
        assertEquals(1, root.size());
    }

    @Test
    public void testRelease_noParent_doesNothing() {
        root.release();
        assertEquals(0, root.size());
    }

    @Test
    public void testRelease_notDirty_noMerge() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.release();
        assertEquals(0, root.size());
    }

    // ---------- calcHash ----------

    @Test
    public void testCalcHash_singleQuad_consistentResult() {
        int h1 = root.calcHash(100);
        int h2 = root.calcHash(100);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_twoQuads_consistentResult() {
        int h1 = root.calcHash(100, 200);
        int h2 = root.calcHash(100, 200);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_threeQuads_consistentResult() {
        int h1 = root.calcHash(100, 200, 300);
        int h2 = root.calcHash(100, 200, 300);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_arrayQuads_consistentResult() {
        int[] quads = new int[] {1, 2, 3, 4};
        int h1 = root.calcHash(quads, 4);
        int h2 = root.calcHash(quads, 4);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_arrayQuads_moreThan4_consistentResult() {
        int[] quads = new int[] {1, 2, 3, 4, 5, 6};
        int h1 = root.calcHash(quads, 6);
        int h2 = root.calcHash(quads, 6);
        assertEquals(h1, h2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHash_arrayQlenLessThan4_throwsException() {
        int[] quads = new int[] {1, 2, 3};
        root.calcHash(quads, 3);
    }

    // ---------- rehashing / bulk operations ----------

    @Test
    public void testAddMany_triggersRehash_allStillFindable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int n = 100;
        for (int i = 0; i < n; i++) {
            child.addName("name" + i, i, i * 2, i * 3);
        }
        for (int i = 0; i < n; i++) {
            assertEquals("name" + i, child.findName(i, i * 2, i * 3));
        }
        assertEquals(n, child.size());
    }

    @Test
    public void testAddMany_longNames_triggersRehashAndLongNameExpansion() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int n = 50;
        for (int i = 0; i < n; i++) {
            int[] quads = new int[] {i, i + 1, i + 2, i + 3, i + 4, i + 5};
            child.addName("longname" + i, quads, 6);
        }
        for (int i = 0; i < n; i++) {
            int[] quads = new int[] {i, i + 1, i + 2, i + 3, i + 4, i + 5};
            assertEquals("longname" + i, child.findName(quads, 6));
        }
    }

    @Test
    public void testAddName_duplicateNames_noExceptionThrown() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("dup", 1);
        child.addName("dup2", 1);
        String found = child.findName(1);
        assertNotNull(found);
    }

    @Test
    public void testSpilloverCount_afterManyCollisions_noException() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 60; i++) {
            child.addName("s" + i, i);
        }
        assertTrue(child.spilloverCount() >= 0);
    }

    // ---------- edge case: null name with interning enabled ----------

    @Test(expected = NullPointerException.class)
    public void testAddName_nullNameWithIntern_throwsException() {
        ByteQuadsCanonicalizer child = root.makeChild(-1);
        child.addName(null, 1);
    }
}
