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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimePeriodValues_recalculateBounds_1733920982113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20793;

    public TimePeriodValues_recalculateBounds_1733920982113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20793 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setIntField(term20793, term20793.getClass(), "minStartIndex", 0);
        setIntField(term20793, term20793.getClass(), "minMiddleIndex", 0);
        setIntField(term20793, term20793.getClass(), "minEndIndex", 0);
        setIntField(term20793, term20793.getClass(), "maxStartIndex", 0);
        setIntField(term20793, term20793.getClass(), "maxMiddleIndex", 0);
        setIntField(term20793, term20793.getClass(), "maxEndIndex", 0);
        setField(term20793, term20793.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recalculateBounds", argTypes, term20793, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


