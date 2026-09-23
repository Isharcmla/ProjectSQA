package org.apache.commons.codec.language.bm;

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
import java.lang.NoClassDefFoundError;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Rule_getInstanceMap_34428512530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum22;
     Object enum23;

    public Rule_getInstanceMap_34428512530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11970 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term11969 = ((Class) term11970).getDeclaredField((String) "GENERIC");
        ((Field) term11969).setAccessible(true);
        enum22 = ((Field) term11969).get((Object) null);
        Class<? extends Object> term12223 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term12222 = ((Class) term12223).getDeclaredField((String) "EXACT");
        ((Field) term12222).setAccessible(true);
        enum23 = ((Field) term12222).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum22;
        args[1] = enum23;
        args[2] = "jJCZpVmanW";
        try {
            callMethod(klass, "getInstanceMap", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


