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

public class FunctionTypeBuilder_maybeSetBaseType_954025947199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91495;
     Object term91715;
     Object term91794;
     Object term91796;

    public FunctionTypeBuilder_maybeSetBaseType_954025947199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91495 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term91605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term91495, term91495.getClass(), "baseType", term91605);
        term91715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term91794 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term91795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term91794, term91794.getClass(), "fnName", null);
        setField(term91794, term91794.getClass(), "compiler", null);
        setField(term91794, term91794.getClass(), "codingConvention", null);
        setField(term91794, term91794.getClass(), "typeRegistry", null);
        setField(term91794, term91794.getClass(), "errorRoot", null);
        setField(term91794, term91794.getClass(), "sourceName", null);
        setField(term91794, term91794.getClass(), "scope", null);
        setField(term91794, term91794.getClass(), "returnType", null);
        setField(term91794, term91794.getClass(), "implementedInterfaces", null);
        setField(term91795, term91795.getClass(), "call", null);
        setField(term91795, term91795.getClass(), "prototype", null);
        setField(term91795, term91795.getClass(), "kind", null);
        setField(term91795, term91795.getClass(), "typeOfThis", null);
        setField(term91795, term91795.getClass(), "source", null);
        setField(term91795, term91795.getClass(), "implementedInterfaces", null);
        setField(term91795, term91795.getClass(), "subTypes", null);
        setField(term91795, term91795.getClass(), "templateTypeName", null);
        setField(term91795, term91795.getClass(), "className", null);
        setField(term91795, term91795.getClass(), "properties", null);
        setField(term91795, term91795.getClass(), "implicitPrototype", null);
        setBooleanField(term91795, term91795.getClass(), "nativeType", false);
        setBooleanField(term91795, term91795.getClass(), "prettyPrint", false);
        setBooleanField(term91795, term91795.getClass(), "visited", false);
        setField(term91795, term91795.getClass(), "docInfo", null);
        setBooleanField(term91795, term91795.getClass(), "unknown", false);
        setBooleanField(term91795, term91795.getClass(), "resolved", false);
        setField(term91795, term91795.getClass(), "resolveResult", null);
        setField(term91795, term91795.getClass(), "registry", null);
        setField(term91794, term91794.getClass(), "baseType", term91795);
        setField(term91794, term91794.getClass(), "thisType", null);
        setBooleanField(term91794, term91794.getClass(), "isConstructor", false);
        setBooleanField(term91794, term91794.getClass(), "isInterface", false);
        setField(term91794, term91794.getClass(), "parametersNode", null);
        setField(term91794, term91794.getClass(), "sourceNode", null);
        setField(term91794, term91794.getClass(), "templateTypeName", null);
        HashMap term91798 = new HashMap();
        term91796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term91797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term91799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term91796, term91796.getClass(), "call", null);
        setField(term91797, term91797.getClass(), "ownerFunction", term91796);
        setField(term91797, term91797.getClass(), "className", null);
        setField(term91797, term91797.getClass(), "properties", term91798);
        setField(term91799, term91799.getClass(), "call", null);
        setField(term91799, term91799.getClass(), "prototype", null);
        setField(term91799, term91799.getClass(), "kind", null);
        setField(term91799, term91799.getClass(), "typeOfThis", null);
        setField(term91799, term91799.getClass(), "source", null);
        setField(term91799, term91799.getClass(), "implementedInterfaces", null);
        setField(term91799, term91799.getClass(), "subTypes", null);
        setField(term91799, term91799.getClass(), "templateTypeName", null);
        setField(term91799, term91799.getClass(), "className", null);
        setField(term91799, term91799.getClass(), "properties", null);
        setField(term91799, term91799.getClass(), "implicitPrototype", null);
        setBooleanField(term91799, term91799.getClass(), "nativeType", false);
        setBooleanField(term91799, term91799.getClass(), "prettyPrint", false);
        setBooleanField(term91799, term91799.getClass(), "visited", false);
        setField(term91799, term91799.getClass(), "docInfo", null);
        setBooleanField(term91799, term91799.getClass(), "unknown", false);
        setBooleanField(term91799, term91799.getClass(), "resolved", false);
        setField(term91799, term91799.getClass(), "resolveResult", null);
        setField(term91799, term91799.getClass(), "registry", null);
        setField(term91797, term91797.getClass(), "implicitPrototype", term91799);
        setBooleanField(term91797, term91797.getClass(), "nativeType", false);
        setBooleanField(term91797, term91797.getClass(), "prettyPrint", false);
        setBooleanField(term91797, term91797.getClass(), "visited", false);
        setField(term91797, term91797.getClass(), "docInfo", null);
        setBooleanField(term91797, term91797.getClass(), "unknown", true);
        setBooleanField(term91797, term91797.getClass(), "resolved", false);
        setField(term91797, term91797.getClass(), "resolveResult", null);
        setField(term91797, term91797.getClass(), "registry", null);
        setField(term91796, term91796.getClass(), "prototype", term91797);
        setField(term91796, term91796.getClass(), "kind", null);
        setField(term91796, term91796.getClass(), "typeOfThis", null);
        setField(term91796, term91796.getClass(), "source", null);
        setField(term91796, term91796.getClass(), "implementedInterfaces", null);
        setField(term91796, term91796.getClass(), "subTypes", null);
        setField(term91796, term91796.getClass(), "templateTypeName", null);
        setField(term91796, term91796.getClass(), "className", null);
        setField(term91796, term91796.getClass(), "properties", null);
        setField(term91796, term91796.getClass(), "implicitPrototype", null);
        setBooleanField(term91796, term91796.getClass(), "nativeType", false);
        setBooleanField(term91796, term91796.getClass(), "prettyPrint", false);
        setBooleanField(term91796, term91796.getClass(), "visited", false);
        setField(term91796, term91796.getClass(), "docInfo", null);
        setBooleanField(term91796, term91796.getClass(), "unknown", false);
        setBooleanField(term91796, term91796.getClass(), "resolved", false);
        setField(term91796, term91796.getClass(), "resolveResult", null);
        setField(term91796, term91796.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term91715;
        callMethod(klass, "maybeSetBaseType", argTypes, term91495, args);
        assertTrue(recursiveEquals(term91495, term91794));
        assertTrue(recursiveEquals(term91715, term91796));
    }

};


