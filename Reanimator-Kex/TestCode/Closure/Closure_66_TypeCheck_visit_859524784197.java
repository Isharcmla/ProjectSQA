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

public class TypeCheck_visit_859524784197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49835;
     Object term49905;
     Object term50086;
     Object term50087;

    public TypeCheck_visit_859524784197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49835 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term49905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49905, term49905.getClass(), "type", 49);
        term50086 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term50086, term50086.getClass(), "compiler", null);
        setField(term50086, term50086.getClass(), "validator", null);
        setField(term50086, term50086.getClass(), "reverseInterpreter", null);
        setField(term50086, term50086.getClass(), "typeRegistry", null);
        setField(term50086, term50086.getClass(), "topScope", null);
        setField(term50086, term50086.getClass(), "scopeCreator", null);
        setField(term50086, term50086.getClass(), "reportMissingOverride", null);
        setField(term50086, term50086.getClass(), "reportUnknownTypes", null);
        setBooleanField(term50086, term50086.getClass(), "reportMissingProperties", false);
        setField(term50086, term50086.getClass(), "inferJSDocInfo", null);
        setIntField(term50086, term50086.getClass(), "typedCount", 0);
        setIntField(term50086, term50086.getClass(), "nullCount", 0);
        setIntField(term50086, term50086.getClass(), "unknownCount", 0);
        setBooleanField(term50086, term50086.getClass(), "inExterns", false);
        setIntField(term50086, term50086.getClass(), "noTypeCheckSection", 0);
        term50087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50087, term50087.getClass(), "type", 49);
        setField(term50087, term50087.getClass(), "next", null);
        setField(term50087, term50087.getClass(), "first", null);
        setField(term50087, term50087.getClass(), "last", null);
        setField(term50087, term50087.getClass(), "propListHead", null);
        setIntField(term50087, term50087.getClass(), "sourcePosition", 0);
        setField(term50087, term50087.getClass(), "jsType", null);
        setField(term50087, term50087.getClass(), "parent", null);
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
        args[1] = term49905;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term49835, args);
        assertTrue(recursiveEquals(term49835, term50086));
        assertTrue(recursiveEquals(term49905, null));
    }

};


