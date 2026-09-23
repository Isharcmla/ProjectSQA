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

public class DateTimeFormatter_withZone_229176140195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55097;
     Object term55191;
     Object term55208;
     Object term55209;
     Object term55202;

    public DateTimeFormatter_withZone_229176140195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55097 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term55097, term55097.getClass(), "iZone", null);
        term55191 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        term55208 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term55208, term55208.getClass(), "iPrinter", null);
        setField(term55208, term55208.getClass(), "iParser", null);
        setField(term55208, term55208.getClass(), "iLocale", null);
        setBooleanField(term55208, term55208.getClass(), "iOffsetParsed", false);
        setField(term55208, term55208.getClass(), "iChrono", null);
        setField(term55208, term55208.getClass(), "iZone", null);
        setField(term55208, term55208.getClass(), "iPivotYear", null);
        setIntField(term55208, term55208.getClass(), "iDefaultYear", 0);
        term55209 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setIntField(term55209, term55209.getClass(), "iStandardOffset", 0);
        setField(term55209, term55209.getClass(), "iStartRecurrence", null);
        setField(term55209, term55209.getClass(), "iEndRecurrence", null);
        setField(term55209, term55209.getClass(), "iID", null);
        term55202 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term55199 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term55202, term55202.getClass(), "iPrinter", null);
        setField(term55202, term55202.getClass(), "iParser", null);
        setField(term55202, term55202.getClass(), "iLocale", null);
        setBooleanField(term55202, term55202.getClass(), "iOffsetParsed", false);
        setField(term55202, term55202.getClass(), "iChrono", null);
        setIntField(term55199, term55199.getClass(), "iStandardOffset", 0);
        setField(term55199, term55199.getClass(), "iStartRecurrence", null);
        setField(term55199, term55199.getClass(), "iEndRecurrence", null);
        setField(term55199, term55199.getClass(), "iID", null);
        setField(term55202, term55202.getClass(), "iZone", term55199);
        setField(term55202, term55202.getClass(), "iPivotYear", null);
        setIntField(term55202, term55202.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = term55191;
        Object retValue = callMethod(klass, "withZone", argTypes, term55097, args);
        assertTrue(recursiveEquals(term55097, term55208));
        assertTrue(recursiveEquals(term55191, term55209));
        assertTrue(recursiveEquals(retValue, term55202));
    }

};


