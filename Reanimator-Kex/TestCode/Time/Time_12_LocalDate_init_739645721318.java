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

public class LocalDate_init_739645721318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159770;

    public LocalDate_init_739645721318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term159745 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term159770 = newInstance(Class.forName("java.util.Spliterators"));
        Object term159852 = newInstance(Class.forName("org.joda.time.convert.ConverterManager"));
        Object term159926 = newInstance(Class.forName("org.joda.time.convert.ConverterSet"));
        Object[] term159693 = (Object[]) newArray("org.joda.time.convert.ConverterSet$Entry", 0);
        setField(term159926, term159926.getClass(), "iSelectEntries", term159693);
        setField(term159852, term159852.getClass(), "iPartialConverters", term159926);
        setField(null, Class.forName("org.joda.time.convert.ConverterManager"), "INSTANCE", term159852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term159770;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


