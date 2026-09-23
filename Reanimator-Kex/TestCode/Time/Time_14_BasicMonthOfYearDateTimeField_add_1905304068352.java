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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92557;
     Object term92615;

    public BasicMonthOfYearDateTimeField_add_1905304068352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92557 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term92615 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term92699 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term92803 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term92897 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term92803, term92803.getClass(), "iUnitField", term92897);
        setField(term92699, term92699.getClass(), "iYear", term92803);
        setField(term92615, term92615.getClass(), "iChronology", term92699);
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
        args[0] = term92615;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term92557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


