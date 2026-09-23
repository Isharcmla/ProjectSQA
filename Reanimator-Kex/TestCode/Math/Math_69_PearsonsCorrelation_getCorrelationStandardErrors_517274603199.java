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

public class PearsonsCorrelation_getCorrelationStandardErrors_517274603199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2473160;

    public PearsonsCorrelation_getCorrelationStandardErrors_517274603199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2473160 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Object term2473256 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2473022 = (Object[]) newArray("[D", 498);
        setField(term2473256, term2473256.getClass(), "data", term2473022);
        setField(term2473160, term2473160.getClass(), "correlationMatrix", term2473256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCorrelationStandardErrors", argTypes, term2473160, args);
    }

};


