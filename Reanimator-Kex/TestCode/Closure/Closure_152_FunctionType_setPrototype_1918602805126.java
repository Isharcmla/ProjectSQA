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

public class FunctionType_setPrototype_1918602805126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66494;
     Object term66712;

    public FunctionType_setPrototype_1918602805126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term66712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66712, term66712.getClass(), "call", null);
        setField(term66712, term66712.getClass(), "prototype", null);
        setField(term66712, term66712.getClass(), "kind", null);
        setField(term66712, term66712.getClass(), "typeOfThis", null);
        setField(term66712, term66712.getClass(), "source", null);
        setField(term66712, term66712.getClass(), "implementedInterfaces", null);
        setField(term66712, term66712.getClass(), "subTypes", null);
        setField(term66712, term66712.getClass(), "templateTypeName", null);
        setField(term66712, term66712.getClass(), "className", null);
        setField(term66712, term66712.getClass(), "properties", null);
        setBooleanField(term66712, term66712.getClass(), "nativeType", false);
        setField(term66712, term66712.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term66712, term66712.getClass(), "prettyPrint", false);
        setBooleanField(term66712, term66712.getClass(), "visited", false);
        setField(term66712, term66712.getClass(), "docInfo", null);
        setBooleanField(term66712, term66712.getClass(), "unknown", false);
        setBooleanField(term66712, term66712.getClass(), "resolved", false);
        setField(term66712, term66712.getClass(), "resolveResult", null);
        setField(term66712, term66712.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term66494, args);
        assertTrue(recursiveEquals(term66494, term66712));
        assertTrue(recursiveEquals(retValue, false));
    }

};


