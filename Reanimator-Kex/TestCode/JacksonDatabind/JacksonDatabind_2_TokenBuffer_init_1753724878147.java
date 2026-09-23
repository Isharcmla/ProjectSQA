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

public class TokenBuffer_init_1753724878147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19134;
     Object term19181;
     Object term19185;

    public TokenBuffer_init_1753724878147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19024 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term19024, term19024.getClass(), "_hasNativeId", false);
        term19134 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term19181 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term19182 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term19183 = (Object[]) newArray("java.lang.Object", 16);
        Object term19184 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term19181, term19181.getClass(), "_objectCodec", null);
        setIntField(term19181, term19181.getClass(), "_generatorFeatures", 79);
        setBooleanField(term19181, term19181.getClass(), "_closed", false);
        setBooleanField(term19181, term19181.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term19181, term19181.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term19181, term19181.getClass(), "_mayHaveNativeIds", false);
        setField(term19182, term19182.getClass(), "_next", null);
        setLongField(term19182, term19182.getClass(), "_tokenTypes", 0L);
        setField(term19182, term19182.getClass(), "_tokens", term19183);
        setField(term19182, term19182.getClass(), "_nativeIds", null);
        setField(term19181, term19181.getClass(), "_first", term19182);
        setField(term19181, term19181.getClass(), "_last", term19182);
        setIntField(term19181, term19181.getClass(), "_appendAt", 0);
        setField(term19181, term19181.getClass(), "_typeId", null);
        setField(term19181, term19181.getClass(), "_objectId", null);
        setBooleanField(term19181, term19181.getClass(), "_hasNativeId", false);
        setField(term19184, term19184.getClass(), "_parent", null);
        setField(term19184, term19184.getClass(), "_dups", null);
        setField(term19184, term19184.getClass(), "_child", null);
        setField(term19184, term19184.getClass(), "_currentName", null);
        setBooleanField(term19184, term19184.getClass(), "_gotName", false);
        setIntField(term19184, term19184.getClass(), "_type", 0);
        setIntField(term19184, term19184.getClass(), "_index", -1);
        setField(term19181, term19181.getClass(), "_writeContext", term19184);
        setField(term19181, term19181.getClass(), "_cfgPrettyPrinter", null);
        term19185 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term19185, term19185.getClass(), "_objectCodec", null);
        setField(term19185, term19185.getClass(), "_symbols", null);
        setField(term19185, term19185.getClass(), "_quadBuffer", null);
        setBooleanField(term19185, term19185.getClass(), "_tokenIncomplete", false);
        setIntField(term19185, term19185.getClass(), "_quad1", 0);
        setField(term19185, term19185.getClass(), "_inputStream", null);
        setField(term19185, term19185.getClass(), "_inputBuffer", null);
        setBooleanField(term19185, term19185.getClass(), "_bufferRecyclable", false);
        setField(term19185, term19185.getClass(), "_ioContext", null);
        setBooleanField(term19185, term19185.getClass(), "_closed", false);
        setIntField(term19185, term19185.getClass(), "_inputPtr", 0);
        setIntField(term19185, term19185.getClass(), "_inputEnd", 0);
        setLongField(term19185, term19185.getClass(), "_currInputProcessed", 0L);
        setIntField(term19185, term19185.getClass(), "_currInputRow", 0);
        setIntField(term19185, term19185.getClass(), "_currInputRowStart", 0);
        setLongField(term19185, term19185.getClass(), "_tokenInputTotal", 0L);
        setIntField(term19185, term19185.getClass(), "_tokenInputRow", 0);
        setIntField(term19185, term19185.getClass(), "_tokenInputCol", 0);
        setField(term19185, term19185.getClass(), "_parsingContext", null);
        setField(term19185, term19185.getClass(), "_nextToken", null);
        setField(term19185, term19185.getClass(), "_textBuffer", null);
        setField(term19185, term19185.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term19185, term19185.getClass(), "_nameCopied", false);
        setField(term19185, term19185.getClass(), "_byteArrayBuilder", null);
        setField(term19185, term19185.getClass(), "_binaryValue", null);
        setIntField(term19185, term19185.getClass(), "_numTypesValid", 0);
        setIntField(term19185, term19185.getClass(), "_numberInt", 0);
        setLongField(term19185, term19185.getClass(), "_numberLong", 0L);
        setDoubleField(term19185, term19185.getClass(), "_numberDouble", 0.0);
        setField(term19185, term19185.getClass(), "_numberBigInt", null);
        setField(term19185, term19185.getClass(), "_numberBigDecimal", null);
        setBooleanField(term19185, term19185.getClass(), "_numberNegative", false);
        setIntField(term19185, term19185.getClass(), "_intLength", 0);
        setIntField(term19185, term19185.getClass(), "_fractLength", 0);
        setIntField(term19185, term19185.getClass(), "_expLength", 0);
        setField(term19185, term19185.getClass(), "_currToken", null);
        setField(term19185, term19185.getClass(), "_lastClearedToken", null);
        setIntField(term19185, term19185.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term19134;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19181));
        assertTrue(recursiveEquals(term19134, term19185));
    }

};


