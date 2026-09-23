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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_toString_81799368457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15923;

    public ZonedChronology_toString_81799368457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15923 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term16001 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term16075 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term15923, term15923.getClass(), "iBase", term16001);
        setField(term15923, term15923.getClass(), "iParam", term16075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term15923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


