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

public class NodeUtil_mtocHelper_402163553439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89503;
     Object term89783;

    public NodeUtil_mtocHelper_402163553439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89503, term89503.getClass(), "type", -106);
        setIntField(term89958, term89958.getClass(), "type", -106);
        setIntField(term89993, term89993.getClass(), "type", -106);
        setField(term89993, term89993.getClass(), "first", null);
        setField(term89993, term89993.getClass(), "next", term90028);
        setField(term89958, term89958.getClass(), "first", term89993);
        setField(term89503, term89503.getClass(), "first", term89958);
        term89783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89923, term89923.getClass(), "first", term89958);
        setField(term89923, term89923.getClass(), "next", term89958);
        setField(term89853, term89853.getClass(), "first", term89923);
        setField(term89783, term89783.getClass(), "first", term89853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term89503;
        args[2] = term89783;
        callMethod(klass, "mtocHelper", argTypes, null, args);
    }

};


