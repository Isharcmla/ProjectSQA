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

public class BasicMonthOfYearDateTimeField_add_1905304068375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106398;
     Object term106446;

    public BasicMonthOfYearDateTimeField_add_1905304068375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106398 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term106446 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term106209 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term106566 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term106566, term106566.getClass(), "iOrdinal", (byte) 3);
        setElement(term106209, 0, term106566);
        setField(term106446, term106446.getClass(), "iTypes", term106209);
        setField(term106446, term106446.getClass(), "iChronology", null);
        Object term106640 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term106640, term106640.getClass(), "iNameKey", "UTC");
        setIntField(term106640, term106640.getClass(), "iWallOffset", 0);
        setIntField(term106640, term106640.getClass(), "iStandardOffset", 0);
        setField(term106640, term106640.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term106640);
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
        args[0] = term106446;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term106398, args);
    }

};


