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

public class TypeCheck_visitCall_361944333510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128627;
     Object term128717;
     Object term128787;

    public TypeCheck_visitCall_361944333510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128627 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term128627, term128627.getClass(), "noTypeCheckSection", 0);
        term128717 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term128787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term128969, term128969.getClass(), "className", null);
        setField(term128969, term128969.getClass(), "ownerFunction", null);
        setBooleanField(term128969, term128969.getClass(), "prettyPrint", false);
        setField(term128857, term128857.getClass(), "jsType", term128969);
        setField(term128787, term128787.getClass(), "first", term128857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term128717;
        args[1] = term128787;
        try {
            callMethod(klass, "visitCall", argTypes, term128627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


