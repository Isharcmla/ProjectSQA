package com.fasterxml.jackson.databind.util;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;
import java.lang.Object;

public class TokenBuffer_init_1753724878191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38546;
     Object term39269;
     Object term39274;

    public TokenBuffer_init_1753724878191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38014 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term38106 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term38208 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term38324 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term38440 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term38014, term38014.getClass(), "_hasNativeId", false);
        setField(term38014, term38014.getClass(), "_objectCodec", term38106);
        setIntField(term38014, term38014.getClass(), "_generatorFeatures", 0);
        setField(term38014, term38014.getClass(), "_writeContext", term38208);
        setField(term38014, term38014.getClass(), "_last", term38324);
        setField(term38014, term38014.getClass(), "_first", term38440);
        setIntField(term38014, term38014.getClass(), "_appendAt", 0);
        term38546 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term38652 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term38758 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term38870 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term38962 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term38870, term38870.getClass(), "_objectCodec", term38962);
        setField(term38758, term38758.getClass(), "delegate", term38870);
        setField(term38652, term38652.getClass(), "delegate", term38758);
        setField(term38546, term38546.getClass(), "delegate", term38652);
        term39269 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term39270 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term39271 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term39272 = (Object[]) newArray("java.lang.Object", 16);
        Object term39273 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term39270, term39270.getClass(), "_jsonFactory", null);
        setField(term39270, term39270.getClass(), "_typeFactory", null);
        setField(term39270, term39270.getClass(), "_injectableValues", null);
        setField(term39270, term39270.getClass(), "_subtypeResolver", null);
        setField(term39270, term39270.getClass(), "_rootNames", null);
        setField(term39270, term39270.getClass(), "_mixInAnnotations", null);
        setField(term39270, term39270.getClass(), "_serializationConfig", null);
        setField(term39270, term39270.getClass(), "_serializerProvider", null);
        setField(term39270, term39270.getClass(), "_serializerFactory", null);
        setField(term39270, term39270.getClass(), "_deserializationConfig", null);
        setField(term39270, term39270.getClass(), "_deserializationContext", null);
        setField(term39270, term39270.getClass(), "_rootDeserializers", null);
        setField(term39269, term39269.getClass(), "_objectCodec", term39270);
        setIntField(term39269, term39269.getClass(), "_generatorFeatures", 79);
        setBooleanField(term39269, term39269.getClass(), "_closed", false);
        setBooleanField(term39269, term39269.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term39269, term39269.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term39269, term39269.getClass(), "_mayHaveNativeIds", false);
        setField(term39271, term39271.getClass(), "_next", null);
        setLongField(term39271, term39271.getClass(), "_tokenTypes", 0L);
        setField(term39271, term39271.getClass(), "_tokens", term39272);
        setField(term39271, term39271.getClass(), "_nativeIds", null);
        setField(term39269, term39269.getClass(), "_first", term39271);
        setField(term39269, term39269.getClass(), "_last", term39271);
        setIntField(term39269, term39269.getClass(), "_appendAt", 0);
        setField(term39269, term39269.getClass(), "_typeId", null);
        setField(term39269, term39269.getClass(), "_objectId", null);
        setBooleanField(term39269, term39269.getClass(), "_hasNativeId", false);
        setField(term39273, term39273.getClass(), "_parent", null);
        setField(term39273, term39273.getClass(), "_dups", null);
        setField(term39273, term39273.getClass(), "_child", null);
        setField(term39273, term39273.getClass(), "_currentName", null);
        setBooleanField(term39273, term39273.getClass(), "_gotName", false);
        setIntField(term39273, term39273.getClass(), "_type", 0);
        setIntField(term39273, term39273.getClass(), "_index", -1);
        setField(term39269, term39269.getClass(), "_writeContext", term39273);
        setField(term39269, term39269.getClass(), "_cfgPrettyPrinter", null);
        term39274 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term39275 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term39276 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term39277 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term39278 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term39274, term39274.getClass(), "_parsers", null);
        setIntField(term39274, term39274.getClass(), "_nextParser", 0);
        setField(term39275, term39275.getClass(), "_parsers", null);
        setIntField(term39275, term39275.getClass(), "_nextParser", 0);
        setField(term39276, term39276.getClass(), "_parsers", null);
        setIntField(term39276, term39276.getClass(), "_nextParser", 0);
        setField(term39277, term39277.getClass(), "_reader", null);
        setField(term39277, term39277.getClass(), "_inputBuffer", null);
        setBooleanField(term39277, term39277.getClass(), "_bufferRecyclable", false);
        setField(term39278, term39278.getClass(), "_jsonFactory", null);
        setField(term39278, term39278.getClass(), "_typeFactory", null);
        setField(term39278, term39278.getClass(), "_injectableValues", null);
        setField(term39278, term39278.getClass(), "_subtypeResolver", null);
        setField(term39278, term39278.getClass(), "_rootNames", null);
        setField(term39278, term39278.getClass(), "_mixInAnnotations", null);
        setField(term39278, term39278.getClass(), "_serializationConfig", null);
        setField(term39278, term39278.getClass(), "_serializerProvider", null);
        setField(term39278, term39278.getClass(), "_serializerFactory", null);
        setField(term39278, term39278.getClass(), "_deserializationConfig", null);
        setField(term39278, term39278.getClass(), "_deserializationContext", null);
        setField(term39278, term39278.getClass(), "_rootDeserializers", null);
        setField(term39277, term39277.getClass(), "_objectCodec", term39278);
        setField(term39277, term39277.getClass(), "_symbols", null);
        setIntField(term39277, term39277.getClass(), "_hashSeed", 0);
        setBooleanField(term39277, term39277.getClass(), "_tokenIncomplete", false);
        setField(term39277, term39277.getClass(), "_ioContext", null);
        setBooleanField(term39277, term39277.getClass(), "_closed", false);
        setIntField(term39277, term39277.getClass(), "_inputPtr", 0);
        setIntField(term39277, term39277.getClass(), "_inputEnd", 0);
        setLongField(term39277, term39277.getClass(), "_currInputProcessed", 0L);
        setIntField(term39277, term39277.getClass(), "_currInputRow", 0);
        setIntField(term39277, term39277.getClass(), "_currInputRowStart", 0);
        setLongField(term39277, term39277.getClass(), "_tokenInputTotal", 0L);
        setIntField(term39277, term39277.getClass(), "_tokenInputRow", 0);
        setIntField(term39277, term39277.getClass(), "_tokenInputCol", 0);
        setField(term39277, term39277.getClass(), "_parsingContext", null);
        setField(term39277, term39277.getClass(), "_nextToken", null);
        setField(term39277, term39277.getClass(), "_textBuffer", null);
        setField(term39277, term39277.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term39277, term39277.getClass(), "_nameCopied", false);
        setField(term39277, term39277.getClass(), "_byteArrayBuilder", null);
        setField(term39277, term39277.getClass(), "_binaryValue", null);
        setIntField(term39277, term39277.getClass(), "_numTypesValid", 0);
        setIntField(term39277, term39277.getClass(), "_numberInt", 0);
        setLongField(term39277, term39277.getClass(), "_numberLong", 0L);
        setDoubleField(term39277, term39277.getClass(), "_numberDouble", 0.0);
        setField(term39277, term39277.getClass(), "_numberBigInt", null);
        setField(term39277, term39277.getClass(), "_numberBigDecimal", null);
        setBooleanField(term39277, term39277.getClass(), "_numberNegative", false);
        setIntField(term39277, term39277.getClass(), "_intLength", 0);
        setIntField(term39277, term39277.getClass(), "_fractLength", 0);
        setIntField(term39277, term39277.getClass(), "_expLength", 0);
        setField(term39277, term39277.getClass(), "_currToken", null);
        setField(term39277, term39277.getClass(), "_lastClearedToken", null);
        setIntField(term39277, term39277.getClass(), "_features", 0);
        setField(term39276, term39276.getClass(), "delegate", term39277);
        setIntField(term39276, term39276.getClass(), "_features", 0);
        setField(term39275, term39275.getClass(), "delegate", term39276);
        setIntField(term39275, term39275.getClass(), "_features", 0);
        setField(term39274, term39274.getClass(), "delegate", term39275);
        setIntField(term39274, term39274.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term38546;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39269));
        assertTrue(recursiveEquals(term38546, term39274));
    }

};


