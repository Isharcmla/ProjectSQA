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

public class CollapseProperties_checkForHosedThisReferences_3903584552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35015;

    public CollapseProperties_checkForHosedThisReferences_3903584552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35015 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term35015, term35015.getClass(), "compiler", null);
        setField(term35015, term35015.getClass(), "globalNames", null);
        setField(term35015, term35015.getClass(), "nameMap", null);
        setBooleanField(term35015, term35015.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term35015, term35015.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkForHosedThisReferences", argTypes, term35015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


