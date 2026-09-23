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

public class BasicMonthOfYearDateTimeField_add_1905304068452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166308;
     Object term166366;

    public BasicMonthOfYearDateTimeField_add_1905304068452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166308 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term166366 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term166446 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term166546 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term166636 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term166546, term166546.getClass(), "iDurationField", term166636);
        setField(term166446, term166446.getClass(), "iYear", term166546);
        setField(term166366, term166366.getClass(), "iChronology", term166446);
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
        args[0] = term166366;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term166308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


