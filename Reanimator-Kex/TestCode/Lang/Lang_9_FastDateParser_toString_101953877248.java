package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateParser_toString_101953877248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3070;

    public FastDateParser_toString_101953877248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3070 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term3070, term3070.getClass(), "pattern", null);
        setField(term3070, term3070.getClass(), "timeZone", null);
        setField(term3070, term3070.getClass(), "locale", null);
        setField(term3070, term3070.getClass(), "parsePattern", null);
        setField(term3070, term3070.getClass(), "strategies", null);
        setIntField(term3070, term3070.getClass(), "thisYear", 0);
        setField(term3070, term3070.getClass(), "nameValues", null);
        setField(term3070, term3070.getClass(), "currentFormatField", null);
        setField(term3070, term3070.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term3070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


