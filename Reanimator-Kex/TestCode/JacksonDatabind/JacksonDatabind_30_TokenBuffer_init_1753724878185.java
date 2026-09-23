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

public class TokenBuffer_init_1753724878185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29810;
     Object term30043;
     Object term30047;

    public TokenBuffer_init_1753724878185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29704 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term29704, term29704.getClass(), "_hasNativeId", false);
        term29810 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29922 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term29810, term29810.getClass(), "delegate", term29922);
        term30043 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term30044 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term30045 = (Object[]) newArray("java.lang.Object", 16);
        Object term30046 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term30043, term30043.getClass(), "_objectCodec", null);
        setIntField(term30043, term30043.getClass(), "_generatorFeatures", 31);
        setBooleanField(term30043, term30043.getClass(), "_closed", false);
        setBooleanField(term30043, term30043.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term30043, term30043.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term30043, term30043.getClass(), "_mayHaveNativeIds", false);
        setField(term30044, term30044.getClass(), "_next", null);
        setLongField(term30044, term30044.getClass(), "_tokenTypes", 0L);
        setField(term30044, term30044.getClass(), "_tokens", term30045);
        setField(term30044, term30044.getClass(), "_nativeIds", null);
        setField(term30043, term30043.getClass(), "_first", term30044);
        setField(term30043, term30043.getClass(), "_last", term30044);
        setIntField(term30043, term30043.getClass(), "_appendAt", 0);
        setField(term30043, term30043.getClass(), "_typeId", null);
        setField(term30043, term30043.getClass(), "_objectId", null);
        setBooleanField(term30043, term30043.getClass(), "_hasNativeId", false);
        setField(term30046, term30046.getClass(), "_parent", null);
        setField(term30046, term30046.getClass(), "_dups", null);
        setField(term30046, term30046.getClass(), "_child", null);
        setField(term30046, term30046.getClass(), "_currentName", null);
        setField(term30046, term30046.getClass(), "_currentValue", null);
        setBooleanField(term30046, term30046.getClass(), "_gotName", false);
        setIntField(term30046, term30046.getClass(), "_type", 0);
        setIntField(term30046, term30046.getClass(), "_index", -1);
        setField(term30043, term30043.getClass(), "_writeContext", term30046);
        setField(term30043, term30043.getClass(), "_cfgPrettyPrinter", null);
        term30047 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term30048 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term30047, term30047.getClass(), "_parsers", null);
        setIntField(term30047, term30047.getClass(), "_nextParser", 0);
        setField(term30048, term30048.getClass(), "_reader", null);
        setField(term30048, term30048.getClass(), "_inputBuffer", null);
        setBooleanField(term30048, term30048.getClass(), "_bufferRecyclable", false);
        setField(term30048, term30048.getClass(), "_objectCodec", null);
        setField(term30048, term30048.getClass(), "_symbols", null);
        setIntField(term30048, term30048.getClass(), "_hashSeed", 0);
        setBooleanField(term30048, term30048.getClass(), "_tokenIncomplete", false);
        setField(term30048, term30048.getClass(), "_ioContext", null);
        setBooleanField(term30048, term30048.getClass(), "_closed", false);
        setIntField(term30048, term30048.getClass(), "_inputPtr", 0);
        setIntField(term30048, term30048.getClass(), "_inputEnd", 0);
        setLongField(term30048, term30048.getClass(), "_currInputProcessed", 0L);
        setIntField(term30048, term30048.getClass(), "_currInputRow", 0);
        setIntField(term30048, term30048.getClass(), "_currInputRowStart", 0);
        setLongField(term30048, term30048.getClass(), "_tokenInputTotal", 0L);
        setIntField(term30048, term30048.getClass(), "_tokenInputRow", 0);
        setIntField(term30048, term30048.getClass(), "_tokenInputCol", 0);
        setField(term30048, term30048.getClass(), "_parsingContext", null);
        setField(term30048, term30048.getClass(), "_nextToken", null);
        setField(term30048, term30048.getClass(), "_textBuffer", null);
        setField(term30048, term30048.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term30048, term30048.getClass(), "_nameCopied", false);
        setField(term30048, term30048.getClass(), "_byteArrayBuilder", null);
        setField(term30048, term30048.getClass(), "_binaryValue", null);
        setIntField(term30048, term30048.getClass(), "_numTypesValid", 0);
        setIntField(term30048, term30048.getClass(), "_numberInt", 0);
        setLongField(term30048, term30048.getClass(), "_numberLong", 0L);
        setDoubleField(term30048, term30048.getClass(), "_numberDouble", 0.0);
        setField(term30048, term30048.getClass(), "_numberBigInt", null);
        setField(term30048, term30048.getClass(), "_numberBigDecimal", null);
        setBooleanField(term30048, term30048.getClass(), "_numberNegative", false);
        setIntField(term30048, term30048.getClass(), "_intLength", 0);
        setIntField(term30048, term30048.getClass(), "_fractLength", 0);
        setIntField(term30048, term30048.getClass(), "_expLength", 0);
        setField(term30048, term30048.getClass(), "_currToken", null);
        setField(term30048, term30048.getClass(), "_lastClearedToken", null);
        setIntField(term30048, term30048.getClass(), "_features", 0);
        setField(term30047, term30047.getClass(), "delegate", term30048);
        setIntField(term30047, term30047.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term29810;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30043));
        assertTrue(recursiveEquals(term29810, term30047));
    }

};


