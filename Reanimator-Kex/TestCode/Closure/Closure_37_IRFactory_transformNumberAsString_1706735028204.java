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

public class IRFactory_transformNumberAsString_1706735028204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56075;
     Object term56273;

    public IRFactory_transformNumberAsString_1706735028204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56075 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term56167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56167, term56167.getClass(), "propListHead", null);
        setField(term56075, term56075.getClass(), "templateNode", term56167);
        term56273 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term56273, term56273.getClass(), "number", 4.6116860184273879E18);
        setField(term56273, term56273.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term56273;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term56075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


