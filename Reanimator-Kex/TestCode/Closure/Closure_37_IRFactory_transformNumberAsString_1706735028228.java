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

public class IRFactory_transformNumberAsString_1706735028228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61123;
     Object term61467;

    public IRFactory_transformNumberAsString_1706735028228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61123 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term61215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61323 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term61215, term61215.getClass(), "propListHead", term61323);
        setField(term61123, term61123.getClass(), "templateNode", term61215);
        setField(term61123, term61123.getClass(), "sourceString", "");
        term61467 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term61573 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term61467, term61467.getClass(), "number", 0.0);
        setIntField(term61573, term61573.getClass(), "type", -25);
        setField(term61573, term61573.getClass(), "next", null);
        setField(term61467, term61467.getClass(), "propListHead", term61573);
        setIntField(term61467, term61467.getClass(), "lineno", 0);
        setIntField(term61467, term61467.getClass(), "position", 0);
        setField(term61467, term61467.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term61467;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term61123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


