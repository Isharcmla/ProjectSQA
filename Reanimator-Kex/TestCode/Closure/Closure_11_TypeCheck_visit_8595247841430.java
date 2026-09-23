package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_8595247841430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437891;
     Object term437983;

    public TypeCheck_visit_8595247841430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437891 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term437983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term438265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term437983, term437983.getClass(), "type", 46);
        setIntField(term438075, term438075.getClass(), "type", 46);
        setField(term438075, term438075.getClass(), "jsType", term438173);
        setField(term437983, term437983.getClass(), "first", term438075);
        setIntField(term438265, term438265.getClass(), "type", 46);
        setField(term437983, term437983.getClass(), "last", term438265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term437983;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term437891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


