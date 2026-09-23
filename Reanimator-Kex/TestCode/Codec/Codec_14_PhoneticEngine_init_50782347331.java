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
import java.lang.Object;
import java.lang.String;

public class PhoneticEngine_init_50782347331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum57;

    public PhoneticEngine_init_50782347331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18726 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        Class<? extends Object> term19536 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term19535 = ((Class) term19536).getDeclaredField((String) "EXACT");
        ((Field) term19535).setAccessible(true);
        enum57 = ((Field) term19535).get((Object) null);
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
        args[0] = null;
        args[1] = enum57;
        args[2] = false;
        args[3] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


