package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_selectChronology_914502882216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67791;
     Object term67988;

    public DateTimeFormatter_selectChronology_914502882216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67791 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        term67988 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        Object term67947 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term67791, term67791.getClass(), "iChrono", term67988);
        setField(term67791, term67791.getClass(), "iZone", term67947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term67988;
        callMethod(klass, "selectChronology", argTypes, term67791, args);
    }

};


