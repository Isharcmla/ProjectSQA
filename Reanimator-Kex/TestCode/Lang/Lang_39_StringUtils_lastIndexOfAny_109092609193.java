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

public class StringUtils_lastIndexOfAny_109092609193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;
     Object term10759;

    public StringUtils_lastIndexOfAny_109092609193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1569 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1569, 0, "bLPjGVBhlX");
        setElement(term1569, 1, "whBvTVIIlC");
        setElement(term1569, 2, "IgRJUzaCwW");
        setElement(term1569, 3, "JUmudUmaaV");
        setElement(term1569, 4, "KoyGrUJeJW");
        setElement(term1569, 5, "HqBOwkVqjD");
        setElement(term1569, 6, "MAcUBcBckh");
        term10759 = (Object[]) newArray("java.lang.String", 7);
        setElement(term10759, 0, "bLPjGVBhlX");
        setElement(term10759, 1, "whBvTVIIlC");
        setElement(term10759, 2, "IgRJUzaCwW");
        setElement(term10759, 3, "JUmudUmaaV");
        setElement(term10759, 4, "KoyGrUJeJW");
        setElement(term10759, 5, "HqBOwkVqjD");
        setElement(term10759, 6, "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "tPlsykYBqO";
        args[1] = term1569;
        Object retValue = callMethod(klass, "lastIndexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1569, term10759));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


