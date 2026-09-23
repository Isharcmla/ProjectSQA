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

public class CheckAccessControls_getClassOfMethod_1679898606439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220733;
     Object term220819;
     Object term221013;

    public CheckAccessControls_getClassOfMethod_1679898606439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220733 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term220819 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term220819, term220819.getClass(), "type", 38);
        setField(term220819, term220819.getClass(), "jsType", term220927);
        term221013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term221013, term221013.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term220819;
        args[1] = term221013;
        callMethod(klass, "getClassOfMethod", argTypes, term220733, args);
    }

};


