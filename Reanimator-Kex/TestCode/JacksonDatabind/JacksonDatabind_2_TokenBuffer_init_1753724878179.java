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

public class TokenBuffer_init_1753724878179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31991;
     Object term32611;
     Object term32615;

    public TokenBuffer_init_1753724878179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31575 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term31667 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term31769 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term31885 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term31575, term31575.getClass(), "_hasNativeId", false);
        setField(term31575, term31575.getClass(), "_objectCodec", term31667);
        setIntField(term31575, term31575.getClass(), "_generatorFeatures", 0);
        setField(term31575, term31575.getClass(), "_writeContext", term31769);
        setField(term31575, term31575.getClass(), "_last", null);
        setField(term31575, term31575.getClass(), "_first", term31885);
        setIntField(term31575, term31575.getClass(), "_appendAt", 0);
        setBooleanField(term31575, term31575.getClass(), "_hasNativeTypeIds", false);
        term31991 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32097 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32203 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32315 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term32315, term32315.getClass(), "_objectCodec", null);
        setField(term32203, term32203.getClass(), "delegate", term32315);
        setField(term32097, term32097.getClass(), "delegate", term32203);
        setField(term31991, term31991.getClass(), "delegate", term32097);
        term32611 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term32612 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term32613 = (Object[]) newArray("java.lang.Object", 16);
        Object term32614 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term32611, term32611.getClass(), "_objectCodec", null);
        setIntField(term32611, term32611.getClass(), "_generatorFeatures", 79);
        setBooleanField(term32611, term32611.getClass(), "_closed", false);
        setBooleanField(term32611, term32611.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term32611, term32611.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term32611, term32611.getClass(), "_mayHaveNativeIds", false);
        setField(term32612, term32612.getClass(), "_next", null);
        setLongField(term32612, term32612.getClass(), "_tokenTypes", 0L);
        setField(term32612, term32612.getClass(), "_tokens", term32613);
        setField(term32612, term32612.getClass(), "_nativeIds", null);
        setField(term32611, term32611.getClass(), "_first", term32612);
        setField(term32611, term32611.getClass(), "_last", term32612);
        setIntField(term32611, term32611.getClass(), "_appendAt", 0);
        setField(term32611, term32611.getClass(), "_typeId", null);
        setField(term32611, term32611.getClass(), "_objectId", null);
        setBooleanField(term32611, term32611.getClass(), "_hasNativeId", false);
        setField(term32614, term32614.getClass(), "_parent", null);
        setField(term32614, term32614.getClass(), "_dups", null);
        setField(term32614, term32614.getClass(), "_child", null);
        setField(term32614, term32614.getClass(), "_currentName", null);
        setBooleanField(term32614, term32614.getClass(), "_gotName", false);
        setIntField(term32614, term32614.getClass(), "_type", 0);
        setIntField(term32614, term32614.getClass(), "_index", -1);
        setField(term32611, term32611.getClass(), "_writeContext", term32614);
        setField(term32611, term32611.getClass(), "_cfgPrettyPrinter", null);
        term32615 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32616 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32617 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term32618 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term32615, term32615.getClass(), "_parsers", null);
        setIntField(term32615, term32615.getClass(), "_nextParser", 0);
        setField(term32616, term32616.getClass(), "_parsers", null);
        setIntField(term32616, term32616.getClass(), "_nextParser", 0);
        setField(term32617, term32617.getClass(), "_parsers", null);
        setIntField(term32617, term32617.getClass(), "_nextParser", 0);
        setField(term32618, term32618.getClass(), "_reader", null);
        setField(term32618, term32618.getClass(), "_inputBuffer", null);
        setBooleanField(term32618, term32618.getClass(), "_bufferRecyclable", false);
        setField(term32618, term32618.getClass(), "_objectCodec", null);
        setField(term32618, term32618.getClass(), "_symbols", null);
        setIntField(term32618, term32618.getClass(), "_hashSeed", 0);
        setBooleanField(term32618, term32618.getClass(), "_tokenIncomplete", false);
        setField(term32618, term32618.getClass(), "_ioContext", null);
        setBooleanField(term32618, term32618.getClass(), "_closed", false);
        setIntField(term32618, term32618.getClass(), "_inputPtr", 0);
        setIntField(term32618, term32618.getClass(), "_inputEnd", 0);
        setLongField(term32618, term32618.getClass(), "_currInputProcessed", 0L);
        setIntField(term32618, term32618.getClass(), "_currInputRow", 0);
        setIntField(term32618, term32618.getClass(), "_currInputRowStart", 0);
        setLongField(term32618, term32618.getClass(), "_tokenInputTotal", 0L);
        setIntField(term32618, term32618.getClass(), "_tokenInputRow", 0);
        setIntField(term32618, term32618.getClass(), "_tokenInputCol", 0);
        setField(term32618, term32618.getClass(), "_parsingContext", null);
        setField(term32618, term32618.getClass(), "_nextToken", null);
        setField(term32618, term32618.getClass(), "_textBuffer", null);
        setField(term32618, term32618.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term32618, term32618.getClass(), "_nameCopied", false);
        setField(term32618, term32618.getClass(), "_byteArrayBuilder", null);
        setField(term32618, term32618.getClass(), "_binaryValue", null);
        setIntField(term32618, term32618.getClass(), "_numTypesValid", 0);
        setIntField(term32618, term32618.getClass(), "_numberInt", 0);
        setLongField(term32618, term32618.getClass(), "_numberLong", 0L);
        setDoubleField(term32618, term32618.getClass(), "_numberDouble", 0.0);
        setField(term32618, term32618.getClass(), "_numberBigInt", null);
        setField(term32618, term32618.getClass(), "_numberBigDecimal", null);
        setBooleanField(term32618, term32618.getClass(), "_numberNegative", false);
        setIntField(term32618, term32618.getClass(), "_intLength", 0);
        setIntField(term32618, term32618.getClass(), "_fractLength", 0);
        setIntField(term32618, term32618.getClass(), "_expLength", 0);
        setField(term32618, term32618.getClass(), "_currToken", null);
        setField(term32618, term32618.getClass(), "_lastClearedToken", null);
        setIntField(term32618, term32618.getClass(), "_features", 0);
        setField(term32617, term32617.getClass(), "delegate", term32618);
        setIntField(term32617, term32617.getClass(), "_features", 0);
        setField(term32616, term32616.getClass(), "delegate", term32617);
        setIntField(term32616, term32616.getClass(), "_features", 0);
        setField(term32615, term32615.getClass(), "delegate", term32616);
        setIntField(term32615, term32615.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term31991;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32611));
        assertTrue(recursiveEquals(term31991, term32615));
    }

};


