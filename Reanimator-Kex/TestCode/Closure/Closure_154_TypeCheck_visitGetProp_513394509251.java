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

public class TypeCheck_visitGetProp_513394509251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69899;
     Object term70073;

    public TypeCheck_visitGetProp_513394509251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69899 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term70003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69899, term69899.getClass(), "typeRegistry", term70003);
        term70073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70073, term70073.getClass(), "jsType", null);
        setField(term70073, term70073.getClass(), "last", term70143);
        setField(term70213, term70213.getClass(), "jsType", null);
        setField(term70073, term70073.getClass(), "first", term70213);
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
        args[1] = term70073;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term69899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


