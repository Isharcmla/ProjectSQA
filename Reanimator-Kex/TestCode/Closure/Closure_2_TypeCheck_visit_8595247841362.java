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

public class TypeCheck_visit_8595247841362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417741;
     Object term417833;

    public TypeCheck_visit_8595247841362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417741 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term417833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term417925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term418049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term417833, term417833.getClass(), "type", 37);
        setField(term417925, term417925.getClass(), "jsType", term418049);
        setField(term417833, term417833.getClass(), "first", term417925);
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
        args[1] = term417833;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term417741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


