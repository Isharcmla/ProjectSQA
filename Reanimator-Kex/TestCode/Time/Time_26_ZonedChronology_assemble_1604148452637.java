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

public class ZonedChronology_assemble_1604148452637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330646;
     Object term330820;

    public ZonedChronology_assemble_1604148452637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330646 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term330720 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term330646, term330646.getClass(), "iParam", term330720);
        term330820 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term330924 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term331044 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term331160 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term330820, term330820.getClass(), "eras", null);
        setField(term330820, term330820.getClass(), "centuries", null);
        setField(term330820, term330820.getClass(), "years", null);
        setField(term330820, term330820.getClass(), "months", null);
        setField(term330820, term330820.getClass(), "weekyears", null);
        setField(term330820, term330820.getClass(), "weeks", null);
        setField(term330820, term330820.getClass(), "days", null);
        setField(term330820, term330820.getClass(), "halfdays", null);
        setField(term330820, term330820.getClass(), "hours", null);
        setField(term330820, term330820.getClass(), "minutes", null);
        setField(term330820, term330820.getClass(), "seconds", null);
        setField(term330820, term330820.getClass(), "millis", null);
        setField(term330820, term330820.getClass(), "year", null);
        setField(term330820, term330820.getClass(), "yearOfEra", null);
        setField(term330924, term330924.getClass(), "iUnitField", null);
        setField(term330924, term330924.getClass(), "iRangeField", null);
        setField(term330924, term330924.getClass(), "iType", term331044);
        setField(term330820, term330820.getClass(), "yearOfCentury", term330924);
        setField(term330820, term330820.getClass(), "centuryOfEra", null);
        setField(term330820, term330820.getClass(), "era", null);
        setField(term330820, term330820.getClass(), "dayOfWeek", null);
        setField(term330820, term330820.getClass(), "dayOfMonth", null);
        setField(term330820, term330820.getClass(), "dayOfYear", null);
        setField(term330820, term330820.getClass(), "monthOfYear", null);
        setField(term330820, term330820.getClass(), "weekOfWeekyear", null);
        setField(term330820, term330820.getClass(), "weekyear", term331160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term330820;
        try {
            callMethod(klass, "assemble", argTypes, term330646, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


