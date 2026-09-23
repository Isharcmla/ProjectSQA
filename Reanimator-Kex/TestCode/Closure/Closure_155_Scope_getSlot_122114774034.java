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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getSlot_122114774034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public Scope_getSlot_122114774034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term682 = new HashMap();
        term681 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term695 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term681, term681.getClass(), "vars", term682);
        setField(term695, term695.getClass(), "vars", null);
        setField(term695, term695.getClass(), "parent", null);
        setIntField(term695, term695.getClass(), "depth", 0);
        setField(term695, term695.getClass(), "rootNode", null);
        setField(term695, term695.getClass(), "thisType", null);
        setBooleanField(term695, term695.getClass(), "isBottom", false);
        setField(term681, term681.getClass(), "parent", term695);
        setIntField(term681, term681.getClass(), "depth", 548228925);
        setIntField(term699, term699.getClass(), "type", 0);
        setField(term699, term699.getClass(), "next", null);
        setField(term699, term699.getClass(), "first", null);
        setField(term699, term699.getClass(), "last", null);
        setField(term699, term699.getClass(), "propListHead", null);
        setIntField(term699, term699.getClass(), "sourcePosition", 0);
        setField(term699, term699.getClass(), "jsType", null);
        setField(term699, term699.getClass(), "parent", null);
        setField(term681, term681.getClass(), "rootNode", term699);
        setField(term681, term681.getClass(), "thisType", null);
        setBooleanField(term681, term681.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        try {
            callMethod(klass, "getSlot", argTypes, term681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


