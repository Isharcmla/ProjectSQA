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
import java.lang.Object;

public class VarCheck_process_146632422084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61937;
     Object term62007;

    public VarCheck_process_146632422084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61937 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term61937, term61937.getClass(), "sanityCheck", false);
        setField(term61937, term61937.getClass(), "compiler", null);
        term62007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62007, term62007.getClass(), "type", 0);
        setField(term62147, term62147.getClass(), "next", term62217);
        setIntField(term62147, term62147.getClass(), "type", 0);
        setField(term62309, term62309.getClass(), "next", term62379);
        setIntField(term62309, term62309.getClass(), "type", 0);
        setField(term62471, term62471.getClass(), "next", null);
        setIntField(term62471, term62471.getClass(), "type", 0);
        setField(term62541, term62541.getClass(), "next", term62611);
        setIntField(term62541, term62541.getClass(), "type", 0);
        setField(term62681, term62681.getClass(), "next", term62773);
        setIntField(term62681, term62681.getClass(), "type", 0);
        setField(term62865, term62865.getClass(), "next", term62471);
        setIntField(term62865, term62865.getClass(), "type", 0);
        setField(term62935, term62935.getClass(), "next", term62309);
        setIntField(term62935, term62935.getClass(), "type", 0);
        setField(term63005, term63005.getClass(), "next", term62007);
        setIntField(term63005, term63005.getClass(), "type", 0);
        setField(term63005, term63005.getClass(), "first", term62541);
        setField(term62935, term62935.getClass(), "first", term63005);
        setField(term62865, term62865.getClass(), "first", term62935);
        setField(term62681, term62681.getClass(), "first", term62865);
        setField(term62541, term62541.getClass(), "first", term62681);
        setField(term62471, term62471.getClass(), "first", term62541);
        setField(term62309, term62309.getClass(), "first", term62471);
        setField(term62147, term62147.getClass(), "first", term62309);
        setField(term62077, term62077.getClass(), "next", term62147);
        setIntField(term62077, term62077.getClass(), "type", 0);
        setField(term62077, term62077.getClass(), "first", null);
        setField(term62007, term62007.getClass(), "first", term62077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term62007;
        args[1] = null;
        callMethod(klass, "process", argTypes, term61937, args);
    }

};


