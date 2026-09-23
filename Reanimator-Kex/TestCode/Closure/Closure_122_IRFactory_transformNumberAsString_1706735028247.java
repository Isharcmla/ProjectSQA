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

public class IRFactory_transformNumberAsString_1706735028247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99269;
     Object term99575;

    public IRFactory_transformNumberAsString_1706735028247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99269 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term99361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term99469 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term99361, term99361.getClass(), "propListHead", term99469);
        setField(term99269, term99269.getClass(), "templateNode", term99361);
        term99575 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term99681 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term99787 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term99575, term99575.getClass(), "number", -4.3409032425169224E18);
        setIntField(term99681, term99681.getClass(), "type", 0);
        setIntField(term99787, term99787.getClass(), "type", 0);
        setField(term99787, term99787.getClass(), "next", null);
        setField(term99681, term99681.getClass(), "next", term99787);
        setField(term99575, term99575.getClass(), "propListHead", term99681);
        setIntField(term99575, term99575.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term99575;
        callMethod(klass, "transformNumberAsString", argTypes, term99269, args);
    }

};


