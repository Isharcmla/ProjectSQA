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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class CollapseProperties_flattenPrefixes_357402923219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120582;
     Object term120686;

    public CollapseProperties_flattenPrefixes_357402923219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120582 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term120738 = new ArrayList();
        Object term120828 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term120790 = new ArrayList();
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        ((ArrayList) term120790).add(term120828);
        term120686 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term120686, term120686.getClass(), "parent", null);
        setField(term120686, term120686.getClass(), "name", null);
        setField(term120686, term120686.getClass(), "declaration", null);
        setField(term120686, term120686.getClass(), "refs", term120738);
        setField(term120686, term120686.getClass(), "props", term120790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term120686;
        args[2] = 0;
        try {
            callMethod(klass, "flattenPrefixes", argTypes, term120582, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


