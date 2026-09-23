package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class LocalDate_toString_1687987170336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170998;
     Object term171744;

    public LocalDate_toString_1687987170336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170998 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term171080 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term171196 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        Object[] term170946 = (Object[]) newArray("org.joda.time.format.DateTimePrinter", 0);
        setIntField(term171196, term171196.getClass(), "iPrintedLengthEstimate", 488);
        setField(term171196, term171196.getClass(), "iPrinters", term170946);
        setField(term171080, term171080.getClass(), "iPrinter", term171196);
        setField(term171080, term171080.getClass(), "iLocale", null);
        setField(null, Class.forName("org.joda.time.format.ISODateTimeFormat"), "ymd", term171080);
        setField(null, Class.forName("java.util.Locale"), "defaultLocale", null);
        term171744 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term171744, term171744.getClass(), "iLocalMillis", 0L);
        setField(term171744, term171744.getClass(), "iChronology", null);
        setIntField(term171744, term171744.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term170998, args);
        assertTrue(recursiveEquals(term170998, term171744));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


