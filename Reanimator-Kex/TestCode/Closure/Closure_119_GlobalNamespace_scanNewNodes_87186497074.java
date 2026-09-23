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
import java.util.LinkedList;
import java.lang.Object;

public class GlobalNamespace_scanNewNodes_87186497074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13906;
     Object term13960;
     Object term23719;
     Object term23720;

    public GlobalNamespace_scanNewNodes_87186497074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13906 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term14126 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange"));
        Object term14196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14196, term14196.getClass(), "type", 0);
        setField(term14126, term14126.getClass(), "node", term14196);
        term13960 = new LinkedList();
        ((LinkedList) term13960).add(term14126);
        ((LinkedList) term13960).add(term14126);
        term23719 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term23719, term23719.getClass(), "compiler", null);
        setField(term23719, term23719.getClass(), "root", null);
        setField(term23719, term23719.getClass(), "externsRoot", null);
        setBooleanField(term23719, term23719.getClass(), "inExterns", false);
        setField(term23719, term23719.getClass(), "externsScope", null);
        setBooleanField(term23719, term23719.getClass(), "generated", false);
        setIntField(term23719, term23719.getClass(), "currentPreOrderIndex", 0);
        setField(term23719, term23719.getClass(), "globalNames", null);
        setField(term23719, term23719.getClass(), "nameMap", null);
        Object term23722 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange"));
        Object term23723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23722, term23722.getClass(), "module", null);
        setField(term23722, term23722.getClass(), "scope", null);
        setIntField(term23723, term23723.getClass(), "type", 0);
        setField(term23723, term23723.getClass(), "next", null);
        setField(term23723, term23723.getClass(), "first", null);
        setField(term23723, term23723.getClass(), "last", null);
        setField(term23723, term23723.getClass(), "propListHead", null);
        setIntField(term23723, term23723.getClass(), "sourcePosition", 0);
        setField(term23723, term23723.getClass(), "jsType", null);
        setField(term23723, term23723.getClass(), "parent", null);
        setField(term23722, term23722.getClass(), "node", term23723);
        term23720 = new LinkedList();
        ((LinkedList) term23720).add(term23722);
        ((LinkedList) term23720).add(term23722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term13960;
        callMethod(klass, "scanNewNodes", argTypes, term13906, args);
        assertTrue(recursiveEquals(term13906, term23719));
        assertTrue(recursiveEquals(term13960, term23720));
    }

};


