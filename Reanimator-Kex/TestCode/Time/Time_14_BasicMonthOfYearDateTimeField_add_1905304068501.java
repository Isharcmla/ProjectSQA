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

public class BasicMonthOfYearDateTimeField_add_1905304068501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203085;
     Object term203143;

    public BasicMonthOfYearDateTimeField_add_1905304068501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203085 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term203143 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term203223 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term203323 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term203407 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term203323, term203323.getClass(), "iDurationField", term203407);
        setField(term203223, term203223.getClass(), "iYear", term203323);
        setField(term203143, term203143.getClass(), "iChronology", term203223);
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
        args[0] = term203143;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term203085, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


