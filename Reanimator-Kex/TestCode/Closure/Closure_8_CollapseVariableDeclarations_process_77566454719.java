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
import java.util.HashSet;
import java.lang.Object;

public class CollapseVariableDeclarations_process_77566454719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9025;
     Object term9295;

    public CollapseVariableDeclarations_process_77566454719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9077 = new ArrayList();
        HashSet term9125 = new HashSet();
        term9025 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term9025, term9025.getClass(), "collapses", term9077);
        setField(term9025, term9025.getClass(), "nodesToCollapse", term9125);
        setField(term9025, term9025.getClass(), "compiler", null);
        term9295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9295, term9295.getClass(), "type", 0);
        setField(term9295, term9295.getClass(), "parent", null);
        setField(term9365, term9365.getClass(), "next", term9435);
        setIntField(term9365, term9365.getClass(), "type", 0);
        setField(term9505, term9505.getClass(), "next", null);
        setIntField(term9505, term9505.getClass(), "type", 0);
        setField(term9505, term9505.getClass(), "first", null);
        setField(term9365, term9365.getClass(), "first", term9505);
        setField(term9295, term9295.getClass(), "first", term9365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9295;
        try {
            callMethod(klass, "process", argTypes, term9025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


