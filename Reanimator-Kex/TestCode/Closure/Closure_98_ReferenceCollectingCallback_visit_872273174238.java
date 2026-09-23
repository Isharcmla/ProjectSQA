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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60572;
     Object term60802;
     Object term60756;
     Object term60820;
     Object term60821;
     Object term60822;

    public ReferenceCollectingCallback_visit_872273174238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60572 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term60802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term60802, term60802.getClass(), "type", 108);
        term60756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term60756, term60756.getClass(), "type", 108);
        setField(term60756, term60756.getClass(), "first", term60802);
        term60820 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term60820, term60820.getClass(), "referenceMap", null);
        setField(term60820, term60820.getClass(), "blockStack", null);
        setField(term60820, term60820.getClass(), "behavior", null);
        setField(term60820, term60820.getClass(), "compiler", null);
        setField(term60820, term60820.getClass(), "varFilter", null);
        term60821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term60821, term60821.getClass(), "str", null);
        setIntField(term60821, term60821.getClass(), "type", 108);
        setField(term60821, term60821.getClass(), "next", null);
        setField(term60821, term60821.getClass(), "first", null);
        setField(term60821, term60821.getClass(), "last", null);
        setField(term60821, term60821.getClass(), "propListHead", null);
        setIntField(term60821, term60821.getClass(), "sourcePosition", 0);
        setField(term60821, term60821.getClass(), "jsType", null);
        setField(term60821, term60821.getClass(), "parent", null);
        term60822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term60822, term60822.getClass(), "str", null);
        setIntField(term60822, term60822.getClass(), "type", 108);
        setField(term60822, term60822.getClass(), "next", null);
        setField(term60823, term60823.getClass(), "str", null);
        setIntField(term60823, term60823.getClass(), "type", 108);
        setField(term60823, term60823.getClass(), "next", null);
        setField(term60823, term60823.getClass(), "first", null);
        setField(term60823, term60823.getClass(), "last", null);
        setField(term60823, term60823.getClass(), "propListHead", null);
        setIntField(term60823, term60823.getClass(), "sourcePosition", 0);
        setField(term60823, term60823.getClass(), "jsType", null);
        setField(term60823, term60823.getClass(), "parent", null);
        setField(term60822, term60822.getClass(), "first", term60823);
        setField(term60822, term60822.getClass(), "last", null);
        setField(term60822, term60822.getClass(), "propListHead", null);
        setIntField(term60822, term60822.getClass(), "sourcePosition", 0);
        setField(term60822, term60822.getClass(), "jsType", null);
        setField(term60822, term60822.getClass(), "parent", null);
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
        args[1] = term60802;
        args[2] = term60756;
        callMethod(klass, "visit", argTypes, term60572, args);
        assertTrue(recursiveEquals(term60572, term60820));
        assertTrue(recursiveEquals(term60802, term60822));
        assertTrue(recursiveEquals(term60756, null));
    }

};


