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

public class Rule_getInstanceMap_36479443029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum20;
     Object enum21;

    public Rule_getInstanceMap_36479443029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11145 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term11144 = ((Class) term11145).getDeclaredField((String) "ASHKENAZI");
        ((Field) term11144).setAccessible(true);
        enum20 = ((Field) term11144).get((Object) null);
        Class<? extends Object> term11404 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term11403 = ((Class) term11404).getDeclaredField((String) "APPROX");
        ((Field) term11403).setAccessible(true);
        enum21 = ((Field) term11403).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = Class.forName("org.apache.commons.codec.language.bm.Languages$LanguageSet");
        Object[] args = new Object[3];
        args[0] = enum20;
        args[1] = enum21;
        args[2] = null;
        try {
            callMethod(klass, "getInstanceMap", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


