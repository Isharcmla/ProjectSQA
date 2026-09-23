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

public class TokenBuffer_init_1753724878165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23447;
     Object term23496;
     Object term23500;

    public TokenBuffer_init_1753724878165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23337 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term23337, term23337.getClass(), "_hasNativeId", false);
        term23447 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term23496 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term23497 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term23498 = (Object[]) newArray("java.lang.Object", 16);
        Object term23499 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term23496, term23496.getClass(), "_objectCodec", null);
        setIntField(term23496, term23496.getClass(), "_generatorFeatures", 31);
        setBooleanField(term23496, term23496.getClass(), "_closed", false);
        setBooleanField(term23496, term23496.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term23496, term23496.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term23496, term23496.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term23496, term23496.getClass(), "_forceBigDecimal", false);
        setField(term23497, term23497.getClass(), "_next", null);
        setLongField(term23497, term23497.getClass(), "_tokenTypes", 0L);
        setField(term23497, term23497.getClass(), "_tokens", term23498);
        setField(term23497, term23497.getClass(), "_nativeIds", null);
        setField(term23496, term23496.getClass(), "_first", term23497);
        setField(term23496, term23496.getClass(), "_last", term23497);
        setIntField(term23496, term23496.getClass(), "_appendAt", 0);
        setField(term23496, term23496.getClass(), "_typeId", null);
        setField(term23496, term23496.getClass(), "_objectId", null);
        setBooleanField(term23496, term23496.getClass(), "_hasNativeId", false);
        setField(term23499, term23499.getClass(), "_parent", null);
        setField(term23499, term23499.getClass(), "_dups", null);
        setField(term23499, term23499.getClass(), "_child", null);
        setField(term23499, term23499.getClass(), "_currentName", null);
        setField(term23499, term23499.getClass(), "_currentValue", null);
        setBooleanField(term23499, term23499.getClass(), "_gotName", false);
        setIntField(term23499, term23499.getClass(), "_type", 0);
        setIntField(term23499, term23499.getClass(), "_index", -1);
        setField(term23496, term23496.getClass(), "_writeContext", term23499);
        setField(term23496, term23496.getClass(), "_cfgPrettyPrinter", null);
        term23500 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term23500, term23500.getClass(), "_objectCodec", null);
        setField(term23500, term23500.getClass(), "_symbols", null);
        setField(term23500, term23500.getClass(), "_quadBuffer", null);
        setBooleanField(term23500, term23500.getClass(), "_tokenIncomplete", false);
        setIntField(term23500, term23500.getClass(), "_quad1", 0);
        setField(term23500, term23500.getClass(), "_inputStream", null);
        setField(term23500, term23500.getClass(), "_inputBuffer", null);
        setBooleanField(term23500, term23500.getClass(), "_bufferRecyclable", false);
        setField(term23500, term23500.getClass(), "_ioContext", null);
        setBooleanField(term23500, term23500.getClass(), "_closed", false);
        setIntField(term23500, term23500.getClass(), "_inputPtr", 0);
        setIntField(term23500, term23500.getClass(), "_inputEnd", 0);
        setLongField(term23500, term23500.getClass(), "_currInputProcessed", 0L);
        setIntField(term23500, term23500.getClass(), "_currInputRow", 0);
        setIntField(term23500, term23500.getClass(), "_currInputRowStart", 0);
        setLongField(term23500, term23500.getClass(), "_tokenInputTotal", 0L);
        setIntField(term23500, term23500.getClass(), "_tokenInputRow", 0);
        setIntField(term23500, term23500.getClass(), "_tokenInputCol", 0);
        setField(term23500, term23500.getClass(), "_parsingContext", null);
        setField(term23500, term23500.getClass(), "_nextToken", null);
        setField(term23500, term23500.getClass(), "_textBuffer", null);
        setField(term23500, term23500.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term23500, term23500.getClass(), "_nameCopied", false);
        setField(term23500, term23500.getClass(), "_byteArrayBuilder", null);
        setField(term23500, term23500.getClass(), "_binaryValue", null);
        setIntField(term23500, term23500.getClass(), "_numTypesValid", 0);
        setIntField(term23500, term23500.getClass(), "_numberInt", 0);
        setLongField(term23500, term23500.getClass(), "_numberLong", 0L);
        setDoubleField(term23500, term23500.getClass(), "_numberDouble", 0.0);
        setField(term23500, term23500.getClass(), "_numberBigInt", null);
        setField(term23500, term23500.getClass(), "_numberBigDecimal", null);
        setBooleanField(term23500, term23500.getClass(), "_numberNegative", false);
        setIntField(term23500, term23500.getClass(), "_intLength", 0);
        setIntField(term23500, term23500.getClass(), "_fractLength", 0);
        setIntField(term23500, term23500.getClass(), "_expLength", 0);
        setField(term23500, term23500.getClass(), "_currToken", null);
        setField(term23500, term23500.getClass(), "_lastClearedToken", null);
        setIntField(term23500, term23500.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term23447;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23496));
        assertTrue(recursiveEquals(term23447, term23500));
    }

};


