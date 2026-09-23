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

public class TypeValidator_expectUndeclaredVariable_328555518258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74234;
     Object term74304;
     Object term74374;
     Object term74456;
     Object term74485;
     Object term74486;
     Object term74487;
     Object term74488;
     Object term74477;

    public TypeValidator_expectUndeclaredVariable_328555518258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74234 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term74304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74304, term74304.getClass(), "type", 154);
        setField(term74304, term74304.getClass(), "propListHead", null);
        term74374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74374, term74374.getClass(), "propListHead", null);
        term74456 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term74485 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term74485, term74485.getClass(), "compiler", null);
        setField(term74485, term74485.getClass(), "typeRegistry", null);
        setField(term74485, term74485.getClass(), "allValueTypes", null);
        setBooleanField(term74485, term74485.getClass(), "shouldReport", false);
        setField(term74485, term74485.getClass(), "nullOrUndefined", null);
        setField(term74485, term74485.getClass(), "mismatches", null);
        term74486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74486, term74486.getClass(), "type", 154);
        setField(term74486, term74486.getClass(), "next", null);
        setField(term74486, term74486.getClass(), "first", null);
        setField(term74486, term74486.getClass(), "last", null);
        setField(term74486, term74486.getClass(), "propListHead", null);
        setIntField(term74486, term74486.getClass(), "sourcePosition", 0);
        setField(term74486, term74486.getClass(), "jsType", null);
        setField(term74486, term74486.getClass(), "parent", null);
        term74487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74487, term74487.getClass(), "type", 0);
        setField(term74487, term74487.getClass(), "next", null);
        setField(term74487, term74487.getClass(), "first", null);
        setField(term74487, term74487.getClass(), "last", null);
        setField(term74487, term74487.getClass(), "propListHead", null);
        setIntField(term74487, term74487.getClass(), "sourcePosition", 0);
        setField(term74487, term74487.getClass(), "jsType", null);
        setField(term74487, term74487.getClass(), "parent", null);
        term74488 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term74488, term74488.getClass(), "name", null);
        setField(term74488, term74488.getClass(), "nameNode", null);
        setField(term74488, term74488.getClass(), "type", null);
        setBooleanField(term74488, term74488.getClass(), "typeInferred", false);
        setField(term74488, term74488.getClass(), "input", null);
        setIntField(term74488, term74488.getClass(), "index", 0);
        setField(term74488, term74488.getClass(), "scope", null);
        setBooleanField(term74488, term74488.getClass(), "markedEscaped", false);
        setBooleanField(term74488, term74488.getClass(), "markedAssignedExactlyOnce", false);
        term74477 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term74477, term74477.getClass(), "name", null);
        setField(term74477, term74477.getClass(), "nameNode", null);
        setField(term74477, term74477.getClass(), "type", null);
        setBooleanField(term74477, term74477.getClass(), "typeInferred", false);
        setField(term74477, term74477.getClass(), "input", null);
        setIntField(term74477, term74477.getClass(), "index", 0);
        setField(term74477, term74477.getClass(), "scope", null);
        setBooleanField(term74477, term74477.getClass(), "markedEscaped", false);
        setBooleanField(term74477, term74477.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term74304;
        args[3] = term74374;
        args[4] = term74456;
        args[5] = null;
        args[6] = null;
        Object retValue = callMethod(klass, "expectUndeclaredVariable", argTypes, term74234, args);
        assertTrue(recursiveEquals(term74234, term74485));
        assertTrue(recursiveEquals(term74304, term74488));
        assertTrue(recursiveEquals(term74374, null));
        assertTrue(recursiveEquals(term74456, null));
        assertTrue(recursiveEquals(retValue, term74477));
    }

};


