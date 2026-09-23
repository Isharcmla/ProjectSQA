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
     Object term4795;
     Object term4756;

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
        HashMap term4798 = new HashMap();
        term4795 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4799 = (Object[]) newArray("java.lang.String", 3);
        setField(term4795, term4795.getClass(), "comment", "hoicvmsovO");
        setField(term4795, term4795.getClass(), "mapping", term4798);
        setLongField(term4795, term4795.getClass(), "recordNumber", 6967924379644551255L);
        setElement(term4799, 0, "fhkbdRViHi");
        setElement(term4799, 1, "uWHnvSvaPl");
        setElement(term4799, 2, "kBdSllIBVz");
        setField(term4795, term4795.getClass(), "values", term4799);
        term4756 = newInstance(Class.forName("java.util.Arrays$ArrayItr"));
        Object[] term4758 = (Object[]) newArray("java.lang.String", 3);
        setIntField(term4756, term4756.getClass(), "cursor", 0);
        setElement(term4758, 0, "fhkbdRViHi");
        setElement(term4758, 1, "uWHnvSvaPl");
        setElement(term4758, 2, "kBdSllIBVz");
        setField(term4756, term4756.getClass(), "a", term4758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term1307, args);
        assertTrue(recursiveEquals(term1307, term4795));
        assertTrue(recursiveEquals(retValue, term4756));
    }

};


