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

public class TypeCheck_checkPropCreation_2142023436183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44801;
     Object term44871;
     Object term45735;
     Object term45736;

    public TypeCheck_checkPropCreation_2142023436183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44801 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term44871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term45735 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45735, term45735.getClass(), "compiler", null);
        setField(term45735, term45735.getClass(), "validator", null);
        setField(term45735, term45735.getClass(), "reverseInterpreter", null);
        setField(term45735, term45735.getClass(), "typeRegistry", null);
        setField(term45735, term45735.getClass(), "topScope", null);
        setField(term45735, term45735.getClass(), "scopeCreator", null);
        setField(term45735, term45735.getClass(), "reportMissingOverride", null);
        setField(term45735, term45735.getClass(), "reportUnknownTypes", null);
        setBooleanField(term45735, term45735.getClass(), "reportMissingProperties", false);
        setField(term45735, term45735.getClass(), "inferJSDocInfo", null);
        setIntField(term45735, term45735.getClass(), "typedCount", 0);
        setIntField(term45735, term45735.getClass(), "nullCount", 0);
        setIntField(term45735, term45735.getClass(), "unknownCount", 0);
        setBooleanField(term45735, term45735.getClass(), "inExterns", false);
        setIntField(term45735, term45735.getClass(), "noTypeCheckSection", 0);
        term45736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45736, term45736.getClass(), "type", 0);
        setField(term45736, term45736.getClass(), "next", null);
        setField(term45736, term45736.getClass(), "first", null);
        setField(term45736, term45736.getClass(), "last", null);
        setField(term45736, term45736.getClass(), "propListHead", null);
        setIntField(term45736, term45736.getClass(), "sourcePosition", 0);
        setField(term45736, term45736.getClass(), "jsType", null);
        setField(term45736, term45736.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44871;
        callMethod(klass, "checkPropCreation", argTypes, term44801, args);
        assertTrue(recursiveEquals(term44801, term45735));
        assertTrue(recursiveEquals(term44871, null));
    }

};


