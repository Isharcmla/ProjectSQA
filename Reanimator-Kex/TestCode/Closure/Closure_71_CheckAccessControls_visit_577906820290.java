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

public class CheckAccessControls_visit_577906820290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89209;
     Object term89279;

    public CheckAccessControls_visit_577906820290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89209 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term89279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term89485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term89279, term89279.getClass(), "type", 30);
        setField(term89389, term89389.getClass(), "docInfo", null);
        setField(term89389, term89389.getClass(), "implicitPrototypeFallback", term89485);
        setField(term89279, term89279.getClass(), "jsType", term89389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term89279;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term89209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


