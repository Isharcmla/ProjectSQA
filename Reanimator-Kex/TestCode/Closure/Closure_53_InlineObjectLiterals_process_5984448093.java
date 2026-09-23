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

public class InlineObjectLiterals_process_5984448093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term23;

    public InlineObjectLiterals_process_5984448093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.InlineObjectLiterals"));
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "safeNameIdSupplier", null);
        term2 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2, term2.getClass(), "type", 391863371);
        setIntField(term4, term4.getClass(), "type", -2038273078);
        setIntField(term6, term6.getClass(), "type", 0);
        setField(term6, term6.getClass(), "next", null);
        setField(term6, term6.getClass(), "first", null);
        setField(term6, term6.getClass(), "last", null);
        setField(term6, term6.getClass(), "propListHead", null);
        setIntField(term6, term6.getClass(), "sourcePosition", 0);
        setField(term6, term6.getClass(), "jsType", null);
        setField(term6, term6.getClass(), "parent", null);
        setField(term4, term4.getClass(), "next", term6);
        setIntField(term9, term9.getClass(), "type", 0);
        setField(term9, term9.getClass(), "next", null);
        setField(term9, term9.getClass(), "first", null);
        setField(term9, term9.getClass(), "last", null);
        setField(term9, term9.getClass(), "propListHead", null);
        setIntField(term9, term9.getClass(), "sourcePosition", 0);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term4, term4.getClass(), "first", term9);
        setIntField(term12, term12.getClass(), "type", 0);
        setField(term12, term12.getClass(), "next", null);
        setField(term12, term12.getClass(), "first", null);
        setField(term12, term12.getClass(), "last", null);
        setField(term12, term12.getClass(), "propListHead", null);
        setIntField(term12, term12.getClass(), "sourcePosition", 0);
        setField(term12, term12.getClass(), "jsType", null);
        setField(term12, term12.getClass(), "parent", null);
        setField(term4, term4.getClass(), "last", term12);
        setField(term4, term4.getClass(), "propListHead", null);
        setIntField(term4, term4.getClass(), "sourcePosition", 0);
        setField(term4, term4.getClass(), "jsType", null);
        setField(term4, term4.getClass(), "parent", null);
        setField(term2, term2.getClass(), "next", term4);
        setIntField(term16, term16.getClass(), "type", 0);
        setField(term16, term16.getClass(), "next", null);
        setField(term16, term16.getClass(), "first", null);
        setField(term16, term16.getClass(), "last", null);
        setField(term16, term16.getClass(), "propListHead", null);
        setIntField(term16, term16.getClass(), "sourcePosition", 0);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        setField(term2, term2.getClass(), "first", term16);
        setIntField(term19, term19.getClass(), "type", 0);
        setField(term19, term19.getClass(), "next", null);
        setField(term19, term19.getClass(), "first", null);
        setField(term19, term19.getClass(), "last", null);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term2, term2.getClass(), "last", term19);
        setField(term2, term2.getClass(), "propListHead", null);
        setIntField(term2, term2.getClass(), "sourcePosition", 0);
        setField(term2, term2.getClass(), "jsType", null);
        setField(term2, term2.getClass(), "parent", null);
        term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23, term23.getClass(), "type", -883034806);
        setIntField(term25, term25.getClass(), "type", -1456670397);
        setIntField(term27, term27.getClass(), "type", 0);
        setField(term27, term27.getClass(), "next", null);
        setField(term27, term27.getClass(), "first", null);
        setField(term27, term27.getClass(), "last", null);
        setField(term27, term27.getClass(), "propListHead", null);
        setIntField(term27, term27.getClass(), "sourcePosition", 0);
        setField(term27, term27.getClass(), "jsType", null);
        setField(term27, term27.getClass(), "parent", null);
        setField(term25, term25.getClass(), "next", term27);
        setIntField(term30, term30.getClass(), "type", 0);
        setField(term30, term30.getClass(), "next", null);
        setField(term30, term30.getClass(), "first", null);
        setField(term30, term30.getClass(), "last", null);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term25, term25.getClass(), "first", term30);
        setIntField(term33, term33.getClass(), "type", 0);
        setField(term33, term33.getClass(), "next", null);
        setField(term33, term33.getClass(), "first", null);
        setField(term33, term33.getClass(), "last", null);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term25, term25.getClass(), "last", term33);
        setField(term25, term25.getClass(), "propListHead", null);
        setIntField(term25, term25.getClass(), "sourcePosition", 0);
        setField(term25, term25.getClass(), "jsType", null);
        setField(term25, term25.getClass(), "parent", null);
        setField(term23, term23.getClass(), "next", term25);
        setIntField(term37, term37.getClass(), "type", 0);
        setField(term37, term37.getClass(), "next", null);
        setField(term37, term37.getClass(), "first", null);
        setField(term37, term37.getClass(), "last", null);
        setField(term37, term37.getClass(), "propListHead", null);
        setIntField(term37, term37.getClass(), "sourcePosition", 0);
        setField(term37, term37.getClass(), "jsType", null);
        setField(term37, term37.getClass(), "parent", null);
        setField(term23, term23.getClass(), "first", term37);
        setIntField(term40, term40.getClass(), "type", 0);
        setField(term40, term40.getClass(), "next", null);
        setField(term40, term40.getClass(), "first", null);
        setField(term40, term40.getClass(), "last", null);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term23, term23.getClass(), "last", term40);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineObjectLiterals");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term23;
        try {
            callMethod(klass, "process", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


