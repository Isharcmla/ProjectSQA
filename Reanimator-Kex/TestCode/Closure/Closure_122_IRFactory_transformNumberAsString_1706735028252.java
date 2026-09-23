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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100497;
     Object term100803;

    public IRFactory_transformNumberAsString_1706735028252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100497 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term100589 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100697 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term100589, term100589.getClass(), "propListHead", term100697);
        setField(term100497, term100497.getClass(), "templateNode", term100589);
        term100803 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term100909 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term100803, term100803.getClass(), "number", -4.3726076603111834E18);
        setIntField(term100909, term100909.getClass(), "type", 24);
        setField(term100909, term100909.getClass(), "objectValue", null);
        setField(term100803, term100803.getClass(), "propListHead", term100909);
        setIntField(term100803, term100803.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term100803;
        callMethod(klass, "transformNumberAsString", argTypes, term100497, args);
    }

};


