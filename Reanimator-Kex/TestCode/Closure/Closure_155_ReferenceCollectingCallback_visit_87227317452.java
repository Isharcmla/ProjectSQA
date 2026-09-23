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

public class ReferenceCollectingCallback_visit_87227317452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7222;
     Object term7314;
     Object term7406;
     Object term7949;
     Object term7950;
     Object term7951;

    public ReferenceCollectingCallback_visit_87227317452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7222 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term7314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term7314, term7314.getClass(), "type", -39);
        term7406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term7949 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term7949, term7949.getClass(), "referenceMap", null);
        setField(term7949, term7949.getClass(), "blockStack", null);
        setField(term7949, term7949.getClass(), "behavior", null);
        setField(term7949, term7949.getClass(), "compiler", null);
        setField(term7949, term7949.getClass(), "varFilter", null);
        term7950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term7950, term7950.getClass(), "str", null);
        setIntField(term7950, term7950.getClass(), "type", -39);
        setField(term7950, term7950.getClass(), "next", null);
        setField(term7950, term7950.getClass(), "first", null);
        setField(term7950, term7950.getClass(), "last", null);
        setField(term7950, term7950.getClass(), "propListHead", null);
        setIntField(term7950, term7950.getClass(), "sourcePosition", 0);
        setField(term7950, term7950.getClass(), "jsType", null);
        setField(term7950, term7950.getClass(), "parent", null);
        term7951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term7951, term7951.getClass(), "str", null);
        setIntField(term7951, term7951.getClass(), "type", 0);
        setField(term7951, term7951.getClass(), "next", null);
        setField(term7951, term7951.getClass(), "first", null);
        setField(term7951, term7951.getClass(), "last", null);
        setField(term7951, term7951.getClass(), "propListHead", null);
        setIntField(term7951, term7951.getClass(), "sourcePosition", 0);
        setField(term7951, term7951.getClass(), "jsType", null);
        setField(term7951, term7951.getClass(), "parent", null);
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
        args[1] = term7314;
        args[2] = term7406;
        callMethod(klass, "visit", argTypes, term7222, args);
        assertTrue(recursiveEquals(term7222, term7949));
        assertTrue(recursiveEquals(term7314, term7951));
        assertTrue(recursiveEquals(term7406, null));
    }

};


