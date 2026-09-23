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

public class StringUtils_lastIndexOfAny_109092609206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1601;
     Object term10031;

    public StringUtils_lastIndexOfAny_109092609206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1601 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1601, 0, "whBvTVIIlC");
        setElement(term1601, 1, "IgRJUzaCwW");
        setElement(term1601, 2, "JUmudUmaaV");
        setElement(term1601, 3, "KoyGrUJeJW");
        setElement(term1601, 4, "HqBOwkVqjD");
        setElement(term1601, 5, "MAcUBcBckh");
        setElement(term1601, 6, "oVgzLbrsFr");
        term10031 = (Object[]) newArray("java.lang.String", 7);
        setElement(term10031, 0, "whBvTVIIlC");
        setElement(term10031, 1, "IgRJUzaCwW");
        setElement(term10031, 2, "JUmudUmaaV");
        setElement(term10031, 3, "KoyGrUJeJW");
        setElement(term10031, 4, "HqBOwkVqjD");
        setElement(term10031, 5, "MAcUBcBckh");
        setElement(term10031, 6, "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "bLPjGVBhlX";
        args[1] = term1601;
        Object retValue = callMethod(klass, "lastIndexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1601, term10031));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


