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
import java.lang.ExceptionInInitializerError;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class PhoneticEngine_init_92777655712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum20;
     Object enum21;
     Object term55;

    public PhoneticEngine_init_92777655712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6260 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term6259 = ((Class) term6260).getDeclaredField((String) "GENERIC");
        ((Field) term6259).setAccessible(true);
        enum20 = ((Field) term6259).get((Object) null);
        Class<? extends Object> term6513 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term6512 = ((Class) term6513).getDeclaredField((String) "EXACT");
        ((Field) term6512).setAccessible(true);
        enum21 = ((Field) term6512).get((Object) null);
        term55 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = enum20;
        args[1] = enum21;
        args[2] = term55;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


