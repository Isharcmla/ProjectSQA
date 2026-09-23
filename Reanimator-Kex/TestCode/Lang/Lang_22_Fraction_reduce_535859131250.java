package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_535859131250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65912;
     Object term66986;
     Object term66983;

    public Fraction_reduce_535859131250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65912 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term65912, term65912.getClass(), "numerator", -1877310586);
        setIntField(term65912, term65912.getClass(), "denominator", 1295994645);
        term66986 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term66986, term66986.getClass(), "numerator", -1877310586);
        setIntField(term66986, term66986.getClass(), "denominator", 1295994645);
        setField(term66986, term66986.getClass(), "toString", null);
        setField(term66986, term66986.getClass(), "toProperString", null);
        term66983 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term66983, term66983.getClass(), "numerator", -1877310586);
        setIntField(term66983, term66983.getClass(), "denominator", 1295994645);
        setField(term66983, term66983.getClass(), "toString", null);
        setField(term66983, term66983.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term65912, args);
        assertTrue(recursiveEquals(term65912, term66986));
        assertTrue(recursiveEquals(retValue, term66983));
    }

};


