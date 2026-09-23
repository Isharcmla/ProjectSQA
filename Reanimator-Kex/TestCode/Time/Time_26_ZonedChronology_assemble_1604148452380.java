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

public class ZonedChronology_assemble_1604148452380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162688;
     Object term162864;

    public ZonedChronology_assemble_1604148452380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162688 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term162764 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term162688, term162688.getClass(), "iParam", term162764);
        term162864 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term162960 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        setField(term162864, term162864.getClass(), "eras", null);
        setField(term162864, term162864.getClass(), "centuries", null);
        setField(term162864, term162864.getClass(), "years", null);
        setField(term162864, term162864.getClass(), "months", null);
        setField(term162864, term162864.getClass(), "weekyears", null);
        setField(term162864, term162864.getClass(), "weeks", null);
        setField(term162864, term162864.getClass(), "days", null);
        setField(term162864, term162864.getClass(), "halfdays", null);
        setField(term162864, term162864.getClass(), "hours", null);
        setField(term162864, term162864.getClass(), "minutes", null);
        setField(term162864, term162864.getClass(), "seconds", null);
        setField(term162864, term162864.getClass(), "millis", null);
        setField(term162864, term162864.getClass(), "year", null);
        setField(term162864, term162864.getClass(), "yearOfEra", null);
        setField(term162864, term162864.getClass(), "yearOfCentury", null);
        setField(term162864, term162864.getClass(), "centuryOfEra", term162960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term162864;
        try {
            callMethod(klass, "assemble", argTypes, term162688, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


