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

public class TypeCheck_visitName_1546932345144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38441;
     Object term38511;
     Object term38786;
     Object term38787;

    public TypeCheck_visitName_1546932345144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38441 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term38511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38511, term38511.getClass(), "type", 118);
        term38786 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term38786, term38786.getClass(), "compiler", null);
        setField(term38786, term38786.getClass(), "validator", null);
        setField(term38786, term38786.getClass(), "reverseInterpreter", null);
        setField(term38786, term38786.getClass(), "typeRegistry", null);
        setField(term38786, term38786.getClass(), "topScope", null);
        setField(term38786, term38786.getClass(), "scopeCreator", null);
        setField(term38786, term38786.getClass(), "reportMissingOverride", null);
        setField(term38786, term38786.getClass(), "reportUnknownTypes", null);
        setBooleanField(term38786, term38786.getClass(), "reportMissingProperties", false);
        setField(term38786, term38786.getClass(), "inferJSDocInfo", null);
        setIntField(term38786, term38786.getClass(), "typedCount", 0);
        setIntField(term38786, term38786.getClass(), "nullCount", 0);
        setIntField(term38786, term38786.getClass(), "unknownCount", 0);
        setBooleanField(term38786, term38786.getClass(), "inExterns", false);
        setIntField(term38786, term38786.getClass(), "noTypeCheckSection", 0);
        term38787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38787, term38787.getClass(), "type", 118);
        setField(term38787, term38787.getClass(), "next", null);
        setField(term38787, term38787.getClass(), "first", null);
        setField(term38787, term38787.getClass(), "last", null);
        setField(term38787, term38787.getClass(), "propListHead", null);
        setIntField(term38787, term38787.getClass(), "sourcePosition", 0);
        setField(term38787, term38787.getClass(), "jsType", null);
        setField(term38787, term38787.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term38511;
        Object retValue = callMethod(klass, "visitName", argTypes, term38441, args);
        assertTrue(recursiveEquals(term38441, term38786));
        assertTrue(recursiveEquals(term38511, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


