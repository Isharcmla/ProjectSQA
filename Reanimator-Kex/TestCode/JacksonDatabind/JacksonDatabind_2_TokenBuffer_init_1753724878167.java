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

public class TokenBuffer_init_1753724878167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25983;
     Object term26405;
     Object term26409;

    public TokenBuffer_init_1753724878167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25553 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term25645 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term25761 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term25877 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term25553, term25553.getClass(), "_hasNativeId", false);
        setField(term25553, term25553.getClass(), "_objectCodec", term25645);
        setIntField(term25553, term25553.getClass(), "_generatorFeatures", 0);
        setField(term25553, term25553.getClass(), "_writeContext", null);
        setField(term25553, term25553.getClass(), "_last", term25761);
        setField(term25553, term25553.getClass(), "_first", term25877);
        setIntField(term25553, term25553.getClass(), "_appendAt", 0);
        setBooleanField(term25553, term25553.getClass(), "_hasNativeTypeIds", false);
        term25983 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26089 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26201 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term26201, term26201.getClass(), "_objectCodec", null);
        setField(term26089, term26089.getClass(), "delegate", term26201);
        setField(term25983, term25983.getClass(), "delegate", term26089);
        term26405 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term26406 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term26407 = (Object[]) newArray("java.lang.Object", 16);
        Object term26408 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term26405, term26405.getClass(), "_objectCodec", null);
        setIntField(term26405, term26405.getClass(), "_generatorFeatures", 79);
        setBooleanField(term26405, term26405.getClass(), "_closed", false);
        setBooleanField(term26405, term26405.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term26405, term26405.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term26405, term26405.getClass(), "_mayHaveNativeIds", false);
        setField(term26406, term26406.getClass(), "_next", null);
        setLongField(term26406, term26406.getClass(), "_tokenTypes", 0L);
        setField(term26406, term26406.getClass(), "_tokens", term26407);
        setField(term26406, term26406.getClass(), "_nativeIds", null);
        setField(term26405, term26405.getClass(), "_first", term26406);
        setField(term26405, term26405.getClass(), "_last", term26406);
        setIntField(term26405, term26405.getClass(), "_appendAt", 0);
        setField(term26405, term26405.getClass(), "_typeId", null);
        setField(term26405, term26405.getClass(), "_objectId", null);
        setBooleanField(term26405, term26405.getClass(), "_hasNativeId", false);
        setField(term26408, term26408.getClass(), "_parent", null);
        setField(term26408, term26408.getClass(), "_dups", null);
        setField(term26408, term26408.getClass(), "_child", null);
        setField(term26408, term26408.getClass(), "_currentName", null);
        setBooleanField(term26408, term26408.getClass(), "_gotName", false);
        setIntField(term26408, term26408.getClass(), "_type", 0);
        setIntField(term26408, term26408.getClass(), "_index", -1);
        setField(term26405, term26405.getClass(), "_writeContext", term26408);
        setField(term26405, term26405.getClass(), "_cfgPrettyPrinter", null);
        term26409 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26410 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term26411 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term26409, term26409.getClass(), "_parsers", null);
        setIntField(term26409, term26409.getClass(), "_nextParser", 0);
        setField(term26410, term26410.getClass(), "_parsers", null);
        setIntField(term26410, term26410.getClass(), "_nextParser", 0);
        setField(term26411, term26411.getClass(), "_reader", null);
        setField(term26411, term26411.getClass(), "_inputBuffer", null);
        setBooleanField(term26411, term26411.getClass(), "_bufferRecyclable", false);
        setField(term26411, term26411.getClass(), "_objectCodec", null);
        setField(term26411, term26411.getClass(), "_symbols", null);
        setIntField(term26411, term26411.getClass(), "_hashSeed", 0);
        setBooleanField(term26411, term26411.getClass(), "_tokenIncomplete", false);
        setField(term26411, term26411.getClass(), "_ioContext", null);
        setBooleanField(term26411, term26411.getClass(), "_closed", false);
        setIntField(term26411, term26411.getClass(), "_inputPtr", 0);
        setIntField(term26411, term26411.getClass(), "_inputEnd", 0);
        setLongField(term26411, term26411.getClass(), "_currInputProcessed", 0L);
        setIntField(term26411, term26411.getClass(), "_currInputRow", 0);
        setIntField(term26411, term26411.getClass(), "_currInputRowStart", 0);
        setLongField(term26411, term26411.getClass(), "_tokenInputTotal", 0L);
        setIntField(term26411, term26411.getClass(), "_tokenInputRow", 0);
        setIntField(term26411, term26411.getClass(), "_tokenInputCol", 0);
        setField(term26411, term26411.getClass(), "_parsingContext", null);
        setField(term26411, term26411.getClass(), "_nextToken", null);
        setField(term26411, term26411.getClass(), "_textBuffer", null);
        setField(term26411, term26411.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term26411, term26411.getClass(), "_nameCopied", false);
        setField(term26411, term26411.getClass(), "_byteArrayBuilder", null);
        setField(term26411, term26411.getClass(), "_binaryValue", null);
        setIntField(term26411, term26411.getClass(), "_numTypesValid", 0);
        setIntField(term26411, term26411.getClass(), "_numberInt", 0);
        setLongField(term26411, term26411.getClass(), "_numberLong", 0L);
        setDoubleField(term26411, term26411.getClass(), "_numberDouble", 0.0);
        setField(term26411, term26411.getClass(), "_numberBigInt", null);
        setField(term26411, term26411.getClass(), "_numberBigDecimal", null);
        setBooleanField(term26411, term26411.getClass(), "_numberNegative", false);
        setIntField(term26411, term26411.getClass(), "_intLength", 0);
        setIntField(term26411, term26411.getClass(), "_fractLength", 0);
        setIntField(term26411, term26411.getClass(), "_expLength", 0);
        setField(term26411, term26411.getClass(), "_currToken", null);
        setField(term26411, term26411.getClass(), "_lastClearedToken", null);
        setIntField(term26411, term26411.getClass(), "_features", 0);
        setField(term26410, term26410.getClass(), "delegate", term26411);
        setIntField(term26410, term26410.getClass(), "_features", 0);
        setField(term26409, term26409.getClass(), "delegate", term26410);
        setIntField(term26409, term26409.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term25983;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26405));
        assertTrue(recursiveEquals(term25983, term26409));
    }

};


