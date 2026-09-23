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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitNew_2563020798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29157;
     Object term29227;

    public TypeCheck_visitNew_2563020798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term29227, term29227.getClass(), "first", term29227);
        setField(term29227, term29227.getClass(), "jsType", term29325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29227;
        try {
            callMethod(klass, "visitNew", argTypes, term29157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


