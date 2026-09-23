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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_init_1172352440266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138214;

    public LocalDate_init_1172352440266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138134 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term138214 = newInstance(Class.forName("java.io.ObjectInputStream$HandleTable"));
        Object term138296 = newInstance(Class.forName("org.joda.time.convert.ConverterManager"));
        Object term138370 = newInstance(Class.forName("org.joda.time.convert.ConverterSet"));
        setField(term138296, term138296.getClass(), "iPartialConverters", term138370);
        setField(null, Class.forName("org.joda.time.convert.ConverterManager"), "INSTANCE", term138296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[2];
        args[0] = term138214;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


