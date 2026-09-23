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

public class StringUtils_join_1160916579251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1785;
     Object term11771;

    public StringUtils_join_1160916579251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1785 = (Object[]) newArray("java.lang.Object", 5);
        Object term1786 = newInstance(Class.forName("java.lang.Object"));
        Object term1787 = newInstance(Class.forName("java.lang.Object"));
        Object term1788 = newInstance(Class.forName("java.lang.Object"));
        Object term1789 = newInstance(Class.forName("java.lang.Object"));
        Object term1790 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1785, 0, term1786);
        setElement(term1785, 1, term1787);
        setElement(term1785, 2, term1788);
        setElement(term1785, 3, term1789);
        setElement(term1785, 4, term1790);
        term11771 = (Object[]) newArray("java.lang.Object", 5);
        Object term11772 = newInstance(Class.forName("java.lang.Object"));
        Object term11773 = newInstance(Class.forName("java.lang.Object"));
        Object term11774 = newInstance(Class.forName("java.lang.Object"));
        Object term11775 = newInstance(Class.forName("java.lang.Object"));
        Object term11776 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11771, 0, term11772);
        setElement(term11771, 1, term11773);
        setElement(term11771, 2, term11774);
        setElement(term11771, 3, term11775);
        setElement(term11771, 4, term11776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1785;
        args[1] = "MAcUBcBckh";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1785, term11771));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@55b250a3MAcUBcBckhjava.lang.Object@2c0dfd15MAcUBcBckhjava.lang.Object@214f44c2MAcUBcBckhjava.lang.Object@3c187c77MAcUBcBckhjava.lang.Object@78b515bb"));
    }

};


