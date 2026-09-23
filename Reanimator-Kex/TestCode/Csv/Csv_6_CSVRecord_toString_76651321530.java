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

public class CSVRecord_toString_76651321530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;
     Object term5655;

    public CSVRecord_toString_76651321530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1973 = new HashMap();
        term1960 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1985 = (Object[]) newArray("java.lang.String", 0);
        setField(term1960, term1960.getClass(), "comment", "AWRooQKkdW");
        setField(term1960, term1960.getClass(), "mapping", term1973);
        setLongField(term1960, term1960.getClass(), "recordNumber", -5476826692763582090L);
        setField(term1960, term1960.getClass(), "values", term1985);
        HashMap term5658 = new HashMap();
        term5655 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5659 = (Object[]) newArray("java.lang.String", 0);
        setField(term5655, term5655.getClass(), "comment", "AWRooQKkdW");
        setField(term5655, term5655.getClass(), "mapping", term5658);
        setLongField(term5655, term5655.getClass(), "recordNumber", -5476826692763582090L);
        setField(term5655, term5655.getClass(), "values", term5659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1960, args);
        assertTrue(recursiveEquals(term1960, term5655));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


