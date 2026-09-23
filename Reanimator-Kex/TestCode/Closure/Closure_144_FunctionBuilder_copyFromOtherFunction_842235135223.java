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

public class FunctionBuilder_copyFromOtherFunction_842235135223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156351;
     Object term156497;
     Object term157268;
     Object term157272;
     Object term157253;

    public FunctionBuilder_copyFromOtherFunction_842235135223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term156351, term156351.getClass(), "name", "INTERFACE");
        setField(term156351, term156351.getClass(), "sourceNode", null);
        setField(term156351, term156351.getClass(), "parametersNode", null);
        setField(term156351, term156351.getClass(), "returnType", null);
        setField(term156351, term156351.getClass(), "typeOfThis", null);
        setField(term156351, term156351.getClass(), "templateTypeName", null);
        Class<? extends Object> term157299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term157298 = ((Class) term157299).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term157298).setAccessible(true);
        Object enum212 = ((Field) term157298).get((Object) null);
        term156497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term156610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term156710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term156497, term156497.getClass(), "className", "INTERFACE");
        setField(term156497, term156497.getClass(), "source", null);
        setField(term156610, term156610.getClass(), "parameters", null);
        setField(term156610, term156610.getClass(), "returnType", null);
        setField(term156497, term156497.getClass(), "call", term156610);
        setField(term156497, term156497.getClass(), "typeOfThis", term156710);
        setField(term156497, term156497.getClass(), "templateTypeName", null);
        setField(term156497, term156497.getClass(), "kind", enum212);
        term157268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term157271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term157268, term157268.getClass(), "registry", null);
        setField(term157268, term157268.getClass(), "name", "INTERFACE");
        setField(term157268, term157268.getClass(), "sourceNode", null);
        setField(term157268, term157268.getClass(), "parametersNode", null);
        setField(term157268, term157268.getClass(), "returnType", null);
        setField(term157271, term157271.getClass(), "name", null);
        setField(term157271, term157271.getClass(), "referencedType", null);
        setBooleanField(term157271, term157271.getClass(), "visited", false);
        setField(term157271, term157271.getClass(), "docInfo", null);
        setBooleanField(term157271, term157271.getClass(), "unknown", false);
        setBooleanField(term157271, term157271.getClass(), "resolved", false);
        setField(term157271, term157271.getClass(), "resolveResult", null);
        setField(term157271, term157271.getClass(), "registry", null);
        setField(term157268, term157268.getClass(), "typeOfThis", term157271);
        setField(term157268, term157268.getClass(), "templateTypeName", null);
        setBooleanField(term157268, term157268.getClass(), "inferredReturnType", false);
        setBooleanField(term157268, term157268.getClass(), "isConstructor", true);
        setBooleanField(term157268, term157268.getClass(), "isNativeType", false);
        Class<? extends Object> term157608 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term157607 = ((Class) term157608).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term157607).setAccessible(true);
        Object enum213 = ((Field) term157607).get((Object) null);
        term157272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term157273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term157277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term157272, term157272.getClass(), "this$0", null);
        setField(term157273, term157273.getClass(), "parameters", null);
        setField(term157273, term157273.getClass(), "returnType", null);
        setBooleanField(term157273, term157273.getClass(), "returnTypeInferred", false);
        setBooleanField(term157273, term157273.getClass(), "resolved", false);
        setField(term157273, term157273.getClass(), "resolveResult", null);
        setField(term157273, term157273.getClass(), "registry", null);
        setField(term157272, term157272.getClass(), "call", term157273);
        setField(term157272, term157272.getClass(), "prototype", null);
        setField(term157272, term157272.getClass(), "kind", enum213);
        setField(term157277, term157277.getClass(), "name", null);
        setField(term157277, term157277.getClass(), "referencedType", null);
        setBooleanField(term157277, term157277.getClass(), "visited", false);
        setField(term157277, term157277.getClass(), "docInfo", null);
        setBooleanField(term157277, term157277.getClass(), "unknown", false);
        setBooleanField(term157277, term157277.getClass(), "resolved", false);
        setField(term157277, term157277.getClass(), "resolveResult", null);
        setField(term157277, term157277.getClass(), "registry", null);
        setField(term157272, term157272.getClass(), "typeOfThis", term157277);
        setField(term157272, term157272.getClass(), "source", null);
        setField(term157272, term157272.getClass(), "implementedInterfaces", null);
        setField(term157272, term157272.getClass(), "subTypes", null);
        setField(term157272, term157272.getClass(), "templateTypeName", null);
        setField(term157272, term157272.getClass(), "className", "INTERFACE");
        setField(term157272, term157272.getClass(), "properties", null);
        setField(term157272, term157272.getClass(), "implicitPrototype", null);
        setBooleanField(term157272, term157272.getClass(), "nativeType", false);
        setBooleanField(term157272, term157272.getClass(), "prettyPrint", false);
        setBooleanField(term157272, term157272.getClass(), "visited", false);
        setField(term157272, term157272.getClass(), "docInfo", null);
        setBooleanField(term157272, term157272.getClass(), "unknown", false);
        setBooleanField(term157272, term157272.getClass(), "resolved", false);
        setField(term157272, term157272.getClass(), "resolveResult", null);
        setField(term157272, term157272.getClass(), "registry", null);
        term157253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term157208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term157253, term157253.getClass(), "registry", null);
        setField(term157253, term157253.getClass(), "name", "INTERFACE");
        setField(term157253, term157253.getClass(), "sourceNode", null);
        setField(term157253, term157253.getClass(), "parametersNode", null);
        setField(term157253, term157253.getClass(), "returnType", null);
        setField(term157208, term157208.getClass(), "name", null);
        setField(term157208, term157208.getClass(), "referencedType", null);
        setBooleanField(term157208, term157208.getClass(), "visited", false);
        setField(term157208, term157208.getClass(), "docInfo", null);
        setBooleanField(term157208, term157208.getClass(), "unknown", false);
        setBooleanField(term157208, term157208.getClass(), "resolved", false);
        setField(term157208, term157208.getClass(), "resolveResult", null);
        setField(term157208, term157208.getClass(), "registry", null);
        setField(term157253, term157253.getClass(), "typeOfThis", term157208);
        setField(term157253, term157253.getClass(), "templateTypeName", null);
        setBooleanField(term157253, term157253.getClass(), "inferredReturnType", false);
        setBooleanField(term157253, term157253.getClass(), "isConstructor", true);
        setBooleanField(term157253, term157253.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term156497;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term156351, args);
        assertTrue(recursiveEquals(term156351, term157268));
        assertTrue(recursiveEquals(term156497, term157272));
        assertTrue(recursiveEquals(retValue, term157253));
    }

};


