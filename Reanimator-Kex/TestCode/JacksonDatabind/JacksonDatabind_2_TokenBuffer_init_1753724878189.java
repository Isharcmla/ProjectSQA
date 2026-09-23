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

public class TokenBuffer_init_1753724878189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37434;
     Object term37856;
     Object term37860;

    public TokenBuffer_init_1753724878189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37096 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term37212 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term37328 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term37096, term37096.getClass(), "_hasNativeId", false);
        setField(term37096, term37096.getClass(), "_objectCodec", null);
        setIntField(term37096, term37096.getClass(), "_generatorFeatures", 0);
        setField(term37096, term37096.getClass(), "_writeContext", null);
        setField(term37096, term37096.getClass(), "_last", term37212);
        setField(term37096, term37096.getClass(), "_first", term37328);
        setIntField(term37096, term37096.getClass(), "_appendAt", 0);
        term37434 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term37540 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term37652 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term37652, term37652.getClass(), "_objectCodec", null);
        setField(term37540, term37540.getClass(), "delegate", term37652);
        setField(term37434, term37434.getClass(), "delegate", term37540);
        term37856 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term37857 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term37858 = (Object[]) newArray("java.lang.Object", 16);
        Object term37859 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term37856, term37856.getClass(), "_objectCodec", null);
        setIntField(term37856, term37856.getClass(), "_generatorFeatures", 79);
        setBooleanField(term37856, term37856.getClass(), "_closed", false);
        setBooleanField(term37856, term37856.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term37856, term37856.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term37856, term37856.getClass(), "_mayHaveNativeIds", false);
        setField(term37857, term37857.getClass(), "_next", null);
        setLongField(term37857, term37857.getClass(), "_tokenTypes", 0L);
        setField(term37857, term37857.getClass(), "_tokens", term37858);
        setField(term37857, term37857.getClass(), "_nativeIds", null);
        setField(term37856, term37856.getClass(), "_first", term37857);
        setField(term37856, term37856.getClass(), "_last", term37857);
        setIntField(term37856, term37856.getClass(), "_appendAt", 0);
        setField(term37856, term37856.getClass(), "_typeId", null);
        setField(term37856, term37856.getClass(), "_objectId", null);
        setBooleanField(term37856, term37856.getClass(), "_hasNativeId", false);
        setField(term37859, term37859.getClass(), "_parent", null);
        setField(term37859, term37859.getClass(), "_dups", null);
        setField(term37859, term37859.getClass(), "_child", null);
        setField(term37859, term37859.getClass(), "_currentName", null);
        setBooleanField(term37859, term37859.getClass(), "_gotName", false);
        setIntField(term37859, term37859.getClass(), "_type", 0);
        setIntField(term37859, term37859.getClass(), "_index", -1);
        setField(term37856, term37856.getClass(), "_writeContext", term37859);
        setField(term37856, term37856.getClass(), "_cfgPrettyPrinter", null);
        term37860 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term37861 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term37862 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term37860, term37860.getClass(), "_parsers", null);
        setIntField(term37860, term37860.getClass(), "_nextParser", 0);
        setField(term37861, term37861.getClass(), "_parsers", null);
        setIntField(term37861, term37861.getClass(), "_nextParser", 0);
        setField(term37862, term37862.getClass(), "_reader", null);
        setField(term37862, term37862.getClass(), "_inputBuffer", null);
        setBooleanField(term37862, term37862.getClass(), "_bufferRecyclable", false);
        setField(term37862, term37862.getClass(), "_objectCodec", null);
        setField(term37862, term37862.getClass(), "_symbols", null);
        setIntField(term37862, term37862.getClass(), "_hashSeed", 0);
        setBooleanField(term37862, term37862.getClass(), "_tokenIncomplete", false);
        setField(term37862, term37862.getClass(), "_ioContext", null);
        setBooleanField(term37862, term37862.getClass(), "_closed", false);
        setIntField(term37862, term37862.getClass(), "_inputPtr", 0);
        setIntField(term37862, term37862.getClass(), "_inputEnd", 0);
        setLongField(term37862, term37862.getClass(), "_currInputProcessed", 0L);
        setIntField(term37862, term37862.getClass(), "_currInputRow", 0);
        setIntField(term37862, term37862.getClass(), "_currInputRowStart", 0);
        setLongField(term37862, term37862.getClass(), "_tokenInputTotal", 0L);
        setIntField(term37862, term37862.getClass(), "_tokenInputRow", 0);
        setIntField(term37862, term37862.getClass(), "_tokenInputCol", 0);
        setField(term37862, term37862.getClass(), "_parsingContext", null);
        setField(term37862, term37862.getClass(), "_nextToken", null);
        setField(term37862, term37862.getClass(), "_textBuffer", null);
        setField(term37862, term37862.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term37862, term37862.getClass(), "_nameCopied", false);
        setField(term37862, term37862.getClass(), "_byteArrayBuilder", null);
        setField(term37862, term37862.getClass(), "_binaryValue", null);
        setIntField(term37862, term37862.getClass(), "_numTypesValid", 0);
        setIntField(term37862, term37862.getClass(), "_numberInt", 0);
        setLongField(term37862, term37862.getClass(), "_numberLong", 0L);
        setDoubleField(term37862, term37862.getClass(), "_numberDouble", 0.0);
        setField(term37862, term37862.getClass(), "_numberBigInt", null);
        setField(term37862, term37862.getClass(), "_numberBigDecimal", null);
        setBooleanField(term37862, term37862.getClass(), "_numberNegative", false);
        setIntField(term37862, term37862.getClass(), "_intLength", 0);
        setIntField(term37862, term37862.getClass(), "_fractLength", 0);
        setIntField(term37862, term37862.getClass(), "_expLength", 0);
        setField(term37862, term37862.getClass(), "_currToken", null);
        setField(term37862, term37862.getClass(), "_lastClearedToken", null);
        setIntField(term37862, term37862.getClass(), "_features", 0);
        setField(term37861, term37861.getClass(), "delegate", term37862);
        setIntField(term37861, term37861.getClass(), "_features", 0);
        setField(term37860, term37860.getClass(), "delegate", term37861);
        setIntField(term37860, term37860.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term37434;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37856));
        assertTrue(recursiveEquals(term37434, term37860));
    }

};


