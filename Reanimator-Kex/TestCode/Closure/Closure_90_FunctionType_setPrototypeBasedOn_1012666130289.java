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

public class FunctionType_setPrototypeBasedOn_1012666130289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180310;
     Object term180367;

    public FunctionType_setPrototypeBasedOn_1012666130289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term180310, term180310.getClass(), "prototype", null);
        setField(term180310, term180310.getClass(), "registry", null);
        setBooleanField(term180310, term180310.getClass(), "nativeType", true);
        term180367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term180368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term180369 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term180367, term180367.getClass(), "call", null);
        setField(term180368, term180368.getClass(), "ownerFunction", term180367);
        setField(term180368, term180368.getClass(), "className", null);
        setField(term180369, term180369.getClass(), "comparator", null);
        setField(term180369, term180369.getClass(), "root", null);
        setIntField(term180369, term180369.getClass(), "size", 0);
        setIntField(term180369, term180369.getClass(), "modCount", 0);
        setField(term180369, term180369.getClass(), "entrySet", null);
        setField(term180369, term180369.getClass(), "navigableKeySet", null);
        setField(term180369, term180369.getClass(), "descendingMap", null);
        setField(term180369, term180369.getClass(), "keySet", null);
        setField(term180369, term180369.getClass(), "values", null);
        setField(term180368, term180368.getClass(), "properties", term180369);
        setBooleanField(term180368, term180368.getClass(), "nativeType", true);
        setField(term180368, term180368.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term180368, term180368.getClass(), "prettyPrint", false);
        setBooleanField(term180368, term180368.getClass(), "visited", false);
        setField(term180368, term180368.getClass(), "docInfo", null);
        setBooleanField(term180368, term180368.getClass(), "unknown", true);
        setBooleanField(term180368, term180368.getClass(), "resolved", false);
        setField(term180368, term180368.getClass(), "resolveResult", null);
        setField(term180368, term180368.getClass(), "registry", null);
        setField(term180367, term180367.getClass(), "prototype", term180368);
        setField(term180367, term180367.getClass(), "kind", null);
        setField(term180367, term180367.getClass(), "typeOfThis", null);
        setField(term180367, term180367.getClass(), "source", null);
        setField(term180367, term180367.getClass(), "implementedInterfaces", null);
        setField(term180367, term180367.getClass(), "subTypes", null);
        setField(term180367, term180367.getClass(), "templateTypeName", null);
        setField(term180367, term180367.getClass(), "className", null);
        setField(term180367, term180367.getClass(), "properties", null);
        setBooleanField(term180367, term180367.getClass(), "nativeType", true);
        setField(term180367, term180367.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term180367, term180367.getClass(), "prettyPrint", false);
        setBooleanField(term180367, term180367.getClass(), "visited", false);
        setField(term180367, term180367.getClass(), "docInfo", null);
        setBooleanField(term180367, term180367.getClass(), "unknown", false);
        setBooleanField(term180367, term180367.getClass(), "resolved", false);
        setField(term180367, term180367.getClass(), "resolveResult", null);
        setField(term180367, term180367.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term180310, args);
        assertTrue(recursiveEquals(term180310, term180367));
    }

};


