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

public class CollapseProperties_warnAboutNamespaceAliasing_1054839546130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73152;
     Object term73336;
     Object term73438;

    public CollapseProperties_warnAboutNamespaceAliasing_1054839546130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73152 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term73232 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term73152, term73152.getClass(), "compiler", term73232);
        term73336 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term73438 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term73438, term73438.getClass(), "sourceName", "");
        setField(term73438, term73438.getClass(), "node", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[2];
        args[0] = term73336;
        args[1] = term73438;
        try {
            callMethod(klass, "warnAboutNamespaceAliasing", argTypes, term73152, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


