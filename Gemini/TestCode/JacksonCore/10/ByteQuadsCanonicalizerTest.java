package com.fasterxml.jackson.core.sym;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    @Test
    public void testCreateRoot_defaultSeed_successfulInitialization() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        Assert.assertNotNull(root);
        Assert.assertEquals(0, root.size());
        Assert.assertEquals(64, root.bucketCount());
        Assert.assertFalse(root.maybeDirty());
        Assert.assertNotEquals(0, root.hashSeed());
    }

    @Test
    public void testCreateRoot_fixedSeed_seedPreserved() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(12345);
        Assert.assertEquals(12345, root.hashSeed());
        Assert.assertEquals(0, root.size());
        Assert.assertEquals(64, root.bucketCount());
    }

    @Test
    public void testMakeChild_featuresEnabled_childConfigured() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask()
                | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        Assert.assertNotNull(child);
        Assert.assertEquals(0, child.size());
        Assert.assertEquals(42, child.hashSeed());
        Assert.assertFalse(child.maybeDirty());
    }

    @Test
    public void testMakeChild_featuresDisabled_childConfigured() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(42);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        Assert.assertNotNull(child);
        Assert.assertEquals(0, child.size());
        Assert.assertFalse(child.maybeDirty());
    }

    @Test
    public void testAddAndFindName_singleQuad_success() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        Assert.assertNull(child.findName(100));

        String added = child.addName("a", 100);
        Assert.assertEquals("a", added);
        Assert.assertEquals("a", child.findName(100));
        Assert.assertNull(child.findName(101));
        Assert.assertEquals(1, child.size());
        Assert.assertTrue(child.maybeDirty());
    }

    @Test
    public void testAddAndFindName_twoQuads_success() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        Assert.assertNull(child.findName(10, 20));

        String added = child.addName("ab", 10, 20);
        Assert.assertEquals("ab", added);
        Assert.assertEquals("ab", child.findName(10, 20));
        Assert.assertNull(child.findName(10, 21));
        Assert.assertNull(child.findName(11, 20));

        // Test with q2 == 0
        String addedZero = child.addName("a0", 30, 0);
        Assert.assertEquals("a0", addedZero);
        Assert.assertEquals("a0", child.findName(30, 0));
    }

    @Test
    public void testAddAndFindName_threeQuads_success() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        Assert.assertNull(child.findName(1, 2, 3));

        String added = child.addName("abc", 1, 2, 3);
        Assert.assertEquals("abc", added);
        Assert.assertEquals("abc", child.findName(1, 2, 3));
        Assert.assertNull(child.findName(1, 2, 4));
        Assert.assertNull(child.findName(1, 5, 3));
        Assert.assertNull(child.findName(6, 2, 3));
    }

    @Test
    public void testAddAndFindName_arrayDelegations_lengths1To3() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        int[] q1 = new int[]{10};
        child.addName("q1", q1, 1);
        Assert.assertEquals("q1", child.findName(q1, 1));
        Assert.assertEquals("q1", child.findName(10));

        int[] q2 = new int[]{10, 20};
        child.addName("q2", q2, 2);
        Assert.assertEquals("q2", child.findName(q2, 2));
        Assert.assertEquals("q2", child.findName(10, 20));

        int[] q3 = new int[]{10, 20, 30};
        child.addName("q3", q3, 3);
        Assert.assertEquals("q3", child.findName(q3, 3));
        Assert.assertEquals("q3", child.findName(10, 20, 30));
    }

    @Test
    public void testAddAndFindName_arrayLengths4To8_successAndMismatch() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        for (int len = 4; len <= 8; len++) {
            int[] q = new int[len];
            for (int i = 0; i < len; i++) {
                q[i] = i + 100 * len;
            }
            String name = "len" + len;
            child.addName(name, q, len);
            Assert.assertEquals(name, child.findName(q, len));

            int[] mismatch = q.clone();
            mismatch[len - 1] = 999999;
            Assert.assertNull(child.findName(mismatch, len));
        }
    }

    @Test
    public void testAddAndFindName_arrayLengthGreaterThan8_successAndMismatch() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int[] q = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        child.addName("longName", q, q.length);
        Assert.assertEquals("longName", child.findName(q, q.length));

        int[] mismatch = q.clone();
        mismatch[10] = 999;
        Assert.assertNull(child.findName(mismatch, mismatch.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHash_arrayLengthLessThan4_throwsException() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        root.calcHash(new int[]{1, 2, 3}, 3);
    }

    @Test
    public void testCalcTertiaryShift_allThresholds() {
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(512));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(2048));
        Assert.assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(8192));
    }

    @Test
    public void testRehash_variousQuadLengthsPreserved() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Add 1-quad
        child.addName("s1", 1);
        // Add 2-quad
        child.addName("s2", 1, 2);
        // Add 3-quad
        child.addName("s3", 1, 2, 3);
        // Add 4-quad
        child.addName("s4", new int[]{1, 2, 3, 4}, 4);
        // Add >8 quad
        child.addName("s10", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10);

        // Add enough distinct symbols to trigger rehash
        for (int i = 0; i < 60; i++) {
            child.addName("fill" + i, i + 5000);
        }

        Assert.assertTrue(child.bucketCount() > 64);
        Assert.assertEquals("s1", child.findName(1));
        Assert.assertEquals("s2", child.findName(1, 2));
        Assert.assertEquals("s3", child.findName(1, 2, 3));
        Assert.assertEquals("s4", child.findName(new int[]{1, 2, 3, 4}, 4));
        Assert.assertEquals("s10", child.findName(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
    }

    @Test
    public void testRelease_dirtyChild_mergesIntoRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        child.addName("item1", 123);
        child.addName("item2", 456);
        Assert.assertEquals(2, child.size());
        Assert.assertEquals(0, root.size());

        child.release();
        Assert.assertEquals(2, root.size());
        Assert.assertFalse(child.maybeDirty());

        // A second release should not corrupt or double merge
        child.release();
        Assert.assertEquals(2, root.size());
    }

    @Test
    public void testRelease_cleanChild_doesNotModifyRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testRelease_childExceedsMaxEntriesForReuse_cleansRoot() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        for (int i = 0; i < 6005; i++) {
            child.addName("sym" + i, i);
        }
        Assert.assertEquals(6005, child.size());

        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testRootRelease_isNoOp() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        root.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testCollisions_secondaryTertiaryAndSpilloverLookup() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Add multiple symbols that might occupy primary, secondary, tertiary, and spillover areas
        for (int i = 0; i < 40; i++) {
            child.addName("name1_" + i, i * 64 + 1);
            child.addName("name2_" + i, i * 64 + 1, i + 2);
            child.addName("name3_" + i, i * 64 + 1, i + 2, i + 3);
            child.addName("name4_" + i, new int[]{i * 64 + 1, i + 2, i + 3, i + 4}, 4);
        }

        for (int i = 0; i < 40; i++) {
            Assert.assertEquals("name1_" + i, child.findName(i * 64 + 1));
            Assert.assertEquals("name2_" + i, child.findName(i * 64 + 1, i + 2));
            Assert.assertEquals("name3_" + i, child.findName(i * 64 + 1, i + 2, i + 3));
            Assert.assertEquals("name4_" + i, child.findName(new int[]{i * 64 + 1, i + 2, i + 3, i + 4}, 4));
        }

        Assert.assertNull(child.findName(999999));
        Assert.assertNull(child.findName(999999, 888888));
        Assert.assertNull(child.findName(999999, 888888, 777777));
        Assert.assertNull(child.findName(new int[]{999999, 888888, 777777, 666666}, 4));
    }

    @Test
    public void testCountsAndToString() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        child.addName("a", 1);
        child.addName("b", 2, 3);
        child.addName("c", 4, 5, 6);
        child.addName("d", new int[]{7, 8, 9, 10}, 4);

        Assert.assertTrue(child.primaryCount() >= 0);
        Assert.assertTrue(child.secondaryCount() >= 0);
        Assert.assertTrue(child.tertiaryCount() >= 0);
        Assert.assertTrue(child.spilloverCount() >= 0);
        Assert.assertEquals(4, child.totalCount());

        String str = child.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("size=4"));
        Assert.assertTrue(str.contains("total:4"));
    }

    @Test
    public void testHashCalculations_deterministic() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(100);

        int h1 = root.calcHash(5);
        Assert.assertEquals(h1, root.calcHash(5));

        int h2 = root.calcHash(5, 10);
        Assert.assertEquals(h2, root.calcHash(5, 10));

        int h3 = root.calcHash(5, 10, 15);
        Assert.assertEquals(h3, root.calcHash(5, 10, 15));

        int[] q = new int[]{5, 10, 15, 20, 25};
        int h4 = root.calcHash(q, q.length);
        Assert.assertEquals(h4, root.calcHash(q, q.length));
    }

    @Test
    public void testReportTooManyCollisions_behavior() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask());
        
        // When size <= 1024, reporting is suppressed
        child._reportTooManyCollisions();
    }
}
