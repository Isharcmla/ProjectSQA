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

public class TypeCheck_isPropertyTest_657275882201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50452;
     Object term50522;
     Object term50720;
     Object term50721;

    public TypeCheck_isPropertyTest_657275882201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50452 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term50522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50522, term50522.getClass(), "parent", term50522);
        setIntField(term50522, term50522.getClass(), "type", 101);
        term50720 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term50720, term50720.getClass(), "compiler", null);
        setField(term50720, term50720.getClass(), "validator", null);
        setField(term50720, term50720.getClass(), "reverseInterpreter", null);
        setField(term50720, term50720.getClass(), "typeRegistry", null);
        setField(term50720, term50720.getClass(), "topScope", null);
        setField(term50720, term50720.getClass(), "scopeCreator", null);
        setField(term50720, term50720.getClass(), "reportMissingOverride", null);
        setField(term50720, term50720.getClass(), "reportUnknownTypes", null);
        setBooleanField(term50720, term50720.getClass(), "reportMissingProperties", false);
        setField(term50720, term50720.getClass(), "inferJSDocInfo", null);
        setIntField(term50720, term50720.getClass(), "typedCount", 0);
        setIntField(term50720, term50720.getClass(), "nullCount", 0);
        setIntField(term50720, term50720.getClass(), "unknownCount", 0);
        setBooleanField(term50720, term50720.getClass(), "inExterns", false);
        setIntField(term50720, term50720.getClass(), "noTypeCheckSection", 0);
        term50721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50721, term50721.getClass(), "type", 101);
        setField(term50721, term50721.getClass(), "next", null);
        setField(term50721, term50721.getClass(), "first", null);
        setField(term50721, term50721.getClass(), "last", null);
        setField(term50721, term50721.getClass(), "propListHead", null);
        setIntField(term50721, term50721.getClass(), "sourcePosition", 0);
        setField(term50721, term50721.getClass(), "jsType", null);
        setField(term50721, term50721.getClass(), "parent", term50721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50522;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term50452, args);
        assertTrue(recursiveEquals(term50452, term50720));
        assertTrue(recursiveEquals(term50522, term50721));
        assertTrue(recursiveEquals(retValue, false));
    }

};


