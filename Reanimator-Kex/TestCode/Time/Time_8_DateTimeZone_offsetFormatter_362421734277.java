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

public class DateTimeZone_offsetFormatter_362421734277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64878;

    public DateTimeZone_offsetFormatter_362421734277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cOffsetFormatter", null);
        term64878 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term64879 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term64879, term64879.getClass(), "iZeroOffsetPrintText", null);
        setField(term64879, term64879.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term64879, term64879.getClass(), "iShowSeparators", true);
        setIntField(term64879, term64879.getClass(), "iMinFields", 2);
        setIntField(term64879, term64879.getClass(), "iMaxFields", 4);
        setField(term64878, term64878.getClass(), "iPrinter", term64879);
        setField(term64878, term64878.getClass(), "iParser", term64879);
        setField(term64878, term64878.getClass(), "iLocale", null);
        setBooleanField(term64878, term64878.getClass(), "iOffsetParsed", false);
        setField(term64878, term64878.getClass(), "iChrono", null);
        setField(term64878, term64878.getClass(), "iZone", null);
        setField(term64878, term64878.getClass(), "iPivotYear", null);
        setIntField(term64878, term64878.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "offsetFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term64878));
    }

};


