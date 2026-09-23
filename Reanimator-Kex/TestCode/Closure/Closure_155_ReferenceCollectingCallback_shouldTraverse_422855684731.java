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

public class ReferenceCollectingCallback_shouldTraverse_422855684731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192245;
     Object term192337;
     Object term192609;
     Object term192610;

    public ReferenceCollectingCallback_shouldTraverse_422855684731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192245 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term192337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term192337, term192337.getClass(), "type", 98);
        term192609 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term192609, term192609.getClass(), "referenceMap", null);
        setField(term192609, term192609.getClass(), "blockStack", null);
        setField(term192609, term192609.getClass(), "behavior", null);
        setField(term192609, term192609.getClass(), "compiler", null);
        setField(term192609, term192609.getClass(), "varFilter", null);
        term192610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term192610, term192610.getClass(), "str", null);
        setIntField(term192610, term192610.getClass(), "type", 98);
        setField(term192610, term192610.getClass(), "next", null);
        setField(term192610, term192610.getClass(), "first", null);
        setField(term192610, term192610.getClass(), "last", null);
        setField(term192610, term192610.getClass(), "propListHead", null);
        setIntField(term192610, term192610.getClass(), "sourcePosition", 0);
        setField(term192610, term192610.getClass(), "jsType", null);
        setField(term192610, term192610.getClass(), "parent", null);
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
        args[2] = term192337;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term192245, args);
        assertTrue(recursiveEquals(term192245, term192609));
        assertTrue(recursiveEquals(term192337, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


