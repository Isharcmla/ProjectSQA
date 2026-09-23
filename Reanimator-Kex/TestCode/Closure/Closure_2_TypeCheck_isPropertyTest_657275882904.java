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

public class TypeCheck_isPropertyTest_657275882904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253295;
     Object term253365;
     Object term253642;
     Object term253643;

    public TypeCheck_isPropertyTest_657275882904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term253365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term253365, term253365.getClass(), "parent", term253365);
        setIntField(term253365, term253365.getClass(), "type", 101);
        setField(term253365, term253365.getClass(), "first", term253365);
        term253642 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term253642, term253642.getClass(), "compiler", null);
        setField(term253642, term253642.getClass(), "validator", null);
        setField(term253642, term253642.getClass(), "reverseInterpreter", null);
        setField(term253642, term253642.getClass(), "typeRegistry", null);
        setField(term253642, term253642.getClass(), "topScope", null);
        setField(term253642, term253642.getClass(), "scopeCreator", null);
        setField(term253642, term253642.getClass(), "reportMissingOverride", null);
        setField(term253642, term253642.getClass(), "reportUnknownTypes", null);
        setBooleanField(term253642, term253642.getClass(), "reportMissingProperties", false);
        setField(term253642, term253642.getClass(), "inferJSDocInfo", null);
        setIntField(term253642, term253642.getClass(), "typedCount", 0);
        setIntField(term253642, term253642.getClass(), "nullCount", 0);
        setIntField(term253642, term253642.getClass(), "unknownCount", 0);
        setBooleanField(term253642, term253642.getClass(), "inExterns", false);
        setIntField(term253642, term253642.getClass(), "noTypeCheckSection", 0);
        term253643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term253643, term253643.getClass(), "type", 101);
        setField(term253643, term253643.getClass(), "next", null);
        setField(term253643, term253643.getClass(), "first", term253643);
        setField(term253643, term253643.getClass(), "last", null);
        setField(term253643, term253643.getClass(), "propListHead", null);
        setIntField(term253643, term253643.getClass(), "sourcePosition", 0);
        setField(term253643, term253643.getClass(), "jsType", null);
        setField(term253643, term253643.getClass(), "parent", term253643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term253365;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term253295, args);
        assertTrue(recursiveEquals(term253295, term253642));
        assertTrue(recursiveEquals(term253365, term253643));
        assertTrue(recursiveEquals(retValue, true));
    }

};


