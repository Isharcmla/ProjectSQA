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

public class TypeCheck_isPropertyTest_657275882335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81476;
     Object term81546;
     Object term82104;
     Object term82105;

    public TypeCheck_isPropertyTest_657275882335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81476 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81546, term81546.getClass(), "parent", term81546);
        setIntField(term81546, term81546.getClass(), "type", 113);
        setField(term81546, term81546.getClass(), "first", term81546);
        term82104 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term82104, term82104.getClass(), "compiler", null);
        setField(term82104, term82104.getClass(), "validator", null);
        setField(term82104, term82104.getClass(), "reverseInterpreter", null);
        setField(term82104, term82104.getClass(), "typeRegistry", null);
        setField(term82104, term82104.getClass(), "topScope", null);
        setField(term82104, term82104.getClass(), "scopeCreator", null);
        setField(term82104, term82104.getClass(), "reportMissingOverride", null);
        setField(term82104, term82104.getClass(), "reportUnknownTypes", null);
        setBooleanField(term82104, term82104.getClass(), "reportMissingProperties", false);
        setField(term82104, term82104.getClass(), "inferJSDocInfo", null);
        setIntField(term82104, term82104.getClass(), "typedCount", 0);
        setIntField(term82104, term82104.getClass(), "nullCount", 0);
        setIntField(term82104, term82104.getClass(), "unknownCount", 0);
        setBooleanField(term82104, term82104.getClass(), "inExterns", false);
        setIntField(term82104, term82104.getClass(), "noTypeCheckSection", 0);
        term82105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82105, term82105.getClass(), "type", 113);
        setField(term82105, term82105.getClass(), "next", null);
        setField(term82105, term82105.getClass(), "first", term82105);
        setField(term82105, term82105.getClass(), "last", null);
        setField(term82105, term82105.getClass(), "propListHead", null);
        setIntField(term82105, term82105.getClass(), "sourcePosition", 0);
        setField(term82105, term82105.getClass(), "jsType", null);
        setField(term82105, term82105.getClass(), "parent", term82105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81546;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term81476, args);
        assertTrue(recursiveEquals(term81476, term82104));
        assertTrue(recursiveEquals(term81546, term82105));
        assertTrue(recursiveEquals(retValue, true));
    }

};


