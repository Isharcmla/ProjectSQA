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

public class IRFactory_transformNumberAsString_1706735028207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66558;
     Object term66756;

    public IRFactory_transformNumberAsString_1706735028207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66558 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term66650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term66650, term66650.getClass(), "propListHead", null);
        setField(term66558, term66558.getClass(), "templateNode", term66650);
        term66756 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term66862 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term66756, term66756.getClass(), "number", 4.7490458760501002E18);
        setIntField(term66862, term66862.getClass(), "type", 24);
        setField(term66756, term66756.getClass(), "propListHead", term66862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term66756;
        callMethod(klass, "transformNumberAsString", argTypes, term66558, args);
    }

};


