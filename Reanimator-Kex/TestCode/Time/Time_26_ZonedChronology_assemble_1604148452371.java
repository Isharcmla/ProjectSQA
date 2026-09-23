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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139253;
     Object term139447;

    public ZonedChronology_assemble_1604148452371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139253 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term139347 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term139253, term139253.getClass(), "iParam", term139347);
        term139447 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term139551 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term139447, term139447.getClass(), "eras", null);
        setField(term139447, term139447.getClass(), "centuries", null);
        setField(term139447, term139447.getClass(), "years", null);
        setField(term139447, term139447.getClass(), "months", null);
        setField(term139447, term139447.getClass(), "weekyears", null);
        setField(term139447, term139447.getClass(), "weeks", null);
        setField(term139447, term139447.getClass(), "days", null);
        setField(term139447, term139447.getClass(), "halfdays", null);
        setField(term139447, term139447.getClass(), "hours", null);
        setField(term139447, term139447.getClass(), "minutes", null);
        setField(term139447, term139447.getClass(), "seconds", null);
        setField(term139447, term139447.getClass(), "millis", null);
        setField(term139447, term139447.getClass(), "year", null);
        setField(term139447, term139447.getClass(), "yearOfEra", null);
        setField(term139447, term139447.getClass(), "yearOfCentury", term139551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term139447;
        try {
            callMethod(klass, "assemble", argTypes, term139253, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


