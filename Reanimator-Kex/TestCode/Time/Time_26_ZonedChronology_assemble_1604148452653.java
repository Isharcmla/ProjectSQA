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

public class ZonedChronology_assemble_1604148452653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340027;
     Object term340201;

    public ZonedChronology_assemble_1604148452653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340027 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term340101 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term340027, term340027.getClass(), "iParam", term340101);
        term340201 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term340305 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term340425 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term340513 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term340201, term340201.getClass(), "eras", null);
        setField(term340201, term340201.getClass(), "centuries", null);
        setField(term340201, term340201.getClass(), "years", null);
        setField(term340201, term340201.getClass(), "months", null);
        setField(term340201, term340201.getClass(), "weekyears", null);
        setField(term340201, term340201.getClass(), "weeks", null);
        setField(term340201, term340201.getClass(), "days", null);
        setField(term340201, term340201.getClass(), "halfdays", null);
        setField(term340201, term340201.getClass(), "hours", null);
        setField(term340201, term340201.getClass(), "minutes", null);
        setField(term340201, term340201.getClass(), "seconds", null);
        setField(term340201, term340201.getClass(), "millis", null);
        setField(term340201, term340201.getClass(), "year", null);
        setField(term340201, term340201.getClass(), "yearOfEra", null);
        setField(term340305, term340305.getClass(), "iUnitField", null);
        setField(term340305, term340305.getClass(), "iRangeField", null);
        setField(term340305, term340305.getClass(), "iType", term340425);
        setField(term340201, term340201.getClass(), "yearOfCentury", term340305);
        setField(term340201, term340201.getClass(), "centuryOfEra", null);
        setField(term340201, term340201.getClass(), "era", null);
        setField(term340201, term340201.getClass(), "dayOfWeek", null);
        setField(term340201, term340201.getClass(), "dayOfMonth", null);
        setField(term340201, term340201.getClass(), "dayOfYear", null);
        setField(term340201, term340201.getClass(), "monthOfYear", null);
        setField(term340201, term340201.getClass(), "weekOfWeekyear", null);
        setField(term340201, term340201.getClass(), "weekyear", null);
        setField(term340201, term340201.getClass(), "weekyearOfCentury", null);
        setField(term340201, term340201.getClass(), "millisOfSecond", null);
        setField(term340201, term340201.getClass(), "millisOfDay", term340513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term340201;
        try {
            callMethod(klass, "assemble", argTypes, term340027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


