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

public class TokenBuffer_init_1753724878197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33671;
     Object term33902;
     Object term33906;

    public TokenBuffer_init_1753724878197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33565 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term33565, term33565.getClass(), "_hasNativeId", false);
        term33671 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term33781 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term33671, term33671.getClass(), "delegate", term33781);
        term33902 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term33903 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term33904 = (Object[]) newArray("java.lang.Object", 16);
        Object term33905 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term33902, term33902.getClass(), "_objectCodec", null);
        setIntField(term33902, term33902.getClass(), "_generatorFeatures", 31);
        setBooleanField(term33902, term33902.getClass(), "_closed", false);
        setBooleanField(term33902, term33902.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term33902, term33902.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term33902, term33902.getClass(), "_mayHaveNativeIds", false);
        setField(term33903, term33903.getClass(), "_next", null);
        setLongField(term33903, term33903.getClass(), "_tokenTypes", 0L);
        setField(term33903, term33903.getClass(), "_tokens", term33904);
        setField(term33903, term33903.getClass(), "_nativeIds", null);
        setField(term33902, term33902.getClass(), "_first", term33903);
        setField(term33902, term33902.getClass(), "_last", term33903);
        setIntField(term33902, term33902.getClass(), "_appendAt", 0);
        setField(term33902, term33902.getClass(), "_typeId", null);
        setField(term33902, term33902.getClass(), "_objectId", null);
        setBooleanField(term33902, term33902.getClass(), "_hasNativeId", false);
        setField(term33905, term33905.getClass(), "_parent", null);
        setField(term33905, term33905.getClass(), "_dups", null);
        setField(term33905, term33905.getClass(), "_child", null);
        setField(term33905, term33905.getClass(), "_currentName", null);
        setField(term33905, term33905.getClass(), "_currentValue", null);
        setBooleanField(term33905, term33905.getClass(), "_gotName", false);
        setIntField(term33905, term33905.getClass(), "_type", 0);
        setIntField(term33905, term33905.getClass(), "_index", -1);
        setField(term33902, term33902.getClass(), "_writeContext", term33905);
        setField(term33902, term33902.getClass(), "_cfgPrettyPrinter", null);
        term33906 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term33907 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term33906, term33906.getClass(), "_parsers", null);
        setIntField(term33906, term33906.getClass(), "_nextParser", 0);
        setField(term33907, term33907.getClass(), "_objectCodec", null);
        setField(term33907, term33907.getClass(), "_symbols", null);
        setField(term33907, term33907.getClass(), "_quadBuffer", null);
        setBooleanField(term33907, term33907.getClass(), "_tokenIncomplete", false);
        setIntField(term33907, term33907.getClass(), "_quad1", 0);
        setField(term33907, term33907.getClass(), "_inputStream", null);
        setField(term33907, term33907.getClass(), "_inputBuffer", null);
        setBooleanField(term33907, term33907.getClass(), "_bufferRecyclable", false);
        setField(term33907, term33907.getClass(), "_ioContext", null);
        setBooleanField(term33907, term33907.getClass(), "_closed", false);
        setIntField(term33907, term33907.getClass(), "_inputPtr", 0);
        setIntField(term33907, term33907.getClass(), "_inputEnd", 0);
        setLongField(term33907, term33907.getClass(), "_currInputProcessed", 0L);
        setIntField(term33907, term33907.getClass(), "_currInputRow", 0);
        setIntField(term33907, term33907.getClass(), "_currInputRowStart", 0);
        setLongField(term33907, term33907.getClass(), "_tokenInputTotal", 0L);
        setIntField(term33907, term33907.getClass(), "_tokenInputRow", 0);
        setIntField(term33907, term33907.getClass(), "_tokenInputCol", 0);
        setField(term33907, term33907.getClass(), "_parsingContext", null);
        setField(term33907, term33907.getClass(), "_nextToken", null);
        setField(term33907, term33907.getClass(), "_textBuffer", null);
        setField(term33907, term33907.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term33907, term33907.getClass(), "_nameCopied", false);
        setField(term33907, term33907.getClass(), "_byteArrayBuilder", null);
        setField(term33907, term33907.getClass(), "_binaryValue", null);
        setIntField(term33907, term33907.getClass(), "_numTypesValid", 0);
        setIntField(term33907, term33907.getClass(), "_numberInt", 0);
        setLongField(term33907, term33907.getClass(), "_numberLong", 0L);
        setDoubleField(term33907, term33907.getClass(), "_numberDouble", 0.0);
        setField(term33907, term33907.getClass(), "_numberBigInt", null);
        setField(term33907, term33907.getClass(), "_numberBigDecimal", null);
        setBooleanField(term33907, term33907.getClass(), "_numberNegative", false);
        setIntField(term33907, term33907.getClass(), "_intLength", 0);
        setIntField(term33907, term33907.getClass(), "_fractLength", 0);
        setIntField(term33907, term33907.getClass(), "_expLength", 0);
        setField(term33907, term33907.getClass(), "_currToken", null);
        setField(term33907, term33907.getClass(), "_lastClearedToken", null);
        setIntField(term33907, term33907.getClass(), "_features", 0);
        setField(term33906, term33906.getClass(), "delegate", term33907);
        setIntField(term33906, term33906.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term33671;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33902));
        assertTrue(recursiveEquals(term33671, term33906));
    }

};


