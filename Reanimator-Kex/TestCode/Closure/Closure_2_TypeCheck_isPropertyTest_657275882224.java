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

public class TypeCheck_isPropertyTest_657275882224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56648;
     Object term56718;
     Object term57040;
     Object term57041;

    public TypeCheck_isPropertyTest_657275882224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56648 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term56718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56718, term56718.getClass(), "parent", term56718);
        setIntField(term56718, term56718.getClass(), "type", 32);
        term57040 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term57040, term57040.getClass(), "compiler", null);
        setField(term57040, term57040.getClass(), "validator", null);
        setField(term57040, term57040.getClass(), "reverseInterpreter", null);
        setField(term57040, term57040.getClass(), "typeRegistry", null);
        setField(term57040, term57040.getClass(), "topScope", null);
        setField(term57040, term57040.getClass(), "scopeCreator", null);
        setField(term57040, term57040.getClass(), "reportMissingOverride", null);
        setField(term57040, term57040.getClass(), "reportUnknownTypes", null);
        setBooleanField(term57040, term57040.getClass(), "reportMissingProperties", false);
        setField(term57040, term57040.getClass(), "inferJSDocInfo", null);
        setIntField(term57040, term57040.getClass(), "typedCount", 0);
        setIntField(term57040, term57040.getClass(), "nullCount", 0);
        setIntField(term57040, term57040.getClass(), "unknownCount", 0);
        setBooleanField(term57040, term57040.getClass(), "inExterns", false);
        setIntField(term57040, term57040.getClass(), "noTypeCheckSection", 0);
        term57041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57041, term57041.getClass(), "type", 32);
        setField(term57041, term57041.getClass(), "next", null);
        setField(term57041, term57041.getClass(), "first", null);
        setField(term57041, term57041.getClass(), "last", null);
        setField(term57041, term57041.getClass(), "propListHead", null);
        setIntField(term57041, term57041.getClass(), "sourcePosition", 0);
        setField(term57041, term57041.getClass(), "jsType", null);
        setField(term57041, term57041.getClass(), "parent", term57041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56718;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term56648, args);
        assertTrue(recursiveEquals(term56648, term57040));
        assertTrue(recursiveEquals(term56718, term57041));
        assertTrue(recursiveEquals(retValue, true));
    }

};


