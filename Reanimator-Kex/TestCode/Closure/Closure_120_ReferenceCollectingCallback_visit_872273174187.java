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

public class ReferenceCollectingCallback_visit_872273174187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34586;
     Object term34678;
     Object term34713;
     Object term34714;

    public ReferenceCollectingCallback_visit_872273174187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34586 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term34678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term34713 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term34713, term34713.getClass(), "referenceMap", null);
        setField(term34713, term34713.getClass(), "blockStack", null);
        setField(term34713, term34713.getClass(), "behavior", null);
        setField(term34713, term34713.getClass(), "compiler", null);
        setField(term34713, term34713.getClass(), "varFilter", null);
        term34714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34714, term34714.getClass(), "str", null);
        setIntField(term34714, term34714.getClass(), "type", 0);
        setField(term34714, term34714.getClass(), "next", null);
        setField(term34714, term34714.getClass(), "first", null);
        setField(term34714, term34714.getClass(), "last", null);
        setField(term34714, term34714.getClass(), "propListHead", null);
        setIntField(term34714, term34714.getClass(), "sourcePosition", 0);
        setField(term34714, term34714.getClass(), "jsType", null);
        setField(term34714, term34714.getClass(), "parent", null);
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
        args[1] = term34678;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term34586, args);
        assertTrue(recursiveEquals(term34586, term34713));
        assertTrue(recursiveEquals(term34678, null));
    }

};


