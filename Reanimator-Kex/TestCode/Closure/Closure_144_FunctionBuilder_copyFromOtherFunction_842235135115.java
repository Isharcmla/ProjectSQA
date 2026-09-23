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

public class FunctionBuilder_copyFromOtherFunction_842235135115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83491;
     Object term83591;
     Object term83888;
     Object term83892;
     Object term83882;

    public FunctionBuilder_copyFromOtherFunction_842235135115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term83491, term83491.getClass(), "name", null);
        setField(term83491, term83491.getClass(), "sourceNode", null);
        setField(term83491, term83491.getClass(), "parametersNode", null);
        setField(term83491, term83491.getClass(), "returnType", null);
        term83591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term83723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term83841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term83591, term83591.getClass(), "className", "");
        setField(term83591, term83591.getClass(), "source", null);
        setField(term83723, term83723.getClass(), "parameters", null);
        setField(term83723, term83723.getClass(), "returnType", null);
        setField(term83591, term83591.getClass(), "call", term83723);
        setField(term83591, term83591.getClass(), "typeOfThis", term83841);
        term83888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term83891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term83888, term83888.getClass(), "registry", null);
        setField(term83888, term83888.getClass(), "name", "");
        setField(term83888, term83888.getClass(), "sourceNode", null);
        setField(term83888, term83888.getClass(), "parametersNode", null);
        setField(term83888, term83888.getClass(), "returnType", null);
        setField(term83891, term83891.getClass(), "ownerFunction", null);
        setField(term83891, term83891.getClass(), "className", null);
        setField(term83891, term83891.getClass(), "properties", null);
        setField(term83891, term83891.getClass(), "implicitPrototype", null);
        setBooleanField(term83891, term83891.getClass(), "nativeType", false);
        setBooleanField(term83891, term83891.getClass(), "prettyPrint", false);
        setBooleanField(term83891, term83891.getClass(), "visited", false);
        setField(term83891, term83891.getClass(), "docInfo", null);
        setBooleanField(term83891, term83891.getClass(), "unknown", false);
        setBooleanField(term83891, term83891.getClass(), "resolved", false);
        setField(term83891, term83891.getClass(), "resolveResult", null);
        setField(term83891, term83891.getClass(), "registry", null);
        setField(term83888, term83888.getClass(), "typeOfThis", term83891);
        setField(term83888, term83888.getClass(), "templateTypeName", null);
        setBooleanField(term83888, term83888.getClass(), "inferredReturnType", false);
        setBooleanField(term83888, term83888.getClass(), "isConstructor", false);
        setBooleanField(term83888, term83888.getClass(), "isNativeType", false);
        term83892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term83893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term83894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term83893, term83893.getClass(), "parameters", null);
        setField(term83893, term83893.getClass(), "returnType", null);
        setBooleanField(term83893, term83893.getClass(), "returnTypeInferred", false);
        setBooleanField(term83893, term83893.getClass(), "resolved", false);
        setField(term83893, term83893.getClass(), "resolveResult", null);
        setField(term83893, term83893.getClass(), "registry", null);
        setField(term83892, term83892.getClass(), "call", term83893);
        setField(term83892, term83892.getClass(), "prototype", null);
        setField(term83892, term83892.getClass(), "kind", null);
        setField(term83894, term83894.getClass(), "ownerFunction", null);
        setField(term83894, term83894.getClass(), "className", null);
        setField(term83894, term83894.getClass(), "properties", null);
        setField(term83894, term83894.getClass(), "implicitPrototype", null);
        setBooleanField(term83894, term83894.getClass(), "nativeType", false);
        setBooleanField(term83894, term83894.getClass(), "prettyPrint", false);
        setBooleanField(term83894, term83894.getClass(), "visited", false);
        setField(term83894, term83894.getClass(), "docInfo", null);
        setBooleanField(term83894, term83894.getClass(), "unknown", false);
        setBooleanField(term83894, term83894.getClass(), "resolved", false);
        setField(term83894, term83894.getClass(), "resolveResult", null);
        setField(term83894, term83894.getClass(), "registry", null);
        setField(term83892, term83892.getClass(), "typeOfThis", term83894);
        setField(term83892, term83892.getClass(), "source", null);
        setField(term83892, term83892.getClass(), "implementedInterfaces", null);
        setField(term83892, term83892.getClass(), "subTypes", null);
        setField(term83892, term83892.getClass(), "templateTypeName", null);
        setField(term83892, term83892.getClass(), "className", "");
        setField(term83892, term83892.getClass(), "properties", null);
        setField(term83892, term83892.getClass(), "implicitPrototype", null);
        setBooleanField(term83892, term83892.getClass(), "nativeType", false);
        setBooleanField(term83892, term83892.getClass(), "prettyPrint", false);
        setBooleanField(term83892, term83892.getClass(), "visited", false);
        setField(term83892, term83892.getClass(), "docInfo", null);
        setBooleanField(term83892, term83892.getClass(), "unknown", false);
        setBooleanField(term83892, term83892.getClass(), "resolved", false);
        setField(term83892, term83892.getClass(), "resolveResult", null);
        setField(term83892, term83892.getClass(), "registry", null);
        term83882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term83849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term83882, term83882.getClass(), "registry", null);
        setField(term83882, term83882.getClass(), "name", "");
        setField(term83882, term83882.getClass(), "sourceNode", null);
        setField(term83882, term83882.getClass(), "parametersNode", null);
        setField(term83882, term83882.getClass(), "returnType", null);
        setField(term83849, term83849.getClass(), "ownerFunction", null);
        setField(term83849, term83849.getClass(), "className", null);
        setField(term83849, term83849.getClass(), "properties", null);
        setField(term83849, term83849.getClass(), "implicitPrototype", null);
        setBooleanField(term83849, term83849.getClass(), "nativeType", false);
        setBooleanField(term83849, term83849.getClass(), "prettyPrint", false);
        setBooleanField(term83849, term83849.getClass(), "visited", false);
        setField(term83849, term83849.getClass(), "docInfo", null);
        setBooleanField(term83849, term83849.getClass(), "unknown", false);
        setBooleanField(term83849, term83849.getClass(), "resolved", false);
        setField(term83849, term83849.getClass(), "resolveResult", null);
        setField(term83849, term83849.getClass(), "registry", null);
        setField(term83882, term83882.getClass(), "typeOfThis", term83849);
        setField(term83882, term83882.getClass(), "templateTypeName", null);
        setBooleanField(term83882, term83882.getClass(), "inferredReturnType", false);
        setBooleanField(term83882, term83882.getClass(), "isConstructor", false);
        setBooleanField(term83882, term83882.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term83591;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term83491, args);
        assertTrue(recursiveEquals(term83491, term83888));
        assertTrue(recursiveEquals(term83591, term83892));
        assertTrue(recursiveEquals(retValue, term83882));
    }

};


