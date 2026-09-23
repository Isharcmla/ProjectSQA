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

public class TypeCheck_visit_859524784248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60664;
     Object term60734;
     Object term60750;
     Object term60751;

    public TypeCheck_visit_859524784248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60664 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60734, term60734.getClass(), "type", 153);
        term60750 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term60750, term60750.getClass(), "compiler", null);
        setField(term60750, term60750.getClass(), "validator", null);
        setField(term60750, term60750.getClass(), "reverseInterpreter", null);
        setField(term60750, term60750.getClass(), "typeRegistry", null);
        setField(term60750, term60750.getClass(), "topScope", null);
        setField(term60750, term60750.getClass(), "scopeCreator", null);
        setField(term60750, term60750.getClass(), "reportMissingOverride", null);
        setField(term60750, term60750.getClass(), "reportUnknownTypes", null);
        setBooleanField(term60750, term60750.getClass(), "reportMissingProperties", false);
        setField(term60750, term60750.getClass(), "inferJSDocInfo", null);
        setIntField(term60750, term60750.getClass(), "typedCount", 0);
        setIntField(term60750, term60750.getClass(), "nullCount", 0);
        setIntField(term60750, term60750.getClass(), "unknownCount", 0);
        setBooleanField(term60750, term60750.getClass(), "inExterns", false);
        setIntField(term60750, term60750.getClass(), "noTypeCheckSection", 0);
        term60751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60751, term60751.getClass(), "type", 153);
        setField(term60751, term60751.getClass(), "next", null);
        setField(term60751, term60751.getClass(), "first", null);
        setField(term60751, term60751.getClass(), "last", null);
        setField(term60751, term60751.getClass(), "propListHead", null);
        setIntField(term60751, term60751.getClass(), "sourcePosition", 0);
        setField(term60751, term60751.getClass(), "jsType", null);
        setField(term60751, term60751.getClass(), "parent", null);
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
        args[1] = term60734;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term60664, args);
        assertTrue(recursiveEquals(term60664, term60750));
        assertTrue(recursiveEquals(term60734, null));
    }

};


