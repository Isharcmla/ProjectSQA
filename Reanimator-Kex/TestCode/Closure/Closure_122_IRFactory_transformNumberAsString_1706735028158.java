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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72009;
     Object term72347;

    public IRFactory_transformNumberAsString_1706735028158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72009 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term72101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72203 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term72101, term72101.getClass(), "propListHead", term72203);
        setField(term72009, term72009.getClass(), "templateNode", term72101);
        setField(term72009, term72009.getClass(), "sourceString", "");
        term72347 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term72453 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term72347, term72347.getClass(), "number", -4.2190284259160228E18);
        setIntField(term72453, term72453.getClass(), "type", -25);
        setField(term72453, term72453.getClass(), "next", null);
        setField(term72347, term72347.getClass(), "propListHead", term72453);
        setIntField(term72347, term72347.getClass(), "lineno", -1);
        setField(term72347, term72347.getClass(), "parent", null);
        setIntField(term72347, term72347.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term72347;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term72009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


