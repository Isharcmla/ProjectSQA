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

public class TokenBuffer_init_1753724878161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23319;
     Object term23739;
     Object term23743;

    public TokenBuffer_init_1753724878161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22981 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term23097 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term23213 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term22981, term22981.getClass(), "_hasNativeId", false);
        setField(term22981, term22981.getClass(), "_objectCodec", null);
        setIntField(term22981, term22981.getClass(), "_generatorFeatures", 0);
        setField(term22981, term22981.getClass(), "_writeContext", null);
        setField(term22981, term22981.getClass(), "_last", term23097);
        setField(term22981, term22981.getClass(), "_first", term23213);
        setIntField(term22981, term22981.getClass(), "_appendAt", 0);
        term23319 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term23425 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term23535 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term23535, term23535.getClass(), "_objectCodec", null);
        setField(term23425, term23425.getClass(), "delegate", term23535);
        setField(term23319, term23319.getClass(), "delegate", term23425);
        term23739 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term23740 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term23741 = (Object[]) newArray("java.lang.Object", 16);
        Object term23742 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term23739, term23739.getClass(), "_objectCodec", null);
        setIntField(term23739, term23739.getClass(), "_generatorFeatures", 79);
        setBooleanField(term23739, term23739.getClass(), "_closed", false);
        setBooleanField(term23739, term23739.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term23739, term23739.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term23739, term23739.getClass(), "_mayHaveNativeIds", false);
        setField(term23740, term23740.getClass(), "_next", null);
        setLongField(term23740, term23740.getClass(), "_tokenTypes", 0L);
        setField(term23740, term23740.getClass(), "_tokens", term23741);
        setField(term23740, term23740.getClass(), "_nativeIds", null);
        setField(term23739, term23739.getClass(), "_first", term23740);
        setField(term23739, term23739.getClass(), "_last", term23740);
        setIntField(term23739, term23739.getClass(), "_appendAt", 0);
        setField(term23739, term23739.getClass(), "_typeId", null);
        setField(term23739, term23739.getClass(), "_objectId", null);
        setBooleanField(term23739, term23739.getClass(), "_hasNativeId", false);
        setField(term23742, term23742.getClass(), "_parent", null);
        setField(term23742, term23742.getClass(), "_dups", null);
        setField(term23742, term23742.getClass(), "_child", null);
        setField(term23742, term23742.getClass(), "_currentName", null);
        setBooleanField(term23742, term23742.getClass(), "_gotName", false);
        setIntField(term23742, term23742.getClass(), "_type", 0);
        setIntField(term23742, term23742.getClass(), "_index", -1);
        setField(term23739, term23739.getClass(), "_writeContext", term23742);
        setField(term23739, term23739.getClass(), "_cfgPrettyPrinter", null);
        term23743 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term23744 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term23745 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term23743, term23743.getClass(), "_parsers", null);
        setIntField(term23743, term23743.getClass(), "_nextParser", 0);
        setField(term23744, term23744.getClass(), "_parsers", null);
        setIntField(term23744, term23744.getClass(), "_nextParser", 0);
        setField(term23745, term23745.getClass(), "_objectCodec", null);
        setField(term23745, term23745.getClass(), "_symbols", null);
        setField(term23745, term23745.getClass(), "_quadBuffer", null);
        setBooleanField(term23745, term23745.getClass(), "_tokenIncomplete", false);
        setIntField(term23745, term23745.getClass(), "_quad1", 0);
        setField(term23745, term23745.getClass(), "_inputStream", null);
        setField(term23745, term23745.getClass(), "_inputBuffer", null);
        setBooleanField(term23745, term23745.getClass(), "_bufferRecyclable", false);
        setField(term23745, term23745.getClass(), "_ioContext", null);
        setBooleanField(term23745, term23745.getClass(), "_closed", false);
        setIntField(term23745, term23745.getClass(), "_inputPtr", 0);
        setIntField(term23745, term23745.getClass(), "_inputEnd", 0);
        setLongField(term23745, term23745.getClass(), "_currInputProcessed", 0L);
        setIntField(term23745, term23745.getClass(), "_currInputRow", 0);
        setIntField(term23745, term23745.getClass(), "_currInputRowStart", 0);
        setLongField(term23745, term23745.getClass(), "_tokenInputTotal", 0L);
        setIntField(term23745, term23745.getClass(), "_tokenInputRow", 0);
        setIntField(term23745, term23745.getClass(), "_tokenInputCol", 0);
        setField(term23745, term23745.getClass(), "_parsingContext", null);
        setField(term23745, term23745.getClass(), "_nextToken", null);
        setField(term23745, term23745.getClass(), "_textBuffer", null);
        setField(term23745, term23745.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term23745, term23745.getClass(), "_nameCopied", false);
        setField(term23745, term23745.getClass(), "_byteArrayBuilder", null);
        setField(term23745, term23745.getClass(), "_binaryValue", null);
        setIntField(term23745, term23745.getClass(), "_numTypesValid", 0);
        setIntField(term23745, term23745.getClass(), "_numberInt", 0);
        setLongField(term23745, term23745.getClass(), "_numberLong", 0L);
        setDoubleField(term23745, term23745.getClass(), "_numberDouble", 0.0);
        setField(term23745, term23745.getClass(), "_numberBigInt", null);
        setField(term23745, term23745.getClass(), "_numberBigDecimal", null);
        setBooleanField(term23745, term23745.getClass(), "_numberNegative", false);
        setIntField(term23745, term23745.getClass(), "_intLength", 0);
        setIntField(term23745, term23745.getClass(), "_fractLength", 0);
        setIntField(term23745, term23745.getClass(), "_expLength", 0);
        setField(term23745, term23745.getClass(), "_currToken", null);
        setField(term23745, term23745.getClass(), "_lastClearedToken", null);
        setIntField(term23745, term23745.getClass(), "_features", 0);
        setField(term23744, term23744.getClass(), "delegate", term23745);
        setIntField(term23744, term23744.getClass(), "_features", 0);
        setField(term23743, term23743.getClass(), "delegate", term23744);
        setIntField(term23743, term23743.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term23319;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23739));
        assertTrue(recursiveEquals(term23319, term23743));
    }

};


