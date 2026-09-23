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

public class TypeCheck_visit_859524784683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175307;
     Object term175481;

    public TypeCheck_visit_859524784683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175307 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term175411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term175307, term175307.getClass(), "typeRegistry", term175411);
        term175481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term175481, term175481.getClass(), "type", 11);
        setField(term175551, term175551.getClass(), "jsType", null);
        setField(term175481, term175481.getClass(), "first", term175551);
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
        args[1] = term175481;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term175307, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


