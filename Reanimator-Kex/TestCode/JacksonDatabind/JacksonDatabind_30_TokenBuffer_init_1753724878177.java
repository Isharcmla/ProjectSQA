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

public class TokenBuffer_init_1753724878177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26752;
     Object term27351;
     Object term27355;

    public TokenBuffer_init_1753724878177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26632 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term26632, term26632.getClass(), "_hasNativeId", false);
        term26752 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term26862 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term26752, term26752.getClass(), "delegate", term26862);
        term27351 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term27352 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term27353 = (Object[]) newArray("java.lang.Object", 16);
        Object term27354 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term27351, term27351.getClass(), "_objectCodec", null);
        setIntField(term27351, term27351.getClass(), "_generatorFeatures", 31);
        setBooleanField(term27351, term27351.getClass(), "_closed", false);
        setBooleanField(term27351, term27351.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term27351, term27351.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term27351, term27351.getClass(), "_mayHaveNativeIds", false);
        setField(term27352, term27352.getClass(), "_next", null);
        setLongField(term27352, term27352.getClass(), "_tokenTypes", 0L);
        setField(term27352, term27352.getClass(), "_tokens", term27353);
        setField(term27352, term27352.getClass(), "_nativeIds", null);
        setField(term27351, term27351.getClass(), "_first", term27352);
        setField(term27351, term27351.getClass(), "_last", term27352);
        setIntField(term27351, term27351.getClass(), "_appendAt", 0);
        setField(term27351, term27351.getClass(), "_typeId", null);
        setField(term27351, term27351.getClass(), "_objectId", null);
        setBooleanField(term27351, term27351.getClass(), "_hasNativeId", false);
        setField(term27354, term27354.getClass(), "_parent", null);
        setField(term27354, term27354.getClass(), "_dups", null);
        setField(term27354, term27354.getClass(), "_child", null);
        setField(term27354, term27354.getClass(), "_currentName", null);
        setField(term27354, term27354.getClass(), "_currentValue", null);
        setBooleanField(term27354, term27354.getClass(), "_gotName", false);
        setIntField(term27354, term27354.getClass(), "_type", 0);
        setIntField(term27354, term27354.getClass(), "_index", -1);
        setField(term27351, term27351.getClass(), "_writeContext", term27354);
        setField(term27351, term27351.getClass(), "_cfgPrettyPrinter", null);
        term27355 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term27356 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term27355, term27355.getClass(), "rootFilter", null);
        setBooleanField(term27355, term27355.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term27355, term27355.getClass(), "_includePath", false);
        setBooleanField(term27355, term27355.getClass(), "_includeImmediateParent", false);
        setField(term27355, term27355.getClass(), "_currToken", null);
        setField(term27355, term27355.getClass(), "_lastClearedToken", null);
        setField(term27355, term27355.getClass(), "_headContext", null);
        setField(term27355, term27355.getClass(), "_exposedContext", null);
        setField(term27355, term27355.getClass(), "_itemFilter", null);
        setIntField(term27355, term27355.getClass(), "_matchCount", 0);
        setField(term27356, term27356.getClass(), "_objectCodec", null);
        setField(term27356, term27356.getClass(), "_symbols", null);
        setField(term27356, term27356.getClass(), "_quadBuffer", null);
        setBooleanField(term27356, term27356.getClass(), "_tokenIncomplete", false);
        setIntField(term27356, term27356.getClass(), "_quad1", 0);
        setField(term27356, term27356.getClass(), "_inputStream", null);
        setField(term27356, term27356.getClass(), "_inputBuffer", null);
        setBooleanField(term27356, term27356.getClass(), "_bufferRecyclable", false);
        setField(term27356, term27356.getClass(), "_ioContext", null);
        setBooleanField(term27356, term27356.getClass(), "_closed", false);
        setIntField(term27356, term27356.getClass(), "_inputPtr", 0);
        setIntField(term27356, term27356.getClass(), "_inputEnd", 0);
        setLongField(term27356, term27356.getClass(), "_currInputProcessed", 0L);
        setIntField(term27356, term27356.getClass(), "_currInputRow", 0);
        setIntField(term27356, term27356.getClass(), "_currInputRowStart", 0);
        setLongField(term27356, term27356.getClass(), "_tokenInputTotal", 0L);
        setIntField(term27356, term27356.getClass(), "_tokenInputRow", 0);
        setIntField(term27356, term27356.getClass(), "_tokenInputCol", 0);
        setField(term27356, term27356.getClass(), "_parsingContext", null);
        setField(term27356, term27356.getClass(), "_nextToken", null);
        setField(term27356, term27356.getClass(), "_textBuffer", null);
        setField(term27356, term27356.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term27356, term27356.getClass(), "_nameCopied", false);
        setField(term27356, term27356.getClass(), "_byteArrayBuilder", null);
        setField(term27356, term27356.getClass(), "_binaryValue", null);
        setIntField(term27356, term27356.getClass(), "_numTypesValid", 0);
        setIntField(term27356, term27356.getClass(), "_numberInt", 0);
        setLongField(term27356, term27356.getClass(), "_numberLong", 0L);
        setDoubleField(term27356, term27356.getClass(), "_numberDouble", 0.0);
        setField(term27356, term27356.getClass(), "_numberBigInt", null);
        setField(term27356, term27356.getClass(), "_numberBigDecimal", null);
        setBooleanField(term27356, term27356.getClass(), "_numberNegative", false);
        setIntField(term27356, term27356.getClass(), "_intLength", 0);
        setIntField(term27356, term27356.getClass(), "_fractLength", 0);
        setIntField(term27356, term27356.getClass(), "_expLength", 0);
        setField(term27356, term27356.getClass(), "_currToken", null);
        setField(term27356, term27356.getClass(), "_lastClearedToken", null);
        setIntField(term27356, term27356.getClass(), "_features", 0);
        setField(term27355, term27355.getClass(), "delegate", term27356);
        setIntField(term27355, term27355.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term26752;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27351));
        assertTrue(recursiveEquals(term26752, term27355));
    }

};


