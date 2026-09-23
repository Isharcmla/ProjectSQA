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
import java.util.HashMap;

public class FunctionTypeBuilder_maybeSetBaseType_954025947143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71762;
     Object term71962;
     Object term72041;
     Object term72043;

    public FunctionTypeBuilder_maybeSetBaseType_954025947143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71762 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term71862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term71762, term71762.getClass(), "baseType", term71862);
        term71962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term72041 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term72042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72041, term72041.getClass(), "fnName", null);
        setField(term72041, term72041.getClass(), "compiler", null);
        setField(term72041, term72041.getClass(), "codingConvention", null);
        setField(term72041, term72041.getClass(), "typeRegistry", null);
        setField(term72041, term72041.getClass(), "errorRoot", null);
        setField(term72041, term72041.getClass(), "sourceName", null);
        setField(term72041, term72041.getClass(), "scope", null);
        setField(term72041, term72041.getClass(), "returnType", null);
        setField(term72041, term72041.getClass(), "implementedInterfaces", null);
        setField(term72042, term72042.getClass(), "call", null);
        setField(term72042, term72042.getClass(), "prototype", null);
        setField(term72042, term72042.getClass(), "kind", null);
        setField(term72042, term72042.getClass(), "typeOfThis", null);
        setField(term72042, term72042.getClass(), "source", null);
        setField(term72042, term72042.getClass(), "implementedInterfaces", null);
        setField(term72042, term72042.getClass(), "subTypes", null);
        setField(term72042, term72042.getClass(), "templateTypeName", null);
        setField(term72042, term72042.getClass(), "className", null);
        setField(term72042, term72042.getClass(), "properties", null);
        setField(term72042, term72042.getClass(), "implicitPrototype", null);
        setBooleanField(term72042, term72042.getClass(), "nativeType", false);
        setBooleanField(term72042, term72042.getClass(), "prettyPrint", false);
        setBooleanField(term72042, term72042.getClass(), "visited", false);
        setField(term72042, term72042.getClass(), "docInfo", null);
        setBooleanField(term72042, term72042.getClass(), "unknown", false);
        setBooleanField(term72042, term72042.getClass(), "resolved", false);
        setField(term72042, term72042.getClass(), "resolveResult", null);
        setField(term72042, term72042.getClass(), "registry", null);
        setField(term72041, term72041.getClass(), "baseType", term72042);
        setField(term72041, term72041.getClass(), "thisType", null);
        setBooleanField(term72041, term72041.getClass(), "isConstructor", false);
        setBooleanField(term72041, term72041.getClass(), "isInterface", false);
        setField(term72041, term72041.getClass(), "parametersNode", null);
        setField(term72041, term72041.getClass(), "sourceNode", null);
        setField(term72041, term72041.getClass(), "templateTypeName", null);
        HashMap term72045 = new HashMap();
        term72043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term72046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72043, term72043.getClass(), "call", null);
        setField(term72044, term72044.getClass(), "ownerFunction", term72043);
        setField(term72044, term72044.getClass(), "className", null);
        setField(term72044, term72044.getClass(), "properties", term72045);
        setField(term72046, term72046.getClass(), "call", null);
        setField(term72046, term72046.getClass(), "prototype", null);
        setField(term72046, term72046.getClass(), "kind", null);
        setField(term72046, term72046.getClass(), "typeOfThis", null);
        setField(term72046, term72046.getClass(), "source", null);
        setField(term72046, term72046.getClass(), "implementedInterfaces", null);
        setField(term72046, term72046.getClass(), "subTypes", null);
        setField(term72046, term72046.getClass(), "templateTypeName", null);
        setField(term72046, term72046.getClass(), "className", null);
        setField(term72046, term72046.getClass(), "properties", null);
        setField(term72046, term72046.getClass(), "implicitPrototype", null);
        setBooleanField(term72046, term72046.getClass(), "nativeType", false);
        setBooleanField(term72046, term72046.getClass(), "prettyPrint", false);
        setBooleanField(term72046, term72046.getClass(), "visited", false);
        setField(term72046, term72046.getClass(), "docInfo", null);
        setBooleanField(term72046, term72046.getClass(), "unknown", false);
        setBooleanField(term72046, term72046.getClass(), "resolved", false);
        setField(term72046, term72046.getClass(), "resolveResult", null);
        setField(term72046, term72046.getClass(), "registry", null);
        setField(term72044, term72044.getClass(), "implicitPrototype", term72046);
        setBooleanField(term72044, term72044.getClass(), "nativeType", false);
        setBooleanField(term72044, term72044.getClass(), "prettyPrint", false);
        setBooleanField(term72044, term72044.getClass(), "visited", false);
        setField(term72044, term72044.getClass(), "docInfo", null);
        setBooleanField(term72044, term72044.getClass(), "unknown", true);
        setBooleanField(term72044, term72044.getClass(), "resolved", false);
        setField(term72044, term72044.getClass(), "resolveResult", null);
        setField(term72044, term72044.getClass(), "registry", null);
        setField(term72043, term72043.getClass(), "prototype", term72044);
        setField(term72043, term72043.getClass(), "kind", null);
        setField(term72043, term72043.getClass(), "typeOfThis", null);
        setField(term72043, term72043.getClass(), "source", null);
        setField(term72043, term72043.getClass(), "implementedInterfaces", null);
        setField(term72043, term72043.getClass(), "subTypes", null);
        setField(term72043, term72043.getClass(), "templateTypeName", null);
        setField(term72043, term72043.getClass(), "className", null);
        setField(term72043, term72043.getClass(), "properties", null);
        setField(term72043, term72043.getClass(), "implicitPrototype", null);
        setBooleanField(term72043, term72043.getClass(), "nativeType", false);
        setBooleanField(term72043, term72043.getClass(), "prettyPrint", false);
        setBooleanField(term72043, term72043.getClass(), "visited", false);
        setField(term72043, term72043.getClass(), "docInfo", null);
        setBooleanField(term72043, term72043.getClass(), "unknown", false);
        setBooleanField(term72043, term72043.getClass(), "resolved", false);
        setField(term72043, term72043.getClass(), "resolveResult", null);
        setField(term72043, term72043.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term71962;
        callMethod(klass, "maybeSetBaseType", argTypes, term71762, args);
        assertTrue(recursiveEquals(term71762, term72041));
        assertTrue(recursiveEquals(term71962, term72043));
    }

};


