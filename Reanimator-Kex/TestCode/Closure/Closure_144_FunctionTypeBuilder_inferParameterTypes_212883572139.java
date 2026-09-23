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

public class FunctionTypeBuilder_inferParameterTypes_212883572139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70663;
     Object term70733;
     Object term70813;
     Object term70858;
     Object term70859;
     Object term70860;
     Object term70852;

    public FunctionTypeBuilder_inferParameterTypes_212883572139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70663 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term70663, term70663.getClass(), "typeRegistry", null);
        term70733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term70813 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term70858 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term70858, term70858.getClass(), "asList", null);
        term70859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term70859, term70859.getClass(), "info", null);
        setField(term70859, term70859.getClass(), "documentation", null);
        setField(term70859, term70859.getClass(), "sourceName", null);
        setField(term70859, term70859.getClass(), "visibility", null);
        setIntField(term70859, term70859.getClass(), "bitset", 0);
        setField(term70859, term70859.getClass(), "type", null);
        setField(term70859, term70859.getClass(), "thisType", null);
        setBooleanField(term70859, term70859.getClass(), "includeDocumentation", false);
        term70860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70860, term70860.getClass(), "type", 0);
        setField(term70860, term70860.getClass(), "next", null);
        setField(term70860, term70860.getClass(), "first", null);
        setField(term70860, term70860.getClass(), "last", null);
        setField(term70860, term70860.getClass(), "propListHead", null);
        setIntField(term70860, term70860.getClass(), "sourcePosition", 0);
        setField(term70860, term70860.getClass(), "jsType", null);
        setField(term70860, term70860.getClass(), "parent", null);
        term70852 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term70855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70852, term70852.getClass(), "fnName", null);
        setField(term70852, term70852.getClass(), "compiler", null);
        setField(term70852, term70852.getClass(), "codingConvention", null);
        setField(term70852, term70852.getClass(), "typeRegistry", null);
        setField(term70852, term70852.getClass(), "errorRoot", null);
        setField(term70852, term70852.getClass(), "sourceName", null);
        setField(term70852, term70852.getClass(), "scope", null);
        setField(term70852, term70852.getClass(), "returnType", null);
        setField(term70852, term70852.getClass(), "implementedInterfaces", null);
        setField(term70852, term70852.getClass(), "baseType", null);
        setField(term70852, term70852.getClass(), "thisType", null);
        setBooleanField(term70852, term70852.getClass(), "isConstructor", false);
        setBooleanField(term70852, term70852.getClass(), "isInterface", false);
        setIntField(term70855, term70855.getClass(), "type", 83);
        setField(term70855, term70855.getClass(), "next", null);
        setField(term70855, term70855.getClass(), "first", null);
        setField(term70855, term70855.getClass(), "last", null);
        setField(term70855, term70855.getClass(), "propListHead", null);
        setIntField(term70855, term70855.getClass(), "sourcePosition", -1);
        setField(term70855, term70855.getClass(), "jsType", null);
        setField(term70855, term70855.getClass(), "parent", null);
        setField(term70852, term70852.getClass(), "parametersNode", term70855);
        setField(term70852, term70852.getClass(), "sourceNode", null);
        setField(term70852, term70852.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term70733;
        args[1] = term70813;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term70663, args);
        assertTrue(recursiveEquals(term70663, term70858));
        assertTrue(recursiveEquals(term70733, term70859));
        assertTrue(recursiveEquals(term70813, term70860));
        assertTrue(recursiveEquals(retValue, term70852));
    }

};


