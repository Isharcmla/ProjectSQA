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
import java.util.HashMap;
import java.lang.Object;
import java.util.LinkedHashMap;

public class CSVRecord_putIn_182936077226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term1519;
     Object term5028;
     Object term5048;

    public CSVRecord_putIn_182936077226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1422 = new HashMap();
        term1409 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1434 = (Object[]) newArray("java.lang.String", 7);
        setField(term1409, term1409.getClass(), "comment", "TJmVBGfTML");
        setField(term1409, term1409.getClass(), "mapping", term1422);
        setLongField(term1409, term1409.getClass(), "recordNumber", -2813493605142626659L);
        setElement(term1434, 0, "bLPjGVBhlX");
        setElement(term1434, 1, "whBvTVIIlC");
        setElement(term1434, 2, "IgRJUzaCwW");
        setElement(term1434, 3, "JUmudUmaaV");
        setElement(term1434, 4, "KoyGrUJeJW");
        setElement(term1434, 5, "HqBOwkVqjD");
        setElement(term1434, 6, "MAcUBcBckh");
        setField(term1409, term1409.getClass(), "values", term1434);
        term1519 = new LinkedHashMap();
        HashMap term5031 = new HashMap();
        term5028 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5033 = (Object[]) newArray("java.lang.String", 7);
        setField(term5028, term5028.getClass(), "comment", "TJmVBGfTML");
        setField(term5028, term5028.getClass(), "mapping", term5031);
        setLongField(term5028, term5028.getClass(), "recordNumber", -2813493605142626659L);
        setElement(term5033, 0, "bLPjGVBhlX");
        setElement(term5033, 1, "whBvTVIIlC");
        setElement(term5033, 2, "IgRJUzaCwW");
        setElement(term5033, 3, "JUmudUmaaV");
        setElement(term5033, 4, "KoyGrUJeJW");
        setElement(term5033, 5, "HqBOwkVqjD");
        setElement(term5033, 6, "MAcUBcBckh");
        setField(term5028, term5028.getClass(), "values", term5033);
        term5048 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1519;
        callMethod(klass, "putIn", argTypes, term1409, args);
        assertTrue(recursiveEquals(term1409, term5028));
        assertTrue(recursiveEquals(term1519, term5048));
    }

};


