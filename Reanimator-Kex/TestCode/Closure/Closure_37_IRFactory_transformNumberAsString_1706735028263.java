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

public class IRFactory_transformNumberAsString_1706735028263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73813;
     Object term73989;

    public IRFactory_transformNumberAsString_1706735028263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73813 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term73883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73883, term73883.getClass(), "propListHead", null);
        setField(term73813, term73813.getClass(), "templateNode", term73883);
        term73989 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term73989, term73989.getClass(), "number", -4.4042036953687972E18);
        setField(term73989, term73989.getClass(), "propListHead", null);
        setIntField(term73989, term73989.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term73989;
        callMethod(klass, "transformNumberAsString", argTypes, term73813, args);
    }

};


