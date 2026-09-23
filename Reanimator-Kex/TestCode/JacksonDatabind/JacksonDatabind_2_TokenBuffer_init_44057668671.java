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
import java.lang.Boolean;
import java.lang.Object;

public class TokenBuffer_init_44057668671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term391;

    public TokenBuffer_init_44057668671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term391 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term392 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term393 = (Object[]) newArray("java.lang.Object", 16);
        Object term394 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term391, term391.getClass(), "_objectCodec", null);
        setIntField(term391, term391.getClass(), "_generatorFeatures", 79);
        setBooleanField(term391, term391.getClass(), "_closed", false);
        setBooleanField(term391, term391.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term391, term391.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term391, term391.getClass(), "_mayHaveNativeIds", false);
        setField(term392, term392.getClass(), "_next", null);
        setLongField(term392, term392.getClass(), "_tokenTypes", 0L);
        setField(term392, term392.getClass(), "_tokens", term393);
        setField(term392, term392.getClass(), "_nativeIds", null);
        setField(term391, term391.getClass(), "_first", term392);
        setField(term391, term391.getClass(), "_last", term392);
        setIntField(term391, term391.getClass(), "_appendAt", 0);
        setField(term391, term391.getClass(), "_typeId", null);
        setField(term391, term391.getClass(), "_objectId", null);
        setBooleanField(term391, term391.getClass(), "_hasNativeId", false);
        setField(term394, term394.getClass(), "_parent", null);
        setField(term394, term394.getClass(), "_dups", null);
        setField(term394, term394.getClass(), "_child", null);
        setField(term394, term394.getClass(), "_currentName", null);
        setBooleanField(term394, term394.getClass(), "_gotName", false);
        setIntField(term394, term394.getClass(), "_type", 0);
        setIntField(term394, term394.getClass(), "_index", -1);
        setField(term391, term391.getClass(), "_writeContext", term394);
        setField(term391, term391.getClass(), "_cfgPrettyPrinter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term391));
        assertTrue(recursiveEquals(term1, false));
    }

};


