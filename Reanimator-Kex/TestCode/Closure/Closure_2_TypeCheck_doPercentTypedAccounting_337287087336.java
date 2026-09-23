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

public class TypeCheck_doPercentTypedAccounting_337287087336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81642;
     Object term81712;
     Object term82142;
     Object term82143;

    public TypeCheck_doPercentTypedAccounting_337287087336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81642 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term81712, term81712.getClass(), "jsType", term81822);
        term82142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term82142, term82142.getClass(), "compiler", null);
        setField(term82142, term82142.getClass(), "validator", null);
        setField(term82142, term82142.getClass(), "reverseInterpreter", null);
        setField(term82142, term82142.getClass(), "typeRegistry", null);
        setField(term82142, term82142.getClass(), "topScope", null);
        setField(term82142, term82142.getClass(), "scopeCreator", null);
        setField(term82142, term82142.getClass(), "reportMissingOverride", null);
        setField(term82142, term82142.getClass(), "reportUnknownTypes", null);
        setBooleanField(term82142, term82142.getClass(), "reportMissingProperties", false);
        setField(term82142, term82142.getClass(), "inferJSDocInfo", null);
        setIntField(term82142, term82142.getClass(), "typedCount", 1);
        setIntField(term82142, term82142.getClass(), "nullCount", 0);
        setIntField(term82142, term82142.getClass(), "unknownCount", 0);
        setBooleanField(term82142, term82142.getClass(), "inExterns", false);
        setIntField(term82142, term82142.getClass(), "noTypeCheckSection", 0);
        term82143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term82143, term82143.getClass(), "type", 0);
        setField(term82143, term82143.getClass(), "next", null);
        setField(term82143, term82143.getClass(), "first", null);
        setField(term82143, term82143.getClass(), "last", null);
        setField(term82143, term82143.getClass(), "propListHead", null);
        setIntField(term82143, term82143.getClass(), "sourcePosition", 0);
        setField(term82144, term82144.getClass(), "call", null);
        setField(term82144, term82144.getClass(), "prototypeSlot", null);
        setField(term82144, term82144.getClass(), "kind", null);
        setField(term82144, term82144.getClass(), "propAccess", null);
        setField(term82144, term82144.getClass(), "typeOfThis", null);
        setField(term82144, term82144.getClass(), "source", null);
        setField(term82144, term82144.getClass(), "implementedInterfaces", null);
        setField(term82144, term82144.getClass(), "extendedInterfaces", null);
        setField(term82144, term82144.getClass(), "subTypes", null);
        setField(term82144, term82144.getClass(), "className", null);
        setField(term82144, term82144.getClass(), "properties", null);
        setBooleanField(term82144, term82144.getClass(), "nativeType", false);
        setField(term82144, term82144.getClass(), "implicitPrototypeFallback", null);
        setField(term82144, term82144.getClass(), "ownerFunction", null);
        setBooleanField(term82144, term82144.getClass(), "prettyPrint", false);
        setBooleanField(term82144, term82144.getClass(), "visited", false);
        setField(term82144, term82144.getClass(), "docInfo", null);
        setBooleanField(term82144, term82144.getClass(), "unknown", false);
        setBooleanField(term82144, term82144.getClass(), "resolved", false);
        setField(term82144, term82144.getClass(), "resolveResult", null);
        setField(term82144, term82144.getClass(), "templateKeys", null);
        setField(term82144, term82144.getClass(), "templatizedTypes", null);
        setBooleanField(term82144, term82144.getClass(), "inTemplatedCheckVisit", false);
        setField(term82144, term82144.getClass(), "registry", null);
        setField(term82143, term82143.getClass(), "jsType", term82144);
        setField(term82143, term82143.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81712;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term81642, args);
        assertTrue(recursiveEquals(term81642, term82142));
        assertTrue(recursiveEquals(term81712, null));
    }

};


