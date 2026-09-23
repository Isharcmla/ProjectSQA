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

public class ReferenceCollectingCallback_shouldTraverse_422855684742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194184;
     Object term194276;
     Object term194474;
     Object term194475;

    public ReferenceCollectingCallback_shouldTraverse_422855684742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194184 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term194276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term194276, term194276.getClass(), "type", 101);
        term194474 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term194474, term194474.getClass(), "referenceMap", null);
        setField(term194474, term194474.getClass(), "blockStack", null);
        setField(term194474, term194474.getClass(), "behavior", null);
        setField(term194474, term194474.getClass(), "compiler", null);
        setField(term194474, term194474.getClass(), "varFilter", null);
        term194475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term194475, term194475.getClass(), "str", null);
        setIntField(term194475, term194475.getClass(), "type", 101);
        setField(term194475, term194475.getClass(), "next", null);
        setField(term194475, term194475.getClass(), "first", null);
        setField(term194475, term194475.getClass(), "last", null);
        setField(term194475, term194475.getClass(), "propListHead", null);
        setIntField(term194475, term194475.getClass(), "sourcePosition", 0);
        setField(term194475, term194475.getClass(), "jsType", null);
        setField(term194475, term194475.getClass(), "parent", null);
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
        args[2] = term194276;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term194184, args);
        assertTrue(recursiveEquals(term194184, term194474));
        assertTrue(recursiveEquals(term194276, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


