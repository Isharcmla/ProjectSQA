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

public class TypeCheck_visit_8595247841146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328752;
     Object term328844;
     Object term328863;
     Object term328864;

    public TypeCheck_visit_8595247841146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328752 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term328844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term328844, term328844.getClass(), "type", 148);
        term328863 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term328863, term328863.getClass(), "compiler", null);
        setField(term328863, term328863.getClass(), "validator", null);
        setField(term328863, term328863.getClass(), "reverseInterpreter", null);
        setField(term328863, term328863.getClass(), "typeRegistry", null);
        setField(term328863, term328863.getClass(), "topScope", null);
        setField(term328863, term328863.getClass(), "scopeCreator", null);
        setField(term328863, term328863.getClass(), "reportMissingOverride", null);
        setField(term328863, term328863.getClass(), "reportUnknownTypes", null);
        setBooleanField(term328863, term328863.getClass(), "reportMissingProperties", false);
        setField(term328863, term328863.getClass(), "inferJSDocInfo", null);
        setIntField(term328863, term328863.getClass(), "typedCount", 0);
        setIntField(term328863, term328863.getClass(), "nullCount", 1);
        setIntField(term328863, term328863.getClass(), "unknownCount", 0);
        setBooleanField(term328863, term328863.getClass(), "inExterns", false);
        setIntField(term328863, term328863.getClass(), "noTypeCheckSection", 0);
        term328864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term328864, term328864.getClass(), "number", 0.0);
        setIntField(term328864, term328864.getClass(), "type", 148);
        setField(term328864, term328864.getClass(), "next", null);
        setField(term328864, term328864.getClass(), "first", null);
        setField(term328864, term328864.getClass(), "last", null);
        setField(term328864, term328864.getClass(), "propListHead", null);
        setIntField(term328864, term328864.getClass(), "sourcePosition", 0);
        setField(term328864, term328864.getClass(), "jsType", null);
        setField(term328864, term328864.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term328844;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term328752, args);
        assertTrue(recursiveEquals(term328752, term328863));
        assertTrue(recursiveEquals(term328844, null));
    }

};


