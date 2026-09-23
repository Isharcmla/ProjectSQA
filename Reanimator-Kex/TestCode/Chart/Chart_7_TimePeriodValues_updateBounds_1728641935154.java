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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class TimePeriodValues_updateBounds_1728641935154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35517;
     Object term35623;

    public TimePeriodValues_updateBounds_1728641935154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35569 = new ArrayList();
        term35517 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setIntField(term35517, term35517.getClass(), "minStartIndex", -1);
        setIntField(term35517, term35517.getClass(), "maxStartIndex", 0);
        setField(term35517, term35517.getClass(), "data", term35569);
        term35623 = newInstance(Class.forName("org.jfree.data.time.Hour"));
        setLongField(term35623, term35623.getClass(), "firstMillisecond", 0L);
        setLongField(term35623, term35623.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term35623;
        args[1] = 0;
        try {
            callMethod(klass, "updateBounds", argTypes, term35517, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


