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

public class TypeCheck_visit_8595247841244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369589;
     Object term369659;

    public TypeCheck_visit_8595247841244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term369659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term369887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369659, term369659.getClass(), "type", 17);
        setField(term369729, term369729.getClass(), "jsType", term369817);
        setField(term369659, term369659.getClass(), "first", term369729);
        setField(term369659, term369659.getClass(), "last", term369887);
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
        args[1] = term369659;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term369589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


