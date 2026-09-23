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

public class Rule_createScanner_94785569824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum14;
     Object enum15;

    public Rule_createScanner_94785569824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8023 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term8022 = ((Class) term8023).getDeclaredField((String) "SEPHARDIC");
        ((Field) term8022).setAccessible(true);
        enum14 = ((Field) term8022).get((Object) null);
        Class<? extends Object> term8282 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term8281 = ((Class) term8282).getDeclaredField((String) "RULES");
        ((Field) term8281).setAccessible(true);
        enum15 = ((Field) term8281).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum14;
        args[1] = enum15;
        args[2] = "sjlJAEtRrb";
        try {
            callMethod(klass, "createScanner", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


