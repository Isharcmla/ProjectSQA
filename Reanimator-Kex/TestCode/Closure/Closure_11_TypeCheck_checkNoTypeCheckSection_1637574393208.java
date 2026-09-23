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

public class TypeCheck_checkNoTypeCheckSection_1637574393208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50085;
     Object term50245;
     Object term50522;
     Object term50524;

    public TypeCheck_checkNoTypeCheckSection_1637574393208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50085 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term50175 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term50085, term50085.getClass(), "validator", term50175);
        setIntField(term50085, term50085.getClass(), "noTypeCheckSection", 0);
        term50245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50245, term50245.getClass(), "type", 132);
        setField(term50245, term50245.getClass(), "propListHead", null);
        term50522 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term50523 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term50522, term50522.getClass(), "compiler", null);
        setField(term50523, term50523.getClass(), "compiler", null);
        setField(term50523, term50523.getClass(), "typeRegistry", null);
        setField(term50523, term50523.getClass(), "allValueTypes", null);
        setBooleanField(term50523, term50523.getClass(), "shouldReport", true);
        setField(term50523, term50523.getClass(), "nullOrUndefined", null);
        setField(term50523, term50523.getClass(), "mismatches", null);
        setField(term50522, term50522.getClass(), "validator", term50523);
        setField(term50522, term50522.getClass(), "reverseInterpreter", null);
        setField(term50522, term50522.getClass(), "typeRegistry", null);
        setField(term50522, term50522.getClass(), "topScope", null);
        setField(term50522, term50522.getClass(), "scopeCreator", null);
        setField(term50522, term50522.getClass(), "reportMissingOverride", null);
        setField(term50522, term50522.getClass(), "reportUnknownTypes", null);
        setBooleanField(term50522, term50522.getClass(), "reportMissingProperties", false);
        setField(term50522, term50522.getClass(), "inferJSDocInfo", null);
        setIntField(term50522, term50522.getClass(), "typedCount", 0);
        setIntField(term50522, term50522.getClass(), "nullCount", 0);
        setIntField(term50522, term50522.getClass(), "unknownCount", 0);
        setBooleanField(term50522, term50522.getClass(), "inExterns", false);
        setIntField(term50522, term50522.getClass(), "noTypeCheckSection", 0);
        term50524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50524, term50524.getClass(), "type", 132);
        setField(term50524, term50524.getClass(), "next", null);
        setField(term50524, term50524.getClass(), "first", null);
        setField(term50524, term50524.getClass(), "last", null);
        setField(term50524, term50524.getClass(), "propListHead", null);
        setIntField(term50524, term50524.getClass(), "sourcePosition", 0);
        setField(term50524, term50524.getClass(), "jsType", null);
        setField(term50524, term50524.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term50245;
        args[1] = false;
        callMethod(klass, "checkNoTypeCheckSection", argTypes, term50085, args);
        assertTrue(recursiveEquals(term50085, term50522));
        assertTrue(recursiveEquals(term50245, term50524));
    }

};


