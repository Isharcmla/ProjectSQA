package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_selectChronology_914502882212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64366;
     Object term64520;

    public DateTimeFormatter_selectChronology_914502882212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64366 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term64440 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term64366, term64366.getClass(), "iChrono", null);
        setField(term64366, term64366.getClass(), "iZone", term64440);
        term64520 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term64520;
        try {
            callMethod(klass, "selectChronology", argTypes, term64366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


