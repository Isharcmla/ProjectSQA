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

public class TypeCheck_visit_859524784961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258339;
     Object term258513;

    public TypeCheck_visit_859524784961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258339 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term258443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term258339, term258339.getClass(), "typeRegistry", term258443);
        term258513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term258513, term258513.getClass(), "type", 17);
        setField(term258583, term258583.getClass(), "jsType", null);
        setField(term258513, term258513.getClass(), "first", term258583);
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
        args[1] = term258513;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term258339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


