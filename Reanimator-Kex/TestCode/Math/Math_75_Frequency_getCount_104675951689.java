package org.apache.commons.math.stat;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Frequency_getCount_104675951689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8486;
     Object enum1;

    public Frequency_getCount_104675951689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8486 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Class<? extends Object> term9048 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term9047 = ((Class) term9048).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term9047).setAccessible(true);
        enum1 = ((Field) term9047).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = enum1;
        try {
            callMethod(klass, "getCount", argTypes, term8486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


