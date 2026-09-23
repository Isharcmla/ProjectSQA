package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_comma_403530381697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106061;
     Object term106768;
     Object term106770;
     Object term106587;

    public IR_comma_403530381697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106061, term106061.getClass(), "type", 85);
        term106768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106768, term106768.getClass(), "type", 85);
        setField(term106768, term106768.getClass(), "next", null);
        setField(term106768, term106768.getClass(), "first", null);
        setField(term106768, term106768.getClass(), "last", null);
        setField(term106768, term106768.getClass(), "propListHead", null);
        setIntField(term106768, term106768.getClass(), "sourcePosition", 0);
        setField(term106768, term106768.getClass(), "jsType", null);
        setIntField(term106769, term106769.getClass(), "type", 85);
        setField(term106769, term106769.getClass(), "next", null);
        setField(term106769, term106769.getClass(), "first", term106768);
        setField(term106769, term106769.getClass(), "last", term106768);
        setField(term106769, term106769.getClass(), "propListHead", null);
        setIntField(term106769, term106769.getClass(), "sourcePosition", -1);
        setField(term106769, term106769.getClass(), "jsType", null);
        setField(term106769, term106769.getClass(), "parent", null);
        setField(term106768, term106768.getClass(), "parent", term106769);
        term106770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106770, term106770.getClass(), "type", 85);
        setField(term106770, term106770.getClass(), "next", null);
        setField(term106770, term106770.getClass(), "first", null);
        setField(term106770, term106770.getClass(), "last", null);
        setField(term106770, term106770.getClass(), "propListHead", null);
        setIntField(term106770, term106770.getClass(), "sourcePosition", 0);
        setField(term106770, term106770.getClass(), "jsType", null);
        setIntField(term106771, term106771.getClass(), "type", 85);
        setField(term106771, term106771.getClass(), "next", null);
        setField(term106771, term106771.getClass(), "first", term106770);
        setField(term106771, term106771.getClass(), "last", term106770);
        setField(term106771, term106771.getClass(), "propListHead", null);
        setIntField(term106771, term106771.getClass(), "sourcePosition", -1);
        setField(term106771, term106771.getClass(), "jsType", null);
        setField(term106771, term106771.getClass(), "parent", null);
        setField(term106770, term106770.getClass(), "parent", term106771);
        term106587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106587, term106587.getClass(), "type", 85);
        setField(term106587, term106587.getClass(), "next", null);
        setIntField(term106584, term106584.getClass(), "type", 85);
        setField(term106584, term106584.getClass(), "next", null);
        setField(term106584, term106584.getClass(), "first", null);
        setField(term106584, term106584.getClass(), "last", null);
        setField(term106584, term106584.getClass(), "propListHead", null);
        setIntField(term106584, term106584.getClass(), "sourcePosition", 0);
        setField(term106584, term106584.getClass(), "jsType", null);
        setField(term106584, term106584.getClass(), "parent", term106587);
        setField(term106587, term106587.getClass(), "first", term106584);
        setField(term106587, term106587.getClass(), "last", term106584);
        setField(term106587, term106587.getClass(), "propListHead", null);
        setIntField(term106587, term106587.getClass(), "sourcePosition", -1);
        setField(term106587, term106587.getClass(), "jsType", null);
        setField(term106587, term106587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term106061;
        args[1] = term106061;
        Object retValue = callMethod(klass, "comma", argTypes, null, args);
        assertTrue(recursiveEquals(term106061, term106768));
        assertTrue(recursiveEquals(term106061, term106770));
        assertTrue(recursiveEquals(retValue, term106587));
    }

};


