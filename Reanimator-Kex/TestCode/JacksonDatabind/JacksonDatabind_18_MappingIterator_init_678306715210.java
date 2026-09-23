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
import java.lang.String;

public class MappingIterator_init_678306715210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165407;
     Object term165848;
     Object term165859;

    public MappingIterator_init_678306715210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165041 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term165147 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term165295 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term165041, term165041.getClass(), "_type", null);
        setField(term165041, term165041.getClass(), "_parser", term165147);
        setField(term165041, term165041.getClass(), "_context", term165295);
        setField(term165041, term165041.getClass(), "_deserializer", null);
        setBooleanField(term165041, term165041.getClass(), "_closeParser", false);
        setField(term165041, term165041.getClass(), "_updatedValue", null);
        Class<? extends Object> term165870 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term165869 = ((Class) term165870).getDeclaredField((String) "START_ARRAY");
        ((Field) term165869).setAccessible(true);
        Object enum99 = ((Field) term165869).get((Object) null);
        term165407 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term165407, term165407.getClass(), "_currToken", enum99);
        Class<? extends Object> term166090 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term166089 = ((Class) term166090).getDeclaredField((String) "START_ARRAY");
        ((Field) term166089).setAccessible(true);
        Object enum100 = ((Field) term166089).get((Object) null);
        term165848 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term165849 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term165848, term165848.getClass(), "_type", null);
        setField(term165848, term165848.getClass(), "_context", null);
        setField(term165848, term165848.getClass(), "_deserializer", null);
        setField(term165849, term165849.getClass(), "_reader", null);
        setField(term165849, term165849.getClass(), "_inputBuffer", null);
        setBooleanField(term165849, term165849.getClass(), "_bufferRecyclable", false);
        setField(term165849, term165849.getClass(), "_objectCodec", null);
        setField(term165849, term165849.getClass(), "_symbols", null);
        setIntField(term165849, term165849.getClass(), "_hashSeed", 0);
        setBooleanField(term165849, term165849.getClass(), "_tokenIncomplete", false);
        setField(term165849, term165849.getClass(), "_ioContext", null);
        setBooleanField(term165849, term165849.getClass(), "_closed", false);
        setIntField(term165849, term165849.getClass(), "_inputPtr", 0);
        setIntField(term165849, term165849.getClass(), "_inputEnd", 0);
        setLongField(term165849, term165849.getClass(), "_currInputProcessed", 0L);
        setIntField(term165849, term165849.getClass(), "_currInputRow", 0);
        setIntField(term165849, term165849.getClass(), "_currInputRowStart", 0);
        setLongField(term165849, term165849.getClass(), "_tokenInputTotal", 0L);
        setIntField(term165849, term165849.getClass(), "_tokenInputRow", 0);
        setIntField(term165849, term165849.getClass(), "_tokenInputCol", 0);
        setField(term165849, term165849.getClass(), "_parsingContext", null);
        setField(term165849, term165849.getClass(), "_nextToken", null);
        setField(term165849, term165849.getClass(), "_textBuffer", null);
        setField(term165849, term165849.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term165849, term165849.getClass(), "_nameCopied", false);
        setField(term165849, term165849.getClass(), "_byteArrayBuilder", null);
        setField(term165849, term165849.getClass(), "_binaryValue", null);
        setIntField(term165849, term165849.getClass(), "_numTypesValid", 0);
        setIntField(term165849, term165849.getClass(), "_numberInt", 0);
        setLongField(term165849, term165849.getClass(), "_numberLong", 0L);
        setDoubleField(term165849, term165849.getClass(), "_numberDouble", 0.0);
        setField(term165849, term165849.getClass(), "_numberBigInt", null);
        setField(term165849, term165849.getClass(), "_numberBigDecimal", null);
        setBooleanField(term165849, term165849.getClass(), "_numberNegative", false);
        setIntField(term165849, term165849.getClass(), "_intLength", 0);
        setIntField(term165849, term165849.getClass(), "_fractLength", 0);
        setIntField(term165849, term165849.getClass(), "_expLength", 0);
        setField(term165849, term165849.getClass(), "_currToken", null);
        setField(term165849, term165849.getClass(), "_lastClearedToken", enum100);
        setIntField(term165849, term165849.getClass(), "_features", 0);
        setField(term165848, term165848.getClass(), "_parser", term165849);
        setField(term165848, term165848.getClass(), "_updatedValue", "");
        setBooleanField(term165848, term165848.getClass(), "_closeParser", true);
        setBooleanField(term165848, term165848.getClass(), "_hasNextChecked", false);
        Class<? extends Object> term166310 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term166309 = ((Class) term166310).getDeclaredField((String) "START_ARRAY");
        ((Field) term166309).setAccessible(true);
        Object enum101 = ((Field) term166309).get((Object) null);
        term165859 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term165859, term165859.getClass(), "_reader", null);
        setField(term165859, term165859.getClass(), "_inputBuffer", null);
        setBooleanField(term165859, term165859.getClass(), "_bufferRecyclable", false);
        setField(term165859, term165859.getClass(), "_objectCodec", null);
        setField(term165859, term165859.getClass(), "_symbols", null);
        setIntField(term165859, term165859.getClass(), "_hashSeed", 0);
        setBooleanField(term165859, term165859.getClass(), "_tokenIncomplete", false);
        setField(term165859, term165859.getClass(), "_ioContext", null);
        setBooleanField(term165859, term165859.getClass(), "_closed", false);
        setIntField(term165859, term165859.getClass(), "_inputPtr", 0);
        setIntField(term165859, term165859.getClass(), "_inputEnd", 0);
        setLongField(term165859, term165859.getClass(), "_currInputProcessed", 0L);
        setIntField(term165859, term165859.getClass(), "_currInputRow", 0);
        setIntField(term165859, term165859.getClass(), "_currInputRowStart", 0);
        setLongField(term165859, term165859.getClass(), "_tokenInputTotal", 0L);
        setIntField(term165859, term165859.getClass(), "_tokenInputRow", 0);
        setIntField(term165859, term165859.getClass(), "_tokenInputCol", 0);
        setField(term165859, term165859.getClass(), "_parsingContext", null);
        setField(term165859, term165859.getClass(), "_nextToken", null);
        setField(term165859, term165859.getClass(), "_textBuffer", null);
        setField(term165859, term165859.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term165859, term165859.getClass(), "_nameCopied", false);
        setField(term165859, term165859.getClass(), "_byteArrayBuilder", null);
        setField(term165859, term165859.getClass(), "_binaryValue", null);
        setIntField(term165859, term165859.getClass(), "_numTypesValid", 0);
        setIntField(term165859, term165859.getClass(), "_numberInt", 0);
        setLongField(term165859, term165859.getClass(), "_numberLong", 0L);
        setDoubleField(term165859, term165859.getClass(), "_numberDouble", 0.0);
        setField(term165859, term165859.getClass(), "_numberBigInt", null);
        setField(term165859, term165859.getClass(), "_numberBigDecimal", null);
        setBooleanField(term165859, term165859.getClass(), "_numberNegative", false);
        setIntField(term165859, term165859.getClass(), "_intLength", 0);
        setIntField(term165859, term165859.getClass(), "_fractLength", 0);
        setIntField(term165859, term165859.getClass(), "_expLength", 0);
        setField(term165859, term165859.getClass(), "_currToken", null);
        setField(term165859, term165859.getClass(), "_lastClearedToken", enum101);
        setIntField(term165859, term165859.getClass(), "_features", 0);
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
        args[1] = term165407;
        args[2] = null;
        args[3] = null;
        args[4] = true;
        args[5] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term165848));
        assertTrue(recursiveEquals(term165407, null));
    }

};


