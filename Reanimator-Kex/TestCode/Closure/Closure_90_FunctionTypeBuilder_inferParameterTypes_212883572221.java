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

public class FunctionTypeBuilder_inferParameterTypes_212883572221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85860;
     Object term85930;
     Object term86010;
     Object term86569;
     Object term86570;
     Object term86571;
     Object term86562;

    public FunctionTypeBuilder_inferParameterTypes_212883572221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85860 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term85860, term85860.getClass(), "parametersNode", null);
        setField(term85860, term85860.getClass(), "typeRegistry", null);
        term85930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85930, term85930.getClass(), "first", null);
        term86010 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term86010, term86010.getClass(), "info", null);
        term86569 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term86569, term86569.getClass(), "asList", null);
        term86570 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term86570, term86570.getClass(), "info", null);
        setField(term86570, term86570.getClass(), "documentation", null);
        setField(term86570, term86570.getClass(), "sourceName", null);
        setField(term86570, term86570.getClass(), "visibility", null);
        setIntField(term86570, term86570.getClass(), "bitset", 0);
        setField(term86570, term86570.getClass(), "type", null);
        setField(term86570, term86570.getClass(), "thisType", null);
        setBooleanField(term86570, term86570.getClass(), "includeDocumentation", false);
        term86571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86571, term86571.getClass(), "type", 0);
        setField(term86571, term86571.getClass(), "next", null);
        setField(term86571, term86571.getClass(), "first", null);
        setField(term86571, term86571.getClass(), "last", null);
        setField(term86571, term86571.getClass(), "propListHead", null);
        setIntField(term86571, term86571.getClass(), "sourcePosition", 0);
        setField(term86571, term86571.getClass(), "jsType", null);
        setField(term86571, term86571.getClass(), "parent", null);
        term86562 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term86566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86562, term86562.getClass(), "fnName", null);
        setField(term86562, term86562.getClass(), "compiler", null);
        setField(term86562, term86562.getClass(), "codingConvention", null);
        setField(term86562, term86562.getClass(), "typeRegistry", null);
        setField(term86562, term86562.getClass(), "errorRoot", null);
        setField(term86562, term86562.getClass(), "sourceName", null);
        setField(term86562, term86562.getClass(), "scope", null);
        setField(term86562, term86562.getClass(), "returnType", null);
        setBooleanField(term86562, term86562.getClass(), "returnTypeInferred", false);
        setField(term86562, term86562.getClass(), "implementedInterfaces", null);
        setField(term86562, term86562.getClass(), "baseType", null);
        setField(term86562, term86562.getClass(), "thisType", null);
        setBooleanField(term86562, term86562.getClass(), "isConstructor", false);
        setBooleanField(term86562, term86562.getClass(), "isInterface", false);
        setIntField(term86566, term86566.getClass(), "type", 83);
        setField(term86566, term86566.getClass(), "next", null);
        setField(term86566, term86566.getClass(), "first", null);
        setField(term86566, term86566.getClass(), "last", null);
        setField(term86566, term86566.getClass(), "propListHead", null);
        setIntField(term86566, term86566.getClass(), "sourcePosition", -1);
        setField(term86566, term86566.getClass(), "jsType", null);
        setField(term86566, term86566.getClass(), "parent", null);
        setField(term86562, term86562.getClass(), "parametersNode", term86566);
        setField(term86562, term86562.getClass(), "sourceNode", null);
        setField(term86562, term86562.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term85930;
        args[1] = term86010;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term85860, args);
        assertTrue(recursiveEquals(term85860, term86569));
        assertTrue(recursiveEquals(term85930, term86570));
        assertTrue(recursiveEquals(term86010, term86571));
        assertTrue(recursiveEquals(retValue, term86562));
    }

};


