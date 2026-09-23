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
     Object term24976;
     Object term25398;
     Object term25402;

    public TokenBuffer_init_1753724878165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24870 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term24870, term24870.getClass(), "_hasNativeId", false);
        term24976 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25082 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25194 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term25082, term25082.getClass(), "delegate", term25194);
        setField(term24976, term24976.getClass(), "delegate", term25082);
        term25398 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term25399 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term25400 = (Object[]) newArray("java.lang.Object", 16);
        Object term25401 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term25398, term25398.getClass(), "_objectCodec", null);
        setIntField(term25398, term25398.getClass(), "_generatorFeatures", 79);
        setBooleanField(term25398, term25398.getClass(), "_closed", false);
        setBooleanField(term25398, term25398.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term25398, term25398.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term25398, term25398.getClass(), "_mayHaveNativeIds", false);
        setField(term25399, term25399.getClass(), "_next", null);
        setLongField(term25399, term25399.getClass(), "_tokenTypes", 0L);
        setField(term25399, term25399.getClass(), "_tokens", term25400);
        setField(term25399, term25399.getClass(), "_nativeIds", null);
        setField(term25398, term25398.getClass(), "_first", term25399);
        setField(term25398, term25398.getClass(), "_last", term25399);
        setIntField(term25398, term25398.getClass(), "_appendAt", 0);
        setField(term25398, term25398.getClass(), "_typeId", null);
        setField(term25398, term25398.getClass(), "_objectId", null);
        setBooleanField(term25398, term25398.getClass(), "_hasNativeId", false);
        setField(term25401, term25401.getClass(), "_parent", null);
        setField(term25401, term25401.getClass(), "_dups", null);
        setField(term25401, term25401.getClass(), "_child", null);
        setField(term25401, term25401.getClass(), "_currentName", null);
        setBooleanField(term25401, term25401.getClass(), "_gotName", false);
        setIntField(term25401, term25401.getClass(), "_type", 0);
        setIntField(term25401, term25401.getClass(), "_index", -1);
        setField(term25398, term25398.getClass(), "_writeContext", term25401);
        setField(term25398, term25398.getClass(), "_cfgPrettyPrinter", null);
        term25402 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25403 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25404 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term25402, term25402.getClass(), "_parsers", null);
        setIntField(term25402, term25402.getClass(), "_nextParser", 0);
        setField(term25403, term25403.getClass(), "_parsers", null);
        setIntField(term25403, term25403.getClass(), "_nextParser", 0);
        setField(term25404, term25404.getClass(), "_reader", null);
        setField(term25404, term25404.getClass(), "_inputBuffer", null);
        setBooleanField(term25404, term25404.getClass(), "_bufferRecyclable", false);
        setField(term25404, term25404.getClass(), "_objectCodec", null);
        setField(term25404, term25404.getClass(), "_symbols", null);
        setIntField(term25404, term25404.getClass(), "_hashSeed", 0);
        setBooleanField(term25404, term25404.getClass(), "_tokenIncomplete", false);
        setField(term25404, term25404.getClass(), "_ioContext", null);
        setBooleanField(term25404, term25404.getClass(), "_closed", false);
        setIntField(term25404, term25404.getClass(), "_inputPtr", 0);
        setIntField(term25404, term25404.getClass(), "_inputEnd", 0);
        setLongField(term25404, term25404.getClass(), "_currInputProcessed", 0L);
        setIntField(term25404, term25404.getClass(), "_currInputRow", 0);
        setIntField(term25404, term25404.getClass(), "_currInputRowStart", 0);
        setLongField(term25404, term25404.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25404, term25404.getClass(), "_tokenInputRow", 0);
        setIntField(term25404, term25404.getClass(), "_tokenInputCol", 0);
        setField(term25404, term25404.getClass(), "_parsingContext", null);
        setField(term25404, term25404.getClass(), "_nextToken", null);
        setField(term25404, term25404.getClass(), "_textBuffer", null);
        setField(term25404, term25404.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term25404, term25404.getClass(), "_nameCopied", false);
        setField(term25404, term25404.getClass(), "_byteArrayBuilder", null);
        setField(term25404, term25404.getClass(), "_binaryValue", null);
        setIntField(term25404, term25404.getClass(), "_numTypesValid", 0);
        setIntField(term25404, term25404.getClass(), "_numberInt", 0);
        setLongField(term25404, term25404.getClass(), "_numberLong", 0L);
        setDoubleField(term25404, term25404.getClass(), "_numberDouble", 0.0);
        setField(term25404, term25404.getClass(), "_numberBigInt", null);
        setField(term25404, term25404.getClass(), "_numberBigDecimal", null);
        setBooleanField(term25404, term25404.getClass(), "_numberNegative", false);
        setIntField(term25404, term25404.getClass(), "_intLength", 0);
        setIntField(term25404, term25404.getClass(), "_fractLength", 0);
        setIntField(term25404, term25404.getClass(), "_expLength", 0);
        setField(term25404, term25404.getClass(), "_currToken", null);
        setField(term25404, term25404.getClass(), "_lastClearedToken", null);
        setIntField(term25404, term25404.getClass(), "_features", 0);
        setField(term25403, term25403.getClass(), "delegate", term25404);
        setIntField(term25403, term25403.getClass(), "_features", 0);
        setField(term25402, term25402.getClass(), "delegate", term25403);
        setIntField(term25402, term25402.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term24976;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25398));
        assertTrue(recursiveEquals(term24976, term25402));
    }

};


