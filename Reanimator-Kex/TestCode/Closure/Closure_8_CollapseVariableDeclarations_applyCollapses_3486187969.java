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
import java.util.ArrayList;

public class CollapseVariableDeclarations_applyCollapses_3486187969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2176;
     Object term2632;

    public CollapseVariableDeclarations_applyCollapses_3486187969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2228 = new ArrayList();
        term2176 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term2176, term2176.getClass(), "collapses", term2228);
        ArrayList term2633 = new ArrayList();
        term2632 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term2632, term2632.getClass(), "compiler", null);
        setField(term2632, term2632.getClass(), "collapses", term2633);
        setField(term2632, term2632.getClass(), "nodesToCollapse", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "applyCollapses", argTypes, term2176, args);
        assertTrue(recursiveEquals(term2176, term2632));
    }

};


