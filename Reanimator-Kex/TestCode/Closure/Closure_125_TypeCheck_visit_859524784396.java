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

public class TypeCheck_visit_859524784396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97683;
     Object term97753;
     Object term97770;
     Object term97771;

    public TypeCheck_visit_859524784396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97683 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term97753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97753, term97753.getClass(), "type", 154);
        term97770 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97770, term97770.getClass(), "compiler", null);
        setField(term97770, term97770.getClass(), "validator", null);
        setField(term97770, term97770.getClass(), "reverseInterpreter", null);
        setField(term97770, term97770.getClass(), "typeRegistry", null);
        setField(term97770, term97770.getClass(), "topScope", null);
        setField(term97770, term97770.getClass(), "scopeCreator", null);
        setField(term97770, term97770.getClass(), "reportMissingOverride", null);
        setBooleanField(term97770, term97770.getClass(), "reportUnknownTypes", false);
        setBooleanField(term97770, term97770.getClass(), "reportMissingProperties", false);
        setField(term97770, term97770.getClass(), "inferJSDocInfo", null);
        setIntField(term97770, term97770.getClass(), "typedCount", 0);
        setIntField(term97770, term97770.getClass(), "nullCount", 0);
        setIntField(term97770, term97770.getClass(), "unknownCount", 0);
        setBooleanField(term97770, term97770.getClass(), "inExterns", false);
        setIntField(term97770, term97770.getClass(), "noTypeCheckSection", 0);
        setField(term97770, term97770.getClass(), "editDistance", null);
        term97771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97771, term97771.getClass(), "type", 154);
        setField(term97771, term97771.getClass(), "next", null);
        setField(term97771, term97771.getClass(), "first", null);
        setField(term97771, term97771.getClass(), "last", null);
        setField(term97771, term97771.getClass(), "propListHead", null);
        setIntField(term97771, term97771.getClass(), "sourcePosition", 0);
        setField(term97771, term97771.getClass(), "jsType", null);
        setField(term97771, term97771.getClass(), "parent", null);
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
        args[1] = term97753;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term97683, args);
        assertTrue(recursiveEquals(term97683, term97770));
        assertTrue(recursiveEquals(term97753, null));
    }

};


