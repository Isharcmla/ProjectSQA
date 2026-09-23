package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ReferenceCollectingCallback_isBlockBoundary_68469872157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6655;
     Object term6725;
     Object term6838;
     Object term6840;

    public ReferenceCollectingCallback_isBlockBoundary_68469872157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term6725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6725, term6725.getClass(), "type", 108);
        setField(term6725, term6725.getClass(), "first", term6795);
        term6838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6838, term6838.getClass(), "type", 108);
        setField(term6838, term6838.getClass(), "next", null);
        setIntField(term6839, term6839.getClass(), "type", 0);
        setField(term6839, term6839.getClass(), "next", null);
        setField(term6839, term6839.getClass(), "first", null);
        setField(term6839, term6839.getClass(), "last", null);
        setField(term6839, term6839.getClass(), "propListHead", null);
        setIntField(term6839, term6839.getClass(), "sourcePosition", 0);
        setField(term6839, term6839.getClass(), "jsType", null);
        setField(term6839, term6839.getClass(), "parent", null);
        setField(term6838, term6838.getClass(), "first", term6839);
        setField(term6838, term6838.getClass(), "last", null);
        setField(term6838, term6838.getClass(), "propListHead", null);
        setIntField(term6838, term6838.getClass(), "sourcePosition", 0);
        setField(term6838, term6838.getClass(), "jsType", null);
        setField(term6838, term6838.getClass(), "parent", null);
        term6840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6840, term6840.getClass(), "type", 0);
        setField(term6840, term6840.getClass(), "next", null);
        setField(term6840, term6840.getClass(), "first", null);
        setField(term6840, term6840.getClass(), "last", null);
        setField(term6840, term6840.getClass(), "propListHead", null);
        setIntField(term6840, term6840.getClass(), "sourcePosition", 0);
        setField(term6840, term6840.getClass(), "jsType", null);
        setField(term6840, term6840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6655;
        args[1] = term6725;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term6655, term6838));
        assertTrue(recursiveEquals(term6725, term6840));
        assertTrue(recursiveEquals(retValue, true));
    }

};


