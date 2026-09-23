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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class PhoneticEngine_init_50782347313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum22;
     Object enum23;
     Object term693;
     Object term695;

    public PhoneticEngine_init_50782347313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7145 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term7144 = ((Class) term7145).getDeclaredField((String) "SEPHARDIC");
        ((Field) term7144).setAccessible(true);
        enum22 = ((Field) term7144).get((Object) null);
        Class<? extends Object> term7404 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term7403 = ((Class) term7404).getDeclaredField((String) "RULES");
        ((Field) term7403).setAccessible(true);
        enum23 = ((Field) term7403).get((Object) null);
        term693 = new Boolean(false);
        term695 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = enum22;
        args[1] = enum23;
        args[2] = term693;
        args[3] = term695;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


