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

public class TypeCheck_visitName_1546932345145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37612;
     Object term37682;
     Object term37864;
     Object term37865;

    public TypeCheck_visitName_1546932345145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37612 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term37682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37682, term37682.getClass(), "type", 118);
        term37864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term37864, term37864.getClass(), "compiler", null);
        setField(term37864, term37864.getClass(), "validator", null);
        setField(term37864, term37864.getClass(), "reverseInterpreter", null);
        setField(term37864, term37864.getClass(), "typeRegistry", null);
        setField(term37864, term37864.getClass(), "topScope", null);
        setField(term37864, term37864.getClass(), "scopeCreator", null);
        setField(term37864, term37864.getClass(), "reportMissingOverride", null);
        setField(term37864, term37864.getClass(), "reportUnknownTypes", null);
        setBooleanField(term37864, term37864.getClass(), "reportMissingProperties", false);
        setField(term37864, term37864.getClass(), "inferJSDocInfo", null);
        setIntField(term37864, term37864.getClass(), "typedCount", 0);
        setIntField(term37864, term37864.getClass(), "nullCount", 0);
        setIntField(term37864, term37864.getClass(), "unknownCount", 0);
        setBooleanField(term37864, term37864.getClass(), "inExterns", false);
        setIntField(term37864, term37864.getClass(), "noTypeCheckSection", 0);
        term37865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37865, term37865.getClass(), "type", 118);
        setField(term37865, term37865.getClass(), "next", null);
        setField(term37865, term37865.getClass(), "first", null);
        setField(term37865, term37865.getClass(), "last", null);
        setField(term37865, term37865.getClass(), "propListHead", null);
        setIntField(term37865, term37865.getClass(), "sourcePosition", 0);
        setField(term37865, term37865.getClass(), "jsType", null);
        setField(term37865, term37865.getClass(), "parent", null);
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
        args[2] = term37682;
        Object retValue = callMethod(klass, "visitName", argTypes, term37612, args);
        assertTrue(recursiveEquals(term37612, term37864));
        assertTrue(recursiveEquals(term37682, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


