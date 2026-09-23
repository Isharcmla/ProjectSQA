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

public class TokenBuffer_init_1753724878141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17583;
     Object term17630;
     Object term17634;

    public TokenBuffer_init_1753724878141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17471 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term17471, term17471.getClass(), "_hasNativeId", false);
        term17583 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term17630 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term17631 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term17632 = (Object[]) newArray("java.lang.Object", 16);
        Object term17633 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term17630, term17630.getClass(), "_objectCodec", null);
        setIntField(term17630, term17630.getClass(), "_generatorFeatures", 79);
        setBooleanField(term17630, term17630.getClass(), "_closed", false);
        setBooleanField(term17630, term17630.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term17630, term17630.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term17630, term17630.getClass(), "_mayHaveNativeIds", false);
        setField(term17631, term17631.getClass(), "_next", null);
        setLongField(term17631, term17631.getClass(), "_tokenTypes", 0L);
        setField(term17631, term17631.getClass(), "_tokens", term17632);
        setField(term17631, term17631.getClass(), "_nativeIds", null);
        setField(term17630, term17630.getClass(), "_first", term17631);
        setField(term17630, term17630.getClass(), "_last", term17631);
        setIntField(term17630, term17630.getClass(), "_appendAt", 0);
        setField(term17630, term17630.getClass(), "_typeId", null);
        setField(term17630, term17630.getClass(), "_objectId", null);
        setBooleanField(term17630, term17630.getClass(), "_hasNativeId", false);
        setField(term17633, term17633.getClass(), "_parent", null);
        setField(term17633, term17633.getClass(), "_dups", null);
        setField(term17633, term17633.getClass(), "_child", null);
        setField(term17633, term17633.getClass(), "_currentName", null);
        setBooleanField(term17633, term17633.getClass(), "_gotName", false);
        setIntField(term17633, term17633.getClass(), "_type", 0);
        setIntField(term17633, term17633.getClass(), "_index", -1);
        setField(term17630, term17630.getClass(), "_writeContext", term17633);
        setField(term17630, term17630.getClass(), "_cfgPrettyPrinter", null);
        term17634 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term17634, term17634.getClass(), "_reader", null);
        setField(term17634, term17634.getClass(), "_inputBuffer", null);
        setBooleanField(term17634, term17634.getClass(), "_bufferRecyclable", false);
        setField(term17634, term17634.getClass(), "_objectCodec", null);
        setField(term17634, term17634.getClass(), "_symbols", null);
        setIntField(term17634, term17634.getClass(), "_hashSeed", 0);
        setBooleanField(term17634, term17634.getClass(), "_tokenIncomplete", false);
        setField(term17634, term17634.getClass(), "_ioContext", null);
        setBooleanField(term17634, term17634.getClass(), "_closed", false);
        setIntField(term17634, term17634.getClass(), "_inputPtr", 0);
        setIntField(term17634, term17634.getClass(), "_inputEnd", 0);
        setLongField(term17634, term17634.getClass(), "_currInputProcessed", 0L);
        setIntField(term17634, term17634.getClass(), "_currInputRow", 0);
        setIntField(term17634, term17634.getClass(), "_currInputRowStart", 0);
        setLongField(term17634, term17634.getClass(), "_tokenInputTotal", 0L);
        setIntField(term17634, term17634.getClass(), "_tokenInputRow", 0);
        setIntField(term17634, term17634.getClass(), "_tokenInputCol", 0);
        setField(term17634, term17634.getClass(), "_parsingContext", null);
        setField(term17634, term17634.getClass(), "_nextToken", null);
        setField(term17634, term17634.getClass(), "_textBuffer", null);
        setField(term17634, term17634.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term17634, term17634.getClass(), "_nameCopied", false);
        setField(term17634, term17634.getClass(), "_byteArrayBuilder", null);
        setField(term17634, term17634.getClass(), "_binaryValue", null);
        setIntField(term17634, term17634.getClass(), "_numTypesValid", 0);
        setIntField(term17634, term17634.getClass(), "_numberInt", 0);
        setLongField(term17634, term17634.getClass(), "_numberLong", 0L);
        setDoubleField(term17634, term17634.getClass(), "_numberDouble", 0.0);
        setField(term17634, term17634.getClass(), "_numberBigInt", null);
        setField(term17634, term17634.getClass(), "_numberBigDecimal", null);
        setBooleanField(term17634, term17634.getClass(), "_numberNegative", false);
        setIntField(term17634, term17634.getClass(), "_intLength", 0);
        setIntField(term17634, term17634.getClass(), "_fractLength", 0);
        setIntField(term17634, term17634.getClass(), "_expLength", 0);
        setField(term17634, term17634.getClass(), "_currToken", null);
        setField(term17634, term17634.getClass(), "_lastClearedToken", null);
        setIntField(term17634, term17634.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term17583;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17630));
        assertTrue(recursiveEquals(term17583, term17634));
    }

};


