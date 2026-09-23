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

public class ZonedChronology_assemble_1604148452255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95404;
     Object term95504;

    public ZonedChronology_assemble_1604148452255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95404 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term95404, term95404.getClass(), "iParam", null);
        term95504 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term95608 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term95698 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term95504, term95504.getClass(), "eras", null);
        setField(term95504, term95504.getClass(), "centuries", null);
        setField(term95504, term95504.getClass(), "years", null);
        setField(term95504, term95504.getClass(), "months", null);
        setField(term95504, term95504.getClass(), "weekyears", null);
        setField(term95504, term95504.getClass(), "weeks", null);
        setField(term95504, term95504.getClass(), "days", null);
        setField(term95504, term95504.getClass(), "halfdays", null);
        setField(term95504, term95504.getClass(), "hours", null);
        setField(term95504, term95504.getClass(), "minutes", null);
        setField(term95504, term95504.getClass(), "seconds", null);
        setField(term95504, term95504.getClass(), "millis", null);
        setField(term95504, term95504.getClass(), "year", null);
        setField(term95504, term95504.getClass(), "yearOfEra", null);
        setField(term95504, term95504.getClass(), "yearOfCentury", null);
        setField(term95504, term95504.getClass(), "centuryOfEra", null);
        setField(term95504, term95504.getClass(), "era", null);
        setField(term95504, term95504.getClass(), "dayOfWeek", null);
        setField(term95504, term95504.getClass(), "dayOfMonth", null);
        setField(term95504, term95504.getClass(), "dayOfYear", null);
        setField(term95504, term95504.getClass(), "monthOfYear", null);
        setField(term95608, term95608.getClass(), "iUnitField", null);
        setField(term95608, term95608.getClass(), "iRangeField", term95698);
        setField(term95504, term95504.getClass(), "weekOfWeekyear", term95608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term95504;
        try {
            callMethod(klass, "assemble", argTypes, term95404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


