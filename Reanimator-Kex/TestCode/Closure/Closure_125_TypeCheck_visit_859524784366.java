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

public class TypeCheck_visit_859524784366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87765;
     Object term87835;
     Object term87852;
     Object term87853;

    public TypeCheck_visit_859524784366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87765 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term87835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87835, term87835.getClass(), "type", 152);
        term87852 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term87852, term87852.getClass(), "compiler", null);
        setField(term87852, term87852.getClass(), "validator", null);
        setField(term87852, term87852.getClass(), "reverseInterpreter", null);
        setField(term87852, term87852.getClass(), "typeRegistry", null);
        setField(term87852, term87852.getClass(), "topScope", null);
        setField(term87852, term87852.getClass(), "scopeCreator", null);
        setField(term87852, term87852.getClass(), "reportMissingOverride", null);
        setBooleanField(term87852, term87852.getClass(), "reportUnknownTypes", false);
        setBooleanField(term87852, term87852.getClass(), "reportMissingProperties", false);
        setField(term87852, term87852.getClass(), "inferJSDocInfo", null);
        setIntField(term87852, term87852.getClass(), "typedCount", 0);
        setIntField(term87852, term87852.getClass(), "nullCount", 0);
        setIntField(term87852, term87852.getClass(), "unknownCount", 0);
        setBooleanField(term87852, term87852.getClass(), "inExterns", false);
        setIntField(term87852, term87852.getClass(), "noTypeCheckSection", 0);
        setField(term87852, term87852.getClass(), "editDistance", null);
        term87853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87853, term87853.getClass(), "type", 152);
        setField(term87853, term87853.getClass(), "next", null);
        setField(term87853, term87853.getClass(), "first", null);
        setField(term87853, term87853.getClass(), "last", null);
        setField(term87853, term87853.getClass(), "propListHead", null);
        setIntField(term87853, term87853.getClass(), "sourcePosition", 0);
        setField(term87853, term87853.getClass(), "jsType", null);
        setField(term87853, term87853.getClass(), "parent", null);
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
        args[1] = term87835;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term87765, args);
        assertTrue(recursiveEquals(term87765, term87852));
        assertTrue(recursiveEquals(term87835, null));
    }

};


