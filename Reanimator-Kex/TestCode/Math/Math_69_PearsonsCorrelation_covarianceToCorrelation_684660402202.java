package org.apache.commons.math.stat.correlation;

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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_covarianceToCorrelation_684660402202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2477354;
     Object term2477452;

    public PearsonsCorrelation_covarianceToCorrelation_684660402202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2477354 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term2477452 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term2477106 = (Object[]) newArray("[D", 9);
        double[] term2477107 = (double[]) newDoubleArray(17);
        setIntField(term2477452, term2477452.getClass(), "columns", 4);
        setIntField(term2477452, term2477452.getClass(), "blockColumns", 1);
        setElement(term2477106, 0, term2477107);
        setField(term2477452, term2477452.getClass(), "blocks", term2477106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term2477452;
        callMethod(klass, "covarianceToCorrelation", argTypes, term2477354, args);
    }

};


