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
import java.lang.Integer;

public class CollapseProperties_flattenPrefixes_35740292349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15238;
     Object term15241;

    public CollapseProperties_flattenPrefixes_35740292349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15238 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term15238, term15238.getClass(), "compiler", null);
        setField(term15238, term15238.getClass(), "globalNames", null);
        setField(term15238, term15238.getClass(), "nameMap", null);
        setBooleanField(term15238, term15238.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term15238, term15238.getClass(), "inlineAliases", false);
        term15241 = new Integer(0);
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
        args[1] = null;
        args[2] = term15241;
        try {
            callMethod(klass, "flattenPrefixes", argTypes, term15238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


