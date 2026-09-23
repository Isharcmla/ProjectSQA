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

public class SummaryStatistics_addValue_1491054911252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55203;

    public SummaryStatistics_addValue_1491054911252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55203 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term55313 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term55441 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term55559 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Kurtosis"));
        setDoubleField(term55313, term55313.getClass(), "value", 0.0);
        setLongField(term55313, term55313.getClass(), "n", 0L);
        setField(term55203, term55203.getClass(), "sumImpl", term55313);
        setDoubleField(term55441, term55441.getClass(), "value", 0.0);
        setLongField(term55441, term55441.getClass(), "n", 0L);
        setField(term55203, term55203.getClass(), "sumsqImpl", term55441);
        setBooleanField(term55559, term55559.getClass(), "incMoment", true);
        setField(term55203, term55203.getClass(), "minImpl", term55559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term55203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


