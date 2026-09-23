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

public class TokenBuffer_init_1753724878175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29599;
     Object term30219;
     Object term30223;

    public TokenBuffer_init_1753724878175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29493 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term29493, term29493.getClass(), "_hasNativeId", false);
        term29599 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29705 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29811 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29923 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term29811, term29811.getClass(), "delegate", term29923);
        setField(term29705, term29705.getClass(), "delegate", term29811);
        setField(term29599, term29599.getClass(), "delegate", term29705);
        term30219 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term30220 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term30221 = (Object[]) newArray("java.lang.Object", 16);
        Object term30222 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term30219, term30219.getClass(), "_objectCodec", null);
        setIntField(term30219, term30219.getClass(), "_generatorFeatures", 79);
        setBooleanField(term30219, term30219.getClass(), "_closed", false);
        setBooleanField(term30219, term30219.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term30219, term30219.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term30219, term30219.getClass(), "_mayHaveNativeIds", false);
        setField(term30220, term30220.getClass(), "_next", null);
        setLongField(term30220, term30220.getClass(), "_tokenTypes", 0L);
        setField(term30220, term30220.getClass(), "_tokens", term30221);
        setField(term30220, term30220.getClass(), "_nativeIds", null);
        setField(term30219, term30219.getClass(), "_first", term30220);
        setField(term30219, term30219.getClass(), "_last", term30220);
        setIntField(term30219, term30219.getClass(), "_appendAt", 0);
        setField(term30219, term30219.getClass(), "_typeId", null);
        setField(term30219, term30219.getClass(), "_objectId", null);
        setBooleanField(term30219, term30219.getClass(), "_hasNativeId", false);
        setField(term30222, term30222.getClass(), "_parent", null);
        setField(term30222, term30222.getClass(), "_dups", null);
        setField(term30222, term30222.getClass(), "_child", null);
        setField(term30222, term30222.getClass(), "_currentName", null);
        setBooleanField(term30222, term30222.getClass(), "_gotName", false);
        setIntField(term30222, term30222.getClass(), "_type", 0);
        setIntField(term30222, term30222.getClass(), "_index", -1);
        setField(term30219, term30219.getClass(), "_writeContext", term30222);
        setField(term30219, term30219.getClass(), "_cfgPrettyPrinter", null);
        term30223 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term30224 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term30225 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term30226 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term30223, term30223.getClass(), "_parsers", null);
        setIntField(term30223, term30223.getClass(), "_nextParser", 0);
        setField(term30224, term30224.getClass(), "_parsers", null);
        setIntField(term30224, term30224.getClass(), "_nextParser", 0);
        setField(term30225, term30225.getClass(), "_parsers", null);
        setIntField(term30225, term30225.getClass(), "_nextParser", 0);
        setField(term30226, term30226.getClass(), "_reader", null);
        setField(term30226, term30226.getClass(), "_inputBuffer", null);
        setBooleanField(term30226, term30226.getClass(), "_bufferRecyclable", false);
        setField(term30226, term30226.getClass(), "_objectCodec", null);
        setField(term30226, term30226.getClass(), "_symbols", null);
        setIntField(term30226, term30226.getClass(), "_hashSeed", 0);
        setBooleanField(term30226, term30226.getClass(), "_tokenIncomplete", false);
        setField(term30226, term30226.getClass(), "_ioContext", null);
        setBooleanField(term30226, term30226.getClass(), "_closed", false);
        setIntField(term30226, term30226.getClass(), "_inputPtr", 0);
        setIntField(term30226, term30226.getClass(), "_inputEnd", 0);
        setLongField(term30226, term30226.getClass(), "_currInputProcessed", 0L);
        setIntField(term30226, term30226.getClass(), "_currInputRow", 0);
        setIntField(term30226, term30226.getClass(), "_currInputRowStart", 0);
        setLongField(term30226, term30226.getClass(), "_tokenInputTotal", 0L);
        setIntField(term30226, term30226.getClass(), "_tokenInputRow", 0);
        setIntField(term30226, term30226.getClass(), "_tokenInputCol", 0);
        setField(term30226, term30226.getClass(), "_parsingContext", null);
        setField(term30226, term30226.getClass(), "_nextToken", null);
        setField(term30226, term30226.getClass(), "_textBuffer", null);
        setField(term30226, term30226.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term30226, term30226.getClass(), "_nameCopied", false);
        setField(term30226, term30226.getClass(), "_byteArrayBuilder", null);
        setField(term30226, term30226.getClass(), "_binaryValue", null);
        setIntField(term30226, term30226.getClass(), "_numTypesValid", 0);
        setIntField(term30226, term30226.getClass(), "_numberInt", 0);
        setLongField(term30226, term30226.getClass(), "_numberLong", 0L);
        setDoubleField(term30226, term30226.getClass(), "_numberDouble", 0.0);
        setField(term30226, term30226.getClass(), "_numberBigInt", null);
        setField(term30226, term30226.getClass(), "_numberBigDecimal", null);
        setBooleanField(term30226, term30226.getClass(), "_numberNegative", false);
        setIntField(term30226, term30226.getClass(), "_intLength", 0);
        setIntField(term30226, term30226.getClass(), "_fractLength", 0);
        setIntField(term30226, term30226.getClass(), "_expLength", 0);
        setField(term30226, term30226.getClass(), "_currToken", null);
        setField(term30226, term30226.getClass(), "_lastClearedToken", null);
        setIntField(term30226, term30226.getClass(), "_features", 0);
        setField(term30225, term30225.getClass(), "delegate", term30226);
        setIntField(term30225, term30225.getClass(), "_features", 0);
        setField(term30224, term30224.getClass(), "delegate", term30225);
        setIntField(term30224, term30224.getClass(), "_features", 0);
        setField(term30223, term30223.getClass(), "delegate", term30224);
        setIntField(term30223, term30223.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term29599;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30219));
        assertTrue(recursiveEquals(term29599, term30223));
    }

};


