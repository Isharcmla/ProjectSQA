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

public class MappingIterator_init_678306715208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163480;
     Object term163921;
     Object term163932;

    public MappingIterator_init_678306715208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163116 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term163222 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term163370 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term163116, term163116.getClass(), "_type", null);
        setField(term163116, term163116.getClass(), "_parser", term163222);
        setField(term163116, term163116.getClass(), "_context", term163370);
        setField(term163116, term163116.getClass(), "_deserializer", null);
        setBooleanField(term163116, term163116.getClass(), "_closeParser", false);
        setField(term163116, term163116.getClass(), "_updatedValue", null);
        Class<? extends Object> term163943 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term163942 = ((Class) term163943).getDeclaredField((String) "START_ARRAY");
        ((Field) term163942).setAccessible(true);
        Object enum95 = ((Field) term163942).get((Object) null);
        term163480 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term163480, term163480.getClass(), "_currToken", enum95);
        Class<? extends Object> term164163 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term164162 = ((Class) term164163).getDeclaredField((String) "START_ARRAY");
        ((Field) term164162).setAccessible(true);
        Object enum96 = ((Field) term164162).get((Object) null);
        term163921 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term163922 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term163921, term163921.getClass(), "_type", null);
        setField(term163921, term163921.getClass(), "_context", null);
        setField(term163921, term163921.getClass(), "_deserializer", null);
        setField(term163922, term163922.getClass(), "_objectCodec", null);
        setField(term163922, term163922.getClass(), "_symbols", null);
        setField(term163922, term163922.getClass(), "_quadBuffer", null);
        setBooleanField(term163922, term163922.getClass(), "_tokenIncomplete", false);
        setIntField(term163922, term163922.getClass(), "_quad1", 0);
        setField(term163922, term163922.getClass(), "_inputStream", null);
        setField(term163922, term163922.getClass(), "_inputBuffer", null);
        setBooleanField(term163922, term163922.getClass(), "_bufferRecyclable", false);
        setField(term163922, term163922.getClass(), "_ioContext", null);
        setBooleanField(term163922, term163922.getClass(), "_closed", false);
        setIntField(term163922, term163922.getClass(), "_inputPtr", 0);
        setIntField(term163922, term163922.getClass(), "_inputEnd", 0);
        setLongField(term163922, term163922.getClass(), "_currInputProcessed", 0L);
        setIntField(term163922, term163922.getClass(), "_currInputRow", 0);
        setIntField(term163922, term163922.getClass(), "_currInputRowStart", 0);
        setLongField(term163922, term163922.getClass(), "_tokenInputTotal", 0L);
        setIntField(term163922, term163922.getClass(), "_tokenInputRow", 0);
        setIntField(term163922, term163922.getClass(), "_tokenInputCol", 0);
        setField(term163922, term163922.getClass(), "_parsingContext", null);
        setField(term163922, term163922.getClass(), "_nextToken", null);
        setField(term163922, term163922.getClass(), "_textBuffer", null);
        setField(term163922, term163922.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term163922, term163922.getClass(), "_nameCopied", false);
        setField(term163922, term163922.getClass(), "_byteArrayBuilder", null);
        setField(term163922, term163922.getClass(), "_binaryValue", null);
        setIntField(term163922, term163922.getClass(), "_numTypesValid", 0);
        setIntField(term163922, term163922.getClass(), "_numberInt", 0);
        setLongField(term163922, term163922.getClass(), "_numberLong", 0L);
        setDoubleField(term163922, term163922.getClass(), "_numberDouble", 0.0);
        setField(term163922, term163922.getClass(), "_numberBigInt", null);
        setField(term163922, term163922.getClass(), "_numberBigDecimal", null);
        setBooleanField(term163922, term163922.getClass(), "_numberNegative", false);
        setIntField(term163922, term163922.getClass(), "_intLength", 0);
        setIntField(term163922, term163922.getClass(), "_fractLength", 0);
        setIntField(term163922, term163922.getClass(), "_expLength", 0);
        setField(term163922, term163922.getClass(), "_currToken", null);
        setField(term163922, term163922.getClass(), "_lastClearedToken", enum96);
        setIntField(term163922, term163922.getClass(), "_features", 0);
        setField(term163921, term163921.getClass(), "_parser", term163922);
        setField(term163921, term163921.getClass(), "_updatedValue", "");
        setBooleanField(term163921, term163921.getClass(), "_closeParser", true);
        setBooleanField(term163921, term163921.getClass(), "_hasNextChecked", false);
        Class<? extends Object> term164383 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term164382 = ((Class) term164383).getDeclaredField((String) "START_ARRAY");
        ((Field) term164382).setAccessible(true);
        Object enum97 = ((Field) term164382).get((Object) null);
        term163932 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term163932, term163932.getClass(), "_objectCodec", null);
        setField(term163932, term163932.getClass(), "_symbols", null);
        setField(term163932, term163932.getClass(), "_quadBuffer", null);
        setBooleanField(term163932, term163932.getClass(), "_tokenIncomplete", false);
        setIntField(term163932, term163932.getClass(), "_quad1", 0);
        setField(term163932, term163932.getClass(), "_inputStream", null);
        setField(term163932, term163932.getClass(), "_inputBuffer", null);
        setBooleanField(term163932, term163932.getClass(), "_bufferRecyclable", false);
        setField(term163932, term163932.getClass(), "_ioContext", null);
        setBooleanField(term163932, term163932.getClass(), "_closed", false);
        setIntField(term163932, term163932.getClass(), "_inputPtr", 0);
        setIntField(term163932, term163932.getClass(), "_inputEnd", 0);
        setLongField(term163932, term163932.getClass(), "_currInputProcessed", 0L);
        setIntField(term163932, term163932.getClass(), "_currInputRow", 0);
        setIntField(term163932, term163932.getClass(), "_currInputRowStart", 0);
        setLongField(term163932, term163932.getClass(), "_tokenInputTotal", 0L);
        setIntField(term163932, term163932.getClass(), "_tokenInputRow", 0);
        setIntField(term163932, term163932.getClass(), "_tokenInputCol", 0);
        setField(term163932, term163932.getClass(), "_parsingContext", null);
        setField(term163932, term163932.getClass(), "_nextToken", null);
        setField(term163932, term163932.getClass(), "_textBuffer", null);
        setField(term163932, term163932.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term163932, term163932.getClass(), "_nameCopied", false);
        setField(term163932, term163932.getClass(), "_byteArrayBuilder", null);
        setField(term163932, term163932.getClass(), "_binaryValue", null);
        setIntField(term163932, term163932.getClass(), "_numTypesValid", 0);
        setIntField(term163932, term163932.getClass(), "_numberInt", 0);
        setLongField(term163932, term163932.getClass(), "_numberLong", 0L);
        setDoubleField(term163932, term163932.getClass(), "_numberDouble", 0.0);
        setField(term163932, term163932.getClass(), "_numberBigInt", null);
        setField(term163932, term163932.getClass(), "_numberBigDecimal", null);
        setBooleanField(term163932, term163932.getClass(), "_numberNegative", false);
        setIntField(term163932, term163932.getClass(), "_intLength", 0);
        setIntField(term163932, term163932.getClass(), "_fractLength", 0);
        setIntField(term163932, term163932.getClass(), "_expLength", 0);
        setField(term163932, term163932.getClass(), "_currToken", null);
        setField(term163932, term163932.getClass(), "_lastClearedToken", enum97);
        setIntField(term163932, term163932.getClass(), "_features", 0);
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
        args[1] = term163480;
        args[2] = null;
        args[3] = null;
        args[4] = true;
        args[5] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term163921));
        assertTrue(recursiveEquals(term163480, null));
    }

};


