package com.fasterxml.jackson.core.sym;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    @Test
    public void testCreateRoot_defaultSeed_returnsInitializedCanonicalizer() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        Assert.assertNotNull(root);
        Assert.assertEquals(0, root.size());
        Assert.assertEquals(64, root.bucketCount());
        Assert.assertTrue((root.hashSeed() & 1) != 0);
        Assert.assertFalse(root.maybeDirty());
    }

    @Test
    public void testCreateRoot_customSeed_usesGivenSeed() {
        int seed = 12345;
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(seed);
        Assert.assertNotNull(root);
        Assert.assertEquals(seed, root.hashSeed());
        Assert.assertEquals(0, root.size());
        Assert.assertEquals(64, root.bucketCount());
    }

    @Test
    public void testMakeChild_withFlags_initializesCorrectly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123);
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask()
                | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();

        ByteQuadsCanonicalizer child = root.makeChild(flags);
        Assert.assertNotNull(child);
        Assert.assertEquals(0, child.size());
        Assert.assertEquals(64, child.bucketCount());
        Assert.assertEquals(123, child.hashSeed());
        Assert.assertFalse(child.maybeDirty());

        ByteQuadsCanonicalizer childNoIntern = root.makeChild(0);
        Assert.assertNotNull(childNoIntern);
        Assert.assertFalse(childNoIntern._intern);
        Assert.assertFalse(childNoIntern._failOnDoS);
    }

    @Test
    public void testAddAndFindName_singleQuad_successAndMiss() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        String name1 = child.addName("field1", 0x12345678);
        Assert.assertEquals("field1", name1);
        Assert.assertEquals(1, child.size());
        Assert.assertTrue(child.maybeDirty());

        String found = child.findName(0x12345678);
        Assert.assertEquals("field1", found);

        Assert.assertNull(child.findName(0x99999999));
    }

    @Test
    public void testAddAndFindName_twoQuads_successAndMiss() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(2);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        String name1 = child.addName("twoQuads", 0x11111111, 0x22222222);
        Assert.assertEquals("twoQuads", name1);

        String found = child.findName(0x11111111, 0x22222222);
        Assert.assertEquals("twoQuads", found);

        Assert.assertNull(child.findName(0x11111111, 0x33333333));
        Assert.assertNull(child.findName(0x33333333, 0x22222222));
    }

    @Test
    public void testAddAndFindName_twoQuads_secondQuadZero() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(3);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        String name = child.addName("zeroSecond", 0x1234, 0);
        Assert.assertEquals("zeroSecond", name);

        String found = child.findName(0x1234, 0);
        Assert.assertEquals("zeroSecond", found);
    }

    @Test
    public void testAddAndFindName_threeQuads_successAndMiss() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(4);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        String name = child.addName("threeQuads", 0x11, 0x22, 0x33);
        Assert.assertEquals("threeQuads", name);

        String found = child.findName(0x11, 0x22, 0x33);
        Assert.assertEquals("threeQuads", found);

        Assert.assertNull(child.findName(0x11, 0x22, 0x44));
        Assert.assertNull(child.findName(0x11, 0x44, 0x33));
        Assert.assertNull(child.findName(0x44, 0x22, 0x33));
    }

    @Test
    public void testAddAndFindName_arrayQuads_lengths1To3_delegatesProperly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(5);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        child.addName("len1", new int[]{100}, 1);
        child.addName("len2", new int[]{100, 200}, 2);
        child.addName("len3", new int[]{100, 200, 300}, 3);

        Assert.assertEquals("len1", child.findName(new int[]{100}, 1));
        Assert.assertEquals("len2", child.findName(new int[]{100, 200}, 2));
        Assert.assertEquals("len3", child.findName(new int[]{100, 200, 300}, 3));

        Assert.assertEquals("len1", child.findName(100));
        Assert.assertEquals("len2", child.findName(100, 200));
        Assert.assertEquals("len3", child.findName(100, 200, 300));
    }

    @Test
    public void testAddAndFindName_longQuads_lengths4To10() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(6);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        for (int len = 4; len <= 10; ++len) {
            int[] quads = new int[len];
            for (int i = 0; i < len; ++i) {
                quads[i] = (len << 16) | (i + 1);
            }
            String name = "longQuad_" + len;
            child.addName(name, quads, len);

            String found = child.findName(quads, len);
            Assert.assertEquals(name, found);

            int[] mismatch = quads.clone();
            mismatch[len - 1] = 0xBADF00D;
            Assert.assertNull(child.findName(mismatch, len));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHash_arrayUnder4Quads_throwsException() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(7);
        root.calcHash(new int[]{1, 2, 3}, 3);
    }

    @Test
    public void testCalcHash_allOverloads_coverage() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(8);
        int h1 = root.calcHash(10);
        int h2 = root.calcHash(10, 20);
        int h3 = root.calcHash(10, 20, 30);
        int h4 = root.calcHash(new int[]{10, 20, 30, 40}, 4);
        int h5 = root.calcHash(new int[]{10, 20, 30, 40, 50, 60}, 6);

        Assert.assertNotEquals(0, h1);
        Assert.assertNotEquals(0, h2);
        Assert.assertNotEquals(0, h3);
        Assert.assertNotEquals(0, h4);
        Assert.assertNotEquals(0, h5);
    }

    @Test
    public void testCollisionResolution_secondaryTertiarySpilloverLookup() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(9);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        for (int i = 1; i <= 30; ++i) {
            child.addName("q1_" + i, i);
            child.addName("q2_" + i, i, i * 2);
            child.addName("q3_" + i, i, i * 2, i * 3);
            child.addName("q4_" + i, new int[]{i, i + 1, i + 2, i + 3}, 4);
        }

        for (int i = 1; i <= 30; ++i) {
            Assert.assertEquals("q1_" + i, child.findName(i));
            Assert.assertEquals("q2_" + i, child.findName(i, i * 2));
            Assert.assertEquals("q3_" + i, child.findName(i, i * 2, i * 3));
            Assert.assertEquals("q4_" + i, child.findName(new int[]{i, i + 1, i + 2, i + 3}, 4));
        }

        Assert.assertNull(child.findName(99999));
        Assert.assertNull(child.findName(99999, 99998));
        Assert.assertNull(child.findName(99999, 99998, 99997));
        Assert.assertNull(child.findName(new int[]{99999, 99998, 99997, 99996}, 4));
    }

    @Test
    public void testRehash_triggersAndPreservesAllEntries() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(10);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        int initialBucketCount = child.bucketCount();
        for (int i = 1; i <= 200; ++i) {
            child.addName("k1_" + i, i);
            child.addName("k2_" + i, i, i + 1);
            child.addName("k3_" + i, i, i + 1, i + 2);
            child.addName("k4_" + i, new int[]{i, i + 1, i + 2, i + 3, i + 4}, 5);
        }

        Assert.assertTrue(child.bucketCount() > initialBucketCount);
        Assert.assertEquals(800, child.size());

        for (int i = 1; i <= 200; ++i) {
            Assert.assertEquals("k1_" + i, child.findName(i));
            Assert.assertEquals("k2_" + i, child.findName(i, i + 1));
            Assert.assertEquals("k3_" + i, child.findName(i, i + 1, i + 2));
            Assert.assertEquals("k4_" + i, child.findName(new int[]{i, i + 1, i + 2, i + 3, i + 4}, 5));
        }
    }

    @Test
    public void testRelease_mergesIntoParent() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(11);
        Assert.assertEquals(0, root.size());

        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        child.addName("item1", 100);
        child.addName("item2", 200);
        Assert.assertTrue(child.maybeDirty());

        child.release();
        Assert.assertFalse(child.maybeDirty());
        Assert.assertEquals(2, root.size());

        ByteQuadsCanonicalizer child2 = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        Assert.assertEquals(2, child2.size());
        Assert.assertEquals("item1", child2.findName(100));
        Assert.assertEquals("item2", child2.findName(200));

        child2.release();
        Assert.assertEquals(2, root.size());
    }

    @Test
    public void testMergeChild_exceedsMaxEntriesForReuse_resetsTable() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(12);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        for (int i = 0; i < ByteQuadsCanonicalizer.MAX_ENTRIES_FOR_REUSE + 10; ++i) {
            child.addName("overflow_" + i, i);
        }
        Assert.assertTrue(child.size() > ByteQuadsCanonicalizer.MAX_ENTRIES_FOR_REUSE);

        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testCountsAndToString() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(13);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        for (int i = 1; i <= 20; ++i) {
            child.addName("str" + i, i);
        }

        Assert.assertTrue(child.primaryCount() > 0);
        Assert.assertTrue(child.secondaryCount() >= 0);
        Assert.assertTrue(child.tertiaryCount() >= 0);
        Assert.assertTrue(child.spilloverCount() >= 0);
        Assert.assertEquals(20, child.totalCount());

        String str = child.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("ByteQuadsCanonicalizer"));
        Assert.assertTrue(str.contains("size=20"));
    }

    @Test
    public void testCalcTertiaryShift_variousSizes() {
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(255));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(1024));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(2048));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(4096));
        Assert.assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(8192));
    }

    @Test
    public void testReportTooManyCollisions_behavior() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(14);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask());

        child._hashSize = 1024;
        child._reportTooManyCollisions();

        child._hashSize = 2048;
        try {
            child._reportTooManyCollisions();
            Assert.fail("Expected IllegalStateException due to excessive collisions on large table");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("suspect a DoS attack"));
        }
    }

    @Test
    public void testAddName_withoutInterning() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(15);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        String custom = new String("nonInternedString");
        String added = child.addName(custom, 12345);
        Assert.assertSame(custom, added);
        Assert.assertEquals(custom, child.findName(12345));
    }

    @Test
    public void testEdgeCaseInputs_emptyStringAndZeros() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(16);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        child.addName("", 0);
        Assert.assertEquals("", child.findName(0));

        child.addName("zeros2", 0, 0);
        Assert.assertEquals("zeros2", child.findName(0, 0));

        child.addName("zeros3", 0, 0, 0);
        Assert.assertEquals("zeros3", child.findName(0, 0, 0));

        child.addName("zeros4", new int[]{0, 0, 0, 0}, 4);
        Assert.assertEquals("zeros4", child.findName(new int[]{0, 0, 0, 0}, 4));
    }
}
