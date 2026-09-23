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

public class FunctionBuilder_copyFromOtherFunction_842235135159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108514;
     Object term108662;
     Object term109358;
     Object term109360;
     Object term109354;

    public FunctionBuilder_copyFromOtherFunction_842235135159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term108514, term108514.getClass(), "name", "");
        setField(term108514, term108514.getClass(), "sourceNode", null);
        setField(term108514, term108514.getClass(), "parametersNode", null);
        setField(term108514, term108514.getClass(), "returnType", null);
        setField(term108514, term108514.getClass(), "typeOfThis", null);
        setField(term108514, term108514.getClass(), "templateTypeName", null);
        Class<? extends Object> term109367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term109366 = ((Class) term109367).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term109366).setAccessible(true);
        Object enum156 = ((Field) term109366).get((Object) null);
        term108662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term108756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term108856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term108662, term108662.getClass(), "className", null);
        setField(term108662, term108662.getClass(), "source", null);
        setField(term108756, term108756.getClass(), "parameters", null);
        setField(term108756, term108756.getClass(), "returnType", null);
        setField(term108662, term108662.getClass(), "call", term108756);
        setField(term108662, term108662.getClass(), "typeOfThis", term108856);
        setField(term108662, term108662.getClass(), "templateTypeName", null);
        setField(term108662, term108662.getClass(), "kind", enum156);
        term109358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term109359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term109358, term109358.getClass(), "registry", null);
        setField(term109358, term109358.getClass(), "name", null);
        setField(term109358, term109358.getClass(), "sourceNode", null);
        setField(term109358, term109358.getClass(), "parametersNode", null);
        setField(term109358, term109358.getClass(), "returnType", null);
        setField(term109359, term109359.getClass(), "call", null);
        setField(term109359, term109359.getClass(), "prototype", null);
        setField(term109359, term109359.getClass(), "kind", null);
        setField(term109359, term109359.getClass(), "typeOfThis", null);
        setField(term109359, term109359.getClass(), "source", null);
        setField(term109359, term109359.getClass(), "implementedInterfaces", null);
        setField(term109359, term109359.getClass(), "subTypes", null);
        setField(term109359, term109359.getClass(), "templateTypeName", null);
        setField(term109359, term109359.getClass(), "className", null);
        setField(term109359, term109359.getClass(), "properties", null);
        setField(term109359, term109359.getClass(), "implicitPrototype", null);
        setBooleanField(term109359, term109359.getClass(), "nativeType", false);
        setBooleanField(term109359, term109359.getClass(), "prettyPrint", false);
        setBooleanField(term109359, term109359.getClass(), "visited", false);
        setField(term109359, term109359.getClass(), "docInfo", null);
        setBooleanField(term109359, term109359.getClass(), "unknown", false);
        setBooleanField(term109359, term109359.getClass(), "resolved", false);
        setField(term109359, term109359.getClass(), "resolveResult", null);
        setField(term109359, term109359.getClass(), "registry", null);
        setField(term109358, term109358.getClass(), "typeOfThis", term109359);
        setField(term109358, term109358.getClass(), "templateTypeName", null);
        setBooleanField(term109358, term109358.getClass(), "inferredReturnType", false);
        setBooleanField(term109358, term109358.getClass(), "isConstructor", true);
        setBooleanField(term109358, term109358.getClass(), "isNativeType", false);
        Class<? extends Object> term109667 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term109666 = ((Class) term109667).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term109666).setAccessible(true);
        Object enum157 = ((Field) term109666).get((Object) null);
        term109360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term109361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term109365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term109361, term109361.getClass(), "parameters", null);
        setField(term109361, term109361.getClass(), "returnType", null);
        setBooleanField(term109361, term109361.getClass(), "returnTypeInferred", false);
        setBooleanField(term109361, term109361.getClass(), "resolved", false);
        setField(term109361, term109361.getClass(), "resolveResult", null);
        setField(term109361, term109361.getClass(), "registry", null);
        setField(term109360, term109360.getClass(), "call", term109361);
        setField(term109360, term109360.getClass(), "prototype", null);
        setField(term109360, term109360.getClass(), "kind", enum157);
        setField(term109365, term109365.getClass(), "call", null);
        setField(term109365, term109365.getClass(), "prototype", null);
        setField(term109365, term109365.getClass(), "kind", null);
        setField(term109365, term109365.getClass(), "typeOfThis", null);
        setField(term109365, term109365.getClass(), "source", null);
        setField(term109365, term109365.getClass(), "implementedInterfaces", null);
        setField(term109365, term109365.getClass(), "subTypes", null);
        setField(term109365, term109365.getClass(), "templateTypeName", null);
        setField(term109365, term109365.getClass(), "className", null);
        setField(term109365, term109365.getClass(), "properties", null);
        setField(term109365, term109365.getClass(), "implicitPrototype", null);
        setBooleanField(term109365, term109365.getClass(), "nativeType", false);
        setBooleanField(term109365, term109365.getClass(), "prettyPrint", false);
        setBooleanField(term109365, term109365.getClass(), "visited", false);
        setField(term109365, term109365.getClass(), "docInfo", null);
        setBooleanField(term109365, term109365.getClass(), "unknown", false);
        setBooleanField(term109365, term109365.getClass(), "resolved", false);
        setField(term109365, term109365.getClass(), "resolveResult", null);
        setField(term109365, term109365.getClass(), "registry", null);
        setField(term109360, term109360.getClass(), "typeOfThis", term109365);
        setField(term109360, term109360.getClass(), "source", null);
        setField(term109360, term109360.getClass(), "implementedInterfaces", null);
        setField(term109360, term109360.getClass(), "subTypes", null);
        setField(term109360, term109360.getClass(), "templateTypeName", null);
        setField(term109360, term109360.getClass(), "className", null);
        setField(term109360, term109360.getClass(), "properties", null);
        setField(term109360, term109360.getClass(), "implicitPrototype", null);
        setBooleanField(term109360, term109360.getClass(), "nativeType", false);
        setBooleanField(term109360, term109360.getClass(), "prettyPrint", false);
        setBooleanField(term109360, term109360.getClass(), "visited", false);
        setField(term109360, term109360.getClass(), "docInfo", null);
        setBooleanField(term109360, term109360.getClass(), "unknown", false);
        setBooleanField(term109360, term109360.getClass(), "resolved", false);
        setField(term109360, term109360.getClass(), "resolveResult", null);
        setField(term109360, term109360.getClass(), "registry", null);
        term109354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term109325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term109354, term109354.getClass(), "registry", null);
        setField(term109354, term109354.getClass(), "name", null);
        setField(term109354, term109354.getClass(), "sourceNode", null);
        setField(term109354, term109354.getClass(), "parametersNode", null);
        setField(term109354, term109354.getClass(), "returnType", null);
        setField(term109325, term109325.getClass(), "call", null);
        setField(term109325, term109325.getClass(), "prototype", null);
        setField(term109325, term109325.getClass(), "kind", null);
        setField(term109325, term109325.getClass(), "typeOfThis", null);
        setField(term109325, term109325.getClass(), "source", null);
        setField(term109325, term109325.getClass(), "implementedInterfaces", null);
        setField(term109325, term109325.getClass(), "subTypes", null);
        setField(term109325, term109325.getClass(), "templateTypeName", null);
        setField(term109325, term109325.getClass(), "className", null);
        setField(term109325, term109325.getClass(), "properties", null);
        setField(term109325, term109325.getClass(), "implicitPrototype", null);
        setBooleanField(term109325, term109325.getClass(), "nativeType", false);
        setBooleanField(term109325, term109325.getClass(), "prettyPrint", false);
        setBooleanField(term109325, term109325.getClass(), "visited", false);
        setField(term109325, term109325.getClass(), "docInfo", null);
        setBooleanField(term109325, term109325.getClass(), "unknown", false);
        setBooleanField(term109325, term109325.getClass(), "resolved", false);
        setField(term109325, term109325.getClass(), "resolveResult", null);
        setField(term109325, term109325.getClass(), "registry", null);
        setField(term109354, term109354.getClass(), "typeOfThis", term109325);
        setField(term109354, term109354.getClass(), "templateTypeName", null);
        setBooleanField(term109354, term109354.getClass(), "inferredReturnType", false);
        setBooleanField(term109354, term109354.getClass(), "isConstructor", true);
        setBooleanField(term109354, term109354.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term108662;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term108514, args);
        assertTrue(recursiveEquals(term108514, term109358));
        assertTrue(recursiveEquals(term108662, term109360));
        assertTrue(recursiveEquals(retValue, term109354));
    }

};


