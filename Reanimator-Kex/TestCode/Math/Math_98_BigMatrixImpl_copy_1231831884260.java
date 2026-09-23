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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_copy_1231831884260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94813;

    public BigMatrixImpl_copy_1231831884260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94813 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term94659 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 3);
        Object[] term94660 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term94859 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term94905 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term94663 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term94664 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term94660, 0, term94859);
        setElement(term94660, 1, term94905);
        setElement(term94659, 0, term94660);
        setElement(term94659, 1, term94663);
        setElement(term94659, 2, term94664);
        setField(term94813, term94813.getClass(), "data", term94659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "copy", argTypes, term94813, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


