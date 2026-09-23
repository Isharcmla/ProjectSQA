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

public class TypeCheck_visit_859524784665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178906;
     Object term178996;
     Object term179066;

    public TypeCheck_visit_859524784665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178906 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term178906, term178906.getClass(), "noTypeCheckSection", 0);
        term178996 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term179066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term179066, term179066.getClass(), "type", 149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term178996;
        args[1] = term179066;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term178906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


