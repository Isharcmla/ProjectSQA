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

public class FunctionTypeBuilder_inferParameterTypes_212883572105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58570;
     Object term58754;
     Object term58837;
     Object term58838;
     Object term58819;

    public FunctionTypeBuilder_inferParameterTypes_212883572105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58570 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term58674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term58570, term58570.getClass(), "typeRegistry", term58674);
        setField(term58570, term58570.getClass(), "templateTypeName", null);
        term58754 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term58754, term58754.getClass(), "info", null);
        term58837 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term58837, term58837.getClass(), "asList", null);
        term58838 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term58838, term58838.getClass(), "info", null);
        setField(term58838, term58838.getClass(), "documentation", null);
        setField(term58838, term58838.getClass(), "sourceName", null);
        setField(term58838, term58838.getClass(), "visibility", null);
        setIntField(term58838, term58838.getClass(), "bitset", 0);
        setField(term58838, term58838.getClass(), "type", null);
        setField(term58838, term58838.getClass(), "thisType", null);
        setBooleanField(term58838, term58838.getClass(), "includeDocumentation", false);
        term58819 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term58820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term58825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58819, term58819.getClass(), "fnName", null);
        setField(term58819, term58819.getClass(), "compiler", null);
        setField(term58819, term58819.getClass(), "codingConvention", null);
        setField(term58820, term58820.getClass(), "reporter", null);
        setField(term58820, term58820.getClass(), "nativeTypes", null);
        setField(term58820, term58820.getClass(), "namesToTypes", null);
        setField(term58820, term58820.getClass(), "namespaces", null);
        setField(term58820, term58820.getClass(), "enumTypeNames", null);
        setField(term58820, term58820.getClass(), "forwardDeclaredTypes", null);
        setField(term58820, term58820.getClass(), "typesIndexedByProperty", null);
        setField(term58820, term58820.getClass(), "greatestSubtypeByProperty", null);
        setField(term58820, term58820.getClass(), "interfaceToImplementors", null);
        setField(term58820, term58820.getClass(), "unresolvedNamedTypes", null);
        setField(term58820, term58820.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term58820, term58820.getClass(), "lastGeneration", false);
        setField(term58820, term58820.getClass(), "templateTypeName", null);
        setField(term58820, term58820.getClass(), "templateType", null);
        setBooleanField(term58820, term58820.getClass(), "tolerateUndefinedValues", false);
        setField(term58820, term58820.getClass(), "resolveMode", null);
        setField(term58819, term58819.getClass(), "typeRegistry", term58820);
        setField(term58819, term58819.getClass(), "errorRoot", null);
        setField(term58819, term58819.getClass(), "sourceName", null);
        setField(term58819, term58819.getClass(), "scope", null);
        setField(term58819, term58819.getClass(), "returnType", null);
        setField(term58819, term58819.getClass(), "implementedInterfaces", null);
        setField(term58819, term58819.getClass(), "baseType", null);
        setField(term58819, term58819.getClass(), "thisType", null);
        setBooleanField(term58819, term58819.getClass(), "isConstructor", false);
        setBooleanField(term58819, term58819.getClass(), "isInterface", false);
        setIntField(term58825, term58825.getClass(), "type", 83);
        setField(term58825, term58825.getClass(), "next", null);
        setField(term58825, term58825.getClass(), "first", null);
        setField(term58825, term58825.getClass(), "last", null);
        setField(term58825, term58825.getClass(), "propListHead", null);
        setIntField(term58825, term58825.getClass(), "sourcePosition", -1);
        setField(term58825, term58825.getClass(), "jsType", null);
        setField(term58825, term58825.getClass(), "parent", null);
        setField(term58819, term58819.getClass(), "parametersNode", term58825);
        setField(term58819, term58819.getClass(), "sourceNode", null);
        setField(term58819, term58819.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58754;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term58570, args);
        assertTrue(recursiveEquals(term58570, term58837));
        assertTrue(recursiveEquals(term58754, null));
        assertTrue(recursiveEquals(retValue, term58819));
    }

};


