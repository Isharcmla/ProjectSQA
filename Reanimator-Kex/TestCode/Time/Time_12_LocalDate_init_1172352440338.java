package org.joda.time;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_init_1172352440338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172534;

    public LocalDate_init_1172352440338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term172493 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term172534 = newInstance(Class.forName("java.util.Collections$CheckedSortedMap"));
        Object term172616 = newInstance(Class.forName("org.joda.time.convert.ConverterManager"));
        Object term172690 = newInstance(Class.forName("org.joda.time.convert.ConverterSet"));
        Object[] term172441 = (Object[]) newArray("org.joda.time.convert.ConverterSet$Entry", 0);
        setField(term172690, term172690.getClass(), "iSelectEntries", term172441);
        setField(term172616, term172616.getClass(), "iPartialConverters", term172690);
        setField(null, Class.forName("org.joda.time.convert.ConverterManager"), "INSTANCE", term172616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[2];
        args[0] = term172534;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


