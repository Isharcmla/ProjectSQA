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

public class CrossModuleMethodMotion_moveMethods_57767329822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10180;
     Object term10366;
     Object term10385;
     Object term10387;

    public CrossModuleMethodMotion_moveMethods_57767329822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10180 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term10314 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setIntField(term10314, term10314.getClass(), "currentId", 0);
        setField(term10180, term10180.getClass(), "idGenerator", term10314);
        term10366 = new ArrayList();
        term10385 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term10386 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(term10385, term10385.getClass(), "compiler", null);
        setIntField(term10386, term10386.getClass(), "currentId", 0);
        setField(term10385, term10385.getClass(), "idGenerator", term10386);
        setField(term10385, term10385.getClass(), "analyzer", null);
        setField(term10385, term10385.getClass(), "moduleGraph", null);
        term10387 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term10366;
        callMethod(klass, "moveMethods", argTypes, term10180, args);
        assertTrue(recursiveEquals(term10180, term10385));
        assertTrue(recursiveEquals(term10366, term10387));
    }

};


