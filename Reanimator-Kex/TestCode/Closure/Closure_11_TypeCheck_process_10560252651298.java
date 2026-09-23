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
import java.lang.Object;

public class TypeCheck_process_10560252651298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384852;
     Object term385094;

    public TypeCheck_process_10560252651298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384852 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term384950 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term385024 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term384852, term384852.getClass(), "scopeCreator", term384950);
        setField(term385024, term385024.getClass(), "parent", null);
        setField(term384852, term384852.getClass(), "topScope", term385024);
        setField(term384852, term384852.getClass(), "compiler", null);
        setBooleanField(term384852, term384852.getClass(), "inExterns", false);
        term385094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term385094, term385094.getClass(), "parent", term385164);
        setIntField(term385094, term385094.getClass(), "type", 104);
        setField(term385094, term385094.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term385094;
        try {
            callMethod(klass, "process", argTypes, term384852, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


