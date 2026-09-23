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

public class TypeCheck_isPropertyTest_657275882293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77089;
     Object term77159;

    public TypeCheck_isPropertyTest_657275882293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77089 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term77159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77229, term77229.getClass(), "type", 26);
        setIntField(term77299, term77299.getClass(), "type", 100);
        setField(term77229, term77229.getClass(), "parent", term77299);
        setField(term77159, term77159.getClass(), "parent", term77229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77159;
        callMethod(klass, "isPropertyTest", argTypes, term77089, args);
    }

};


