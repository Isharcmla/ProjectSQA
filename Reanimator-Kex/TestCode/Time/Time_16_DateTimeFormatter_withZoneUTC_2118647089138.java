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

public class DateTimeFormatter_withZoneUTC_2118647089138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23888;
     Object term24243;
     Object term24227;

    public DateTimeFormatter_withZoneUTC_2118647089138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23888 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term23962 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term23962, term23962.getClass(), "iNameKey", "UTC");
        setIntField(term23962, term23962.getClass(), "iWallOffset", 0);
        setIntField(term23962, term23962.getClass(), "iStandardOffset", 0);
        setField(term23962, term23962.getClass(), "iID", "UTC");
        setField(term23888, term23888.getClass(), "iZone", term23962);
        term24243 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term24244 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term24243, term24243.getClass(), "iPrinter", null);
        setField(term24243, term24243.getClass(), "iParser", null);
        setField(term24243, term24243.getClass(), "iLocale", null);
        setBooleanField(term24243, term24243.getClass(), "iOffsetParsed", false);
        setField(term24243, term24243.getClass(), "iChrono", null);
        setField(term24244, term24244.getClass(), "iNameKey", "UTC");
        setIntField(term24244, term24244.getClass(), "iWallOffset", 0);
        setIntField(term24244, term24244.getClass(), "iStandardOffset", 0);
        setField(term24244, term24244.getClass(), "iID", "UTC");
        setField(term24243, term24243.getClass(), "iZone", term24244);
        setField(term24243, term24243.getClass(), "iPivotYear", null);
        setIntField(term24243, term24243.getClass(), "iDefaultYear", 0);
        term24227 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term24229 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term24227, term24227.getClass(), "iPrinter", null);
        setField(term24227, term24227.getClass(), "iParser", null);
        setField(term24227, term24227.getClass(), "iLocale", null);
        setBooleanField(term24227, term24227.getClass(), "iOffsetParsed", false);
        setField(term24227, term24227.getClass(), "iChrono", null);
        setField(term24229, term24229.getClass(), "iNameKey", "UTC");
        setIntField(term24229, term24229.getClass(), "iWallOffset", 0);
        setIntField(term24229, term24229.getClass(), "iStandardOffset", 0);
        setField(term24229, term24229.getClass(), "iID", "UTC");
        setField(term24227, term24227.getClass(), "iZone", term24229);
        setField(term24227, term24227.getClass(), "iPivotYear", null);
        setIntField(term24227, term24227.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withZoneUTC", argTypes, term23888, args);
        assertTrue(recursiveEquals(term23888, term24243));
        assertTrue(recursiveEquals(retValue, term24227));
    }

};


