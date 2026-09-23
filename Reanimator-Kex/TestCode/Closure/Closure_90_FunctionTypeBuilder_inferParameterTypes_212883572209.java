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

public class FunctionTypeBuilder_inferParameterTypes_212883572209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82308;
     Object term82480;
     Object term82981;
     Object term82983;
     Object term82974;

    public FunctionTypeBuilder_inferParameterTypes_212883572209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82308 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82394 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82308, term82308.getClass(), "parametersNode", term82394);
        term82480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term82981 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82981, term82981.getClass(), "fnName", null);
        setField(term82981, term82981.getClass(), "compiler", null);
        setField(term82981, term82981.getClass(), "codingConvention", null);
        setField(term82981, term82981.getClass(), "typeRegistry", null);
        setField(term82981, term82981.getClass(), "errorRoot", null);
        setField(term82981, term82981.getClass(), "sourceName", null);
        setField(term82981, term82981.getClass(), "scope", null);
        setField(term82981, term82981.getClass(), "returnType", null);
        setBooleanField(term82981, term82981.getClass(), "returnTypeInferred", false);
        setField(term82981, term82981.getClass(), "implementedInterfaces", null);
        setField(term82981, term82981.getClass(), "baseType", null);
        setField(term82981, term82981.getClass(), "thisType", null);
        setBooleanField(term82981, term82981.getClass(), "isConstructor", false);
        setBooleanField(term82981, term82981.getClass(), "isInterface", false);
        setIntField(term82982, term82982.getClass(), "type", 83);
        setField(term82982, term82982.getClass(), "next", null);
        setField(term82982, term82982.getClass(), "first", null);
        setField(term82982, term82982.getClass(), "last", null);
        setField(term82982, term82982.getClass(), "propListHead", null);
        setIntField(term82982, term82982.getClass(), "sourcePosition", -1);
        setField(term82982, term82982.getClass(), "jsType", null);
        setField(term82982, term82982.getClass(), "parent", null);
        setField(term82981, term82981.getClass(), "parametersNode", term82982);
        setField(term82981, term82981.getClass(), "sourceNode", null);
        setField(term82981, term82981.getClass(), "templateTypeName", null);
        term82983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82983, term82983.getClass(), "functionName", null);
        setBooleanField(term82983, term82983.getClass(), "itsNeedsActivation", false);
        setIntField(term82983, term82983.getClass(), "itsFunctionType", 0);
        setBooleanField(term82983, term82983.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82983, term82983.getClass(), "encodedSourceStart", 0);
        setIntField(term82983, term82983.getClass(), "encodedSourceEnd", 0);
        setField(term82983, term82983.getClass(), "sourceName", null);
        setIntField(term82983, term82983.getClass(), "baseLineno", 0);
        setIntField(term82983, term82983.getClass(), "endLineno", 0);
        setField(term82983, term82983.getClass(), "functions", null);
        setField(term82983, term82983.getClass(), "regexps", null);
        setField(term82983, term82983.getClass(), "itsVariables", null);
        setField(term82983, term82983.getClass(), "itsConst", null);
        setField(term82983, term82983.getClass(), "itsVariableNames", null);
        setIntField(term82983, term82983.getClass(), "varStart", 0);
        setField(term82983, term82983.getClass(), "compilerData", null);
        setIntField(term82983, term82983.getClass(), "type", 0);
        setField(term82983, term82983.getClass(), "next", null);
        setField(term82983, term82983.getClass(), "first", null);
        setField(term82983, term82983.getClass(), "last", null);
        setField(term82983, term82983.getClass(), "propListHead", null);
        setIntField(term82983, term82983.getClass(), "sourcePosition", 0);
        setField(term82983, term82983.getClass(), "jsType", null);
        setField(term82983, term82983.getClass(), "parent", null);
        term82974 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82974, term82974.getClass(), "fnName", null);
        setField(term82974, term82974.getClass(), "compiler", null);
        setField(term82974, term82974.getClass(), "codingConvention", null);
        setField(term82974, term82974.getClass(), "typeRegistry", null);
        setField(term82974, term82974.getClass(), "errorRoot", null);
        setField(term82974, term82974.getClass(), "sourceName", null);
        setField(term82974, term82974.getClass(), "scope", null);
        setField(term82974, term82974.getClass(), "returnType", null);
        setBooleanField(term82974, term82974.getClass(), "returnTypeInferred", false);
        setField(term82974, term82974.getClass(), "implementedInterfaces", null);
        setField(term82974, term82974.getClass(), "baseType", null);
        setField(term82974, term82974.getClass(), "thisType", null);
        setBooleanField(term82974, term82974.getClass(), "isConstructor", false);
        setBooleanField(term82974, term82974.getClass(), "isInterface", false);
        setIntField(term82978, term82978.getClass(), "type", 83);
        setField(term82978, term82978.getClass(), "next", null);
        setField(term82978, term82978.getClass(), "first", null);
        setField(term82978, term82978.getClass(), "last", null);
        setField(term82978, term82978.getClass(), "propListHead", null);
        setIntField(term82978, term82978.getClass(), "sourcePosition", -1);
        setField(term82978, term82978.getClass(), "jsType", null);
        setField(term82978, term82978.getClass(), "parent", null);
        setField(term82974, term82974.getClass(), "parametersNode", term82978);
        setField(term82974, term82974.getClass(), "sourceNode", null);
        setField(term82974, term82974.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term82480;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term82308, args);
        assertTrue(recursiveEquals(term82308, term82981));
        assertTrue(recursiveEquals(term82480, term82983));
        assertTrue(recursiveEquals(retValue, term82974));
    }

};


