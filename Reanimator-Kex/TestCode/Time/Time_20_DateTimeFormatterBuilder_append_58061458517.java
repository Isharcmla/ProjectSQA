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

public class DateTimeFormatterBuilder_append_58061458517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103155;
     Object term102979;

    public DateTimeFormatterBuilder_append_58061458517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103155 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term104569 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term104568 = ((Class) term104569).getDeclaredField((String) "INSTANCE");
        ((Field) term104568).setAccessible(true);
        Object enum49 = ((Field) term104568).get((Object) null);
        term102979 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 8);
        Object term103271 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        Object term103511 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term103631 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term103737 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        Object term103861 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object term103967 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setElement(term102979, 0, term103271);
        setElement(term102979, 1, enum49);
        setElement(term102979, 2, term103511);
        setElement(term102979, 3, term103631);
        setElement(term102979, 4, term103737);
        setElement(term102979, 5, term103861);
        setElement(term102979, 6, term103967);
        setElement(term102979, 7, term103737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term102979;
        try {
            callMethod(klass, "append", argTypes, term103155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


