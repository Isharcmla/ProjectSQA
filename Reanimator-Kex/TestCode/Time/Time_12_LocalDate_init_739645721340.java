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

public class LocalDate_init_739645721340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public LocalDate_init_739645721340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term173479 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term173561 = newInstance(Class.forName("org.joda.time.convert.ConverterManager"));
        Object term173635 = newInstance(Class.forName("org.joda.time.convert.ConverterSet"));
        Object[] term173427 = (Object[]) newArray("org.joda.time.convert.ConverterSet$Entry", 0);
        setField(term173635, term173635.getClass(), "iSelectEntries", term173427);
        setField(term173561, term173561.getClass(), "iPartialConverters", term173635);
        setField(null, Class.forName("org.joda.time.convert.ConverterManager"), "INSTANCE", term173561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


