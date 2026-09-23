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

public class ReferenceCollectingCallback_shouldTraverse_422855684798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205472;
     Object term205564;
     Object term205656;
     Object term206304;
     Object term206305;
     Object term206306;

    public ReferenceCollectingCallback_shouldTraverse_422855684798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205472 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term205564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term205656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term205656, term205656.getClass(), "type", 4);
        term206304 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term206304, term206304.getClass(), "referenceMap", null);
        setField(term206304, term206304.getClass(), "blockStack", null);
        setField(term206304, term206304.getClass(), "behavior", null);
        setField(term206304, term206304.getClass(), "compiler", null);
        setField(term206304, term206304.getClass(), "varFilter", null);
        term206305 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term206305, term206305.getClass(), "number", 0.0);
        setIntField(term206305, term206305.getClass(), "type", 4);
        setField(term206305, term206305.getClass(), "next", null);
        setField(term206305, term206305.getClass(), "first", null);
        setField(term206305, term206305.getClass(), "last", null);
        setField(term206305, term206305.getClass(), "propListHead", null);
        setIntField(term206305, term206305.getClass(), "sourcePosition", 0);
        setField(term206305, term206305.getClass(), "jsType", null);
        setField(term206305, term206305.getClass(), "parent", null);
        term206306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term206306, term206306.getClass(), "number", 0.0);
        setIntField(term206306, term206306.getClass(), "type", 0);
        setField(term206306, term206306.getClass(), "next", null);
        setField(term206306, term206306.getClass(), "first", null);
        setField(term206306, term206306.getClass(), "last", null);
        setField(term206306, term206306.getClass(), "propListHead", null);
        setIntField(term206306, term206306.getClass(), "sourcePosition", 0);
        setField(term206306, term206306.getClass(), "jsType", null);
        setField(term206306, term206306.getClass(), "parent", null);
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
        args[1] = term205564;
        args[2] = term205656;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term205472, args);
        assertTrue(recursiveEquals(term205472, term206304));
        assertTrue(recursiveEquals(term205564, term206306));
        assertTrue(recursiveEquals(term205656, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


