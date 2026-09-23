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

public class TypeCheck_visit_8595247841660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534585;
     Object term534677;
     Object term534769;
     Object term534795;
     Object term534796;
     Object term534797;

    public TypeCheck_visit_8595247841660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534585 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term534677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term534677, term534677.getClass(), "type", 38);
        term534769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term534769, term534769.getClass(), "type", 83);
        term534795 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term534795, term534795.getClass(), "compiler", null);
        setField(term534795, term534795.getClass(), "validator", null);
        setField(term534795, term534795.getClass(), "reverseInterpreter", null);
        setField(term534795, term534795.getClass(), "typeRegistry", null);
        setField(term534795, term534795.getClass(), "topScope", null);
        setField(term534795, term534795.getClass(), "scopeCreator", null);
        setField(term534795, term534795.getClass(), "reportMissingOverride", null);
        setField(term534795, term534795.getClass(), "reportUnknownTypes", null);
        setBooleanField(term534795, term534795.getClass(), "reportMissingProperties", false);
        setField(term534795, term534795.getClass(), "inferJSDocInfo", null);
        setIntField(term534795, term534795.getClass(), "typedCount", 0);
        setIntField(term534795, term534795.getClass(), "nullCount", 0);
        setIntField(term534795, term534795.getClass(), "unknownCount", 0);
        setBooleanField(term534795, term534795.getClass(), "inExterns", false);
        setIntField(term534795, term534795.getClass(), "noTypeCheckSection", 0);
        term534796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term534796, term534796.getClass(), "number", 0.0);
        setIntField(term534796, term534796.getClass(), "type", 38);
        setField(term534796, term534796.getClass(), "next", null);
        setField(term534796, term534796.getClass(), "first", null);
        setField(term534796, term534796.getClass(), "last", null);
        setField(term534796, term534796.getClass(), "propListHead", null);
        setIntField(term534796, term534796.getClass(), "sourcePosition", 0);
        setField(term534796, term534796.getClass(), "jsType", null);
        setField(term534796, term534796.getClass(), "parent", null);
        term534797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term534797, term534797.getClass(), "number", 0.0);
        setIntField(term534797, term534797.getClass(), "type", 83);
        setField(term534797, term534797.getClass(), "next", null);
        setField(term534797, term534797.getClass(), "first", null);
        setField(term534797, term534797.getClass(), "last", null);
        setField(term534797, term534797.getClass(), "propListHead", null);
        setIntField(term534797, term534797.getClass(), "sourcePosition", 0);
        setField(term534797, term534797.getClass(), "jsType", null);
        setField(term534797, term534797.getClass(), "parent", null);
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
        args[1] = term534677;
        args[2] = term534769;
        callMethod(klass, "visit", argTypes, term534585, args);
        assertTrue(recursiveEquals(term534585, term534795));
        assertTrue(recursiveEquals(term534677, term534797));
        assertTrue(recursiveEquals(term534769, null));
    }

};


