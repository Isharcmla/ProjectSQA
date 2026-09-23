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

public class TokenBuffer_init_1753724878151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19991;
     Object term20224;
     Object term20228;

    public TokenBuffer_init_1753724878151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19885 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term19885, term19885.getClass(), "_hasNativeId", false);
        term19991 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term20103 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term19991, term19991.getClass(), "delegate", term20103);
        term20224 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term20225 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term20226 = (Object[]) newArray("java.lang.Object", 16);
        Object term20227 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term20224, term20224.getClass(), "_objectCodec", null);
        setIntField(term20224, term20224.getClass(), "_generatorFeatures", 79);
        setBooleanField(term20224, term20224.getClass(), "_closed", false);
        setBooleanField(term20224, term20224.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term20224, term20224.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term20224, term20224.getClass(), "_mayHaveNativeIds", false);
        setField(term20225, term20225.getClass(), "_next", null);
        setLongField(term20225, term20225.getClass(), "_tokenTypes", 0L);
        setField(term20225, term20225.getClass(), "_tokens", term20226);
        setField(term20225, term20225.getClass(), "_nativeIds", null);
        setField(term20224, term20224.getClass(), "_first", term20225);
        setField(term20224, term20224.getClass(), "_last", term20225);
        setIntField(term20224, term20224.getClass(), "_appendAt", 0);
        setField(term20224, term20224.getClass(), "_typeId", null);
        setField(term20224, term20224.getClass(), "_objectId", null);
        setBooleanField(term20224, term20224.getClass(), "_hasNativeId", false);
        setField(term20227, term20227.getClass(), "_parent", null);
        setField(term20227, term20227.getClass(), "_dups", null);
        setField(term20227, term20227.getClass(), "_child", null);
        setField(term20227, term20227.getClass(), "_currentName", null);
        setBooleanField(term20227, term20227.getClass(), "_gotName", false);
        setIntField(term20227, term20227.getClass(), "_type", 0);
        setIntField(term20227, term20227.getClass(), "_index", -1);
        setField(term20224, term20224.getClass(), "_writeContext", term20227);
        setField(term20224, term20224.getClass(), "_cfgPrettyPrinter", null);
        term20228 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term20229 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term20228, term20228.getClass(), "_parsers", null);
        setIntField(term20228, term20228.getClass(), "_nextParser", 0);
        setField(term20229, term20229.getClass(), "_reader", null);
        setField(term20229, term20229.getClass(), "_inputBuffer", null);
        setBooleanField(term20229, term20229.getClass(), "_bufferRecyclable", false);
        setField(term20229, term20229.getClass(), "_objectCodec", null);
        setField(term20229, term20229.getClass(), "_symbols", null);
        setIntField(term20229, term20229.getClass(), "_hashSeed", 0);
        setBooleanField(term20229, term20229.getClass(), "_tokenIncomplete", false);
        setField(term20229, term20229.getClass(), "_ioContext", null);
        setBooleanField(term20229, term20229.getClass(), "_closed", false);
        setIntField(term20229, term20229.getClass(), "_inputPtr", 0);
        setIntField(term20229, term20229.getClass(), "_inputEnd", 0);
        setLongField(term20229, term20229.getClass(), "_currInputProcessed", 0L);
        setIntField(term20229, term20229.getClass(), "_currInputRow", 0);
        setIntField(term20229, term20229.getClass(), "_currInputRowStart", 0);
        setLongField(term20229, term20229.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20229, term20229.getClass(), "_tokenInputRow", 0);
        setIntField(term20229, term20229.getClass(), "_tokenInputCol", 0);
        setField(term20229, term20229.getClass(), "_parsingContext", null);
        setField(term20229, term20229.getClass(), "_nextToken", null);
        setField(term20229, term20229.getClass(), "_textBuffer", null);
        setField(term20229, term20229.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20229, term20229.getClass(), "_nameCopied", false);
        setField(term20229, term20229.getClass(), "_byteArrayBuilder", null);
        setField(term20229, term20229.getClass(), "_binaryValue", null);
        setIntField(term20229, term20229.getClass(), "_numTypesValid", 0);
        setIntField(term20229, term20229.getClass(), "_numberInt", 0);
        setLongField(term20229, term20229.getClass(), "_numberLong", 0L);
        setDoubleField(term20229, term20229.getClass(), "_numberDouble", 0.0);
        setField(term20229, term20229.getClass(), "_numberBigInt", null);
        setField(term20229, term20229.getClass(), "_numberBigDecimal", null);
        setBooleanField(term20229, term20229.getClass(), "_numberNegative", false);
        setIntField(term20229, term20229.getClass(), "_intLength", 0);
        setIntField(term20229, term20229.getClass(), "_fractLength", 0);
        setIntField(term20229, term20229.getClass(), "_expLength", 0);
        setField(term20229, term20229.getClass(), "_currToken", null);
        setField(term20229, term20229.getClass(), "_lastClearedToken", null);
        setIntField(term20229, term20229.getClass(), "_features", 0);
        setField(term20228, term20228.getClass(), "delegate", term20229);
        setIntField(term20228, term20228.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term19991;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20224));
        assertTrue(recursiveEquals(term19991, term20228));
    }

};


