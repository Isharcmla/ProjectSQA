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

public class CollapseProperties_warnAboutNamespaceRedefinition_202624364242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10869;

    public CollapseProperties_warnAboutNamespaceRedefinition_202624364242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10869 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term10869, term10869.getClass(), "compiler", null);
        setField(term10869, term10869.getClass(), "globalNames", null);
        setField(term10869, term10869.getClass(), "nameMap", null);
        setBooleanField(term10869, term10869.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term10869, term10869.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "warnAboutNamespaceRedefinition", argTypes, term10869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


