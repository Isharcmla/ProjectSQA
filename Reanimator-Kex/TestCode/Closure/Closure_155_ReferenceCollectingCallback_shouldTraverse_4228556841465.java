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

public class ReferenceCollectingCallback_shouldTraverse_4228556841465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431990;
     Object term432082;
     Object term432174;
     Object term432844;
     Object term432845;
     Object term432846;

    public ReferenceCollectingCallback_shouldTraverse_4228556841465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431990 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term432082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term432174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term432174, term432174.getClass(), "type", 4);
        term432844 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term432844, term432844.getClass(), "referenceMap", null);
        setField(term432844, term432844.getClass(), "blockStack", null);
        setField(term432844, term432844.getClass(), "behavior", null);
        setField(term432844, term432844.getClass(), "compiler", null);
        setField(term432844, term432844.getClass(), "varFilter", null);
        term432845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term432845, term432845.getClass(), "number", 0.0);
        setIntField(term432845, term432845.getClass(), "type", 4);
        setField(term432845, term432845.getClass(), "next", null);
        setField(term432845, term432845.getClass(), "first", null);
        setField(term432845, term432845.getClass(), "last", null);
        setField(term432845, term432845.getClass(), "propListHead", null);
        setIntField(term432845, term432845.getClass(), "sourcePosition", 0);
        setField(term432845, term432845.getClass(), "jsType", null);
        setField(term432845, term432845.getClass(), "parent", null);
        term432846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term432846, term432846.getClass(), "number", 0.0);
        setIntField(term432846, term432846.getClass(), "type", 0);
        setField(term432846, term432846.getClass(), "next", null);
        setField(term432846, term432846.getClass(), "first", null);
        setField(term432846, term432846.getClass(), "last", null);
        setField(term432846, term432846.getClass(), "propListHead", null);
        setIntField(term432846, term432846.getClass(), "sourcePosition", 0);
        setField(term432846, term432846.getClass(), "jsType", null);
        setField(term432846, term432846.getClass(), "parent", null);
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
        args[1] = term432082;
        args[2] = term432174;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term431990, args);
        assertTrue(recursiveEquals(term431990, term432844));
        assertTrue(recursiveEquals(term432082, term432846));
        assertTrue(recursiveEquals(term432174, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


