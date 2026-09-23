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

public class Fraction_reduce_5358591312038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662878;
     Object term663750;
     Object term663747;

    public Fraction_reduce_5358591312038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662878 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term662878, term662878.getClass(), "numerator", 435471490);
        setIntField(term662878, term662878.getClass(), "denominator", 771762233);
        term663750 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term663750, term663750.getClass(), "numerator", 435471490);
        setIntField(term663750, term663750.getClass(), "denominator", 771762233);
        setField(term663750, term663750.getClass(), "toString", null);
        setField(term663750, term663750.getClass(), "toProperString", null);
        term663747 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term663747, term663747.getClass(), "numerator", 435471490);
        setIntField(term663747, term663747.getClass(), "denominator", 771762233);
        setField(term663747, term663747.getClass(), "toString", null);
        setField(term663747, term663747.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term662878, args);
        assertTrue(recursiveEquals(term662878, term663750));
        assertTrue(recursiveEquals(retValue, term663747));
    }

};


