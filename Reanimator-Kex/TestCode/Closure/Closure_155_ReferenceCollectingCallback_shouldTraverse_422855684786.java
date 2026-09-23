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

public class ReferenceCollectingCallback_shouldTraverse_422855684786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203011;
     Object term203103;
     Object term203336;
     Object term203337;

    public ReferenceCollectingCallback_shouldTraverse_422855684786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203011 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term203103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term203103, term203103.getClass(), "type", 108);
        term203336 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term203336, term203336.getClass(), "referenceMap", null);
        setField(term203336, term203336.getClass(), "blockStack", null);
        setField(term203336, term203336.getClass(), "behavior", null);
        setField(term203336, term203336.getClass(), "compiler", null);
        setField(term203336, term203336.getClass(), "varFilter", null);
        term203337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term203337, term203337.getClass(), "str", null);
        setIntField(term203337, term203337.getClass(), "type", 108);
        setField(term203337, term203337.getClass(), "next", null);
        setField(term203337, term203337.getClass(), "first", null);
        setField(term203337, term203337.getClass(), "last", null);
        setField(term203337, term203337.getClass(), "propListHead", null);
        setIntField(term203337, term203337.getClass(), "sourcePosition", 0);
        setField(term203337, term203337.getClass(), "jsType", null);
        setField(term203337, term203337.getClass(), "parent", null);
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
        args[2] = term203103;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term203011, args);
        assertTrue(recursiveEquals(term203011, term203336));
        assertTrue(recursiveEquals(term203103, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


