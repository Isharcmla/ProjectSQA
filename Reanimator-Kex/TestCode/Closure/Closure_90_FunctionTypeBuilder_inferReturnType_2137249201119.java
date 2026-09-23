package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionTypeBuilder_inferReturnType_2137249201119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53204;
     Object term53418;
     Object term53862;
     Object term53866;
     Object term53849;

    public FunctionTypeBuilder_inferReturnType_2137249201119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53204 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term53204, term53204.getClass(), "templateTypeName", "");
        setField(term53204, term53204.getClass(), "returnType", term53338);
        term53418 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term53418, term53418.getClass(), "bitset", -1610612736);
        term53862 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term53862, term53862.getClass(), "fnName", null);
        setField(term53862, term53862.getClass(), "compiler", null);
        setField(term53862, term53862.getClass(), "codingConvention", null);
        setField(term53862, term53862.getClass(), "typeRegistry", null);
        setField(term53862, term53862.getClass(), "errorRoot", null);
        setField(term53862, term53862.getClass(), "sourceName", null);
        setField(term53862, term53862.getClass(), "scope", null);
        setField(term53863, term53863.getClass(), "properties", null);
        setBooleanField(term53863, term53863.getClass(), "isFrozen", false);
        setField(term53863, term53863.getClass(), "className", null);
        setField(term53863, term53863.getClass(), "properties", null);
        setBooleanField(term53863, term53863.getClass(), "nativeType", false);
        setField(term53863, term53863.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term53863, term53863.getClass(), "prettyPrint", false);
        setBooleanField(term53863, term53863.getClass(), "visited", false);
        setField(term53863, term53863.getClass(), "docInfo", null);
        setBooleanField(term53863, term53863.getClass(), "unknown", false);
        setBooleanField(term53863, term53863.getClass(), "resolved", false);
        setField(term53863, term53863.getClass(), "resolveResult", null);
        setField(term53863, term53863.getClass(), "registry", null);
        setField(term53862, term53862.getClass(), "returnType", term53863);
        setBooleanField(term53862, term53862.getClass(), "returnTypeInferred", false);
        setField(term53862, term53862.getClass(), "implementedInterfaces", null);
        setField(term53862, term53862.getClass(), "baseType", null);
        setField(term53862, term53862.getClass(), "thisType", null);
        setBooleanField(term53862, term53862.getClass(), "isConstructor", false);
        setBooleanField(term53862, term53862.getClass(), "isInterface", false);
        setField(term53862, term53862.getClass(), "parametersNode", null);
        setField(term53862, term53862.getClass(), "sourceNode", null);
        setField(term53862, term53862.getClass(), "templateTypeName", "");
        term53866 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term53866, term53866.getClass(), "info", null);
        setField(term53866, term53866.getClass(), "documentation", null);
        setField(term53866, term53866.getClass(), "sourceName", null);
        setField(term53866, term53866.getClass(), "visibility", null);
        setIntField(term53866, term53866.getClass(), "bitset", -1610612736);
        setField(term53866, term53866.getClass(), "type", null);
        setField(term53866, term53866.getClass(), "thisType", null);
        setBooleanField(term53866, term53866.getClass(), "includeDocumentation", false);
        term53849 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term53849, term53849.getClass(), "fnName", null);
        setField(term53849, term53849.getClass(), "compiler", null);
        setField(term53849, term53849.getClass(), "codingConvention", null);
        setField(term53849, term53849.getClass(), "typeRegistry", null);
        setField(term53849, term53849.getClass(), "errorRoot", null);
        setField(term53849, term53849.getClass(), "sourceName", null);
        setField(term53849, term53849.getClass(), "scope", null);
        setField(term53850, term53850.getClass(), "properties", null);
        setBooleanField(term53850, term53850.getClass(), "isFrozen", false);
        setField(term53850, term53850.getClass(), "className", null);
        setField(term53850, term53850.getClass(), "properties", null);
        setBooleanField(term53850, term53850.getClass(), "nativeType", false);
        setField(term53850, term53850.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term53850, term53850.getClass(), "prettyPrint", false);
        setBooleanField(term53850, term53850.getClass(), "visited", false);
        setField(term53850, term53850.getClass(), "docInfo", null);
        setBooleanField(term53850, term53850.getClass(), "unknown", false);
        setBooleanField(term53850, term53850.getClass(), "resolved", false);
        setField(term53850, term53850.getClass(), "resolveResult", null);
        setField(term53850, term53850.getClass(), "registry", null);
        setField(term53849, term53849.getClass(), "returnType", term53850);
        setBooleanField(term53849, term53849.getClass(), "returnTypeInferred", false);
        setField(term53849, term53849.getClass(), "implementedInterfaces", null);
        setField(term53849, term53849.getClass(), "baseType", null);
        setField(term53849, term53849.getClass(), "thisType", null);
        setBooleanField(term53849, term53849.getClass(), "isConstructor", false);
        setBooleanField(term53849, term53849.getClass(), "isInterface", false);
        setField(term53849, term53849.getClass(), "parametersNode", null);
        setField(term53849, term53849.getClass(), "sourceNode", null);
        setField(term53849, term53849.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term53418;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term53204, args);
        assertTrue(recursiveEquals(term53204, term53862));
        assertTrue(recursiveEquals(term53418, term53866));
        assertTrue(recursiveEquals(retValue, term53849));
    }

};


