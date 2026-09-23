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

public class FunctionTypeBuilder_inferThisType_1498645770181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84673;
     Object term84753;
     Object term84823;
     Object term84845;
     Object term84846;
     Object term84847;

    public FunctionTypeBuilder_inferThisType_1498645770181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84673 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term84753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term84753, term84753.getClass(), "thisType", null);
        setIntField(term84753, term84753.getClass(), "bitset", 536870912);
        term84823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term84845 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term84845, term84845.getClass(), "fnName", null);
        setField(term84845, term84845.getClass(), "compiler", null);
        setField(term84845, term84845.getClass(), "codingConvention", null);
        setField(term84845, term84845.getClass(), "typeRegistry", null);
        setField(term84845, term84845.getClass(), "errorRoot", null);
        setField(term84845, term84845.getClass(), "sourceName", null);
        setField(term84845, term84845.getClass(), "scope", null);
        setField(term84845, term84845.getClass(), "returnType", null);
        setField(term84845, term84845.getClass(), "implementedInterfaces", null);
        setField(term84845, term84845.getClass(), "baseType", null);
        setField(term84845, term84845.getClass(), "thisType", null);
        setBooleanField(term84845, term84845.getClass(), "isConstructor", false);
        setBooleanField(term84845, term84845.getClass(), "isInterface", false);
        setField(term84845, term84845.getClass(), "parametersNode", null);
        setField(term84845, term84845.getClass(), "sourceNode", null);
        setField(term84845, term84845.getClass(), "templateTypeName", null);
        term84846 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term84846, term84846.getClass(), "info", null);
        setField(term84846, term84846.getClass(), "documentation", null);
        setField(term84846, term84846.getClass(), "sourceName", null);
        setField(term84846, term84846.getClass(), "visibility", null);
        setIntField(term84846, term84846.getClass(), "bitset", 536870912);
        setField(term84846, term84846.getClass(), "type", null);
        setField(term84846, term84846.getClass(), "thisType", null);
        setBooleanField(term84846, term84846.getClass(), "includeDocumentation", false);
        term84847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84847, term84847.getClass(), "type", 0);
        setField(term84847, term84847.getClass(), "next", null);
        setField(term84847, term84847.getClass(), "first", null);
        setField(term84847, term84847.getClass(), "last", null);
        setField(term84847, term84847.getClass(), "propListHead", null);
        setIntField(term84847, term84847.getClass(), "sourcePosition", 0);
        setField(term84847, term84847.getClass(), "jsType", null);
        setField(term84847, term84847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term84753;
        args[1] = term84823;
        callMethod(klass, "inferThisType", argTypes, term84673, args);
        assertTrue(recursiveEquals(term84673, term84845));
        assertTrue(recursiveEquals(term84753, term84846));
        assertTrue(recursiveEquals(term84823, term84847));
    }

};


