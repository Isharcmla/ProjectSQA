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

public class StringUtils_lastIndexOfAny_1476369124191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;
     Object term10326;

    public StringUtils_lastIndexOfAny_1476369124191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1547 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1547, 0, "tPlsykYBqO");
        setElement(term1547, 1, "bLPjGVBhlX");
        setElement(term1547, 2, "whBvTVIIlC");
        setElement(term1547, 3, "IgRJUzaCwW");
        setElement(term1547, 4, "JUmudUmaaV");
        setElement(term1547, 5, "KoyGrUJeJW");
        setElement(term1547, 6, "HqBOwkVqjD");
        term10326 = (Object[]) newArray("java.lang.String", 7);
        setElement(term10326, 0, "tPlsykYBqO");
        setElement(term10326, 1, "bLPjGVBhlX");
        setElement(term10326, 2, "whBvTVIIlC");
        setElement(term10326, 3, "IgRJUzaCwW");
        setElement(term10326, 4, "JUmudUmaaV");
        setElement(term10326, 5, "KoyGrUJeJW");
        setElement(term10326, 6, "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "TJmVBGfTML";
        args[1] = term1547;
        Object retValue = callMethod(klass, "lastIndexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1547, term10326));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


