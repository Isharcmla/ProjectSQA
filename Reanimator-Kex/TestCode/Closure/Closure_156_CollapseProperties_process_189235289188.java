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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CollapseProperties_process_189235289188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61621;
     Object term61771;
     Object term61841;

    public CollapseProperties_process_189235289188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61621 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term61701 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term61621, term61621.getClass(), "collapsePropertiesOnExternTypes", true);
        setField(term61621, term61621.getClass(), "compiler", term61701);
        setBooleanField(term61621, term61621.getClass(), "inlineAliases", true);
        term61771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term61841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term61771;
        args[1] = term61841;
        try {
            callMethod(klass, "process", argTypes, term61621, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


