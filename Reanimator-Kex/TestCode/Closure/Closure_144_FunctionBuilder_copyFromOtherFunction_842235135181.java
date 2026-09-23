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

public class FunctionBuilder_copyFromOtherFunction_842235135181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124410;
     Object term124520;
     Object term124703;
     Object term124710;
     Object term124697;

    public FunctionBuilder_copyFromOtherFunction_842235135181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term124410, term124410.getClass(), "name", null);
        setField(term124410, term124410.getClass(), "sourceNode", null);
        setField(term124410, term124410.getClass(), "parametersNode", null);
        setField(term124410, term124410.getClass(), "returnType", null);
        term124520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term124652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term124520, term124520.getClass(), "className", "");
        setField(term124520, term124520.getClass(), "source", null);
        setField(term124652, term124652.getClass(), "parameters", null);
        setField(term124652, term124652.getClass(), "returnType", null);
        setField(term124520, term124520.getClass(), "call", term124652);
        setField(term124520, term124520.getClass(), "typeOfThis", term124520);
        term124703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term124706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term124707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term124703, term124703.getClass(), "registry", null);
        setField(term124703, term124703.getClass(), "name", "");
        setField(term124703, term124703.getClass(), "sourceNode", null);
        setField(term124703, term124703.getClass(), "parametersNode", null);
        setField(term124703, term124703.getClass(), "returnType", null);
        setField(term124707, term124707.getClass(), "parameters", null);
        setField(term124707, term124707.getClass(), "returnType", null);
        setBooleanField(term124707, term124707.getClass(), "returnTypeInferred", false);
        setBooleanField(term124707, term124707.getClass(), "resolved", false);
        setField(term124707, term124707.getClass(), "resolveResult", null);
        setField(term124707, term124707.getClass(), "registry", null);
        setField(term124706, term124706.getClass(), "call", term124707);
        setField(term124706, term124706.getClass(), "prototype", null);
        setField(term124706, term124706.getClass(), "kind", null);
        setField(term124706, term124706.getClass(), "typeOfThis", term124706);
        setField(term124706, term124706.getClass(), "source", null);
        setField(term124706, term124706.getClass(), "implementedInterfaces", null);
        setField(term124706, term124706.getClass(), "subTypes", null);
        setField(term124706, term124706.getClass(), "templateTypeName", null);
        setField(term124706, term124706.getClass(), "className", "");
        setField(term124706, term124706.getClass(), "properties", null);
        setField(term124706, term124706.getClass(), "implicitPrototype", null);
        setBooleanField(term124706, term124706.getClass(), "nativeType", false);
        setBooleanField(term124706, term124706.getClass(), "prettyPrint", false);
        setBooleanField(term124706, term124706.getClass(), "visited", false);
        setField(term124706, term124706.getClass(), "docInfo", null);
        setBooleanField(term124706, term124706.getClass(), "unknown", false);
        setBooleanField(term124706, term124706.getClass(), "resolved", false);
        setField(term124706, term124706.getClass(), "resolveResult", null);
        setField(term124706, term124706.getClass(), "registry", null);
        setField(term124703, term124703.getClass(), "typeOfThis", term124706);
        setField(term124703, term124703.getClass(), "templateTypeName", null);
        setBooleanField(term124703, term124703.getClass(), "inferredReturnType", false);
        setBooleanField(term124703, term124703.getClass(), "isConstructor", false);
        setBooleanField(term124703, term124703.getClass(), "isNativeType", false);
        term124710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term124711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term124711, term124711.getClass(), "parameters", null);
        setField(term124711, term124711.getClass(), "returnType", null);
        setBooleanField(term124711, term124711.getClass(), "returnTypeInferred", false);
        setBooleanField(term124711, term124711.getClass(), "resolved", false);
        setField(term124711, term124711.getClass(), "resolveResult", null);
        setField(term124711, term124711.getClass(), "registry", null);
        setField(term124710, term124710.getClass(), "call", term124711);
        setField(term124710, term124710.getClass(), "prototype", null);
        setField(term124710, term124710.getClass(), "kind", null);
        setField(term124710, term124710.getClass(), "typeOfThis", term124710);
        setField(term124710, term124710.getClass(), "source", null);
        setField(term124710, term124710.getClass(), "implementedInterfaces", null);
        setField(term124710, term124710.getClass(), "subTypes", null);
        setField(term124710, term124710.getClass(), "templateTypeName", null);
        setField(term124710, term124710.getClass(), "className", "");
        setField(term124710, term124710.getClass(), "properties", null);
        setField(term124710, term124710.getClass(), "implicitPrototype", null);
        setBooleanField(term124710, term124710.getClass(), "nativeType", false);
        setBooleanField(term124710, term124710.getClass(), "prettyPrint", false);
        setBooleanField(term124710, term124710.getClass(), "visited", false);
        setField(term124710, term124710.getClass(), "docInfo", null);
        setBooleanField(term124710, term124710.getClass(), "unknown", false);
        setBooleanField(term124710, term124710.getClass(), "resolved", false);
        setField(term124710, term124710.getClass(), "resolveResult", null);
        setField(term124710, term124710.getClass(), "registry", null);
        term124697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term124656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term124657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term124697, term124697.getClass(), "registry", null);
        setField(term124697, term124697.getClass(), "name", "");
        setField(term124697, term124697.getClass(), "sourceNode", null);
        setField(term124697, term124697.getClass(), "parametersNode", null);
        setField(term124697, term124697.getClass(), "returnType", null);
        setField(term124657, term124657.getClass(), "parameters", null);
        setField(term124657, term124657.getClass(), "returnType", null);
        setBooleanField(term124657, term124657.getClass(), "returnTypeInferred", false);
        setBooleanField(term124657, term124657.getClass(), "resolved", false);
        setField(term124657, term124657.getClass(), "resolveResult", null);
        setField(term124657, term124657.getClass(), "registry", null);
        setField(term124656, term124656.getClass(), "call", term124657);
        setField(term124656, term124656.getClass(), "prototype", null);
        setField(term124656, term124656.getClass(), "kind", null);
        setField(term124656, term124656.getClass(), "typeOfThis", term124656);
        setField(term124656, term124656.getClass(), "source", null);
        setField(term124656, term124656.getClass(), "implementedInterfaces", null);
        setField(term124656, term124656.getClass(), "subTypes", null);
        setField(term124656, term124656.getClass(), "templateTypeName", null);
        setField(term124656, term124656.getClass(), "className", "");
        setField(term124656, term124656.getClass(), "properties", null);
        setField(term124656, term124656.getClass(), "implicitPrototype", null);
        setBooleanField(term124656, term124656.getClass(), "nativeType", false);
        setBooleanField(term124656, term124656.getClass(), "prettyPrint", false);
        setBooleanField(term124656, term124656.getClass(), "visited", false);
        setField(term124656, term124656.getClass(), "docInfo", null);
        setBooleanField(term124656, term124656.getClass(), "unknown", false);
        setBooleanField(term124656, term124656.getClass(), "resolved", false);
        setField(term124656, term124656.getClass(), "resolveResult", null);
        setField(term124656, term124656.getClass(), "registry", null);
        setField(term124697, term124697.getClass(), "typeOfThis", term124656);
        setField(term124697, term124697.getClass(), "templateTypeName", null);
        setBooleanField(term124697, term124697.getClass(), "inferredReturnType", false);
        setBooleanField(term124697, term124697.getClass(), "isConstructor", false);
        setBooleanField(term124697, term124697.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term124520;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term124410, args);
        assertTrue(recursiveEquals(term124410, term124703));
        assertTrue(recursiveEquals(term124520, term124710));
        assertTrue(recursiveEquals(retValue, term124697));
    }

};


