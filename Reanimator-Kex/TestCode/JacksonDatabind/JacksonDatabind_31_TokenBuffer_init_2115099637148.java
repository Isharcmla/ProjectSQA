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

public class TokenBuffer_init_2115099637148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18429;
     Object term19062;
     Object term19066;

    public TokenBuffer_init_2115099637148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18319 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term18319, term18319.getClass(), "_hasNativeId", false);
        term18429 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term19062 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term19063 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term19064 = (Object[]) newArray("java.lang.Object", 16);
        Object term19065 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term19062, term19062.getClass(), "_objectCodec", null);
        setIntField(term19062, term19062.getClass(), "_generatorFeatures", 31);
        setBooleanField(term19062, term19062.getClass(), "_closed", false);
        setBooleanField(term19062, term19062.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term19062, term19062.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term19062, term19062.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term19062, term19062.getClass(), "_forceBigDecimal", false);
        setField(term19063, term19063.getClass(), "_next", null);
        setLongField(term19063, term19063.getClass(), "_tokenTypes", 0L);
        setField(term19063, term19063.getClass(), "_tokens", term19064);
        setField(term19063, term19063.getClass(), "_nativeIds", null);
        setField(term19062, term19062.getClass(), "_first", term19063);
        setField(term19062, term19062.getClass(), "_last", term19063);
        setIntField(term19062, term19062.getClass(), "_appendAt", 0);
        setField(term19062, term19062.getClass(), "_typeId", null);
        setField(term19062, term19062.getClass(), "_objectId", null);
        setBooleanField(term19062, term19062.getClass(), "_hasNativeId", false);
        setField(term19065, term19065.getClass(), "_parent", null);
        setField(term19065, term19065.getClass(), "_dups", null);
        setField(term19065, term19065.getClass(), "_child", null);
        setField(term19065, term19065.getClass(), "_currentName", null);
        setField(term19065, term19065.getClass(), "_currentValue", null);
        setBooleanField(term19065, term19065.getClass(), "_gotName", false);
        setIntField(term19065, term19065.getClass(), "_type", 0);
        setIntField(term19065, term19065.getClass(), "_index", -1);
        setField(term19062, term19062.getClass(), "_writeContext", term19065);
        setField(term19062, term19062.getClass(), "_cfgPrettyPrinter", null);
        term19066 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term19066, term19066.getClass(), "_objectCodec", null);
        setField(term19066, term19066.getClass(), "_symbols", null);
        setField(term19066, term19066.getClass(), "_quadBuffer", null);
        setBooleanField(term19066, term19066.getClass(), "_tokenIncomplete", false);
        setIntField(term19066, term19066.getClass(), "_quad1", 0);
        setField(term19066, term19066.getClass(), "_inputStream", null);
        setField(term19066, term19066.getClass(), "_inputBuffer", null);
        setBooleanField(term19066, term19066.getClass(), "_bufferRecyclable", false);
        setField(term19066, term19066.getClass(), "_ioContext", null);
        setBooleanField(term19066, term19066.getClass(), "_closed", false);
        setIntField(term19066, term19066.getClass(), "_inputPtr", 0);
        setIntField(term19066, term19066.getClass(), "_inputEnd", 0);
        setLongField(term19066, term19066.getClass(), "_currInputProcessed", 0L);
        setIntField(term19066, term19066.getClass(), "_currInputRow", 0);
        setIntField(term19066, term19066.getClass(), "_currInputRowStart", 0);
        setLongField(term19066, term19066.getClass(), "_tokenInputTotal", 0L);
        setIntField(term19066, term19066.getClass(), "_tokenInputRow", 0);
        setIntField(term19066, term19066.getClass(), "_tokenInputCol", 0);
        setField(term19066, term19066.getClass(), "_parsingContext", null);
        setField(term19066, term19066.getClass(), "_nextToken", null);
        setField(term19066, term19066.getClass(), "_textBuffer", null);
        setField(term19066, term19066.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term19066, term19066.getClass(), "_nameCopied", false);
        setField(term19066, term19066.getClass(), "_byteArrayBuilder", null);
        setField(term19066, term19066.getClass(), "_binaryValue", null);
        setIntField(term19066, term19066.getClass(), "_numTypesValid", 0);
        setIntField(term19066, term19066.getClass(), "_numberInt", 0);
        setLongField(term19066, term19066.getClass(), "_numberLong", 0L);
        setDoubleField(term19066, term19066.getClass(), "_numberDouble", 0.0);
        setField(term19066, term19066.getClass(), "_numberBigInt", null);
        setField(term19066, term19066.getClass(), "_numberBigDecimal", null);
        setBooleanField(term19066, term19066.getClass(), "_numberNegative", false);
        setIntField(term19066, term19066.getClass(), "_intLength", 0);
        setIntField(term19066, term19066.getClass(), "_fractLength", 0);
        setIntField(term19066, term19066.getClass(), "_expLength", 0);
        setField(term19066, term19066.getClass(), "_currToken", null);
        setField(term19066, term19066.getClass(), "_lastClearedToken", null);
        setIntField(term19066, term19066.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term18429;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19062));
        assertTrue(recursiveEquals(term18429, term19066));
    }

};


