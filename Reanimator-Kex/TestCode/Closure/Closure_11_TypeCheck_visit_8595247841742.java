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

public class TypeCheck_visit_8595247841742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566755;
     Object term566825;

    public TypeCheck_visit_8595247841742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566755 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term566825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term566895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term566825, term566825.getClass(), "type", 46);
        setField(term566825, term566825.getClass(), "first", term566825);
        setField(term566825, term566825.getClass(), "last", term566895);
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
        args[1] = term566825;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term566755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


