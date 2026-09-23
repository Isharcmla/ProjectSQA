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

public class TypeCheck_isPropertyTest_657275882255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62157;
     Object term62227;
     Object term64079;
     Object term64080;

    public TypeCheck_isPropertyTest_657275882255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term62227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62227, term62227.getClass(), "parent", term62227);
        setIntField(term62227, term62227.getClass(), "type", 114);
        term64079 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term64079, term64079.getClass(), "compiler", null);
        setField(term64079, term64079.getClass(), "validator", null);
        setField(term64079, term64079.getClass(), "reverseInterpreter", null);
        setField(term64079, term64079.getClass(), "typeRegistry", null);
        setField(term64079, term64079.getClass(), "topScope", null);
        setField(term64079, term64079.getClass(), "scopeCreator", null);
        setField(term64079, term64079.getClass(), "reportMissingOverride", null);
        setBooleanField(term64079, term64079.getClass(), "reportUnknownTypes", false);
        setBooleanField(term64079, term64079.getClass(), "reportMissingProperties", false);
        setField(term64079, term64079.getClass(), "inferJSDocInfo", null);
        setIntField(term64079, term64079.getClass(), "typedCount", 0);
        setIntField(term64079, term64079.getClass(), "nullCount", 0);
        setIntField(term64079, term64079.getClass(), "unknownCount", 0);
        setBooleanField(term64079, term64079.getClass(), "inExterns", false);
        setIntField(term64079, term64079.getClass(), "noTypeCheckSection", 0);
        setField(term64079, term64079.getClass(), "editDistance", null);
        term64080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64080, term64080.getClass(), "type", 114);
        setField(term64080, term64080.getClass(), "next", null);
        setField(term64080, term64080.getClass(), "first", null);
        setField(term64080, term64080.getClass(), "last", null);
        setField(term64080, term64080.getClass(), "propListHead", null);
        setIntField(term64080, term64080.getClass(), "sourcePosition", 0);
        setField(term64080, term64080.getClass(), "jsType", null);
        setField(term64080, term64080.getClass(), "parent", term64080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62227;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term62157, args);
        assertTrue(recursiveEquals(term62157, term64079));
        assertTrue(recursiveEquals(term62227, term64080));
        assertTrue(recursiveEquals(retValue, false));
    }

};


