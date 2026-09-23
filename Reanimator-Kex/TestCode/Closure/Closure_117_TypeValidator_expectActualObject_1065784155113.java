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

public class TypeValidator_expectActualObject_1065784155113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42259;
     Object term42367;
     Object term43685;
     Object term43686;

    public TypeValidator_expectActualObject_1065784155113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term42367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term43685 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term43685, term43685.getClass(), "compiler", null);
        setField(term43685, term43685.getClass(), "typeRegistry", null);
        setField(term43685, term43685.getClass(), "allValueTypes", null);
        setBooleanField(term43685, term43685.getClass(), "shouldReport", false);
        setField(term43685, term43685.getClass(), "nullOrUndefined", null);
        setField(term43685, term43685.getClass(), "mismatches", null);
        term43686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term43686, term43686.getClass(), "this$0", null);
        setField(term43686, term43686.getClass(), "call", null);
        setField(term43686, term43686.getClass(), "prototypeSlot", null);
        setField(term43686, term43686.getClass(), "kind", null);
        setField(term43686, term43686.getClass(), "propAccess", null);
        setField(term43686, term43686.getClass(), "typeOfThis", null);
        setField(term43686, term43686.getClass(), "source", null);
        setField(term43686, term43686.getClass(), "implementedInterfaces", null);
        setField(term43686, term43686.getClass(), "extendedInterfaces", null);
        setField(term43686, term43686.getClass(), "subTypes", null);
        setField(term43686, term43686.getClass(), "className", null);
        setField(term43686, term43686.getClass(), "properties", null);
        setBooleanField(term43686, term43686.getClass(), "nativeType", false);
        setField(term43686, term43686.getClass(), "implicitPrototypeFallback", null);
        setField(term43686, term43686.getClass(), "ownerFunction", null);
        setBooleanField(term43686, term43686.getClass(), "prettyPrint", false);
        setBooleanField(term43686, term43686.getClass(), "visited", false);
        setField(term43686, term43686.getClass(), "docInfo", null);
        setBooleanField(term43686, term43686.getClass(), "unknown", false);
        setBooleanField(term43686, term43686.getClass(), "resolved", false);
        setField(term43686, term43686.getClass(), "resolveResult", null);
        setField(term43686, term43686.getClass(), "templateTypeMap", null);
        setBooleanField(term43686, term43686.getClass(), "inTemplatedCheckVisit", false);
        setField(term43686, term43686.getClass(), "registry", null);
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
        args[2] = term42367;
        args[3] = null;
        callMethod(klass, "expectActualObject", argTypes, term42259, args);
        assertTrue(recursiveEquals(term42259, term43685));
        assertTrue(recursiveEquals(term42367, null));
    }

};


