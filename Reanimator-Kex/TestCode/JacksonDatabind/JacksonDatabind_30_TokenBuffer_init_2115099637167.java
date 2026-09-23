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

public class TokenBuffer_init_2115099637167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24544;
     Object term24591;
     Object term24595;

    public TokenBuffer_init_2115099637167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24432 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term24432, term24432.getClass(), "_hasNativeId", false);
        term24544 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term24591 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term24592 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term24593 = (Object[]) newArray("java.lang.Object", 16);
        Object term24594 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term24591, term24591.getClass(), "_objectCodec", null);
        setIntField(term24591, term24591.getClass(), "_generatorFeatures", 31);
        setBooleanField(term24591, term24591.getClass(), "_closed", false);
        setBooleanField(term24591, term24591.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term24591, term24591.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term24591, term24591.getClass(), "_mayHaveNativeIds", false);
        setField(term24592, term24592.getClass(), "_next", null);
        setLongField(term24592, term24592.getClass(), "_tokenTypes", 0L);
        setField(term24592, term24592.getClass(), "_tokens", term24593);
        setField(term24592, term24592.getClass(), "_nativeIds", null);
        setField(term24591, term24591.getClass(), "_first", term24592);
        setField(term24591, term24591.getClass(), "_last", term24592);
        setIntField(term24591, term24591.getClass(), "_appendAt", 0);
        setField(term24591, term24591.getClass(), "_typeId", null);
        setField(term24591, term24591.getClass(), "_objectId", null);
        setBooleanField(term24591, term24591.getClass(), "_hasNativeId", false);
        setField(term24594, term24594.getClass(), "_parent", null);
        setField(term24594, term24594.getClass(), "_dups", null);
        setField(term24594, term24594.getClass(), "_child", null);
        setField(term24594, term24594.getClass(), "_currentName", null);
        setField(term24594, term24594.getClass(), "_currentValue", null);
        setBooleanField(term24594, term24594.getClass(), "_gotName", false);
        setIntField(term24594, term24594.getClass(), "_type", 0);
        setIntField(term24594, term24594.getClass(), "_index", -1);
        setField(term24591, term24591.getClass(), "_writeContext", term24594);
        setField(term24591, term24591.getClass(), "_cfgPrettyPrinter", null);
        term24595 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term24595, term24595.getClass(), "_reader", null);
        setField(term24595, term24595.getClass(), "_inputBuffer", null);
        setBooleanField(term24595, term24595.getClass(), "_bufferRecyclable", false);
        setField(term24595, term24595.getClass(), "_objectCodec", null);
        setField(term24595, term24595.getClass(), "_symbols", null);
        setIntField(term24595, term24595.getClass(), "_hashSeed", 0);
        setBooleanField(term24595, term24595.getClass(), "_tokenIncomplete", false);
        setField(term24595, term24595.getClass(), "_ioContext", null);
        setBooleanField(term24595, term24595.getClass(), "_closed", false);
        setIntField(term24595, term24595.getClass(), "_inputPtr", 0);
        setIntField(term24595, term24595.getClass(), "_inputEnd", 0);
        setLongField(term24595, term24595.getClass(), "_currInputProcessed", 0L);
        setIntField(term24595, term24595.getClass(), "_currInputRow", 0);
        setIntField(term24595, term24595.getClass(), "_currInputRowStart", 0);
        setLongField(term24595, term24595.getClass(), "_tokenInputTotal", 0L);
        setIntField(term24595, term24595.getClass(), "_tokenInputRow", 0);
        setIntField(term24595, term24595.getClass(), "_tokenInputCol", 0);
        setField(term24595, term24595.getClass(), "_parsingContext", null);
        setField(term24595, term24595.getClass(), "_nextToken", null);
        setField(term24595, term24595.getClass(), "_textBuffer", null);
        setField(term24595, term24595.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term24595, term24595.getClass(), "_nameCopied", false);
        setField(term24595, term24595.getClass(), "_byteArrayBuilder", null);
        setField(term24595, term24595.getClass(), "_binaryValue", null);
        setIntField(term24595, term24595.getClass(), "_numTypesValid", 0);
        setIntField(term24595, term24595.getClass(), "_numberInt", 0);
        setLongField(term24595, term24595.getClass(), "_numberLong", 0L);
        setDoubleField(term24595, term24595.getClass(), "_numberDouble", 0.0);
        setField(term24595, term24595.getClass(), "_numberBigInt", null);
        setField(term24595, term24595.getClass(), "_numberBigDecimal", null);
        setBooleanField(term24595, term24595.getClass(), "_numberNegative", false);
        setIntField(term24595, term24595.getClass(), "_intLength", 0);
        setIntField(term24595, term24595.getClass(), "_fractLength", 0);
        setIntField(term24595, term24595.getClass(), "_expLength", 0);
        setField(term24595, term24595.getClass(), "_currToken", null);
        setField(term24595, term24595.getClass(), "_lastClearedToken", null);
        setIntField(term24595, term24595.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term24544;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24591));
        assertTrue(recursiveEquals(term24544, term24595));
    }

};


