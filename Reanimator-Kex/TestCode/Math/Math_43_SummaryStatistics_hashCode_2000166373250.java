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

public class SummaryStatistics_hashCode_2000166373250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54302;

    public SummaryStatistics_hashCode_2000166373250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54302 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term54428 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        Object term54546 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setDoubleField(term54428, term54428.getClass(), "m4", 0.0);
        setField(term54302, term54302.getClass(), "geoMeanImpl", term54428);
        setField(term54302, term54302.getClass(), "maxImpl", term54428);
        setField(term54302, term54302.getClass(), "meanImpl", term54546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term54302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


