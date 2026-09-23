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

public class ReferenceCollectingCallback_visit_872273174266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53360;
     Object term53452;
     Object term53734;
     Object term53735;

    public ReferenceCollectingCallback_visit_872273174266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53360 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term53452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term53452, term53452.getClass(), "type", -39);
        term53734 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term53734, term53734.getClass(), "referenceMap", null);
        setField(term53734, term53734.getClass(), "blockStack", null);
        setField(term53734, term53734.getClass(), "behavior", null);
        setField(term53734, term53734.getClass(), "compiler", null);
        setField(term53734, term53734.getClass(), "varFilter", null);
        term53735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term53735, term53735.getClass(), "number", 0.0);
        setIntField(term53735, term53735.getClass(), "type", -39);
        setField(term53735, term53735.getClass(), "next", null);
        setField(term53735, term53735.getClass(), "first", null);
        setField(term53735, term53735.getClass(), "last", null);
        setField(term53735, term53735.getClass(), "propListHead", null);
        setIntField(term53735, term53735.getClass(), "sourcePosition", 0);
        setField(term53735, term53735.getClass(), "jsType", null);
        setField(term53735, term53735.getClass(), "parent", null);
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
        args[1] = term53452;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term53360, args);
        assertTrue(recursiveEquals(term53360, term53734));
        assertTrue(recursiveEquals(term53452, null));
    }

};


