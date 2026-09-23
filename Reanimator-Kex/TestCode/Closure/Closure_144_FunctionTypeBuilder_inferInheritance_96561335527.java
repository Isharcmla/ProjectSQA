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

public class FunctionTypeBuilder_inferInheritance_96561335527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3838;
     Object term23556;

    public FunctionTypeBuilder_inferInheritance_96561335527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3838 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term3838, term3838.getClass(), "fnName", null);
        setField(term3838, term3838.getClass(), "compiler", null);
        setField(term3838, term3838.getClass(), "codingConvention", null);
        setField(term3838, term3838.getClass(), "typeRegistry", null);
        setField(term3838, term3838.getClass(), "errorRoot", null);
        setField(term3838, term3838.getClass(), "sourceName", null);
        setField(term3838, term3838.getClass(), "scope", null);
        setField(term3838, term3838.getClass(), "returnType", null);
        setField(term3838, term3838.getClass(), "implementedInterfaces", null);
        setField(term3838, term3838.getClass(), "baseType", null);
        setField(term3838, term3838.getClass(), "thisType", null);
        setBooleanField(term3838, term3838.getClass(), "isConstructor", false);
        setBooleanField(term3838, term3838.getClass(), "isInterface", false);
        setField(term3838, term3838.getClass(), "parametersNode", null);
        setField(term3838, term3838.getClass(), "sourceNode", null);
        setField(term3838, term3838.getClass(), "templateTypeName", null);
        term23556 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term23556, term23556.getClass(), "fnName", null);
        setField(term23556, term23556.getClass(), "compiler", null);
        setField(term23556, term23556.getClass(), "codingConvention", null);
        setField(term23556, term23556.getClass(), "typeRegistry", null);
        setField(term23556, term23556.getClass(), "errorRoot", null);
        setField(term23556, term23556.getClass(), "sourceName", null);
        setField(term23556, term23556.getClass(), "scope", null);
        setField(term23556, term23556.getClass(), "returnType", null);
        setField(term23556, term23556.getClass(), "implementedInterfaces", null);
        setField(term23556, term23556.getClass(), "baseType", null);
        setField(term23556, term23556.getClass(), "thisType", null);
        setBooleanField(term23556, term23556.getClass(), "isConstructor", false);
        setBooleanField(term23556, term23556.getClass(), "isInterface", false);
        setField(term23556, term23556.getClass(), "parametersNode", null);
        setField(term23556, term23556.getClass(), "sourceNode", null);
        setField(term23556, term23556.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferInheritance", argTypes, term3838, args);
        assertTrue(recursiveEquals(term3838, term23556));
    }

};


