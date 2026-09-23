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

public class TypeValidator_expectInterfaceProperty_431093090286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97767;
     Object term97871;
     Object term98564;
     Object term98565;

    public TypeValidator_expectInterfaceProperty_431093090286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97767 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term97871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term98564 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term98564, term98564.getClass(), "compiler", null);
        setField(term98564, term98564.getClass(), "typeRegistry", null);
        setField(term98564, term98564.getClass(), "allValueTypes", null);
        setBooleanField(term98564, term98564.getClass(), "shouldReport", false);
        setField(term98564, term98564.getClass(), "nullOrUndefined", null);
        setField(term98564, term98564.getClass(), "mismatches", null);
        term98565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term98565, term98565.getClass(), "call", null);
        setField(term98565, term98565.getClass(), "prototype", null);
        setField(term98565, term98565.getClass(), "kind", null);
        setField(term98565, term98565.getClass(), "typeOfThis", null);
        setField(term98565, term98565.getClass(), "source", null);
        setField(term98565, term98565.getClass(), "implementedInterfaces", null);
        setField(term98565, term98565.getClass(), "subTypes", null);
        setField(term98565, term98565.getClass(), "templateTypeName", null);
        setField(term98565, term98565.getClass(), "className", null);
        setField(term98565, term98565.getClass(), "properties", null);
        setBooleanField(term98565, term98565.getClass(), "nativeType", false);
        setField(term98565, term98565.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term98565, term98565.getClass(), "prettyPrint", false);
        setBooleanField(term98565, term98565.getClass(), "visited", false);
        setField(term98565, term98565.getClass(), "docInfo", null);
        setBooleanField(term98565, term98565.getClass(), "unknown", false);
        setBooleanField(term98565, term98565.getClass(), "resolved", false);
        setField(term98565, term98565.getClass(), "resolveResult", null);
        setField(term98565, term98565.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term97871;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "expectInterfaceProperty", argTypes, term97767, args);
        assertTrue(recursiveEquals(term97767, term98564));
        assertTrue(recursiveEquals(term97871, null));
    }

};


