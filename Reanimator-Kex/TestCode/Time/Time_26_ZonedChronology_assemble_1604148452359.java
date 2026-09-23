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

public class ZonedChronology_assemble_1604148452359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133571;
     Object term133671;

    public ZonedChronology_assemble_1604148452359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133571 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term133571, term133571.getClass(), "iParam", null);
        term133671 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term133775 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term133865 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        Object term133985 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term133671, term133671.getClass(), "eras", null);
        setField(term133671, term133671.getClass(), "centuries", null);
        setField(term133671, term133671.getClass(), "years", null);
        setField(term133671, term133671.getClass(), "months", null);
        setField(term133671, term133671.getClass(), "weekyears", null);
        setField(term133671, term133671.getClass(), "weeks", null);
        setField(term133671, term133671.getClass(), "days", null);
        setField(term133671, term133671.getClass(), "halfdays", null);
        setField(term133671, term133671.getClass(), "hours", null);
        setField(term133671, term133671.getClass(), "minutes", null);
        setField(term133671, term133671.getClass(), "seconds", null);
        setField(term133671, term133671.getClass(), "millis", null);
        setField(term133671, term133671.getClass(), "year", null);
        setField(term133671, term133671.getClass(), "yearOfEra", null);
        setField(term133671, term133671.getClass(), "yearOfCentury", null);
        setField(term133671, term133671.getClass(), "centuryOfEra", null);
        setField(term133865, term133865.getClass(), "iType", term133985);
        setField(term133775, term133775.getClass(), "iUnitField", term133865);
        setField(term133671, term133671.getClass(), "era", term133775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term133671;
        try {
            callMethod(klass, "assemble", argTypes, term133571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


