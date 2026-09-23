package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169294;
     Object term169342;

    public BasicMonthOfYearDateTimeField_add_1905304068456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169294 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term169342 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term169105 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term169462 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term169462, term169462.getClass(), "iOrdinal", (byte) 5);
        setElement(term169105, 0, term169462);
        setField(term169342, term169342.getClass(), "iTypes", term169105);
        setField(term169342, term169342.getClass(), "iChronology", null);
        Object term169536 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term169536, term169536.getClass(), "iNameKey", "UTC");
        setIntField(term169536, term169536.getClass(), "iWallOffset", 0);
        setIntField(term169536, term169536.getClass(), "iStandardOffset", 0);
        setField(term169536, term169536.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term169536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term169342;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term169294, args);
    }

};


