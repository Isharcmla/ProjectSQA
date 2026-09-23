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

public class TypeCheck_visit_859524784221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61694;
     Object term61764;
     Object term62035;
     Object term62036;

    public TypeCheck_visit_859524784221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61694 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term61764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61764, term61764.getClass(), "type", 130);
        term62035 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term62035, term62035.getClass(), "compiler", null);
        setField(term62035, term62035.getClass(), "validator", null);
        setField(term62035, term62035.getClass(), "reverseInterpreter", null);
        setField(term62035, term62035.getClass(), "typeRegistry", null);
        setField(term62035, term62035.getClass(), "topScope", null);
        setField(term62035, term62035.getClass(), "scopeCreator", null);
        setField(term62035, term62035.getClass(), "reportMissingOverride", null);
        setField(term62035, term62035.getClass(), "reportUnknownTypes", null);
        setBooleanField(term62035, term62035.getClass(), "reportMissingProperties", false);
        setField(term62035, term62035.getClass(), "inferJSDocInfo", null);
        setIntField(term62035, term62035.getClass(), "typedCount", 0);
        setIntField(term62035, term62035.getClass(), "nullCount", 0);
        setIntField(term62035, term62035.getClass(), "unknownCount", 0);
        setBooleanField(term62035, term62035.getClass(), "inExterns", false);
        setIntField(term62035, term62035.getClass(), "noTypeCheckSection", 0);
        term62036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62036, term62036.getClass(), "type", 130);
        setField(term62036, term62036.getClass(), "next", null);
        setField(term62036, term62036.getClass(), "first", null);
        setField(term62036, term62036.getClass(), "last", null);
        setField(term62036, term62036.getClass(), "propListHead", null);
        setIntField(term62036, term62036.getClass(), "sourcePosition", 0);
        setField(term62036, term62036.getClass(), "jsType", null);
        setField(term62036, term62036.getClass(), "parent", null);
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
        args[1] = term61764;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term61694, args);
        assertTrue(recursiveEquals(term61694, term62035));
        assertTrue(recursiveEquals(term61764, null));
    }

};


