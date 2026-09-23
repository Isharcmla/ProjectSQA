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

public class TypeCheck_visit_859524784542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143994;
     Object term144168;

    public TypeCheck_visit_859524784542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143994 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term144098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term143994, term143994.getClass(), "typeRegistry", term144098);
        term144168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144168, term144168.getClass(), "type", 21);
        setField(term144238, term144238.getClass(), "jsType", null);
        setField(term144168, term144168.getClass(), "first", term144238);
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
        args[1] = term144168;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term143994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


