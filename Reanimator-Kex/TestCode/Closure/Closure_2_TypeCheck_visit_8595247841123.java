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

public class TypeCheck_visit_8595247841123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322264;
     Object term322356;
     Object term322448;
     Object term322864;
     Object term322865;
     Object term322867;

    public TypeCheck_visit_8595247841123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322264 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term322356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term322356, term322356.getClass(), "type", 64);
        setField(term322356, term322356.getClass(), "jsType", null);
        setField(term322356, term322356.getClass(), "propListHead", null);
        setField(term322356, term322356.getClass(), "first", null);
        term322448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term322540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term322448, term322448.getClass(), "jsType", term322540);
        term322864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term322864, term322864.getClass(), "compiler", null);
        setField(term322864, term322864.getClass(), "validator", null);
        setField(term322864, term322864.getClass(), "reverseInterpreter", null);
        setField(term322864, term322864.getClass(), "typeRegistry", null);
        setField(term322864, term322864.getClass(), "topScope", null);
        setField(term322864, term322864.getClass(), "scopeCreator", null);
        setField(term322864, term322864.getClass(), "reportMissingOverride", null);
        setField(term322864, term322864.getClass(), "reportUnknownTypes", null);
        setBooleanField(term322864, term322864.getClass(), "reportMissingProperties", false);
        setField(term322864, term322864.getClass(), "inferJSDocInfo", null);
        setIntField(term322864, term322864.getClass(), "typedCount", 1);
        setIntField(term322864, term322864.getClass(), "nullCount", 0);
        setIntField(term322864, term322864.getClass(), "unknownCount", 0);
        setBooleanField(term322864, term322864.getClass(), "inExterns", false);
        setIntField(term322864, term322864.getClass(), "noTypeCheckSection", 0);
        term322865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term322866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term322865, term322865.getClass(), "str", null);
        setIntField(term322865, term322865.getClass(), "type", 64);
        setField(term322865, term322865.getClass(), "next", null);
        setField(term322865, term322865.getClass(), "first", null);
        setField(term322865, term322865.getClass(), "last", null);
        setField(term322865, term322865.getClass(), "propListHead", null);
        setIntField(term322865, term322865.getClass(), "sourcePosition", 0);
        setField(term322866, term322866.getClass(), "source", null);
        setField(term322866, term322866.getClass(), "elementsType", null);
        setField(term322866, term322866.getClass(), "elements", null);
        setField(term322866, term322866.getClass(), "className", null);
        setField(term322866, term322866.getClass(), "properties", null);
        setBooleanField(term322866, term322866.getClass(), "nativeType", false);
        setField(term322866, term322866.getClass(), "implicitPrototypeFallback", null);
        setField(term322866, term322866.getClass(), "ownerFunction", null);
        setBooleanField(term322866, term322866.getClass(), "prettyPrint", false);
        setBooleanField(term322866, term322866.getClass(), "visited", false);
        setField(term322866, term322866.getClass(), "docInfo", null);
        setBooleanField(term322866, term322866.getClass(), "unknown", false);
        setBooleanField(term322866, term322866.getClass(), "resolved", false);
        setField(term322866, term322866.getClass(), "resolveResult", null);
        setField(term322866, term322866.getClass(), "templateKeys", null);
        setField(term322866, term322866.getClass(), "templatizedTypes", null);
        setBooleanField(term322866, term322866.getClass(), "inTemplatedCheckVisit", false);
        setField(term322866, term322866.getClass(), "registry", null);
        setField(term322865, term322865.getClass(), "jsType", term322866);
        setField(term322865, term322865.getClass(), "parent", null);
        term322867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term322868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term322867, term322867.getClass(), "str", null);
        setIntField(term322867, term322867.getClass(), "type", 0);
        setField(term322867, term322867.getClass(), "next", null);
        setField(term322867, term322867.getClass(), "first", null);
        setField(term322867, term322867.getClass(), "last", null);
        setField(term322867, term322867.getClass(), "propListHead", null);
        setIntField(term322867, term322867.getClass(), "sourcePosition", 0);
        setField(term322868, term322868.getClass(), "source", null);
        setField(term322868, term322868.getClass(), "elementsType", null);
        setField(term322868, term322868.getClass(), "elements", null);
        setField(term322868, term322868.getClass(), "className", null);
        setField(term322868, term322868.getClass(), "properties", null);
        setBooleanField(term322868, term322868.getClass(), "nativeType", false);
        setField(term322868, term322868.getClass(), "implicitPrototypeFallback", null);
        setField(term322868, term322868.getClass(), "ownerFunction", null);
        setBooleanField(term322868, term322868.getClass(), "prettyPrint", false);
        setBooleanField(term322868, term322868.getClass(), "visited", false);
        setField(term322868, term322868.getClass(), "docInfo", null);
        setBooleanField(term322868, term322868.getClass(), "unknown", false);
        setBooleanField(term322868, term322868.getClass(), "resolved", false);
        setField(term322868, term322868.getClass(), "resolveResult", null);
        setField(term322868, term322868.getClass(), "templateKeys", null);
        setField(term322868, term322868.getClass(), "templatizedTypes", null);
        setBooleanField(term322868, term322868.getClass(), "inTemplatedCheckVisit", false);
        setField(term322868, term322868.getClass(), "registry", null);
        setField(term322867, term322867.getClass(), "jsType", term322868);
        setField(term322867, term322867.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term322356;
        args[2] = term322448;
        callMethod(klass, "visit", argTypes, term322264, args);
        assertTrue(recursiveEquals(term322264, term322864));
        assertTrue(recursiveEquals(term322356, term322867));
        assertTrue(recursiveEquals(term322448, null));
    }

};


