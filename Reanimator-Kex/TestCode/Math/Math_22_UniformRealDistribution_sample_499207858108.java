package org.apache.commons.math3.distribution;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UniformRealDistribution_sample_499207858108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284428;

    public UniformRealDistribution_sample_499207858108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284428 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term284520 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term284241 = (int[]) newIntArray(8);
        int[] term284255 = (int[]) newIntArray(8);
        setIntField(term284520, term284520.getClass(), "count", 0);
        setField(term284520, term284520.getClass(), "rsl", term284241);
        setIntField(term284520, term284520.getClass(), "isaacI", 0);
        setIntField(term284520, term284520.getClass(), "isaacJ", 0);
        setIntField(term284520, term284520.getClass(), "isaacB", 0);
        setIntField(term284520, term284520.getClass(), "isaacC", 0);
        setField(term284520, term284520.getClass(), "mem", term284255);
        setField(term284428, term284428.getClass(), "random", term284520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term284428, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


