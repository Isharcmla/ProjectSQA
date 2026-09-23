package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_getIndexOfChild_2048732860639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57178;
     Object term57318;

    public Node_getIndexOfChild_2048732860639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57248, term57248.getClass(), "next", term57178);
        setField(term57178, term57178.getClass(), "first", term57248);
        setField(term57178, term57178.getClass(), "next", term57178);
        term57318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57318;
        callMethod(klass, "getIndexOfChild", argTypes, term57178, args);
    }

};


