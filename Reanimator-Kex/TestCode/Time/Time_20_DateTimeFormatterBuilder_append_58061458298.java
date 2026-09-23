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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DateTimeFormatterBuilder_append_58061458298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42467;
     Object term42587;
     Object enum7;

    public DateTimeFormatterBuilder_append_58061458298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42467 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term42587 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Class<? extends Object> term43497 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term43496 = ((Class) term43497).getDeclaredField((String) "INSTANCE");
        ((Field) term43496).setAccessible(true);
        enum7 = ((Field) term43496).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[2];
        args[0] = term42587;
        args[1] = enum7;
        try {
            callMethod(klass, "append", argTypes, term42467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


