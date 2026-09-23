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

public class ReferenceCollectingCallback_visit_872273174172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30573;
     Object term30748;
     Object term30713;
     Object term31109;
     Object term31110;
     Object term31111;

    public ReferenceCollectingCallback_visit_872273174172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30573 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term30748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30748, term30748.getClass(), "type", 108);
        term30713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30713, term30713.getClass(), "type", 108);
        setField(term30713, term30713.getClass(), "first", term30748);
        term31109 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term31109, term31109.getClass(), "referenceMap", null);
        setField(term31109, term31109.getClass(), "blockStack", null);
        setField(term31109, term31109.getClass(), "behavior", null);
        setField(term31109, term31109.getClass(), "compiler", null);
        setField(term31109, term31109.getClass(), "varFilter", null);
        term31110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31110, term31110.getClass(), "type", 108);
        setField(term31110, term31110.getClass(), "next", null);
        setField(term31110, term31110.getClass(), "first", null);
        setField(term31110, term31110.getClass(), "last", null);
        setField(term31110, term31110.getClass(), "propListHead", null);
        setIntField(term31110, term31110.getClass(), "sourcePosition", 0);
        setField(term31110, term31110.getClass(), "jsType", null);
        setField(term31110, term31110.getClass(), "parent", null);
        term31111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31111, term31111.getClass(), "type", 108);
        setField(term31111, term31111.getClass(), "next", null);
        setIntField(term31112, term31112.getClass(), "type", 108);
        setField(term31112, term31112.getClass(), "next", null);
        setField(term31112, term31112.getClass(), "first", null);
        setField(term31112, term31112.getClass(), "last", null);
        setField(term31112, term31112.getClass(), "propListHead", null);
        setIntField(term31112, term31112.getClass(), "sourcePosition", 0);
        setField(term31112, term31112.getClass(), "jsType", null);
        setField(term31112, term31112.getClass(), "parent", null);
        setField(term31111, term31111.getClass(), "first", term31112);
        setField(term31111, term31111.getClass(), "last", null);
        setField(term31111, term31111.getClass(), "propListHead", null);
        setIntField(term31111, term31111.getClass(), "sourcePosition", 0);
        setField(term31111, term31111.getClass(), "jsType", null);
        setField(term31111, term31111.getClass(), "parent", null);
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
        args[1] = term30748;
        args[2] = term30713;
        callMethod(klass, "visit", argTypes, term30573, args);
        assertTrue(recursiveEquals(term30573, term31109));
        assertTrue(recursiveEquals(term30748, term31111));
        assertTrue(recursiveEquals(term30713, null));
    }

};


