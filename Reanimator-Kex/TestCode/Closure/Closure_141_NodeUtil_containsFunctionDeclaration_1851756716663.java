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

public class NodeUtil_containsFunctionDeclaration_1851756716663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64059;

    public NodeUtil_containsFunctionDeclaration_1851756716663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64059, term64059.getClass(), "type", 1);
        setIntField(term64129, term64129.getClass(), "type", 0);
        setIntField(term64199, term64199.getClass(), "type", 0);
        setField(term64199, term64199.getClass(), "first", term64129);
        setField(term64129, term64129.getClass(), "first", term64199);
        setField(term64059, term64059.getClass(), "first", term64129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term64059;
        callMethod(klass, "containsFunctionDeclaration", argTypes, null, args);
    }

};


