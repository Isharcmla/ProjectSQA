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

public class FunctionBuilder_copyFromOtherFunction_842235135195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133398;
     Object term133546;
     Object term134315;
     Object term134319;
     Object term134300;

    public FunctionBuilder_copyFromOtherFunction_842235135195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term133398, term133398.getClass(), "name", "INTERFACE");
        setField(term133398, term133398.getClass(), "sourceNode", null);
        setField(term133398, term133398.getClass(), "parametersNode", null);
        setField(term133398, term133398.getClass(), "returnType", null);
        setField(term133398, term133398.getClass(), "typeOfThis", null);
        setField(term133398, term133398.getClass(), "templateTypeName", null);
        Class<? extends Object> term134346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134345 = ((Class) term134346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134345).setAccessible(true);
        Object enum186 = ((Field) term134345).get((Object) null);
        term133546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term133659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term133757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term133546, term133546.getClass(), "className", "INTERFACE");
        setField(term133546, term133546.getClass(), "source", null);
        setField(term133659, term133659.getClass(), "parameters", null);
        setField(term133659, term133659.getClass(), "returnType", null);
        setField(term133546, term133546.getClass(), "call", term133659);
        setField(term133546, term133546.getClass(), "typeOfThis", term133757);
        setField(term133546, term133546.getClass(), "templateTypeName", null);
        setField(term133546, term133546.getClass(), "kind", enum186);
        term134315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term134318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term134315, term134315.getClass(), "registry", null);
        setField(term134315, term134315.getClass(), "name", "INTERFACE");
        setField(term134315, term134315.getClass(), "sourceNode", null);
        setField(term134315, term134315.getClass(), "parametersNode", null);
        setField(term134315, term134315.getClass(), "returnType", null);
        setField(term134318, term134318.getClass(), "indexType", null);
        setField(term134318, term134318.getClass(), "referencedType", null);
        setBooleanField(term134318, term134318.getClass(), "visited", false);
        setField(term134318, term134318.getClass(), "docInfo", null);
        setBooleanField(term134318, term134318.getClass(), "unknown", false);
        setBooleanField(term134318, term134318.getClass(), "resolved", false);
        setField(term134318, term134318.getClass(), "resolveResult", null);
        setField(term134318, term134318.getClass(), "registry", null);
        setField(term134315, term134315.getClass(), "typeOfThis", term134318);
        setField(term134315, term134315.getClass(), "templateTypeName", null);
        setBooleanField(term134315, term134315.getClass(), "inferredReturnType", false);
        setBooleanField(term134315, term134315.getClass(), "isConstructor", true);
        setBooleanField(term134315, term134315.getClass(), "isNativeType", false);
        Class<? extends Object> term134655 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134654 = ((Class) term134655).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134654).setAccessible(true);
        Object enum187 = ((Field) term134654).get((Object) null);
        term134319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term134320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term134324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term134320, term134320.getClass(), "parameters", null);
        setField(term134320, term134320.getClass(), "returnType", null);
        setBooleanField(term134320, term134320.getClass(), "returnTypeInferred", false);
        setBooleanField(term134320, term134320.getClass(), "resolved", false);
        setField(term134320, term134320.getClass(), "resolveResult", null);
        setField(term134320, term134320.getClass(), "registry", null);
        setField(term134319, term134319.getClass(), "call", term134320);
        setField(term134319, term134319.getClass(), "prototype", null);
        setField(term134319, term134319.getClass(), "kind", enum187);
        setField(term134324, term134324.getClass(), "indexType", null);
        setField(term134324, term134324.getClass(), "referencedType", null);
        setBooleanField(term134324, term134324.getClass(), "visited", false);
        setField(term134324, term134324.getClass(), "docInfo", null);
        setBooleanField(term134324, term134324.getClass(), "unknown", false);
        setBooleanField(term134324, term134324.getClass(), "resolved", false);
        setField(term134324, term134324.getClass(), "resolveResult", null);
        setField(term134324, term134324.getClass(), "registry", null);
        setField(term134319, term134319.getClass(), "typeOfThis", term134324);
        setField(term134319, term134319.getClass(), "source", null);
        setField(term134319, term134319.getClass(), "implementedInterfaces", null);
        setField(term134319, term134319.getClass(), "subTypes", null);
        setField(term134319, term134319.getClass(), "templateTypeName", null);
        setField(term134319, term134319.getClass(), "className", "INTERFACE");
        setField(term134319, term134319.getClass(), "properties", null);
        setField(term134319, term134319.getClass(), "implicitPrototype", null);
        setBooleanField(term134319, term134319.getClass(), "nativeType", false);
        setBooleanField(term134319, term134319.getClass(), "prettyPrint", false);
        setBooleanField(term134319, term134319.getClass(), "visited", false);
        setField(term134319, term134319.getClass(), "docInfo", null);
        setBooleanField(term134319, term134319.getClass(), "unknown", false);
        setBooleanField(term134319, term134319.getClass(), "resolved", false);
        setField(term134319, term134319.getClass(), "resolveResult", null);
        setField(term134319, term134319.getClass(), "registry", null);
        term134300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term134255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term134300, term134300.getClass(), "registry", null);
        setField(term134300, term134300.getClass(), "name", "INTERFACE");
        setField(term134300, term134300.getClass(), "sourceNode", null);
        setField(term134300, term134300.getClass(), "parametersNode", null);
        setField(term134300, term134300.getClass(), "returnType", null);
        setField(term134255, term134255.getClass(), "indexType", null);
        setField(term134255, term134255.getClass(), "referencedType", null);
        setBooleanField(term134255, term134255.getClass(), "visited", false);
        setField(term134255, term134255.getClass(), "docInfo", null);
        setBooleanField(term134255, term134255.getClass(), "unknown", false);
        setBooleanField(term134255, term134255.getClass(), "resolved", false);
        setField(term134255, term134255.getClass(), "resolveResult", null);
        setField(term134255, term134255.getClass(), "registry", null);
        setField(term134300, term134300.getClass(), "typeOfThis", term134255);
        setField(term134300, term134300.getClass(), "templateTypeName", null);
        setBooleanField(term134300, term134300.getClass(), "inferredReturnType", false);
        setBooleanField(term134300, term134300.getClass(), "isConstructor", true);
        setBooleanField(term134300, term134300.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term133546;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term133398, args);
        assertTrue(recursiveEquals(term133398, term134315));
        assertTrue(recursiveEquals(term133546, term134319));
        assertTrue(recursiveEquals(retValue, term134300));
    }

};


