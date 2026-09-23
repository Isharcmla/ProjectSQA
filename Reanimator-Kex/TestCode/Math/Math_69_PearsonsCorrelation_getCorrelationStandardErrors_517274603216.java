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

public class PearsonsCorrelation_getCorrelationStandardErrors_517274603216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502094;

    public PearsonsCorrelation_getCorrelationStandardErrors_517274603216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2502094 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Object term2502192 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term2501927 = (Object[]) newArray("[D", 106);
        setIntField(term2502192, term2502192.getClass(), "columns", 1);
        setIntField(term2502192, term2502192.getClass(), "blockColumns", -2);
        setField(term2502192, term2502192.getClass(), "blocks", term2501927);
        setField(term2502094, term2502094.getClass(), "correlationMatrix", term2502192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCorrelationStandardErrors", argTypes, term2502094, args);
    }

};


