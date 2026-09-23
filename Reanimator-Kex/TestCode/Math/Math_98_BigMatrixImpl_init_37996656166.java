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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_init_37996656166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743;

    public BigMatrixImpl_init_37996656166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term744 = (Object[]) newArray("java.lang.String", 5);
        Object[] term805 = (Object[]) newArray("java.lang.String", 2);
        Object[] term830 = (Object[]) newArray("java.lang.String", 3);
        Object[] term867 = (Object[]) newArray("java.lang.String", 1);
        Object[] term880 = (Object[]) newArray("java.lang.String", 0);
        setElement(term744, 0, "PAEBtnZtTD");
        setElement(term744, 1, "sjlJAEtRrb");
        setElement(term744, 2, "MuLcgQHgqz");
        setElement(term744, 3, "xxtlPwDYFs");
        setElement(term744, 4, "jJCZpVmanW");
        setElement(term743, 0, term744);
        setElement(term805, 0, "EGtDIRbSSb");
        setElement(term805, 1, "SzjVpOQTyS");
        setElement(term743, 1, term805);
        setElement(term830, 0, "MjGYSRKTNF");
        setElement(term830, 1, "hRNSzYYIrc");
        setElement(term830, 2, "RMFIsYGgne");
        setElement(term743, 2, term830);
        setElement(term867, 0, "NRdvgJlhkX");
        setElement(term743, 3, term867);
        setElement(term743, 4, term880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term743;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


