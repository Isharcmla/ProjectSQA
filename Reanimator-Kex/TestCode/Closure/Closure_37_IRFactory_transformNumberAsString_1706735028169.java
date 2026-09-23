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

public class IRFactory_transformNumberAsString_1706735028169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50928;
     Object term51234;

    public IRFactory_transformNumberAsString_1706735028169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50928 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term51020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51128 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term51020, term51020.getClass(), "propListHead", term51128);
        setField(term50928, term50928.getClass(), "templateNode", term51020);
        term51234 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term51340 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term51234, term51234.getClass(), "number", -4.3279592418694922E18);
        setIntField(term51340, term51340.getClass(), "type", -25);
        setField(term51340, term51340.getClass(), "next", null);
        setField(term51234, term51234.getClass(), "propListHead", term51340);
        setIntField(term51234, term51234.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term51234;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term50928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


