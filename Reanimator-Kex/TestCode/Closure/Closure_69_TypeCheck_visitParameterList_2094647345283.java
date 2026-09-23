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

public class TypeCheck_visitParameterList_2094647345283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79382;
     Object term79452;
     Object term79622;

    public TypeCheck_visitParameterList_2094647345283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79382 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79522, term79522.getClass(), "next", null);
        setField(term79452, term79452.getClass(), "first", term79522);
        term79622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term79716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term79786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79856, term79856.getClass(), "next", term79926);
        setField(term79786, term79786.getClass(), "first", term79856);
        setField(term79786, term79786.getClass(), "last", null);
        setField(term79716, term79716.getClass(), "parameters", term79786);
        setField(term79622, term79622.getClass(), "call", term79716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term79452;
        args[2] = term79622;
        try {
            callMethod(klass, "visitParameterList", argTypes, term79382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


