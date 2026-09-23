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

public class TokenBuffer_init_1753724878156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20841;
     Object term21217;
     Object term21221;

    public TokenBuffer_init_1753724878156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20731 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term20731, term20731.getClass(), "_hasNativeId", false);
        term20841 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term21217 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term21218 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term21219 = (Object[]) newArray("java.lang.Object", 16);
        Object term21220 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term21217, term21217.getClass(), "_objectCodec", null);
        setIntField(term21217, term21217.getClass(), "_generatorFeatures", 31);
        setBooleanField(term21217, term21217.getClass(), "_closed", false);
        setBooleanField(term21217, term21217.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term21217, term21217.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term21217, term21217.getClass(), "_mayHaveNativeIds", false);
        setField(term21218, term21218.getClass(), "_next", null);
        setLongField(term21218, term21218.getClass(), "_tokenTypes", 0L);
        setField(term21218, term21218.getClass(), "_tokens", term21219);
        setField(term21218, term21218.getClass(), "_nativeIds", null);
        setField(term21217, term21217.getClass(), "_first", term21218);
        setField(term21217, term21217.getClass(), "_last", term21218);
        setIntField(term21217, term21217.getClass(), "_appendAt", 0);
        setField(term21217, term21217.getClass(), "_typeId", null);
        setField(term21217, term21217.getClass(), "_objectId", null);
        setBooleanField(term21217, term21217.getClass(), "_hasNativeId", false);
        setField(term21220, term21220.getClass(), "_parent", null);
        setField(term21220, term21220.getClass(), "_dups", null);
        setField(term21220, term21220.getClass(), "_child", null);
        setField(term21220, term21220.getClass(), "_currentName", null);
        setField(term21220, term21220.getClass(), "_currentValue", null);
        setBooleanField(term21220, term21220.getClass(), "_gotName", false);
        setIntField(term21220, term21220.getClass(), "_type", 0);
        setIntField(term21220, term21220.getClass(), "_index", -1);
        setField(term21217, term21217.getClass(), "_writeContext", term21220);
        setField(term21217, term21217.getClass(), "_cfgPrettyPrinter", null);
        term21221 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term21221, term21221.getClass(), "_objectCodec", null);
        setField(term21221, term21221.getClass(), "_symbols", null);
        setField(term21221, term21221.getClass(), "_quadBuffer", null);
        setBooleanField(term21221, term21221.getClass(), "_tokenIncomplete", false);
        setIntField(term21221, term21221.getClass(), "_quad1", 0);
        setField(term21221, term21221.getClass(), "_inputStream", null);
        setField(term21221, term21221.getClass(), "_inputBuffer", null);
        setBooleanField(term21221, term21221.getClass(), "_bufferRecyclable", false);
        setField(term21221, term21221.getClass(), "_ioContext", null);
        setBooleanField(term21221, term21221.getClass(), "_closed", false);
        setIntField(term21221, term21221.getClass(), "_inputPtr", 0);
        setIntField(term21221, term21221.getClass(), "_inputEnd", 0);
        setLongField(term21221, term21221.getClass(), "_currInputProcessed", 0L);
        setIntField(term21221, term21221.getClass(), "_currInputRow", 0);
        setIntField(term21221, term21221.getClass(), "_currInputRowStart", 0);
        setLongField(term21221, term21221.getClass(), "_tokenInputTotal", 0L);
        setIntField(term21221, term21221.getClass(), "_tokenInputRow", 0);
        setIntField(term21221, term21221.getClass(), "_tokenInputCol", 0);
        setField(term21221, term21221.getClass(), "_parsingContext", null);
        setField(term21221, term21221.getClass(), "_nextToken", null);
        setField(term21221, term21221.getClass(), "_textBuffer", null);
        setField(term21221, term21221.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term21221, term21221.getClass(), "_nameCopied", false);
        setField(term21221, term21221.getClass(), "_byteArrayBuilder", null);
        setField(term21221, term21221.getClass(), "_binaryValue", null);
        setIntField(term21221, term21221.getClass(), "_numTypesValid", 0);
        setIntField(term21221, term21221.getClass(), "_numberInt", 0);
        setLongField(term21221, term21221.getClass(), "_numberLong", 0L);
        setDoubleField(term21221, term21221.getClass(), "_numberDouble", 0.0);
        setField(term21221, term21221.getClass(), "_numberBigInt", null);
        setField(term21221, term21221.getClass(), "_numberBigDecimal", null);
        setBooleanField(term21221, term21221.getClass(), "_numberNegative", false);
        setIntField(term21221, term21221.getClass(), "_intLength", 0);
        setIntField(term21221, term21221.getClass(), "_fractLength", 0);
        setIntField(term21221, term21221.getClass(), "_expLength", 0);
        setField(term21221, term21221.getClass(), "_currToken", null);
        setField(term21221, term21221.getClass(), "_lastClearedToken", null);
        setIntField(term21221, term21221.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term20841;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21217));
        assertTrue(recursiveEquals(term20841, term21221));
    }

};


