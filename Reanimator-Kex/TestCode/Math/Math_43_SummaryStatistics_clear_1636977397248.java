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

public class SummaryStatistics_clear_1636977397248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53910;

    public SummaryStatistics_clear_1636977397248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53910 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term54020 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term54130 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        setLongField(term53910, term53910.getClass(), "n", 0L);
        setBooleanField(term54020, term54020.getClass(), "incMoment", false);
        setField(term53910, term53910.getClass(), "minImpl", term54020);
        setField(term53910, term53910.getClass(), "maxImpl", term54130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term53910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


