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

public class TokenBuffer_init_1753724878187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30273;
     Object term30505;
     Object term30509;

    public TokenBuffer_init_1753724878187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30167 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term30167, term30167.getClass(), "_hasNativeId", false);
        term30273 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term30385 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term30273, term30273.getClass(), "delegate", term30385);
        term30505 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term30506 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term30507 = (Object[]) newArray("java.lang.Object", 16);
        Object term30508 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term30505, term30505.getClass(), "_objectCodec", null);
        setIntField(term30505, term30505.getClass(), "_generatorFeatures", 31);
        setBooleanField(term30505, term30505.getClass(), "_closed", false);
        setBooleanField(term30505, term30505.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term30505, term30505.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term30505, term30505.getClass(), "_mayHaveNativeIds", false);
        setField(term30506, term30506.getClass(), "_next", null);
        setLongField(term30506, term30506.getClass(), "_tokenTypes", 0L);
        setField(term30506, term30506.getClass(), "_tokens", term30507);
        setField(term30506, term30506.getClass(), "_nativeIds", null);
        setField(term30505, term30505.getClass(), "_first", term30506);
        setField(term30505, term30505.getClass(), "_last", term30506);
        setIntField(term30505, term30505.getClass(), "_appendAt", 0);
        setField(term30505, term30505.getClass(), "_typeId", null);
        setField(term30505, term30505.getClass(), "_objectId", null);
        setBooleanField(term30505, term30505.getClass(), "_hasNativeId", false);
        setField(term30508, term30508.getClass(), "_parent", null);
        setField(term30508, term30508.getClass(), "_dups", null);
        setField(term30508, term30508.getClass(), "_child", null);
        setField(term30508, term30508.getClass(), "_currentName", null);
        setField(term30508, term30508.getClass(), "_currentValue", null);
        setBooleanField(term30508, term30508.getClass(), "_gotName", false);
        setIntField(term30508, term30508.getClass(), "_type", 0);
        setIntField(term30508, term30508.getClass(), "_index", -1);
        setField(term30505, term30505.getClass(), "_writeContext", term30508);
        setField(term30505, term30505.getClass(), "_cfgPrettyPrinter", null);
        term30509 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term30510 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term30510, term30510.getClass(), "_reader", null);
        setField(term30510, term30510.getClass(), "_inputBuffer", null);
        setBooleanField(term30510, term30510.getClass(), "_bufferRecyclable", false);
        setField(term30510, term30510.getClass(), "_objectCodec", null);
        setField(term30510, term30510.getClass(), "_symbols", null);
        setIntField(term30510, term30510.getClass(), "_hashSeed", 0);
        setBooleanField(term30510, term30510.getClass(), "_tokenIncomplete", false);
        setField(term30510, term30510.getClass(), "_ioContext", null);
        setBooleanField(term30510, term30510.getClass(), "_closed", false);
        setIntField(term30510, term30510.getClass(), "_inputPtr", 0);
        setIntField(term30510, term30510.getClass(), "_inputEnd", 0);
        setLongField(term30510, term30510.getClass(), "_currInputProcessed", 0L);
        setIntField(term30510, term30510.getClass(), "_currInputRow", 0);
        setIntField(term30510, term30510.getClass(), "_currInputRowStart", 0);
        setLongField(term30510, term30510.getClass(), "_tokenInputTotal", 0L);
        setIntField(term30510, term30510.getClass(), "_tokenInputRow", 0);
        setIntField(term30510, term30510.getClass(), "_tokenInputCol", 0);
        setField(term30510, term30510.getClass(), "_parsingContext", null);
        setField(term30510, term30510.getClass(), "_nextToken", null);
        setField(term30510, term30510.getClass(), "_textBuffer", null);
        setField(term30510, term30510.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term30510, term30510.getClass(), "_nameCopied", false);
        setField(term30510, term30510.getClass(), "_byteArrayBuilder", null);
        setField(term30510, term30510.getClass(), "_binaryValue", null);
        setIntField(term30510, term30510.getClass(), "_numTypesValid", 0);
        setIntField(term30510, term30510.getClass(), "_numberInt", 0);
        setLongField(term30510, term30510.getClass(), "_numberLong", 0L);
        setDoubleField(term30510, term30510.getClass(), "_numberDouble", 0.0);
        setField(term30510, term30510.getClass(), "_numberBigInt", null);
        setField(term30510, term30510.getClass(), "_numberBigDecimal", null);
        setBooleanField(term30510, term30510.getClass(), "_numberNegative", false);
        setIntField(term30510, term30510.getClass(), "_intLength", 0);
        setIntField(term30510, term30510.getClass(), "_fractLength", 0);
        setIntField(term30510, term30510.getClass(), "_expLength", 0);
        setField(term30510, term30510.getClass(), "_currToken", null);
        setField(term30510, term30510.getClass(), "_lastClearedToken", null);
        setIntField(term30510, term30510.getClass(), "_features", 0);
        setField(term30509, term30509.getClass(), "delegate", term30510);
        setIntField(term30509, term30509.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term30273;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30505));
        assertTrue(recursiveEquals(term30273, term30509));
    }

};


