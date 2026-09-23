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

public class IRFactory_transformNumberAsString_1706735028231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70974;
     Object term71150;

    public IRFactory_transformNumberAsString_1706735028231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70974 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term71044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71044, term71044.getClass(), "propListHead", null);
        setField(term70974, term70974.getClass(), "templateNode", term71044);
        term71150 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term71256 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term71150, term71150.getClass(), "number", 4.7276538462711316E18);
        setIntField(term71256, term71256.getClass(), "type", -25);
        setField(term71256, term71256.getClass(), "next", null);
        setField(term71150, term71150.getClass(), "propListHead", term71256);
        setIntField(term71150, term71150.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term71150;
        callMethod(klass, "transformNumberAsString", argTypes, term70974, args);
    }

};


