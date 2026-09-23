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

public class IRFactory_transformNumberAsString_1706735028143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55659;
     Object term55835;

    public IRFactory_transformNumberAsString_1706735028143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55659 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term55729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55729, term55729.getClass(), "propListHead", null);
        setField(term55659, term55659.getClass(), "templateNode", term55729);
        term55835 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term55835, term55835.getClass(), "number", 4.8911906703031665E18);
        setField(term55835, term55835.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term55835;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term55659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


