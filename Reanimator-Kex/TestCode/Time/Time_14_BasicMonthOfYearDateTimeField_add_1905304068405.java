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

public class BasicMonthOfYearDateTimeField_add_1905304068405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130717;
     Object term130765;

    public BasicMonthOfYearDateTimeField_add_1905304068405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130717 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term130765 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term130528 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object term130885 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term130885, term130885.getClass(), "iOrdinal", (byte) 10);
        setElement(term130528, 0, term130885);
        setField(term130765, term130765.getClass(), "iTypes", term130528);
        setField(term130765, term130765.getClass(), "iChronology", null);
        Object term130959 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term130959, term130959.getClass(), "iNameKey", "UTC");
        setIntField(term130959, term130959.getClass(), "iWallOffset", 0);
        setIntField(term130959, term130959.getClass(), "iStandardOffset", 0);
        setField(term130959, term130959.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term130959);
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
        args[0] = term130765;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        callMethod(klass, "add", argTypes, term130717, args);
    }

};


