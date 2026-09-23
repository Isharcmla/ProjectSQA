package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.json.EqualityUtils.*;
import java.lang.Integer;

public class JsonWriteContext_init_79100246017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term91;

    public JsonWriteContext_init_79100246017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term91 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term91, term91.getClass(), "_parent", null);
        setField(term91, term91.getClass(), "_dups", null);
        setField(term91, term91.getClass(), "_child", null);
        setField(term91, term91.getClass(), "_currentName", null);
        setField(term91, term91.getClass(), "_currentValue", null);
        setBooleanField(term91, term91.getClass(), "_gotName", false);
        setIntField(term91, term91.getClass(), "_type", 568599855);
        setIntField(term91, term91.getClass(), "_index", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91));
        assertTrue(recursiveEquals(term1, 568599855));
    }

};


