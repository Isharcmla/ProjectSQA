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

public class TypeCheck_visit_859524784900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250669;
     Object term250739;

    public TypeCheck_visit_859524784900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250669 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term250739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term250971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term250739, term250739.getClass(), "type", 45);
        setIntField(term250809, term250809.getClass(), "type", 134217773);
        setField(term250809, term250809.getClass(), "jsType", term250901);
        setField(term250739, term250739.getClass(), "first", term250809);
        setIntField(term250971, term250971.getClass(), "type", -135584814);
        setField(term250971, term250971.getClass(), "jsType", term250901);
        setField(term250739, term250739.getClass(), "last", term250971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term250739;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term250669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


