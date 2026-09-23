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

public class TypeCheck_visitCall_361944333518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131044;
     Object term131114;

    public TypeCheck_visitCall_361944333518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131044 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term131044, term131044.getClass(), "noTypeCheckSection", -1);
        term131114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term131280, term131280.getClass(), "className", null);
        setField(term131280, term131280.getClass(), "ownerFunction", null);
        setBooleanField(term131280, term131280.getClass(), "prettyPrint", false);
        setField(term131184, term131184.getClass(), "jsType", term131280);
        setField(term131114, term131114.getClass(), "first", term131184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term131114;
        try {
            callMethod(klass, "visitCall", argTypes, term131044, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


