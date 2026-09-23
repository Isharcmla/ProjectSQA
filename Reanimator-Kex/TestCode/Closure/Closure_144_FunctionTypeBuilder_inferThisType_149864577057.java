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

public class FunctionTypeBuilder_inferThisType_149864577057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43915;
     Object term43995;
     Object term44318;
     Object term44319;

    public FunctionTypeBuilder_inferThisType_149864577057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43915 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term43995 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term44318 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term44318, term44318.getClass(), "fnName", null);
        setField(term44318, term44318.getClass(), "compiler", null);
        setField(term44318, term44318.getClass(), "codingConvention", null);
        setField(term44318, term44318.getClass(), "typeRegistry", null);
        setField(term44318, term44318.getClass(), "errorRoot", null);
        setField(term44318, term44318.getClass(), "sourceName", null);
        setField(term44318, term44318.getClass(), "scope", null);
        setField(term44318, term44318.getClass(), "returnType", null);
        setField(term44318, term44318.getClass(), "implementedInterfaces", null);
        setField(term44318, term44318.getClass(), "baseType", null);
        setField(term44318, term44318.getClass(), "thisType", null);
        setBooleanField(term44318, term44318.getClass(), "isConstructor", false);
        setBooleanField(term44318, term44318.getClass(), "isInterface", false);
        setField(term44318, term44318.getClass(), "parametersNode", null);
        setField(term44318, term44318.getClass(), "sourceNode", null);
        setField(term44318, term44318.getClass(), "templateTypeName", null);
        term44319 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term44319, term44319.getClass(), "info", null);
        setField(term44319, term44319.getClass(), "documentation", null);
        setField(term44319, term44319.getClass(), "sourceName", null);
        setField(term44319, term44319.getClass(), "visibility", null);
        setIntField(term44319, term44319.getClass(), "bitset", 0);
        setField(term44319, term44319.getClass(), "type", null);
        setField(term44319, term44319.getClass(), "thisType", null);
        setBooleanField(term44319, term44319.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term43995;
        args[1] = null;
        callMethod(klass, "inferThisType", argTypes, term43915, args);
        assertTrue(recursiveEquals(term43915, term44318));
        assertTrue(recursiveEquals(term43995, term44319));
    }

};


