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

public class TypeCheck_visit_8595247841558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492994;
     Object term493168;
     Object term493238;

    public TypeCheck_visit_8595247841558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492994 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term493098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term492994, term492994.getClass(), "typeRegistry", term493098);
        term493168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term493168, term493168.getClass(), "type", 38);
        setField(term493168, term493168.getClass(), "jsType", null);
        term493238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term493238, term493238.getClass(), "type", 0);
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
        args[1] = term493168;
        args[2] = term493238;
        try {
            callMethod(klass, "visit", argTypes, term492994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


