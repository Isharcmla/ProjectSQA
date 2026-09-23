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

public class IRFactory_transformNumberAsString_170673502883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44916;
     Object term45260;

    public IRFactory_transformNumberAsString_170673502883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44916 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term45008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45116 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term45008, term45008.getClass(), "propListHead", term45116);
        setField(term44916, term44916.getClass(), "templateNode", term45008);
        setField(term44916, term44916.getClass(), "sourceString", "");
        term45260 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term45366 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term45260, term45260.getClass(), "number", -4.2190284259160228E18);
        setIntField(term45366, term45366.getClass(), "type", -25);
        setField(term45366, term45366.getClass(), "next", null);
        setField(term45260, term45260.getClass(), "propListHead", term45366);
        setIntField(term45260, term45260.getClass(), "lineno", -1);
        setField(term45260, term45260.getClass(), "parent", null);
        setIntField(term45260, term45260.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term45260;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term44916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


