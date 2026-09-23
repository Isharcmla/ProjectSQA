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

public class TypeCheck_visitBinaryOperator_2067533860546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168458;
     Object term168528;

    public TypeCheck_visitBinaryOperator_2067533860546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168458 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term168528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term168768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term168598, term168598.getClass(), "jsType", term168698);
        setField(term168528, term168528.getClass(), "first", term168598);
        setField(term168768, term168768.getClass(), "jsType", term168866);
        setField(term168528, term168528.getClass(), "last", term168768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 61;
        args[1] = null;
        args[2] = term168528;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term168458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


