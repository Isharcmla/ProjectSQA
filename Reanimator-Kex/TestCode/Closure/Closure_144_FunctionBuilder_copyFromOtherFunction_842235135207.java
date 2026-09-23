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

public class FunctionBuilder_copyFromOtherFunction_842235135207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140743;
     Object term140851;
     Object term141124;
     Object term141128;
     Object term141118;

    public FunctionBuilder_copyFromOtherFunction_842235135207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term140743, term140743.getClass(), "name", null);
        setField(term140743, term140743.getClass(), "sourceNode", null);
        setField(term140743, term140743.getClass(), "parametersNode", null);
        setField(term140743, term140743.getClass(), "returnType", null);
        term140851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term140983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term141083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term140851, term140851.getClass(), "className", "");
        setField(term140851, term140851.getClass(), "source", null);
        setField(term140983, term140983.getClass(), "parameters", null);
        setField(term140983, term140983.getClass(), "returnType", null);
        setField(term140851, term140851.getClass(), "call", term140983);
        setField(term140851, term140851.getClass(), "typeOfThis", term141083);
        term141124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term141127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term141124, term141124.getClass(), "registry", null);
        setField(term141124, term141124.getClass(), "name", "");
        setField(term141124, term141124.getClass(), "sourceNode", null);
        setField(term141124, term141124.getClass(), "parametersNode", null);
        setField(term141124, term141124.getClass(), "returnType", null);
        setField(term141127, term141127.getClass(), "name", null);
        setField(term141127, term141127.getClass(), "referencedType", null);
        setBooleanField(term141127, term141127.getClass(), "visited", false);
        setField(term141127, term141127.getClass(), "docInfo", null);
        setBooleanField(term141127, term141127.getClass(), "unknown", false);
        setBooleanField(term141127, term141127.getClass(), "resolved", false);
        setField(term141127, term141127.getClass(), "resolveResult", null);
        setField(term141127, term141127.getClass(), "registry", null);
        setField(term141124, term141124.getClass(), "typeOfThis", term141127);
        setField(term141124, term141124.getClass(), "templateTypeName", null);
        setBooleanField(term141124, term141124.getClass(), "inferredReturnType", false);
        setBooleanField(term141124, term141124.getClass(), "isConstructor", false);
        setBooleanField(term141124, term141124.getClass(), "isNativeType", false);
        term141128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term141129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term141130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term141128, term141128.getClass(), "this$0", null);
        setField(term141129, term141129.getClass(), "parameters", null);
        setField(term141129, term141129.getClass(), "returnType", null);
        setBooleanField(term141129, term141129.getClass(), "returnTypeInferred", false);
        setBooleanField(term141129, term141129.getClass(), "resolved", false);
        setField(term141129, term141129.getClass(), "resolveResult", null);
        setField(term141129, term141129.getClass(), "registry", null);
        setField(term141128, term141128.getClass(), "call", term141129);
        setField(term141128, term141128.getClass(), "prototype", null);
        setField(term141128, term141128.getClass(), "kind", null);
        setField(term141130, term141130.getClass(), "name", null);
        setField(term141130, term141130.getClass(), "referencedType", null);
        setBooleanField(term141130, term141130.getClass(), "visited", false);
        setField(term141130, term141130.getClass(), "docInfo", null);
        setBooleanField(term141130, term141130.getClass(), "unknown", false);
        setBooleanField(term141130, term141130.getClass(), "resolved", false);
        setField(term141130, term141130.getClass(), "resolveResult", null);
        setField(term141130, term141130.getClass(), "registry", null);
        setField(term141128, term141128.getClass(), "typeOfThis", term141130);
        setField(term141128, term141128.getClass(), "source", null);
        setField(term141128, term141128.getClass(), "implementedInterfaces", null);
        setField(term141128, term141128.getClass(), "subTypes", null);
        setField(term141128, term141128.getClass(), "templateTypeName", null);
        setField(term141128, term141128.getClass(), "className", "");
        setField(term141128, term141128.getClass(), "properties", null);
        setField(term141128, term141128.getClass(), "implicitPrototype", null);
        setBooleanField(term141128, term141128.getClass(), "nativeType", false);
        setBooleanField(term141128, term141128.getClass(), "prettyPrint", false);
        setBooleanField(term141128, term141128.getClass(), "visited", false);
        setField(term141128, term141128.getClass(), "docInfo", null);
        setBooleanField(term141128, term141128.getClass(), "unknown", false);
        setBooleanField(term141128, term141128.getClass(), "resolved", false);
        setField(term141128, term141128.getClass(), "resolveResult", null);
        setField(term141128, term141128.getClass(), "registry", null);
        term141118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term141091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term141118, term141118.getClass(), "registry", null);
        setField(term141118, term141118.getClass(), "name", "");
        setField(term141118, term141118.getClass(), "sourceNode", null);
        setField(term141118, term141118.getClass(), "parametersNode", null);
        setField(term141118, term141118.getClass(), "returnType", null);
        setField(term141091, term141091.getClass(), "name", null);
        setField(term141091, term141091.getClass(), "referencedType", null);
        setBooleanField(term141091, term141091.getClass(), "visited", false);
        setField(term141091, term141091.getClass(), "docInfo", null);
        setBooleanField(term141091, term141091.getClass(), "unknown", false);
        setBooleanField(term141091, term141091.getClass(), "resolved", false);
        setField(term141091, term141091.getClass(), "resolveResult", null);
        setField(term141091, term141091.getClass(), "registry", null);
        setField(term141118, term141118.getClass(), "typeOfThis", term141091);
        setField(term141118, term141118.getClass(), "templateTypeName", null);
        setBooleanField(term141118, term141118.getClass(), "inferredReturnType", false);
        setBooleanField(term141118, term141118.getClass(), "isConstructor", false);
        setBooleanField(term141118, term141118.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term140851;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term140743, args);
        assertTrue(recursiveEquals(term140743, term141124));
        assertTrue(recursiveEquals(term140851, term141128));
        assertTrue(recursiveEquals(retValue, term141118));
    }

};


