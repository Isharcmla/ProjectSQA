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

public class FunctionType_addRelatedInterfaces_784954428127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66603;
     Object term66703;
     Object term66727;
     Object term66728;

    public FunctionType_addRelatedInterfaces_784954428127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term66703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term66727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66727, term66727.getClass(), "call", null);
        setField(term66727, term66727.getClass(), "prototype", null);
        setField(term66727, term66727.getClass(), "kind", null);
        setField(term66727, term66727.getClass(), "typeOfThis", null);
        setField(term66727, term66727.getClass(), "source", null);
        setField(term66727, term66727.getClass(), "implementedInterfaces", null);
        setField(term66727, term66727.getClass(), "subTypes", null);
        setField(term66727, term66727.getClass(), "templateTypeName", null);
        setField(term66727, term66727.getClass(), "className", null);
        setField(term66727, term66727.getClass(), "properties", null);
        setBooleanField(term66727, term66727.getClass(), "nativeType", false);
        setField(term66727, term66727.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term66727, term66727.getClass(), "prettyPrint", false);
        setBooleanField(term66727, term66727.getClass(), "visited", false);
        setField(term66727, term66727.getClass(), "docInfo", null);
        setBooleanField(term66727, term66727.getClass(), "unknown", false);
        setBooleanField(term66727, term66727.getClass(), "resolved", false);
        setField(term66727, term66727.getClass(), "resolveResult", null);
        setField(term66727, term66727.getClass(), "registry", null);
        term66728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66728, term66728.getClass(), "call", null);
        setField(term66728, term66728.getClass(), "prototype", null);
        setField(term66728, term66728.getClass(), "kind", null);
        setField(term66728, term66728.getClass(), "typeOfThis", null);
        setField(term66728, term66728.getClass(), "source", null);
        setField(term66728, term66728.getClass(), "implementedInterfaces", null);
        setField(term66728, term66728.getClass(), "subTypes", null);
        setField(term66728, term66728.getClass(), "templateTypeName", null);
        setField(term66728, term66728.getClass(), "className", null);
        setField(term66728, term66728.getClass(), "properties", null);
        setBooleanField(term66728, term66728.getClass(), "nativeType", false);
        setField(term66728, term66728.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term66728, term66728.getClass(), "prettyPrint", false);
        setBooleanField(term66728, term66728.getClass(), "visited", false);
        setField(term66728, term66728.getClass(), "docInfo", null);
        setBooleanField(term66728, term66728.getClass(), "unknown", false);
        setBooleanField(term66728, term66728.getClass(), "resolved", false);
        setField(term66728, term66728.getClass(), "resolveResult", null);
        setField(term66728, term66728.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term66703;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term66603, args);
        assertTrue(recursiveEquals(term66603, term66727));
        assertTrue(recursiveEquals(term66703, term66728));
    }

};


