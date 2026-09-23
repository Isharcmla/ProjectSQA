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

public class TypeCheck_visit_8595247841220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354673;
     Object term354833;

    public TypeCheck_visit_8595247841220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354673 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term354763 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term354673, term354673.getClass(), "validator", term354763);
        term354833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term354833, term354833.getClass(), "type", 102);
        setField(term354833, term354833.getClass(), "first", term354833);
        setField(term354833, term354833.getClass(), "jsType", term354941);
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
        args[1] = term354833;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term354673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


