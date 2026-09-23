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

public class FunctionBuilder_copyFromOtherFunction_84223513557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49473;
     Object term49719;
     Object term50086;
     Object term50089;
     Object term50082;

    public FunctionBuilder_copyFromOtherFunction_84223513557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term49619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term49473, term49473.getClass(), "name", "");
        setField(term49473, term49473.getClass(), "sourceNode", null);
        setField(term49473, term49473.getClass(), "parametersNode", null);
        setField(term49473, term49473.getClass(), "returnType", term49619);
        term49719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term49813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term49931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term50041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term49719, term49719.getClass(), "className", null);
        setField(term49719, term49719.getClass(), "source", null);
        setField(term49813, term49813.getClass(), "parameters", null);
        setField(term49813, term49813.getClass(), "returnType", term49931);
        setField(term49719, term49719.getClass(), "call", term49813);
        setField(term49719, term49719.getClass(), "typeOfThis", term50041);
        term50086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term50087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term50088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term50086, term50086.getClass(), "registry", null);
        setField(term50086, term50086.getClass(), "name", null);
        setField(term50086, term50086.getClass(), "sourceNode", null);
        setField(term50086, term50086.getClass(), "parametersNode", null);
        setField(term50087, term50087.getClass(), "ownerFunction", null);
        setField(term50087, term50087.getClass(), "className", null);
        setField(term50087, term50087.getClass(), "properties", null);
        setField(term50087, term50087.getClass(), "implicitPrototype", null);
        setBooleanField(term50087, term50087.getClass(), "nativeType", false);
        setBooleanField(term50087, term50087.getClass(), "prettyPrint", false);
        setBooleanField(term50087, term50087.getClass(), "visited", false);
        setField(term50087, term50087.getClass(), "docInfo", null);
        setBooleanField(term50087, term50087.getClass(), "unknown", false);
        setBooleanField(term50087, term50087.getClass(), "resolved", false);
        setField(term50087, term50087.getClass(), "resolveResult", null);
        setField(term50087, term50087.getClass(), "registry", null);
        setField(term50086, term50086.getClass(), "returnType", term50087);
        setField(term50088, term50088.getClass(), "parameterType", null);
        setField(term50088, term50088.getClass(), "referencedType", null);
        setBooleanField(term50088, term50088.getClass(), "visited", false);
        setField(term50088, term50088.getClass(), "docInfo", null);
        setBooleanField(term50088, term50088.getClass(), "unknown", false);
        setBooleanField(term50088, term50088.getClass(), "resolved", false);
        setField(term50088, term50088.getClass(), "resolveResult", null);
        setField(term50088, term50088.getClass(), "registry", null);
        setField(term50086, term50086.getClass(), "typeOfThis", term50088);
        setField(term50086, term50086.getClass(), "templateTypeName", null);
        setBooleanField(term50086, term50086.getClass(), "inferredReturnType", false);
        setBooleanField(term50086, term50086.getClass(), "isConstructor", false);
        setBooleanField(term50086, term50086.getClass(), "isNativeType", false);
        term50089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term50090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term50091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term50092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term50090, term50090.getClass(), "parameters", null);
        setField(term50091, term50091.getClass(), "ownerFunction", null);
        setField(term50091, term50091.getClass(), "className", null);
        setField(term50091, term50091.getClass(), "properties", null);
        setField(term50091, term50091.getClass(), "implicitPrototype", null);
        setBooleanField(term50091, term50091.getClass(), "nativeType", false);
        setBooleanField(term50091, term50091.getClass(), "prettyPrint", false);
        setBooleanField(term50091, term50091.getClass(), "visited", false);
        setField(term50091, term50091.getClass(), "docInfo", null);
        setBooleanField(term50091, term50091.getClass(), "unknown", false);
        setBooleanField(term50091, term50091.getClass(), "resolved", false);
        setField(term50091, term50091.getClass(), "resolveResult", null);
        setField(term50091, term50091.getClass(), "registry", null);
        setField(term50090, term50090.getClass(), "returnType", term50091);
        setBooleanField(term50090, term50090.getClass(), "returnTypeInferred", false);
        setBooleanField(term50090, term50090.getClass(), "resolved", false);
        setField(term50090, term50090.getClass(), "resolveResult", null);
        setField(term50090, term50090.getClass(), "registry", null);
        setField(term50089, term50089.getClass(), "call", term50090);
        setField(term50089, term50089.getClass(), "prototype", null);
        setField(term50089, term50089.getClass(), "kind", null);
        setField(term50092, term50092.getClass(), "parameterType", null);
        setField(term50092, term50092.getClass(), "referencedType", null);
        setBooleanField(term50092, term50092.getClass(), "visited", false);
        setField(term50092, term50092.getClass(), "docInfo", null);
        setBooleanField(term50092, term50092.getClass(), "unknown", false);
        setBooleanField(term50092, term50092.getClass(), "resolved", false);
        setField(term50092, term50092.getClass(), "resolveResult", null);
        setField(term50092, term50092.getClass(), "registry", null);
        setField(term50089, term50089.getClass(), "typeOfThis", term50092);
        setField(term50089, term50089.getClass(), "source", null);
        setField(term50089, term50089.getClass(), "implementedInterfaces", null);
        setField(term50089, term50089.getClass(), "subTypes", null);
        setField(term50089, term50089.getClass(), "templateTypeName", null);
        setField(term50089, term50089.getClass(), "className", null);
        setField(term50089, term50089.getClass(), "properties", null);
        setField(term50089, term50089.getClass(), "implicitPrototype", null);
        setBooleanField(term50089, term50089.getClass(), "nativeType", false);
        setBooleanField(term50089, term50089.getClass(), "prettyPrint", false);
        setBooleanField(term50089, term50089.getClass(), "visited", false);
        setField(term50089, term50089.getClass(), "docInfo", null);
        setBooleanField(term50089, term50089.getClass(), "unknown", false);
        setBooleanField(term50089, term50089.getClass(), "resolved", false);
        setField(term50089, term50089.getClass(), "resolveResult", null);
        setField(term50089, term50089.getClass(), "registry", null);
        term50082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term50045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term50053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term50082, term50082.getClass(), "registry", null);
        setField(term50082, term50082.getClass(), "name", null);
        setField(term50082, term50082.getClass(), "sourceNode", null);
        setField(term50082, term50082.getClass(), "parametersNode", null);
        setField(term50045, term50045.getClass(), "ownerFunction", null);
        setField(term50045, term50045.getClass(), "className", null);
        setField(term50045, term50045.getClass(), "properties", null);
        setField(term50045, term50045.getClass(), "implicitPrototype", null);
        setBooleanField(term50045, term50045.getClass(), "nativeType", false);
        setBooleanField(term50045, term50045.getClass(), "prettyPrint", false);
        setBooleanField(term50045, term50045.getClass(), "visited", false);
        setField(term50045, term50045.getClass(), "docInfo", null);
        setBooleanField(term50045, term50045.getClass(), "unknown", false);
        setBooleanField(term50045, term50045.getClass(), "resolved", false);
        setField(term50045, term50045.getClass(), "resolveResult", null);
        setField(term50045, term50045.getClass(), "registry", null);
        setField(term50082, term50082.getClass(), "returnType", term50045);
        setField(term50053, term50053.getClass(), "parameterType", null);
        setField(term50053, term50053.getClass(), "referencedType", null);
        setBooleanField(term50053, term50053.getClass(), "visited", false);
        setField(term50053, term50053.getClass(), "docInfo", null);
        setBooleanField(term50053, term50053.getClass(), "unknown", false);
        setBooleanField(term50053, term50053.getClass(), "resolved", false);
        setField(term50053, term50053.getClass(), "resolveResult", null);
        setField(term50053, term50053.getClass(), "registry", null);
        setField(term50082, term50082.getClass(), "typeOfThis", term50053);
        setField(term50082, term50082.getClass(), "templateTypeName", null);
        setBooleanField(term50082, term50082.getClass(), "inferredReturnType", false);
        setBooleanField(term50082, term50082.getClass(), "isConstructor", false);
        setBooleanField(term50082, term50082.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term49719;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term49473, args);
        assertTrue(recursiveEquals(term49473, term50086));
        assertTrue(recursiveEquals(term49719, term50089));
        assertTrue(recursiveEquals(retValue, term50082));
    }

};


