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
import java.lang.Object;

public class NamedType_defineProperty_346418567106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22131;
     Object term22537;

    public NamedType_defineProperty_346418567106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term22235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term22131, term22131.getClass(), "resolved", true);
        setField(term22131, term22131.getClass(), "referencedObjType", term22235);
        term22537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term22538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term22537, term22537.getClass(), "reference", null);
        setField(term22537, term22537.getClass(), "sourceName", null);
        setIntField(term22537, term22537.getClass(), "lineno", 0);
        setIntField(term22537, term22537.getClass(), "charno", 0);
        setField(term22537, term22537.getClass(), "validator", null);
        setField(term22537, term22537.getClass(), "propertyContinuations", null);
        setField(term22537, term22537.getClass(), "referencedType", null);
        setField(term22538, term22538.getClass(), "call", null);
        setField(term22538, term22538.getClass(), "prototypeSlot", null);
        setField(term22538, term22538.getClass(), "kind", null);
        setField(term22538, term22538.getClass(), "propAccess", null);
        setField(term22538, term22538.getClass(), "typeOfThis", null);
        setField(term22538, term22538.getClass(), "source", null);
        setField(term22538, term22538.getClass(), "implementedInterfaces", null);
        setField(term22538, term22538.getClass(), "extendedInterfaces", null);
        setField(term22538, term22538.getClass(), "subTypes", null);
        setField(term22538, term22538.getClass(), "className", null);
        setField(term22538, term22538.getClass(), "properties", null);
        setBooleanField(term22538, term22538.getClass(), "nativeType", false);
        setField(term22538, term22538.getClass(), "implicitPrototypeFallback", null);
        setField(term22538, term22538.getClass(), "ownerFunction", null);
        setBooleanField(term22538, term22538.getClass(), "prettyPrint", false);
        setBooleanField(term22538, term22538.getClass(), "visited", false);
        setField(term22538, term22538.getClass(), "docInfo", null);
        setBooleanField(term22538, term22538.getClass(), "unknown", false);
        setBooleanField(term22538, term22538.getClass(), "resolved", false);
        setField(term22538, term22538.getClass(), "resolveResult", null);
        setField(term22538, term22538.getClass(), "templateKeys", null);
        setField(term22538, term22538.getClass(), "templatizedTypes", null);
        setBooleanField(term22538, term22538.getClass(), "inTemplatedCheckVisit", false);
        setField(term22538, term22538.getClass(), "registry", null);
        setField(term22537, term22537.getClass(), "referencedObjType", term22538);
        setBooleanField(term22537, term22537.getClass(), "visited", false);
        setField(term22537, term22537.getClass(), "docInfo", null);
        setBooleanField(term22537, term22537.getClass(), "unknown", false);
        setBooleanField(term22537, term22537.getClass(), "resolved", true);
        setField(term22537, term22537.getClass(), "resolveResult", null);
        setField(term22537, term22537.getClass(), "templateKeys", null);
        setField(term22537, term22537.getClass(), "templatizedTypes", null);
        setBooleanField(term22537, term22537.getClass(), "inTemplatedCheckVisit", false);
        setField(term22537, term22537.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term22131, args);
        assertTrue(recursiveEquals(term22131, term22537));
        assertTrue(recursiveEquals(retValue, true));
    }

};


