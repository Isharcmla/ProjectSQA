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

public class TokenBuffer_init_1753724878171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27551;
     Object term28169;
     Object term28173;

    public TokenBuffer_init_1753724878171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27445 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term27445, term27445.getClass(), "_hasNativeId", false);
        term27551 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term27657 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term27763 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term27873 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term27763, term27763.getClass(), "delegate", term27873);
        setField(term27657, term27657.getClass(), "delegate", term27763);
        setField(term27551, term27551.getClass(), "delegate", term27657);
        term28169 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term28170 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term28171 = (Object[]) newArray("java.lang.Object", 16);
        Object term28172 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term28169, term28169.getClass(), "_objectCodec", null);
        setIntField(term28169, term28169.getClass(), "_generatorFeatures", 79);
        setBooleanField(term28169, term28169.getClass(), "_closed", false);
        setBooleanField(term28169, term28169.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term28169, term28169.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term28169, term28169.getClass(), "_mayHaveNativeIds", false);
        setField(term28170, term28170.getClass(), "_next", null);
        setLongField(term28170, term28170.getClass(), "_tokenTypes", 0L);
        setField(term28170, term28170.getClass(), "_tokens", term28171);
        setField(term28170, term28170.getClass(), "_nativeIds", null);
        setField(term28169, term28169.getClass(), "_first", term28170);
        setField(term28169, term28169.getClass(), "_last", term28170);
        setIntField(term28169, term28169.getClass(), "_appendAt", 0);
        setField(term28169, term28169.getClass(), "_typeId", null);
        setField(term28169, term28169.getClass(), "_objectId", null);
        setBooleanField(term28169, term28169.getClass(), "_hasNativeId", false);
        setField(term28172, term28172.getClass(), "_parent", null);
        setField(term28172, term28172.getClass(), "_dups", null);
        setField(term28172, term28172.getClass(), "_child", null);
        setField(term28172, term28172.getClass(), "_currentName", null);
        setBooleanField(term28172, term28172.getClass(), "_gotName", false);
        setIntField(term28172, term28172.getClass(), "_type", 0);
        setIntField(term28172, term28172.getClass(), "_index", -1);
        setField(term28169, term28169.getClass(), "_writeContext", term28172);
        setField(term28169, term28169.getClass(), "_cfgPrettyPrinter", null);
        term28173 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term28174 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term28175 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term28176 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term28173, term28173.getClass(), "_parsers", null);
        setIntField(term28173, term28173.getClass(), "_nextParser", 0);
        setField(term28174, term28174.getClass(), "_parsers", null);
        setIntField(term28174, term28174.getClass(), "_nextParser", 0);
        setField(term28175, term28175.getClass(), "_parsers", null);
        setIntField(term28175, term28175.getClass(), "_nextParser", 0);
        setField(term28176, term28176.getClass(), "_objectCodec", null);
        setField(term28176, term28176.getClass(), "_symbols", null);
        setField(term28176, term28176.getClass(), "_quadBuffer", null);
        setBooleanField(term28176, term28176.getClass(), "_tokenIncomplete", false);
        setIntField(term28176, term28176.getClass(), "_quad1", 0);
        setField(term28176, term28176.getClass(), "_inputStream", null);
        setField(term28176, term28176.getClass(), "_inputBuffer", null);
        setBooleanField(term28176, term28176.getClass(), "_bufferRecyclable", false);
        setField(term28176, term28176.getClass(), "_ioContext", null);
        setBooleanField(term28176, term28176.getClass(), "_closed", false);
        setIntField(term28176, term28176.getClass(), "_inputPtr", 0);
        setIntField(term28176, term28176.getClass(), "_inputEnd", 0);
        setLongField(term28176, term28176.getClass(), "_currInputProcessed", 0L);
        setIntField(term28176, term28176.getClass(), "_currInputRow", 0);
        setIntField(term28176, term28176.getClass(), "_currInputRowStart", 0);
        setLongField(term28176, term28176.getClass(), "_tokenInputTotal", 0L);
        setIntField(term28176, term28176.getClass(), "_tokenInputRow", 0);
        setIntField(term28176, term28176.getClass(), "_tokenInputCol", 0);
        setField(term28176, term28176.getClass(), "_parsingContext", null);
        setField(term28176, term28176.getClass(), "_nextToken", null);
        setField(term28176, term28176.getClass(), "_textBuffer", null);
        setField(term28176, term28176.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term28176, term28176.getClass(), "_nameCopied", false);
        setField(term28176, term28176.getClass(), "_byteArrayBuilder", null);
        setField(term28176, term28176.getClass(), "_binaryValue", null);
        setIntField(term28176, term28176.getClass(), "_numTypesValid", 0);
        setIntField(term28176, term28176.getClass(), "_numberInt", 0);
        setLongField(term28176, term28176.getClass(), "_numberLong", 0L);
        setDoubleField(term28176, term28176.getClass(), "_numberDouble", 0.0);
        setField(term28176, term28176.getClass(), "_numberBigInt", null);
        setField(term28176, term28176.getClass(), "_numberBigDecimal", null);
        setBooleanField(term28176, term28176.getClass(), "_numberNegative", false);
        setIntField(term28176, term28176.getClass(), "_intLength", 0);
        setIntField(term28176, term28176.getClass(), "_fractLength", 0);
        setIntField(term28176, term28176.getClass(), "_expLength", 0);
        setField(term28176, term28176.getClass(), "_currToken", null);
        setField(term28176, term28176.getClass(), "_lastClearedToken", null);
        setIntField(term28176, term28176.getClass(), "_features", 0);
        setField(term28175, term28175.getClass(), "delegate", term28176);
        setIntField(term28175, term28175.getClass(), "_features", 0);
        setField(term28174, term28174.getClass(), "delegate", term28175);
        setIntField(term28174, term28174.getClass(), "_features", 0);
        setField(term28173, term28173.getClass(), "delegate", term28174);
        setIntField(term28173, term28173.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term27551;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28169));
        assertTrue(recursiveEquals(term27551, term28173));
    }

};


