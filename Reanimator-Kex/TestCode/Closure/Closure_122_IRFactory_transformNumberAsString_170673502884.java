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

public class IRFactory_transformNumberAsString_170673502884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56615;
     Object term56813;

    public IRFactory_transformNumberAsString_170673502884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56615 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term56707 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56707, term56707.getClass(), "propListHead", null);
        setField(term56615, term56615.getClass(), "templateNode", term56707);
        term56813 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term56919 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term56813, term56813.getClass(), "number", 8.8046829568E10);
        setIntField(term56919, term56919.getClass(), "type", 24);
        setField(term56813, term56813.getClass(), "propListHead", term56919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term56813;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term56615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


