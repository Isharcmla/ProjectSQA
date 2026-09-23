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

public class TokenBuffer_init_2115099637154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20116;
     Object term20264;
     Object term20940;
     Object term20944;
     Object term20945;

    public TokenBuffer_init_2115099637154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19798 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term19890 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term20006 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term19798, term19798.getClass(), "_hasNativeId", false);
        setField(term19798, term19798.getClass(), "_objectCodec", term19890);
        setIntField(term19798, term19798.getClass(), "_generatorFeatures", 0);
        setField(term19798, term19798.getClass(), "_writeContext", null);
        setField(term19798, term19798.getClass(), "_last", null);
        setField(term19798, term19798.getClass(), "_first", term20006);
        setIntField(term19798, term19798.getClass(), "_appendAt", 0);
        setBooleanField(term19798, term19798.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term19798, term19798.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term19798, term19798.getClass(), "_mayHaveNativeIds", false);
        term20116 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term20116, term20116.getClass(), "_objectCodec", null);
        term20264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term20940 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term20941 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term20942 = (Object[]) newArray("java.lang.Object", 16);
        Object term20943 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term20940, term20940.getClass(), "_objectCodec", null);
        setIntField(term20940, term20940.getClass(), "_generatorFeatures", 31);
        setBooleanField(term20940, term20940.getClass(), "_closed", false);
        setBooleanField(term20940, term20940.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term20940, term20940.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term20940, term20940.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term20940, term20940.getClass(), "_forceBigDecimal", false);
        setField(term20941, term20941.getClass(), "_next", null);
        setLongField(term20941, term20941.getClass(), "_tokenTypes", 0L);
        setField(term20941, term20941.getClass(), "_tokens", term20942);
        setField(term20941, term20941.getClass(), "_nativeIds", null);
        setField(term20940, term20940.getClass(), "_first", term20941);
        setField(term20940, term20940.getClass(), "_last", term20941);
        setIntField(term20940, term20940.getClass(), "_appendAt", 0);
        setField(term20940, term20940.getClass(), "_typeId", null);
        setField(term20940, term20940.getClass(), "_objectId", null);
        setBooleanField(term20940, term20940.getClass(), "_hasNativeId", false);
        setField(term20943, term20943.getClass(), "_parent", null);
        setField(term20943, term20943.getClass(), "_dups", null);
        setField(term20943, term20943.getClass(), "_child", null);
        setField(term20943, term20943.getClass(), "_currentName", null);
        setField(term20943, term20943.getClass(), "_currentValue", null);
        setBooleanField(term20943, term20943.getClass(), "_gotName", false);
        setIntField(term20943, term20943.getClass(), "_type", 0);
        setIntField(term20943, term20943.getClass(), "_index", -1);
        setField(term20940, term20940.getClass(), "_writeContext", term20943);
        setField(term20940, term20940.getClass(), "_cfgPrettyPrinter", null);
        term20944 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term20944, term20944.getClass(), "_objectCodec", null);
        setField(term20944, term20944.getClass(), "_symbols", null);
        setField(term20944, term20944.getClass(), "_quadBuffer", null);
        setBooleanField(term20944, term20944.getClass(), "_tokenIncomplete", false);
        setIntField(term20944, term20944.getClass(), "_quad1", 0);
        setField(term20944, term20944.getClass(), "_inputStream", null);
        setField(term20944, term20944.getClass(), "_inputBuffer", null);
        setBooleanField(term20944, term20944.getClass(), "_bufferRecyclable", false);
        setField(term20944, term20944.getClass(), "_ioContext", null);
        setBooleanField(term20944, term20944.getClass(), "_closed", false);
        setIntField(term20944, term20944.getClass(), "_inputPtr", 0);
        setIntField(term20944, term20944.getClass(), "_inputEnd", 0);
        setLongField(term20944, term20944.getClass(), "_currInputProcessed", 0L);
        setIntField(term20944, term20944.getClass(), "_currInputRow", 0);
        setIntField(term20944, term20944.getClass(), "_currInputRowStart", 0);
        setLongField(term20944, term20944.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20944, term20944.getClass(), "_tokenInputRow", 0);
        setIntField(term20944, term20944.getClass(), "_tokenInputCol", 0);
        setField(term20944, term20944.getClass(), "_parsingContext", null);
        setField(term20944, term20944.getClass(), "_nextToken", null);
        setField(term20944, term20944.getClass(), "_textBuffer", null);
        setField(term20944, term20944.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20944, term20944.getClass(), "_nameCopied", false);
        setField(term20944, term20944.getClass(), "_byteArrayBuilder", null);
        setField(term20944, term20944.getClass(), "_binaryValue", null);
        setIntField(term20944, term20944.getClass(), "_numTypesValid", 0);
        setIntField(term20944, term20944.getClass(), "_numberInt", 0);
        setLongField(term20944, term20944.getClass(), "_numberLong", 0L);
        setDoubleField(term20944, term20944.getClass(), "_numberDouble", 0.0);
        setField(term20944, term20944.getClass(), "_numberBigInt", null);
        setField(term20944, term20944.getClass(), "_numberBigDecimal", null);
        setBooleanField(term20944, term20944.getClass(), "_numberNegative", false);
        setIntField(term20944, term20944.getClass(), "_intLength", 0);
        setIntField(term20944, term20944.getClass(), "_fractLength", 0);
        setIntField(term20944, term20944.getClass(), "_expLength", 0);
        setField(term20944, term20944.getClass(), "_currToken", null);
        setField(term20944, term20944.getClass(), "_lastClearedToken", null);
        setIntField(term20944, term20944.getClass(), "_features", 0);
        term20945 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term20945, term20945.getClass(), "_objectIds", null);
        setField(term20945, term20945.getClass(), "_objectIdResolvers", null);
        setField(term20945, term20945.getClass(), "_cache", null);
        setField(term20945, term20945.getClass(), "_factory", null);
        setField(term20945, term20945.getClass(), "_config", null);
        setIntField(term20945, term20945.getClass(), "_featureFlags", 0);
        setField(term20945, term20945.getClass(), "_view", null);
        setField(term20945, term20945.getClass(), "_parser", null);
        setField(term20945, term20945.getClass(), "_injectableValues", null);
        setField(term20945, term20945.getClass(), "_arrayBuilders", null);
        setField(term20945, term20945.getClass(), "_objectBuffer", null);
        setField(term20945, term20945.getClass(), "_dateFormat", null);
        setField(term20945, term20945.getClass(), "_attributes", null);
        setField(term20945, term20945.getClass(), "_currentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term20116;
        args[1] = term20264;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20940));
        assertTrue(recursiveEquals(term20116, term20944));
        assertTrue(recursiveEquals(term20264, term20945));
    }

};


