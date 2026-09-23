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

public class TypeCheck_visit_8595247841338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408550;
     Object term408620;

    public TypeCheck_visit_8595247841338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408550 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term408620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term408850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term408620, term408620.getClass(), "type", 93);
        setIntField(term408690, term408690.getClass(), "type", 93);
        setField(term408690, term408690.getClass(), "jsType", term408780);
        setField(term408620, term408620.getClass(), "first", term408690);
        setField(term408850, term408850.getClass(), "jsType", term408780);
        setField(term408620, term408620.getClass(), "last", term408850);
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
        args[1] = term408620;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term408550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


