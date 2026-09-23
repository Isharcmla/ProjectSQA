package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class BigMatrixImpl_copy_1231831884145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79321;
     Object term79801;
     Object term79788;

    public BigMatrixImpl_copy_1231831884145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79321 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term79189 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term79190 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term79367 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term79190, 0, term79367);
        setElement(term79189, 0, term79190);
        setField(term79321, term79321.getClass(), "data", term79189);
        term79801 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term79802 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term79803 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term79804 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term79804, term79804.getClass(), "intVal", null);
        setIntField(term79804, term79804.getClass(), "scale", 0);
        setIntField(term79804, term79804.getClass(), "precision", 0);
        setField(term79804, term79804.getClass(), "stringCache", null);
        setLongField(term79804, term79804.getClass(), "intCompact", 0L);
        setElement(term79803, 0, term79804);
        setElement(term79802, 0, term79803);
        setField(term79801, term79801.getClass(), "data", term79802);
        setField(term79801, term79801.getClass(), "lu", null);
        setField(term79801, term79801.getClass(), "permutation", null);
        setIntField(term79801, term79801.getClass(), "parity", 0);
        setIntField(term79801, term79801.getClass(), "roundingMode", 0);
        setIntField(term79801, term79801.getClass(), "scale", 0);
        term79788 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term79789 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term79790 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term79767 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term79767, term79767.getClass(), "intVal", null);
        setIntField(term79767, term79767.getClass(), "scale", 0);
        setIntField(term79767, term79767.getClass(), "precision", 0);
        setField(term79767, term79767.getClass(), "stringCache", null);
        setLongField(term79767, term79767.getClass(), "intCompact", 0L);
        setElement(term79790, 0, term79767);
        setElement(term79789, 0, term79790);
        setField(term79788, term79788.getClass(), "data", term79789);
        setField(term79788, term79788.getClass(), "lu", null);
        setField(term79788, term79788.getClass(), "permutation", null);
        setIntField(term79788, term79788.getClass(), "parity", 1);
        setIntField(term79788, term79788.getClass(), "roundingMode", 4);
        setIntField(term79788, term79788.getClass(), "scale", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term79321, args);
        assertTrue(recursiveEquals(term79321, term79801));
        assertTrue(recursiveEquals(retValue, term79788));
    }

};


