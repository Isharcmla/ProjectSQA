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
import java.lang.Object;

public class CollapseProperties_updateSimpleDeclaration_1821953220158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85555;
     Object term85657;

    public CollapseProperties_updateSimpleDeclaration_1821953220158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85555 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term85657 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term85727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85727, term85727.getClass(), "next", term85797);
        setField(term85727, term85727.getClass(), "parent", term85727);
        setField(term85657, term85657.getClass(), "node", term85727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term85657;
        try {
            callMethod(klass, "updateSimpleDeclaration", argTypes, term85555, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


