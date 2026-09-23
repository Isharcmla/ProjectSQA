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

public class FunctionTypeBuilder_inferReturnType_2137249201171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69078;
     Object term69737;
     Object term69724;

    public FunctionTypeBuilder_inferReturnType_2137249201171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69078 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term69078, term69078.getClass(), "templateTypeName", "");
        setField(term69078, term69078.getClass(), "returnType", term69210);
        term69737 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term69737, term69737.getClass(), "fnName", null);
        setField(term69737, term69737.getClass(), "compiler", null);
        setField(term69737, term69737.getClass(), "codingConvention", null);
        setField(term69737, term69737.getClass(), "typeRegistry", null);
        setField(term69737, term69737.getClass(), "errorRoot", null);
        setField(term69737, term69737.getClass(), "sourceName", null);
        setField(term69737, term69737.getClass(), "scope", null);
        setField(term69738, term69738.getClass(), "reference", null);
        setField(term69738, term69738.getClass(), "sourceName", null);
        setIntField(term69738, term69738.getClass(), "lineno", 0);
        setIntField(term69738, term69738.getClass(), "charno", 0);
        setField(term69738, term69738.getClass(), "validator", null);
        setBooleanField(term69738, term69738.getClass(), "forgiving", false);
        setField(term69738, term69738.getClass(), "referencedType", null);
        setField(term69738, term69738.getClass(), "referencedObjType", null);
        setBooleanField(term69738, term69738.getClass(), "visited", false);
        setField(term69738, term69738.getClass(), "docInfo", null);
        setBooleanField(term69738, term69738.getClass(), "unknown", false);
        setBooleanField(term69738, term69738.getClass(), "resolved", false);
        setField(term69738, term69738.getClass(), "resolveResult", null);
        setField(term69738, term69738.getClass(), "registry", null);
        setField(term69737, term69737.getClass(), "returnType", term69738);
        setBooleanField(term69737, term69737.getClass(), "returnTypeInferred", false);
        setField(term69737, term69737.getClass(), "implementedInterfaces", null);
        setField(term69737, term69737.getClass(), "baseType", null);
        setField(term69737, term69737.getClass(), "thisType", null);
        setBooleanField(term69737, term69737.getClass(), "isConstructor", false);
        setBooleanField(term69737, term69737.getClass(), "isInterface", false);
        setField(term69737, term69737.getClass(), "parametersNode", null);
        setField(term69737, term69737.getClass(), "sourceNode", null);
        setField(term69737, term69737.getClass(), "templateTypeName", "");
        term69724 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term69724, term69724.getClass(), "fnName", null);
        setField(term69724, term69724.getClass(), "compiler", null);
        setField(term69724, term69724.getClass(), "codingConvention", null);
        setField(term69724, term69724.getClass(), "typeRegistry", null);
        setField(term69724, term69724.getClass(), "errorRoot", null);
        setField(term69724, term69724.getClass(), "sourceName", null);
        setField(term69724, term69724.getClass(), "scope", null);
        setField(term69725, term69725.getClass(), "reference", null);
        setField(term69725, term69725.getClass(), "sourceName", null);
        setIntField(term69725, term69725.getClass(), "lineno", 0);
        setIntField(term69725, term69725.getClass(), "charno", 0);
        setField(term69725, term69725.getClass(), "validator", null);
        setBooleanField(term69725, term69725.getClass(), "forgiving", false);
        setField(term69725, term69725.getClass(), "referencedType", null);
        setField(term69725, term69725.getClass(), "referencedObjType", null);
        setBooleanField(term69725, term69725.getClass(), "visited", false);
        setField(term69725, term69725.getClass(), "docInfo", null);
        setBooleanField(term69725, term69725.getClass(), "unknown", false);
        setBooleanField(term69725, term69725.getClass(), "resolved", false);
        setField(term69725, term69725.getClass(), "resolveResult", null);
        setField(term69725, term69725.getClass(), "registry", null);
        setField(term69724, term69724.getClass(), "returnType", term69725);
        setBooleanField(term69724, term69724.getClass(), "returnTypeInferred", false);
        setField(term69724, term69724.getClass(), "implementedInterfaces", null);
        setField(term69724, term69724.getClass(), "baseType", null);
        setField(term69724, term69724.getClass(), "thisType", null);
        setBooleanField(term69724, term69724.getClass(), "isConstructor", false);
        setBooleanField(term69724, term69724.getClass(), "isInterface", false);
        setField(term69724, term69724.getClass(), "parametersNode", null);
        setField(term69724, term69724.getClass(), "sourceNode", null);
        setField(term69724, term69724.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term69078, args);
        assertTrue(recursiveEquals(term69078, term69737));
        assertTrue(recursiveEquals(retValue, term69724));
    }

};


