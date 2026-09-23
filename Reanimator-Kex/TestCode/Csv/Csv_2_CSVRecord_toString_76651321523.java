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

public class CSVRecord_toString_76651321523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1599;
     Object term4637;

    public CSVRecord_toString_76651321523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1601 = new HashMap();
        term1599 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1600 = (Object[]) newArray("java.lang.String", 0);
        setField(term1599, term1599.getClass(), "values", term1600);
        setField(term1599, term1599.getClass(), "mapping", term1601);
        setField(term1599, term1599.getClass(), "comment", "vQVyKLdtaz");
        setLongField(term1599, term1599.getClass(), "recordNumber", -8885298608300233488L);
        HashMap term4639 = new HashMap();
        term4637 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4638 = (Object[]) newArray("java.lang.String", 0);
        setField(term4637, term4637.getClass(), "values", term4638);
        setField(term4637, term4637.getClass(), "mapping", term4639);
        setField(term4637, term4637.getClass(), "comment", "vQVyKLdtaz");
        setLongField(term4637, term4637.getClass(), "recordNumber", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1599, args);
        assertTrue(recursiveEquals(term1599, term4637));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


