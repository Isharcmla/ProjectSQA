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

public class ZonedChronology_assemble_1604148452337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130361;
     Object term130461;

    public ZonedChronology_assemble_1604148452337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130361 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term130361, term130361.getClass(), "iParam", null);
        term130461 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term130573 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term130703 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        Object term130823 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term130461, term130461.getClass(), "eras", null);
        setField(term130461, term130461.getClass(), "centuries", null);
        setField(term130461, term130461.getClass(), "years", null);
        setField(term130461, term130461.getClass(), "months", null);
        setField(term130461, term130461.getClass(), "weekyears", null);
        setField(term130461, term130461.getClass(), "weeks", null);
        setField(term130461, term130461.getClass(), "days", null);
        setField(term130461, term130461.getClass(), "halfdays", null);
        setField(term130461, term130461.getClass(), "hours", null);
        setField(term130461, term130461.getClass(), "minutes", null);
        setField(term130461, term130461.getClass(), "seconds", null);
        setField(term130461, term130461.getClass(), "millis", null);
        setField(term130461, term130461.getClass(), "year", null);
        setField(term130461, term130461.getClass(), "yearOfEra", null);
        setField(term130461, term130461.getClass(), "yearOfCentury", null);
        setField(term130461, term130461.getClass(), "centuryOfEra", null);
        setField(term130461, term130461.getClass(), "era", null);
        setField(term130461, term130461.getClass(), "dayOfWeek", null);
        setField(term130461, term130461.getClass(), "dayOfMonth", null);
        setField(term130461, term130461.getClass(), "dayOfYear", null);
        setField(term130461, term130461.getClass(), "monthOfYear", null);
        setField(term130461, term130461.getClass(), "weekOfWeekyear", null);
        setField(term130703, term130703.getClass(), "iType", term130823);
        setField(term130573, term130573.getClass(), "iUnitField", term130703);
        setField(term130461, term130461.getClass(), "weekyear", term130573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term130461;
        try {
            callMethod(klass, "assemble", argTypes, term130361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


