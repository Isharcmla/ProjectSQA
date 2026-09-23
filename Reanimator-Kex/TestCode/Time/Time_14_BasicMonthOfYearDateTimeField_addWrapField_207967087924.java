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
import java.lang.Long;
import java.lang.Integer;

public class BasicMonthOfYearDateTimeField_addWrapField_207967087924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term52;
     Object term54;

    public BasicMonthOfYearDateTimeField_addWrapField_207967087924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term48, term48.getClass(), "iChronology", null);
        setIntField(term48, term48.getClass(), "iMax", 1048535127);
        setIntField(term48, term48.getClass(), "iLeapMonth", -655067527);
        setLongField(term48, term48.getClass(), "iUnitMillis", 6967924379644551255L);
        setField(term48, term48.getClass(), "iDurationField", null);
        setField(term48, term48.getClass(), "iType", null);
        term52 = new Long(-2813493605142626659L);
        term54 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term52;
        args[1] = term54;
        try {
            callMethod(klass, "addWrapField", argTypes, term48, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


