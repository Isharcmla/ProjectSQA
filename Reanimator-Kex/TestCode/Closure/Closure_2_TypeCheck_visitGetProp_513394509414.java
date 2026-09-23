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

public class TypeCheck_visitGetProp_513394509414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99742;
     Object term99916;

    public TypeCheck_visitGetProp_513394509414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99742 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term99846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term99742, term99742.getClass(), "validator", null);
        setField(term99742, term99742.getClass(), "typeRegistry", term99846);
        term99916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term99916, term99916.getClass(), "last", null);
        setField(term99986, term99986.getClass(), "jsType", term100084);
        setField(term99916, term99916.getClass(), "first", term99986);
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
        args[1] = term99916;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term99742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


