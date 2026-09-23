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

public class TypeCheck_visitBinaryOperator_2067533860637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205659;
     Object term205729;

    public TypeCheck_visitBinaryOperator_2067533860637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205659 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term205659, term205659.getClass(), "noTypeCheckSection", -1);
        term205729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term205965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term205799, term205799.getClass(), "jsType", term205895);
        setField(term205729, term205729.getClass(), "first", term205799);
        setField(term205965, term205965.getClass(), "jsType", term206071);
        setField(term205729, term205729.getClass(), "last", term205965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 51;
        args[1] = null;
        args[2] = term205729;
        callMethod(klass, "visitBinaryOperator", argTypes, term205659, args);
    }

};


