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
import java.lang.Double;

public class SummaryStatistics_addValue_1491054911255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57164;

    public SummaryStatistics_addValue_1491054911255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57164 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term57290 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term57408 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term57532 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FirstMoment"));
        setLongField(term57290, term57290.getClass(), "n", 0L);
        setDoubleField(term57290, term57290.getClass(), "m2", 0.0);
        setDoubleField(term57290, term57290.getClass(), "m1", 0.0);
        setDoubleField(term57290, term57290.getClass(), "dev", 0.0);
        setDoubleField(term57290, term57290.getClass(), "nDev", 0.0);
        setField(term57164, term57164.getClass(), "sumImpl", term57290);
        setBooleanField(term57408, term57408.getClass(), "incMoment", false);
        setField(term57164, term57164.getClass(), "sumsqImpl", term57408);
        setField(term57164, term57164.getClass(), "minImpl", term57532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term57164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


