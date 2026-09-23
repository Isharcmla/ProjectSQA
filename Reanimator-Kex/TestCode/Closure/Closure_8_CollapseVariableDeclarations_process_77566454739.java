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
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Object;

public class CollapseVariableDeclarations_process_77566454739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23358;
     Object term23680;

    public CollapseVariableDeclarations_process_77566454739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23410 = new ArrayList();
        HashSet term23458 = new HashSet();
        term23358 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term23358, term23358.getClass(), "collapses", term23410);
        setField(term23358, term23358.getClass(), "nodesToCollapse", term23458);
        setField(term23358, term23358.getClass(), "compiler", null);
        term23680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23680, term23680.getClass(), "type", 0);
        setField(term23680, term23680.getClass(), "parent", null);
        setField(term23750, term23750.getClass(), "next", term23820);
        setIntField(term23750, term23750.getClass(), "type", 105);
        setField(term23680, term23680.getClass(), "first", term23750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23680;
        callMethod(klass, "process", argTypes, term23358, args);
    }

};


