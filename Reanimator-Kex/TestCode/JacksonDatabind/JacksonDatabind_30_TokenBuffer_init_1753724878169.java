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

public class TokenBuffer_init_1753724878169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24820;
     Object term25050;
     Object term25054;

    public TokenBuffer_init_1753724878169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24714 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term24714, term24714.getClass(), "_hasNativeId", false);
        term24820 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term24930 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term24820, term24820.getClass(), "delegate", term24930);
        term25050 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term25051 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term25052 = (Object[]) newArray("java.lang.Object", 16);
        Object term25053 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term25050, term25050.getClass(), "_objectCodec", null);
        setIntField(term25050, term25050.getClass(), "_generatorFeatures", 31);
        setBooleanField(term25050, term25050.getClass(), "_closed", false);
        setBooleanField(term25050, term25050.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term25050, term25050.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term25050, term25050.getClass(), "_mayHaveNativeIds", false);
        setField(term25051, term25051.getClass(), "_next", null);
        setLongField(term25051, term25051.getClass(), "_tokenTypes", 0L);
        setField(term25051, term25051.getClass(), "_tokens", term25052);
        setField(term25051, term25051.getClass(), "_nativeIds", null);
        setField(term25050, term25050.getClass(), "_first", term25051);
        setField(term25050, term25050.getClass(), "_last", term25051);
        setIntField(term25050, term25050.getClass(), "_appendAt", 0);
        setField(term25050, term25050.getClass(), "_typeId", null);
        setField(term25050, term25050.getClass(), "_objectId", null);
        setBooleanField(term25050, term25050.getClass(), "_hasNativeId", false);
        setField(term25053, term25053.getClass(), "_parent", null);
        setField(term25053, term25053.getClass(), "_dups", null);
        setField(term25053, term25053.getClass(), "_child", null);
        setField(term25053, term25053.getClass(), "_currentName", null);
        setField(term25053, term25053.getClass(), "_currentValue", null);
        setBooleanField(term25053, term25053.getClass(), "_gotName", false);
        setIntField(term25053, term25053.getClass(), "_type", 0);
        setIntField(term25053, term25053.getClass(), "_index", -1);
        setField(term25050, term25050.getClass(), "_writeContext", term25053);
        setField(term25050, term25050.getClass(), "_cfgPrettyPrinter", null);
        term25054 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term25055 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term25055, term25055.getClass(), "_objectCodec", null);
        setField(term25055, term25055.getClass(), "_symbols", null);
        setField(term25055, term25055.getClass(), "_quadBuffer", null);
        setBooleanField(term25055, term25055.getClass(), "_tokenIncomplete", false);
        setIntField(term25055, term25055.getClass(), "_quad1", 0);
        setField(term25055, term25055.getClass(), "_inputStream", null);
        setField(term25055, term25055.getClass(), "_inputBuffer", null);
        setBooleanField(term25055, term25055.getClass(), "_bufferRecyclable", false);
        setField(term25055, term25055.getClass(), "_ioContext", null);
        setBooleanField(term25055, term25055.getClass(), "_closed", false);
        setIntField(term25055, term25055.getClass(), "_inputPtr", 0);
        setIntField(term25055, term25055.getClass(), "_inputEnd", 0);
        setLongField(term25055, term25055.getClass(), "_currInputProcessed", 0L);
        setIntField(term25055, term25055.getClass(), "_currInputRow", 0);
        setIntField(term25055, term25055.getClass(), "_currInputRowStart", 0);
        setLongField(term25055, term25055.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25055, term25055.getClass(), "_tokenInputRow", 0);
        setIntField(term25055, term25055.getClass(), "_tokenInputCol", 0);
        setField(term25055, term25055.getClass(), "_parsingContext", null);
        setField(term25055, term25055.getClass(), "_nextToken", null);
        setField(term25055, term25055.getClass(), "_textBuffer", null);
        setField(term25055, term25055.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term25055, term25055.getClass(), "_nameCopied", false);
        setField(term25055, term25055.getClass(), "_byteArrayBuilder", null);
        setField(term25055, term25055.getClass(), "_binaryValue", null);
        setIntField(term25055, term25055.getClass(), "_numTypesValid", 0);
        setIntField(term25055, term25055.getClass(), "_numberInt", 0);
        setLongField(term25055, term25055.getClass(), "_numberLong", 0L);
        setDoubleField(term25055, term25055.getClass(), "_numberDouble", 0.0);
        setField(term25055, term25055.getClass(), "_numberBigInt", null);
        setField(term25055, term25055.getClass(), "_numberBigDecimal", null);
        setBooleanField(term25055, term25055.getClass(), "_numberNegative", false);
        setIntField(term25055, term25055.getClass(), "_intLength", 0);
        setIntField(term25055, term25055.getClass(), "_fractLength", 0);
        setIntField(term25055, term25055.getClass(), "_expLength", 0);
        setField(term25055, term25055.getClass(), "_currToken", null);
        setField(term25055, term25055.getClass(), "_lastClearedToken", null);
        setIntField(term25055, term25055.getClass(), "_features", 0);
        setField(term25054, term25054.getClass(), "delegate", term25055);
        setIntField(term25054, term25054.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term24820;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25050));
        assertTrue(recursiveEquals(term24820, term25054));
    }

};


