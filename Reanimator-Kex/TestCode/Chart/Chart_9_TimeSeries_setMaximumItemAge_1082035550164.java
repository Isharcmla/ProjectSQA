package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;

public class TimeSeries_setMaximumItemAge_1082035550164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31993;
     Object term32060;

    public TimeSeries_setMaximumItemAge_1082035550164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32045 = new ArrayList();
        term31993 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setLongField(term31993, term31993.getClass(), "maximumItemAge", 0L);
        setField(term31993, term31993.getClass(), "data", term32045);
        ArrayList term32061 = new ArrayList();
        term32060 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term32060, term32060.getClass(), "domain", null);
        setField(term32060, term32060.getClass(), "range", null);
        setField(term32060, term32060.getClass(), "timePeriodClass", null);
        setField(term32060, term32060.getClass(), "data", term32061);
        setIntField(term32060, term32060.getClass(), "maximumItemCount", 0);
        setLongField(term32060, term32060.getClass(), "maximumItemAge", 0L);
        setField(term32060, term32060.getClass(), "key", null);
        setField(term32060, term32060.getClass(), "description", null);
        setField(term32060, term32060.getClass(), "listeners", null);
        setField(term32060, term32060.getClass(), "propertyChangeSupport", null);
        setBooleanField(term32060, term32060.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "setMaximumItemAge", argTypes, term31993, args);
        assertTrue(recursiveEquals(term31993, term32060));
    }

};


