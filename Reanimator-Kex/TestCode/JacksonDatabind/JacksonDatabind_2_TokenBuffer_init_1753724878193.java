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

public class TokenBuffer_init_1753724878193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39961;
     Object term40695;
     Object term40700;

    public TokenBuffer_init_1753724878193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39429 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term39521 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term39623 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term39739 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term39855 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term39429, term39429.getClass(), "_hasNativeId", false);
        setField(term39429, term39429.getClass(), "_objectCodec", term39521);
        setIntField(term39429, term39429.getClass(), "_generatorFeatures", 0);
        setField(term39429, term39429.getClass(), "_writeContext", term39623);
        setField(term39429, term39429.getClass(), "_last", term39739);
        setField(term39429, term39429.getClass(), "_first", term39855);
        setIntField(term39429, term39429.getClass(), "_appendAt", 0);
        term39961 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40067 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40173 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40285 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term40377 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term40285, term40285.getClass(), "_objectCodec", term40377);
        setField(term40173, term40173.getClass(), "delegate", term40285);
        setField(term40067, term40067.getClass(), "delegate", term40173);
        setField(term39961, term39961.getClass(), "delegate", term40067);
        term40695 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term40696 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term40697 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term40698 = (Object[]) newArray("java.lang.Object", 16);
        Object term40699 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term40696, term40696.getClass(), "_config", null);
        setField(term40696, term40696.getClass(), "_context", null);
        setField(term40696, term40696.getClass(), "_parserFactory", null);
        setBooleanField(term40696, term40696.getClass(), "_unwrapRoot", false);
        setField(term40696, term40696.getClass(), "_valueType", null);
        setField(term40696, term40696.getClass(), "_rootDeserializer", null);
        setField(term40696, term40696.getClass(), "_valueToUpdate", null);
        setField(term40696, term40696.getClass(), "_schema", null);
        setField(term40696, term40696.getClass(), "_injectableValues", null);
        setField(term40696, term40696.getClass(), "_dataFormatReaders", null);
        setField(term40696, term40696.getClass(), "_rootDeserializers", null);
        setField(term40696, term40696.getClass(), "_rootNames", null);
        setField(term40695, term40695.getClass(), "_objectCodec", term40696);
        setIntField(term40695, term40695.getClass(), "_generatorFeatures", 79);
        setBooleanField(term40695, term40695.getClass(), "_closed", false);
        setBooleanField(term40695, term40695.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term40695, term40695.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term40695, term40695.getClass(), "_mayHaveNativeIds", false);
        setField(term40697, term40697.getClass(), "_next", null);
        setLongField(term40697, term40697.getClass(), "_tokenTypes", 0L);
        setField(term40697, term40697.getClass(), "_tokens", term40698);
        setField(term40697, term40697.getClass(), "_nativeIds", null);
        setField(term40695, term40695.getClass(), "_first", term40697);
        setField(term40695, term40695.getClass(), "_last", term40697);
        setIntField(term40695, term40695.getClass(), "_appendAt", 0);
        setField(term40695, term40695.getClass(), "_typeId", null);
        setField(term40695, term40695.getClass(), "_objectId", null);
        setBooleanField(term40695, term40695.getClass(), "_hasNativeId", false);
        setField(term40699, term40699.getClass(), "_parent", null);
        setField(term40699, term40699.getClass(), "_dups", null);
        setField(term40699, term40699.getClass(), "_child", null);
        setField(term40699, term40699.getClass(), "_currentName", null);
        setBooleanField(term40699, term40699.getClass(), "_gotName", false);
        setIntField(term40699, term40699.getClass(), "_type", 0);
        setIntField(term40699, term40699.getClass(), "_index", -1);
        setField(term40695, term40695.getClass(), "_writeContext", term40699);
        setField(term40695, term40695.getClass(), "_cfgPrettyPrinter", null);
        term40700 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40701 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40702 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term40703 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term40704 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term40700, term40700.getClass(), "_parsers", null);
        setIntField(term40700, term40700.getClass(), "_nextParser", 0);
        setField(term40701, term40701.getClass(), "_parsers", null);
        setIntField(term40701, term40701.getClass(), "_nextParser", 0);
        setField(term40702, term40702.getClass(), "_parsers", null);
        setIntField(term40702, term40702.getClass(), "_nextParser", 0);
        setField(term40703, term40703.getClass(), "_reader", null);
        setField(term40703, term40703.getClass(), "_inputBuffer", null);
        setBooleanField(term40703, term40703.getClass(), "_bufferRecyclable", false);
        setField(term40704, term40704.getClass(), "_config", null);
        setField(term40704, term40704.getClass(), "_context", null);
        setField(term40704, term40704.getClass(), "_parserFactory", null);
        setBooleanField(term40704, term40704.getClass(), "_unwrapRoot", false);
        setField(term40704, term40704.getClass(), "_valueType", null);
        setField(term40704, term40704.getClass(), "_rootDeserializer", null);
        setField(term40704, term40704.getClass(), "_valueToUpdate", null);
        setField(term40704, term40704.getClass(), "_schema", null);
        setField(term40704, term40704.getClass(), "_injectableValues", null);
        setField(term40704, term40704.getClass(), "_dataFormatReaders", null);
        setField(term40704, term40704.getClass(), "_rootDeserializers", null);
        setField(term40704, term40704.getClass(), "_rootNames", null);
        setField(term40703, term40703.getClass(), "_objectCodec", term40704);
        setField(term40703, term40703.getClass(), "_symbols", null);
        setIntField(term40703, term40703.getClass(), "_hashSeed", 0);
        setBooleanField(term40703, term40703.getClass(), "_tokenIncomplete", false);
        setField(term40703, term40703.getClass(), "_ioContext", null);
        setBooleanField(term40703, term40703.getClass(), "_closed", false);
        setIntField(term40703, term40703.getClass(), "_inputPtr", 0);
        setIntField(term40703, term40703.getClass(), "_inputEnd", 0);
        setLongField(term40703, term40703.getClass(), "_currInputProcessed", 0L);
        setIntField(term40703, term40703.getClass(), "_currInputRow", 0);
        setIntField(term40703, term40703.getClass(), "_currInputRowStart", 0);
        setLongField(term40703, term40703.getClass(), "_tokenInputTotal", 0L);
        setIntField(term40703, term40703.getClass(), "_tokenInputRow", 0);
        setIntField(term40703, term40703.getClass(), "_tokenInputCol", 0);
        setField(term40703, term40703.getClass(), "_parsingContext", null);
        setField(term40703, term40703.getClass(), "_nextToken", null);
        setField(term40703, term40703.getClass(), "_textBuffer", null);
        setField(term40703, term40703.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term40703, term40703.getClass(), "_nameCopied", false);
        setField(term40703, term40703.getClass(), "_byteArrayBuilder", null);
        setField(term40703, term40703.getClass(), "_binaryValue", null);
        setIntField(term40703, term40703.getClass(), "_numTypesValid", 0);
        setIntField(term40703, term40703.getClass(), "_numberInt", 0);
        setLongField(term40703, term40703.getClass(), "_numberLong", 0L);
        setDoubleField(term40703, term40703.getClass(), "_numberDouble", 0.0);
        setField(term40703, term40703.getClass(), "_numberBigInt", null);
        setField(term40703, term40703.getClass(), "_numberBigDecimal", null);
        setBooleanField(term40703, term40703.getClass(), "_numberNegative", false);
        setIntField(term40703, term40703.getClass(), "_intLength", 0);
        setIntField(term40703, term40703.getClass(), "_fractLength", 0);
        setIntField(term40703, term40703.getClass(), "_expLength", 0);
        setField(term40703, term40703.getClass(), "_currToken", null);
        setField(term40703, term40703.getClass(), "_lastClearedToken", null);
        setIntField(term40703, term40703.getClass(), "_features", 0);
        setField(term40702, term40702.getClass(), "delegate", term40703);
        setIntField(term40702, term40702.getClass(), "_features", 0);
        setField(term40701, term40701.getClass(), "delegate", term40702);
        setIntField(term40701, term40701.getClass(), "_features", 0);
        setField(term40700, term40700.getClass(), "delegate", term40701);
        setIntField(term40700, term40700.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term39961;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40695));
        assertTrue(recursiveEquals(term39961, term40700));
    }

};


