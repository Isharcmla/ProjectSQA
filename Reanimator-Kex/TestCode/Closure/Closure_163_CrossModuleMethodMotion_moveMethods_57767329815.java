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
import java.util.ArrayList;

public class CrossModuleMethodMotion_moveMethods_57767329815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2709;
     Object term2895;
     Object term8905;
     Object term8907;

    public CrossModuleMethodMotion_moveMethods_57767329815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2709 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term2843 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setIntField(term2843, term2843.getClass(), "currentId", 0);
        setField(term2709, term2709.getClass(), "idGenerator", term2843);
        term2895 = new ArrayList();
        term8905 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term8906 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(term8905, term8905.getClass(), "compiler", null);
        setIntField(term8906, term8906.getClass(), "currentId", 0);
        setField(term8905, term8905.getClass(), "idGenerator", term8906);
        setField(term8905, term8905.getClass(), "analyzer", null);
        setField(term8905, term8905.getClass(), "moduleGraph", null);
        term8907 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term2895;
        callMethod(klass, "moveMethods", argTypes, term2709, args);
        assertTrue(recursiveEquals(term2709, term8905));
        assertTrue(recursiveEquals(term2895, term8907));
    }

};


