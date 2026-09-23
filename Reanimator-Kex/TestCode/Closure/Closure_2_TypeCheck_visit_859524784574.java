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

public class TypeCheck_visit_859524784574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155999;
     Object term156173;

    public TypeCheck_visit_859524784574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155999 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term156103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term155999, term155999.getClass(), "typeRegistry", term156103);
        term156173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term156173, term156173.getClass(), "type", 17);
        setField(term156243, term156243.getClass(), "jsType", null);
        setField(term156173, term156173.getClass(), "first", term156243);
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
        args[1] = term156173;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term155999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


