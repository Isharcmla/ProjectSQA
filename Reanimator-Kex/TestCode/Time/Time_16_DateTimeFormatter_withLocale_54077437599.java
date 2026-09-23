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
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;

public class DateTimeFormatter_withLocale_54077437599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11745;
     Object term11802;
     Object term12072;
     Object term12074;
     Object term12066;

    public DateTimeFormatter_withLocale_54077437599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11745 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        term11802 = newInstance(Class.forName("java.util.Locale"));
        setField(term11745, term11745.getClass(), "iLocale", term11802);
        term12072 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term12073 = newInstance(Class.forName("java.util.Locale"));
        setField(term12072, term12072.getClass(), "iPrinter", null);
        setField(term12072, term12072.getClass(), "iParser", null);
        setField(term12073, term12073.getClass(), "baseLocale", null);
        setField(term12073, term12073.getClass(), "localeExtensions", null);
        setIntField(term12073, term12073.getClass(), "hashCodeValue", 0);
        setField(term12073, term12073.getClass(), "languageTag", null);
        setField(term12072, term12072.getClass(), "iLocale", term12073);
        setBooleanField(term12072, term12072.getClass(), "iOffsetParsed", false);
        setField(term12072, term12072.getClass(), "iChrono", null);
        setField(term12072, term12072.getClass(), "iZone", null);
        setField(term12072, term12072.getClass(), "iPivotYear", null);
        setIntField(term12072, term12072.getClass(), "iDefaultYear", 0);
        term12074 = newInstance(Class.forName("java.util.Locale"));
        setField(term12074, term12074.getClass(), "baseLocale", null);
        setField(term12074, term12074.getClass(), "localeExtensions", null);
        setIntField(term12074, term12074.getClass(), "hashCodeValue", 0);
        setField(term12074, term12074.getClass(), "languageTag", null);
        term12066 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term12067 = newInstance(Class.forName("java.util.Locale"));
        setField(term12066, term12066.getClass(), "iPrinter", null);
        setField(term12066, term12066.getClass(), "iParser", null);
        setField(term12067, term12067.getClass(), "baseLocale", null);
        setField(term12067, term12067.getClass(), "localeExtensions", null);
        setIntField(term12067, term12067.getClass(), "hashCodeValue", 0);
        setField(term12067, term12067.getClass(), "languageTag", null);
        setField(term12066, term12066.getClass(), "iLocale", term12067);
        setBooleanField(term12066, term12066.getClass(), "iOffsetParsed", false);
        setField(term12066, term12066.getClass(), "iChrono", null);
        setField(term12066, term12066.getClass(), "iZone", null);
        setField(term12066, term12066.getClass(), "iPivotYear", null);
        setIntField(term12066, term12066.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term11802;
        Object retValue = callMethod(klass, "withLocale", argTypes, term11745, args);
        assertTrue(recursiveEquals(term11745, term12072));
        assertTrue(recursiveEquals(term11802, term12074));
        assertTrue(recursiveEquals(retValue, term12066));
    }

};


