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
import java.util.ArrayList;

public class TypeValidator_init_1658681042223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81777;

    public TypeValidator_init_1658681042223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81697 = new ArrayList();
        Object term81645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term81645, term81645.getClass(), "shouldReport", false);
        setField(term81645, term81645.getClass(), "mismatches", term81697);
        setField(term81645, term81645.getClass(), "compiler", null);
        term81777 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term81881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term81777, term81777.getClass(), "typeRegistry", term81881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term81777;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


