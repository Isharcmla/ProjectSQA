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

public class ZonedChronology_assemble_1604148452475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213547;
     Object term213761;

    public ZonedChronology_assemble_1604148452475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213547 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term213661 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term213547, term213547.getClass(), "iParam", term213661);
        term213761 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term213865 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term213977 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term214097 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term213761, term213761.getClass(), "eras", null);
        setField(term213761, term213761.getClass(), "centuries", null);
        setField(term213761, term213761.getClass(), "years", null);
        setField(term213761, term213761.getClass(), "months", null);
        setField(term213761, term213761.getClass(), "weekyears", null);
        setField(term213761, term213761.getClass(), "weeks", null);
        setField(term213761, term213761.getClass(), "days", null);
        setField(term213761, term213761.getClass(), "halfdays", null);
        setField(term213761, term213761.getClass(), "hours", null);
        setField(term213761, term213761.getClass(), "minutes", null);
        setField(term213761, term213761.getClass(), "seconds", null);
        setField(term213761, term213761.getClass(), "millis", null);
        setField(term213977, term213977.getClass(), "iType", term214097);
        setField(term213865, term213865.getClass(), "iUnitField", term213977);
        setField(term213761, term213761.getClass(), "year", term213865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term213761;
        try {
            callMethod(klass, "assemble", argTypes, term213547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


