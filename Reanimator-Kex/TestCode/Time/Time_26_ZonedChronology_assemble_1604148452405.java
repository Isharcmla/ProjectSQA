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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177057;
     Object term177157;

    public ZonedChronology_assemble_1604148452405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177057 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term177057, term177057.getClass(), "iParam", term177057);
        term177157 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term177241 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term177157, term177157.getClass(), "eras", null);
        setField(term177157, term177157.getClass(), "centuries", null);
        setField(term177157, term177157.getClass(), "years", null);
        setField(term177157, term177157.getClass(), "months", null);
        setField(term177157, term177157.getClass(), "weekyears", null);
        setField(term177157, term177157.getClass(), "weeks", null);
        setField(term177157, term177157.getClass(), "days", null);
        setField(term177157, term177157.getClass(), "halfdays", null);
        setField(term177157, term177157.getClass(), "hours", null);
        setField(term177157, term177157.getClass(), "minutes", null);
        setField(term177157, term177157.getClass(), "seconds", null);
        setField(term177157, term177157.getClass(), "millis", null);
        setField(term177157, term177157.getClass(), "year", null);
        setField(term177157, term177157.getClass(), "yearOfEra", null);
        setField(term177157, term177157.getClass(), "yearOfCentury", null);
        setField(term177157, term177157.getClass(), "centuryOfEra", null);
        setField(term177157, term177157.getClass(), "era", null);
        setField(term177157, term177157.getClass(), "dayOfWeek", term177241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term177157;
        try {
            callMethod(klass, "assemble", argTypes, term177057, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


