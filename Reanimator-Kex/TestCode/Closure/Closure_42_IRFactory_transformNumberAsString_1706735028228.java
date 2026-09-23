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

public class IRFactory_transformNumberAsString_1706735028228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70599;
     Object term70775;

    public IRFactory_transformNumberAsString_1706735028228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70599 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term70669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70669, term70669.getClass(), "propListHead", null);
        setField(term70599, term70599.getClass(), "templateNode", term70669);
        term70775 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term70775, term70775.getClass(), "number", -4.4042036953687972E18);
        setField(term70775, term70775.getClass(), "propListHead", null);
        setIntField(term70775, term70775.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term70775;
        callMethod(klass, "transformNumberAsString", argTypes, term70599, args);
    }

};


