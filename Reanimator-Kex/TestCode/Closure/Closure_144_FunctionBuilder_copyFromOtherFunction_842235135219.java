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
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151510;
     Object term151826;
     Object term152552;
     Object term152554;
     Object term152548;

    public FunctionBuilder_copyFromOtherFunction_842235135219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term151618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term151510, term151510.getClass(), "name", "");
        setField(term151510, term151510.getClass(), "sourceNode", null);
        setField(term151510, term151510.getClass(), "parametersNode", term151618);
        setField(term151510, term151510.getClass(), "returnType", term151716);
        setField(term151510, term151510.getClass(), "typeOfThis", null);
        setField(term151510, term151510.getClass(), "templateTypeName", null);
        Class<? extends Object> term152561 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152560 = ((Class) term152561).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term152560).setAccessible(true);
        Object enum209 = ((Field) term152560).get((Object) null);
        term151826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term151920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term152044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term151826, term151826.getClass(), "className", null);
        setField(term151826, term151826.getClass(), "source", null);
        setField(term151920, term151920.getClass(), "parameters", null);
        setField(term151920, term151920.getClass(), "returnType", term152044);
        setField(term151826, term151826.getClass(), "call", term151920);
        setField(term151826, term151826.getClass(), "typeOfThis", term152044);
        setField(term151826, term151826.getClass(), "templateTypeName", null);
        setField(term151826, term151826.getClass(), "kind", enum209);
        term152552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term152553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term152552, term152552.getClass(), "registry", null);
        setField(term152552, term152552.getClass(), "name", null);
        setField(term152552, term152552.getClass(), "sourceNode", null);
        setField(term152552, term152552.getClass(), "parametersNode", null);
        setField(term152553, term152553.getClass(), "typeExpr", null);
        setField(term152553, term152553.getClass(), "sourceName", null);
        setBooleanField(term152553, term152553.getClass(), "forgiving", false);
        setBooleanField(term152553, term152553.getClass(), "isChecked", false);
        setBooleanField(term152553, term152553.getClass(), "visited", false);
        setField(term152553, term152553.getClass(), "docInfo", null);
        setBooleanField(term152553, term152553.getClass(), "unknown", false);
        setBooleanField(term152553, term152553.getClass(), "resolved", false);
        setField(term152553, term152553.getClass(), "resolveResult", null);
        setField(term152553, term152553.getClass(), "registry", null);
        setField(term152552, term152552.getClass(), "returnType", term152553);
        setField(term152552, term152552.getClass(), "typeOfThis", term152553);
        setField(term152552, term152552.getClass(), "templateTypeName", null);
        setBooleanField(term152552, term152552.getClass(), "inferredReturnType", false);
        setBooleanField(term152552, term152552.getClass(), "isConstructor", true);
        setBooleanField(term152552, term152552.getClass(), "isNativeType", false);
        Class<? extends Object> term152861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152860 = ((Class) term152861).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term152860).setAccessible(true);
        Object enum210 = ((Field) term152860).get((Object) null);
        term152554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term152555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term152556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term152555, term152555.getClass(), "parameters", null);
        setField(term152556, term152556.getClass(), "typeExpr", null);
        setField(term152556, term152556.getClass(), "sourceName", null);
        setBooleanField(term152556, term152556.getClass(), "forgiving", false);
        setBooleanField(term152556, term152556.getClass(), "isChecked", false);
        setBooleanField(term152556, term152556.getClass(), "visited", false);
        setField(term152556, term152556.getClass(), "docInfo", null);
        setBooleanField(term152556, term152556.getClass(), "unknown", false);
        setBooleanField(term152556, term152556.getClass(), "resolved", false);
        setField(term152556, term152556.getClass(), "resolveResult", null);
        setField(term152556, term152556.getClass(), "registry", null);
        setField(term152555, term152555.getClass(), "returnType", term152556);
        setBooleanField(term152555, term152555.getClass(), "returnTypeInferred", false);
        setBooleanField(term152555, term152555.getClass(), "resolved", false);
        setField(term152555, term152555.getClass(), "resolveResult", null);
        setField(term152555, term152555.getClass(), "registry", null);
        setField(term152554, term152554.getClass(), "call", term152555);
        setField(term152554, term152554.getClass(), "prototype", null);
        setField(term152554, term152554.getClass(), "kind", enum210);
        setField(term152554, term152554.getClass(), "typeOfThis", term152556);
        setField(term152554, term152554.getClass(), "source", null);
        setField(term152554, term152554.getClass(), "implementedInterfaces", null);
        setField(term152554, term152554.getClass(), "subTypes", null);
        setField(term152554, term152554.getClass(), "templateTypeName", null);
        setField(term152554, term152554.getClass(), "className", null);
        setField(term152554, term152554.getClass(), "properties", null);
        setField(term152554, term152554.getClass(), "implicitPrototype", null);
        setBooleanField(term152554, term152554.getClass(), "nativeType", false);
        setBooleanField(term152554, term152554.getClass(), "prettyPrint", false);
        setBooleanField(term152554, term152554.getClass(), "visited", false);
        setField(term152554, term152554.getClass(), "docInfo", null);
        setBooleanField(term152554, term152554.getClass(), "unknown", false);
        setBooleanField(term152554, term152554.getClass(), "resolved", false);
        setField(term152554, term152554.getClass(), "resolveResult", null);
        setField(term152554, term152554.getClass(), "registry", null);
        term152548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term152496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term152548, term152548.getClass(), "registry", null);
        setField(term152548, term152548.getClass(), "name", null);
        setField(term152548, term152548.getClass(), "sourceNode", null);
        setField(term152548, term152548.getClass(), "parametersNode", null);
        setField(term152496, term152496.getClass(), "typeExpr", null);
        setField(term152496, term152496.getClass(), "sourceName", null);
        setBooleanField(term152496, term152496.getClass(), "forgiving", false);
        setBooleanField(term152496, term152496.getClass(), "isChecked", false);
        setBooleanField(term152496, term152496.getClass(), "visited", false);
        setField(term152496, term152496.getClass(), "docInfo", null);
        setBooleanField(term152496, term152496.getClass(), "unknown", false);
        setBooleanField(term152496, term152496.getClass(), "resolved", false);
        setField(term152496, term152496.getClass(), "resolveResult", null);
        setField(term152496, term152496.getClass(), "registry", null);
        setField(term152548, term152548.getClass(), "returnType", term152496);
        setField(term152548, term152548.getClass(), "typeOfThis", term152496);
        setField(term152548, term152548.getClass(), "templateTypeName", null);
        setBooleanField(term152548, term152548.getClass(), "inferredReturnType", false);
        setBooleanField(term152548, term152548.getClass(), "isConstructor", true);
        setBooleanField(term152548, term152548.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term151826;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term151510, args);
        assertTrue(recursiveEquals(term151510, term152552));
        assertTrue(recursiveEquals(term151826, term152554));
        assertTrue(recursiveEquals(retValue, term152548));
    }

};


