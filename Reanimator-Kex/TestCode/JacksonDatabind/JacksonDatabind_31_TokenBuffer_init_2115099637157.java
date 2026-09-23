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

public class TokenBuffer_init_2115099637157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21169;
     Object term21343;
     Object term21347;

    public TokenBuffer_init_2115099637157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21057 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term21057, term21057.getClass(), "_hasNativeId", false);
        term21169 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term21343 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term21344 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term21345 = (Object[]) newArray("java.lang.Object", 16);
        Object term21346 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term21343, term21343.getClass(), "_objectCodec", null);
        setIntField(term21343, term21343.getClass(), "_generatorFeatures", 31);
        setBooleanField(term21343, term21343.getClass(), "_closed", false);
        setBooleanField(term21343, term21343.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term21343, term21343.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term21343, term21343.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term21343, term21343.getClass(), "_forceBigDecimal", false);
        setField(term21344, term21344.getClass(), "_next", null);
        setLongField(term21344, term21344.getClass(), "_tokenTypes", 0L);
        setField(term21344, term21344.getClass(), "_tokens", term21345);
        setField(term21344, term21344.getClass(), "_nativeIds", null);
        setField(term21343, term21343.getClass(), "_first", term21344);
        setField(term21343, term21343.getClass(), "_last", term21344);
        setIntField(term21343, term21343.getClass(), "_appendAt", 0);
        setField(term21343, term21343.getClass(), "_typeId", null);
        setField(term21343, term21343.getClass(), "_objectId", null);
        setBooleanField(term21343, term21343.getClass(), "_hasNativeId", false);
        setField(term21346, term21346.getClass(), "_parent", null);
        setField(term21346, term21346.getClass(), "_dups", null);
        setField(term21346, term21346.getClass(), "_child", null);
        setField(term21346, term21346.getClass(), "_currentName", null);
        setField(term21346, term21346.getClass(), "_currentValue", null);
        setBooleanField(term21346, term21346.getClass(), "_gotName", false);
        setIntField(term21346, term21346.getClass(), "_type", 0);
        setIntField(term21346, term21346.getClass(), "_index", -1);
        setField(term21343, term21343.getClass(), "_writeContext", term21346);
        setField(term21343, term21343.getClass(), "_cfgPrettyPrinter", null);
        term21347 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term21347, term21347.getClass(), "_reader", null);
        setField(term21347, term21347.getClass(), "_inputBuffer", null);
        setBooleanField(term21347, term21347.getClass(), "_bufferRecyclable", false);
        setField(term21347, term21347.getClass(), "_objectCodec", null);
        setField(term21347, term21347.getClass(), "_symbols", null);
        setIntField(term21347, term21347.getClass(), "_hashSeed", 0);
        setBooleanField(term21347, term21347.getClass(), "_tokenIncomplete", false);
        setField(term21347, term21347.getClass(), "_ioContext", null);
        setBooleanField(term21347, term21347.getClass(), "_closed", false);
        setIntField(term21347, term21347.getClass(), "_inputPtr", 0);
        setIntField(term21347, term21347.getClass(), "_inputEnd", 0);
        setLongField(term21347, term21347.getClass(), "_currInputProcessed", 0L);
        setIntField(term21347, term21347.getClass(), "_currInputRow", 0);
        setIntField(term21347, term21347.getClass(), "_currInputRowStart", 0);
        setLongField(term21347, term21347.getClass(), "_tokenInputTotal", 0L);
        setIntField(term21347, term21347.getClass(), "_tokenInputRow", 0);
        setIntField(term21347, term21347.getClass(), "_tokenInputCol", 0);
        setField(term21347, term21347.getClass(), "_parsingContext", null);
        setField(term21347, term21347.getClass(), "_nextToken", null);
        setField(term21347, term21347.getClass(), "_textBuffer", null);
        setField(term21347, term21347.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term21347, term21347.getClass(), "_nameCopied", false);
        setField(term21347, term21347.getClass(), "_byteArrayBuilder", null);
        setField(term21347, term21347.getClass(), "_binaryValue", null);
        setIntField(term21347, term21347.getClass(), "_numTypesValid", 0);
        setIntField(term21347, term21347.getClass(), "_numberInt", 0);
        setLongField(term21347, term21347.getClass(), "_numberLong", 0L);
        setDoubleField(term21347, term21347.getClass(), "_numberDouble", 0.0);
        setField(term21347, term21347.getClass(), "_numberBigInt", null);
        setField(term21347, term21347.getClass(), "_numberBigDecimal", null);
        setBooleanField(term21347, term21347.getClass(), "_numberNegative", false);
        setIntField(term21347, term21347.getClass(), "_intLength", 0);
        setIntField(term21347, term21347.getClass(), "_fractLength", 0);
        setIntField(term21347, term21347.getClass(), "_expLength", 0);
        setField(term21347, term21347.getClass(), "_currToken", null);
        setField(term21347, term21347.getClass(), "_lastClearedToken", null);
        setIntField(term21347, term21347.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term21169;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21343));
        assertTrue(recursiveEquals(term21169, term21347));
    }

};


