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

public class CSVRecord_toList_104251999528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1800;
     Object term5418;
     Object term5323;

    public CSVRecord_toList_104251999528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1813 = new HashMap();
        term1800 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1825 = (Object[]) newArray("java.lang.String", 3);
        setField(term1800, term1800.getClass(), "comment", "jiKYgYHqIS");
        setField(term1800, term1800.getClass(), "mapping", term1813);
        setLongField(term1800, term1800.getClass(), "recordNumber", -4325723315152823407L);
        setElement(term1825, 0, "XqgfKFvPSD");
        setElement(term1825, 1, "JiVRgTZvKc");
        setElement(term1825, 2, "XPKmummaqg");
        setField(term1800, term1800.getClass(), "values", term1825);
        HashMap term5421 = new HashMap();
        term5418 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5422 = (Object[]) newArray("java.lang.String", 3);
        setField(term5418, term5418.getClass(), "comment", "jiKYgYHqIS");
        setField(term5418, term5418.getClass(), "mapping", term5421);
        setLongField(term5418, term5418.getClass(), "recordNumber", -4325723315152823407L);
        setElement(term5422, 0, "XqgfKFvPSD");
        setElement(term5422, 1, "JiVRgTZvKc");
        setElement(term5422, 2, "XPKmummaqg");
        setField(term5418, term5418.getClass(), "values", term5422);
        term5323 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term5324 = (Object[]) newArray("java.lang.String", 3);
        setElement(term5324, 0, "XqgfKFvPSD");
        setElement(term5324, 1, "JiVRgTZvKc");
        setElement(term5324, 2, "XPKmummaqg");
        setField(term5323, term5323.getClass(), "a", term5324);
        setIntField(term5323, term5323.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toList", argTypes, term1800, args);
        assertTrue(recursiveEquals(term1800, term5418));
        assertTrue(recursiveEquals(retValue, term5323));
    }

};


