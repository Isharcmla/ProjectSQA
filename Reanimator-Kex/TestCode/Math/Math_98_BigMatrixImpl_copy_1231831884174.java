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
import java.lang.Object;

public class BigMatrixImpl_copy_1231831884174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85663;

    public BigMatrixImpl_copy_1231831884174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85663 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term85520 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term85521 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term85709 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term85523 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term85521, 0, term85709);
        setElement(term85520, 0, term85521);
        setElement(term85520, 1, term85523);
        setField(term85663, term85663.getClass(), "data", term85520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term85663, args);
    }

};


