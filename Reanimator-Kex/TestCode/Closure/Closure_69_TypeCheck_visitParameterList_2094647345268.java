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

public class TypeCheck_visitParameterList_2094647345268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75790;
     Object term75860;
     Object term76030;
     Object term76293;
     Object term76294;
     Object term76296;

    public TypeCheck_visitParameterList_2094647345268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75790 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term75860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75860, term75860.getClass(), "first", term75930);
        term76030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76194, term76194.getClass(), "first", null);
        setField(term76124, term76124.getClass(), "parameters", term76194);
        setField(term76030, term76030.getClass(), "call", term76124);
        term76293 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term76293, term76293.getClass(), "compiler", null);
        setField(term76293, term76293.getClass(), "validator", null);
        setField(term76293, term76293.getClass(), "reverseInterpreter", null);
        setField(term76293, term76293.getClass(), "typeRegistry", null);
        setField(term76293, term76293.getClass(), "topScope", null);
        setField(term76293, term76293.getClass(), "scopeCreator", null);
        setField(term76293, term76293.getClass(), "reportMissingOverride", null);
        setField(term76293, term76293.getClass(), "reportUnknownTypes", null);
        setBooleanField(term76293, term76293.getClass(), "reportMissingProperties", false);
        setField(term76293, term76293.getClass(), "inferJSDocInfo", null);
        setIntField(term76293, term76293.getClass(), "typedCount", 0);
        setIntField(term76293, term76293.getClass(), "nullCount", 0);
        setIntField(term76293, term76293.getClass(), "unknownCount", 0);
        setBooleanField(term76293, term76293.getClass(), "inExterns", false);
        setIntField(term76293, term76293.getClass(), "noTypeCheckSection", 0);
        term76294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76294, term76294.getClass(), "type", 0);
        setField(term76294, term76294.getClass(), "next", null);
        setIntField(term76295, term76295.getClass(), "type", 0);
        setField(term76295, term76295.getClass(), "next", null);
        setField(term76295, term76295.getClass(), "first", null);
        setField(term76295, term76295.getClass(), "last", null);
        setField(term76295, term76295.getClass(), "propListHead", null);
        setIntField(term76295, term76295.getClass(), "sourcePosition", 0);
        setField(term76295, term76295.getClass(), "jsType", null);
        setField(term76295, term76295.getClass(), "parent", null);
        setField(term76294, term76294.getClass(), "first", term76295);
        setField(term76294, term76294.getClass(), "last", null);
        setField(term76294, term76294.getClass(), "propListHead", null);
        setIntField(term76294, term76294.getClass(), "sourcePosition", 0);
        setField(term76294, term76294.getClass(), "jsType", null);
        setField(term76294, term76294.getClass(), "parent", null);
        term76296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76298, term76298.getClass(), "type", 0);
        setField(term76298, term76298.getClass(), "next", null);
        setField(term76298, term76298.getClass(), "first", null);
        setField(term76298, term76298.getClass(), "last", null);
        setField(term76298, term76298.getClass(), "propListHead", null);
        setIntField(term76298, term76298.getClass(), "sourcePosition", 0);
        setField(term76298, term76298.getClass(), "jsType", null);
        setField(term76298, term76298.getClass(), "parent", null);
        setField(term76297, term76297.getClass(), "parameters", term76298);
        setField(term76297, term76297.getClass(), "returnType", null);
        setBooleanField(term76297, term76297.getClass(), "returnTypeInferred", false);
        setBooleanField(term76297, term76297.getClass(), "resolved", false);
        setField(term76297, term76297.getClass(), "resolveResult", null);
        setField(term76297, term76297.getClass(), "registry", null);
        setField(term76296, term76296.getClass(), "call", term76297);
        setField(term76296, term76296.getClass(), "prototype", null);
        setField(term76296, term76296.getClass(), "kind", null);
        setField(term76296, term76296.getClass(), "typeOfThis", null);
        setField(term76296, term76296.getClass(), "source", null);
        setField(term76296, term76296.getClass(), "implementedInterfaces", null);
        setField(term76296, term76296.getClass(), "extendedInterfaces", null);
        setField(term76296, term76296.getClass(), "subTypes", null);
        setField(term76296, term76296.getClass(), "templateTypeName", null);
        setField(term76296, term76296.getClass(), "className", null);
        setField(term76296, term76296.getClass(), "properties", null);
        setBooleanField(term76296, term76296.getClass(), "nativeType", false);
        setField(term76296, term76296.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76296, term76296.getClass(), "prettyPrint", false);
        setBooleanField(term76296, term76296.getClass(), "visited", false);
        setField(term76296, term76296.getClass(), "docInfo", null);
        setBooleanField(term76296, term76296.getClass(), "unknown", false);
        setBooleanField(term76296, term76296.getClass(), "resolved", false);
        setField(term76296, term76296.getClass(), "resolveResult", null);
        setField(term76296, term76296.getClass(), "registry", null);
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
        args[1] = term75860;
        args[2] = term76030;
        callMethod(klass, "visitParameterList", argTypes, term75790, args);
        assertTrue(recursiveEquals(term75790, term76293));
        assertTrue(recursiveEquals(term75860, term76296));
        assertTrue(recursiveEquals(term76030, null));
    }

};


