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

public class SummaryStatistics_addValue_1491054911277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71654;

    public SummaryStatistics_addValue_1491054911277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71654 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term71764 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term71892 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term71996 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term72106 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term72216 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term72342 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setDoubleField(term71764, term71764.getClass(), "value", -6.6831987773595505E18);
        setLongField(term71764, term71764.getClass(), "n", 0L);
        setField(term71654, term71654.getClass(), "sumImpl", term71764);
        setDoubleField(term71892, term71892.getClass(), "value", -6.6831987773595505E18);
        setLongField(term71892, term71892.getClass(), "n", 0L);
        setField(term71654, term71654.getClass(), "sumsqImpl", term71892);
        setDoubleField(term71996, term71996.getClass(), "value", -6.6831987773595505E18);
        setLongField(term71996, term71996.getClass(), "n", 0L);
        setField(term71654, term71654.getClass(), "minImpl", term71996);
        setBooleanField(term72106, term72106.getClass(), "incMoment", false);
        setField(term71654, term71654.getClass(), "maxImpl", term72106);
        setDoubleField(term72216, term72216.getClass(), "value", -6.6831987773595505E18);
        setLongField(term72216, term72216.getClass(), "n", 0L);
        setField(term71654, term71654.getClass(), "sumLogImpl", term72216);
        setField(term71654, term71654.getClass(), "secondMoment", term72342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.5568941086314647E169;
        try {
            callMethod(klass, "addValue", argTypes, term71654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


