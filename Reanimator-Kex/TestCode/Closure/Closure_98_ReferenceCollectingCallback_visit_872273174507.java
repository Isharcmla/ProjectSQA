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

public class ReferenceCollectingCallback_visit_872273174507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138321;
     Object term138413;
     Object term139017;
     Object term139018;

    public ReferenceCollectingCallback_visit_872273174507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138321 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term138413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term138413, term138413.getClass(), "type", -39);
        term139017 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term139017, term139017.getClass(), "referenceMap", null);
        setField(term139017, term139017.getClass(), "blockStack", null);
        setField(term139017, term139017.getClass(), "behavior", null);
        setField(term139017, term139017.getClass(), "compiler", null);
        setField(term139017, term139017.getClass(), "varFilter", null);
        term139018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139018, term139018.getClass(), "number", 0.0);
        setIntField(term139018, term139018.getClass(), "type", -39);
        setField(term139018, term139018.getClass(), "next", null);
        setField(term139018, term139018.getClass(), "first", null);
        setField(term139018, term139018.getClass(), "last", null);
        setField(term139018, term139018.getClass(), "propListHead", null);
        setIntField(term139018, term139018.getClass(), "sourcePosition", 0);
        setField(term139018, term139018.getClass(), "jsType", null);
        setField(term139018, term139018.getClass(), "parent", null);
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
        args[1] = term138413;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term138321, args);
        assertTrue(recursiveEquals(term138321, term139017));
        assertTrue(recursiveEquals(term138413, null));
    }

};


