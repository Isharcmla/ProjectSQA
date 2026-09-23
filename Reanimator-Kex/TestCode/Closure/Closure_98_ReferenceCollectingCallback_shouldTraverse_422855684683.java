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

public class ReferenceCollectingCallback_shouldTraverse_422855684683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181914;
     Object term181984;
     Object term182076;
     Object term182077;

    public ReferenceCollectingCallback_shouldTraverse_422855684683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181914 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term181984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term181984, term181984.getClass(), "type", 101);
        term182076 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term182076, term182076.getClass(), "referenceMap", null);
        setField(term182076, term182076.getClass(), "blockStack", null);
        setField(term182076, term182076.getClass(), "behavior", null);
        setField(term182076, term182076.getClass(), "compiler", null);
        setField(term182076, term182076.getClass(), "varFilter", null);
        term182077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term182077, term182077.getClass(), "type", 101);
        setField(term182077, term182077.getClass(), "next", null);
        setField(term182077, term182077.getClass(), "first", null);
        setField(term182077, term182077.getClass(), "last", null);
        setField(term182077, term182077.getClass(), "propListHead", null);
        setIntField(term182077, term182077.getClass(), "sourcePosition", 0);
        setField(term182077, term182077.getClass(), "jsType", null);
        setField(term182077, term182077.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term181984;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term181914, args);
        assertTrue(recursiveEquals(term181914, term182076));
        assertTrue(recursiveEquals(term181984, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


