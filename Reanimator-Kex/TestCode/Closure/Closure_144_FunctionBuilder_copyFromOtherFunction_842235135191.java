package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132229;
     Object term132447;
     Object term132677;
     Object term132679;
     Object term132673;

    public FunctionBuilder_copyFromOtherFunction_842235135191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term132337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132229, term132229.getClass(), "name", "");
        setField(term132229, term132229.getClass(), "sourceNode", null);
        setField(term132229, term132229.getClass(), "parametersNode", term132337);
        setField(term132229, term132229.getClass(), "returnType", null);
        term132447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term132541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term132635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term132447, term132447.getClass(), "className", null);
        setField(term132447, term132447.getClass(), "source", null);
        setField(term132541, term132541.getClass(), "parameters", null);
        setField(term132541, term132541.getClass(), "returnType", null);
        setField(term132447, term132447.getClass(), "call", term132541);
        setField(term132447, term132447.getClass(), "typeOfThis", term132635);
        term132677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term132678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term132677, term132677.getClass(), "registry", null);
        setField(term132677, term132677.getClass(), "name", null);
        setField(term132677, term132677.getClass(), "sourceNode", null);
        setField(term132677, term132677.getClass(), "parametersNode", null);
        setField(term132677, term132677.getClass(), "returnType", null);
        setField(term132678, term132678.getClass(), "reference", null);
        setField(term132678, term132678.getClass(), "sourceName", null);
        setIntField(term132678, term132678.getClass(), "lineno", 0);
        setIntField(term132678, term132678.getClass(), "charno", 0);
        setBooleanField(term132678, term132678.getClass(), "forgiving", false);
        setField(term132678, term132678.getClass(), "referencedType", null);
        setBooleanField(term132678, term132678.getClass(), "visited", false);
        setField(term132678, term132678.getClass(), "docInfo", null);
        setBooleanField(term132678, term132678.getClass(), "unknown", false);
        setBooleanField(term132678, term132678.getClass(), "resolved", false);
        setField(term132678, term132678.getClass(), "resolveResult", null);
        setField(term132678, term132678.getClass(), "registry", null);
        setField(term132677, term132677.getClass(), "typeOfThis", term132678);
        setField(term132677, term132677.getClass(), "templateTypeName", null);
        setBooleanField(term132677, term132677.getClass(), "inferredReturnType", false);
        setBooleanField(term132677, term132677.getClass(), "isConstructor", false);
        setBooleanField(term132677, term132677.getClass(), "isNativeType", false);
        term132679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term132680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term132681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term132680, term132680.getClass(), "parameters", null);
        setField(term132680, term132680.getClass(), "returnType", null);
        setBooleanField(term132680, term132680.getClass(), "returnTypeInferred", false);
        setBooleanField(term132680, term132680.getClass(), "resolved", false);
        setField(term132680, term132680.getClass(), "resolveResult", null);
        setField(term132680, term132680.getClass(), "registry", null);
        setField(term132679, term132679.getClass(), "call", term132680);
        setField(term132679, term132679.getClass(), "prototype", null);
        setField(term132679, term132679.getClass(), "kind", null);
        setField(term132681, term132681.getClass(), "reference", null);
        setField(term132681, term132681.getClass(), "sourceName", null);
        setIntField(term132681, term132681.getClass(), "lineno", 0);
        setIntField(term132681, term132681.getClass(), "charno", 0);
        setBooleanField(term132681, term132681.getClass(), "forgiving", false);
        setField(term132681, term132681.getClass(), "referencedType", null);
        setBooleanField(term132681, term132681.getClass(), "visited", false);
        setField(term132681, term132681.getClass(), "docInfo", null);
        setBooleanField(term132681, term132681.getClass(), "unknown", false);
        setBooleanField(term132681, term132681.getClass(), "resolved", false);
        setField(term132681, term132681.getClass(), "resolveResult", null);
        setField(term132681, term132681.getClass(), "registry", null);
        setField(term132679, term132679.getClass(), "typeOfThis", term132681);
        setField(term132679, term132679.getClass(), "source", null);
        setField(term132679, term132679.getClass(), "implementedInterfaces", null);
        setField(term132679, term132679.getClass(), "subTypes", null);
        setField(term132679, term132679.getClass(), "templateTypeName", null);
        setField(term132679, term132679.getClass(), "className", null);
        setField(term132679, term132679.getClass(), "properties", null);
        setField(term132679, term132679.getClass(), "implicitPrototype", null);
        setBooleanField(term132679, term132679.getClass(), "nativeType", false);
        setBooleanField(term132679, term132679.getClass(), "prettyPrint", false);
        setBooleanField(term132679, term132679.getClass(), "visited", false);
        setField(term132679, term132679.getClass(), "docInfo", null);
        setBooleanField(term132679, term132679.getClass(), "unknown", false);
        setBooleanField(term132679, term132679.getClass(), "resolved", false);
        setField(term132679, term132679.getClass(), "resolveResult", null);
        setField(term132679, term132679.getClass(), "registry", null);
        term132673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term132641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term132673, term132673.getClass(), "registry", null);
        setField(term132673, term132673.getClass(), "name", null);
        setField(term132673, term132673.getClass(), "sourceNode", null);
        setField(term132673, term132673.getClass(), "parametersNode", null);
        setField(term132673, term132673.getClass(), "returnType", null);
        setField(term132641, term132641.getClass(), "reference", null);
        setField(term132641, term132641.getClass(), "sourceName", null);
        setIntField(term132641, term132641.getClass(), "lineno", 0);
        setIntField(term132641, term132641.getClass(), "charno", 0);
        setBooleanField(term132641, term132641.getClass(), "forgiving", false);
        setField(term132641, term132641.getClass(), "referencedType", null);
        setBooleanField(term132641, term132641.getClass(), "visited", false);
        setField(term132641, term132641.getClass(), "docInfo", null);
        setBooleanField(term132641, term132641.getClass(), "unknown", false);
        setBooleanField(term132641, term132641.getClass(), "resolved", false);
        setField(term132641, term132641.getClass(), "resolveResult", null);
        setField(term132641, term132641.getClass(), "registry", null);
        setField(term132673, term132673.getClass(), "typeOfThis", term132641);
        setField(term132673, term132673.getClass(), "templateTypeName", null);
        setBooleanField(term132673, term132673.getClass(), "inferredReturnType", false);
        setBooleanField(term132673, term132673.getClass(), "isConstructor", false);
        setBooleanField(term132673, term132673.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term132447;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term132229, args);
        assertTrue(recursiveEquals(term132229, term132677));
        assertTrue(recursiveEquals(term132447, term132679));
        assertTrue(recursiveEquals(retValue, term132673));
    }

};


