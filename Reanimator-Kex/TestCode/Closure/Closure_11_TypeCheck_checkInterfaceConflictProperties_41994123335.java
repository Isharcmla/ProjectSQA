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

public class TypeCheck_checkInterfaceConflictProperties_41994123335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81781;
     Object term81891;
     Object term82206;
     Object term82207;

    public TypeCheck_checkInterfaceConflictProperties_41994123335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81781 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term81891, term81891.getClass(), "referencedObjType", null);
        term82206 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term82206, term82206.getClass(), "compiler", null);
        setField(term82206, term82206.getClass(), "validator", null);
        setField(term82206, term82206.getClass(), "reverseInterpreter", null);
        setField(term82206, term82206.getClass(), "typeRegistry", null);
        setField(term82206, term82206.getClass(), "topScope", null);
        setField(term82206, term82206.getClass(), "scopeCreator", null);
        setField(term82206, term82206.getClass(), "reportMissingOverride", null);
        setField(term82206, term82206.getClass(), "reportUnknownTypes", null);
        setBooleanField(term82206, term82206.getClass(), "reportMissingProperties", false);
        setField(term82206, term82206.getClass(), "inferJSDocInfo", null);
        setIntField(term82206, term82206.getClass(), "typedCount", 0);
        setIntField(term82206, term82206.getClass(), "nullCount", 0);
        setIntField(term82206, term82206.getClass(), "unknownCount", 0);
        setBooleanField(term82206, term82206.getClass(), "inExterns", false);
        setIntField(term82206, term82206.getClass(), "noTypeCheckSection", 0);
        term82207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term82207, term82207.getClass(), "parameterType", null);
        setField(term82207, term82207.getClass(), "referencedType", null);
        setField(term82207, term82207.getClass(), "referencedObjType", null);
        setBooleanField(term82207, term82207.getClass(), "visited", false);
        setField(term82207, term82207.getClass(), "docInfo", null);
        setBooleanField(term82207, term82207.getClass(), "unknown", false);
        setBooleanField(term82207, term82207.getClass(), "resolved", false);
        setField(term82207, term82207.getClass(), "resolveResult", null);
        setBooleanField(term82207, term82207.getClass(), "inTemplatedCheckVisit", false);
        setField(term82207, term82207.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term81891;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term81781, args);
        assertTrue(recursiveEquals(term81781, term82206));
        assertTrue(recursiveEquals(term81891, null));
    }

};


