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
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_getSumsqImpl_181415045761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;
     Object term4579;
     Object term4550;

    public SummaryStatistics_getSumsqImpl_181415045761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term615 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term621 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term624 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term627 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term630 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term633 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term636 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term637 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term639 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term613, term613.getClass(), "n", -2585684163342970173L);
        setDoubleField(term615, term615.getClass(), "m2", Double.NaN);
        setLongField(term615, term615.getClass(), "n", 0L);
        setDoubleField(term615, term615.getClass(), "m1", Double.NaN);
        setDoubleField(term615, term615.getClass(), "dev", Double.NaN);
        setDoubleField(term615, term615.getClass(), "nDev", Double.NaN);
        setField(term615, term615.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "secondMoment", term615);
        setLongField(term621, term621.getClass(), "n", 0L);
        setDoubleField(term621, term621.getClass(), "value", 0.0);
        setField(term621, term621.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "sum", term621);
        setLongField(term624, term624.getClass(), "n", 0L);
        setDoubleField(term624, term624.getClass(), "value", 0.0);
        setField(term624, term624.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "sumsq", term624);
        setLongField(term627, term627.getClass(), "n", 0L);
        setDoubleField(term627, term627.getClass(), "value", Double.NaN);
        setField(term627, term627.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "min", term627);
        setLongField(term630, term630.getClass(), "n", 0L);
        setDoubleField(term630, term630.getClass(), "value", Double.NaN);
        setField(term630, term630.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "max", term630);
        setIntField(term633, term633.getClass(), "n", 0);
        setDoubleField(term633, term633.getClass(), "value", 0.0);
        setField(term633, term633.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "sumLog", term633);
        setField(term636, term636.getClass(), "sumOfLogs", term633);
        setField(term636, term636.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "geoMean", term636);
        setField(term637, term637.getClass(), "moment", term615);
        setBooleanField(term637, term637.getClass(), "incMoment", false);
        setField(term637, term637.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "mean", term637);
        setField(term639, term639.getClass(), "moment", term615);
        setBooleanField(term639, term639.getClass(), "incMoment", false);
        setBooleanField(term639, term639.getClass(), "isBiasCorrected", true);
        setField(term639, term639.getClass(), "storedData", null);
        setField(term613, term613.getClass(), "variance", term639);
        setField(term613, term613.getClass(), "sumImpl", term621);
        setField(term613, term613.getClass(), "sumsqImpl", term624);
        setField(term613, term613.getClass(), "minImpl", term627);
        setField(term613, term613.getClass(), "maxImpl", term630);
        setField(term613, term613.getClass(), "sumLogImpl", term633);
        setField(term613, term613.getClass(), "geoMeanImpl", term636);
        setField(term613, term613.getClass(), "meanImpl", term637);
        setField(term613, term613.getClass(), "varianceImpl", term639);
        term4579 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term4580 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term4581 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term4582 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term4583 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term4584 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term4585 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term4586 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term4587 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term4588 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term4579, term4579.getClass(), "n", -2585684163342970173L);
        setDoubleField(term4580, term4580.getClass(), "m2", Double.NaN);
        setLongField(term4580, term4580.getClass(), "n", 0L);
        setDoubleField(term4580, term4580.getClass(), "m1", Double.NaN);
        setDoubleField(term4580, term4580.getClass(), "dev", Double.NaN);
        setDoubleField(term4580, term4580.getClass(), "nDev", Double.NaN);
        setField(term4580, term4580.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "secondMoment", term4580);
        setLongField(term4581, term4581.getClass(), "n", 0L);
        setDoubleField(term4581, term4581.getClass(), "value", 0.0);
        setField(term4581, term4581.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "sum", term4581);
        setLongField(term4582, term4582.getClass(), "n", 0L);
        setDoubleField(term4582, term4582.getClass(), "value", 0.0);
        setField(term4582, term4582.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "sumsq", term4582);
        setLongField(term4583, term4583.getClass(), "n", 0L);
        setDoubleField(term4583, term4583.getClass(), "value", Double.NaN);
        setField(term4583, term4583.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "min", term4583);
        setLongField(term4584, term4584.getClass(), "n", 0L);
        setDoubleField(term4584, term4584.getClass(), "value", Double.NaN);
        setField(term4584, term4584.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "max", term4584);
        setIntField(term4585, term4585.getClass(), "n", 0);
        setDoubleField(term4585, term4585.getClass(), "value", 0.0);
        setField(term4585, term4585.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "sumLog", term4585);
        setField(term4586, term4586.getClass(), "sumOfLogs", term4585);
        setField(term4586, term4586.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "geoMean", term4586);
        setField(term4587, term4587.getClass(), "moment", term4580);
        setBooleanField(term4587, term4587.getClass(), "incMoment", false);
        setField(term4587, term4587.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "mean", term4587);
        setField(term4588, term4588.getClass(), "moment", term4580);
        setBooleanField(term4588, term4588.getClass(), "incMoment", false);
        setBooleanField(term4588, term4588.getClass(), "isBiasCorrected", true);
        setField(term4588, term4588.getClass(), "storedData", null);
        setField(term4579, term4579.getClass(), "variance", term4588);
        setField(term4579, term4579.getClass(), "sumImpl", term4581);
        setField(term4579, term4579.getClass(), "sumsqImpl", term4582);
        setField(term4579, term4579.getClass(), "minImpl", term4583);
        setField(term4579, term4579.getClass(), "maxImpl", term4584);
        setField(term4579, term4579.getClass(), "sumLogImpl", term4585);
        setField(term4579, term4579.getClass(), "geoMeanImpl", term4586);
        setField(term4579, term4579.getClass(), "meanImpl", term4587);
        setField(term4579, term4579.getClass(), "varianceImpl", term4588);
        term4550 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setLongField(term4550, term4550.getClass(), "n", 0L);
        setDoubleField(term4550, term4550.getClass(), "value", 0.0);
        setField(term4550, term4550.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumsqImpl", argTypes, term613, args);
        assertTrue(recursiveEquals(term613, term4579));
        assertTrue(recursiveEquals(retValue, term4550));
    }

};


