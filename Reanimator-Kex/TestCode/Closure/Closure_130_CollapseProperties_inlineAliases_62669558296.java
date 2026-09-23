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

public class CollapseProperties_inlineAliases_62669558296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245893;
     Object term245987;

    public CollapseProperties_inlineAliases_62669558296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245893 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term245987 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setBooleanField(term245987, term245987.getClass(), "generated", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Object[] args = new Object[1];
        args[0] = term245987;
        try {
            callMethod(klass, "inlineAliases", argTypes, term245893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


