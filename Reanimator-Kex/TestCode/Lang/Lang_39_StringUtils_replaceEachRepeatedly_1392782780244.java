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

public class StringUtils_replaceEachRepeatedly_1392782780244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3570;
     Object term3571;
     Object term17004;
     Object term17005;

    public StringUtils_replaceEachRepeatedly_1392782780244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3570 = (Object[]) newArray("java.lang.String", 0);
        term3571 = (Object[]) newArray("java.lang.String", 2);
        setElement(term3571, 0, "HHmNoYxIGj");
        setElement(term3571, 1, "PtirvZmsGt");
        term17004 = (Object[]) newArray("java.lang.String", 0);
        term17005 = (Object[]) newArray("java.lang.String", 2);
        setElement(term17005, 0, "HHmNoYxIGj");
        setElement(term17005, 1, "PtirvZmsGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "aNWLJdrZMq";
        args[1] = term3570;
        args[2] = term3571;
        Object retValue = callMethod(klass, "replaceEachRepeatedly", argTypes, null, args);
        assertTrue(recursiveEquals(term3570, term17004));
        assertTrue(recursiveEquals(term3571, term17005));
        assertTrue(recursiveEquals(retValue, "aNWLJdrZMq"));
    }

};


