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

public class IRFactory_transformNumberAsString_1706735028182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62898;
     Object term63096;

    public IRFactory_transformNumberAsString_1706735028182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62898 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term62990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term62990, term62990.getClass(), "propListHead", null);
        setField(term62898, term62898.getClass(), "templateNode", term62990);
        term63096 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term63202 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term63096, term63096.getClass(), "number", 8.8046829568E10);
        setIntField(term63202, term63202.getClass(), "type", 24);
        setField(term63096, term63096.getClass(), "propListHead", term63202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term63096;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term62898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


