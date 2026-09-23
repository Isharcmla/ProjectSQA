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

public class TokenBuffer_init_1753724878181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33301;
     Object term34033;
     Object term34038;

    public TokenBuffer_init_1753724878181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32769 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term32861 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term32963 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term33079 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object term33195 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term32769, term32769.getClass(), "_hasNativeId", false);
        setField(term32769, term32769.getClass(), "_objectCodec", term32861);
        setIntField(term32769, term32769.getClass(), "_generatorFeatures", 0);
        setField(term32769, term32769.getClass(), "_writeContext", term32963);
        setField(term32769, term32769.getClass(), "_last", term33079);
        setField(term32769, term32769.getClass(), "_first", term33195);
        setIntField(term32769, term32769.getClass(), "_appendAt", 0);
        term33301 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term33407 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term33513 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term33623 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term33715 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term33623, term33623.getClass(), "_objectCodec", term33715);
        setField(term33513, term33513.getClass(), "delegate", term33623);
        setField(term33407, term33407.getClass(), "delegate", term33513);
        setField(term33301, term33301.getClass(), "delegate", term33407);
        term34033 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term34034 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34035 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term34036 = (Object[]) newArray("java.lang.Object", 16);
        Object term34037 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term34034, term34034.getClass(), "_config", null);
        setField(term34034, term34034.getClass(), "_context", null);
        setField(term34034, term34034.getClass(), "_parserFactory", null);
        setBooleanField(term34034, term34034.getClass(), "_unwrapRoot", false);
        setField(term34034, term34034.getClass(), "_valueType", null);
        setField(term34034, term34034.getClass(), "_rootDeserializer", null);
        setField(term34034, term34034.getClass(), "_valueToUpdate", null);
        setField(term34034, term34034.getClass(), "_schema", null);
        setField(term34034, term34034.getClass(), "_injectableValues", null);
        setField(term34034, term34034.getClass(), "_dataFormatReaders", null);
        setField(term34034, term34034.getClass(), "_rootDeserializers", null);
        setField(term34034, term34034.getClass(), "_rootNames", null);
        setField(term34033, term34033.getClass(), "_objectCodec", term34034);
        setIntField(term34033, term34033.getClass(), "_generatorFeatures", 79);
        setBooleanField(term34033, term34033.getClass(), "_closed", false);
        setBooleanField(term34033, term34033.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term34033, term34033.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term34033, term34033.getClass(), "_mayHaveNativeIds", false);
        setField(term34035, term34035.getClass(), "_next", null);
        setLongField(term34035, term34035.getClass(), "_tokenTypes", 0L);
        setField(term34035, term34035.getClass(), "_tokens", term34036);
        setField(term34035, term34035.getClass(), "_nativeIds", null);
        setField(term34033, term34033.getClass(), "_first", term34035);
        setField(term34033, term34033.getClass(), "_last", term34035);
        setIntField(term34033, term34033.getClass(), "_appendAt", 0);
        setField(term34033, term34033.getClass(), "_typeId", null);
        setField(term34033, term34033.getClass(), "_objectId", null);
        setBooleanField(term34033, term34033.getClass(), "_hasNativeId", false);
        setField(term34037, term34037.getClass(), "_parent", null);
        setField(term34037, term34037.getClass(), "_dups", null);
        setField(term34037, term34037.getClass(), "_child", null);
        setField(term34037, term34037.getClass(), "_currentName", null);
        setBooleanField(term34037, term34037.getClass(), "_gotName", false);
        setIntField(term34037, term34037.getClass(), "_type", 0);
        setIntField(term34037, term34037.getClass(), "_index", -1);
        setField(term34033, term34033.getClass(), "_writeContext", term34037);
        setField(term34033, term34033.getClass(), "_cfgPrettyPrinter", null);
        term34038 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34039 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34040 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term34041 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term34042 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34038, term34038.getClass(), "_parsers", null);
        setIntField(term34038, term34038.getClass(), "_nextParser", 0);
        setField(term34039, term34039.getClass(), "_parsers", null);
        setIntField(term34039, term34039.getClass(), "_nextParser", 0);
        setField(term34040, term34040.getClass(), "_parsers", null);
        setIntField(term34040, term34040.getClass(), "_nextParser", 0);
        setField(term34042, term34042.getClass(), "_config", null);
        setField(term34042, term34042.getClass(), "_context", null);
        setField(term34042, term34042.getClass(), "_parserFactory", null);
        setBooleanField(term34042, term34042.getClass(), "_unwrapRoot", false);
        setField(term34042, term34042.getClass(), "_valueType", null);
        setField(term34042, term34042.getClass(), "_rootDeserializer", null);
        setField(term34042, term34042.getClass(), "_valueToUpdate", null);
        setField(term34042, term34042.getClass(), "_schema", null);
        setField(term34042, term34042.getClass(), "_injectableValues", null);
        setField(term34042, term34042.getClass(), "_dataFormatReaders", null);
        setField(term34042, term34042.getClass(), "_rootDeserializers", null);
        setField(term34042, term34042.getClass(), "_rootNames", null);
        setField(term34041, term34041.getClass(), "_objectCodec", term34042);
        setField(term34041, term34041.getClass(), "_symbols", null);
        setField(term34041, term34041.getClass(), "_quadBuffer", null);
        setBooleanField(term34041, term34041.getClass(), "_tokenIncomplete", false);
        setIntField(term34041, term34041.getClass(), "_quad1", 0);
        setField(term34041, term34041.getClass(), "_inputStream", null);
        setField(term34041, term34041.getClass(), "_inputBuffer", null);
        setBooleanField(term34041, term34041.getClass(), "_bufferRecyclable", false);
        setField(term34041, term34041.getClass(), "_ioContext", null);
        setBooleanField(term34041, term34041.getClass(), "_closed", false);
        setIntField(term34041, term34041.getClass(), "_inputPtr", 0);
        setIntField(term34041, term34041.getClass(), "_inputEnd", 0);
        setLongField(term34041, term34041.getClass(), "_currInputProcessed", 0L);
        setIntField(term34041, term34041.getClass(), "_currInputRow", 0);
        setIntField(term34041, term34041.getClass(), "_currInputRowStart", 0);
        setLongField(term34041, term34041.getClass(), "_tokenInputTotal", 0L);
        setIntField(term34041, term34041.getClass(), "_tokenInputRow", 0);
        setIntField(term34041, term34041.getClass(), "_tokenInputCol", 0);
        setField(term34041, term34041.getClass(), "_parsingContext", null);
        setField(term34041, term34041.getClass(), "_nextToken", null);
        setField(term34041, term34041.getClass(), "_textBuffer", null);
        setField(term34041, term34041.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term34041, term34041.getClass(), "_nameCopied", false);
        setField(term34041, term34041.getClass(), "_byteArrayBuilder", null);
        setField(term34041, term34041.getClass(), "_binaryValue", null);
        setIntField(term34041, term34041.getClass(), "_numTypesValid", 0);
        setIntField(term34041, term34041.getClass(), "_numberInt", 0);
        setLongField(term34041, term34041.getClass(), "_numberLong", 0L);
        setDoubleField(term34041, term34041.getClass(), "_numberDouble", 0.0);
        setField(term34041, term34041.getClass(), "_numberBigInt", null);
        setField(term34041, term34041.getClass(), "_numberBigDecimal", null);
        setBooleanField(term34041, term34041.getClass(), "_numberNegative", false);
        setIntField(term34041, term34041.getClass(), "_intLength", 0);
        setIntField(term34041, term34041.getClass(), "_fractLength", 0);
        setIntField(term34041, term34041.getClass(), "_expLength", 0);
        setField(term34041, term34041.getClass(), "_currToken", null);
        setField(term34041, term34041.getClass(), "_lastClearedToken", null);
        setIntField(term34041, term34041.getClass(), "_features", 0);
        setField(term34040, term34040.getClass(), "delegate", term34041);
        setIntField(term34040, term34040.getClass(), "_features", 0);
        setField(term34039, term34039.getClass(), "delegate", term34040);
        setIntField(term34039, term34039.getClass(), "_features", 0);
        setField(term34038, term34038.getClass(), "delegate", term34039);
        setIntField(term34038, term34038.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term33301;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34033));
        assertTrue(recursiveEquals(term33301, term34038));
    }

};


