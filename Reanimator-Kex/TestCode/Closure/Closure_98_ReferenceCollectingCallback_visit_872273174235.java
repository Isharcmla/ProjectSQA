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

public class ReferenceCollectingCallback_visit_872273174235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59620;
     Object term59712;
     Object term59804;
     Object term60162;
     Object term60163;
     Object term60164;

    public ReferenceCollectingCallback_visit_872273174235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59620 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term59712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59712, term59712.getClass(), "type", -39);
        term59804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term60162 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term60162, term60162.getClass(), "referenceMap", null);
        setField(term60162, term60162.getClass(), "blockStack", null);
        setField(term60162, term60162.getClass(), "behavior", null);
        setField(term60162, term60162.getClass(), "compiler", null);
        setField(term60162, term60162.getClass(), "varFilter", null);
        term60163 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60163, term60163.getClass(), "number", 0.0);
        setIntField(term60163, term60163.getClass(), "type", -39);
        setField(term60163, term60163.getClass(), "next", null);
        setField(term60163, term60163.getClass(), "first", null);
        setField(term60163, term60163.getClass(), "last", null);
        setField(term60163, term60163.getClass(), "propListHead", null);
        setIntField(term60163, term60163.getClass(), "sourcePosition", 0);
        setField(term60163, term60163.getClass(), "jsType", null);
        setField(term60163, term60163.getClass(), "parent", null);
        term60164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60164, term60164.getClass(), "number", 0.0);
        setIntField(term60164, term60164.getClass(), "type", 0);
        setField(term60164, term60164.getClass(), "next", null);
        setField(term60164, term60164.getClass(), "first", null);
        setField(term60164, term60164.getClass(), "last", null);
        setField(term60164, term60164.getClass(), "propListHead", null);
        setIntField(term60164, term60164.getClass(), "sourcePosition", 0);
        setField(term60164, term60164.getClass(), "jsType", null);
        setField(term60164, term60164.getClass(), "parent", null);
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
        args[1] = term59712;
        args[2] = term59804;
        callMethod(klass, "visit", argTypes, term59620, args);
        assertTrue(recursiveEquals(term59620, term60162));
        assertTrue(recursiveEquals(term59712, term60164));
        assertTrue(recursiveEquals(term59804, null));
    }

};


