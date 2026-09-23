package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66969;
     Object term67145;

    public IRFactory_transformNumberAsString_1706735028135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66969 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term67039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67039, term67039.getClass(), "propListHead", null);
        setField(term66969, term66969.getClass(), "templateNode", term67039);
        term67145 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term67251 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term67357 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term67145, term67145.getClass(), "number", 5.7604692533418445E18);
        setIntField(term67251, term67251.getClass(), "type", -25);
        setField(term67251, term67251.getClass(), "next", term67357);
        setField(term67145, term67145.getClass(), "propListHead", term67251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term67145;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term66969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


