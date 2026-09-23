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

public class TokenBuffer_init_1753724878163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24324;
     Object term24744;
     Object term24748;

    public TokenBuffer_init_1753724878163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23894 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term23986 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term24102 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term24218 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term23894, term23894.getClass(), "_hasNativeId", false);
        setField(term23894, term23894.getClass(), "_objectCodec", term23986);
        setIntField(term23894, term23894.getClass(), "_generatorFeatures", 0);
        setField(term23894, term23894.getClass(), "_writeContext", null);
        setField(term23894, term23894.getClass(), "_last", term24102);
        setField(term23894, term23894.getClass(), "_first", term24218);
        setIntField(term23894, term23894.getClass(), "_appendAt", 0);
        setBooleanField(term23894, term23894.getClass(), "_hasNativeTypeIds", false);
        term24324 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term24430 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term24540 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term24540, term24540.getClass(), "_objectCodec", null);
        setField(term24430, term24430.getClass(), "delegate", term24540);
        setField(term24324, term24324.getClass(), "delegate", term24430);
        term24744 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term24745 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term24746 = (Object[]) newArray("java.lang.Object", 16);
        Object term24747 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term24744, term24744.getClass(), "_objectCodec", null);
        setIntField(term24744, term24744.getClass(), "_generatorFeatures", 79);
        setBooleanField(term24744, term24744.getClass(), "_closed", false);
        setBooleanField(term24744, term24744.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term24744, term24744.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term24744, term24744.getClass(), "_mayHaveNativeIds", false);
        setField(term24745, term24745.getClass(), "_next", null);
        setLongField(term24745, term24745.getClass(), "_tokenTypes", 0L);
        setField(term24745, term24745.getClass(), "_tokens", term24746);
        setField(term24745, term24745.getClass(), "_nativeIds", null);
        setField(term24744, term24744.getClass(), "_first", term24745);
        setField(term24744, term24744.getClass(), "_last", term24745);
        setIntField(term24744, term24744.getClass(), "_appendAt", 0);
        setField(term24744, term24744.getClass(), "_typeId", null);
        setField(term24744, term24744.getClass(), "_objectId", null);
        setBooleanField(term24744, term24744.getClass(), "_hasNativeId", false);
        setField(term24747, term24747.getClass(), "_parent", null);
        setField(term24747, term24747.getClass(), "_dups", null);
        setField(term24747, term24747.getClass(), "_child", null);
        setField(term24747, term24747.getClass(), "_currentName", null);
        setBooleanField(term24747, term24747.getClass(), "_gotName", false);
        setIntField(term24747, term24747.getClass(), "_type", 0);
        setIntField(term24747, term24747.getClass(), "_index", -1);
        setField(term24744, term24744.getClass(), "_writeContext", term24747);
        setField(term24744, term24744.getClass(), "_cfgPrettyPrinter", null);
        term24748 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term24749 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term24750 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term24748, term24748.getClass(), "_parsers", null);
        setIntField(term24748, term24748.getClass(), "_nextParser", 0);
        setField(term24749, term24749.getClass(), "_parsers", null);
        setIntField(term24749, term24749.getClass(), "_nextParser", 0);
        setField(term24750, term24750.getClass(), "_objectCodec", null);
        setField(term24750, term24750.getClass(), "_symbols", null);
        setField(term24750, term24750.getClass(), "_quadBuffer", null);
        setBooleanField(term24750, term24750.getClass(), "_tokenIncomplete", false);
        setIntField(term24750, term24750.getClass(), "_quad1", 0);
        setField(term24750, term24750.getClass(), "_inputStream", null);
        setField(term24750, term24750.getClass(), "_inputBuffer", null);
        setBooleanField(term24750, term24750.getClass(), "_bufferRecyclable", false);
        setField(term24750, term24750.getClass(), "_ioContext", null);
        setBooleanField(term24750, term24750.getClass(), "_closed", false);
        setIntField(term24750, term24750.getClass(), "_inputPtr", 0);
        setIntField(term24750, term24750.getClass(), "_inputEnd", 0);
        setLongField(term24750, term24750.getClass(), "_currInputProcessed", 0L);
        setIntField(term24750, term24750.getClass(), "_currInputRow", 0);
        setIntField(term24750, term24750.getClass(), "_currInputRowStart", 0);
        setLongField(term24750, term24750.getClass(), "_tokenInputTotal", 0L);
        setIntField(term24750, term24750.getClass(), "_tokenInputRow", 0);
        setIntField(term24750, term24750.getClass(), "_tokenInputCol", 0);
        setField(term24750, term24750.getClass(), "_parsingContext", null);
        setField(term24750, term24750.getClass(), "_nextToken", null);
        setField(term24750, term24750.getClass(), "_textBuffer", null);
        setField(term24750, term24750.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term24750, term24750.getClass(), "_nameCopied", false);
        setField(term24750, term24750.getClass(), "_byteArrayBuilder", null);
        setField(term24750, term24750.getClass(), "_binaryValue", null);
        setIntField(term24750, term24750.getClass(), "_numTypesValid", 0);
        setIntField(term24750, term24750.getClass(), "_numberInt", 0);
        setLongField(term24750, term24750.getClass(), "_numberLong", 0L);
        setDoubleField(term24750, term24750.getClass(), "_numberDouble", 0.0);
        setField(term24750, term24750.getClass(), "_numberBigInt", null);
        setField(term24750, term24750.getClass(), "_numberBigDecimal", null);
        setBooleanField(term24750, term24750.getClass(), "_numberNegative", false);
        setIntField(term24750, term24750.getClass(), "_intLength", 0);
        setIntField(term24750, term24750.getClass(), "_fractLength", 0);
        setIntField(term24750, term24750.getClass(), "_expLength", 0);
        setField(term24750, term24750.getClass(), "_currToken", null);
        setField(term24750, term24750.getClass(), "_lastClearedToken", null);
        setIntField(term24750, term24750.getClass(), "_features", 0);
        setField(term24749, term24749.getClass(), "delegate", term24750);
        setIntField(term24749, term24749.getClass(), "_features", 0);
        setField(term24748, term24748.getClass(), "delegate", term24749);
        setIntField(term24748, term24748.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term24324;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24744));
        assertTrue(recursiveEquals(term24324, term24748));
    }

};


