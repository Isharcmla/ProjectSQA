package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Partial_withPeriodAdded_199121147996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42400;
     Object term42444;
     Object term43305;
     Object term43306;
     Object term43301;

    public Partial_withPeriodAdded_199121147996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42400 = newInstance(Class.forName("org.joda.time.Partial"));
        term42444 = newInstance(Class.forName("org.joda.time.Weeks"));
        term43305 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term43305, term43305.getClass(), "iChronology", null);
        setField(term43305, term43305.getClass(), "iTypes", null);
        setField(term43305, term43305.getClass(), "iValues", null);
        setField(term43305, term43305.getClass(), "iFormatter", null);
        term43306 = newInstance(Class.forName("org.joda.time.Weeks"));
        setIntField(term43306, term43306.getClass(), "iPeriod", 0);
        term43301 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term43301, term43301.getClass(), "iChronology", null);
        setField(term43301, term43301.getClass(), "iTypes", null);
        setField(term43301, term43301.getClass(), "iValues", null);
        setField(term43301, term43301.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term42444;
        args[1] = 0;
        Object retValue = callMethod(klass, "withPeriodAdded", argTypes, term42400, args);
        assertTrue(recursiveEquals(term42400, term43305));
        assertTrue(recursiveEquals(term42444, term43306));
        assertTrue(recursiveEquals(retValue, term43301));
    }

};
