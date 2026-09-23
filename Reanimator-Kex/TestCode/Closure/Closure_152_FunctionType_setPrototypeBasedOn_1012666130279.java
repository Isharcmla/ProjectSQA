package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158925;
     Object term159424;

    public FunctionType_setPrototypeBasedOn_1012666130279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term158925, term158925.getClass(), "prototype", null);
        setField(term158925, term158925.getClass(), "registry", null);
        setBooleanField(term158925, term158925.getClass(), "nativeType", true);
        term159424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term159425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term159426 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term159424, term159424.getClass(), "call", null);
        setField(term159425, term159425.getClass(), "ownerFunction", term159424);
        setField(term159425, term159425.getClass(), "className", null);
        setField(term159426, term159426.getClass(), "comparator", null);
        setField(term159426, term159426.getClass(), "root", null);
        setIntField(term159426, term159426.getClass(), "size", 0);
        setIntField(term159426, term159426.getClass(), "modCount", 0);
        setField(term159426, term159426.getClass(), "entrySet", null);
        setField(term159426, term159426.getClass(), "navigableKeySet", null);
        setField(term159426, term159426.getClass(), "descendingMap", null);
        setField(term159426, term159426.getClass(), "keySet", null);
        setField(term159426, term159426.getClass(), "values", null);
        setField(term159425, term159425.getClass(), "properties", term159426);
        setBooleanField(term159425, term159425.getClass(), "nativeType", true);
        setField(term159425, term159425.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term159425, term159425.getClass(), "prettyPrint", false);
        setBooleanField(term159425, term159425.getClass(), "visited", false);
        setField(term159425, term159425.getClass(), "docInfo", null);
        setBooleanField(term159425, term159425.getClass(), "unknown", true);
        setBooleanField(term159425, term159425.getClass(), "resolved", false);
        setField(term159425, term159425.getClass(), "resolveResult", null);
        setField(term159425, term159425.getClass(), "registry", null);
        setField(term159424, term159424.getClass(), "prototype", term159425);
        setField(term159424, term159424.getClass(), "kind", null);
        setField(term159424, term159424.getClass(), "typeOfThis", null);
        setField(term159424, term159424.getClass(), "source", null);
        setField(term159424, term159424.getClass(), "implementedInterfaces", null);
        setField(term159424, term159424.getClass(), "subTypes", null);
        setField(term159424, term159424.getClass(), "templateTypeName", null);
        setField(term159424, term159424.getClass(), "className", null);
        setField(term159424, term159424.getClass(), "properties", null);
        setBooleanField(term159424, term159424.getClass(), "nativeType", true);
        setField(term159424, term159424.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term159424, term159424.getClass(), "prettyPrint", false);
        setBooleanField(term159424, term159424.getClass(), "visited", false);
        setField(term159424, term159424.getClass(), "docInfo", null);
        setBooleanField(term159424, term159424.getClass(), "unknown", false);
        setBooleanField(term159424, term159424.getClass(), "resolved", false);
        setField(term159424, term159424.getClass(), "resolveResult", null);
        setField(term159424, term159424.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term158925, args);
        assertTrue(recursiveEquals(term158925, term159424));
    }

};


