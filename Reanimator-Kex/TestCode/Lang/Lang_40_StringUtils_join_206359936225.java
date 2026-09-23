package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_join_206359936225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2853;
     Object term14436;

    public StringUtils_join_206359936225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2853 = (Object[]) newArray("java.lang.Object", 5);
        Object term2854 = newInstance(Class.forName("java.lang.Object"));
        Object term2855 = newInstance(Class.forName("java.lang.Object"));
        Object term2856 = newInstance(Class.forName("java.lang.Object"));
        Object term2857 = newInstance(Class.forName("java.lang.Object"));
        Object term2858 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2853, 0, term2854);
        setElement(term2853, 1, term2855);
        setElement(term2853, 2, term2856);
        setElement(term2853, 3, term2857);
        setElement(term2853, 4, term2858);
        term14436 = (Object[]) newArray("java.lang.Object", 5);
        Object term14437 = newInstance(Class.forName("java.lang.Object"));
        Object term14438 = newInstance(Class.forName("java.lang.Object"));
        Object term14439 = newInstance(Class.forName("java.lang.Object"));
        Object term14440 = newInstance(Class.forName("java.lang.Object"));
        Object term14441 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14436, 0, term14437);
        setElement(term14436, 1, term14438);
        setElement(term14436, 2, term14439);
        setElement(term14436, 3, term14440);
        setElement(term14436, 4, term14441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2853;
        args[1] = "AdxvLJhNLe";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2853, term14436));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@2d10070AdxvLJhNLejava.lang.Object@3a1ca6f9AdxvLJhNLejava.lang.Object@18d16121AdxvLJhNLejava.lang.Object@2f5e434aAdxvLJhNLejava.lang.Object@2b5c9d02"));
    }

};


