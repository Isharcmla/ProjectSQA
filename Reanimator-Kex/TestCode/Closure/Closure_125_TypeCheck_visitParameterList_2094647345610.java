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

public class TypeCheck_visitParameterList_2094647345610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163724;
     Object term163794;
     Object term163964;
     Object term164230;
     Object term164231;
     Object term164233;

    public TypeCheck_visitParameterList_2094647345610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163724 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term163794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163794, term163794.getClass(), "first", term163864);
        term163964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term164058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term164128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term164128, term164128.getClass(), "first", null);
        setField(term164058, term164058.getClass(), "parameters", term164128);
        setField(term163964, term163964.getClass(), "call", term164058);
        term164230 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term164230, term164230.getClass(), "compiler", null);
        setField(term164230, term164230.getClass(), "validator", null);
        setField(term164230, term164230.getClass(), "reverseInterpreter", null);
        setField(term164230, term164230.getClass(), "typeRegistry", null);
        setField(term164230, term164230.getClass(), "topScope", null);
        setField(term164230, term164230.getClass(), "scopeCreator", null);
        setField(term164230, term164230.getClass(), "reportMissingOverride", null);
        setBooleanField(term164230, term164230.getClass(), "reportUnknownTypes", false);
        setBooleanField(term164230, term164230.getClass(), "reportMissingProperties", false);
        setField(term164230, term164230.getClass(), "inferJSDocInfo", null);
        setIntField(term164230, term164230.getClass(), "typedCount", 0);
        setIntField(term164230, term164230.getClass(), "nullCount", 0);
        setIntField(term164230, term164230.getClass(), "unknownCount", 0);
        setBooleanField(term164230, term164230.getClass(), "inExterns", false);
        setIntField(term164230, term164230.getClass(), "noTypeCheckSection", 0);
        setField(term164230, term164230.getClass(), "editDistance", null);
        term164231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term164231, term164231.getClass(), "type", 0);
        setField(term164231, term164231.getClass(), "next", null);
        setIntField(term164232, term164232.getClass(), "type", 0);
        setField(term164232, term164232.getClass(), "next", null);
        setField(term164232, term164232.getClass(), "first", null);
        setField(term164232, term164232.getClass(), "last", null);
        setField(term164232, term164232.getClass(), "propListHead", null);
        setIntField(term164232, term164232.getClass(), "sourcePosition", 0);
        setField(term164232, term164232.getClass(), "jsType", null);
        setField(term164232, term164232.getClass(), "parent", null);
        setField(term164231, term164231.getClass(), "first", term164232);
        setField(term164231, term164231.getClass(), "last", null);
        setField(term164231, term164231.getClass(), "propListHead", null);
        setIntField(term164231, term164231.getClass(), "sourcePosition", 0);
        setField(term164231, term164231.getClass(), "jsType", null);
        setField(term164231, term164231.getClass(), "parent", null);
        term164233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term164234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term164235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term164235, term164235.getClass(), "type", 0);
        setField(term164235, term164235.getClass(), "next", null);
        setField(term164235, term164235.getClass(), "first", null);
        setField(term164235, term164235.getClass(), "last", null);
        setField(term164235, term164235.getClass(), "propListHead", null);
        setIntField(term164235, term164235.getClass(), "sourcePosition", 0);
        setField(term164235, term164235.getClass(), "jsType", null);
        setField(term164235, term164235.getClass(), "parent", null);
        setField(term164234, term164234.getClass(), "parameters", term164235);
        setField(term164234, term164234.getClass(), "returnType", null);
        setBooleanField(term164234, term164234.getClass(), "returnTypeInferred", false);
        setBooleanField(term164234, term164234.getClass(), "resolved", false);
        setField(term164234, term164234.getClass(), "resolveResult", null);
        setField(term164234, term164234.getClass(), "templateTypeMap", null);
        setBooleanField(term164234, term164234.getClass(), "inTemplatedCheckVisit", false);
        setField(term164234, term164234.getClass(), "registry", null);
        setField(term164233, term164233.getClass(), "call", term164234);
        setField(term164233, term164233.getClass(), "prototypeSlot", null);
        setField(term164233, term164233.getClass(), "kind", null);
        setField(term164233, term164233.getClass(), "propAccess", null);
        setField(term164233, term164233.getClass(), "typeOfThis", null);
        setField(term164233, term164233.getClass(), "source", null);
        setField(term164233, term164233.getClass(), "implementedInterfaces", null);
        setField(term164233, term164233.getClass(), "extendedInterfaces", null);
        setField(term164233, term164233.getClass(), "subTypes", null);
        setField(term164233, term164233.getClass(), "className", null);
        setField(term164233, term164233.getClass(), "properties", null);
        setBooleanField(term164233, term164233.getClass(), "nativeType", false);
        setField(term164233, term164233.getClass(), "implicitPrototypeFallback", null);
        setField(term164233, term164233.getClass(), "ownerFunction", null);
        setBooleanField(term164233, term164233.getClass(), "prettyPrint", false);
        setBooleanField(term164233, term164233.getClass(), "visited", false);
        setField(term164233, term164233.getClass(), "docInfo", null);
        setBooleanField(term164233, term164233.getClass(), "unknown", false);
        setBooleanField(term164233, term164233.getClass(), "resolved", false);
        setField(term164233, term164233.getClass(), "resolveResult", null);
        setField(term164233, term164233.getClass(), "templateTypeMap", null);
        setBooleanField(term164233, term164233.getClass(), "inTemplatedCheckVisit", false);
        setField(term164233, term164233.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term163794;
        args[2] = term163964;
        callMethod(klass, "visitParameterList", argTypes, term163724, args);
        assertTrue(recursiveEquals(term163724, term164230));
        assertTrue(recursiveEquals(term163794, term164233));
        assertTrue(recursiveEquals(term163964, null));
    }

};


