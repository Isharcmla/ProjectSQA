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

public class IRFactory_transformNumberAsString_1706735028232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93733;
     Object term93909;

    public IRFactory_transformNumberAsString_1706735028232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93733 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term93803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93803, term93803.getClass(), "propListHead", null);
        setField(term93733, term93733.getClass(), "templateNode", term93803);
        term93909 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term94015 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term93909, term93909.getClass(), "number", -4.3324628415304172E18);
        setIntField(term94015, term94015.getClass(), "type", -25);
        setField(term94015, term94015.getClass(), "next", null);
        setField(term93909, term93909.getClass(), "propListHead", term94015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term93909;
        callMethod(klass, "transformNumberAsString", argTypes, term93733, args);
    }

};


