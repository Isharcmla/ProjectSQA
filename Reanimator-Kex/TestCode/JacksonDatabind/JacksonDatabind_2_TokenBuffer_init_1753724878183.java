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

public class TokenBuffer_init_1753724878183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34611;
     Object term35229;
     Object term35233;

    public TokenBuffer_init_1753724878183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34195 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term34287 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34389 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term34505 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term34195, term34195.getClass(), "_hasNativeId", false);
        setField(term34195, term34195.getClass(), "_objectCodec", term34287);
        setIntField(term34195, term34195.getClass(), "_generatorFeatures", 0);
        setField(term34195, term34195.getClass(), "_writeContext", term34389);
        setField(term34195, term34195.getClass(), "_last", null);
        setField(term34195, term34195.getClass(), "_first", term34505);
        setIntField(term34195, term34195.getClass(), "_appendAt", 0);
        setBooleanField(term34195, term34195.getClass(), "_hasNativeTypeIds", false);
        term34611 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34717 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34823 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34933 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term34933, term34933.getClass(), "_objectCodec", null);
        setField(term34823, term34823.getClass(), "delegate", term34933);
        setField(term34717, term34717.getClass(), "delegate", term34823);
        setField(term34611, term34611.getClass(), "delegate", term34717);
        term35229 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term35230 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term35231 = (Object[]) newArray("java.lang.Object", 16);
        Object term35232 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term35229, term35229.getClass(), "_objectCodec", null);
        setIntField(term35229, term35229.getClass(), "_generatorFeatures", 79);
        setBooleanField(term35229, term35229.getClass(), "_closed", false);
        setBooleanField(term35229, term35229.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term35229, term35229.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term35229, term35229.getClass(), "_mayHaveNativeIds", false);
        setField(term35230, term35230.getClass(), "_next", null);
        setLongField(term35230, term35230.getClass(), "_tokenTypes", 0L);
        setField(term35230, term35230.getClass(), "_tokens", term35231);
        setField(term35230, term35230.getClass(), "_nativeIds", null);
        setField(term35229, term35229.getClass(), "_first", term35230);
        setField(term35229, term35229.getClass(), "_last", term35230);
        setIntField(term35229, term35229.getClass(), "_appendAt", 0);
        setField(term35229, term35229.getClass(), "_typeId", null);
        setField(term35229, term35229.getClass(), "_objectId", null);
        setBooleanField(term35229, term35229.getClass(), "_hasNativeId", false);
        setField(term35232, term35232.getClass(), "_parent", null);
        setField(term35232, term35232.getClass(), "_dups", null);
        setField(term35232, term35232.getClass(), "_child", null);
        setField(term35232, term35232.getClass(), "_currentName", null);
        setBooleanField(term35232, term35232.getClass(), "_gotName", false);
        setIntField(term35232, term35232.getClass(), "_type", 0);
        setIntField(term35232, term35232.getClass(), "_index", -1);
        setField(term35229, term35229.getClass(), "_writeContext", term35232);
        setField(term35229, term35229.getClass(), "_cfgPrettyPrinter", null);
        term35233 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term35234 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term35235 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term35236 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term35233, term35233.getClass(), "_parsers", null);
        setIntField(term35233, term35233.getClass(), "_nextParser", 0);
        setField(term35234, term35234.getClass(), "_parsers", null);
        setIntField(term35234, term35234.getClass(), "_nextParser", 0);
        setField(term35235, term35235.getClass(), "_parsers", null);
        setIntField(term35235, term35235.getClass(), "_nextParser", 0);
        setField(term35236, term35236.getClass(), "_objectCodec", null);
        setField(term35236, term35236.getClass(), "_symbols", null);
        setField(term35236, term35236.getClass(), "_quadBuffer", null);
        setBooleanField(term35236, term35236.getClass(), "_tokenIncomplete", false);
        setIntField(term35236, term35236.getClass(), "_quad1", 0);
        setField(term35236, term35236.getClass(), "_inputStream", null);
        setField(term35236, term35236.getClass(), "_inputBuffer", null);
        setBooleanField(term35236, term35236.getClass(), "_bufferRecyclable", false);
        setField(term35236, term35236.getClass(), "_ioContext", null);
        setBooleanField(term35236, term35236.getClass(), "_closed", false);
        setIntField(term35236, term35236.getClass(), "_inputPtr", 0);
        setIntField(term35236, term35236.getClass(), "_inputEnd", 0);
        setLongField(term35236, term35236.getClass(), "_currInputProcessed", 0L);
        setIntField(term35236, term35236.getClass(), "_currInputRow", 0);
        setIntField(term35236, term35236.getClass(), "_currInputRowStart", 0);
        setLongField(term35236, term35236.getClass(), "_tokenInputTotal", 0L);
        setIntField(term35236, term35236.getClass(), "_tokenInputRow", 0);
        setIntField(term35236, term35236.getClass(), "_tokenInputCol", 0);
        setField(term35236, term35236.getClass(), "_parsingContext", null);
        setField(term35236, term35236.getClass(), "_nextToken", null);
        setField(term35236, term35236.getClass(), "_textBuffer", null);
        setField(term35236, term35236.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term35236, term35236.getClass(), "_nameCopied", false);
        setField(term35236, term35236.getClass(), "_byteArrayBuilder", null);
        setField(term35236, term35236.getClass(), "_binaryValue", null);
        setIntField(term35236, term35236.getClass(), "_numTypesValid", 0);
        setIntField(term35236, term35236.getClass(), "_numberInt", 0);
        setLongField(term35236, term35236.getClass(), "_numberLong", 0L);
        setDoubleField(term35236, term35236.getClass(), "_numberDouble", 0.0);
        setField(term35236, term35236.getClass(), "_numberBigInt", null);
        setField(term35236, term35236.getClass(), "_numberBigDecimal", null);
        setBooleanField(term35236, term35236.getClass(), "_numberNegative", false);
        setIntField(term35236, term35236.getClass(), "_intLength", 0);
        setIntField(term35236, term35236.getClass(), "_fractLength", 0);
        setIntField(term35236, term35236.getClass(), "_expLength", 0);
        setField(term35236, term35236.getClass(), "_currToken", null);
        setField(term35236, term35236.getClass(), "_lastClearedToken", null);
        setIntField(term35236, term35236.getClass(), "_features", 0);
        setField(term35235, term35235.getClass(), "delegate", term35236);
        setIntField(term35235, term35235.getClass(), "_features", 0);
        setField(term35234, term35234.getClass(), "delegate", term35235);
        setIntField(term35234, term35234.getClass(), "_features", 0);
        setField(term35233, term35233.getClass(), "delegate", term35234);
        setIntField(term35233, term35233.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term34611;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35229));
        assertTrue(recursiveEquals(term34611, term35233));
    }

};


