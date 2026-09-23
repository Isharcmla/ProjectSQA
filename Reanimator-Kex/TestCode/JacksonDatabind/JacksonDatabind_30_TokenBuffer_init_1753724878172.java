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

public class TokenBuffer_init_1753724878172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25281;
     Object term25923;
     Object term25927;

    public TokenBuffer_init_1753724878172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25175 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term25175, term25175.getClass(), "_hasNativeId", false);
        term25281 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25387 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25499 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term25387, term25387.getClass(), "delegate", term25499);
        setField(term25281, term25281.getClass(), "delegate", term25387);
        term25923 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term25924 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term25925 = (Object[]) newArray("java.lang.Object", 16);
        Object term25926 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term25923, term25923.getClass(), "_objectCodec", null);
        setIntField(term25923, term25923.getClass(), "_generatorFeatures", 31);
        setBooleanField(term25923, term25923.getClass(), "_closed", false);
        setBooleanField(term25923, term25923.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term25923, term25923.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term25923, term25923.getClass(), "_mayHaveNativeIds", false);
        setField(term25924, term25924.getClass(), "_next", null);
        setLongField(term25924, term25924.getClass(), "_tokenTypes", 0L);
        setField(term25924, term25924.getClass(), "_tokens", term25925);
        setField(term25924, term25924.getClass(), "_nativeIds", null);
        setField(term25923, term25923.getClass(), "_first", term25924);
        setField(term25923, term25923.getClass(), "_last", term25924);
        setIntField(term25923, term25923.getClass(), "_appendAt", 0);
        setField(term25923, term25923.getClass(), "_typeId", null);
        setField(term25923, term25923.getClass(), "_objectId", null);
        setBooleanField(term25923, term25923.getClass(), "_hasNativeId", false);
        setField(term25926, term25926.getClass(), "_parent", null);
        setField(term25926, term25926.getClass(), "_dups", null);
        setField(term25926, term25926.getClass(), "_child", null);
        setField(term25926, term25926.getClass(), "_currentName", null);
        setField(term25926, term25926.getClass(), "_currentValue", null);
        setBooleanField(term25926, term25926.getClass(), "_gotName", false);
        setIntField(term25926, term25926.getClass(), "_type", 0);
        setIntField(term25926, term25926.getClass(), "_index", -1);
        setField(term25923, term25923.getClass(), "_writeContext", term25926);
        setField(term25923, term25923.getClass(), "_cfgPrettyPrinter", null);
        term25927 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25928 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term25929 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term25927, term25927.getClass(), "_parsers", null);
        setIntField(term25927, term25927.getClass(), "_nextParser", 0);
        setField(term25928, term25928.getClass(), "_parsers", null);
        setIntField(term25928, term25928.getClass(), "_nextParser", 0);
        setField(term25929, term25929.getClass(), "_reader", null);
        setField(term25929, term25929.getClass(), "_inputBuffer", null);
        setBooleanField(term25929, term25929.getClass(), "_bufferRecyclable", false);
        setField(term25929, term25929.getClass(), "_objectCodec", null);
        setField(term25929, term25929.getClass(), "_symbols", null);
        setIntField(term25929, term25929.getClass(), "_hashSeed", 0);
        setBooleanField(term25929, term25929.getClass(), "_tokenIncomplete", false);
        setField(term25929, term25929.getClass(), "_ioContext", null);
        setBooleanField(term25929, term25929.getClass(), "_closed", false);
        setIntField(term25929, term25929.getClass(), "_inputPtr", 0);
        setIntField(term25929, term25929.getClass(), "_inputEnd", 0);
        setLongField(term25929, term25929.getClass(), "_currInputProcessed", 0L);
        setIntField(term25929, term25929.getClass(), "_currInputRow", 0);
        setIntField(term25929, term25929.getClass(), "_currInputRowStart", 0);
        setLongField(term25929, term25929.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25929, term25929.getClass(), "_tokenInputRow", 0);
        setIntField(term25929, term25929.getClass(), "_tokenInputCol", 0);
        setField(term25929, term25929.getClass(), "_parsingContext", null);
        setField(term25929, term25929.getClass(), "_nextToken", null);
        setField(term25929, term25929.getClass(), "_textBuffer", null);
        setField(term25929, term25929.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term25929, term25929.getClass(), "_nameCopied", false);
        setField(term25929, term25929.getClass(), "_byteArrayBuilder", null);
        setField(term25929, term25929.getClass(), "_binaryValue", null);
        setIntField(term25929, term25929.getClass(), "_numTypesValid", 0);
        setIntField(term25929, term25929.getClass(), "_numberInt", 0);
        setLongField(term25929, term25929.getClass(), "_numberLong", 0L);
        setDoubleField(term25929, term25929.getClass(), "_numberDouble", 0.0);
        setField(term25929, term25929.getClass(), "_numberBigInt", null);
        setField(term25929, term25929.getClass(), "_numberBigDecimal", null);
        setBooleanField(term25929, term25929.getClass(), "_numberNegative", false);
        setIntField(term25929, term25929.getClass(), "_intLength", 0);
        setIntField(term25929, term25929.getClass(), "_fractLength", 0);
        setIntField(term25929, term25929.getClass(), "_expLength", 0);
        setField(term25929, term25929.getClass(), "_currToken", null);
        setField(term25929, term25929.getClass(), "_lastClearedToken", null);
        setIntField(term25929, term25929.getClass(), "_features", 0);
        setField(term25928, term25928.getClass(), "delegate", term25929);
        setIntField(term25928, term25928.getClass(), "_features", 0);
        setField(term25927, term25927.getClass(), "delegate", term25928);
        setIntField(term25927, term25927.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term25281;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25923));
        assertTrue(recursiveEquals(term25281, term25927));
    }

};


