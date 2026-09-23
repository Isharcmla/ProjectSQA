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

public class TypeCheck_isPropertyTest_6572758821086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309748;
     Object term309840;
     Object term309866;
     Object term309867;

    public TypeCheck_isPropertyTest_6572758821086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term309840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term309840, term309840.getClass(), "parent", term309840);
        setIntField(term309840, term309840.getClass(), "type", 26);
        term309866 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term309866, term309866.getClass(), "compiler", null);
        setField(term309866, term309866.getClass(), "validator", null);
        setField(term309866, term309866.getClass(), "reverseInterpreter", null);
        setField(term309866, term309866.getClass(), "typeRegistry", null);
        setField(term309866, term309866.getClass(), "topScope", null);
        setField(term309866, term309866.getClass(), "scopeCreator", null);
        setField(term309866, term309866.getClass(), "reportMissingOverride", null);
        setField(term309866, term309866.getClass(), "reportUnknownTypes", null);
        setBooleanField(term309866, term309866.getClass(), "reportMissingProperties", false);
        setField(term309866, term309866.getClass(), "inferJSDocInfo", null);
        setIntField(term309866, term309866.getClass(), "typedCount", 0);
        setIntField(term309866, term309866.getClass(), "nullCount", 0);
        setIntField(term309866, term309866.getClass(), "unknownCount", 0);
        setBooleanField(term309866, term309866.getClass(), "inExterns", false);
        setIntField(term309866, term309866.getClass(), "noTypeCheckSection", 0);
        term309867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term309867, term309867.getClass(), "str", null);
        setIntField(term309867, term309867.getClass(), "type", 26);
        setField(term309867, term309867.getClass(), "next", null);
        setField(term309867, term309867.getClass(), "first", null);
        setField(term309867, term309867.getClass(), "last", null);
        setField(term309867, term309867.getClass(), "propListHead", null);
        setIntField(term309867, term309867.getClass(), "sourcePosition", 0);
        setField(term309867, term309867.getClass(), "jsType", null);
        setField(term309867, term309867.getClass(), "parent", term309867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term309840;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term309748, args);
        assertTrue(recursiveEquals(term309748, term309866));
        assertTrue(recursiveEquals(term309840, term309867));
        assertTrue(recursiveEquals(retValue, false));
    }

};


