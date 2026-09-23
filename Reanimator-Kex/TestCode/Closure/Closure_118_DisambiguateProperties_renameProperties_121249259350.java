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
import java.util.HashMap;
import java.lang.Object;

public class DisambiguateProperties_renameProperties_121249259350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11093;

    public DisambiguateProperties_renameProperties_121249259350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11231 = newInstance(Class.forName("java.lang.Object"));
        HashMap term11141 = new HashMap();
        ((HashMap) term11141).put(term11231, term11231);
        term11093 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term11093, term11093.getClass(), "properties", term11141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "renameProperties", argTypes, term11093, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


