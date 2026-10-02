package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UntypedObjectDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testConstructorsAndCachable() {
        UntypedObjectDeserializer deserDefault = new UntypedObjectDeserializer();
        Assert.assertTrue(deserDefault.isCachable());

        JavaType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, Object.class);
        JavaType mapType = mapper.getTypeFactory().constructMapType(TreeMap.class, String.class, Object.class);
        UntypedObjectDeserializer deserTyped = new UntypedObjectDeserializer(listType, mapType);
        Assert.assertTrue(deserTyped.isCachable());

        UntypedObjectDeserializer deserCopy = new UntypedObjectDeserializer(deserTyped, null, null, null, null);
        Assert.assertTrue(deserCopy.isCachable());
        Assert.assertNotNull(UntypedObjectDeserializer.instance);
    }

    @Test
    public void testVanillaDeserializePrimitivesAndScalars() throws Exception {
        Object valNull = mapper.readValue("null", Object.class);
        Assert.assertNull(valNull);

        Object valTrue = mapper.readValue("true", Object.class);
        Assert.assertEquals(Boolean.TRUE, valTrue);

        Object valFalse = mapper.readValue("false", Object.class);
        Assert.assertEquals(Boolean.FALSE, valFalse);

        Object valString = mapper.readValue("\"hello world\"", Object.class);
        Assert.assertEquals("hello world", valString);

        Object valEmptyString = mapper.readValue("\"\"", Object.class);
        Assert.assertEquals("", valEmptyString);

        Object valInt = mapper.readValue("123", Object.class);
        Assert.assertEquals(Integer.valueOf(123), valInt);

        Object valNegInt = mapper.readValue("-456", Object.class);
        Assert.assertEquals(Integer.valueOf(-456), valNegInt);

        Object valDouble = mapper.readValue("123.45", Object.class);
        Assert.assertEquals(Double.valueOf(123.45), valDouble);
    }

    @Test
    public void testVanillaDeserializeNumberCoercions() throws Exception {
        ObjectMapper intCoerceMapper = new ObjectMapper();
        intCoerceMapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        Object bigInt = intCoerceMapper.readValue("12345678901234567890", Object.class);
        Assert.assertEquals(new BigInteger("12345678901234567890"), bigInt);

        ObjectMapper longCoerceMapper = new ObjectMapper();
        longCoerceMapper.enable(DeserializationFeature.USE_LONG_FOR_INTS);
        Object longVal = longCoerceMapper.readValue("123", Object.class);
        Assert.assertEquals(Long.valueOf(123L), longVal);

        ObjectMapper bigDecMapper = new ObjectMapper();
        bigDecMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Object bigDec = bigDecMapper.readValue("123.45", Object.class);
        Assert.assertEquals(new BigDecimal("123.45"), bigDec);
    }

    @Test
    public void testVanillaDeserializeObjects() throws Exception {
        Object emptyObj = mapper.readValue("{}", Object.class);
        Assert.assertTrue(emptyObj instanceof Map);
        Assert.assertTrue(((Map<?, ?>) emptyObj).isEmpty());

        Object oneProp = mapper.readValue("{\"k1\":\"v1\"}", Object.class);
        Assert.assertTrue(oneProp instanceof Map);
        Map<?, ?> map1 = (Map<?, ?>) oneProp;
        Assert.assertEquals(1, map1.size());
        Assert.assertEquals("v1", map1.get("k1"));

        Object twoProps = mapper.readValue("{\"k1\":\"v1\", \"k2\":\"v2\"}", Object.class);
        Assert.assertTrue(twoProps instanceof Map);
        Map<?, ?> map2 = (Map<?, ?>) twoProps;
        Assert.assertEquals(2, map2.size());
        Assert.assertEquals("v1", map2.get("k1"));
        Assert.assertEquals("v2", map2.get("k2"));

        Object threeProps = mapper.readValue("{\"k1\":1, \"k2\":2, \"k3\":3, \"k4\":4}", Object.class);
        Assert.assertTrue(threeProps instanceof Map);
        Map<?, ?> map3 = (Map<?, ?>) threeProps;
        Assert.assertEquals(4, map3.size());
        Assert.assertEquals(1, map3.get("k1"));
        Assert.assertEquals(4, map3.get("k4"));
    }

    @Test
    public void testVanillaDeserializeArrays() throws Exception {
        Object emptyArr = mapper.readValue("[]", Object.class);
        Assert.assertTrue(emptyArr instanceof List);
        Assert.assertTrue(((List<?>) emptyArr).isEmpty());

        Object oneElem = mapper.readValue("[\"item1\"]", Object.class);
        Assert.assertTrue(oneElem instanceof List);
        List<?> list1 = (List<?>) oneElem;
        Assert.assertEquals(1, list1.size());
        Assert.assertEquals("item1", list1.get(0));

        Object twoElem = mapper.readValue("[\"item1\", \"item2\"]", Object.class);
        Assert.assertTrue(twoElem instanceof List);
        List<?> list2 = (List<?>) twoElem;
        Assert.assertEquals(2, list2.size());
        Assert.assertEquals("item1", list2.get(0));
        Assert.assertEquals("item2", list2.get(1));

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 50; i++) {
            if (i > 0) sb.append(",");
            sb.append(i);
        }
        sb.append("]");
        Object largeList = mapper.readValue(sb.toString(), Object.class);
        Assert.assertTrue(largeList instanceof List);
        List<?> listLarge = (List<?>) largeList;
        Assert.assertEquals(50, listLarge.size());
        Assert.assertEquals(49, listLarge.get(49));
    }

    @Test
    public void testVanillaDeserializeArrayToJavaArray() throws Exception {
        ObjectMapper arrayMapper = new ObjectMapper();
        arrayMapper.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);

        Object emptyArr = arrayMapper.readValue("[]", Object.class);
        Assert.assertTrue(emptyArr instanceof Object[]);
        Assert.assertEquals(0, ((Object[]) emptyArr).length);

        Object oneElem = arrayMapper.readValue("[\"single\"]", Object.class);
        Assert.assertTrue(oneElem instanceof Object[]);
        Object[] arr1 = (Object[]) oneElem;
        Assert.assertEquals(1, arr1.length);
        Assert.assertEquals("single", arr1[0]);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 50; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"elem").append(i).append("\"");
        }
        sb.append("]");
        Object largeArr = arrayMapper.readValue(sb.toString(), Object.class);
        Assert.assertTrue(largeArr instanceof Object[]);
        Object[] arrLarge = (Object[]) largeArr;
        Assert.assertEquals(50, arrLarge.length);
        Assert.assertEquals("elem49", arrLarge[49]);
    }

    @Test
    public void testCustomDeserializerOverrides() throws Exception {
        SimpleModule mod = new SimpleModule();
        mod.addDeserializer(String.class, new StdScalarDeserializer<String>(String.class) {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "CUSTOM:" + p.getText();
            }
        });
        mod.addDeserializer(Number.class, new StdScalarDeserializer<Number>(Number.class) {
            @Override
            public Number deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return 99999;
            }
        });

        ObjectMapper customMapper = new ObjectMapper();
        customMapper.registerModule(mod);

        Object strVal = customMapper.readValue("\"test\"", Object.class);
        Assert.assertEquals("CUSTOM:test", strVal);

        Object numVal = customMapper.readValue("123", Object.class);
        Assert.assertEquals(99999, numVal);

        Object floatVal = customMapper.readValue("12.34", Object.class);
        Assert.assertEquals(99999, floatVal);

        Object objVal = customMapper.readValue("{\"key\":\"value\"}", Object.class);
        Assert.assertTrue(objVal instanceof Map);
        Map<?, ?> map = (Map<?, ?>) objVal;
        Assert.assertEquals("CUSTOM:value", map.get("key"));

        Object listVal = customMapper.readValue("[\"item1\", 2]", Object.class);
        Assert.assertTrue(listVal instanceof List);
        List<?> list = (List<?>) listVal;
        Assert.assertEquals("CUSTOM:item1", list.get(0));
        Assert.assertEquals(99999, list.get(1));
    }

    @Test
    public void testCustomListAndMapDeserializerOverrides() throws Exception {
        SimpleModule mod = new SimpleModule();
        mod.addDeserializer(Map.class, new StdDeserializer<Map<?, ?>>(Map.class) {
            @Override
            public Map<?, ?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                p.skipChildren();
                Map<String, Object> map = new LinkedHashMap<String, Object>();
                map.put("customMap", Boolean.TRUE);
                return map;
            }
        });
        mod.addDeserializer(List.class, new StdDeserializer<List<?>>(List.class) {
            @Override
            public List<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                p.skipChildren();
                List<String> list = new ArrayList<String>();
                list.add("customList");
                return list;
            }
        });

        ObjectMapper customMapper = new ObjectMapper();
        customMapper.registerModule(mod);

        Object mapVal = customMapper.readValue("{\"a\":1}", Object.class);
        Assert.assertTrue(mapVal instanceof Map);
        Assert.assertEquals(Boolean.TRUE, ((Map<?, ?>) mapVal).get("customMap"));

        Object listVal = customMapper.readValue("[1, 2, 3]", Object.class);
        Assert.assertTrue(listVal instanceof List);
        Assert.assertEquals("customList", ((List<?>) listVal).get(0));
    }

    @Test
    public void testNonVanillaDeserializerDirectMethods() throws Exception {
        JavaType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, Object.class);
        JavaType mapType = mapper.getTypeFactory().constructMapType(TreeMap.class, String.class, Object.class);

        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(listType, mapType);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        if (ctxt instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) {
            ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(
                    mapper.getDeserializationConfig(), mapper.getFactory().createParser("{}"), mapper.getInjectableValues());
        }

        deser.resolve(ctxt);
        JsonDeserializer<?> contextual = deser.createContextual(ctxt, null);
        Assert.assertNotNull(contextual);

        // Deserializing with UntypedObjectDeserializer directly
        JsonParser p1 = mapper.getFactory().createParser("{\"k1\":\"v1\", \"k2\":\"v2\", \"k3\":\"v3\"}");
        p1.nextToken();
        Object obj1 = deser.deserialize(p1, ctxt);
        Assert.assertTrue(obj1 instanceof Map);

        JsonParser pEmptyObj = mapper.getFactory().createParser("{}");
        pEmptyObj.nextToken();
        Object emptyObj = deser.deserialize(pEmptyObj, ctxt);
        Assert.assertTrue(emptyObj instanceof Map);

        JsonParser pOneObj = mapper.getFactory().createParser("{\"k1\":\"v1\"}");
        pOneObj.nextToken();
        Object oneObj = deser.deserialize(pOneObj, ctxt);
        Assert.assertTrue(oneObj instanceof Map);

        JsonParser pArr0 = mapper.getFactory().createParser("[]");
        pArr0.nextToken();
        Object arr0 = deser.deserialize(pArr0, ctxt);
        Assert.assertTrue(arr0 instanceof List);

        JsonParser pArr1 = mapper.getFactory().createParser("[1]");
        pArr1.nextToken();
        Object arr1 = deser.deserialize(pArr1, ctxt);
        Assert.assertTrue(arr1 instanceof List);

        JsonParser pArr2 = mapper.getFactory().createParser("[1, 2]");
        pArr2.nextToken();
        Object arr2 = deser.deserialize(pArr2, ctxt);
        Assert.assertTrue(arr2 instanceof List);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 40; i++) {
            if (i > 0) sb.append(",");
            sb.append(i);
        }
        sb.append("]");
        JsonParser pArrLarge = mapper.getFactory().createParser(sb.toString());
        pArrLarge.nextToken();
        Object arrLarge = deser.deserialize(pArrLarge, ctxt);
        Assert.assertTrue(arrLarge instanceof List);

        // Int coercions branch
        DeserializationConfig cfgLong = mapper.getDeserializationConfig().with(DeserializationFeature.USE_LONG_FOR_INTS);
        DeserializationContext ctxtLong = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(
                cfgLong, mapper.getFactory().createParser(""), mapper.getInjectableValues());
        JsonParser pInt = mapper.getFactory().createParser("42");
        pInt.nextToken();
        Object numLong = deser.deserialize(pInt, ctxtLong);
        Assert.assertEquals(42L, numLong);

        // Float / Double / BigDecimal branch
        DeserializationConfig cfgDec = mapper.getDeserializationConfig().with(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        DeserializationContext ctxtDec = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(
                cfgDec, mapper.getFactory().createParser(""), mapper.getInjectableValues());
        JsonParser pFloatDec = mapper.getFactory().createParser("42.5");
        pFloatDec.nextToken();
        Object decVal = deser.deserialize(pFloatDec, ctxtDec);
        Assert.assertEquals(new BigDecimal("42.5"), decVal);

        JsonParser pFloatDbl = mapper.getFactory().createParser("42.5");
        pFloatDbl.nextToken();
        Object dblVal = deser.deserialize(pFloatDbl, ctxt);
        Assert.assertEquals(42.5d, dblVal);

        // Test _withResolved
        JsonDeserializer<?> resolved = deser._withResolved(null, null, null, null);
        Assert.assertNotNull(resolved);
    }

    @Test
    public void testNonVanillaArrayToArray() throws Exception {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(null, null);
        DeserializationConfig cfgArr = mapper.getDeserializationConfig().with(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        DeserializationContext ctxtArr = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(cfgArr, mapper.getFactory().createParser(""), mapper.getInjectableValues());

        JsonParser pEmpty = mapper.getFactory().createParser("[]");
        pEmpty.nextToken();
        Object emptyArr = deser.deserialize(pEmpty, ctxtArr);
        Assert.assertTrue(emptyArr instanceof Object[]);
        Assert.assertEquals(0, ((Object[]) emptyArr).length);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 30; i++) {
            if (i > 0) sb.append(",");
            sb.append(i);
        }
        sb.append("]");
        JsonParser pLarge = mapper.getFactory().createParser(sb.toString());
        pLarge.nextToken();
        Object largeArr = deser.deserialize(pLarge, ctxtArr);
        Assert.assertTrue(largeArr instanceof Object[]);
        Assert.assertEquals(30, ((Object[]) largeArr).length);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        ObjectMapper typedMapper = new ObjectMapper();
        typedMapper.enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);

        Object valInt = typedMapper.readValue("100", Object.class);
        Assert.assertEquals(100, valInt);

        Object valStr = typedMapper.readValue("\"str\"", Object.class);
        Assert.assertEquals("str", valStr);

        Object valBool = typedMapper.readValue("true", Object.class);
        Assert.assertEquals(Boolean.TRUE, valBool);

        Object valFalse = typedMapper.readValue("false", Object.class);
        Assert.assertEquals(Boolean.FALSE, valFalse);

        Object valFloat = typedMapper.readValue("3.14", Object.class);
        Assert.assertEquals(3.14d, valFloat);

        Object valNull = typedMapper.readValue("null", Object.class);
        Assert.assertNull(valNull);

        List<Object> list = new ArrayList<Object>();
        list.add("test");
        String jsonList = typedMapper.writeValueAsString(list);
        Object listResult = typedMapper.readValue(jsonList, Object.class);
        Assert.assertTrue(listResult instanceof List);

        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("k", "v");
        String jsonMap = typedMapper.writeValueAsString(map);
        Object mapResult = typedMapper.readValue(jsonMap, Object.class);
        Assert.assertTrue(mapResult instanceof Map);
    }

    @Test
    public void testDeserializeWithTypeOptions() throws Exception {
        ObjectMapper typedMapper = new ObjectMapper();
        typedMapper.enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
        typedMapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        typedMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);

        Object valBigInt = typedMapper.readValue("12345", Object.class);
        Assert.assertEquals(BigInteger.valueOf(12345), valBigInt);

        Object valBigDec = typedMapper.readValue("123.45", Object.class);
        Assert.assertEquals(new BigDecimal("123.45"), valBigDec);
    }

    @Test
    public void testVanillaDeserializeWithTypeOptionsDirectly() throws Exception {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();

        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT);
        om.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        om.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);

        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) om.getDeserializationContext())
                .createInstance(om.getDeserializationConfig(), om.getFactory().createParser(""), om.getInjectableValues());

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        TypeDeserializer typeDeser = om.getDeserializationConfig().findTypeDeserializer(type);

        JsonParser pInt = om.getFactory().createParser("123");
        pInt.nextToken();
        Object resInt = vanilla.deserializeWithType(pInt, ctxt, typeDeser);
        Assert.assertEquals(BigInteger.valueOf(123), resInt);

        JsonParser pFloat = om.getFactory().createParser("12.5");
        pFloat.nextToken();
        Object resFloat = vanilla.deserializeWithType(pFloat, ctxt, typeDeser);
        Assert.assertEquals(new BigDecimal("12.5"), resFloat);

        JsonParser pStr = om.getFactory().createParser("\"abc\"");
        pStr.nextToken();
        Object resStr = vanilla.deserializeWithType(pStr, ctxt, typeDeser);
        Assert.assertEquals("abc", resStr);

        JsonParser pTrue = om.getFactory().createParser("true");
        pTrue.nextToken();
        Object resTrue = vanilla.deserializeWithType(pTrue, ctxt, typeDeser);
        Assert.assertEquals(Boolean.TRUE, resTrue);

        JsonParser pFalse = om.getFactory().createParser("false");
        pFalse.nextToken();
        Object resFalse = vanilla.deserializeWithType(pFalse, ctxt, typeDeser);
        Assert.assertEquals(Boolean.FALSE, resFalse);

        JsonParser pNull = om.getFactory().createParser("null");
        pNull.nextToken();
        Object resNull = vanilla.deserializeWithType(pNull, ctxt, typeDeser);
        Assert.assertNull(resNull);
    }

    @Test
    public void testNonVanillaDeserializeWithTypeDirectly() throws Exception {
        JavaType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, Object.class);
        JavaType mapType = mapper.getTypeFactory().constructMapType(TreeMap.class, String.class, Object.class);
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(listType, mapType);

        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT);
        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) om.getDeserializationContext())
                .createInstance(om.getDeserializationConfig(), om.getFactory().createParser(""), om.getInjectableValues());

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        TypeDeserializer typeDeser = om.getDeserializationConfig().findTypeDeserializer(type);

        JsonParser pStr = om.getFactory().createParser("\"text\"");
        pStr.nextToken();
        Assert.assertEquals("text", deser.deserializeWithType(pStr, ctxt, typeDeser));

        JsonParser pInt = om.getFactory().createParser("10");
        pInt.nextToken();
        Assert.assertEquals(10, deser.deserializeWithType(pInt, ctxt, typeDeser));

        JsonParser pFloat = om.getFactory().createParser("10.5");
        pFloat.nextToken();
        Assert.assertEquals(10.5d, deser.deserializeWithType(pFloat, ctxt, typeDeser));

        JsonParser pTrue = om.getFactory().createParser("true");
        pTrue.nextToken();
        Assert.assertEquals(Boolean.TRUE, deser.deserializeWithType(pTrue, ctxt, typeDeser));

        JsonParser pFalse = om.getFactory().createParser("false");
        pFalse.nextToken();
        Assert.assertEquals(Boolean.FALSE, deser.deserializeWithType(pFalse, ctxt, typeDeser));

        JsonParser pNull = om.getFactory().createParser("null");
        pNull.nextToken();
        Assert.assertNull(deser.deserializeWithType(pNull, ctxt, typeDeser));
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidTokenThrowsException() throws Exception {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer();
        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), mapper.getFactory().createParser(""), mapper.getInjectableValues());

        JsonParser p = mapper.getFactory().createParser("]");
        p.nextToken(); // END_ARRAY
        deser.deserialize(p, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testVanillaInvalidTokenThrowsException() throws Exception {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), mapper.getFactory().createParser(""), mapper.getInjectableValues());

        JsonParser p = mapper.getFactory().createParser("]");
        p.nextToken(); // END_ARRAY
        vanilla.deserialize(p, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidTokenWithTypeThrowsException() throws Exception {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer();
        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT);
        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) om.getDeserializationContext())
                .createInstance(om.getDeserializationConfig(), om.getFactory().createParser(""), om.getInjectableValues());

        TypeDeserializer typeDeser = om.getDeserializationConfig().findTypeDeserializer(TypeFactory.defaultInstance().constructType(Object.class));
        JsonParser p = mapper.getFactory().createParser("]");
        p.nextToken();
        deser.deserializeWithType(p, ctxt, typeDeser);
    }

    @Test(expected = JsonMappingException.class)
    public void testVanillaInvalidTokenWithTypeThrowsException() throws Exception {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT);
        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) om.getDeserializationContext())
                .createInstance(om.getDeserializationConfig(), om.getFactory().createParser(""), om.getInjectableValues());

        TypeDeserializer typeDeser = om.getDeserializationConfig().findTypeDeserializer(TypeFactory.defaultInstance().constructType(Object.class));
        JsonParser p = mapper.getFactory().createParser("]");
        p.nextToken();
        vanilla.deserializeWithType(p, ctxt, typeDeser);
    }
}
