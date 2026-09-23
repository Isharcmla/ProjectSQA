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

public class ZonedChronology_assemble_1604148452543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247691;
     Object term247791;

    public ZonedChronology_assemble_1604148452543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247691 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term247691, term247691.getClass(), "iParam", null);
        term247791 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term247885 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term247997 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term248127 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        Object term248247 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term247791, term247791.getClass(), "eras", null);
        setField(term247791, term247791.getClass(), "centuries", null);
        setField(term247791, term247791.getClass(), "years", null);
        setField(term247791, term247791.getClass(), "months", null);
        setField(term247791, term247791.getClass(), "weekyears", null);
        setField(term247791, term247791.getClass(), "weeks", null);
        setField(term247791, term247791.getClass(), "days", null);
        setField(term247791, term247791.getClass(), "halfdays", null);
        setField(term247791, term247791.getClass(), "hours", null);
        setField(term247791, term247791.getClass(), "minutes", null);
        setField(term247791, term247791.getClass(), "seconds", null);
        setField(term247791, term247791.getClass(), "millis", null);
        setField(term247791, term247791.getClass(), "year", null);
        setField(term247791, term247791.getClass(), "yearOfEra", null);
        setField(term247791, term247791.getClass(), "yearOfCentury", null);
        setField(term247791, term247791.getClass(), "centuryOfEra", null);
        setField(term247791, term247791.getClass(), "era", null);
        setField(term247791, term247791.getClass(), "dayOfWeek", null);
        setField(term247791, term247791.getClass(), "dayOfMonth", null);
        setField(term247791, term247791.getClass(), "dayOfYear", null);
        setField(term247791, term247791.getClass(), "monthOfYear", null);
        setField(term247791, term247791.getClass(), "weekOfWeekyear", null);
        setField(term247791, term247791.getClass(), "weekyear", null);
        setField(term247791, term247791.getClass(), "weekyearOfCentury", null);
        setField(term247791, term247791.getClass(), "millisOfSecond", null);
        setField(term247791, term247791.getClass(), "millisOfDay", term247885);
        setField(term247791, term247791.getClass(), "secondOfMinute", null);
        setField(term247791, term247791.getClass(), "secondOfDay", null);
        setField(term247791, term247791.getClass(), "minuteOfHour", null);
        setField(term247791, term247791.getClass(), "minuteOfDay", null);
        setField(term247791, term247791.getClass(), "hourOfDay", null);
        setField(term247791, term247791.getClass(), "hourOfHalfday", null);
        setField(term248127, term248127.getClass(), "iType", term248247);
        setField(term247997, term247997.getClass(), "iUnitField", term248127);
        setField(term247791, term247791.getClass(), "clockhourOfDay", term247997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term247791;
        try {
            callMethod(klass, "assemble", argTypes, term247691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


