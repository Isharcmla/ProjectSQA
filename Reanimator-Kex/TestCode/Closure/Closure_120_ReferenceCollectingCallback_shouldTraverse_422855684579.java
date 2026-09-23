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

public class ReferenceCollectingCallback_shouldTraverse_422855684579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178911;
     Object term179003;
     Object term179015;
     Object term179016;

    public ReferenceCollectingCallback_shouldTraverse_422855684579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178911 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term179003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term179003, term179003.getClass(), "type", 108);
        term179015 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term179015, term179015.getClass(), "referenceMap", null);
        setField(term179015, term179015.getClass(), "blockStack", null);
        setField(term179015, term179015.getClass(), "behavior", null);
        setField(term179015, term179015.getClass(), "compiler", null);
        setField(term179015, term179015.getClass(), "varFilter", null);
        term179016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term179016, term179016.getClass(), "number", 0.0);
        setIntField(term179016, term179016.getClass(), "type", 108);
        setField(term179016, term179016.getClass(), "next", null);
        setField(term179016, term179016.getClass(), "first", null);
        setField(term179016, term179016.getClass(), "last", null);
        setField(term179016, term179016.getClass(), "propListHead", null);
        setIntField(term179016, term179016.getClass(), "sourcePosition", 0);
        setField(term179016, term179016.getClass(), "jsType", null);
        setField(term179016, term179016.getClass(), "parent", null);
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
        args[2] = term179003;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term178911, args);
        assertTrue(recursiveEquals(term178911, term179015));
        assertTrue(recursiveEquals(term179003, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


