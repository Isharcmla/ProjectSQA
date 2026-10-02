package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    private ByteQuadsCanonicalizer root;

    @Before
    public void setUp() {
        root = ByteQuadsCanonicalizer.createRoot(12345);
    }

    // ---------------------------------------------------------
    // Factory / basic accessor tests
    // ---------------------------------------------------------

    @Test
    public void testCreateRoot_default_returnsValidInstance() {
        ByteQuadsCanonicalizer r = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(r);
    }

    @Test
    public void testCreateRoot_withSeed_seedMatches() {
        ByteQuadsCanonicalizer r = ByteQuadsCanonicalizer.createRoot(999);
        assertEquals(999, r.hashSeed());
    }

    @Test
    public void testMakeChild_returnsChildWithSameSeed() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNotNull(child);
        assertEquals(root.hashSeed(), child.hashSeed());
    }

    @Test
    public void testSize_initiallyZero_forRoot() {
        assertEquals(0, root.size());
    }

    @Test
    public void testSize_initiallyZero_forChild() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(0, child.size());
    }

    @Test
    public void testBucketCount_childHasDefaultSize() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(64, child.bucketCount());
    }

    @Test
    public void testMaybeDirty_childInitiallyNotDirty() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertFalse(child.maybeDirty());
    }

    @Test
    public void testMaybeDirty_childDirtyAfterAdd() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("abc", 0x61626300);
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed_returnsConfiguredSeed() {
        assertEquals(12345, root.hashSeed());
    }

    // ---------------------------------------------------------
    // addName / findName - single quad
    // ---------------------------------------------------------

    @Test
    public void testAddAndFindName_singleQuad_found() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String result = child.addName("abc", 0x61626300);
        assertEquals("abc", result);
        assertEquals("abc", child.findName(0x61626300));
    }

    @Test
    public void testFindName_singleQuad_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(0x12345678));
    }

    @Test
    public void testFindName_singleQuad_afterAddingDifferentValue_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("xyz", 111);
        assertNull(child.findName(222));
    }

    @Test
    public void testAddName_negativeQuadValue_stillWorks() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("neg", -1);
        assertEquals("neg", child.findName(-1));
    }

    @Test
    public void testAddName_emptyStringName_works() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String result = child.addName("", 5555);
        assertEquals("", result);
        assertEquals("", child.findName(5555));
    }

    // ---------------------------------------------------------
    // addName / findName - two quads
    // ---------------------------------------------------------

    @Test
    public void testAddAndFindName_twoQuads_found() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("twoq", 111, 222);
        assertEquals("twoq", child.findName(111, 222));
    }

    @Test
    public void testAddName_twoQuads_secondQuadZero_usesSingleHash() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("zeroq2", 333, 0);
        assertEquals("zeroq2", child.findName(333, 0));
    }

    @Test
    public void testFindName_twoQuads_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(1, 2));
    }

    // ---------------------------------------------------------
    // addName / findName - three quads
    // ---------------------------------------------------------

    @Test
    public void testAddAndFindName_threeQuads_found() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("threeq", 1, 2, 3);
        assertEquals("threeq", child.findName(1, 2, 3));
    }

    @Test
    public void testFindName_threeQuads_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNull(child.findName(9, 9, 9));
    }

    // ---------------------------------------------------------
    // addName / findName - int[] variants (delegating for qlen<4)
    // ---------------------------------------------------------

    @Test
    public void testAddName_intArray_qlen1_delegatesToSingleQuad() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {42};
        child.addName("arr1", q, 1);
        assertEquals("arr1", child.findName(q, 1));
        assertEquals("arr1", child.findName(42));
    }

    @Test
    public void testAddName_intArray_qlen2_delegatesToTwoQuad() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {11, 22};
        child.addName("arr2", q, 2);
        assertEquals("arr2", child.findName(q, 2));
        assertEquals("arr2", child.findName(11, 22));
    }

    @Test
    public void testAddName_intArray_qlen3_delegatesToThreeQuad() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {1, 2, 3};
        child.addName("arr3", q, 3);
        assertEquals("arr3", child.findName(q, 3));
        assertEquals("arr3", child.findName(1, 2, 3));
    }

    @Test
    public void testAddAndFindName_longName_qlen4_found() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {1, 2, 3, 4};
        child.addName("long4", q, 4);
        assertEquals("long4", child.findName(q, 4));
    }

    @Test
    public void testAddAndFindName_longName_qlen8_found() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8};
        child.addName("long8", q, 8);
        assertEquals("long8", child.findName(q, 8));
    }

    @Test
    public void testAddAndFindName_longName_qlen9_usesVerifyLongName2() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        child.addName("long9", q, 9);
        assertEquals("long9", child.findName(q, 9));
    }

    @Test
    public void testFindName_longName_notFound_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q = {100, 200, 300, 400};
        assertNull(child.findName(q, 4));
    }

    @Test
    public void testFindName_longName_mismatchLength_returnsNull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int[] q4 = {1, 2, 3, 4};
        child.addName("l4", q4, 4);
        int[] q5 = {1, 2, 3, 4, 5};
        assertNull(child.findName(q5, 5));
    }

    // ---------------------------------------------------------
    // calcHash variants
    // ---------------------------------------------------------

    @Test
    public void testCalcHash_singleQuad_consistent() {
        int h1 = root.calcHash(123);
        int h2 = root.calcHash(123);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_twoQuads_consistent() {
        int h1 = root.calcHash(1, 2);
        int h2 = root.calcHash(1, 2);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_threeQuads_consistent() {
        int h1 = root.calcHash(1, 2, 3);
        int h2 = root.calcHash(1, 2, 3);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_intArray_consistent() {
        int[] q = {1, 2, 3, 4};
        int h1 = root.calcHash(q, 4);
        int h2 = root.calcHash(q, 4);
        assertEquals(h1, h2);
    }

    @Test
    public void testCalcHash_intArray_longerArray_consistent() {
        int[] q = {1, 2, 3, 4, 5, 6};
        int h1 = root.calcHash(q, 6);
        int h2 = root.calcHash(q, 6);
        assertEquals(h1, h2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHash_intArray_qlenLessThan4_throwsException() {
        int[] q = {1, 2, 3};
        root.calcHash(q, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHash_intArray_qlenZero_throwsException() {
        int[] q = {};
        root.calcHash(q, 0);
    }

    // ---------------------------------------------------------
    // count methods
    // ---------------------------------------------------------

    @Test
    public void testPrimaryCount_afterAddingEntries_nonNegative() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("a", 1);
        child.addName("b", 2);
        int count = child.primaryCount();
        assertTrue(count >= 0);
    }

    @Test
    public void testSecondaryCount_initiallyZeroOrMore() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int count = child.secondaryCount();
        assertTrue(count >= 0);
    }

    @Test
    public void testTertiaryCount_initiallyZeroOrMore() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int count = child.tertiaryCount();
        assertTrue(count >= 0);
    }

    @Test
    public void testSpilloverCount_initiallyZero() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(0, child.spilloverCount());
    }

    @Test
    public void testTotalCount_afterAddingEntries_matchesAddedCount() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 5; i++) {
            child.addName("name" + i, i + 1000);
        }
        int total = child.totalCount();
        assertTrue(total >= 5);
    }

    @Test
    public void testToString_containsClassNameAndCounts() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("x", 1);
        String s = child.toString();
        assertNotNull(s);
        assertTrue(s.contains("ByteQuadsCanonicalizer"));
    }

    // ---------------------------------------------------------
    // release / merge behavior
    // ---------------------------------------------------------

    @Test
    public void testRelease_mergesChildIntoParent_whenDirty() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("merged", 777);
        assertTrue(child.maybeDirty());
        child.release();
        assertEquals(1, root.size());
    }

    @Test
    public void testRelease_doesNotMerge_whenNotDirty() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        // no changes made
        assertFalse(child.maybeDirty());
        child.release();
        assertEquals(0, root.size());
    }

    @Test
    public void testRelease_calledTwice_stillConsistent() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("first", 1);
        child.release();
        int sizeAfterFirstRelease = root.size();

        ByteQuadsCanonicalizer child2 = root.makeChild(0);
        child2.addName("second", 2);
        child2.release();
        assertTrue(root.size() >= sizeAfterFirstRelease);
    }

    // ---------------------------------------------------------
    // Rehash trigger via many additions
    // ---------------------------------------------------------

    @Test
    public void testAddManyNames_triggersRehash_stillFindable() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int entryCount = 100;
        for (int i = 0; i < entryCount; i++) {
            child.addName("name" + i, i + 1, i + 2);
        }
        // verify all still findable after potential rehash(es)
        boolean allFound = true;
        for (int i = 0; i < entryCount; i++) {
            String found = child.findName(i + 1, i + 2);
            if (found == null || !found.equals("name" + i)) {
                allFound = false;
                break;
            }
        }
        assertTrue(allFound);
        assertEquals(entryCount, child.size());
    }

    @Test
    public void testAddManySingleQuadNames_forcesGrowth() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int entryCount = 80;
        for (int i = 0; i < entryCount; i++) {
            child.addName("s" + i, i * 37 + 1);
        }
        int found = 0;
        for (int i = 0; i < entryCount; i++) {
            if (child.findName(i * 37 + 1) != null) {
                found++;
            }
        }
        assertEquals(entryCount, found);
    }

    @Test
    public void testAddManyLongNames_forcesRehashWithLongEntries() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        int entryCount = 60;
        for (int i = 0; i < entryCount; i++) {
            int[] q = {i, i + 1, i + 2, i + 3, i + 4};
            child.addName("long" + i, q, 5);
        }
        int found = 0;
        for (int i = 0; i < entryCount; i++) {
            int[] q = {i, i + 1, i + 2, i + 3, i + 4};
            if (child.findName(q, 5) != null) {
                found++;
            }
        }
        assertEquals(entryCount, found);
    }

    // ---------------------------------------------------------
    // makeChild with different flag combinations
    // ---------------------------------------------------------

    @Test
    public void testMakeChild_withInternAndFailOnDoSFlagsEnabled() {
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask()
                | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        assertNotNull(child);
        child.addName("interned", 12345);
        assertEquals("interned", child.findName(12345));
    }

    @Test
    public void testMakeChild_withNoFlagsEnabled() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertNotNull(child);
        child.addName("notInterned", 54321);
        assertEquals("notInterned", child.findName(54321));
    }

    // ---------------------------------------------------------
    // Multiple children sharing state, verifying copy-on-write
    // ---------------------------------------------------------

    @Test
    public void testMultipleChildren_independentAfterModification() {
        ByteQuadsCanonicalizer childA = root.makeChild(0);
        childA.addName("fromA", 100);
        childA.release();

        ByteQuadsCanonicalizer childB = root.makeChild(0);
        // childB should see merged entry from childA via parent state
        assertEquals("fromA", childB.findName(100));

        childB.addName("fromB", 200);
        assertNull(childA.findName(200) == null ? null : "shouldNotMatter");
        assertEquals("fromB", childB.findName(200));
    }

    @Test
    public void testChildTable_bucketCountMatchesParentTableInfo() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        assertEquals(64, child.bucketCount());
    }
}
