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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PrepareAst_normalizeNodeTypes_93046193618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;
     Object term1369;

    public PrepareAst_normalizeNodeTypes_93046193618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1299 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        term1369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1369, term1369.getClass(), "type", 14);
        setField(term1369, term1369.getClass(), "first", term1369);
        setField(term1369, term1369.getClass(), "parent", term1369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1369;
        try {
            callMethod(klass, "normalizeNodeTypes", argTypes, term1299, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


