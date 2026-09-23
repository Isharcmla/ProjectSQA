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

public class ZonedChronology_assemble_1604148452565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257051;
     Object term257225;

    public ZonedChronology_assemble_1604148452565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257051 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term257125 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term257051, term257051.getClass(), "iParam", term257125);
        term257225 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term257319 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term257415 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term257225, term257225.getClass(), "eras", null);
        setField(term257225, term257225.getClass(), "centuries", null);
        setField(term257225, term257225.getClass(), "years", null);
        setField(term257225, term257225.getClass(), "months", null);
        setField(term257225, term257225.getClass(), "weekyears", null);
        setField(term257225, term257225.getClass(), "weeks", null);
        setField(term257225, term257225.getClass(), "days", null);
        setField(term257225, term257225.getClass(), "halfdays", null);
        setField(term257225, term257225.getClass(), "hours", null);
        setField(term257225, term257225.getClass(), "minutes", null);
        setField(term257225, term257225.getClass(), "seconds", null);
        setField(term257225, term257225.getClass(), "millis", null);
        setField(term257225, term257225.getClass(), "year", null);
        setField(term257225, term257225.getClass(), "yearOfEra", null);
        setField(term257225, term257225.getClass(), "yearOfCentury", null);
        setField(term257225, term257225.getClass(), "centuryOfEra", null);
        setField(term257225, term257225.getClass(), "era", null);
        setField(term257225, term257225.getClass(), "dayOfWeek", null);
        setField(term257225, term257225.getClass(), "dayOfMonth", null);
        setField(term257225, term257225.getClass(), "dayOfYear", null);
        setField(term257225, term257225.getClass(), "monthOfYear", null);
        setField(term257225, term257225.getClass(), "weekOfWeekyear", null);
        setField(term257225, term257225.getClass(), "weekyear", null);
        setField(term257225, term257225.getClass(), "weekyearOfCentury", null);
        setField(term257225, term257225.getClass(), "millisOfSecond", null);
        setField(term257225, term257225.getClass(), "millisOfDay", term257319);
        setField(term257225, term257225.getClass(), "secondOfMinute", null);
        setField(term257225, term257225.getClass(), "secondOfDay", term257415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term257225;
        try {
            callMethod(klass, "assemble", argTypes, term257051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


