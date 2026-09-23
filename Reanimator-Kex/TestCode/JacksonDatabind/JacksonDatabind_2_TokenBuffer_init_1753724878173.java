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

public class TokenBuffer_init_1753724878173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28745;
     Object term29363;
     Object term29367;

    public TokenBuffer_init_1753724878173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28329 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term28421 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term28523 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term28639 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        setBooleanField(term28329, term28329.getClass(), "_hasNativeId", false);
        setField(term28329, term28329.getClass(), "_objectCodec", term28421);
        setIntField(term28329, term28329.getClass(), "_generatorFeatures", 0);
        setField(term28329, term28329.getClass(), "_writeContext", term28523);
        setField(term28329, term28329.getClass(), "_last", null);
        setField(term28329, term28329.getClass(), "_first", term28639);
        setIntField(term28329, term28329.getClass(), "_appendAt", 0);
        setBooleanField(term28329, term28329.getClass(), "_hasNativeTypeIds", false);
        term28745 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term28851 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term28957 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29067 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term29067, term29067.getClass(), "_objectCodec", null);
        setField(term28957, term28957.getClass(), "delegate", term29067);
        setField(term28851, term28851.getClass(), "delegate", term28957);
        setField(term28745, term28745.getClass(), "delegate", term28851);
        term29363 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term29364 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term29365 = (Object[]) newArray("java.lang.Object", 16);
        Object term29366 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term29363, term29363.getClass(), "_objectCodec", null);
        setIntField(term29363, term29363.getClass(), "_generatorFeatures", 79);
        setBooleanField(term29363, term29363.getClass(), "_closed", false);
        setBooleanField(term29363, term29363.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term29363, term29363.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term29363, term29363.getClass(), "_mayHaveNativeIds", false);
        setField(term29364, term29364.getClass(), "_next", null);
        setLongField(term29364, term29364.getClass(), "_tokenTypes", 0L);
        setField(term29364, term29364.getClass(), "_tokens", term29365);
        setField(term29364, term29364.getClass(), "_nativeIds", null);
        setField(term29363, term29363.getClass(), "_first", term29364);
        setField(term29363, term29363.getClass(), "_last", term29364);
        setIntField(term29363, term29363.getClass(), "_appendAt", 0);
        setField(term29363, term29363.getClass(), "_typeId", null);
        setField(term29363, term29363.getClass(), "_objectId", null);
        setBooleanField(term29363, term29363.getClass(), "_hasNativeId", false);
        setField(term29366, term29366.getClass(), "_parent", null);
        setField(term29366, term29366.getClass(), "_dups", null);
        setField(term29366, term29366.getClass(), "_child", null);
        setField(term29366, term29366.getClass(), "_currentName", null);
        setBooleanField(term29366, term29366.getClass(), "_gotName", false);
        setIntField(term29366, term29366.getClass(), "_type", 0);
        setIntField(term29366, term29366.getClass(), "_index", -1);
        setField(term29363, term29363.getClass(), "_writeContext", term29366);
        setField(term29363, term29363.getClass(), "_cfgPrettyPrinter", null);
        term29367 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29368 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29369 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term29370 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term29367, term29367.getClass(), "_parsers", null);
        setIntField(term29367, term29367.getClass(), "_nextParser", 0);
        setField(term29368, term29368.getClass(), "_parsers", null);
        setIntField(term29368, term29368.getClass(), "_nextParser", 0);
        setField(term29369, term29369.getClass(), "_parsers", null);
        setIntField(term29369, term29369.getClass(), "_nextParser", 0);
        setField(term29370, term29370.getClass(), "_objectCodec", null);
        setField(term29370, term29370.getClass(), "_symbols", null);
        setField(term29370, term29370.getClass(), "_quadBuffer", null);
        setBooleanField(term29370, term29370.getClass(), "_tokenIncomplete", false);
        setIntField(term29370, term29370.getClass(), "_quad1", 0);
        setField(term29370, term29370.getClass(), "_inputStream", null);
        setField(term29370, term29370.getClass(), "_inputBuffer", null);
        setBooleanField(term29370, term29370.getClass(), "_bufferRecyclable", false);
        setField(term29370, term29370.getClass(), "_ioContext", null);
        setBooleanField(term29370, term29370.getClass(), "_closed", false);
        setIntField(term29370, term29370.getClass(), "_inputPtr", 0);
        setIntField(term29370, term29370.getClass(), "_inputEnd", 0);
        setLongField(term29370, term29370.getClass(), "_currInputProcessed", 0L);
        setIntField(term29370, term29370.getClass(), "_currInputRow", 0);
        setIntField(term29370, term29370.getClass(), "_currInputRowStart", 0);
        setLongField(term29370, term29370.getClass(), "_tokenInputTotal", 0L);
        setIntField(term29370, term29370.getClass(), "_tokenInputRow", 0);
        setIntField(term29370, term29370.getClass(), "_tokenInputCol", 0);
        setField(term29370, term29370.getClass(), "_parsingContext", null);
        setField(term29370, term29370.getClass(), "_nextToken", null);
        setField(term29370, term29370.getClass(), "_textBuffer", null);
        setField(term29370, term29370.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term29370, term29370.getClass(), "_nameCopied", false);
        setField(term29370, term29370.getClass(), "_byteArrayBuilder", null);
        setField(term29370, term29370.getClass(), "_binaryValue", null);
        setIntField(term29370, term29370.getClass(), "_numTypesValid", 0);
        setIntField(term29370, term29370.getClass(), "_numberInt", 0);
        setLongField(term29370, term29370.getClass(), "_numberLong", 0L);
        setDoubleField(term29370, term29370.getClass(), "_numberDouble", 0.0);
        setField(term29370, term29370.getClass(), "_numberBigInt", null);
        setField(term29370, term29370.getClass(), "_numberBigDecimal", null);
        setBooleanField(term29370, term29370.getClass(), "_numberNegative", false);
        setIntField(term29370, term29370.getClass(), "_intLength", 0);
        setIntField(term29370, term29370.getClass(), "_fractLength", 0);
        setIntField(term29370, term29370.getClass(), "_expLength", 0);
        setField(term29370, term29370.getClass(), "_currToken", null);
        setField(term29370, term29370.getClass(), "_lastClearedToken", null);
        setIntField(term29370, term29370.getClass(), "_features", 0);
        setField(term29369, term29369.getClass(), "delegate", term29370);
        setIntField(term29369, term29369.getClass(), "_features", 0);
        setField(term29368, term29368.getClass(), "delegate", term29369);
        setIntField(term29368, term29368.getClass(), "_features", 0);
        setField(term29367, term29367.getClass(), "delegate", term29368);
        setIntField(term29367, term29367.getClass(), "_features", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[1];
        args[0] = term28745;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29363));
        assertTrue(recursiveEquals(term28745, term29367));
    }

};


