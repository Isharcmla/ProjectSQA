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

public class Rule_getInstance_152298137427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum16;
     Object enum17;

    public Rule_getInstance_152298137427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9497 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term9496 = ((Class) term9497).getDeclaredField((String) "GENERIC");
        ((Field) term9496).setAccessible(true);
        enum16 = ((Field) term9496).get((Object) null);
        Class<? extends Object> term9750 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term9749 = ((Class) term9750).getDeclaredField((String) "EXACT");
        ((Field) term9749).setAccessible(true);
        enum17 = ((Field) term9749).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = Class.forName("org.apache.commons.codec.language.bm.Languages$LanguageSet");
        Object[] args = new Object[3];
        args[0] = enum16;
        args[1] = enum17;
        args[2] = null;
        try {
            callMethod(klass, "getInstance", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


