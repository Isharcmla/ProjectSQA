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
import java.util.ArrayList;
import java.lang.Object;

public class PureFunctionIdentifier_markPureFunctionCalls_87078875712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;

    public PureFunctionIdentifier_markPureFunctionCalls_87078875712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term203 = new HashMap();
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223, term223.getClass(), "type", 0);
        setField(term223, term223.getClass(), "next", null);
        setField(term223, term223.getClass(), "first", null);
        setField(term223, term223.getClass(), "last", null);
        setField(term223, term223.getClass(), "propListHead", null);
        setIntField(term223, term223.getClass(), "sourcePosition", 0);
        setField(term223, term223.getClass(), "jsType", null);
        setField(term223, term223.getClass(), "parent", null);
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term226, term226.getClass(), "type", 0);
        setField(term226, term226.getClass(), "next", null);
        setField(term226, term226.getClass(), "first", null);
        setField(term226, term226.getClass(), "last", null);
        setField(term226, term226.getClass(), "propListHead", null);
        setIntField(term226, term226.getClass(), "sourcePosition", 0);
        setField(term226, term226.getClass(), "jsType", null);
        setField(term226, term226.getClass(), "parent", null);
        Object term229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229, term229.getClass(), "type", 0);
        setField(term229, term229.getClass(), "next", null);
        setField(term229, term229.getClass(), "first", null);
        setField(term229, term229.getClass(), "last", null);
        setField(term229, term229.getClass(), "propListHead", null);
        setIntField(term229, term229.getClass(), "sourcePosition", 0);
        setField(term229, term229.getClass(), "jsType", null);
        setField(term229, term229.getClass(), "parent", null);
        Object term232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term232, term232.getClass(), "type", 0);
        setField(term232, term232.getClass(), "next", null);
        setField(term232, term232.getClass(), "first", null);
        setField(term232, term232.getClass(), "last", null);
        setField(term232, term232.getClass(), "propListHead", null);
        setIntField(term232, term232.getClass(), "sourcePosition", 0);
        setField(term232, term232.getClass(), "jsType", null);
        setField(term232, term232.getClass(), "parent", null);
        ArrayList term221 = new ArrayList();
        ((ArrayList) term221).add(term223);
        ((ArrayList) term221).add(term226);
        ((ArrayList) term221).add(term229);
        ((ArrayList) term221).add(term232);
        term202 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term202, term202.getClass(), "compiler", null);
        setField(term202, term202.getClass(), "definitionProvider", null);
        setField(term202, term202.getClass(), "functionSideEffectMap", term203);
        setField(term202, term202.getClass(), "allFunctionCalls", term221);
        setIntField(term237, term237.getClass(), "type", 0);
        setField(term237, term237.getClass(), "next", null);
        setField(term237, term237.getClass(), "first", null);
        setField(term237, term237.getClass(), "last", null);
        setField(term237, term237.getClass(), "propListHead", null);
        setIntField(term237, term237.getClass(), "sourcePosition", 0);
        setField(term237, term237.getClass(), "jsType", null);
        setField(term237, term237.getClass(), "parent", null);
        setField(term202, term202.getClass(), "externs", term237);
        setIntField(term240, term240.getClass(), "type", 0);
        setField(term240, term240.getClass(), "next", null);
        setField(term240, term240.getClass(), "first", null);
        setField(term240, term240.getClass(), "last", null);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term202, term202.getClass(), "root", term240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "markPureFunctionCalls", argTypes, term202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


