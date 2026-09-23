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

public class ReferenceCollectingCallback_shouldTraverse_422855684673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180453;
     Object term180545;
     Object term180637;
     Object term180890;
     Object term180891;
     Object term180892;

    public ReferenceCollectingCallback_shouldTraverse_422855684673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180453 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term180545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term180637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term180637, term180637.getClass(), "type", 4);
        term180890 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180890, term180890.getClass(), "referenceMap", null);
        setField(term180890, term180890.getClass(), "blockStack", null);
        setField(term180890, term180890.getClass(), "behavior", null);
        setField(term180890, term180890.getClass(), "compiler", null);
        setField(term180890, term180890.getClass(), "varFilter", null);
        term180891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180891, term180891.getClass(), "str", null);
        setIntField(term180891, term180891.getClass(), "type", 4);
        setField(term180891, term180891.getClass(), "next", null);
        setField(term180891, term180891.getClass(), "first", null);
        setField(term180891, term180891.getClass(), "last", null);
        setField(term180891, term180891.getClass(), "propListHead", null);
        setIntField(term180891, term180891.getClass(), "sourcePosition", 0);
        setField(term180891, term180891.getClass(), "jsType", null);
        setField(term180891, term180891.getClass(), "parent", null);
        term180892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180892, term180892.getClass(), "str", null);
        setIntField(term180892, term180892.getClass(), "type", 0);
        setField(term180892, term180892.getClass(), "next", null);
        setField(term180892, term180892.getClass(), "first", null);
        setField(term180892, term180892.getClass(), "last", null);
        setField(term180892, term180892.getClass(), "propListHead", null);
        setIntField(term180892, term180892.getClass(), "sourcePosition", 0);
        setField(term180892, term180892.getClass(), "jsType", null);
        setField(term180892, term180892.getClass(), "parent", null);
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
        args[1] = term180545;
        args[2] = term180637;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term180453, args);
        assertTrue(recursiveEquals(term180453, term180890));
        assertTrue(recursiveEquals(term180545, term180892));
        assertTrue(recursiveEquals(term180637, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


