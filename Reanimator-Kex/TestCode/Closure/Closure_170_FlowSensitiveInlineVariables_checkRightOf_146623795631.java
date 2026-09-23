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
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkRightOf_146623795631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3924;
     Object term4029;
     Object term4199;
     Object term4201;

    public FlowSensitiveInlineVariables_checkRightOf_146623795631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term4029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3924, term3924.getClass(), "next", null);
        setField(term3924, term3924.getClass(), "parent", term4029);
        term4199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4199, term4199.getClass(), "type", 0);
        setField(term4199, term4199.getClass(), "next", null);
        setField(term4199, term4199.getClass(), "first", null);
        setField(term4199, term4199.getClass(), "last", null);
        setField(term4199, term4199.getClass(), "propListHead", null);
        setIntField(term4199, term4199.getClass(), "sourcePosition", 0);
        setField(term4199, term4199.getClass(), "jsType", null);
        setIntField(term4200, term4200.getClass(), "type", 0);
        setField(term4200, term4200.getClass(), "next", null);
        setField(term4200, term4200.getClass(), "first", null);
        setField(term4200, term4200.getClass(), "last", null);
        setField(term4200, term4200.getClass(), "propListHead", null);
        setIntField(term4200, term4200.getClass(), "sourcePosition", 0);
        setField(term4200, term4200.getClass(), "jsType", null);
        setField(term4200, term4200.getClass(), "parent", null);
        setField(term4199, term4199.getClass(), "parent", term4200);
        term4201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4201, term4201.getClass(), "type", 0);
        setField(term4201, term4201.getClass(), "next", null);
        setField(term4201, term4201.getClass(), "first", null);
        setField(term4201, term4201.getClass(), "last", null);
        setField(term4201, term4201.getClass(), "propListHead", null);
        setIntField(term4201, term4201.getClass(), "sourcePosition", 0);
        setField(term4201, term4201.getClass(), "jsType", null);
        setField(term4201, term4201.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3924;
        args[1] = term4029;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term3924, term4199));
        assertTrue(recursiveEquals(term4029, term4201));
        assertTrue(recursiveEquals(retValue, false));
    }

};


