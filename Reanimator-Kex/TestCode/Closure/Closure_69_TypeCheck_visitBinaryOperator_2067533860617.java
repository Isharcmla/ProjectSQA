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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_2067533860617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196511;
     Object term196581;

    public TypeCheck_visitBinaryOperator_2067533860617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196511 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term196511, term196511.getClass(), "noTypeCheckSection", -1);
        term196581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term196827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term196651, term196651.getClass(), "jsType", term196757);
        setField(term196581, term196581.getClass(), "first", term196651);
        setField(term196827, term196827.getClass(), "jsType", term196921);
        setField(term196581, term196581.getClass(), "last", term196827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 63;
        args[1] = null;
        args[2] = term196581;
        callMethod(klass, "visitBinaryOperator", argTypes, term196511, args);
    }

};


