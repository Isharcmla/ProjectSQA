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

public class ReferenceCollectingCallback_shouldTraverse_4228556841073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274988;
     Object term275080;
     Object term276373;
     Object term276374;

    public ReferenceCollectingCallback_shouldTraverse_4228556841073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274988 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term275080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term275080, term275080.getClass(), "type", 100);
        term276373 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term276373, term276373.getClass(), "referenceMap", null);
        setField(term276373, term276373.getClass(), "blockStack", null);
        setField(term276373, term276373.getClass(), "behavior", null);
        setField(term276373, term276373.getClass(), "compiler", null);
        setField(term276373, term276373.getClass(), "varFilter", null);
        term276374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term276374, term276374.getClass(), "str", null);
        setIntField(term276374, term276374.getClass(), "type", 100);
        setField(term276374, term276374.getClass(), "next", null);
        setField(term276374, term276374.getClass(), "first", null);
        setField(term276374, term276374.getClass(), "last", null);
        setField(term276374, term276374.getClass(), "propListHead", null);
        setIntField(term276374, term276374.getClass(), "sourcePosition", 0);
        setField(term276374, term276374.getClass(), "jsType", null);
        setField(term276374, term276374.getClass(), "parent", null);
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
        args[2] = term275080;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term274988, args);
        assertTrue(recursiveEquals(term274988, term276373));
        assertTrue(recursiveEquals(term275080, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


