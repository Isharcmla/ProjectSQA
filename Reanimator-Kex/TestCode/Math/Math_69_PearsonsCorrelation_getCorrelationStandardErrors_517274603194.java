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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_getCorrelationStandardErrors_517274603194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2034163;

    public PearsonsCorrelation_getCorrelationStandardErrors_517274603194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2034163 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Object term2034261 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term2033998 = (Object[]) newArray("[D", 498);
        setIntField(term2034261, term2034261.getClass(), "columns", 1);
        setIntField(term2034261, term2034261.getClass(), "blockColumns", 1);
        setField(term2034261, term2034261.getClass(), "blocks", term2033998);
        setField(term2034163, term2034163.getClass(), "correlationMatrix", term2034261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCorrelationStandardErrors", argTypes, term2034163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


