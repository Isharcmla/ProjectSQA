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

public class CollapseProperties_warnAboutNamespaceRedefinition_2026243642138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262635;
     Object term262737;

    public CollapseProperties_warnAboutNamespaceRedefinition_2026243642138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262635 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term262635, term262635.getClass(), "compiler", null);
        term262737 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term262737;
        try {
            callMethod(klass, "warnAboutNamespaceRedefinition", argTypes, term262635, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


