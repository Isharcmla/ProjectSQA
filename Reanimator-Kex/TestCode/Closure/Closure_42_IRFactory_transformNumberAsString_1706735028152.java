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

public class IRFactory_transformNumberAsString_1706735028152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57777;
     Object term58083;

    public IRFactory_transformNumberAsString_1706735028152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57777 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term57869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57977 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term57869, term57869.getClass(), "propListHead", term57977);
        setField(term57777, term57777.getClass(), "templateNode", term57869);
        term58083 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term58189 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term58083, term58083.getClass(), "number", -4.3279592418694922E18);
        setIntField(term58189, term58189.getClass(), "type", -25);
        setField(term58189, term58189.getClass(), "next", null);
        setField(term58083, term58083.getClass(), "propListHead", term58189);
        setIntField(term58083, term58083.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term58083;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term57777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


