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

public class TokenBuffer_init_1753724878152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19985;
     Object term20250;
     Object term20254;

    public TokenBuffer_init_1753724878152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19873 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term19873, term19873.getClass(), "_hasNativeId", false);
        term19985 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term20250 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term20251 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term20252 = (Object[]) newArray("java.lang.Object", 16);
        Object term20253 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term20250, term20250.getClass(), "_objectCodec", null);
        setIntField(term20250, term20250.getClass(), "_generatorFeatures", 31);
        setBooleanField(term20250, term20250.getClass(), "_closed", false);
        setBooleanField(term20250, term20250.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term20250, term20250.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term20250, term20250.getClass(), "_mayHaveNativeIds", false);
        setField(term20251, term20251.getClass(), "_next", null);
        setLongField(term20251, term20251.getClass(), "_tokenTypes", 0L);
        setField(term20251, term20251.getClass(), "_tokens", term20252);
        setField(term20251, term20251.getClass(), "_nativeIds", null);
        setField(term20250, term20250.getClass(), "_first", term20251);
        setField(term20250, term20250.getClass(), "_last", term20251);
        setIntField(term20250, term20250.getClass(), "_appendAt", 0);
        setField(term20250, term20250.getClass(), "_typeId", null);
        setField(term20250, term20250.getClass(), "_objectId", null);
        setBooleanField(term20250, term20250.getClass(), "_hasNativeId", false);
        setField(term20253, term20253.getClass(), "_parent", null);
        setField(term20253, term20253.getClass(), "_dups", null);
        setField(term20253, term20253.getClass(), "_child", null);
        setField(term20253, term20253.getClass(), "_currentName", null);
        setField(term20253, term20253.getClass(), "_currentValue", null);
        setBooleanField(term20253, term20253.getClass(), "_gotName", false);
        setIntField(term20253, term20253.getClass(), "_type", 0);
        setIntField(term20253, term20253.getClass(), "_index", -1);
        setField(term20250, term20250.getClass(), "_writeContext", term20253);
        setField(term20250, term20250.getClass(), "_cfgPrettyPrinter", null);
        term20254 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term20254, term20254.getClass(), "_reader", null);
        setField(term20254, term20254.getClass(), "_inputBuffer", null);
        setBooleanField(term20254, term20254.getClass(), "_bufferRecyclable", false);
        setField(term20254, term20254.getClass(), "_objectCodec", null);
        setField(term20254, term20254.getClass(), "_symbols", null);
        setIntField(term20254, term20254.getClass(), "_hashSeed", 0);
        setBooleanField(term20254, term20254.getClass(), "_tokenIncomplete", false);
        setField(term20254, term20254.getClass(), "_ioContext", null);
        setBooleanField(term20254, term20254.getClass(), "_closed", false);
        setIntField(term20254, term20254.getClass(), "_inputPtr", 0);
        setIntField(term20254, term20254.getClass(), "_inputEnd", 0);
        setLongField(term20254, term20254.getClass(), "_currInputProcessed", 0L);
        setIntField(term20254, term20254.getClass(), "_currInputRow", 0);
        setIntField(term20254, term20254.getClass(), "_currInputRowStart", 0);
        setLongField(term20254, term20254.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20254, term20254.getClass(), "_tokenInputRow", 0);
        setIntField(term20254, term20254.getClass(), "_tokenInputCol", 0);
        setField(term20254, term20254.getClass(), "_parsingContext", null);
        setField(term20254, term20254.getClass(), "_nextToken", null);
        setField(term20254, term20254.getClass(), "_textBuffer", null);
        setField(term20254, term20254.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20254, term20254.getClass(), "_nameCopied", false);
        setField(term20254, term20254.getClass(), "_byteArrayBuilder", null);
        setField(term20254, term20254.getClass(), "_binaryValue", null);
        setIntField(term20254, term20254.getClass(), "_numTypesValid", 0);
        setIntField(term20254, term20254.getClass(), "_numberInt", 0);
        setLongField(term20254, term20254.getClass(), "_numberLong", 0L);
        setDoubleField(term20254, term20254.getClass(), "_numberDouble", 0.0);
        setField(term20254, term20254.getClass(), "_numberBigInt", null);
        setField(term20254, term20254.getClass(), "_numberBigDecimal", null);
        setBooleanField(term20254, term20254.getClass(), "_numberNegative", false);
        setIntField(term20254, term20254.getClass(), "_intLength", 0);
        setIntField(term20254, term20254.getClass(), "_fractLength", 0);
        setIntField(term20254, term20254.getClass(), "_expLength", 0);
        setField(term20254, term20254.getClass(), "_currToken", null);
        setField(term20254, term20254.getClass(), "_lastClearedToken", null);
        setIntField(term20254, term20254.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term19985;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20250));
        assertTrue(recursiveEquals(term19985, term20254));
    }

};


