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

public class ZonedChronology_assemble_1604148452195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71290;
     Object term71390;

    public ZonedChronology_assemble_1604148452195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71290 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term71290, term71290.getClass(), "iParam", null);
        term71390 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term71494 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term71584 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term71390, term71390.getClass(), "eras", null);
        setField(term71390, term71390.getClass(), "centuries", null);
        setField(term71390, term71390.getClass(), "years", null);
        setField(term71390, term71390.getClass(), "months", null);
        setField(term71390, term71390.getClass(), "weekyears", null);
        setField(term71390, term71390.getClass(), "weeks", null);
        setField(term71390, term71390.getClass(), "days", null);
        setField(term71390, term71390.getClass(), "halfdays", null);
        setField(term71390, term71390.getClass(), "hours", null);
        setField(term71390, term71390.getClass(), "minutes", null);
        setField(term71390, term71390.getClass(), "seconds", null);
        setField(term71390, term71390.getClass(), "millis", null);
        setField(term71390, term71390.getClass(), "year", null);
        setField(term71390, term71390.getClass(), "yearOfEra", null);
        setField(term71390, term71390.getClass(), "yearOfCentury", null);
        setField(term71390, term71390.getClass(), "centuryOfEra", null);
        setField(term71390, term71390.getClass(), "era", null);
        setField(term71390, term71390.getClass(), "dayOfWeek", null);
        setField(term71390, term71390.getClass(), "dayOfMonth", null);
        setField(term71390, term71390.getClass(), "dayOfYear", null);
        setField(term71390, term71390.getClass(), "monthOfYear", null);
        setField(term71494, term71494.getClass(), "iUnitField", term71584);
        setField(term71390, term71390.getClass(), "weekOfWeekyear", term71494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term71390;
        try {
            callMethod(klass, "assemble", argTypes, term71290, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


