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
     Object term20854;
     Object term21218;
     Object term21222;

    public TokenBuffer_init_1753724878156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20742 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term20742, term20742.getClass(), "_hasNativeId", false);
        term20854 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term21218 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term21219 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term21220 = (Object[]) newArray("java.lang.Object", 16);
        Object term21221 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term21218, term21218.getClass(), "_objectCodec", null);
        setIntField(term21218, term21218.getClass(), "_generatorFeatures", 31);
        setBooleanField(term21218, term21218.getClass(), "_closed", false);
        setBooleanField(term21218, term21218.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term21218, term21218.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term21218, term21218.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term21218, term21218.getClass(), "_forceBigDecimal", false);
        setField(term21219, term21219.getClass(), "_next", null);
        setLongField(term21219, term21219.getClass(), "_tokenTypes", 0L);
        setField(term21219, term21219.getClass(), "_tokens", term21220);
        setField(term21219, term21219.getClass(), "_nativeIds", null);
        setField(term21218, term21218.getClass(), "_first", term21219);
        setField(term21218, term21218.getClass(), "_last", term21219);
        setIntField(term21218, term21218.getClass(), "_appendAt", 0);
        setField(term21218, term21218.getClass(), "_typeId", null);
        setField(term21218, term21218.getClass(), "_objectId", null);
        setBooleanField(term21218, term21218.getClass(), "_hasNativeId", false);
        setField(term21221, term21221.getClass(), "_parent", null);
        setField(term21221, term21221.getClass(), "_dups", null);
        setField(term21221, term21221.getClass(), "_child", null);
        setField(term21221, term21221.getClass(), "_currentName", null);
        setField(term21221, term21221.getClass(), "_currentValue", null);
        setBooleanField(term21221, term21221.getClass(), "_gotName", false);
        setIntField(term21221, term21221.getClass(), "_type", 0);
        setIntField(term21221, term21221.getClass(), "_index", -1);
        setField(term21218, term21218.getClass(), "_writeContext", term21221);
        setField(term21218, term21218.getClass(), "_cfgPrettyPrinter", null);
        term21222 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term21222, term21222.getClass(), "_reader", null);
        setField(term21222, term21222.getClass(), "_inputBuffer", null);
        setBooleanField(term21222, term21222.getClass(), "_bufferRecyclable", false);
        setField(term21222, term21222.getClass(), "_objectCodec", null);
        setField(term21222, term21222.getClass(), "_symbols", null);
        setIntField(term21222, term21222.getClass(), "_hashSeed", 0);
        setBooleanField(term21222, term21222.getClass(), "_tokenIncomplete", false);
        setField(term21222, term21222.getClass(), "_ioContext", null);
        setBooleanField(term21222, term21222.getClass(), "_closed", false);
        setIntField(term21222, term21222.getClass(), "_inputPtr", 0);
        setIntField(term21222, term21222.getClass(), "_inputEnd", 0);
        setLongField(term21222, term21222.getClass(), "_currInputProcessed", 0L);
        setIntField(term21222, term21222.getClass(), "_currInputRow", 0);
        setIntField(term21222, term21222.getClass(), "_currInputRowStart", 0);
        setLongField(term21222, term21222.getClass(), "_tokenInputTotal", 0L);
        setIntField(term21222, term21222.getClass(), "_tokenInputRow", 0);
        setIntField(term21222, term21222.getClass(), "_tokenInputCol", 0);
        setField(term21222, term21222.getClass(), "_parsingContext", null);
        setField(term21222, term21222.getClass(), "_nextToken", null);
        setField(term21222, term21222.getClass(), "_textBuffer", null);
        setField(term21222, term21222.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term21222, term21222.getClass(), "_nameCopied", false);
        setField(term21222, term21222.getClass(), "_byteArrayBuilder", null);
        setField(term21222, term21222.getClass(), "_binaryValue", null);
        setIntField(term21222, term21222.getClass(), "_numTypesValid", 0);
        setIntField(term21222, term21222.getClass(), "_numberInt", 0);
        setLongField(term21222, term21222.getClass(), "_numberLong", 0L);
        setDoubleField(term21222, term21222.getClass(), "_numberDouble", 0.0);
        setField(term21222, term21222.getClass(), "_numberBigInt", null);
        setField(term21222, term21222.getClass(), "_numberBigDecimal", null);
        setBooleanField(term21222, term21222.getClass(), "_numberNegative", false);
        setIntField(term21222, term21222.getClass(), "_intLength", 0);
        setIntField(term21222, term21222.getClass(), "_fractLength", 0);
        setIntField(term21222, term21222.getClass(), "_expLength", 0);
        setField(term21222, term21222.getClass(), "_currToken", null);
        setField(term21222, term21222.getClass(), "_lastClearedToken", null);
        setIntField(term21222, term21222.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term20854;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21218));
        assertTrue(recursiveEquals(term20854, term21222));
    }

};


