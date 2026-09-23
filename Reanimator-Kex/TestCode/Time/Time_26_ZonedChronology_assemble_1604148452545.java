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

public class ZonedChronology_assemble_1604148452545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248738;
     Object term248952;

    public ZonedChronology_assemble_1604148452545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248738 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term248852 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term248738, term248738.getClass(), "iParam", term248852);
        term248952 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term249036 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term248952, term248952.getClass(), "eras", null);
        setField(term248952, term248952.getClass(), "centuries", null);
        setField(term248952, term248952.getClass(), "years", null);
        setField(term248952, term248952.getClass(), "months", null);
        setField(term248952, term248952.getClass(), "weekyears", null);
        setField(term248952, term248952.getClass(), "weeks", null);
        setField(term248952, term248952.getClass(), "days", null);
        setField(term248952, term248952.getClass(), "halfdays", null);
        setField(term248952, term248952.getClass(), "hours", null);
        setField(term248952, term248952.getClass(), "minutes", null);
        setField(term248952, term248952.getClass(), "seconds", null);
        setField(term248952, term248952.getClass(), "millis", null);
        setField(term248952, term248952.getClass(), "year", null);
        setField(term248952, term248952.getClass(), "yearOfEra", null);
        setField(term248952, term248952.getClass(), "yearOfCentury", null);
        setField(term248952, term248952.getClass(), "centuryOfEra", null);
        setField(term248952, term248952.getClass(), "era", null);
        setField(term248952, term248952.getClass(), "dayOfWeek", term249036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term248952;
        try {
            callMethod(klass, "assemble", argTypes, term248738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


