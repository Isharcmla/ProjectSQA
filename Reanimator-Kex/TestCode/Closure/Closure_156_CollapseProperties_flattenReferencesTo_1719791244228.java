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

public class CollapseProperties_flattenReferencesTo_1719791244228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127305;
     Object term127409;

    public CollapseProperties_flattenReferencesTo_1719791244228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127305 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term127461 = new ArrayList();
        Object term127551 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term127513 = new ArrayList();
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        ((ArrayList) term127513).add(term127551);
        term127409 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term127409, term127409.getClass(), "refs", term127461);
        setField(term127409, term127409.getClass(), "parent", null);
        setField(term127409, term127409.getClass(), "name", null);
        setField(term127409, term127409.getClass(), "props", term127513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term127409;
        args[1] = null;
        try {
            callMethod(klass, "flattenReferencesTo", argTypes, term127305, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


