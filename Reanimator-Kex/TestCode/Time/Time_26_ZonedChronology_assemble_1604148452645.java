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

public class ZonedChronology_assemble_1604148452645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335339;
     Object term335533;

    public ZonedChronology_assemble_1604148452645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335339 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term335433 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term335339, term335339.getClass(), "iParam", term335433);
        term335533 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term335637 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term335757 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term335873 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term335533, term335533.getClass(), "eras", null);
        setField(term335533, term335533.getClass(), "centuries", null);
        setField(term335533, term335533.getClass(), "years", null);
        setField(term335533, term335533.getClass(), "months", null);
        setField(term335533, term335533.getClass(), "weekyears", null);
        setField(term335533, term335533.getClass(), "weeks", null);
        setField(term335533, term335533.getClass(), "days", null);
        setField(term335533, term335533.getClass(), "halfdays", null);
        setField(term335533, term335533.getClass(), "hours", null);
        setField(term335533, term335533.getClass(), "minutes", null);
        setField(term335533, term335533.getClass(), "seconds", null);
        setField(term335533, term335533.getClass(), "millis", null);
        setField(term335533, term335533.getClass(), "year", null);
        setField(term335533, term335533.getClass(), "yearOfEra", null);
        setField(term335637, term335637.getClass(), "iUnitField", null);
        setField(term335637, term335637.getClass(), "iRangeField", null);
        setField(term335637, term335637.getClass(), "iType", term335757);
        setField(term335533, term335533.getClass(), "yearOfCentury", term335637);
        setField(term335533, term335533.getClass(), "centuryOfEra", term335873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term335533;
        try {
            callMethod(klass, "assemble", argTypes, term335339, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


