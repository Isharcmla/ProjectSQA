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

public class TypeCheck_visitBinaryOperator_2067533860506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155510;
     Object term155580;

    public TypeCheck_visitBinaryOperator_2067533860506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155510 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term155580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term155820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term155650, term155650.getClass(), "jsType", term155750);
        setField(term155580, term155580.getClass(), "first", term155650);
        setField(term155820, term155820.getClass(), "jsType", term155944);
        setField(term155580, term155580.getClass(), "last", term155820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 62;
        args[1] = null;
        args[2] = term155580;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term155510, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


