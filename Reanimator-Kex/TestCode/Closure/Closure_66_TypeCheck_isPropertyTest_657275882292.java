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

public class TypeCheck_isPropertyTest_657275882292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76914;
     Object term76984;

    public TypeCheck_isPropertyTest_657275882292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76914 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term76984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76984, term76984.getClass(), "parent", term76984);
        setIntField(term76984, term76984.getClass(), "type", 101);
        setField(term76984, term76984.getClass(), "first", term76984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term76984;
        callMethod(klass, "isPropertyTest", argTypes, term76914, args);
    }

};


