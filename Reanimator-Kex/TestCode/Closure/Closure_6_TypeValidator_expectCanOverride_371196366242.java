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

public class TypeValidator_expectCanOverride_371196366242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69052;
     Object term69142;
     Object term69232;
     Object term69249;
     Object term69250;
     Object term69251;

    public TypeValidator_expectCanOverride_371196366242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69052 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term69142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term69232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term69249 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term69249, term69249.getClass(), "compiler", null);
        setField(term69249, term69249.getClass(), "typeRegistry", null);
        setField(term69249, term69249.getClass(), "allValueTypes", null);
        setBooleanField(term69249, term69249.getClass(), "shouldReport", false);
        setField(term69249, term69249.getClass(), "nullOrUndefined", null);
        setField(term69249, term69249.getClass(), "mismatches", null);
        term69250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term69250, term69250.getClass(), "resolved", false);
        setField(term69250, term69250.getClass(), "resolveResult", null);
        setField(term69250, term69250.getClass(), "templateKeys", null);
        setField(term69250, term69250.getClass(), "templatizedTypes", null);
        setBooleanField(term69250, term69250.getClass(), "inTemplatedCheckVisit", false);
        setField(term69250, term69250.getClass(), "registry", null);
        term69251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term69251, term69251.getClass(), "resolved", false);
        setField(term69251, term69251.getClass(), "resolveResult", null);
        setField(term69251, term69251.getClass(), "templateKeys", null);
        setField(term69251, term69251.getClass(), "templatizedTypes", null);
        setBooleanField(term69251, term69251.getClass(), "inTemplatedCheckVisit", false);
        setField(term69251, term69251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term69142;
        args[3] = term69232;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "expectCanOverride", argTypes, term69052, args);
        assertTrue(recursiveEquals(term69052, term69249));
        assertTrue(recursiveEquals(term69142, null));
        assertTrue(recursiveEquals(term69232, null));
    }

};


