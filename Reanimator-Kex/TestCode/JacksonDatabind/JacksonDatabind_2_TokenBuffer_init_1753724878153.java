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

public class TokenBuffer_init_1753724878153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20452;
     Object term20683;
     Object term20687;

    public TokenBuffer_init_1753724878153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20346 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term20346, term20346.getClass(), "_hasNativeId", false);
        term20452 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term20562 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term20452, term20452.getClass(), "delegate", term20562);
        term20683 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term20684 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term20685 = (Object[]) newArray("java.lang.Object", 16);
        Object term20686 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term20683, term20683.getClass(), "_objectCodec", null);
        setIntField(term20683, term20683.getClass(), "_generatorFeatures", 79);
        setBooleanField(term20683, term20683.getClass(), "_closed", false);
        setBooleanField(term20683, term20683.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term20683, term20683.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term20683, term20683.getClass(), "_mayHaveNativeIds", false);
        setField(term20684, term20684.getClass(), "_next", null);
        setLongField(term20684, term20684.getClass(), "_tokenTypes", 0L);
        setField(term20684, term20684.getClass(), "_tokens", term20685);
        setField(term20684, term20684.getClass(), "_nativeIds", null);
        setField(term20683, term20683.getClass(), "_first", term20684);
        setField(term20683, term20683.getClass(), "_last", term20684);
        setIntField(term20683, term20683.getClass(), "_appendAt", 0);
        setField(term20683, term20683.getClass(), "_typeId", null);
        setField(term20683, term20683.getClass(), "_objectId", null);
        setBooleanField(term20683, term20683.getClass(), "_hasNativeId", false);
        setField(term20686, term20686.getClass(), "_parent", null);
        setField(term20686, term20686.getClass(), "_dups", null);
        setField(term20686, term20686.getClass(), "_child", null);
        setField(term20686, term20686.getClass(), "_currentName", null);
        setBooleanField(term20686, term20686.getClass(), "_gotName", false);
        setIntField(term20686, term20686.getClass(), "_type", 0);
        setIntField(term20686, term20686.getClass(), "_index", -1);
        setField(term20683, term20683.getClass(), "_writeContext", term20686);
        setField(term20683, term20683.getClass(), "_cfgPrettyPrinter", null);
        term20687 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term20688 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term20687, term20687.getClass(), "_parsers", null);
        setIntField(term20687, term20687.getClass(), "_nextParser", 0);
        setField(term20688, term20688.getClass(), "_objectCodec", null);
        setField(term20688, term20688.getClass(), "_symbols", null);
        setField(term20688, term20688.getClass(), "_quadBuffer", null);
        setBooleanField(term20688, term20688.getClass(), "_tokenIncomplete", false);
        setIntField(term20688, term20688.getClass(), "_quad1", 0);
        setField(term20688, term20688.getClass(), "_inputStream", null);
        setField(term20688, term20688.getClass(), "_inputBuffer", null);
        setBooleanField(term20688, term20688.getClass(), "_bufferRecyclable", false);
        setField(term20688, term20688.getClass(), "_ioContext", null);
        setBooleanField(term20688, term20688.getClass(), "_closed", false);
        setIntField(term20688, term20688.getClass(), "_inputPtr", 0);
        setIntField(term20688, term20688.getClass(), "_inputEnd", 0);
        setLongField(term20688, term20688.getClass(), "_currInputProcessed", 0L);
        setIntField(term20688, term20688.getClass(), "_currInputRow", 0);
        setIntField(term20688, term20688.getClass(), "_currInputRowStart", 0);
        setLongField(term20688, term20688.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20688, term20688.getClass(), "_tokenInputRow", 0);
        setIntField(term20688, term20688.getClass(), "_tokenInputCol", 0);
        setField(term20688, term20688.getClass(), "_parsingContext", null);
        setField(term20688, term20688.getClass(), "_nextToken", null);
        setField(term20688, term20688.getClass(), "_textBuffer", null);
        setField(term20688, term20688.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20688, term20688.getClass(), "_nameCopied", false);
        setField(term20688, term20688.getClass(), "_byteArrayBuilder", null);
        setField(term20688, term20688.getClass(), "_binaryValue", null);
        setIntField(term20688, term20688.getClass(), "_numTypesValid", 0);
        setIntField(term20688, term20688.getClass(), "_numberInt", 0);
        setLongField(term20688, term20688.getClass(), "_numberLong", 0L);
        setDoubleField(term20688, term20688.getClass(), "_numberDouble", 0.0);
        setField(term20688, term20688.getClass(), "_numberBigInt", null);
        setField(term20688, term20688.getClass(), "_numberBigDecimal", null);
        setBooleanField(term20688, term20688.getClass(), "_numberNegative", false);
        setIntField(term20688, term20688.getClass(), "_intLength", 0);
        setIntField(term20688, term20688.getClass(), "_fractLength", 0);
        setIntField(term20688, term20688.getClass(), "_expLength", 0);
        setField(term20688, term20688.getClass(), "_currToken", null);
        setField(term20688, term20688.getClass(), "_lastClearedToken", null);
        setIntField(term20688, term20688.getClass(), "_features", 0);
        setField(term20687, term20687.getClass(), "delegate", term20688);
        setIntField(term20687, term20687.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term20452;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20683));
        assertTrue(recursiveEquals(term20452, term20687));
    }

};


