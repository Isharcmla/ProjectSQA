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

public class NamedType_setReferencedAndResolvedType_101551349083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15110;
     Object term15241;

    public NamedType_setReferencedAndResolvedType_101551349083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term15224 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind$1"));
        setField(term15110, term15110.getClass(), "validator", term15224);
        term15241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term15242 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind$1"));
        setField(term15241, term15241.getClass(), "reference", null);
        setField(term15241, term15241.getClass(), "sourceName", null);
        setIntField(term15241, term15241.getClass(), "lineno", 0);
        setIntField(term15241, term15241.getClass(), "charno", 0);
        setField(term15242, term15242.getClass(), "nodeForValue", null);
        setField(term15242, term15242.getClass(), "val$value", null);
        setField(term15242, term15242.getClass(), "this$0", null);
        setField(term15241, term15241.getClass(), "validator", term15242);
        setField(term15241, term15241.getClass(), "propertyContinuations", null);
        setField(term15241, term15241.getClass(), "referencedType", null);
        setField(term15241, term15241.getClass(), "referencedObjType", null);
        setBooleanField(term15241, term15241.getClass(), "visited", false);
        setField(term15241, term15241.getClass(), "docInfo", null);
        setBooleanField(term15241, term15241.getClass(), "unknown", false);
        setBooleanField(term15241, term15241.getClass(), "resolved", true);
        setField(term15241, term15241.getClass(), "resolveResult", null);
        setField(term15241, term15241.getClass(), "templateKeys", null);
        setField(term15241, term15241.getClass(), "templatizedTypes", null);
        setBooleanField(term15241, term15241.getClass(), "inTemplatedCheckVisit", false);
        setField(term15241, term15241.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setReferencedAndResolvedType", argTypes, term15110, args);
        assertTrue(recursiveEquals(term15110, term15241));
    }

};


