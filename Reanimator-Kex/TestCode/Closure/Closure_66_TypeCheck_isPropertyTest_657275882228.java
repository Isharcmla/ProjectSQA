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

public class TypeCheck_isPropertyTest_657275882228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59365;
     Object term59435;
     Object term59459;
     Object term59460;

    public TypeCheck_isPropertyTest_657275882228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59365 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term59435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59435, term59435.getClass(), "parent", term59435);
        setIntField(term59435, term59435.getClass(), "type", 26);
        term59459 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term59459, term59459.getClass(), "compiler", null);
        setField(term59459, term59459.getClass(), "validator", null);
        setField(term59459, term59459.getClass(), "reverseInterpreter", null);
        setField(term59459, term59459.getClass(), "typeRegistry", null);
        setField(term59459, term59459.getClass(), "topScope", null);
        setField(term59459, term59459.getClass(), "scopeCreator", null);
        setField(term59459, term59459.getClass(), "reportMissingOverride", null);
        setField(term59459, term59459.getClass(), "reportUnknownTypes", null);
        setBooleanField(term59459, term59459.getClass(), "reportMissingProperties", false);
        setField(term59459, term59459.getClass(), "inferJSDocInfo", null);
        setIntField(term59459, term59459.getClass(), "typedCount", 0);
        setIntField(term59459, term59459.getClass(), "nullCount", 0);
        setIntField(term59459, term59459.getClass(), "unknownCount", 0);
        setBooleanField(term59459, term59459.getClass(), "inExterns", false);
        setIntField(term59459, term59459.getClass(), "noTypeCheckSection", 0);
        term59460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59460, term59460.getClass(), "type", 26);
        setField(term59460, term59460.getClass(), "next", null);
        setField(term59460, term59460.getClass(), "first", null);
        setField(term59460, term59460.getClass(), "last", null);
        setField(term59460, term59460.getClass(), "propListHead", null);
        setIntField(term59460, term59460.getClass(), "sourcePosition", 0);
        setField(term59460, term59460.getClass(), "jsType", null);
        setField(term59460, term59460.getClass(), "parent", term59460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term59435;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term59365, args);
        assertTrue(recursiveEquals(term59365, term59459));
        assertTrue(recursiveEquals(term59435, term59460));
        assertTrue(recursiveEquals(retValue, false));
    }

};


