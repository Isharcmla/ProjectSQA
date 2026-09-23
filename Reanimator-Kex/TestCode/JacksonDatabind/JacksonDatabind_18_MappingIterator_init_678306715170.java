package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class MappingIterator_init_678306715170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121672;
     Object term121706;
     Object term121708;

    public MappingIterator_init_678306715170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121242 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term121390 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term121524 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        Object term121562 = newInstance(Class.forName("java.lang.Object"));
        setField(term121242, term121242.getClass(), "_type", null);
        setField(term121242, term121242.getClass(), "_parser", null);
        setField(term121242, term121242.getClass(), "_context", term121390);
        setField(term121242, term121242.getClass(), "_deserializer", term121524);
        setBooleanField(term121242, term121242.getClass(), "_closeParser", false);
        setField(term121242, term121242.getClass(), "_updatedValue", term121562);
        term121672 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        term121706 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term121707 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term121706, term121706.getClass(), "_type", null);
        setField(term121706, term121706.getClass(), "_context", null);
        setField(term121706, term121706.getClass(), "_deserializer", null);
        setField(term121707, term121707.getClass(), "_objectCodec", null);
        setField(term121707, term121707.getClass(), "_symbols", null);
        setField(term121707, term121707.getClass(), "_quadBuffer", null);
        setBooleanField(term121707, term121707.getClass(), "_tokenIncomplete", false);
        setIntField(term121707, term121707.getClass(), "_quad1", 0);
        setField(term121707, term121707.getClass(), "_inputStream", null);
        setField(term121707, term121707.getClass(), "_inputBuffer", null);
        setBooleanField(term121707, term121707.getClass(), "_bufferRecyclable", false);
        setField(term121707, term121707.getClass(), "_ioContext", null);
        setBooleanField(term121707, term121707.getClass(), "_closed", false);
        setIntField(term121707, term121707.getClass(), "_inputPtr", 0);
        setIntField(term121707, term121707.getClass(), "_inputEnd", 0);
        setLongField(term121707, term121707.getClass(), "_currInputProcessed", 0L);
        setIntField(term121707, term121707.getClass(), "_currInputRow", 0);
        setIntField(term121707, term121707.getClass(), "_currInputRowStart", 0);
        setLongField(term121707, term121707.getClass(), "_tokenInputTotal", 0L);
        setIntField(term121707, term121707.getClass(), "_tokenInputRow", 0);
        setIntField(term121707, term121707.getClass(), "_tokenInputCol", 0);
        setField(term121707, term121707.getClass(), "_parsingContext", null);
        setField(term121707, term121707.getClass(), "_nextToken", null);
        setField(term121707, term121707.getClass(), "_textBuffer", null);
        setField(term121707, term121707.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term121707, term121707.getClass(), "_nameCopied", false);
        setField(term121707, term121707.getClass(), "_byteArrayBuilder", null);
        setField(term121707, term121707.getClass(), "_binaryValue", null);
        setIntField(term121707, term121707.getClass(), "_numTypesValid", 0);
        setIntField(term121707, term121707.getClass(), "_numberInt", 0);
        setLongField(term121707, term121707.getClass(), "_numberLong", 0L);
        setDoubleField(term121707, term121707.getClass(), "_numberDouble", 0.0);
        setField(term121707, term121707.getClass(), "_numberBigInt", null);
        setField(term121707, term121707.getClass(), "_numberBigDecimal", null);
        setBooleanField(term121707, term121707.getClass(), "_numberNegative", false);
        setIntField(term121707, term121707.getClass(), "_intLength", 0);
        setIntField(term121707, term121707.getClass(), "_fractLength", 0);
        setIntField(term121707, term121707.getClass(), "_expLength", 0);
        setField(term121707, term121707.getClass(), "_currToken", null);
        setField(term121707, term121707.getClass(), "_lastClearedToken", null);
        setIntField(term121707, term121707.getClass(), "_features", 0);
        setField(term121706, term121706.getClass(), "_parser", term121707);
        setField(term121706, term121706.getClass(), "_updatedValue", null);
        setBooleanField(term121706, term121706.getClass(), "_closeParser", true);
        setBooleanField(term121706, term121706.getClass(), "_hasNextChecked", false);
        term121708 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term121708, term121708.getClass(), "_objectCodec", null);
        setField(term121708, term121708.getClass(), "_symbols", null);
        setField(term121708, term121708.getClass(), "_quadBuffer", null);
        setBooleanField(term121708, term121708.getClass(), "_tokenIncomplete", false);
        setIntField(term121708, term121708.getClass(), "_quad1", 0);
        setField(term121708, term121708.getClass(), "_inputStream", null);
        setField(term121708, term121708.getClass(), "_inputBuffer", null);
        setBooleanField(term121708, term121708.getClass(), "_bufferRecyclable", false);
        setField(term121708, term121708.getClass(), "_ioContext", null);
        setBooleanField(term121708, term121708.getClass(), "_closed", false);
        setIntField(term121708, term121708.getClass(), "_inputPtr", 0);
        setIntField(term121708, term121708.getClass(), "_inputEnd", 0);
        setLongField(term121708, term121708.getClass(), "_currInputProcessed", 0L);
        setIntField(term121708, term121708.getClass(), "_currInputRow", 0);
        setIntField(term121708, term121708.getClass(), "_currInputRowStart", 0);
        setLongField(term121708, term121708.getClass(), "_tokenInputTotal", 0L);
        setIntField(term121708, term121708.getClass(), "_tokenInputRow", 0);
        setIntField(term121708, term121708.getClass(), "_tokenInputCol", 0);
        setField(term121708, term121708.getClass(), "_parsingContext", null);
        setField(term121708, term121708.getClass(), "_nextToken", null);
        setField(term121708, term121708.getClass(), "_textBuffer", null);
        setField(term121708, term121708.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term121708, term121708.getClass(), "_nameCopied", false);
        setField(term121708, term121708.getClass(), "_byteArrayBuilder", null);
        setField(term121708, term121708.getClass(), "_binaryValue", null);
        setIntField(term121708, term121708.getClass(), "_numTypesValid", 0);
        setIntField(term121708, term121708.getClass(), "_numberInt", 0);
        setLongField(term121708, term121708.getClass(), "_numberLong", 0L);
        setDoubleField(term121708, term121708.getClass(), "_numberDouble", 0.0);
        setField(term121708, term121708.getClass(), "_numberBigInt", null);
        setField(term121708, term121708.getClass(), "_numberBigDecimal", null);
        setBooleanField(term121708, term121708.getClass(), "_numberNegative", false);
        setIntField(term121708, term121708.getClass(), "_intLength", 0);
        setIntField(term121708, term121708.getClass(), "_fractLength", 0);
        setIntField(term121708, term121708.getClass(), "_expLength", 0);
        setField(term121708, term121708.getClass(), "_currToken", null);
        setField(term121708, term121708.getClass(), "_lastClearedToken", null);
        setIntField(term121708, term121708.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term121672;
        args[2] = null;
        args[3] = null;
        args[4] = true;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term121706));
        assertTrue(recursiveEquals(term121672, null));
    }

};


