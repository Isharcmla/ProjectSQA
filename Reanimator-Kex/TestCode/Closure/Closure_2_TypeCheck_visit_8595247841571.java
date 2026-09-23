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

public class TypeCheck_visit_8595247841571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521699;
     Object term521791;

    public TypeCheck_visit_8595247841571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521699 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term521791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term521883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term521971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term522063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term522175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term521791, term521791.getClass(), "type", 18);
        setField(term521883, term521883.getClass(), "jsType", term521971);
        setField(term521791, term521791.getClass(), "first", term521883);
        setField(term522063, term522063.getClass(), "jsType", term522175);
        setField(term521791, term521791.getClass(), "last", term522063);
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
        args[1] = term521791;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term521699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


