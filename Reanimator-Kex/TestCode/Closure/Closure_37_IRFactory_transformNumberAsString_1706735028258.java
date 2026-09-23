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

public class IRFactory_transformNumberAsString_1706735028258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70719;
     Object term71057;

    public IRFactory_transformNumberAsString_1706735028258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70719 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term70811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term70913 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term70811, term70811.getClass(), "propListHead", term70913);
        setField(term70719, term70719.getClass(), "templateNode", term70811);
        setField(term70719, term70719.getClass(), "sourceString", "");
        term71057 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term71163 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term71057, term71057.getClass(), "number", -4.2190284259160228E18);
        setIntField(term71163, term71163.getClass(), "type", -25);
        setField(term71163, term71163.getClass(), "next", null);
        setField(term71057, term71057.getClass(), "propListHead", term71163);
        setIntField(term71057, term71057.getClass(), "lineno", -1);
        setField(term71057, term71057.getClass(), "parent", null);
        setIntField(term71057, term71057.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term71057;
        callMethod(klass, "transformNumberAsString", argTypes, term70719, args);
    }

};


