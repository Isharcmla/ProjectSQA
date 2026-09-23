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

public class TypeValidator_expectObject_545251545238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68004;
     Object term68114;
     Object term68128;
     Object term68129;

    public TypeValidator_expectObject_545251545238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68004 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term68114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term68128 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term68128, term68128.getClass(), "compiler", null);
        setField(term68128, term68128.getClass(), "typeRegistry", null);
        setField(term68128, term68128.getClass(), "allValueTypes", null);
        setBooleanField(term68128, term68128.getClass(), "shouldReport", false);
        setField(term68128, term68128.getClass(), "nullOrUndefined", null);
        setField(term68128, term68128.getClass(), "mismatches", null);
        term68129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term68129, term68129.getClass(), "call", null);
        setField(term68129, term68129.getClass(), "prototypeSlot", null);
        setField(term68129, term68129.getClass(), "kind", null);
        setField(term68129, term68129.getClass(), "propAccess", null);
        setField(term68129, term68129.getClass(), "typeOfThis", null);
        setField(term68129, term68129.getClass(), "source", null);
        setField(term68129, term68129.getClass(), "implementedInterfaces", null);
        setField(term68129, term68129.getClass(), "extendedInterfaces", null);
        setField(term68129, term68129.getClass(), "subTypes", null);
        setField(term68129, term68129.getClass(), "className", null);
        setField(term68129, term68129.getClass(), "properties", null);
        setBooleanField(term68129, term68129.getClass(), "nativeType", false);
        setField(term68129, term68129.getClass(), "implicitPrototypeFallback", null);
        setField(term68129, term68129.getClass(), "ownerFunction", null);
        setBooleanField(term68129, term68129.getClass(), "prettyPrint", false);
        setBooleanField(term68129, term68129.getClass(), "visited", false);
        setField(term68129, term68129.getClass(), "docInfo", null);
        setBooleanField(term68129, term68129.getClass(), "unknown", false);
        setBooleanField(term68129, term68129.getClass(), "resolved", false);
        setField(term68129, term68129.getClass(), "resolveResult", null);
        setField(term68129, term68129.getClass(), "templateKeys", null);
        setField(term68129, term68129.getClass(), "templatizedTypes", null);
        setBooleanField(term68129, term68129.getClass(), "inTemplatedCheckVisit", false);
        setField(term68129, term68129.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term68114;
        args[3] = null;
        Object retValue = callMethod(klass, "expectObject", argTypes, term68004, args);
        assertTrue(recursiveEquals(term68004, term68128));
        assertTrue(recursiveEquals(term68114, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


