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

public class TokenBuffer_init_44057668673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term395;

    public TokenBuffer_init_44057668673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term395 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object term396 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        Object[] term397 = (Object[]) newArray("java.lang.Object", 16);
        Object term398 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term395, term395.getClass(), "_objectCodec", null);
        setIntField(term395, term395.getClass(), "_generatorFeatures", 31);
        setBooleanField(term395, term395.getClass(), "_closed", false);
        setBooleanField(term395, term395.getClass(), "_hasNativeTypeIds", false);
        setBooleanField(term395, term395.getClass(), "_hasNativeObjectIds", false);
        setBooleanField(term395, term395.getClass(), "_mayHaveNativeIds", false);
        setBooleanField(term395, term395.getClass(), "_forceBigDecimal", false);
        setField(term396, term396.getClass(), "_next", null);
        setLongField(term396, term396.getClass(), "_tokenTypes", 0L);
        setField(term396, term396.getClass(), "_tokens", term397);
        setField(term396, term396.getClass(), "_nativeIds", null);
        setField(term395, term395.getClass(), "_first", term396);
        setField(term395, term395.getClass(), "_last", term396);
        setIntField(term395, term395.getClass(), "_appendAt", 0);
        setField(term395, term395.getClass(), "_typeId", null);
        setField(term395, term395.getClass(), "_objectId", null);
        setBooleanField(term395, term395.getClass(), "_hasNativeId", false);
        setField(term398, term398.getClass(), "_parent", null);
        setField(term398, term398.getClass(), "_dups", null);
        setField(term398, term398.getClass(), "_child", null);
        setField(term398, term398.getClass(), "_currentName", null);
        setField(term398, term398.getClass(), "_currentValue", null);
        setBooleanField(term398, term398.getClass(), "_gotName", false);
        setIntField(term398, term398.getClass(), "_type", 0);
        setIntField(term398, term398.getClass(), "_index", -1);
        setField(term395, term395.getClass(), "_writeContext", term398);
        setField(term395, term395.getClass(), "_cfgPrettyPrinter", null);
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
        assertTrue(recursiveEquals(instance, term395));
        assertTrue(recursiveEquals(term1, false));
    }

};


