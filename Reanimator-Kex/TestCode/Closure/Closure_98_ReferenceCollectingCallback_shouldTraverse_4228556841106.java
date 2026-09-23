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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_4228556841106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314592;
     Object term314738;
     Object term314830;
     Object term315992;
     Object term315996;
     Object term315997;

    public ReferenceCollectingCallback_shouldTraverse_4228556841106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term314646 = new ArrayDeque();
        term314592 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term314592, term314592.getClass(), "blockStack", term314646);
        term314738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term314738, term314738.getClass(), "type", 111);
        term314830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term314830, term314830.getClass(), "type", 111);
        ArrayDeque term315993 = new ArrayDeque();
        term315992 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term315992, term315992.getClass(), "referenceMap", null);
        setField(term315992, term315992.getClass(), "blockStack", term315993);
        setField(term315992, term315992.getClass(), "behavior", null);
        setField(term315992, term315992.getClass(), "compiler", null);
        setField(term315992, term315992.getClass(), "varFilter", null);
        term315996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term315996, term315996.getClass(), "number", 0.0);
        setIntField(term315996, term315996.getClass(), "type", 111);
        setField(term315996, term315996.getClass(), "next", null);
        setField(term315996, term315996.getClass(), "first", null);
        setField(term315996, term315996.getClass(), "last", null);
        setField(term315996, term315996.getClass(), "propListHead", null);
        setIntField(term315996, term315996.getClass(), "sourcePosition", 0);
        setField(term315996, term315996.getClass(), "jsType", null);
        setField(term315996, term315996.getClass(), "parent", null);
        term315997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term315997, term315997.getClass(), "number", 0.0);
        setIntField(term315997, term315997.getClass(), "type", 111);
        setField(term315997, term315997.getClass(), "next", null);
        setField(term315997, term315997.getClass(), "first", null);
        setField(term315997, term315997.getClass(), "last", null);
        setField(term315997, term315997.getClass(), "propListHead", null);
        setIntField(term315997, term315997.getClass(), "sourcePosition", 0);
        setField(term315997, term315997.getClass(), "jsType", null);
        setField(term315997, term315997.getClass(), "parent", null);
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
        args[1] = term314738;
        args[2] = term314830;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term314592, args);
        assertTrue(recursiveEquals(term314592, term315992));
        assertTrue(recursiveEquals(term314738, term315997));
        assertTrue(recursiveEquals(term314830, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


