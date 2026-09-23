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

public class TypeCheck_ensureTyped_103120306256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73162;
     Object term73232;
     Object term73757;
     Object term73758;

    public TypeCheck_ensureTyped_103120306256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73162 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term73232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73328 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term73424 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term73232, term73232.getClass(), "type", -106);
        setIntField(term73328, term73328.getClass(), "type", -30);
        setField(term73328, term73328.getClass(), "next", term73424);
        setField(term73232, term73232.getClass(), "propListHead", term73328);
        term73757 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term73757, term73757.getClass(), "compiler", null);
        setField(term73757, term73757.getClass(), "validator", null);
        setField(term73757, term73757.getClass(), "reverseInterpreter", null);
        setField(term73757, term73757.getClass(), "typeRegistry", null);
        setField(term73757, term73757.getClass(), "topScope", null);
        setField(term73757, term73757.getClass(), "scopeCreator", null);
        setField(term73757, term73757.getClass(), "reportMissingOverride", null);
        setField(term73757, term73757.getClass(), "reportUnknownTypes", null);
        setBooleanField(term73757, term73757.getClass(), "reportMissingProperties", false);
        setField(term73757, term73757.getClass(), "inferJSDocInfo", null);
        setIntField(term73757, term73757.getClass(), "typedCount", 0);
        setIntField(term73757, term73757.getClass(), "nullCount", 0);
        setIntField(term73757, term73757.getClass(), "unknownCount", 0);
        setBooleanField(term73757, term73757.getClass(), "inExterns", false);
        setIntField(term73757, term73757.getClass(), "noTypeCheckSection", 0);
        term73758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73759 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term73760 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term73758, term73758.getClass(), "type", -106);
        setField(term73758, term73758.getClass(), "next", null);
        setField(term73758, term73758.getClass(), "first", null);
        setField(term73758, term73758.getClass(), "last", null);
        setField(term73760, term73760.getClass(), "next", null);
        setIntField(term73760, term73760.getClass(), "type", 0);
        setIntField(term73760, term73760.getClass(), "intValue", 0);
        setField(term73760, term73760.getClass(), "objectValue", null);
        setField(term73759, term73759.getClass(), "next", term73760);
        setIntField(term73759, term73759.getClass(), "type", -30);
        setIntField(term73759, term73759.getClass(), "intValue", 0);
        setField(term73759, term73759.getClass(), "objectValue", null);
        setField(term73758, term73758.getClass(), "propListHead", term73759);
        setIntField(term73758, term73758.getClass(), "sourcePosition", 0);
        setField(term73758, term73758.getClass(), "jsType", null);
        setField(term73758, term73758.getClass(), "parent", null);
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
        args[1] = term73232;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term73162, args);
        assertTrue(recursiveEquals(term73162, term73757));
        assertTrue(recursiveEquals(term73232, null));
    }

};


