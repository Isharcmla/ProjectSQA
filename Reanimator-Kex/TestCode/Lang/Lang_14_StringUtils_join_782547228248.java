package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_join_782547228248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1762;
     Object term11152;

    public StringUtils_join_782547228248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1762 = (Object[]) newArray("java.lang.Object", 5);
        Object term1763 = newInstance(Class.forName("java.lang.Object"));
        Object term1764 = newInstance(Class.forName("java.lang.Object"));
        Object term1765 = newInstance(Class.forName("java.lang.Object"));
        Object term1766 = newInstance(Class.forName("java.lang.Object"));
        Object term1767 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1762, 0, term1763);
        setElement(term1762, 1, term1764);
        setElement(term1762, 2, term1765);
        setElement(term1762, 3, term1766);
        setElement(term1762, 4, term1767);
        term11152 = (Object[]) newArray("java.lang.Object", 5);
        Object term11153 = newInstance(Class.forName("java.lang.Object"));
        Object term11154 = newInstance(Class.forName("java.lang.Object"));
        Object term11155 = newInstance(Class.forName("java.lang.Object"));
        Object term11156 = newInstance(Class.forName("java.lang.Object"));
        Object term11157 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11152, 0, term11153);
        setElement(term11152, 1, term11154);
        setElement(term11152, 2, term11155);
        setElement(term11152, 3, term11156);
        setElement(term11152, 4, term11157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1762;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1762, term11152));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@3abd1c88java.lang.Object@363854b9java.lang.Object@18b4fe6djava.lang.Object@3db47e74java.lang.Object@37d113d0"));
    }

};


