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

public class TokenBuffer_init_2115099637169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25226;
     Object term25466;
     Object term25554;
     Object term25559;
     Object term25561;

    public TokenBuffer_init_2115099637169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25116 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setBooleanField(term25116, term25116.getClass(), "_hasNativeId", false);
        setField(term25116, term25116.getClass(), "_objectCodec", null);
        setIntField(term25116, term25116.getClass(), "_generatorFeatures", 0);
        setField(term25116, term25116.getClass(), "_writeContext", null);
        setField(term25116, term25116.getClass(), "_last", null);
        setField(term25116, term25116.getClass(), "_first", null);
        setIntField(term25116, term25116.getClass(), "_appendAt", 0);
        setBooleanField(term25116, term25116.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term25116, term25116.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term25116, term25116.getClass(), "_mayHaveNativeIds", false);
        term25226 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term25318 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term25226, term25226.getClass(), "_objectCodec", term25318);
        term25466 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term25466, term25466.getClass(), "_featureFlags", -1);
        term25554 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term25555 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term25556 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term25557 = (Object[]) newArray("java.lang.Object", 16);
        Object term25558 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term25555, term25555.getClass(), "_jsonFactory", null);
        setField(term25555, term25555.getClass(), "_typeFactory", null);
        setField(term25555, term25555.getClass(), "_injectableValues", null);
        setField(term25555, term25555.getClass(), "_subtypeResolver", null);
        setField(term25555, term25555.getClass(), "_mixIns", null);
        setField(term25555, term25555.getClass(), "_serializationConfig", null);
        setField(term25555, term25555.getClass(), "_serializerProvider", null);
        setField(term25555, term25555.getClass(), "_serializerFactory", null);
        setField(term25555, term25555.getClass(), "_deserializationConfig", null);
        setField(term25555, term25555.getClass(), "_deserializationContext", null);
        setField(term25555, term25555.getClass(), "_registeredModuleTypes", null);
        setField(term25555, term25555.getClass(), "_rootDeserializers", null);
        setField(term25554, term25554.getClass(), "_objectCodec", term25555);
        setIntField(term25554, term25554.getClass(), "_generatorFeatures", 31);
        setBooleanField(term25554, term25554.getClass(), "_closed", false);
        setBooleanField(term25554, term25554.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term25554, term25554.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term25554, term25554.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term25554, term25554.getClass(), "_forceBigDecimal", true);
        setField(term25556, term25556.getClass(), "_next", null);
        setLongField(term25556, term25556.getClass(), "_tokenTypes", 0L);
        setField(term25556, term25556.getClass(), "_tokens", term25557);
        setField(term25556, term25556.getClass(), "_nativeIds", null);
        setField(term25554, term25554.getClass(), "_first", term25556);
        setField(term25554, term25554.getClass(), "_last", term25556);
        setIntField(term25554, term25554.getClass(), "_appendAt", 0);
        setField(term25554, term25554.getClass(), "_typeId", null);
        setField(term25554, term25554.getClass(), "_objectId", null);
        setBooleanField(term25554, term25554.getClass(), "_hasNativeId", false);
        setField(term25558, term25558.getClass(), "_parent", null);
        setField(term25558, term25558.getClass(), "_dups", null);
        setField(term25558, term25558.getClass(), "_child", null);
        setField(term25558, term25558.getClass(), "_currentName", null);
        setField(term25558, term25558.getClass(), "_currentValue", null);
        setBooleanField(term25558, term25558.getClass(), "_gotName", false);
        setIntField(term25558, term25558.getClass(), "_type", 0);
        setIntField(term25558, term25558.getClass(), "_index", -1);
        setField(term25554, term25554.getClass(), "_writeContext", term25558);
        setField(term25554, term25554.getClass(), "_cfgPrettyPrinter", null);
        term25559 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term25560 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term25560, term25560.getClass(), "_jsonFactory", null);
        setField(term25560, term25560.getClass(), "_typeFactory", null);
        setField(term25560, term25560.getClass(), "_injectableValues", null);
        setField(term25560, term25560.getClass(), "_subtypeResolver", null);
        setField(term25560, term25560.getClass(), "_mixIns", null);
        setField(term25560, term25560.getClass(), "_serializationConfig", null);
        setField(term25560, term25560.getClass(), "_serializerProvider", null);
        setField(term25560, term25560.getClass(), "_serializerFactory", null);
        setField(term25560, term25560.getClass(), "_deserializationConfig", null);
        setField(term25560, term25560.getClass(), "_deserializationContext", null);
        setField(term25560, term25560.getClass(), "_registeredModuleTypes", null);
        setField(term25560, term25560.getClass(), "_rootDeserializers", null);
        setField(term25559, term25559.getClass(), "_objectCodec", term25560);
        setField(term25559, term25559.getClass(), "_symbols", null);
        setField(term25559, term25559.getClass(), "_quadBuffer", null);
        setBooleanField(term25559, term25559.getClass(), "_tokenIncomplete", false);
        setIntField(term25559, term25559.getClass(), "_quad1", 0);
        setField(term25559, term25559.getClass(), "_inputStream", null);
        setField(term25559, term25559.getClass(), "_inputBuffer", null);
        setBooleanField(term25559, term25559.getClass(), "_bufferRecyclable", false);
        setField(term25559, term25559.getClass(), "_ioContext", null);
        setBooleanField(term25559, term25559.getClass(), "_closed", false);
        setIntField(term25559, term25559.getClass(), "_inputPtr", 0);
        setIntField(term25559, term25559.getClass(), "_inputEnd", 0);
        setLongField(term25559, term25559.getClass(), "_currInputProcessed", 0L);
        setIntField(term25559, term25559.getClass(), "_currInputRow", 0);
        setIntField(term25559, term25559.getClass(), "_currInputRowStart", 0);
        setLongField(term25559, term25559.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25559, term25559.getClass(), "_tokenInputRow", 0);
        setIntField(term25559, term25559.getClass(), "_tokenInputCol", 0);
        setField(term25559, term25559.getClass(), "_parsingContext", null);
        setField(term25559, term25559.getClass(), "_nextToken", null);
        setField(term25559, term25559.getClass(), "_textBuffer", null);
        setField(term25559, term25559.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term25559, term25559.getClass(), "_nameCopied", false);
        setField(term25559, term25559.getClass(), "_byteArrayBuilder", null);
        setField(term25559, term25559.getClass(), "_binaryValue", null);
        setIntField(term25559, term25559.getClass(), "_numTypesValid", 0);
        setIntField(term25559, term25559.getClass(), "_numberInt", 0);
        setLongField(term25559, term25559.getClass(), "_numberLong", 0L);
        setDoubleField(term25559, term25559.getClass(), "_numberDouble", 0.0);
        setField(term25559, term25559.getClass(), "_numberBigInt", null);
        setField(term25559, term25559.getClass(), "_numberBigDecimal", null);
        setBooleanField(term25559, term25559.getClass(), "_numberNegative", false);
        setIntField(term25559, term25559.getClass(), "_intLength", 0);
        setIntField(term25559, term25559.getClass(), "_fractLength", 0);
        setIntField(term25559, term25559.getClass(), "_expLength", 0);
        setField(term25559, term25559.getClass(), "_currToken", null);
        setField(term25559, term25559.getClass(), "_lastClearedToken", null);
        setIntField(term25559, term25559.getClass(), "_features", 0);
        term25561 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term25561, term25561.getClass(), "_objectIds", null);
        setField(term25561, term25561.getClass(), "_objectIdResolvers", null);
        setField(term25561, term25561.getClass(), "_cache", null);
        setField(term25561, term25561.getClass(), "_factory", null);
        setField(term25561, term25561.getClass(), "_config", null);
        setIntField(term25561, term25561.getClass(), "_featureFlags", -1);
        setField(term25561, term25561.getClass(), "_view", null);
        setField(term25561, term25561.getClass(), "_parser", null);
        setField(term25561, term25561.getClass(), "_injectableValues", null);
        setField(term25561, term25561.getClass(), "_arrayBuilders", null);
        setField(term25561, term25561.getClass(), "_objectBuffer", null);
        setField(term25561, term25561.getClass(), "_dateFormat", null);
        setField(term25561, term25561.getClass(), "_attributes", null);
        setField(term25561, term25561.getClass(), "_currentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term25226;
        args[1] = term25466;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25554));
        assertTrue(recursiveEquals(term25226, term25559));
        assertTrue(recursiveEquals(term25466, term25561));
    }

};


