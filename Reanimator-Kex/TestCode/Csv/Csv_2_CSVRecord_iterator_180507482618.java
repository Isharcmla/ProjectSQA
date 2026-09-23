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

public class CSVRecord_iterator_180507482618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;
     Object term3233;
     Object term3210;

    public CSVRecord_iterator_180507482618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term805 = new HashMap();
        term803 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term804 = (Object[]) newArray("java.lang.String", 0);
        setField(term803, term803.getClass(), "values", term804);
        setField(term803, term803.getClass(), "mapping", term805);
        setField(term803, term803.getClass(), "comment", "aKnKipADSo");
        setLongField(term803, term803.getClass(), "recordNumber", 4872422362414183754L);
        HashMap term3235 = new HashMap();
        term3233 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3234 = (Object[]) newArray("java.lang.String", 0);
        setField(term3233, term3233.getClass(), "values", term3234);
        setField(term3233, term3233.getClass(), "mapping", term3235);
        setField(term3233, term3233.getClass(), "comment", "aKnKipADSo");
        setLongField(term3233, term3233.getClass(), "recordNumber", 4872422362414183754L);
        term3210 = newInstance(Class.forName("java.util.Arrays$ArrayItr"));
        Object[] term3212 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term3210, term3210.getClass(), "cursor", 0);
        setField(term3210, term3210.getClass(), "a", term3212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term803, args);
        assertTrue(recursiveEquals(term803, term3233));
        assertTrue(recursiveEquals(retValue, term3210));
    }

};


