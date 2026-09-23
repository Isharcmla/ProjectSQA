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

public class DateTimeFormatterBuilder_append_58061458469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83377;
     Object term83223;

    public DateTimeFormatterBuilder_append_58061458469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83377 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term83223 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term83503 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object term83629 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setElement(term83223, 0, term83503);
        setIntField(term83629, term83629.getClass(), "iMinFields", 1073741825);
        setBooleanField(term83629, term83629.getClass(), "iShowSeparators", false);
        setField(term83629, term83629.getClass(), "iZeroOffsetPrintText", null);
        setElement(term83223, 1, term83629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term83223;
        try {
            callMethod(klass, "append", argTypes, term83377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


