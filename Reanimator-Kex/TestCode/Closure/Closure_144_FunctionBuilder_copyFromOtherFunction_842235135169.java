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

public class FunctionBuilder_copyFromOtherFunction_842235135169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117463;
     Object term117573;
     Object term117852;
     Object term117856;
     Object term117846;

    public FunctionBuilder_copyFromOtherFunction_842235135169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term117463, term117463.getClass(), "name", null);
        setField(term117463, term117463.getClass(), "sourceNode", null);
        setField(term117463, term117463.getClass(), "parametersNode", null);
        setField(term117463, term117463.getClass(), "returnType", null);
        term117573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term117705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term117811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term117573, term117573.getClass(), "className", "");
        setField(term117573, term117573.getClass(), "source", null);
        setField(term117705, term117705.getClass(), "parameters", null);
        setField(term117705, term117705.getClass(), "returnType", null);
        setField(term117573, term117573.getClass(), "call", term117705);
        setField(term117573, term117573.getClass(), "typeOfThis", term117811);
        term117852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term117855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term117852, term117852.getClass(), "registry", null);
        setField(term117852, term117852.getClass(), "name", "");
        setField(term117852, term117852.getClass(), "sourceNode", null);
        setField(term117852, term117852.getClass(), "parametersNode", null);
        setField(term117852, term117852.getClass(), "returnType", null);
        setField(term117855, term117855.getClass(), "primitiveType", null);
        setField(term117855, term117855.getClass(), "primitiveObjectType", null);
        setField(term117855, term117855.getClass(), "name", null);
        setBooleanField(term117855, term117855.getClass(), "visited", false);
        setField(term117855, term117855.getClass(), "docInfo", null);
        setBooleanField(term117855, term117855.getClass(), "unknown", false);
        setBooleanField(term117855, term117855.getClass(), "resolved", false);
        setField(term117855, term117855.getClass(), "resolveResult", null);
        setField(term117855, term117855.getClass(), "registry", null);
        setField(term117852, term117852.getClass(), "typeOfThis", term117855);
        setField(term117852, term117852.getClass(), "templateTypeName", null);
        setBooleanField(term117852, term117852.getClass(), "inferredReturnType", false);
        setBooleanField(term117852, term117852.getClass(), "isConstructor", false);
        setBooleanField(term117852, term117852.getClass(), "isNativeType", false);
        term117856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term117857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term117858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term117857, term117857.getClass(), "parameters", null);
        setField(term117857, term117857.getClass(), "returnType", null);
        setBooleanField(term117857, term117857.getClass(), "returnTypeInferred", false);
        setBooleanField(term117857, term117857.getClass(), "resolved", false);
        setField(term117857, term117857.getClass(), "resolveResult", null);
        setField(term117857, term117857.getClass(), "registry", null);
        setField(term117856, term117856.getClass(), "call", term117857);
        setField(term117856, term117856.getClass(), "prototype", null);
        setField(term117856, term117856.getClass(), "kind", null);
        setField(term117858, term117858.getClass(), "primitiveType", null);
        setField(term117858, term117858.getClass(), "primitiveObjectType", null);
        setField(term117858, term117858.getClass(), "name", null);
        setBooleanField(term117858, term117858.getClass(), "visited", false);
        setField(term117858, term117858.getClass(), "docInfo", null);
        setBooleanField(term117858, term117858.getClass(), "unknown", false);
        setBooleanField(term117858, term117858.getClass(), "resolved", false);
        setField(term117858, term117858.getClass(), "resolveResult", null);
        setField(term117858, term117858.getClass(), "registry", null);
        setField(term117856, term117856.getClass(), "typeOfThis", term117858);
        setField(term117856, term117856.getClass(), "source", null);
        setField(term117856, term117856.getClass(), "implementedInterfaces", null);
        setField(term117856, term117856.getClass(), "subTypes", null);
        setField(term117856, term117856.getClass(), "templateTypeName", null);
        setField(term117856, term117856.getClass(), "className", "");
        setField(term117856, term117856.getClass(), "properties", null);
        setField(term117856, term117856.getClass(), "implicitPrototype", null);
        setBooleanField(term117856, term117856.getClass(), "nativeType", false);
        setBooleanField(term117856, term117856.getClass(), "prettyPrint", false);
        setBooleanField(term117856, term117856.getClass(), "visited", false);
        setField(term117856, term117856.getClass(), "docInfo", null);
        setBooleanField(term117856, term117856.getClass(), "unknown", false);
        setBooleanField(term117856, term117856.getClass(), "resolved", false);
        setField(term117856, term117856.getClass(), "resolveResult", null);
        setField(term117856, term117856.getClass(), "registry", null);
        term117846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term117819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term117846, term117846.getClass(), "registry", null);
        setField(term117846, term117846.getClass(), "name", "");
        setField(term117846, term117846.getClass(), "sourceNode", null);
        setField(term117846, term117846.getClass(), "parametersNode", null);
        setField(term117846, term117846.getClass(), "returnType", null);
        setField(term117819, term117819.getClass(), "primitiveType", null);
        setField(term117819, term117819.getClass(), "primitiveObjectType", null);
        setField(term117819, term117819.getClass(), "name", null);
        setBooleanField(term117819, term117819.getClass(), "visited", false);
        setField(term117819, term117819.getClass(), "docInfo", null);
        setBooleanField(term117819, term117819.getClass(), "unknown", false);
        setBooleanField(term117819, term117819.getClass(), "resolved", false);
        setField(term117819, term117819.getClass(), "resolveResult", null);
        setField(term117819, term117819.getClass(), "registry", null);
        setField(term117846, term117846.getClass(), "typeOfThis", term117819);
        setField(term117846, term117846.getClass(), "templateTypeName", null);
        setBooleanField(term117846, term117846.getClass(), "inferredReturnType", false);
        setBooleanField(term117846, term117846.getClass(), "isConstructor", false);
        setBooleanField(term117846, term117846.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term117573;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term117463, args);
        assertTrue(recursiveEquals(term117463, term117852));
        assertTrue(recursiveEquals(term117573, term117856));
        assertTrue(recursiveEquals(retValue, term117846));
    }

};


