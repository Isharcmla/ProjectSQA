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

public class CSVRecord_iterator_180507482625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object term4797;
     Object term4758;

    public CSVRecord_iterator_180507482625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1320 = new HashMap();
        term1307 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1332 = (Object[]) newArray("java.lang.String", 3);
        setField(term1307, term1307.getClass(), "comment", "hoicvmsovO");
        setField(term1307, term1307.getClass(), "mapping", term1320);
        setLongField(term1307, term1307.getClass(), "recordNumber", 6967924379644551255L);
        setElement(term1332, 0, "fhkbdRViHi");
        setElement(term1332, 1, "uWHnvSvaPl");
        setElement(term1332, 2, "kBdSllIBVz");
        setField(term1307, term1307.getClass(), "values", term1332);
        HashMap term4800 = new HashMap();
        term4797 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4801 = (Object[]) newArray("java.lang.String", 3);
        setField(term4797, term4797.getClass(), "comment", "hoicvmsovO");
        setField(term4797, term4797.getClass(), "mapping", term4800);
        setLongField(term4797, term4797.getClass(), "recordNumber", 6967924379644551255L);
        setElement(term4801, 0, "fhkbdRViHi");
        setElement(term4801, 1, "uWHnvSvaPl");
        setElement(term4801, 2, "kBdSllIBVz");
        setField(term4797, term4797.getClass(), "values", term4801);
        term4758 = newInstance(Class.forName("java.util.Arrays$ArrayItr"));
        Object[] term4760 = (Object[]) newArray("java.lang.String", 3);
        setIntField(term4758, term4758.getClass(), "cursor", 0);
        setElement(term4760, 0, "fhkbdRViHi");
        setElement(term4760, 1, "uWHnvSvaPl");
        setElement(term4760, 2, "kBdSllIBVz");
        setField(term4758, term4758.getClass(), "a", term4760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term1307, args);
        assertTrue(recursiveEquals(term1307, term4797));
        assertTrue(recursiveEquals(retValue, term4758));
    }

};


