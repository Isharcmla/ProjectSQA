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

public class MinimizeExitPoints_visit_172201874779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14726;
     Object term14796;

    public MinimizeExitPoints_visit_172201874779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14726 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term14796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14796, term14796.getClass(), "type", 114);
        setIntField(term14866, term14866.getClass(), "type", 117);
        setField(term14796, term14796.getClass(), "first", term14866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term14796;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term14726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


