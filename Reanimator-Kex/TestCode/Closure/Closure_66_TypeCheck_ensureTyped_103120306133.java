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

public class TypeCheck_ensureTyped_103120306133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35207;
     Object term35277;
     Object term35684;
     Object term35685;

    public TypeCheck_ensureTyped_103120306133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35207 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term35277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term35469 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term35277, term35277.getClass(), "type", -106);
        setIntField(term35373, term35373.getClass(), "type", -30);
        setField(term35373, term35373.getClass(), "next", term35469);
        setField(term35277, term35277.getClass(), "propListHead", term35373);
        term35684 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term35684, term35684.getClass(), "compiler", null);
        setField(term35684, term35684.getClass(), "validator", null);
        setField(term35684, term35684.getClass(), "reverseInterpreter", null);
        setField(term35684, term35684.getClass(), "typeRegistry", null);
        setField(term35684, term35684.getClass(), "topScope", null);
        setField(term35684, term35684.getClass(), "scopeCreator", null);
        setField(term35684, term35684.getClass(), "reportMissingOverride", null);
        setField(term35684, term35684.getClass(), "reportUnknownTypes", null);
        setBooleanField(term35684, term35684.getClass(), "reportMissingProperties", false);
        setField(term35684, term35684.getClass(), "inferJSDocInfo", null);
        setIntField(term35684, term35684.getClass(), "typedCount", 0);
        setIntField(term35684, term35684.getClass(), "nullCount", 0);
        setIntField(term35684, term35684.getClass(), "unknownCount", 0);
        setBooleanField(term35684, term35684.getClass(), "inExterns", false);
        setIntField(term35684, term35684.getClass(), "noTypeCheckSection", 0);
        term35685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35686 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term35687 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term35685, term35685.getClass(), "type", -106);
        setField(term35685, term35685.getClass(), "next", null);
        setField(term35685, term35685.getClass(), "first", null);
        setField(term35685, term35685.getClass(), "last", null);
        setField(term35687, term35687.getClass(), "next", null);
        setIntField(term35687, term35687.getClass(), "type", 0);
        setIntField(term35687, term35687.getClass(), "intValue", 0);
        setField(term35687, term35687.getClass(), "objectValue", null);
        setField(term35686, term35686.getClass(), "next", term35687);
        setIntField(term35686, term35686.getClass(), "type", -30);
        setIntField(term35686, term35686.getClass(), "intValue", 0);
        setField(term35686, term35686.getClass(), "objectValue", null);
        setField(term35685, term35685.getClass(), "propListHead", term35686);
        setIntField(term35685, term35685.getClass(), "sourcePosition", 0);
        setField(term35685, term35685.getClass(), "jsType", null);
        setField(term35685, term35685.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term35277;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term35207, args);
        assertTrue(recursiveEquals(term35207, term35684));
        assertTrue(recursiveEquals(term35277, null));
    }

};


