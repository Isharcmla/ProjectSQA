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

public class TypeCheck_doPercentTypedAccounting_3372870871632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522664;
     Object term522734;
     Object term522853;
     Object term522854;

    public TypeCheck_doPercentTypedAccounting_3372870871632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522664 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term522734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term522830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term522734, term522734.getClass(), "jsType", term522830);
        term522853 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term522853, term522853.getClass(), "compiler", null);
        setField(term522853, term522853.getClass(), "validator", null);
        setField(term522853, term522853.getClass(), "reverseInterpreter", null);
        setField(term522853, term522853.getClass(), "typeRegistry", null);
        setField(term522853, term522853.getClass(), "topScope", null);
        setField(term522853, term522853.getClass(), "scopeCreator", null);
        setField(term522853, term522853.getClass(), "reportMissingOverride", null);
        setField(term522853, term522853.getClass(), "reportUnknownTypes", null);
        setBooleanField(term522853, term522853.getClass(), "reportMissingProperties", false);
        setField(term522853, term522853.getClass(), "inferJSDocInfo", null);
        setIntField(term522853, term522853.getClass(), "typedCount", 1);
        setIntField(term522853, term522853.getClass(), "nullCount", 0);
        setIntField(term522853, term522853.getClass(), "unknownCount", 0);
        setBooleanField(term522853, term522853.getClass(), "inExterns", false);
        setIntField(term522853, term522853.getClass(), "noTypeCheckSection", 0);
        term522854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term522855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term522854, term522854.getClass(), "type", 0);
        setField(term522854, term522854.getClass(), "next", null);
        setField(term522854, term522854.getClass(), "first", null);
        setField(term522854, term522854.getClass(), "last", null);
        setField(term522854, term522854.getClass(), "propListHead", null);
        setIntField(term522854, term522854.getClass(), "sourcePosition", 0);
        setBooleanField(term522855, term522855.getClass(), "resolved", false);
        setField(term522855, term522855.getClass(), "resolveResult", null);
        setBooleanField(term522855, term522855.getClass(), "inTemplatedCheckVisit", false);
        setField(term522855, term522855.getClass(), "registry", null);
        setField(term522854, term522854.getClass(), "jsType", term522855);
        setField(term522854, term522854.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term522734;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term522664, args);
        assertTrue(recursiveEquals(term522664, term522853));
        assertTrue(recursiveEquals(term522734, null));
    }

};


