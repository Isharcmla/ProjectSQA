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

public class FunctionBuilder_copyFromOtherFunction_842235135217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149731;
     Object term149879;
     Object term150656;
     Object term150660;
     Object term150641;

    public FunctionBuilder_copyFromOtherFunction_842235135217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term149731, term149731.getClass(), "name", "INTERFACE");
        setField(term149731, term149731.getClass(), "sourceNode", null);
        setField(term149731, term149731.getClass(), "parametersNode", null);
        setField(term149731, term149731.getClass(), "returnType", null);
        setField(term149731, term149731.getClass(), "typeOfThis", null);
        setField(term149731, term149731.getClass(), "templateTypeName", null);
        Class<? extends Object> term150687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150686 = ((Class) term150687).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term150686).setAccessible(true);
        Object enum206 = ((Field) term150686).get((Object) null);
        term149879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term149992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term150098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term149879, term149879.getClass(), "className", "INTERFACE");
        setField(term149879, term149879.getClass(), "source", null);
        setField(term149992, term149992.getClass(), "parameters", null);
        setField(term149992, term149992.getClass(), "returnType", null);
        setField(term149879, term149879.getClass(), "call", term149992);
        setField(term149879, term149879.getClass(), "typeOfThis", term150098);
        setField(term149879, term149879.getClass(), "templateTypeName", null);
        setField(term149879, term149879.getClass(), "kind", enum206);
        term150656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term150659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term150656, term150656.getClass(), "registry", null);
        setField(term150656, term150656.getClass(), "name", "INTERFACE");
        setField(term150656, term150656.getClass(), "sourceNode", null);
        setField(term150656, term150656.getClass(), "parametersNode", null);
        setField(term150656, term150656.getClass(), "returnType", null);
        setField(term150659, term150659.getClass(), "primitiveType", null);
        setField(term150659, term150659.getClass(), "primitiveObjectType", null);
        setField(term150659, term150659.getClass(), "name", null);
        setBooleanField(term150659, term150659.getClass(), "visited", false);
        setField(term150659, term150659.getClass(), "docInfo", null);
        setBooleanField(term150659, term150659.getClass(), "unknown", false);
        setBooleanField(term150659, term150659.getClass(), "resolved", false);
        setField(term150659, term150659.getClass(), "resolveResult", null);
        setField(term150659, term150659.getClass(), "registry", null);
        setField(term150656, term150656.getClass(), "typeOfThis", term150659);
        setField(term150656, term150656.getClass(), "templateTypeName", null);
        setBooleanField(term150656, term150656.getClass(), "inferredReturnType", false);
        setBooleanField(term150656, term150656.getClass(), "isConstructor", true);
        setBooleanField(term150656, term150656.getClass(), "isNativeType", false);
        Class<? extends Object> term150996 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150995 = ((Class) term150996).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term150995).setAccessible(true);
        Object enum207 = ((Field) term150995).get((Object) null);
        term150660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term150661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term150665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term150661, term150661.getClass(), "parameters", null);
        setField(term150661, term150661.getClass(), "returnType", null);
        setBooleanField(term150661, term150661.getClass(), "returnTypeInferred", false);
        setBooleanField(term150661, term150661.getClass(), "resolved", false);
        setField(term150661, term150661.getClass(), "resolveResult", null);
        setField(term150661, term150661.getClass(), "registry", null);
        setField(term150660, term150660.getClass(), "call", term150661);
        setField(term150660, term150660.getClass(), "prototype", null);
        setField(term150660, term150660.getClass(), "kind", enum207);
        setField(term150665, term150665.getClass(), "primitiveType", null);
        setField(term150665, term150665.getClass(), "primitiveObjectType", null);
        setField(term150665, term150665.getClass(), "name", null);
        setBooleanField(term150665, term150665.getClass(), "visited", false);
        setField(term150665, term150665.getClass(), "docInfo", null);
        setBooleanField(term150665, term150665.getClass(), "unknown", false);
        setBooleanField(term150665, term150665.getClass(), "resolved", false);
        setField(term150665, term150665.getClass(), "resolveResult", null);
        setField(term150665, term150665.getClass(), "registry", null);
        setField(term150660, term150660.getClass(), "typeOfThis", term150665);
        setField(term150660, term150660.getClass(), "source", null);
        setField(term150660, term150660.getClass(), "implementedInterfaces", null);
        setField(term150660, term150660.getClass(), "subTypes", null);
        setField(term150660, term150660.getClass(), "templateTypeName", null);
        setField(term150660, term150660.getClass(), "className", "INTERFACE");
        setField(term150660, term150660.getClass(), "properties", null);
        setField(term150660, term150660.getClass(), "implicitPrototype", null);
        setBooleanField(term150660, term150660.getClass(), "nativeType", false);
        setBooleanField(term150660, term150660.getClass(), "prettyPrint", false);
        setBooleanField(term150660, term150660.getClass(), "visited", false);
        setField(term150660, term150660.getClass(), "docInfo", null);
        setBooleanField(term150660, term150660.getClass(), "unknown", false);
        setBooleanField(term150660, term150660.getClass(), "resolved", false);
        setField(term150660, term150660.getClass(), "resolveResult", null);
        setField(term150660, term150660.getClass(), "registry", null);
        term150641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term150596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term150641, term150641.getClass(), "registry", null);
        setField(term150641, term150641.getClass(), "name", "INTERFACE");
        setField(term150641, term150641.getClass(), "sourceNode", null);
        setField(term150641, term150641.getClass(), "parametersNode", null);
        setField(term150641, term150641.getClass(), "returnType", null);
        setField(term150596, term150596.getClass(), "primitiveType", null);
        setField(term150596, term150596.getClass(), "primitiveObjectType", null);
        setField(term150596, term150596.getClass(), "name", null);
        setBooleanField(term150596, term150596.getClass(), "visited", false);
        setField(term150596, term150596.getClass(), "docInfo", null);
        setBooleanField(term150596, term150596.getClass(), "unknown", false);
        setBooleanField(term150596, term150596.getClass(), "resolved", false);
        setField(term150596, term150596.getClass(), "resolveResult", null);
        setField(term150596, term150596.getClass(), "registry", null);
        setField(term150641, term150641.getClass(), "typeOfThis", term150596);
        setField(term150641, term150641.getClass(), "templateTypeName", null);
        setBooleanField(term150641, term150641.getClass(), "inferredReturnType", false);
        setBooleanField(term150641, term150641.getClass(), "isConstructor", true);
        setBooleanField(term150641, term150641.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term149879;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term149731, args);
        assertTrue(recursiveEquals(term149731, term150656));
        assertTrue(recursiveEquals(term149879, term150660));
        assertTrue(recursiveEquals(retValue, term150641));
    }

};


