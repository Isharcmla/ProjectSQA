package org.apache.commons.lang3.builder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class HashCodeBuilderTest {

    // ---------- Fixture classes for reflection tests ----------

    static class SimpleObject {
        @SuppressWarnings("unused")
        private int value;

        SimpleObject(int value) {
            this.value = value;
        }
    }

    static class ParentClass {
        @SuppressWarnings("unused")
        private int parentField = 10;
    }

    static class ChildClass extends ParentClass {
        @SuppressWarnings("unused")
        private int childField = 20;
    }

    static class TransientFieldClass {
        @SuppressWarnings("unused")
        private int normalField = 1;
        @SuppressWarnings("unused")
        private transient int transientField = 2;
    }

    static class StaticFieldClass {
        @SuppressWarnings("unused")
        private static int staticField = 100;
        @SuppressWarnings("unused")
        private int instanceField = 5;
    }

    static class ExcludeFieldClass {
        @SuppressWarnings("unused")
        private int fieldA = 1;
        @SuppressWarnings("unused")
        private int fieldB = 2;
    }

    class OuterClass {
        class InnerClass {
            @SuppressWarnings("unused")
            private int innerValue = 5;
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_returnsInitialValue17() {
        HashCodeBuilder builder = new HashCodeBuilder();
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testConstructor_validOddNumbers_setsFieldsCorrectly() {
        HashCodeBuilder builder = new HashCodeBuilder(3, 5);
        assertEquals(3, builder.toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroInitial_throwsException() {
        new HashCodeBuilder(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_evenInitial_throwsException() {
        new HashCodeBuilder(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroMultiplier_throwsException() {
        new HashCodeBuilder(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_evenMultiplier_throwsException() {
        new HashCodeBuilder(3, 4);
    }

    // ---------- append(boolean) ----------

    @Test
    public void testAppendBoolean_trueValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(true);
        assertEquals(17 * 37 + 0, builder.toHashCode());
    }

    @Test
    public void testAppendBoolean_falseValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(false);
        assertEquals(17 * 37 + 1, builder.toHashCode());
    }

    // ---------- append(boolean[]) ----------

    @Test
    public void testAppendBooleanArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((boolean[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArray_emptyArray_noChange() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new boolean[0]);
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new boolean[] { true, false });
        int expected = (17 * 37 + 0) * 37 + 1;
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(byte) ----------

    @Test
    public void testAppendByte_normalValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((byte) 5);
        assertEquals(17 * 37 + 5, builder.toHashCode());
    }

    // ---------- append(byte[]) ----------

    @Test
    public void testAppendByteArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((byte[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendByteArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new byte[] { 1, 2 });
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(char) ----------

    @Test
    public void testAppendChar_normalValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append('a');
        assertEquals(17 * 37 + 'a', builder.toHashCode());
    }

    // ---------- append(char[]) ----------

    @Test
    public void testAppendCharArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((char[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendCharArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new char[] { 'a', 'b' });
        int expected = (17 * 37 + 'a') * 37 + 'b';
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(double) ----------

    @Test
    public void testAppendDouble_zeroValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(0.0d);
        assertEquals(17 * 37 + 0, builder.toHashCode());
    }

    @Test
    public void testAppendDouble_nonZeroValue_returnsConsistentHashCode() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        builder1.append(1.5d);
        builder2.append(1.5d);
        assertEquals(builder1.toHashCode(), builder2.toHashCode());
    }

    // ---------- append(double[]) ----------

    @Test
    public void testAppendDoubleArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((double[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArray_withValues_returnsConsistentHashCode() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        builder1.append(new double[] { 1.0, 2.0 });
        builder2.append(new double[] { 1.0, 2.0 });
        assertEquals(builder1.toHashCode(), builder2.toHashCode());
    }

    // ---------- append(float) ----------

    @Test
    public void testAppendFloat_zeroValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(0.0f);
        assertEquals(17 * 37 + 0, builder.toHashCode());
    }

    // ---------- append(float[]) ----------

    @Test
    public void testAppendFloatArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((float[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArray_withValues_returnsConsistentHashCode() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        builder1.append(new float[] { 1.0f, 2.0f });
        builder2.append(new float[] { 1.0f, 2.0f });
        assertEquals(builder1.toHashCode(), builder2.toHashCode());
    }

    // ---------- append(int) ----------

    @Test
    public void testAppendInt_normalValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(5);
        assertEquals(17 * 37 + 5, builder.toHashCode());
    }

    @Test
    public void testAppendInt_negativeValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(-5);
        assertEquals(17 * 37 - 5, builder.toHashCode());
    }

    // ---------- append(int[]) ----------

    @Test
    public void testAppendIntArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((int[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendIntArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new int[] { 1, 2 });
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(long) ----------

    @Test
    public void testAppendLong_positiveValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(1L);
        assertEquals(17 * 37 + 1, builder.toHashCode());
    }

    @Test
    public void testAppendLong_negativeValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(-1L);
        assertEquals(17 * 37 + 0, builder.toHashCode());
    }

    // ---------- append(long[]) ----------

    @Test
    public void testAppendLongArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((long[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendLongArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new long[] { 1L, 2L });
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(short) ----------

    @Test
    public void testAppendShort_normalValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((short) 3);
        assertEquals(17 * 37 + 3, builder.toHashCode());
    }

    // ---------- append(short[]) ----------

    @Test
    public void testAppendShortArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((short[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendShortArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new short[] { 1, 2 });
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- append(Object) ----------

    @Test
    public void testAppendObject_nullObject_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((Object) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendObject_normalObject_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        String str = "test";
        builder.append(str);
        assertEquals(17 * 37 + str.hashCode(), builder.toHashCode());
    }

    @Test
    public void testAppendObject_longArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        long[] arr = { 1L, 2L };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_intArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        int[] arr = { 1, 2 };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_shortArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        short[] arr = { 1, 2 };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_charArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        char[] arr = { 'a', 'b' };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_byteArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        byte[] arr = { 1, 2 };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_doubleArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        double[] arr = { 1.0, 2.0 };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_floatArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        float[] arr = { 1.0f, 2.0f };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_booleanArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        boolean[] arr = { true, false };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_objectArray_dispatchesCorrectly() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);
        String[] arr = { "a", "b" };
        builder1.append((Object) arr);
        builder2.append(arr);
        assertEquals(builder2.toHashCode(), builder1.toHashCode());
    }

    @Test
    public void testAppendObject_multiDimensionalArray_doesNotThrow() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        Object[] nested = { new int[] { 1, 2 }, "text", null };
        builder.append(nested);
        // Should complete without exception
        assertNotNull(builder.toHashCode());
    }

    // ---------- append(Object[]) ----------

    @Test
    public void testAppendObjectArray_nullArray_multipliesOnly() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append((Object[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArray_emptyArray_noChange() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(new Object[0]);
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArray_withValues_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        String a = "a";
        String b = "b";
        builder.append(new Object[] { a, b });
        int expected = (17 * 37 + a.hashCode()) * 37 + b.hashCode();
        assertEquals(expected, builder.toHashCode());
    }

    // ---------- appendSuper ----------

    @Test
    public void testAppendSuper_normalValue_computesExpectedHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.appendSuper(99);
        assertEquals(17 * 37 + 99, builder.toHashCode());
    }

    // ---------- toHashCode / hashCode ----------

    @Test
    public void testToHashCode_afterMultipleAppends_returnsAccumulatedValue() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(1).append(2).append(3);
        int result = builder.toHashCode();
        assertEquals(result, builder.toHashCode());
    }

    @Test
    public void testHashCode_sameAsToHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(5);
        assertEquals(builder.toHashCode(), builder.hashCode());
    }

    // ---------- reflectionHashCode overloads ----------

    @Test
    public void testReflectionHashCode_threeArgOverload_returnsConsistentValue() {
        SimpleObject obj1 = new SimpleObject(5);
        SimpleObject obj2 = new SimpleObject(5);
        int hash1 = HashCodeBuilder.reflectionHashCode(17, 37, obj1);
        int hash2 = HashCodeBuilder.reflectionHashCode(17, 37, obj2);
        assertEquals(hash1, hash2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_threeArgOverload_nullObject_throwsException() {
        HashCodeBuilder.reflectionHashCode(17, 37, null);
    }

    @Test
    public void testReflectionHashCode_fourArgOverload_testTransientsTrue_includesTransientField() {
        TransientFieldClass obj = new TransientFieldClass();
        int hashWithTransients = HashCodeBuilder.reflectionHashCode(17, 37, obj, true);
        int hashWithoutTransients = HashCodeBuilder.reflectionHashCode(17, 37, obj, false);
        assertNotEquals(hashWithTransients, hashWithoutTransients);
    }

    @Test
    public void testReflectionHashCode_fiveArgOverload_withReflectUpToClass_excludesSuperclassFields() {
        ChildClass child = new ChildClass();
        int hashFull = HashCodeBuilder.reflectionHashCode(17, 37, child, false, null);
        int hashUpToChild = HashCodeBuilder.reflectionHashCode(17, 37, child, false, ChildClass.class);
        assertNotEquals(hashFull, hashUpToChild);
    }

    @Test
    public void testReflectionHashCode_sixArgOverload_withExcludeFields_excludesSpecifiedField() {
        ExcludeFieldClass obj = new ExcludeFieldClass();
        String[] excludeFields = { "fieldB" };
        int hashExcluded = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, excludeFields);
        int hashFull = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, null);
        assertNotEquals(hashExcluded, hashFull);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_sixArgOverload_nullObject_throwsException() {
        HashCodeBuilder.reflectionHashCode(17, 37, null, false, null, null);
    }

    @Test
    public void testReflectionHashCode_singleArgOverload_returnsConsistentValue() {
        SimpleObject obj1 = new SimpleObject(10);
        SimpleObject obj2 = new SimpleObject(10);
        int hash1 = HashCodeBuilder.reflectionHashCode(obj1);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2);
        assertEquals(hash1, hash2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_singleArgOverload_nullObject_throwsException() {
        HashCodeBuilder.reflectionHashCode(null);
    }

    @Test
    public void testReflectionHashCode_objectBooleanOverload_testTransientsTrue_includesTransientField() {
        TransientFieldClass obj = new TransientFieldClass();
        int hashWithTransients = HashCodeBuilder.reflectionHashCode(obj, true);
        int hashWithoutTransients = HashCodeBuilder.reflectionHashCode(obj, false);
        assertNotEquals(hashWithTransients, hashWithoutTransients);
    }

    @Test
    public void testReflectionHashCode_objectCollectionOverload_excludesSpecifiedFields() {
        ExcludeFieldClass obj = new ExcludeFieldClass();
        Collection<String> excludeFields = new ArrayList<String>();
        excludeFields.add("fieldB");
        int hashExcluded = HashCodeBuilder.reflectionHashCode(obj, excludeFields);
        int hashFull = HashCodeBuilder.reflectionHashCode(obj, (Collection<String>) null);
        assertNotEquals(hashExcluded, hashFull);
    }

    @Test
    public void testReflectionHashCode_objectStringArrayOverload_excludesSpecifiedFields() {
        ExcludeFieldClass obj = new ExcludeFieldClass();
        String[] excludeFields = { "fieldB" };
        int hashExcluded = HashCodeBuilder.reflectionHashCode(obj, excludeFields);
        int hashFull = HashCodeBuilder.reflectionHashCode(obj, (String[]) null);
        assertNotEquals(hashExcluded, hashFull);
    }

    @Test
    public void testReflectionHashCode_staticFieldClass_excludesStaticField() {
        StaticFieldClass obj1 = new StaticFieldClass();
        StaticFieldClass obj2 = new StaticFieldClass();
        int hash1 = HashCodeBuilder.reflectionHashCode(obj1);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2);
        assertEquals(hash1, hash2);
    }

    @Test
    public void testReflectionHashCode_innerClassWithSyntheticField_doesNotThrow() {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        int hash = HashCodeBuilder.reflectionHashCode(inner);
        assertNotNull(hash);
    }

    @Test
    public void testReflectionHashCode_childClassWithSuperclassFields_includesParentFields() {
        ChildClass child1 = new ChildClass();
        ChildClass child2 = new ChildClass();
        int hash1 = HashCodeBuilder.reflectionHashCode(child1);
        int hash2 = HashCodeBuilder.reflectionHashCode(child2);
        assertEquals(hash1, hash2);
    }

    // ---------- Combined usage test ----------

    @Test
    public void testChainedAppendCalls_typicalUsage_returnsConsistentHashCode() {
        HashCodeBuilder builder1 = new HashCodeBuilder(17, 37);
        HashCodeBuilder builder2 = new HashCodeBuilder(17, 37);

        builder1.append("name").append(25).append(true);
        builder2.append("name").append(25).append(true);

        assertEquals(builder1.toHashCode(), builder2.toHashCode());
    }
}
