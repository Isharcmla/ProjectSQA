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

public class CheckAccessControls_hotSwapScript_739486180364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110713;
     Object term110783;
     Object term190508;
     Object term190509;

    public CheckAccessControls_hotSwapScript_739486180364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110713 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term110713, term110713.getClass(), "compiler", null);
        term110783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term110783, term110783.getClass(), "type", 30);
        setField(term110923, term110923.getClass(), "next", null);
        setIntField(term110923, term110923.getClass(), "type", 0);
        setField(term110923, term110923.getClass(), "first", null);
        setField(term110853, term110853.getClass(), "next", term110923);
        setIntField(term110853, term110853.getClass(), "type", 30);
        setField(term110853, term110853.getClass(), "first", null);
        setField(term111033, term111033.getClass(), "docInfo", null);
        setField(term111033, term111033.getClass(), "implicitPrototypeFallback", null);
        setField(term110853, term110853.getClass(), "jsType", term111033);
        setField(term110783, term110783.getClass(), "first", term110853);
        term190508 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term190508, term190508.getClass(), "compiler", null);
        setField(term190508, term190508.getClass(), "validator", null);
        setIntField(term190508, term190508.getClass(), "deprecatedDepth", 0);
        setIntField(term190508, term190508.getClass(), "methodDepth", 0);
        setField(term190508, term190508.getClass(), "currentClass", null);
        setField(term190508, term190508.getClass(), "initializedConstantProperties", null);
        term190509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term190509, term190509.getClass(), "type", 30);
        setField(term190509, term190509.getClass(), "next", null);
        setIntField(term190510, term190510.getClass(), "type", 30);
        setIntField(term190511, term190511.getClass(), "type", 0);
        setField(term190511, term190511.getClass(), "next", null);
        setField(term190511, term190511.getClass(), "first", null);
        setField(term190511, term190511.getClass(), "last", null);
        setField(term190511, term190511.getClass(), "propListHead", null);
        setIntField(term190511, term190511.getClass(), "sourcePosition", 0);
        setField(term190511, term190511.getClass(), "jsType", null);
        setField(term190511, term190511.getClass(), "parent", null);
        setField(term190510, term190510.getClass(), "next", term190511);
        setField(term190510, term190510.getClass(), "first", null);
        setField(term190510, term190510.getClass(), "last", null);
        setField(term190510, term190510.getClass(), "propListHead", null);
        setIntField(term190510, term190510.getClass(), "sourcePosition", 0);
        setField(term190512, term190512.getClass(), "call", null);
        setField(term190512, term190512.getClass(), "prototype", null);
        setField(term190512, term190512.getClass(), "kind", null);
        setField(term190512, term190512.getClass(), "typeOfThis", null);
        setField(term190512, term190512.getClass(), "source", null);
        setField(term190512, term190512.getClass(), "implementedInterfaces", null);
        setField(term190512, term190512.getClass(), "subTypes", null);
        setField(term190512, term190512.getClass(), "templateTypeName", null);
        setField(term190512, term190512.getClass(), "className", null);
        setField(term190512, term190512.getClass(), "properties", null);
        setBooleanField(term190512, term190512.getClass(), "nativeType", false);
        setField(term190512, term190512.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term190512, term190512.getClass(), "prettyPrint", false);
        setBooleanField(term190512, term190512.getClass(), "visited", false);
        setField(term190512, term190512.getClass(), "docInfo", null);
        setBooleanField(term190512, term190512.getClass(), "unknown", false);
        setBooleanField(term190512, term190512.getClass(), "resolved", false);
        setField(term190512, term190512.getClass(), "resolveResult", null);
        setField(term190512, term190512.getClass(), "registry", null);
        setField(term190510, term190510.getClass(), "jsType", term190512);
        setField(term190510, term190510.getClass(), "parent", null);
        setField(term190509, term190509.getClass(), "first", term190510);
        setField(term190509, term190509.getClass(), "last", null);
        setField(term190509, term190509.getClass(), "propListHead", null);
        setIntField(term190509, term190509.getClass(), "sourcePosition", 0);
        setField(term190509, term190509.getClass(), "jsType", null);
        setField(term190509, term190509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110783;
        callMethod(klass, "hotSwapScript", argTypes, term110713, args);
        assertTrue(recursiveEquals(term110713, term190508));
        assertTrue(recursiveEquals(term110783, term190509));
    }

};


