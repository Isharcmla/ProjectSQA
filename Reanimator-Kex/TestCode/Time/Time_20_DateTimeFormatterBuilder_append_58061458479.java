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
import java.lang.Object;

public class DateTimeFormatterBuilder_append_58061458479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85927;
     Object term86043;
     Object term85801;

    public DateTimeFormatterBuilder_append_58061458479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85927 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term86043 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        term85801 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term86165 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setElement(term85801, 0, term86165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term86043;
        args[1] = term85801;
        try {
            callMethod(klass, "append", argTypes, term85927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


