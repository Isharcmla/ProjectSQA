package org.apache.commons.math.stat.descriptive;

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
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_clear_1636977397195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43672;

    public SummaryStatistics_clear_1636977397195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43672 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term43790 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term43908 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term43672, term43672.getClass(), "n", 0L);
        setDoubleField(term43790, term43790.getClass(), "value", 0.0);
        setLongField(term43790, term43790.getClass(), "n", 0L);
        setField(term43672, term43672.getClass(), "minImpl", term43790);
        setField(term43672, term43672.getClass(), "maxImpl", term43908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term43672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


