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
import java.lang.String;

public class DateTimeFormatterBuilder_append_58061458429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69545;
     Object term69354;

    public DateTimeFormatterBuilder_append_58061458429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69545 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term70980 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term70979 = ((Class) term70980).getDeclaredField((String) "INSTANCE");
        ((Field) term70979).setAccessible(true);
        Object enum14 = ((Field) term70979).get((Object) null);
        term69354 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 9);
        Object term69675 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        Object term69919 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        Object term70045 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term70171 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object term70293 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setElement(term69354, 0, term69675);
        setElement(term69354, 1, enum14);
        setElement(term69354, 2, term69919);
        setElement(term69354, 3, term70045);
        setElement(term69354, 4, term70171);
        setElement(term69354, 5, term70293);
        setElement(term69354, 6, enum14);
        setElement(term69354, 7, term69675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69354;
        try {
            callMethod(klass, "append", argTypes, term69545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


