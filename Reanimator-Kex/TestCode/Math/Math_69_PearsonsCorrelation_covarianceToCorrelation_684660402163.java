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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_covarianceToCorrelation_684660402163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836296;
     Object term1836394;

    public PearsonsCorrelation_covarianceToCorrelation_684660402163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836296 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term1836394 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term1836085 = (Object[]) newArray("[D", 0);
        setIntField(term1836394, term1836394.getClass(), "columns", 4);
        setIntField(term1836394, term1836394.getClass(), "blockColumns", -2);
        setField(term1836394, term1836394.getClass(), "blocks", term1836085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term1836394;
        try {
            callMethod(klass, "covarianceToCorrelation", argTypes, term1836296, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


