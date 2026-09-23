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

public class ZonedChronology_assemble_1604148452597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271036;
     Object term271210;

    public ZonedChronology_assemble_1604148452597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271036 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term271110 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term271036, term271036.getClass(), "iParam", term271110);
        term271210 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term271314 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term271430 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term271550 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term271210, term271210.getClass(), "eras", null);
        setField(term271210, term271210.getClass(), "centuries", null);
        setField(term271210, term271210.getClass(), "years", null);
        setField(term271210, term271210.getClass(), "months", null);
        setField(term271210, term271210.getClass(), "weekyears", null);
        setField(term271210, term271210.getClass(), "weeks", null);
        setField(term271210, term271210.getClass(), "days", null);
        setField(term271210, term271210.getClass(), "halfdays", null);
        setField(term271210, term271210.getClass(), "hours", null);
        setField(term271210, term271210.getClass(), "minutes", null);
        setField(term271210, term271210.getClass(), "seconds", null);
        setField(term271210, term271210.getClass(), "millis", null);
        setField(term271314, term271314.getClass(), "iUnitField", null);
        setField(term271430, term271430.getClass(), "iType", term271550);
        setField(term271314, term271314.getClass(), "iRangeField", term271430);
        setField(term271210, term271210.getClass(), "year", term271314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term271210;
        try {
            callMethod(klass, "assemble", argTypes, term271036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


