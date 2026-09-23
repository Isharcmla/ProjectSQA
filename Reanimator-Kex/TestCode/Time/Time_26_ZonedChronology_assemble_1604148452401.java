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

public class ZonedChronology_assemble_1604148452401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175300;
     Object term175400;

    public ZonedChronology_assemble_1604148452401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175300 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term175300, term175300.getClass(), "iParam", null);
        term175400 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term175516 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term175610 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term175700 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term175400, term175400.getClass(), "eras", null);
        setField(term175400, term175400.getClass(), "centuries", null);
        setField(term175400, term175400.getClass(), "years", null);
        setField(term175400, term175400.getClass(), "months", null);
        setField(term175400, term175400.getClass(), "weekyears", null);
        setField(term175400, term175400.getClass(), "weeks", null);
        setField(term175400, term175400.getClass(), "days", null);
        setField(term175400, term175400.getClass(), "halfdays", null);
        setField(term175400, term175400.getClass(), "hours", null);
        setField(term175400, term175400.getClass(), "minutes", null);
        setField(term175400, term175400.getClass(), "seconds", null);
        setField(term175400, term175400.getClass(), "millis", null);
        setField(term175400, term175400.getClass(), "year", null);
        setField(term175400, term175400.getClass(), "yearOfEra", null);
        setField(term175400, term175400.getClass(), "yearOfCentury", null);
        setField(term175400, term175400.getClass(), "centuryOfEra", null);
        setField(term175400, term175400.getClass(), "era", null);
        setField(term175400, term175400.getClass(), "dayOfWeek", null);
        setField(term175400, term175400.getClass(), "dayOfMonth", null);
        setField(term175400, term175400.getClass(), "dayOfYear", null);
        setField(term175400, term175400.getClass(), "monthOfYear", null);
        setField(term175400, term175400.getClass(), "weekOfWeekyear", null);
        setField(term175400, term175400.getClass(), "weekyear", null);
        setField(term175400, term175400.getClass(), "weekyearOfCentury", null);
        setField(term175516, term175516.getClass(), "iDurationField", term175610);
        setField(term175516, term175516.getClass(), "iRangeDurationField", term175700);
        setField(term175400, term175400.getClass(), "millisOfSecond", term175516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term175400;
        try {
            callMethod(klass, "assemble", argTypes, term175300, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


