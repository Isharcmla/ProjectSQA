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

public class Rule_createResourceName_182678189623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum12;
     Object enum13;

    public Rule_createResourceName_182678189623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7197 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term7196 = ((Class) term7197).getDeclaredField((String) "GENERIC");
        ((Field) term7196).setAccessible(true);
        enum12 = ((Field) term7196).get((Object) null);
        Class<? extends Object> term7450 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term7449 = ((Class) term7450).getDeclaredField((String) "EXACT");
        ((Field) term7449).setAccessible(true);
        enum13 = ((Field) term7449).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.NameType");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.RuleType");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum12;
        args[1] = enum13;
        args[2] = "PAEBtnZtTD";
        try {
            callMethod(klass, "createResourceName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


