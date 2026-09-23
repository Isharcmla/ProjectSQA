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

public class TypeCheck_doPercentTypedAccounting_337287087335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81236;
     Object term81306;
     Object term81768;
     Object term81769;

    public TypeCheck_doPercentTypedAccounting_337287087335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81236 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term81306, term81306.getClass(), "jsType", term81396);
        term81768 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term81768, term81768.getClass(), "compiler", null);
        setField(term81768, term81768.getClass(), "validator", null);
        setField(term81768, term81768.getClass(), "reverseInterpreter", null);
        setField(term81768, term81768.getClass(), "typeRegistry", null);
        setField(term81768, term81768.getClass(), "topScope", null);
        setField(term81768, term81768.getClass(), "scopeCreator", null);
        setField(term81768, term81768.getClass(), "reportMissingOverride", null);
        setBooleanField(term81768, term81768.getClass(), "reportUnknownTypes", false);
        setBooleanField(term81768, term81768.getClass(), "reportMissingProperties", false);
        setField(term81768, term81768.getClass(), "inferJSDocInfo", null);
        setIntField(term81768, term81768.getClass(), "typedCount", 1);
        setIntField(term81768, term81768.getClass(), "nullCount", 0);
        setIntField(term81768, term81768.getClass(), "unknownCount", 0);
        setBooleanField(term81768, term81768.getClass(), "inExterns", false);
        setIntField(term81768, term81768.getClass(), "noTypeCheckSection", 0);
        setField(term81768, term81768.getClass(), "editDistance", null);
        term81769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term81769, term81769.getClass(), "type", 0);
        setField(term81769, term81769.getClass(), "next", null);
        setField(term81769, term81769.getClass(), "first", null);
        setField(term81769, term81769.getClass(), "last", null);
        setField(term81769, term81769.getClass(), "propListHead", null);
        setIntField(term81769, term81769.getClass(), "sourcePosition", 0);
        setBooleanField(term81770, term81770.getClass(), "resolved", false);
        setField(term81770, term81770.getClass(), "resolveResult", null);
        setField(term81770, term81770.getClass(), "templateTypeMap", null);
        setBooleanField(term81770, term81770.getClass(), "inTemplatedCheckVisit", false);
        setField(term81770, term81770.getClass(), "registry", null);
        setField(term81769, term81769.getClass(), "jsType", term81770);
        setField(term81769, term81769.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81306;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term81236, args);
        assertTrue(recursiveEquals(term81236, term81768));
        assertTrue(recursiveEquals(term81306, null));
    }

};


