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

public class IRFactory_transformNumberAsString_1706735028266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74171;
     Object term74471;

    public IRFactory_transformNumberAsString_1706735028266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74171 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term74263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term74365 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term74263, term74263.getClass(), "propListHead", term74365);
        setField(term74171, term74171.getClass(), "templateNode", term74263);
        term74471 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term74577 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term74683 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term74471, term74471.getClass(), "number", -4.3409032425169224E18);
        setIntField(term74577, term74577.getClass(), "type", 0);
        setIntField(term74683, term74683.getClass(), "type", 0);
        setField(term74683, term74683.getClass(), "next", null);
        setField(term74577, term74577.getClass(), "next", term74683);
        setField(term74471, term74471.getClass(), "propListHead", term74577);
        setIntField(term74471, term74471.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term74471;
        callMethod(klass, "transformNumberAsString", argTypes, term74171, args);
    }

};


