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

public class TokenBuffer_init_1753724878195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41388;
     Object term42109;
     Object term42114;

    public TokenBuffer_init_1753724878195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40856 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term40948 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41050 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term41166 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term41282 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term40856, term40856.getClass(), "_hasNativeId", false);
        setField(term40856, term40856.getClass(), "_objectCodec", term40948);
        setIntField(term40856, term40856.getClass(), "_generatorFeatures", 0);
        setField(term40856, term40856.getClass(), "_writeContext", term41050);
        setField(term40856, term40856.getClass(), "_last", term41166);
        setField(term40856, term40856.getClass(), "_first", term41282);
        setIntField(term40856, term40856.getClass(), "_appendAt", 0);
        term41388 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term41494 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term41600 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term41710 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term41802 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term41710, term41710.getClass(), "_objectCodec", term41802);
        setField(term41600, term41600.getClass(), "delegate", term41710);
        setField(term41494, term41494.getClass(), "delegate", term41600);
        setField(term41388, term41388.getClass(), "delegate", term41494);
        term42109 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term42110 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term42111 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term42112 = (Object[]) newArray("java.lang.Object", 16);
        Object term42113 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term42110, term42110.getClass(), "_jsonFactory", null);
        setField(term42110, term42110.getClass(), "_typeFactory", null);
        setField(term42110, term42110.getClass(), "_injectableValues", null);
        setField(term42110, term42110.getClass(), "_subtypeResolver", null);
        setField(term42110, term42110.getClass(), "_rootNames", null);
        setField(term42110, term42110.getClass(), "_mixInAnnotations", null);
        setField(term42110, term42110.getClass(), "_serializationConfig", null);
        setField(term42110, term42110.getClass(), "_serializerProvider", null);
        setField(term42110, term42110.getClass(), "_serializerFactory", null);
        setField(term42110, term42110.getClass(), "_deserializationConfig", null);
        setField(term42110, term42110.getClass(), "_deserializationContext", null);
        setField(term42110, term42110.getClass(), "_rootDeserializers", null);
        setField(term42109, term42109.getClass(), "_objectCodec", term42110);
        setIntField(term42109, term42109.getClass(), "_generatorFeatures", 79);
        setBooleanField(term42109, term42109.getClass(), "_closed", false);
        setBooleanField(term42109, term42109.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term42109, term42109.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term42109, term42109.getClass(), "_mayHaveNativeIds", false);
        setField(term42111, term42111.getClass(), "_next", null);
        setLongField(term42111, term42111.getClass(), "_tokenTypes", 0L);
        setField(term42111, term42111.getClass(), "_tokens", term42112);
        setField(term42111, term42111.getClass(), "_nativeIds", null);
        setField(term42109, term42109.getClass(), "_first", term42111);
        setField(term42109, term42109.getClass(), "_last", term42111);
        setIntField(term42109, term42109.getClass(), "_appendAt", 0);
        setField(term42109, term42109.getClass(), "_typeId", null);
        setField(term42109, term42109.getClass(), "_objectId", null);
        setBooleanField(term42109, term42109.getClass(), "_hasNativeId", false);
        setField(term42113, term42113.getClass(), "_parent", null);
        setField(term42113, term42113.getClass(), "_dups", null);
        setField(term42113, term42113.getClass(), "_child", null);
        setField(term42113, term42113.getClass(), "_currentName", null);
        setBooleanField(term42113, term42113.getClass(), "_gotName", false);
        setIntField(term42113, term42113.getClass(), "_type", 0);
        setIntField(term42113, term42113.getClass(), "_index", -1);
        setField(term42109, term42109.getClass(), "_writeContext", term42113);
        setField(term42109, term42109.getClass(), "_cfgPrettyPrinter", null);
        term42114 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term42115 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term42116 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term42117 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term42118 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term42114, term42114.getClass(), "_parsers", null);
        setIntField(term42114, term42114.getClass(), "_nextParser", 0);
        setField(term42115, term42115.getClass(), "_parsers", null);
        setIntField(term42115, term42115.getClass(), "_nextParser", 0);
        setField(term42116, term42116.getClass(), "_parsers", null);
        setIntField(term42116, term42116.getClass(), "_nextParser", 0);
        setField(term42118, term42118.getClass(), "_jsonFactory", null);
        setField(term42118, term42118.getClass(), "_typeFactory", null);
        setField(term42118, term42118.getClass(), "_injectableValues", null);
        setField(term42118, term42118.getClass(), "_subtypeResolver", null);
        setField(term42118, term42118.getClass(), "_rootNames", null);
        setField(term42118, term42118.getClass(), "_mixInAnnotations", null);
        setField(term42118, term42118.getClass(), "_serializationConfig", null);
        setField(term42118, term42118.getClass(), "_serializerProvider", null);
        setField(term42118, term42118.getClass(), "_serializerFactory", null);
        setField(term42118, term42118.getClass(), "_deserializationConfig", null);
        setField(term42118, term42118.getClass(), "_deserializationContext", null);
        setField(term42118, term42118.getClass(), "_rootDeserializers", null);
        setField(term42117, term42117.getClass(), "_objectCodec", term42118);
        setField(term42117, term42117.getClass(), "_symbols", null);
        setField(term42117, term42117.getClass(), "_quadBuffer", null);
        setBooleanField(term42117, term42117.getClass(), "_tokenIncomplete", false);
        setIntField(term42117, term42117.getClass(), "_quad1", 0);
        setField(term42117, term42117.getClass(), "_inputStream", null);
        setField(term42117, term42117.getClass(), "_inputBuffer", null);
        setBooleanField(term42117, term42117.getClass(), "_bufferRecyclable", false);
        setField(term42117, term42117.getClass(), "_ioContext", null);
        setBooleanField(term42117, term42117.getClass(), "_closed", false);
        setIntField(term42117, term42117.getClass(), "_inputPtr", 0);
        setIntField(term42117, term42117.getClass(), "_inputEnd", 0);
        setLongField(term42117, term42117.getClass(), "_currInputProcessed", 0L);
        setIntField(term42117, term42117.getClass(), "_currInputRow", 0);
        setIntField(term42117, term42117.getClass(), "_currInputRowStart", 0);
        setLongField(term42117, term42117.getClass(), "_tokenInputTotal", 0L);
        setIntField(term42117, term42117.getClass(), "_tokenInputRow", 0);
        setIntField(term42117, term42117.getClass(), "_tokenInputCol", 0);
        setField(term42117, term42117.getClass(), "_parsingContext", null);
        setField(term42117, term42117.getClass(), "_nextToken", null);
        setField(term42117, term42117.getClass(), "_textBuffer", null);
        setField(term42117, term42117.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term42117, term42117.getClass(), "_nameCopied", false);
        setField(term42117, term42117.getClass(), "_byteArrayBuilder", null);
        setField(term42117, term42117.getClass(), "_binaryValue", null);
        setIntField(term42117, term42117.getClass(), "_numTypesValid", 0);
        setIntField(term42117, term42117.getClass(), "_numberInt", 0);
        setLongField(term42117, term42117.getClass(), "_numberLong", 0L);
        setDoubleField(term42117, term42117.getClass(), "_numberDouble", 0.0);
        setField(term42117, term42117.getClass(), "_numberBigInt", null);
        setField(term42117, term42117.getClass(), "_numberBigDecimal", null);
        setBooleanField(term42117, term42117.getClass(), "_numberNegative", false);
        setIntField(term42117, term42117.getClass(), "_intLength", 0);
        setIntField(term42117, term42117.getClass(), "_fractLength", 0);
        setIntField(term42117, term42117.getClass(), "_expLength", 0);
        setField(term42117, term42117.getClass(), "_currToken", null);
        setField(term42117, term42117.getClass(), "_lastClearedToken", null);
        setIntField(term42117, term42117.getClass(), "_features", 0);
        setField(term42116, term42116.getClass(), "delegate", term42117);
        setIntField(term42116, term42116.getClass(), "_features", 0);
        setField(term42115, term42115.getClass(), "delegate", term42116);
        setIntField(term42115, term42115.getClass(), "_features", 0);
        setField(term42114, term42114.getClass(), "delegate", term42115);
        setIntField(term42114, term42114.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term41388;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42109));
        assertTrue(recursiveEquals(term41388, term42114));
    }

};


