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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ProcessClosurePrimitives_visit_158258986857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27445;
     Object term27515;
     Object term27692;
     Object term27693;

    public ProcessClosurePrimitives_visit_158258986857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27445 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term27515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27515, term27515.getClass(), "type", 30);
        term27692 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term27692, term27692.getClass(), "compiler", null);
        setField(term27692, term27692.getClass(), "moduleGraph", null);
        setField(term27692, term27692.getClass(), "providedNames", null);
        setField(term27692, term27692.getClass(), "unrecognizedRequires", null);
        setField(term27692, term27692.getClass(), "exportedVariables", null);
        setField(term27692, term27692.getClass(), "requiresLevel", null);
        setBooleanField(term27692, term27692.getClass(), "rewriteNewDateGoogNow", false);
        term27693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27693, term27693.getClass(), "type", 30);
        setField(term27693, term27693.getClass(), "next", null);
        setField(term27693, term27693.getClass(), "first", null);
        setField(term27693, term27693.getClass(), "last", null);
        setField(term27693, term27693.getClass(), "propListHead", null);
        setIntField(term27693, term27693.getClass(), "sourcePosition", 0);
        setField(term27693, term27693.getClass(), "jsType", null);
        setField(term27693, term27693.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term27515;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term27445, args);
        assertTrue(recursiveEquals(term27445, term27692));
        assertTrue(recursiveEquals(term27515, null));
    }

};


