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
     Object term30795;
     Object term31415;
     Object term31419;

    public TokenBuffer_init_1753724878177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30379 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term30471 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30573 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term30689 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term30379, term30379.getClass(), "_hasNativeId", false);
        setField(term30379, term30379.getClass(), "_objectCodec", term30471);
        setIntField(term30379, term30379.getClass(), "_generatorFeatures", 0);
        setField(term30379, term30379.getClass(), "_writeContext", term30573);
        setField(term30379, term30379.getClass(), "_last", null);
        setField(term30379, term30379.getClass(), "_first", term30689);
        setIntField(term30379, term30379.getClass(), "_appendAt", 0);
        setBooleanField(term30379, term30379.getClass(), "_hasNativeTypeIds", false);
        term30795 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term30901 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term31007 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term31119 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term31119, term31119.getClass(), "_objectCodec", null);
        setField(term31007, term31007.getClass(), "delegate", term31119);
        setField(term30901, term30901.getClass(), "delegate", term31007);
        setField(term30795, term30795.getClass(), "delegate", term30901);
        term31415 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term31416 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term31417 = (Object[]) newArray("java.lang.Object", 16);
        Object term31418 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term31415, term31415.getClass(), "_objectCodec", null);
        setIntField(term31415, term31415.getClass(), "_generatorFeatures", 79);
        setBooleanField(term31415, term31415.getClass(), "_closed", false);
        setBooleanField(term31415, term31415.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term31415, term31415.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term31415, term31415.getClass(), "_mayHaveNativeIds", false);
        setField(term31416, term31416.getClass(), "_next", null);
        setLongField(term31416, term31416.getClass(), "_tokenTypes", 0L);
        setField(term31416, term31416.getClass(), "_tokens", term31417);
        setField(term31416, term31416.getClass(), "_nativeIds", null);
        setField(term31415, term31415.getClass(), "_first", term31416);
        setField(term31415, term31415.getClass(), "_last", term31416);
        setIntField(term31415, term31415.getClass(), "_appendAt", 0);
        setField(term31415, term31415.getClass(), "_typeId", null);
        setField(term31415, term31415.getClass(), "_objectId", null);
        setBooleanField(term31415, term31415.getClass(), "_hasNativeId", false);
        setField(term31418, term31418.getClass(), "_parent", null);
        setField(term31418, term31418.getClass(), "_dups", null);
        setField(term31418, term31418.getClass(), "_child", null);
        setField(term31418, term31418.getClass(), "_currentName", null);
        setBooleanField(term31418, term31418.getClass(), "_gotName", false);
        setIntField(term31418, term31418.getClass(), "_type", 0);
        setIntField(term31418, term31418.getClass(), "_index", -1);
        setField(term31415, term31415.getClass(), "_writeContext", term31418);
        setField(term31415, term31415.getClass(), "_cfgPrettyPrinter", null);
        term31419 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term31420 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term31421 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term31422 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term31419, term31419.getClass(), "_parsers", null);
        setIntField(term31419, term31419.getClass(), "_nextParser", 0);
        setField(term31420, term31420.getClass(), "_parsers", null);
        setIntField(term31420, term31420.getClass(), "_nextParser", 0);
        setField(term31421, term31421.getClass(), "_parsers", null);
        setIntField(term31421, term31421.getClass(), "_nextParser", 0);
        setField(term31422, term31422.getClass(), "_reader", null);
        setField(term31422, term31422.getClass(), "_inputBuffer", null);
        setBooleanField(term31422, term31422.getClass(), "_bufferRecyclable", false);
        setField(term31422, term31422.getClass(), "_objectCodec", null);
        setField(term31422, term31422.getClass(), "_symbols", null);
        setIntField(term31422, term31422.getClass(), "_hashSeed", 0);
        setBooleanField(term31422, term31422.getClass(), "_tokenIncomplete", false);
        setField(term31422, term31422.getClass(), "_ioContext", null);
        setBooleanField(term31422, term31422.getClass(), "_closed", false);
        setIntField(term31422, term31422.getClass(), "_inputPtr", 0);
        setIntField(term31422, term31422.getClass(), "_inputEnd", 0);
        setLongField(term31422, term31422.getClass(), "_currInputProcessed", 0L);
        setIntField(term31422, term31422.getClass(), "_currInputRow", 0);
        setIntField(term31422, term31422.getClass(), "_currInputRowStart", 0);
        setLongField(term31422, term31422.getClass(), "_tokenInputTotal", 0L);
        setIntField(term31422, term31422.getClass(), "_tokenInputRow", 0);
        setIntField(term31422, term31422.getClass(), "_tokenInputCol", 0);
        setField(term31422, term31422.getClass(), "_parsingContext", null);
        setField(term31422, term31422.getClass(), "_nextToken", null);
        setField(term31422, term31422.getClass(), "_textBuffer", null);
        setField(term31422, term31422.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term31422, term31422.getClass(), "_nameCopied", false);
        setField(term31422, term31422.getClass(), "_byteArrayBuilder", null);
        setField(term31422, term31422.getClass(), "_binaryValue", null);
        setIntField(term31422, term31422.getClass(), "_numTypesValid", 0);
        setIntField(term31422, term31422.getClass(), "_numberInt", 0);
        setLongField(term31422, term31422.getClass(), "_numberLong", 0L);
        setDoubleField(term31422, term31422.getClass(), "_numberDouble", 0.0);
        setField(term31422, term31422.getClass(), "_numberBigInt", null);
        setField(term31422, term31422.getClass(), "_numberBigDecimal", null);
        setBooleanField(term31422, term31422.getClass(), "_numberNegative", false);
        setIntField(term31422, term31422.getClass(), "_intLength", 0);
        setIntField(term31422, term31422.getClass(), "_fractLength", 0);
        setIntField(term31422, term31422.getClass(), "_expLength", 0);
        setField(term31422, term31422.getClass(), "_currToken", null);
        setField(term31422, term31422.getClass(), "_lastClearedToken", null);
        setIntField(term31422, term31422.getClass(), "_features", 0);
        setField(term31421, term31421.getClass(), "delegate", term31422);
        setIntField(term31421, term31421.getClass(), "_features", 0);
        setField(term31420, term31420.getClass(), "delegate", term31421);
        setIntField(term31420, term31420.getClass(), "_features", 0);
        setField(term31419, term31419.getClass(), "delegate", term31420);
        setIntField(term31419, term31419.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term30795;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31415));
        assertTrue(recursiveEquals(term30795, term31419));
    }

};


