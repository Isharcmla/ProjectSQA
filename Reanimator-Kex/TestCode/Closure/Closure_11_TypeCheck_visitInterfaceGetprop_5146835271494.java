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

public class TypeCheck_visitInterfaceGetprop_5146835271494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466910;
     Object term467060;

    public TypeCheck_visitInterfaceGetprop_5146835271494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term466990 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term466910, term466910.getClass(), "compiler", term466990);
        term467060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term467060, term467060.getClass(), "jsType", term467154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term467060;
        try {
            callMethod(klass, "visitInterfaceGetprop", argTypes, term466910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


