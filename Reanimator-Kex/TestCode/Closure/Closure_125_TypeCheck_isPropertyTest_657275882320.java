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

public class TypeCheck_isPropertyTest_657275882320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78711;
     Object term78781;
     Object term78819;
     Object term78820;

    public TypeCheck_isPropertyTest_657275882320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78711 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term78781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78781, term78781.getClass(), "parent", term78781);
        setIntField(term78781, term78781.getClass(), "type", 32);
        term78819 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term78819, term78819.getClass(), "compiler", null);
        setField(term78819, term78819.getClass(), "validator", null);
        setField(term78819, term78819.getClass(), "reverseInterpreter", null);
        setField(term78819, term78819.getClass(), "typeRegistry", null);
        setField(term78819, term78819.getClass(), "topScope", null);
        setField(term78819, term78819.getClass(), "scopeCreator", null);
        setField(term78819, term78819.getClass(), "reportMissingOverride", null);
        setBooleanField(term78819, term78819.getClass(), "reportUnknownTypes", false);
        setBooleanField(term78819, term78819.getClass(), "reportMissingProperties", false);
        setField(term78819, term78819.getClass(), "inferJSDocInfo", null);
        setIntField(term78819, term78819.getClass(), "typedCount", 0);
        setIntField(term78819, term78819.getClass(), "nullCount", 0);
        setIntField(term78819, term78819.getClass(), "unknownCount", 0);
        setBooleanField(term78819, term78819.getClass(), "inExterns", false);
        setIntField(term78819, term78819.getClass(), "noTypeCheckSection", 0);
        setField(term78819, term78819.getClass(), "editDistance", null);
        term78820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78820, term78820.getClass(), "type", 32);
        setField(term78820, term78820.getClass(), "next", null);
        setField(term78820, term78820.getClass(), "first", null);
        setField(term78820, term78820.getClass(), "last", null);
        setField(term78820, term78820.getClass(), "propListHead", null);
        setIntField(term78820, term78820.getClass(), "sourcePosition", 0);
        setField(term78820, term78820.getClass(), "jsType", null);
        setField(term78820, term78820.getClass(), "parent", term78820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78781;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term78711, args);
        assertTrue(recursiveEquals(term78711, term78819));
        assertTrue(recursiveEquals(term78781, term78820));
        assertTrue(recursiveEquals(retValue, true));
    }

};


