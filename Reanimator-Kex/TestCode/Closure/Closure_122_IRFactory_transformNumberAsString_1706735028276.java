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

public class IRFactory_transformNumberAsString_1706735028276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110306;
     Object term110650;

    public IRFactory_transformNumberAsString_1706735028276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110306 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term110398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110506 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term110398, term110398.getClass(), "propListHead", term110506);
        setField(term110306, term110306.getClass(), "templateNode", term110398);
        setField(term110306, term110306.getClass(), "sourceString", "");
        term110650 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term110756 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term110650, term110650.getClass(), "number", -4.3456167567413591E18);
        setIntField(term110756, term110756.getClass(), "type", -25);
        setField(term110756, term110756.getClass(), "next", null);
        setField(term110650, term110650.getClass(), "propListHead", term110756);
        setIntField(term110650, term110650.getClass(), "lineno", -1);
        setField(term110650, term110650.getClass(), "parent", null);
        setIntField(term110650, term110650.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term110650;
        callMethod(klass, "transformNumberAsString", argTypes, term110306, args);
    }

};


