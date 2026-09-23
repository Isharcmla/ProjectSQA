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

public class CollapseProperties_warnAboutNamespaceRedefinition_2026243642191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105988;
     Object term106172;
     Object term106274;

    public CollapseProperties_warnAboutNamespaceRedefinition_2026243642191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105988 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Object term106068 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105988, term105988.getClass(), "compiler", term106068);
        term106172 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term106274 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term106274, term106274.getClass(), "sourceName", "");
        setField(term106274, term106274.getClass(), "node", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[2];
        args[0] = term106172;
        args[1] = term106274;
        try {
            callMethod(klass, "warnAboutNamespaceRedefinition", argTypes, term105988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


