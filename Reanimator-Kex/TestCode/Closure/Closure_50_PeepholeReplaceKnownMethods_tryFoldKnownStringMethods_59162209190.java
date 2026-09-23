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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23571;
     Object term23641;
     Object term23762;
     Object term23763;
     Object term23742;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23571 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term23641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23641, term23641.getClass(), "type", 37);
        setField(term23641, term23641.getClass(), "first", term23641);
        term23762 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term23762, term23762.getClass(), "currentTraversal", null);
        term23763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23763, term23763.getClass(), "type", 37);
        setField(term23763, term23763.getClass(), "next", null);
        setField(term23763, term23763.getClass(), "first", term23763);
        setField(term23763, term23763.getClass(), "last", null);
        setField(term23763, term23763.getClass(), "propListHead", null);
        setIntField(term23763, term23763.getClass(), "sourcePosition", 0);
        setField(term23763, term23763.getClass(), "jsType", null);
        setField(term23763, term23763.getClass(), "parent", null);
        term23742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23742, term23742.getClass(), "type", 37);
        setField(term23742, term23742.getClass(), "next", null);
        setField(term23742, term23742.getClass(), "first", term23742);
        setField(term23742, term23742.getClass(), "last", null);
        setField(term23742, term23742.getClass(), "propListHead", null);
        setIntField(term23742, term23742.getClass(), "sourcePosition", 0);
        setField(term23742, term23742.getClass(), "jsType", null);
        setField(term23742, term23742.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23641;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term23571, args);
        assertTrue(recursiveEquals(term23571, term23762));
        assertTrue(recursiveEquals(term23641, term23763));
        assertTrue(recursiveEquals(retValue, term23742));
    }

};


