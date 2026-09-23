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

public class MappingIterator_init_678306715138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88698;
     Object term88810;
     Object term88848;
     Object term88886;
     Object term88890;
     Object term88891;
     Object term88892;

    public MappingIterator_init_678306715138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88083 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        term88698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term88295 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term88443 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term88607 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        Object term88645 = newInstance(Class.forName("java.lang.Object"));
        setField(term88083, term88083.getClass(), "_type", term88698);
        setField(term88083, term88083.getClass(), "_parser", term88295);
        setField(term88083, term88083.getClass(), "_context", term88443);
        setField(term88083, term88083.getClass(), "_deserializer", term88607);
        setBooleanField(term88083, term88083.getClass(), "_closeParser", false);
        setField(term88083, term88083.getClass(), "_updatedValue", term88645);
        term88810 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term88848 = newInstance(Class.forName("java.lang.Object"));
        term88886 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term88887 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term88888 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term88889 = newInstance(Class.forName("java.lang.Object"));
        setField(term88887, term88887.getClass(), "_elementType", null);
        setField(term88887, term88887.getClass(), "_canonicalName", null);
        setField(term88887, term88887.getClass(), "_class", null);
        setIntField(term88887, term88887.getClass(), "_hash", 0);
        setField(term88887, term88887.getClass(), "_valueHandler", null);
        setField(term88887, term88887.getClass(), "_typeHandler", null);
        setBooleanField(term88887, term88887.getClass(), "_asStatic", false);
        setField(term88886, term88886.getClass(), "_type", term88887);
        setField(term88886, term88886.getClass(), "_context", null);
        setField(term88886, term88886.getClass(), "_deserializer", null);
        setField(term88888, term88888.getClass(), "_reader", null);
        setField(term88888, term88888.getClass(), "_inputBuffer", null);
        setBooleanField(term88888, term88888.getClass(), "_bufferRecyclable", false);
        setField(term88888, term88888.getClass(), "_objectCodec", null);
        setField(term88888, term88888.getClass(), "_symbols", null);
        setIntField(term88888, term88888.getClass(), "_hashSeed", 0);
        setBooleanField(term88888, term88888.getClass(), "_tokenIncomplete", false);
        setField(term88888, term88888.getClass(), "_ioContext", null);
        setBooleanField(term88888, term88888.getClass(), "_closed", false);
        setIntField(term88888, term88888.getClass(), "_inputPtr", 0);
        setIntField(term88888, term88888.getClass(), "_inputEnd", 0);
        setLongField(term88888, term88888.getClass(), "_currInputProcessed", 0L);
        setIntField(term88888, term88888.getClass(), "_currInputRow", 0);
        setIntField(term88888, term88888.getClass(), "_currInputRowStart", 0);
        setLongField(term88888, term88888.getClass(), "_tokenInputTotal", 0L);
        setIntField(term88888, term88888.getClass(), "_tokenInputRow", 0);
        setIntField(term88888, term88888.getClass(), "_tokenInputCol", 0);
        setField(term88888, term88888.getClass(), "_parsingContext", null);
        setField(term88888, term88888.getClass(), "_nextToken", null);
        setField(term88888, term88888.getClass(), "_textBuffer", null);
        setField(term88888, term88888.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term88888, term88888.getClass(), "_nameCopied", false);
        setField(term88888, term88888.getClass(), "_byteArrayBuilder", null);
        setField(term88888, term88888.getClass(), "_binaryValue", null);
        setIntField(term88888, term88888.getClass(), "_numTypesValid", 0);
        setIntField(term88888, term88888.getClass(), "_numberInt", 0);
        setLongField(term88888, term88888.getClass(), "_numberLong", 0L);
        setDoubleField(term88888, term88888.getClass(), "_numberDouble", 0.0);
        setField(term88888, term88888.getClass(), "_numberBigInt", null);
        setField(term88888, term88888.getClass(), "_numberBigDecimal", null);
        setBooleanField(term88888, term88888.getClass(), "_numberNegative", false);
        setIntField(term88888, term88888.getClass(), "_intLength", 0);
        setIntField(term88888, term88888.getClass(), "_fractLength", 0);
        setIntField(term88888, term88888.getClass(), "_expLength", 0);
        setField(term88888, term88888.getClass(), "_currToken", null);
        setField(term88888, term88888.getClass(), "_lastClearedToken", null);
        setIntField(term88888, term88888.getClass(), "_features", 0);
        setField(term88886, term88886.getClass(), "_parser", term88888);
        setField(term88886, term88886.getClass(), "_updatedValue", term88889);
        setBooleanField(term88886, term88886.getClass(), "_closeParser", true);
        setBooleanField(term88886, term88886.getClass(), "_hasNextChecked", false);
        term88890 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term88890, term88890.getClass(), "_reader", null);
        setField(term88890, term88890.getClass(), "_inputBuffer", null);
        setBooleanField(term88890, term88890.getClass(), "_bufferRecyclable", false);
        setField(term88890, term88890.getClass(), "_objectCodec", null);
        setField(term88890, term88890.getClass(), "_symbols", null);
        setIntField(term88890, term88890.getClass(), "_hashSeed", 0);
        setBooleanField(term88890, term88890.getClass(), "_tokenIncomplete", false);
        setField(term88890, term88890.getClass(), "_ioContext", null);
        setBooleanField(term88890, term88890.getClass(), "_closed", false);
        setIntField(term88890, term88890.getClass(), "_inputPtr", 0);
        setIntField(term88890, term88890.getClass(), "_inputEnd", 0);
        setLongField(term88890, term88890.getClass(), "_currInputProcessed", 0L);
        setIntField(term88890, term88890.getClass(), "_currInputRow", 0);
        setIntField(term88890, term88890.getClass(), "_currInputRowStart", 0);
        setLongField(term88890, term88890.getClass(), "_tokenInputTotal", 0L);
        setIntField(term88890, term88890.getClass(), "_tokenInputRow", 0);
        setIntField(term88890, term88890.getClass(), "_tokenInputCol", 0);
        setField(term88890, term88890.getClass(), "_parsingContext", null);
        setField(term88890, term88890.getClass(), "_nextToken", null);
        setField(term88890, term88890.getClass(), "_textBuffer", null);
        setField(term88890, term88890.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term88890, term88890.getClass(), "_nameCopied", false);
        setField(term88890, term88890.getClass(), "_byteArrayBuilder", null);
        setField(term88890, term88890.getClass(), "_binaryValue", null);
        setIntField(term88890, term88890.getClass(), "_numTypesValid", 0);
        setIntField(term88890, term88890.getClass(), "_numberInt", 0);
        setLongField(term88890, term88890.getClass(), "_numberLong", 0L);
        setDoubleField(term88890, term88890.getClass(), "_numberDouble", 0.0);
        setField(term88890, term88890.getClass(), "_numberBigInt", null);
        setField(term88890, term88890.getClass(), "_numberBigDecimal", null);
        setBooleanField(term88890, term88890.getClass(), "_numberNegative", false);
        setIntField(term88890, term88890.getClass(), "_intLength", 0);
        setIntField(term88890, term88890.getClass(), "_fractLength", 0);
        setIntField(term88890, term88890.getClass(), "_expLength", 0);
        setField(term88890, term88890.getClass(), "_currToken", null);
        setField(term88890, term88890.getClass(), "_lastClearedToken", null);
        setIntField(term88890, term88890.getClass(), "_features", 0);
        term88891 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term88891, term88891.getClass(), "_elementType", null);
        setField(term88891, term88891.getClass(), "_canonicalName", null);
        setField(term88891, term88891.getClass(), "_class", null);
        setIntField(term88891, term88891.getClass(), "_hash", 0);
        setField(term88891, term88891.getClass(), "_valueHandler", null);
        setField(term88891, term88891.getClass(), "_typeHandler", null);
        setBooleanField(term88891, term88891.getClass(), "_asStatic", false);
        term88892 = newInstance(Class.forName("java.lang.Object"));
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
        args[0] = term88698;
        args[1] = term88810;
        args[2] = null;
        args[3] = null;
        args[4] = true;
        args[5] = term88848;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88886));
        assertTrue(recursiveEquals(term88698, term88890));
        assertTrue(recursiveEquals(term88810, term88891));
        assertTrue(recursiveEquals(term88848, term88892));
    }

};


