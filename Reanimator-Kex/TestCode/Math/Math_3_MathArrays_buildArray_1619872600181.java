package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;
import java.lang.Object;

public class MathArrays_buildArray_1619872600181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57734;
     Object term583593;
     Object term583591;

    public MathArrays_buildArray_1619872600181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57734 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        term583593 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        setIntField(term583593, term583593.getClass(), "radixDigits", 0);
        setField(term583593, term583593.getClass(), "zero", null);
        setField(term583593, term583593.getClass(), "one", null);
        setField(term583593, term583593.getClass(), "two", null);
        setField(term583593, term583593.getClass(), "sqr2", null);
        setField(term583593, term583593.getClass(), "sqr2Split", null);
        setField(term583593, term583593.getClass(), "sqr2Reciprocal", null);
        setField(term583593, term583593.getClass(), "sqr3", null);
        setField(term583593, term583593.getClass(), "sqr3Reciprocal", null);
        setField(term583593, term583593.getClass(), "pi", null);
        setField(term583593, term583593.getClass(), "piSplit", null);
        setField(term583593, term583593.getClass(), "e", null);
        setField(term583593, term583593.getClass(), "eSplit", null);
        setField(term583593, term583593.getClass(), "ln2", null);
        setField(term583593, term583593.getClass(), "ln2Split", null);
        setField(term583593, term583593.getClass(), "ln5", null);
        setField(term583593, term583593.getClass(), "ln5Split", null);
        setField(term583593, term583593.getClass(), "ln10", null);
        setField(term583593, term583593.getClass(), "rMode", null);
        setIntField(term583593, term583593.getClass(), "ieeeFlags", 0);
        term583591 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.Field");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term57734;
        args[1] = 0;
        Object retValue = callMethod(klass, "buildArray", argTypes, null, args);
        assertTrue(recursiveEquals(term57734, term583593));
        assertTrue(recursiveEquals(retValue, term583591));
    }

};


