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

public class PearsonsCorrelation_covarianceToCorrelation_684660402210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2491733;
     Object term2491831;

    public PearsonsCorrelation_covarianceToCorrelation_684660402210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2491733 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term2491831 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term2491524 = (Object[]) newArray("[D", 0);
        setIntField(term2491831, term2491831.getClass(), "columns", 1);
        setIntField(term2491831, term2491831.getClass(), "blockColumns", 1);
        setField(term2491831, term2491831.getClass(), "blocks", term2491524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term2491831;
        callMethod(klass, "covarianceToCorrelation", argTypes, term2491733, args);
    }

};


