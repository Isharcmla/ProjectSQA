package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class CSVRecord_size_17278302322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term4434;

    public CSVRecord_size_17278302322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1495 = new HashMap();
        term1409 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1410 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1410, 0, "TJmVBGfTML");
        setElement(term1410, 1, "tPlsykYBqO");
        setElement(term1410, 2, "bLPjGVBhlX");
        setElement(term1410, 3, "whBvTVIIlC");
        setElement(term1410, 4, "IgRJUzaCwW");
        setElement(term1410, 5, "JUmudUmaaV");
        setElement(term1410, 6, "KoyGrUJeJW");
        setField(term1409, term1409.getClass(), "values", term1410);
        setField(term1409, term1409.getClass(), "mapping", term1495);
        setField(term1409, term1409.getClass(), "comment", "MAcUBcBckh");
        setLongField(term1409, term1409.getClass(), "recordNumber", -2813493605142626659L);
        HashMap term4450 = new HashMap();
        term4434 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4435 = (Object[]) newArray("java.lang.String", 7);
        setElement(term4435, 0, "TJmVBGfTML");
        setElement(term4435, 1, "tPlsykYBqO");
        setElement(term4435, 2, "bLPjGVBhlX");
        setElement(term4435, 3, "whBvTVIIlC");
        setElement(term4435, 4, "IgRJUzaCwW");
        setElement(term4435, 5, "JUmudUmaaV");
        setElement(term4435, 6, "KoyGrUJeJW");
        setField(term4434, term4434.getClass(), "values", term4435);
        setField(term4434, term4434.getClass(), "mapping", term4450);
        setField(term4434, term4434.getClass(), "comment", "MAcUBcBckh");
        setLongField(term4434, term4434.getClass(), "recordNumber", -2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term1409, args);
        assertTrue(recursiveEquals(term1409, term4434));
        assertTrue(recursiveEquals(retValue, 7));
    }

};


