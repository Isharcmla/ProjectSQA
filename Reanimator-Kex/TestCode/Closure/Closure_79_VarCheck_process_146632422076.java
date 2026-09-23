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

public class VarCheck_process_146632422076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52149;
     Object term52219;

    public VarCheck_process_146632422076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52149 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term52149, term52149.getClass(), "sanityCheck", false);
        setField(term52149, term52149.getClass(), "compiler", null);
        term52219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52219, term52219.getClass(), "type", 0);
        setField(term52289, term52289.getClass(), "next", term52359);
        setIntField(term52289, term52289.getClass(), "type", 0);
        setField(term52429, term52429.getClass(), "next", term52499);
        setIntField(term52429, term52429.getClass(), "type", 132);
        setField(term52289, term52289.getClass(), "first", term52429);
        setField(term52219, term52219.getClass(), "first", term52289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term52219;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term52149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


