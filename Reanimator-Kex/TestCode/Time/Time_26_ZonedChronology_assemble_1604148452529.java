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

public class ZonedChronology_assemble_1604148452529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242010;
     Object term242184;

    public ZonedChronology_assemble_1604148452529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242010 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term242084 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term242010, term242010.getClass(), "iParam", term242084);
        term242184 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term242288 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term242378 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term242184, term242184.getClass(), "eras", null);
        setField(term242184, term242184.getClass(), "centuries", null);
        setField(term242184, term242184.getClass(), "years", null);
        setField(term242184, term242184.getClass(), "months", null);
        setField(term242184, term242184.getClass(), "weekyears", null);
        setField(term242184, term242184.getClass(), "weeks", null);
        setField(term242184, term242184.getClass(), "days", null);
        setField(term242184, term242184.getClass(), "halfdays", null);
        setField(term242184, term242184.getClass(), "hours", null);
        setField(term242184, term242184.getClass(), "minutes", null);
        setField(term242184, term242184.getClass(), "seconds", null);
        setField(term242184, term242184.getClass(), "millis", null);
        setField(term242184, term242184.getClass(), "year", null);
        setField(term242184, term242184.getClass(), "yearOfEra", null);
        setField(term242288, term242288.getClass(), "iUnitField", null);
        setField(term242288, term242288.getClass(), "iRangeField", term242378);
        setField(term242184, term242184.getClass(), "yearOfCentury", term242288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term242184;
        try {
            callMethod(klass, "assemble", argTypes, term242010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


