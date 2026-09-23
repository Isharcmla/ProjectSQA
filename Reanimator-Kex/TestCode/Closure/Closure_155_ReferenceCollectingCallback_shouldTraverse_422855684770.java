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

public class ReferenceCollectingCallback_shouldTraverse_422855684770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200281;
     Object term200373;
     Object term201235;
     Object term201236;

    public ReferenceCollectingCallback_shouldTraverse_422855684770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200281 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term200373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term200373, term200373.getClass(), "type", 100);
        term201235 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term201235, term201235.getClass(), "referenceMap", null);
        setField(term201235, term201235.getClass(), "blockStack", null);
        setField(term201235, term201235.getClass(), "behavior", null);
        setField(term201235, term201235.getClass(), "compiler", null);
        setField(term201235, term201235.getClass(), "varFilter", null);
        term201236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term201236, term201236.getClass(), "number", 0.0);
        setIntField(term201236, term201236.getClass(), "type", 100);
        setField(term201236, term201236.getClass(), "next", null);
        setField(term201236, term201236.getClass(), "first", null);
        setField(term201236, term201236.getClass(), "last", null);
        setField(term201236, term201236.getClass(), "propListHead", null);
        setIntField(term201236, term201236.getClass(), "sourcePosition", 0);
        setField(term201236, term201236.getClass(), "jsType", null);
        setField(term201236, term201236.getClass(), "parent", null);
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
        args[2] = term200373;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term200281, args);
        assertTrue(recursiveEquals(term200281, term201235));
        assertTrue(recursiveEquals(term200373, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


