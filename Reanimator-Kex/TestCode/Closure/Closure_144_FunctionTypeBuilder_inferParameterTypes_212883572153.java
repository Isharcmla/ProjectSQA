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

public class FunctionTypeBuilder_inferParameterTypes_212883572153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74639;
     Object term74709;
     Object term74740;
     Object term74742;
     Object term74734;

    public FunctionTypeBuilder_inferParameterTypes_212883572153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74639 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term74639, term74639.getClass(), "typeRegistry", null);
        term74709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74709, term74709.getClass(), "first", null);
        term74740 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term74741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74740, term74740.getClass(), "fnName", null);
        setField(term74740, term74740.getClass(), "compiler", null);
        setField(term74740, term74740.getClass(), "codingConvention", null);
        setField(term74740, term74740.getClass(), "typeRegistry", null);
        setField(term74740, term74740.getClass(), "errorRoot", null);
        setField(term74740, term74740.getClass(), "sourceName", null);
        setField(term74740, term74740.getClass(), "scope", null);
        setField(term74740, term74740.getClass(), "returnType", null);
        setField(term74740, term74740.getClass(), "implementedInterfaces", null);
        setField(term74740, term74740.getClass(), "baseType", null);
        setField(term74740, term74740.getClass(), "thisType", null);
        setBooleanField(term74740, term74740.getClass(), "isConstructor", false);
        setBooleanField(term74740, term74740.getClass(), "isInterface", false);
        setIntField(term74741, term74741.getClass(), "type", 83);
        setField(term74741, term74741.getClass(), "next", null);
        setField(term74741, term74741.getClass(), "first", null);
        setField(term74741, term74741.getClass(), "last", null);
        setField(term74741, term74741.getClass(), "propListHead", null);
        setIntField(term74741, term74741.getClass(), "sourcePosition", -1);
        setField(term74741, term74741.getClass(), "jsType", null);
        setField(term74741, term74741.getClass(), "parent", null);
        setField(term74740, term74740.getClass(), "parametersNode", term74741);
        setField(term74740, term74740.getClass(), "sourceNode", null);
        setField(term74740, term74740.getClass(), "templateTypeName", null);
        term74742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74742, term74742.getClass(), "type", 0);
        setField(term74742, term74742.getClass(), "next", null);
        setField(term74742, term74742.getClass(), "first", null);
        setField(term74742, term74742.getClass(), "last", null);
        setField(term74742, term74742.getClass(), "propListHead", null);
        setIntField(term74742, term74742.getClass(), "sourcePosition", 0);
        setField(term74742, term74742.getClass(), "jsType", null);
        setField(term74742, term74742.getClass(), "parent", null);
        term74734 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term74737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74734, term74734.getClass(), "fnName", null);
        setField(term74734, term74734.getClass(), "compiler", null);
        setField(term74734, term74734.getClass(), "codingConvention", null);
        setField(term74734, term74734.getClass(), "typeRegistry", null);
        setField(term74734, term74734.getClass(), "errorRoot", null);
        setField(term74734, term74734.getClass(), "sourceName", null);
        setField(term74734, term74734.getClass(), "scope", null);
        setField(term74734, term74734.getClass(), "returnType", null);
        setField(term74734, term74734.getClass(), "implementedInterfaces", null);
        setField(term74734, term74734.getClass(), "baseType", null);
        setField(term74734, term74734.getClass(), "thisType", null);
        setBooleanField(term74734, term74734.getClass(), "isConstructor", false);
        setBooleanField(term74734, term74734.getClass(), "isInterface", false);
        setIntField(term74737, term74737.getClass(), "type", 83);
        setField(term74737, term74737.getClass(), "next", null);
        setField(term74737, term74737.getClass(), "first", null);
        setField(term74737, term74737.getClass(), "last", null);
        setField(term74737, term74737.getClass(), "propListHead", null);
        setIntField(term74737, term74737.getClass(), "sourcePosition", -1);
        setField(term74737, term74737.getClass(), "jsType", null);
        setField(term74737, term74737.getClass(), "parent", null);
        setField(term74734, term74734.getClass(), "parametersNode", term74737);
        setField(term74734, term74734.getClass(), "sourceNode", null);
        setField(term74734, term74734.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term74709;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term74639, args);
        assertTrue(recursiveEquals(term74639, term74740));
        assertTrue(recursiveEquals(term74709, term74742));
        assertTrue(recursiveEquals(retValue, term74734));
    }

};


