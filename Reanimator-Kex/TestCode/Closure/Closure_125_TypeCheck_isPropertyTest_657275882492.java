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

public class TypeCheck_isPropertyTest_657275882492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127951;
     Object term128021;
     Object term128042;
     Object term128043;

    public TypeCheck_isPropertyTest_657275882492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127951 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term128021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128021, term128021.getClass(), "parent", term128021);
        setIntField(term128021, term128021.getClass(), "type", 37);
        setField(term128021, term128021.getClass(), "first", term128021);
        term128042 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term128042, term128042.getClass(), "compiler", null);
        setField(term128042, term128042.getClass(), "validator", null);
        setField(term128042, term128042.getClass(), "reverseInterpreter", null);
        setField(term128042, term128042.getClass(), "typeRegistry", null);
        setField(term128042, term128042.getClass(), "topScope", null);
        setField(term128042, term128042.getClass(), "scopeCreator", null);
        setField(term128042, term128042.getClass(), "reportMissingOverride", null);
        setBooleanField(term128042, term128042.getClass(), "reportUnknownTypes", false);
        setBooleanField(term128042, term128042.getClass(), "reportMissingProperties", false);
        setField(term128042, term128042.getClass(), "inferJSDocInfo", null);
        setIntField(term128042, term128042.getClass(), "typedCount", 0);
        setIntField(term128042, term128042.getClass(), "nullCount", 0);
        setIntField(term128042, term128042.getClass(), "unknownCount", 0);
        setBooleanField(term128042, term128042.getClass(), "inExterns", false);
        setIntField(term128042, term128042.getClass(), "noTypeCheckSection", 0);
        setField(term128042, term128042.getClass(), "editDistance", null);
        term128043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128043, term128043.getClass(), "type", 37);
        setField(term128043, term128043.getClass(), "next", null);
        setField(term128043, term128043.getClass(), "first", term128043);
        setField(term128043, term128043.getClass(), "last", null);
        setField(term128043, term128043.getClass(), "propListHead", null);
        setIntField(term128043, term128043.getClass(), "sourcePosition", 0);
        setField(term128043, term128043.getClass(), "jsType", null);
        setField(term128043, term128043.getClass(), "parent", term128043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128021;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term127951, args);
        assertTrue(recursiveEquals(term127951, term128042));
        assertTrue(recursiveEquals(term128021, term128043));
        assertTrue(recursiveEquals(retValue, false));
    }

};


