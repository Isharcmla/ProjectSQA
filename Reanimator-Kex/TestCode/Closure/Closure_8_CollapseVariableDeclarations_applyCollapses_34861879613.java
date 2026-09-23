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
import java.util.ArrayList;
import java.lang.Object;

public class CollapseVariableDeclarations_applyCollapses_34861879613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5008;

    public CollapseVariableDeclarations_applyCollapses_34861879613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5198 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse"));
        Object term5268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5268, term5268.getClass(), "propListHead", null);
        setIntField(term5268, term5268.getClass(), "sourcePosition", 0);
        setField(term5268, term5268.getClass(), "parent", term5338);
        setField(term5198, term5198.getClass(), "startNode", term5268);
        setField(term5198, term5198.getClass(), "parent", term5338);
        Object term5376 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5060 = new ArrayList();
        ((ArrayList) term5060).add(term5198);
        ((ArrayList) term5060).add(term5376);
        term5008 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term5008, term5008.getClass(), "collapses", term5060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "applyCollapses", argTypes, term5008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


