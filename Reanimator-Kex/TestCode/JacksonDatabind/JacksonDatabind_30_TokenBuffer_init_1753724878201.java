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

public class TokenBuffer_init_1753724878201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34379;
     Object term34980;
     Object term34984;

    public TokenBuffer_init_1753724878201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34259 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term34259, term34259.getClass(), "_hasNativeId", false);
        term34379 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term34491 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term34379, term34379.getClass(), "delegate", term34491);
        term34980 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term34981 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term34982 = (Object[]) newArray("java.lang.Object", 16);
        Object term34983 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term34980, term34980.getClass(), "_objectCodec", null);
        setIntField(term34980, term34980.getClass(), "_generatorFeatures", 31);
        setBooleanField(term34980, term34980.getClass(), "_closed", false);
        setBooleanField(term34980, term34980.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term34980, term34980.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term34980, term34980.getClass(), "_mayHaveNativeIds", false);
        setField(term34981, term34981.getClass(), "_next", null);
        setLongField(term34981, term34981.getClass(), "_tokenTypes", 0L);
        setField(term34981, term34981.getClass(), "_tokens", term34982);
        setField(term34981, term34981.getClass(), "_nativeIds", null);
        setField(term34980, term34980.getClass(), "_first", term34981);
        setField(term34980, term34980.getClass(), "_last", term34981);
        setIntField(term34980, term34980.getClass(), "_appendAt", 0);
        setField(term34980, term34980.getClass(), "_typeId", null);
        setField(term34980, term34980.getClass(), "_objectId", null);
        setBooleanField(term34980, term34980.getClass(), "_hasNativeId", false);
        setField(term34983, term34983.getClass(), "_parent", null);
        setField(term34983, term34983.getClass(), "_dups", null);
        setField(term34983, term34983.getClass(), "_child", null);
        setField(term34983, term34983.getClass(), "_currentName", null);
        setField(term34983, term34983.getClass(), "_currentValue", null);
        setBooleanField(term34983, term34983.getClass(), "_gotName", false);
        setIntField(term34983, term34983.getClass(), "_type", 0);
        setIntField(term34983, term34983.getClass(), "_index", -1);
        setField(term34980, term34980.getClass(), "_writeContext", term34983);
        setField(term34980, term34980.getClass(), "_cfgPrettyPrinter", null);
        term34984 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term34985 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term34984, term34984.getClass(), "rootFilter", null);
        setBooleanField(term34984, term34984.getClass(), "_allowMultipleMatches", false);
        setBooleanField(term34984, term34984.getClass(), "_includePath", false);
        setBooleanField(term34984, term34984.getClass(), "_includeImmediateParent", false);
        setField(term34984, term34984.getClass(), "_currToken", null);
        setField(term34984, term34984.getClass(), "_lastClearedToken", null);
        setField(term34984, term34984.getClass(), "_headContext", null);
        setField(term34984, term34984.getClass(), "_exposedContext", null);
        setField(term34984, term34984.getClass(), "_itemFilter", null);
        setIntField(term34984, term34984.getClass(), "_matchCount", 0);
        setField(term34985, term34985.getClass(), "_reader", null);
        setField(term34985, term34985.getClass(), "_inputBuffer", null);
        setBooleanField(term34985, term34985.getClass(), "_bufferRecyclable", false);
        setField(term34985, term34985.getClass(), "_objectCodec", null);
        setField(term34985, term34985.getClass(), "_symbols", null);
        setIntField(term34985, term34985.getClass(), "_hashSeed", 0);
        setBooleanField(term34985, term34985.getClass(), "_tokenIncomplete", false);
        setField(term34985, term34985.getClass(), "_ioContext", null);
        setBooleanField(term34985, term34985.getClass(), "_closed", false);
        setIntField(term34985, term34985.getClass(), "_inputPtr", 0);
        setIntField(term34985, term34985.getClass(), "_inputEnd", 0);
        setLongField(term34985, term34985.getClass(), "_currInputProcessed", 0L);
        setIntField(term34985, term34985.getClass(), "_currInputRow", 0);
        setIntField(term34985, term34985.getClass(), "_currInputRowStart", 0);
        setLongField(term34985, term34985.getClass(), "_tokenInputTotal", 0L);
        setIntField(term34985, term34985.getClass(), "_tokenInputRow", 0);
        setIntField(term34985, term34985.getClass(), "_tokenInputCol", 0);
        setField(term34985, term34985.getClass(), "_parsingContext", null);
        setField(term34985, term34985.getClass(), "_nextToken", null);
        setField(term34985, term34985.getClass(), "_textBuffer", null);
        setField(term34985, term34985.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term34985, term34985.getClass(), "_nameCopied", false);
        setField(term34985, term34985.getClass(), "_byteArrayBuilder", null);
        setField(term34985, term34985.getClass(), "_binaryValue", null);
        setIntField(term34985, term34985.getClass(), "_numTypesValid", 0);
        setIntField(term34985, term34985.getClass(), "_numberInt", 0);
        setLongField(term34985, term34985.getClass(), "_numberLong", 0L);
        setDoubleField(term34985, term34985.getClass(), "_numberDouble", 0.0);
        setField(term34985, term34985.getClass(), "_numberBigInt", null);
        setField(term34985, term34985.getClass(), "_numberBigDecimal", null);
        setBooleanField(term34985, term34985.getClass(), "_numberNegative", false);
        setIntField(term34985, term34985.getClass(), "_intLength", 0);
        setIntField(term34985, term34985.getClass(), "_fractLength", 0);
        setIntField(term34985, term34985.getClass(), "_expLength", 0);
        setField(term34985, term34985.getClass(), "_currToken", null);
        setField(term34985, term34985.getClass(), "_lastClearedToken", null);
        setIntField(term34985, term34985.getClass(), "_features", 0);
        setField(term34984, term34984.getClass(), "delegate", term34985);
        setIntField(term34984, term34984.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term34379;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34980));
        assertTrue(recursiveEquals(term34379, term34984));
    }

};


