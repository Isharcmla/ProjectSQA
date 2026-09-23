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

public class ZonedChronology_assemble_1604148452581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263815;
     Object term263991;

    public ZonedChronology_assemble_1604148452581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263815 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term263891 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term263815, term263815.getClass(), "iParam", term263891);
        term263991 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term264107 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term264197 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term263991, term263991.getClass(), "eras", null);
        setField(term263991, term263991.getClass(), "centuries", null);
        setField(term263991, term263991.getClass(), "years", null);
        setField(term263991, term263991.getClass(), "months", null);
        setField(term263991, term263991.getClass(), "weekyears", null);
        setField(term263991, term263991.getClass(), "weeks", null);
        setField(term263991, term263991.getClass(), "days", null);
        setField(term263991, term263991.getClass(), "halfdays", null);
        setField(term263991, term263991.getClass(), "hours", null);
        setField(term263991, term263991.getClass(), "minutes", null);
        setField(term263991, term263991.getClass(), "seconds", null);
        setField(term263991, term263991.getClass(), "millis", null);
        setField(term263991, term263991.getClass(), "year", null);
        setField(term263991, term263991.getClass(), "yearOfEra", null);
        setField(term263991, term263991.getClass(), "yearOfCentury", null);
        setField(term263991, term263991.getClass(), "centuryOfEra", null);
        setField(term263991, term263991.getClass(), "era", null);
        setField(term263991, term263991.getClass(), "dayOfWeek", null);
        setField(term263991, term263991.getClass(), "dayOfMonth", null);
        setField(term263991, term263991.getClass(), "dayOfYear", null);
        setField(term263991, term263991.getClass(), "monthOfYear", null);
        setField(term263991, term263991.getClass(), "weekOfWeekyear", null);
        setField(term263991, term263991.getClass(), "weekyear", null);
        setField(term263991, term263991.getClass(), "weekyearOfCentury", null);
        setField(term264107, term264107.getClass(), "iDurationField", term264197);
        setField(term263991, term263991.getClass(), "millisOfSecond", term264107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term263991;
        try {
            callMethod(klass, "assemble", argTypes, term263815, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


