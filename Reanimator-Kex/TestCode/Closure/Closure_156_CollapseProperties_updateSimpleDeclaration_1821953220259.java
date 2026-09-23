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

public class CollapseProperties_updateSimpleDeclaration_1821953220259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140646;
     Object term140828;

    public CollapseProperties_updateSimpleDeclaration_1821953220259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140646 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term140726 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term140646, term140646.getClass(), "compiler", term140726);
        term140828 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term140898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140968, term140968.getClass(), "type", -106);
        setField(term140898, term140898.getClass(), "next", term140968);
        setField(term141108, term141108.getClass(), "parent", term141108);
        setField(term141038, term141038.getClass(), "parent", term141108);
        setField(term140898, term140898.getClass(), "parent", term141038);
        setField(term140828, term140828.getClass(), "node", term140898);
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
        args[2] = term140828;
        try {
            callMethod(klass, "updateSimpleDeclaration", argTypes, term140646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


