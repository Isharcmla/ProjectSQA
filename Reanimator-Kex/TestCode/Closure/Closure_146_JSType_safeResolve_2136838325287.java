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
import java.util.HashMap;

public class JSType_safeResolve_2136838325287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54557;
     Object term54693;
     Object term54660;

    public JSType_safeResolve_2136838325287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54605 = new HashMap();
        term54557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term54557, term54557.getClass(), "resolved", false);
        setField(term54557, term54557.getClass(), "resolveResult", null);
        setField(term54557, term54557.getClass(), "implicitPrototype", null);
        setField(term54557, term54557.getClass(), "properties", term54605);
        HashMap term54694 = new HashMap();
        term54693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54693, term54693.getClass(), "leastSupertypeVisitor", null);
        setField(term54693, term54693.getClass(), "greatestSubtypeVisitor", null);
        setField(term54693, term54693.getClass(), "call", null);
        setField(term54693, term54693.getClass(), "prototype", null);
        setField(term54693, term54693.getClass(), "kind", null);
        setField(term54693, term54693.getClass(), "typeOfThis", null);
        setField(term54693, term54693.getClass(), "source", null);
        setField(term54693, term54693.getClass(), "implementedInterfaces", null);
        setField(term54693, term54693.getClass(), "subTypes", null);
        setField(term54693, term54693.getClass(), "templateTypeName", null);
        setField(term54693, term54693.getClass(), "className", null);
        setField(term54693, term54693.getClass(), "properties", term54694);
        setField(term54693, term54693.getClass(), "implicitPrototype", null);
        setBooleanField(term54693, term54693.getClass(), "nativeType", false);
        setBooleanField(term54693, term54693.getClass(), "prettyPrint", false);
        setBooleanField(term54693, term54693.getClass(), "visited", false);
        setField(term54693, term54693.getClass(), "docInfo", null);
        setBooleanField(term54693, term54693.getClass(), "unknown", false);
        setBooleanField(term54693, term54693.getClass(), "resolved", true);
        setField(term54693, term54693.getClass(), "resolveResult", term54693);
        setField(term54693, term54693.getClass(), "registry", null);
        HashMap term54661 = new HashMap();
        term54660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54660, term54660.getClass(), "leastSupertypeVisitor", null);
        setField(term54660, term54660.getClass(), "greatestSubtypeVisitor", null);
        setField(term54660, term54660.getClass(), "call", null);
        setField(term54660, term54660.getClass(), "prototype", null);
        setField(term54660, term54660.getClass(), "kind", null);
        setField(term54660, term54660.getClass(), "typeOfThis", null);
        setField(term54660, term54660.getClass(), "source", null);
        setField(term54660, term54660.getClass(), "implementedInterfaces", null);
        setField(term54660, term54660.getClass(), "subTypes", null);
        setField(term54660, term54660.getClass(), "templateTypeName", null);
        setField(term54660, term54660.getClass(), "className", null);
        setField(term54660, term54660.getClass(), "properties", term54661);
        setField(term54660, term54660.getClass(), "implicitPrototype", null);
        setBooleanField(term54660, term54660.getClass(), "nativeType", false);
        setBooleanField(term54660, term54660.getClass(), "prettyPrint", false);
        setBooleanField(term54660, term54660.getClass(), "visited", false);
        setField(term54660, term54660.getClass(), "docInfo", null);
        setBooleanField(term54660, term54660.getClass(), "unknown", false);
        setBooleanField(term54660, term54660.getClass(), "resolved", true);
        setField(term54660, term54660.getClass(), "resolveResult", term54660);
        setField(term54660, term54660.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term54557;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term54557, term54693));
        assertTrue(recursiveEquals(retValue, term54660));
    }

};


