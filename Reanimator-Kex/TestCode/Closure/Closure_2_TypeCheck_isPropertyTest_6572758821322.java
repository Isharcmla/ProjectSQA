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

public class TypeCheck_isPropertyTest_6572758821322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399611;
     Object term399681;
     Object term399701;
     Object term399702;

    public TypeCheck_isPropertyTest_6572758821322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399611 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term399681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term399681, term399681.getClass(), "parent", term399681);
        setIntField(term399681, term399681.getClass(), "type", 37);
        setField(term399681, term399681.getClass(), "first", term399681);
        term399701 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term399701, term399701.getClass(), "compiler", null);
        setField(term399701, term399701.getClass(), "validator", null);
        setField(term399701, term399701.getClass(), "reverseInterpreter", null);
        setField(term399701, term399701.getClass(), "typeRegistry", null);
        setField(term399701, term399701.getClass(), "topScope", null);
        setField(term399701, term399701.getClass(), "scopeCreator", null);
        setField(term399701, term399701.getClass(), "reportMissingOverride", null);
        setField(term399701, term399701.getClass(), "reportUnknownTypes", null);
        setBooleanField(term399701, term399701.getClass(), "reportMissingProperties", false);
        setField(term399701, term399701.getClass(), "inferJSDocInfo", null);
        setIntField(term399701, term399701.getClass(), "typedCount", 0);
        setIntField(term399701, term399701.getClass(), "nullCount", 0);
        setIntField(term399701, term399701.getClass(), "unknownCount", 0);
        setBooleanField(term399701, term399701.getClass(), "inExterns", false);
        setIntField(term399701, term399701.getClass(), "noTypeCheckSection", 0);
        term399702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term399702, term399702.getClass(), "type", 37);
        setField(term399702, term399702.getClass(), "next", null);
        setField(term399702, term399702.getClass(), "first", term399702);
        setField(term399702, term399702.getClass(), "last", null);
        setField(term399702, term399702.getClass(), "propListHead", null);
        setIntField(term399702, term399702.getClass(), "sourcePosition", 0);
        setField(term399702, term399702.getClass(), "jsType", null);
        setField(term399702, term399702.getClass(), "parent", term399702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term399681;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term399611, args);
        assertTrue(recursiveEquals(term399611, term399701));
        assertTrue(recursiveEquals(term399681, term399702));
        assertTrue(recursiveEquals(retValue, false));
    }

};


