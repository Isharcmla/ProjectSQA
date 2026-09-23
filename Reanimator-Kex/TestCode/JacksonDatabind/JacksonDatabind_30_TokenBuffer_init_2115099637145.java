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

public class TokenBuffer_init_2115099637145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18177;
     Object term18589;
     Object term18593;

    public TokenBuffer_init_2115099637145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18067 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term18067, term18067.getClass(), "_hasNativeId", false);
        term18177 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term18589 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term18590 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term18591 = (Object[]) newArray("java.lang.Object", 16);
        Object term18592 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term18589, term18589.getClass(), "_objectCodec", null);
        setIntField(term18589, term18589.getClass(), "_generatorFeatures", 31);
        setBooleanField(term18589, term18589.getClass(), "_closed", false);
        setBooleanField(term18589, term18589.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term18589, term18589.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term18589, term18589.getClass(), "_mayHaveNativeIds", false);
        setField(term18590, term18590.getClass(), "_next", null);
        setLongField(term18590, term18590.getClass(), "_tokenTypes", 0L);
        setField(term18590, term18590.getClass(), "_tokens", term18591);
        setField(term18590, term18590.getClass(), "_nativeIds", null);
        setField(term18589, term18589.getClass(), "_first", term18590);
        setField(term18589, term18589.getClass(), "_last", term18590);
        setIntField(term18589, term18589.getClass(), "_appendAt", 0);
        setField(term18589, term18589.getClass(), "_typeId", null);
        setField(term18589, term18589.getClass(), "_objectId", null);
        setBooleanField(term18589, term18589.getClass(), "_hasNativeId", false);
        setField(term18592, term18592.getClass(), "_parent", null);
        setField(term18592, term18592.getClass(), "_dups", null);
        setField(term18592, term18592.getClass(), "_child", null);
        setField(term18592, term18592.getClass(), "_currentName", null);
        setField(term18592, term18592.getClass(), "_currentValue", null);
        setBooleanField(term18592, term18592.getClass(), "_gotName", false);
        setIntField(term18592, term18592.getClass(), "_type", 0);
        setIntField(term18592, term18592.getClass(), "_index", -1);
        setField(term18589, term18589.getClass(), "_writeContext", term18592);
        setField(term18589, term18589.getClass(), "_cfgPrettyPrinter", null);
        term18593 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term18593, term18593.getClass(), "_objectCodec", null);
        setField(term18593, term18593.getClass(), "_symbols", null);
        setField(term18593, term18593.getClass(), "_quadBuffer", null);
        setBooleanField(term18593, term18593.getClass(), "_tokenIncomplete", false);
        setIntField(term18593, term18593.getClass(), "_quad1", 0);
        setField(term18593, term18593.getClass(), "_inputStream", null);
        setField(term18593, term18593.getClass(), "_inputBuffer", null);
        setBooleanField(term18593, term18593.getClass(), "_bufferRecyclable", false);
        setField(term18593, term18593.getClass(), "_ioContext", null);
        setBooleanField(term18593, term18593.getClass(), "_closed", false);
        setIntField(term18593, term18593.getClass(), "_inputPtr", 0);
        setIntField(term18593, term18593.getClass(), "_inputEnd", 0);
        setLongField(term18593, term18593.getClass(), "_currInputProcessed", 0L);
        setIntField(term18593, term18593.getClass(), "_currInputRow", 0);
        setIntField(term18593, term18593.getClass(), "_currInputRowStart", 0);
        setLongField(term18593, term18593.getClass(), "_tokenInputTotal", 0L);
        setIntField(term18593, term18593.getClass(), "_tokenInputRow", 0);
        setIntField(term18593, term18593.getClass(), "_tokenInputCol", 0);
        setField(term18593, term18593.getClass(), "_parsingContext", null);
        setField(term18593, term18593.getClass(), "_nextToken", null);
        setField(term18593, term18593.getClass(), "_textBuffer", null);
        setField(term18593, term18593.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term18593, term18593.getClass(), "_nameCopied", false);
        setField(term18593, term18593.getClass(), "_byteArrayBuilder", null);
        setField(term18593, term18593.getClass(), "_binaryValue", null);
        setIntField(term18593, term18593.getClass(), "_numTypesValid", 0);
        setIntField(term18593, term18593.getClass(), "_numberInt", 0);
        setLongField(term18593, term18593.getClass(), "_numberLong", 0L);
        setDoubleField(term18593, term18593.getClass(), "_numberDouble", 0.0);
        setField(term18593, term18593.getClass(), "_numberBigInt", null);
        setField(term18593, term18593.getClass(), "_numberBigDecimal", null);
        setBooleanField(term18593, term18593.getClass(), "_numberNegative", false);
        setIntField(term18593, term18593.getClass(), "_intLength", 0);
        setIntField(term18593, term18593.getClass(), "_fractLength", 0);
        setIntField(term18593, term18593.getClass(), "_expLength", 0);
        setField(term18593, term18593.getClass(), "_currToken", null);
        setField(term18593, term18593.getClass(), "_lastClearedToken", null);
        setIntField(term18593, term18593.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term18177;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18589));
        assertTrue(recursiveEquals(term18177, term18593));
    }

};


