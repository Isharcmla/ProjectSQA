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

public class TokenBuffer_init_67719210871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;

    public TokenBuffer_init_67719210871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term364 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term365 = (Object[]) newArray("java.lang.Object", 16);
        Object term366 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term363, term363.getClass(), "_objectCodec", null);
        setIntField(term363, term363.getClass(), "_generatorFeatures", 31);
        setBooleanField(term363, term363.getClass(), "_closed", false);
        setBooleanField(term363, term363.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term363, term363.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term363, term363.getClass(), "_mayHaveNativeIds", false);
        setField(term364, term364.getClass(), "_next", null);
        setLongField(term364, term364.getClass(), "_tokenTypes", 0L);
        setField(term364, term364.getClass(), "_tokens", term365);
        setField(term364, term364.getClass(), "_nativeIds", null);
        setField(term363, term363.getClass(), "_first", term364);
        setField(term363, term363.getClass(), "_last", term364);
        setIntField(term363, term363.getClass(), "_appendAt", 0);
        setField(term363, term363.getClass(), "_typeId", null);
        setField(term363, term363.getClass(), "_objectId", null);
        setBooleanField(term363, term363.getClass(), "_hasNativeId", false);
        setField(term366, term366.getClass(), "_parent", null);
        setField(term366, term366.getClass(), "_dups", null);
        setField(term366, term366.getClass(), "_child", null);
        setField(term366, term366.getClass(), "_currentName", null);
        setField(term366, term366.getClass(), "_currentValue", null);
        setBooleanField(term366, term366.getClass(), "_gotName", false);
        setIntField(term366, term366.getClass(), "_type", 0);
        setIntField(term366, term366.getClass(), "_index", -1);
        setField(term363, term363.getClass(), "_writeContext", term366);
        setField(term363, term363.getClass(), "_cfgPrettyPrinter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term363));
    }

};


