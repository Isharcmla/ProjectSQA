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

public class TypeCheck_visitParameterList_2094647345632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170215;
     Object term170285;
     Object term170477;
     Object term170842;
     Object term170843;
     Object term170845;

    public TypeCheck_visitParameterList_2094647345632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170215 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term170285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term170285, term170285.getClass(), "first", term170377);
        term170477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term170571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term170663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term170571, term170571.getClass(), "parameters", term170663);
        setField(term170477, term170477.getClass(), "call", term170571);
        term170842 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term170842, term170842.getClass(), "compiler", null);
        setField(term170842, term170842.getClass(), "validator", null);
        setField(term170842, term170842.getClass(), "reverseInterpreter", null);
        setField(term170842, term170842.getClass(), "typeRegistry", null);
        setField(term170842, term170842.getClass(), "topScope", null);
        setField(term170842, term170842.getClass(), "scopeCreator", null);
        setField(term170842, term170842.getClass(), "reportMissingOverride", null);
        setBooleanField(term170842, term170842.getClass(), "reportUnknownTypes", false);
        setBooleanField(term170842, term170842.getClass(), "reportMissingProperties", false);
        setField(term170842, term170842.getClass(), "inferJSDocInfo", null);
        setIntField(term170842, term170842.getClass(), "typedCount", 0);
        setIntField(term170842, term170842.getClass(), "nullCount", 0);
        setIntField(term170842, term170842.getClass(), "unknownCount", 0);
        setBooleanField(term170842, term170842.getClass(), "inExterns", false);
        setIntField(term170842, term170842.getClass(), "noTypeCheckSection", 0);
        setField(term170842, term170842.getClass(), "editDistance", null);
        term170843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term170843, term170843.getClass(), "type", 0);
        setField(term170843, term170843.getClass(), "next", null);
        setDoubleField(term170844, term170844.getClass(), "number", 0.0);
        setIntField(term170844, term170844.getClass(), "type", 0);
        setField(term170844, term170844.getClass(), "next", null);
        setField(term170844, term170844.getClass(), "first", null);
        setField(term170844, term170844.getClass(), "last", null);
        setField(term170844, term170844.getClass(), "propListHead", null);
        setIntField(term170844, term170844.getClass(), "sourcePosition", 0);
        setField(term170844, term170844.getClass(), "jsType", null);
        setField(term170844, term170844.getClass(), "parent", null);
        setField(term170843, term170843.getClass(), "first", term170844);
        setField(term170843, term170843.getClass(), "last", null);
        setField(term170843, term170843.getClass(), "propListHead", null);
        setIntField(term170843, term170843.getClass(), "sourcePosition", 0);
        setField(term170843, term170843.getClass(), "jsType", null);
        setField(term170843, term170843.getClass(), "parent", null);
        term170845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term170846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term170847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170847, term170847.getClass(), "number", 0.0);
        setIntField(term170847, term170847.getClass(), "type", 0);
        setField(term170847, term170847.getClass(), "next", null);
        setField(term170847, term170847.getClass(), "first", null);
        setField(term170847, term170847.getClass(), "last", null);
        setField(term170847, term170847.getClass(), "propListHead", null);
        setIntField(term170847, term170847.getClass(), "sourcePosition", 0);
        setField(term170847, term170847.getClass(), "jsType", null);
        setField(term170847, term170847.getClass(), "parent", null);
        setField(term170846, term170846.getClass(), "parameters", term170847);
        setField(term170846, term170846.getClass(), "returnType", null);
        setBooleanField(term170846, term170846.getClass(), "returnTypeInferred", false);
        setBooleanField(term170846, term170846.getClass(), "resolved", false);
        setField(term170846, term170846.getClass(), "resolveResult", null);
        setField(term170846, term170846.getClass(), "templateTypeMap", null);
        setBooleanField(term170846, term170846.getClass(), "inTemplatedCheckVisit", false);
        setField(term170846, term170846.getClass(), "registry", null);
        setField(term170845, term170845.getClass(), "call", term170846);
        setField(term170845, term170845.getClass(), "prototypeSlot", null);
        setField(term170845, term170845.getClass(), "kind", null);
        setField(term170845, term170845.getClass(), "propAccess", null);
        setField(term170845, term170845.getClass(), "typeOfThis", null);
        setField(term170845, term170845.getClass(), "source", null);
        setField(term170845, term170845.getClass(), "implementedInterfaces", null);
        setField(term170845, term170845.getClass(), "extendedInterfaces", null);
        setField(term170845, term170845.getClass(), "subTypes", null);
        setField(term170845, term170845.getClass(), "className", null);
        setField(term170845, term170845.getClass(), "properties", null);
        setBooleanField(term170845, term170845.getClass(), "nativeType", false);
        setField(term170845, term170845.getClass(), "implicitPrototypeFallback", null);
        setField(term170845, term170845.getClass(), "ownerFunction", null);
        setBooleanField(term170845, term170845.getClass(), "prettyPrint", false);
        setBooleanField(term170845, term170845.getClass(), "visited", false);
        setField(term170845, term170845.getClass(), "docInfo", null);
        setBooleanField(term170845, term170845.getClass(), "unknown", false);
        setBooleanField(term170845, term170845.getClass(), "resolved", false);
        setField(term170845, term170845.getClass(), "resolveResult", null);
        setField(term170845, term170845.getClass(), "templateTypeMap", null);
        setBooleanField(term170845, term170845.getClass(), "inTemplatedCheckVisit", false);
        setField(term170845, term170845.getClass(), "registry", null);
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
        args[1] = term170285;
        args[2] = term170477;
        callMethod(klass, "visitParameterList", argTypes, term170215, args);
        assertTrue(recursiveEquals(term170215, term170842));
        assertTrue(recursiveEquals(term170285, term170845));
        assertTrue(recursiveEquals(term170477, null));
    }

};


