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

public class TypeCheck_ensureTyped_103120306222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57739;
     Object term57809;
     Object term57829;
     Object term57830;

    public TypeCheck_ensureTyped_103120306222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57739 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term57809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57809, term57809.getClass(), "type", -106);
        setField(term57809, term57809.getClass(), "propListHead", null);
        term57829 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term57829, term57829.getClass(), "compiler", null);
        setField(term57829, term57829.getClass(), "validator", null);
        setField(term57829, term57829.getClass(), "reverseInterpreter", null);
        setField(term57829, term57829.getClass(), "typeRegistry", null);
        setField(term57829, term57829.getClass(), "topScope", null);
        setField(term57829, term57829.getClass(), "scopeCreator", null);
        setField(term57829, term57829.getClass(), "reportMissingOverride", null);
        setField(term57829, term57829.getClass(), "reportUnknownTypes", null);
        setBooleanField(term57829, term57829.getClass(), "reportMissingProperties", false);
        setField(term57829, term57829.getClass(), "inferJSDocInfo", null);
        setIntField(term57829, term57829.getClass(), "typedCount", 0);
        setIntField(term57829, term57829.getClass(), "nullCount", 0);
        setIntField(term57829, term57829.getClass(), "unknownCount", 0);
        setBooleanField(term57829, term57829.getClass(), "inExterns", false);
        setIntField(term57829, term57829.getClass(), "noTypeCheckSection", 0);
        term57830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57830, term57830.getClass(), "type", -106);
        setField(term57830, term57830.getClass(), "next", null);
        setField(term57830, term57830.getClass(), "first", null);
        setField(term57830, term57830.getClass(), "last", null);
        setField(term57830, term57830.getClass(), "propListHead", null);
        setIntField(term57830, term57830.getClass(), "sourcePosition", 0);
        setField(term57830, term57830.getClass(), "jsType", null);
        setField(term57830, term57830.getClass(), "parent", null);
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
        args[1] = term57809;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term57739, args);
        assertTrue(recursiveEquals(term57739, term57829));
        assertTrue(recursiveEquals(term57809, null));
    }

};


