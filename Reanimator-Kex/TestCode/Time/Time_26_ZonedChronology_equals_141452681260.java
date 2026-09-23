package org.joda.time.chrono;

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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_equals_141452681260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96714;
     Object term96908;

    public ZonedChronology_equals_141452681260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96714 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term96947 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term96830 = newInstance(Class.forName("java.lang.Object"));
        setField(term96714, term96714.getClass(), "iBase", term96947);
        setField(term96714, term96714.getClass(), "iParam", term96830);
        term96908 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term96908, term96908.getClass(), "iBase", term96947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96908;
        try {
            callMethod(klass, "equals", argTypes, term96714, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


