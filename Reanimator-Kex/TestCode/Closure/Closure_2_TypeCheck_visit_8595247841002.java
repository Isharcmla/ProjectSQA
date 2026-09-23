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

public class TypeCheck_visit_8595247841002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284150;
     Object term284242;
     Object term284259;
     Object term284260;

    public TypeCheck_visit_8595247841002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284150 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term284242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term284242, term284242.getClass(), "type", 153);
        term284259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term284259, term284259.getClass(), "compiler", null);
        setField(term284259, term284259.getClass(), "validator", null);
        setField(term284259, term284259.getClass(), "reverseInterpreter", null);
        setField(term284259, term284259.getClass(), "typeRegistry", null);
        setField(term284259, term284259.getClass(), "topScope", null);
        setField(term284259, term284259.getClass(), "scopeCreator", null);
        setField(term284259, term284259.getClass(), "reportMissingOverride", null);
        setField(term284259, term284259.getClass(), "reportUnknownTypes", null);
        setBooleanField(term284259, term284259.getClass(), "reportMissingProperties", false);
        setField(term284259, term284259.getClass(), "inferJSDocInfo", null);
        setIntField(term284259, term284259.getClass(), "typedCount", 0);
        setIntField(term284259, term284259.getClass(), "nullCount", 0);
        setIntField(term284259, term284259.getClass(), "unknownCount", 0);
        setBooleanField(term284259, term284259.getClass(), "inExterns", false);
        setIntField(term284259, term284259.getClass(), "noTypeCheckSection", 0);
        term284260 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term284260, term284260.getClass(), "number", 0.0);
        setIntField(term284260, term284260.getClass(), "type", 153);
        setField(term284260, term284260.getClass(), "next", null);
        setField(term284260, term284260.getClass(), "first", null);
        setField(term284260, term284260.getClass(), "last", null);
        setField(term284260, term284260.getClass(), "propListHead", null);
        setIntField(term284260, term284260.getClass(), "sourcePosition", 0);
        setField(term284260, term284260.getClass(), "jsType", null);
        setField(term284260, term284260.getClass(), "parent", null);
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
        args[1] = term284242;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term284150, args);
        assertTrue(recursiveEquals(term284150, term284259));
        assertTrue(recursiveEquals(term284242, null));
    }

};


