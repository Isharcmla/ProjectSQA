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

public class TypeCheck_visit_859524784646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175362;
     Object term175432;

    public TypeCheck_visit_859524784646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175362 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term175432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term175432, term175432.getClass(), "type", 91);
        setIntField(term175502, term175502.getClass(), "type", 91);
        setField(term175502, term175502.getClass(), "jsType", term175602);
        setField(term175432, term175432.getClass(), "first", term175502);
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
        args[1] = term175432;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term175362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


