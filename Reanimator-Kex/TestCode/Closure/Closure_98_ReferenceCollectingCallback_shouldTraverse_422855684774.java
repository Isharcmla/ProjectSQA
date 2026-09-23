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

public class ReferenceCollectingCallback_shouldTraverse_422855684774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206665;
     Object term206757;
     Object term206849;
     Object term207181;
     Object term207182;
     Object term207183;

    public ReferenceCollectingCallback_shouldTraverse_422855684774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206665 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term206757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term206849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term206849, term206849.getClass(), "type", 4);
        term207181 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term207181, term207181.getClass(), "referenceMap", null);
        setField(term207181, term207181.getClass(), "blockStack", null);
        setField(term207181, term207181.getClass(), "behavior", null);
        setField(term207181, term207181.getClass(), "compiler", null);
        setField(term207181, term207181.getClass(), "varFilter", null);
        term207182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term207182, term207182.getClass(), "number", 0.0);
        setIntField(term207182, term207182.getClass(), "type", 4);
        setField(term207182, term207182.getClass(), "next", null);
        setField(term207182, term207182.getClass(), "first", null);
        setField(term207182, term207182.getClass(), "last", null);
        setField(term207182, term207182.getClass(), "propListHead", null);
        setIntField(term207182, term207182.getClass(), "sourcePosition", 0);
        setField(term207182, term207182.getClass(), "jsType", null);
        setField(term207182, term207182.getClass(), "parent", null);
        term207183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term207183, term207183.getClass(), "number", 0.0);
        setIntField(term207183, term207183.getClass(), "type", 0);
        setField(term207183, term207183.getClass(), "next", null);
        setField(term207183, term207183.getClass(), "first", null);
        setField(term207183, term207183.getClass(), "last", null);
        setField(term207183, term207183.getClass(), "propListHead", null);
        setIntField(term207183, term207183.getClass(), "sourcePosition", 0);
        setField(term207183, term207183.getClass(), "jsType", null);
        setField(term207183, term207183.getClass(), "parent", null);
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
        args[1] = term206757;
        args[2] = term206849;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term206665, args);
        assertTrue(recursiveEquals(term206665, term207181));
        assertTrue(recursiveEquals(term206757, term207183));
        assertTrue(recursiveEquals(term206849, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


