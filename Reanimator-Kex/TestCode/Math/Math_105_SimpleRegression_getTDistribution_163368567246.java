package org.apache.commons.math.stat.regression;

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
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.regression.EqualityUtils.*;

public class SimpleRegression_getTDistribution_163368567246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;
     Object term50525;
     Object term50514;

    public SimpleRegression_getTDistribution_163368567246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term235, term235.getClass(), "sumX", 0.5597136413549945);
        setDoubleField(term235, term235.getClass(), "sumXX", 0.28292420012823627);
        setDoubleField(term235, term235.getClass(), "sumY", 0.5407563152320285);
        setDoubleField(term235, term235.getClass(), "sumYY", 0.9485929668765458);
        setDoubleField(term235, term235.getClass(), "sumXY", 0.5179319342588155);
        setLongField(term235, term235.getClass(), "n", 8428634514691209827L);
        setDoubleField(term235, term235.getClass(), "xbar", 0.25025774487844066);
        setDoubleField(term235, term235.getClass(), "ybar", 0.1858089882752998);
        term50525 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term50525, term50525.getClass(), "sumX", 0.5597136413549945);
        setDoubleField(term50525, term50525.getClass(), "sumXX", 0.28292420012823627);
        setDoubleField(term50525, term50525.getClass(), "sumY", 0.5407563152320285);
        setDoubleField(term50525, term50525.getClass(), "sumYY", 0.9485929668765458);
        setDoubleField(term50525, term50525.getClass(), "sumXY", 0.5179319342588155);
        setLongField(term50525, term50525.getClass(), "n", 8428634514691209827L);
        setDoubleField(term50525, term50525.getClass(), "xbar", 0.25025774487844066);
        setDoubleField(term50525, term50525.getClass(), "ybar", 0.1858089882752998);
        term50514 = newInstance(Class.forName("org.apache.commons.math.distribution.TDistributionImpl"));
        setDoubleField(term50514, term50514.getClass(), "degreesOfFreedom", 8.4286345146912102E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTDistribution", argTypes, term235, args);
        assertTrue(recursiveEquals(term235, term50525));
        assertTrue(recursiveEquals(retValue, term50514));
    }

};


