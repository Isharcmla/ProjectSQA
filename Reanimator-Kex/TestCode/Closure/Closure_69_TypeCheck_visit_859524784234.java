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

public class TypeCheck_visit_859524784234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67291;
     Object term67361;
     Object term67632;
     Object term67633;

    public TypeCheck_visit_859524784234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67291 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term67361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67361, term67361.getClass(), "type", 126);
        term67632 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term67632, term67632.getClass(), "compiler", null);
        setField(term67632, term67632.getClass(), "validator", null);
        setField(term67632, term67632.getClass(), "reverseInterpreter", null);
        setField(term67632, term67632.getClass(), "typeRegistry", null);
        setField(term67632, term67632.getClass(), "topScope", null);
        setField(term67632, term67632.getClass(), "scopeCreator", null);
        setField(term67632, term67632.getClass(), "reportMissingOverride", null);
        setField(term67632, term67632.getClass(), "reportUnknownTypes", null);
        setBooleanField(term67632, term67632.getClass(), "reportMissingProperties", false);
        setField(term67632, term67632.getClass(), "inferJSDocInfo", null);
        setIntField(term67632, term67632.getClass(), "typedCount", 0);
        setIntField(term67632, term67632.getClass(), "nullCount", 0);
        setIntField(term67632, term67632.getClass(), "unknownCount", 0);
        setBooleanField(term67632, term67632.getClass(), "inExterns", false);
        setIntField(term67632, term67632.getClass(), "noTypeCheckSection", 0);
        term67633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67633, term67633.getClass(), "type", 126);
        setField(term67633, term67633.getClass(), "next", null);
        setField(term67633, term67633.getClass(), "first", null);
        setField(term67633, term67633.getClass(), "last", null);
        setField(term67633, term67633.getClass(), "propListHead", null);
        setIntField(term67633, term67633.getClass(), "sourcePosition", 0);
        setField(term67633, term67633.getClass(), "jsType", null);
        setField(term67633, term67633.getClass(), "parent", null);
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
        args[1] = term67361;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term67291, args);
        assertTrue(recursiveEquals(term67291, term67632));
        assertTrue(recursiveEquals(term67361, null));
    }

};


