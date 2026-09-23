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

public class TokenBuffer_init_1753724878159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22410;
     Object term22830;
     Object term22834;

    public TokenBuffer_init_1753724878159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22304 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term22304, term22304.getClass(), "_hasNativeId", false);
        term22410 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term22516 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term22626 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term22516, term22516.getClass(), "delegate", term22626);
        setField(term22410, term22410.getClass(), "delegate", term22516);
        term22830 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term22831 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term22832 = (Object[]) newArray("java.lang.Object", 16);
        Object term22833 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term22830, term22830.getClass(), "_objectCodec", null);
        setIntField(term22830, term22830.getClass(), "_generatorFeatures", 79);
        setBooleanField(term22830, term22830.getClass(), "_closed", false);
        setBooleanField(term22830, term22830.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term22830, term22830.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term22830, term22830.getClass(), "_mayHaveNativeIds", false);
        setField(term22831, term22831.getClass(), "_next", null);
        setLongField(term22831, term22831.getClass(), "_tokenTypes", 0L);
        setField(term22831, term22831.getClass(), "_tokens", term22832);
        setField(term22831, term22831.getClass(), "_nativeIds", null);
        setField(term22830, term22830.getClass(), "_first", term22831);
        setField(term22830, term22830.getClass(), "_last", term22831);
        setIntField(term22830, term22830.getClass(), "_appendAt", 0);
        setField(term22830, term22830.getClass(), "_typeId", null);
        setField(term22830, term22830.getClass(), "_objectId", null);
        setBooleanField(term22830, term22830.getClass(), "_hasNativeId", false);
        setField(term22833, term22833.getClass(), "_parent", null);
        setField(term22833, term22833.getClass(), "_dups", null);
        setField(term22833, term22833.getClass(), "_child", null);
        setField(term22833, term22833.getClass(), "_currentName", null);
        setBooleanField(term22833, term22833.getClass(), "_gotName", false);
        setIntField(term22833, term22833.getClass(), "_type", 0);
        setIntField(term22833, term22833.getClass(), "_index", -1);
        setField(term22830, term22830.getClass(), "_writeContext", term22833);
        setField(term22830, term22830.getClass(), "_cfgPrettyPrinter", null);
        term22834 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term22835 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term22836 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term22834, term22834.getClass(), "_parsers", null);
        setIntField(term22834, term22834.getClass(), "_nextParser", 0);
        setField(term22835, term22835.getClass(), "_parsers", null);
        setIntField(term22835, term22835.getClass(), "_nextParser", 0);
        setField(term22836, term22836.getClass(), "_objectCodec", null);
        setField(term22836, term22836.getClass(), "_symbols", null);
        setField(term22836, term22836.getClass(), "_quadBuffer", null);
        setBooleanField(term22836, term22836.getClass(), "_tokenIncomplete", false);
        setIntField(term22836, term22836.getClass(), "_quad1", 0);
        setField(term22836, term22836.getClass(), "_inputStream", null);
        setField(term22836, term22836.getClass(), "_inputBuffer", null);
        setBooleanField(term22836, term22836.getClass(), "_bufferRecyclable", false);
        setField(term22836, term22836.getClass(), "_ioContext", null);
        setBooleanField(term22836, term22836.getClass(), "_closed", false);
        setIntField(term22836, term22836.getClass(), "_inputPtr", 0);
        setIntField(term22836, term22836.getClass(), "_inputEnd", 0);
        setLongField(term22836, term22836.getClass(), "_currInputProcessed", 0L);
        setIntField(term22836, term22836.getClass(), "_currInputRow", 0);
        setIntField(term22836, term22836.getClass(), "_currInputRowStart", 0);
        setLongField(term22836, term22836.getClass(), "_tokenInputTotal", 0L);
        setIntField(term22836, term22836.getClass(), "_tokenInputRow", 0);
        setIntField(term22836, term22836.getClass(), "_tokenInputCol", 0);
        setField(term22836, term22836.getClass(), "_parsingContext", null);
        setField(term22836, term22836.getClass(), "_nextToken", null);
        setField(term22836, term22836.getClass(), "_textBuffer", null);
        setField(term22836, term22836.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term22836, term22836.getClass(), "_nameCopied", false);
        setField(term22836, term22836.getClass(), "_byteArrayBuilder", null);
        setField(term22836, term22836.getClass(), "_binaryValue", null);
        setIntField(term22836, term22836.getClass(), "_numTypesValid", 0);
        setIntField(term22836, term22836.getClass(), "_numberInt", 0);
        setLongField(term22836, term22836.getClass(), "_numberLong", 0L);
        setDoubleField(term22836, term22836.getClass(), "_numberDouble", 0.0);
        setField(term22836, term22836.getClass(), "_numberBigInt", null);
        setField(term22836, term22836.getClass(), "_numberBigDecimal", null);
        setBooleanField(term22836, term22836.getClass(), "_numberNegative", false);
        setIntField(term22836, term22836.getClass(), "_intLength", 0);
        setIntField(term22836, term22836.getClass(), "_fractLength", 0);
        setIntField(term22836, term22836.getClass(), "_expLength", 0);
        setField(term22836, term22836.getClass(), "_currToken", null);
        setField(term22836, term22836.getClass(), "_lastClearedToken", null);
        setIntField(term22836, term22836.getClass(), "_features", 0);
        setField(term22835, term22835.getClass(), "delegate", term22836);
        setIntField(term22835, term22835.getClass(), "_features", 0);
        setField(term22834, term22834.getClass(), "delegate", term22835);
        setIntField(term22834, term22834.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term22410;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22830));
        assertTrue(recursiveEquals(term22410, term22834));
    }

};


