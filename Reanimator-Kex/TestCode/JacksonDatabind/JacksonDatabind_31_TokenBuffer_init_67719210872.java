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

public class TokenBuffer_init_67719210872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public TokenBuffer_init_67719210872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term367 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term368 = (Object[]) newArray("java.lang.Object", 16);
        Object term369 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term366, term366.getClass(), "_objectCodec", null);
        setIntField(term366, term366.getClass(), "_generatorFeatures", 31);
        setBooleanField(term366, term366.getClass(), "_closed", false);
        setBooleanField(term366, term366.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term366, term366.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term366, term366.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term366, term366.getClass(), "_forceBigDecimal", false);
        setField(term367, term367.getClass(), "_next", null);
        setLongField(term367, term367.getClass(), "_tokenTypes", 0L);
        setField(term367, term367.getClass(), "_tokens", term368);
        setField(term367, term367.getClass(), "_nativeIds", null);
        setField(term366, term366.getClass(), "_first", term367);
        setField(term366, term366.getClass(), "_last", term367);
        setIntField(term366, term366.getClass(), "_appendAt", 0);
        setField(term366, term366.getClass(), "_typeId", null);
        setField(term366, term366.getClass(), "_objectId", null);
        setBooleanField(term366, term366.getClass(), "_hasNativeId", false);
        setField(term369, term369.getClass(), "_parent", null);
        setField(term369, term369.getClass(), "_dups", null);
        setField(term369, term369.getClass(), "_child", null);
        setField(term369, term369.getClass(), "_currentName", null);
        setField(term369, term369.getClass(), "_currentValue", null);
        setBooleanField(term369, term369.getClass(), "_gotName", false);
        setIntField(term369, term369.getClass(), "_type", 0);
        setIntField(term369, term369.getClass(), "_index", -1);
        setField(term366, term366.getClass(), "_writeContext", term369);
        setField(term366, term366.getClass(), "_cfgPrettyPrinter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term366));
    }

};


