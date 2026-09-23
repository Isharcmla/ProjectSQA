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
import java.lang.IllegalArgumentException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_toLocalDateTime_808352383225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124725;
     Object term124859;

    public LocalDate_toLocalDateTime_808352383225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124725 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term124807 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term124725, term124725.getClass(), "iChronology", term124807);
        term124859 = newInstance(Class.forName("org.joda.time.LocalTime"));
        Object term124939 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term124859, term124859.getClass(), "iChronology", term124939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.LocalTime");
        Object[] args = new Object[1];
        args[0] = term124859;
        try {
            callMethod(klass, "toLocalDateTime", argTypes, term124725, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


