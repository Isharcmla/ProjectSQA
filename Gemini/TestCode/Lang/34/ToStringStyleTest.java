package org.apache.commons.lang3.builder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToStringStyleTest {

    private static class CustomToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1L;

        public CustomToStringStyle() {
            super();
        }

        @Override
        public void setUseClassName(boolean useClassName) {
            super.setUseClassName(useClassName);
        }

        @Override
        public void setUseShortClassName(boolean useShortClassName) {
            super.setUseShortClassName(useShortClassName);
        }

        @Override
        public void setUseIdentityHashCode(boolean useIdentityHashCode) {
            super.setUseIdentityHashCode(useIdentityHashCode);
        }

        @Override
        public void setUseFieldNames(boolean useFieldNames) {
            super.setUseFieldNames(useFieldNames);
        }

        @Override
        public void setDefaultFullDetail(boolean defaultFullDetail) {
            super.setDefaultFullDetail(defaultFullDetail);
        }

        @Override
        public void setArrayContentDetail(boolean arrayContentDetail) {
            super.setArrayContentDetail(arrayContentDetail);
        }

        @Override
        public void setArrayStart(String arrayStart) {
            super.setArrayStart(arrayStart);
        }

        @Override
        public void setArrayEnd(String arrayEnd) {
            super.setArrayEnd(arrayEnd);
        }

        @Override
        public void setArraySeparator(String arraySeparator) {
            super.setArraySeparator(arraySeparator);
        }

        @Override
        public void setContentStart(String contentStart) {
            super.setContentStart(contentStart);
        }

        @Override
        public void setContentEnd(String contentEnd) {
            super.setContentEnd(contentEnd);
        }

        @Override
        public void setFieldNameValueSeparator(String fieldNameValueSeparator) {
            super.setFieldNameValueSeparator(fieldNameValueSeparator);
        }

        @Override
        public void setFieldSeparator(String fieldSeparator) {
            super.setFieldSeparator(fieldSeparator);
        }

        @Override
        public void setFieldSeparatorAtStart(boolean fieldSeparatorAtStart) {
            super.setFieldSeparatorAtStart(fieldSeparatorAtStart);
        }

        @Override
        public void setFieldSeparatorAtEnd(boolean fieldSeparatorAtEnd) {
            super.setFieldSeparatorAtEnd(fieldSeparatorAtEnd);
        }

        @Override
        public void setNullText(String nullText) {
            super.setNullText(nullText);
        }

        @Override
        public void setSizeStartText(String sizeStartText) {
            super.setSizeStartText(sizeStartText);
        }

        @Override
        public void setSizeEndText(String sizeEndText) {
            super.setSizeEndText(sizeEndText);
        }

        @Override
        public void setSummaryObjectStartText(String summaryObjectStartText) {
            super.setSummaryObjectStartText(summaryObjectStartText);
        }

        @Override
        public void setSummaryObjectEndText(String summaryObjectEndText) {
            super.setSummaryObjectEndText(summaryObjectEndText);
        }
    }

    private CustomToStringStyle style;
    private StringBuffer buffer;

    @Before
    public void setUp() {
        style = new CustomToStringStyle();
        buffer = new StringBuffer();
    }

    @After
    public void tearDown() {
        style = null;
        buffer = null;
    }

    @SuppressWarnings("unchecked")
    private <T> T serializeAndDeserialize(T obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        T result = (T) ois.readObject();
        ois.close();
        return result;
    }

    @Test
    public void testRegistry_operations_manageThreadLocalCorrectly() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Assert.assertFalse(ToStringStyle.isRegistered(obj1));
        Assert.assertTrue(ToStringStyle.getRegistry().isEmpty());

        ToStringStyle.register(null);
        Assert.assertFalse(ToStringStyle.isRegistered(null));

        ToStringStyle.register(obj1);
        Assert.assertTrue(ToStringStyle.isRegistered(obj1));
        Assert.assertFalse(ToStringStyle.isRegistered(obj2));

        ToStringStyle.register(obj2);
        Assert.assertTrue(ToStringStyle.isRegistered(obj1));
        Assert.assertTrue(ToStringStyle.isRegistered(obj2));

        ToStringStyle.unregister(null);

        ToStringStyle.unregister(obj1);
        Assert.assertFalse(ToStringStyle.isRegistered(obj1));
        Assert.assertTrue(ToStringStyle.isRegistered(obj2));

        ToStringStyle.unregister(obj2);
        Assert.assertFalse(ToStringStyle.isRegistered(obj2));
        Assert.assertTrue(ToStringStyle.getRegistry().isEmpty());
    }

    @Test
    public void testAppendSuper_validSuperToString_appendsCorrectly() {
        String superToString = "Person@1234[name=John,age=20]";
        style.appendSuper(buffer, superToString);
        Assert.assertEquals("name=John,age=20,", buffer.toString());
    }

    @Test
    public void testAppendToString_nullOrInvalidString_handledGracefully() {
        style.appendToString(buffer, null);
        Assert.assertEquals("", buffer.toString());

        style.appendToString(buffer, "NoContentDelimiters");
        Assert.assertEquals("", buffer.toString());

        style.appendToString(buffer, "[]");
        Assert.assertEquals("", buffer.toString());

        style.setFieldSeparatorAtStart(true);
        buffer.append("existing,");
        style.appendToString(buffer, "Class@[name=Alice]");
        Assert.assertEquals("existingname=Alice,", buffer.toString());
    }

    @Test
    public void testAppendStart_variousConfigurations_outputsExpectedFormat() {
        style.appendStart(buffer, null);
        Assert.assertEquals("", buffer.toString());

        Object testObj = new Integer(123);

        style.setUseClassName(true);
        style.setUseShortClassName(false);
        style.setUseIdentityHashCode(true);
        style.setFieldSeparatorAtStart(true);
        style.appendStart(buffer, testObj);
        Assert.assertTrue(buffer.toString().startsWith("java.lang.Integer@"));
        Assert.assertTrue(buffer.toString().endsWith("[,"));

        buffer.setLength(0);
        style.setUseClassName(true);
        style.setUseShortClassName(true);
        style.setUseIdentityHashCode(false);
        style.setFieldSeparatorAtStart(false);
        style.appendStart(buffer, testObj);
        Assert.assertEquals("Integer[", buffer.toString());

        buffer.setLength(0);
        style.setUseClassName(false);
        style.setUseIdentityHashCode(false);
        style.appendStart(buffer, testObj);
        Assert.assertEquals("[", buffer.toString());
    }

    @Test
    public void testAppendEnd_fieldSeparatorAtEndConfiguration_handlesUnregisterAndSeparator() {
        Object testObj = new Object();
        ToStringStyle.register(testObj);
        Assert.assertTrue(ToStringStyle.isRegistered(testObj));

        buffer.append("a=1,");
        style.setFieldSeparatorAtEnd(false);
        style.appendEnd(buffer, testObj);
        Assert.assertEquals("a=1]", buffer.toString());
        Assert.assertFalse(ToStringStyle.isRegistered(testObj));

        buffer.setLength(0);
        buffer.append("a=1,");
        style.setFieldSeparatorAtEnd(true);
        style.appendEnd(buffer, testObj);
        Assert.assertEquals("a=1,]", buffer.toString());
    }

    @Test
    public void testRemoveLastFieldSeparator_variousBufferLengths_removesCorrectly() {
        style.setFieldSeparator(", ");
        
        StringBuffer emptyBuf = new StringBuffer();
        style.removeLastFieldSeparator(emptyBuf);
        Assert.assertEquals("", emptyBuf.toString());

        StringBuffer shortBuf = new StringBuffer("a");
        style.removeLastFieldSeparator(shortBuf);
        Assert.assertEquals("a", shortBuf.toString());

        StringBuffer matchBuf = new StringBuffer("field=value, ");
        style.removeLastFieldSeparator(matchBuf);
        Assert.assertEquals("field=value", matchBuf.toString());

        StringBuffer nonMatchBuf = new StringBuffer("field=value,x");
        style.removeLastFieldSeparator(nonMatchBuf);
        Assert.assertEquals("field=value,x", nonMatchBuf.toString());
    }

    @Test
    public void testAppend_objectAndPrimitives_fullCoverage() {
        style.append(buffer, "nullObj", (Object) null, null);
        Assert.assertEquals("nullObj=<null>,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "name", "John", Boolean.TRUE);
        Assert.assertEquals("name=John,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "name", "John", Boolean.FALSE);
        Assert.assertEquals("name=<String>,", buffer.toString());
        buffer.setLength(0);

        style.setUseFieldNames(false);
        style.append(buffer, "name", "John", null);
        Assert.assertEquals("John,", buffer.toString());
        style.setUseFieldNames(true);
        buffer.setLength(0);

        style.append(buffer, "long", 100L);
        Assert.assertEquals("long=100,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "int", 50);
        Assert.assertEquals("int=50,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "short", (short) 10);
        Assert.assertEquals("short=10,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "byte", (byte) 5);
        Assert.assertEquals("byte=5,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "char", 'A');
        Assert.assertEquals("char=A,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "double", 12.34);
        Assert.assertEquals("double=12.34,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "float", 56.78f);
        Assert.assertEquals("float=56.78,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "boolean", true);
        Assert.assertEquals("boolean=true,", buffer.toString());
    }

    @Test
    public void testAppendInternal_collectionsAndMaps_detailAndSummary() {
        List<String> list = Arrays.asList("one", "two");
        style.append(buffer, "list", list, Boolean.TRUE);
        Assert.assertEquals("list=[one, two],", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "listSummary", list, Boolean.FALSE);
        Assert.assertEquals("listSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        style.append(buffer, "map", map, Boolean.TRUE);
        Assert.assertEquals("map={k=v},", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "mapSummary", map, Boolean.FALSE);
        Assert.assertEquals("mapSummary=<size=1>,", buffer.toString());
    }

    @Test
    public void testAppendInternal_primitiveArrays_detailAndSummary() {
        long[] longArr = new long[]{1L, 2L};
        style.append(buffer, "longs", longArr, Boolean.TRUE);
        Assert.assertEquals("longs={1,2},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "longsNull", (long[]) null, Boolean.TRUE);
        Assert.assertEquals("longsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "longsSummary", longArr, Boolean.FALSE);
        Assert.assertEquals("longsSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        int[] intArr = new int[]{3, 4};
        style.append(buffer, "ints", intArr, Boolean.TRUE);
        Assert.assertEquals("ints={3,4},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "intsNull", (int[]) null, Boolean.TRUE);
        Assert.assertEquals("intsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "intsSummary", intArr, Boolean.FALSE);
        Assert.assertEquals("intsSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        short[] shortArr = new short[]{5, 6};
        style.append(buffer, "shorts", shortArr, Boolean.TRUE);
        Assert.assertEquals("shorts={5,6},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "shortsNull", (short[]) null, Boolean.TRUE);
        Assert.assertEquals("shortsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "shortsSummary", shortArr, Boolean.FALSE);
        Assert.assertEquals("shortsSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        byte[] byteArr = new byte[]{7, 8};
        style.append(buffer, "bytes", byteArr, Boolean.TRUE);
        Assert.assertEquals("bytes={7,8},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "bytesNull", (byte[]) null, Boolean.TRUE);
        Assert.assertEquals("bytesNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "bytesSummary", byteArr, Boolean.FALSE);
        Assert.assertEquals("bytesSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        char[] charArr = new char[]{'a', 'b'};
        style.append(buffer, "chars", charArr, Boolean.TRUE);
        Assert.assertEquals("chars={a,b},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "charsNull", (char[]) null, Boolean.TRUE);
        Assert.assertEquals("charsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "charsSummary", charArr, Boolean.FALSE);
        Assert.assertEquals("charsSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        double[] doubleArr = new double[]{1.1, 2.2};
        style.append(buffer, "doubles", doubleArr, Boolean.TRUE);
        Assert.assertEquals("doubles={1.1,2.2},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "doublesNull", (double[]) null, Boolean.TRUE);
        Assert.assertEquals("doublesNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "doublesSummary", doubleArr, Boolean.FALSE);
        Assert.assertEquals("doublesSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        float[] floatArr = new float[]{3.3f, 4.4f};
        style.append(buffer, "floats", floatArr, Boolean.TRUE);
        Assert.assertEquals("floats={3.3,4.4},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "floatsNull", (float[]) null, Boolean.TRUE);
        Assert.assertEquals("floatsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "floatsSummary", floatArr, Boolean.FALSE);
        Assert.assertEquals("floatsSummary=<size=2>,", buffer.toString());
        buffer.setLength(0);

        boolean[] boolArr = new boolean[]{true, false};
        style.append(buffer, "bools", boolArr, Boolean.TRUE);
        Assert.assertEquals("bools={true,false},", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "boolsNull", (boolean[]) null, Boolean.TRUE);
        Assert.assertEquals("boolsNull=<null>,", buffer.toString());
        buffer.setLength(0);
        style.append(buffer, "boolsSummary", boolArr, Boolean.FALSE);
        Assert.assertEquals("boolsSummary=<size=2>,", buffer.toString());
    }

    @Test
    public void testAppendInternal_objectArrays_detailAndSummary() {
        Object[] objArr = new Object[]{"test", null, Integer.valueOf(42)};
        style.append(buffer, "objects", objArr, Boolean.TRUE);
        Assert.assertEquals("objects={test,<null>,42},", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "objectsNull", (Object[]) null, Boolean.TRUE);
        Assert.assertEquals("objectsNull=<null>,", buffer.toString());
        buffer.setLength(0);

        style.append(buffer, "objectsSummary", objArr, Boolean.FALSE);
        Assert.assertEquals("objectsSummary=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppendInternal_nestedAndMultidimensionalArrays_handledViaReflection() {
        int[][] multiArray = new int[][]{{1, 2}, null};
        style.appendInternal(buffer, "multi", multiArray, true);
        Assert.assertEquals("{{1,2},<null>}", buffer.toString());
    }

    @Test
    public void testReflectionAppendArrayDetail_variousArrays_formatsCorrectly() {
        String[] strArray = new String[]{"a", null, "b"};
        style.reflectionAppendArrayDetail(buffer, "arr", strArray);
        Assert.assertEquals("{a,<null>,b}", buffer.toString());
        buffer.setLength(0);

        int[] intArray = new int[]{10, 20};
        style.reflectionAppendArrayDetail(buffer, "arr", intArray);
        Assert.assertEquals("{10,20}", buffer.toString());
    }

    @Test
    public void testAppendInternal_cyclicObjectDetection_appendsIdentityToString() {
        List<Object> list = new ArrayList<Object>();
        list.add("first");
        list.add(list);

        style.append(buffer, "cyclicList", list, Boolean.TRUE);
        Assert.assertTrue(buffer.toString().contains("cyclicList=[first, java.util.ArrayList@"));

        buffer.setLength(0);
        ToStringStyle.register(Integer.valueOf(100));
        style.append(buffer, "num", Integer.valueOf(100), Boolean.TRUE);
        Assert.assertEquals("num=100,", buffer.toString());
        ToStringStyle.unregister(Integer.valueOf(100));
    }

    @Test
    public void testGettersAndSetters_normalAndNullValues_handledAppropriately() {
        style.setUseClassName(false);
        Assert.assertFalse(style.isUseClassName());

        style.setUseShortClassName(true);
        Assert.assertTrue(style.isUseShortClassName());

        style.setUseIdentityHashCode(false);
        Assert.assertFalse(style.isUseIdentityHashCode());

        style.setUseFieldNames(false);
        Assert.assertFalse(style.isUseFieldNames());

        style.setDefaultFullDetail(false);
        Assert.assertFalse(style.isDefaultFullDetail());

        style.setArrayContentDetail(false);
        Assert.assertFalse(style.isArrayContentDetail());

        style.setArrayStart(null);
        Assert.assertEquals("", style.getArrayStart());
        style.setArrayStart("[[");
        Assert.assertEquals("[[", style.getArrayStart());

        style.setArrayEnd(null);
        Assert.assertEquals("", style.getArrayEnd());
        style.setArrayEnd("]]");
        Assert.assertEquals("]]", style.getArrayEnd());

        style.setArraySeparator(null);
        Assert.assertEquals("", style.getArraySeparator());
        style.setArraySeparator(";;");
        Assert.assertEquals(";;", style.getArraySeparator());

        style.setContentStart(null);
        Assert.assertEquals("", style.getContentStart());
        style.setContentStart("<<");
        Assert.assertEquals("<<", style.getContentStart());

        style.setContentEnd(null);
        Assert.assertEquals("", style.getContentEnd());
        style.setContentEnd(">>");
        Assert.assertEquals(">>", style.getContentEnd());

        style.setFieldNameValueSeparator(null);
        Assert.assertEquals("", style.getFieldNameValueSeparator());
        style.setFieldNameValueSeparator("->");
        Assert.assertEquals("->", style.getFieldNameValueSeparator());

        style.setFieldSeparator(null);
        Assert.assertEquals("", style.getFieldSeparator());
        style.setFieldSeparator("|");
        Assert.assertEquals("|", style.getFieldSeparator());

        style.setFieldSeparatorAtStart(true);
        Assert.assertTrue(style.isFieldSeparatorAtStart());

        style.setFieldSeparatorAtEnd(true);
        Assert.assertTrue(style.isFieldSeparatorAtEnd());

        style.setNullText(null);
        Assert.assertEquals("", style.getNullText());
        style.setNullText("NIL");
        Assert.assertEquals("NIL", style.getNullText());

        style.setSizeStartText(null);
        Assert.assertEquals("", style.getSizeStartText());
        style.setSizeStartText("(len=");
        Assert.assertEquals("(len=", style.getSizeStartText());

        style.setSizeEndText(null);
        Assert.assertEquals("", style.getSizeEndText());
        style.setSizeEndText(")");
        Assert.assertEquals(")", style.getSizeEndText());

        style.setSummaryObjectStartText(null);
        Assert.assertEquals("", style.getSummaryObjectStartText());
        style.setSummaryObjectStartText("OBJ<");
        Assert.assertEquals("OBJ<", style.getSummaryObjectStartText());

        style.setSummaryObjectEndText(null);
        Assert.assertEquals("", style.getSummaryObjectEndText());
        style.setSummaryObjectEndText(">OBJ");
        Assert.assertEquals(">OBJ", style.getSummaryObjectEndText());
    }

    @Test
    public void testPredefinedStyles_serialization_readResolveMaintainsSingleton() throws Exception {
        Assert.assertSame(ToStringStyle.DEFAULT_STYLE, serializeAndDeserialize(ToStringStyle.DEFAULT_STYLE));
        Assert.assertSame(ToStringStyle.MULTI_LINE_STYLE, serializeAndDeserialize(ToStringStyle.MULTI_LINE_STYLE));
        Assert.assertSame(ToStringStyle.NO_FIELD_NAMES_STYLE, serializeAndDeserialize(ToStringStyle.NO_FIELD_NAMES_STYLE));
        Assert.assertSame(ToStringStyle.SHORT_PREFIX_STYLE, serializeAndDeserialize(ToStringStyle.SHORT_PREFIX_STYLE));
        Assert.assertSame(ToStringStyle.SIMPLE_STYLE, serializeAndDeserialize(ToStringStyle.SIMPLE_STYLE));
    }

    @Test
    public void testPredefinedStyles_formattingOutput_matchesExpectedBehavior() {
        Object target = new Object();

        ToStringBuilder defaultBuilder = new ToStringBuilder(target, ToStringStyle.DEFAULT_STYLE);
        defaultBuilder.append("key", "val");
        Assert.assertTrue(defaultBuilder.toString().contains("[key=val]"));

        ToStringBuilder noFieldNamesBuilder = new ToStringBuilder(target, ToStringStyle.NO_FIELD_NAMES_STYLE);
        noFieldNamesBuilder.append("key", "val");
        Assert.assertTrue(noFieldNamesBuilder.toString().contains("[val]"));

        ToStringBuilder shortPrefixBuilder = new ToStringBuilder(target, ToStringStyle.SHORT_PREFIX_STYLE);
        shortPrefixBuilder.append("key", "val");
        Assert.assertTrue(shortPrefixBuilder.toString().startsWith("Object[key=val]"));

        ToStringBuilder simpleBuilder = new ToStringBuilder(target, ToStringStyle.SIMPLE_STYLE);
        simpleBuilder.append("key", "val");
        Assert.assertEquals("val", simpleBuilder.toString());

        ToStringBuilder multiLineBuilder = new ToStringBuilder(target, ToStringStyle.MULTI_LINE_STYLE);
        multiLineBuilder.append("key", "val");
        Assert.assertTrue(multiLineBuilder.toString().contains("key=val"));
    }
}
