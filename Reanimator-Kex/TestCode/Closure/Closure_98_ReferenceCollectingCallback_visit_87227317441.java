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

public class ReferenceCollectingCallback_visit_87227317441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7464;
     Object term7534;
     Object term8087;
     Object term8088;

    public ReferenceCollectingCallback_visit_87227317441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7464 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term7534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7534, term7534.getClass(), "type", -39);
        term8087 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term8087, term8087.getClass(), "referenceMap", null);
        setField(term8087, term8087.getClass(), "blockStack", null);
        setField(term8087, term8087.getClass(), "behavior", null);
        setField(term8087, term8087.getClass(), "compiler", null);
        setField(term8087, term8087.getClass(), "varFilter", null);
        term8088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8088, term8088.getClass(), "type", -39);
        setField(term8088, term8088.getClass(), "next", null);
        setField(term8088, term8088.getClass(), "first", null);
        setField(term8088, term8088.getClass(), "last", null);
        setField(term8088, term8088.getClass(), "propListHead", null);
        setIntField(term8088, term8088.getClass(), "sourcePosition", 0);
        setField(term8088, term8088.getClass(), "jsType", null);
        setField(term8088, term8088.getClass(), "parent", null);
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
        args[1] = term7534;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term7464, args);
        assertTrue(recursiveEquals(term7464, term8087));
        assertTrue(recursiveEquals(term7534, null));
    }

};


