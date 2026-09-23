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

public class CSVRecord_getRecordNumber_139555750621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object term4238;

    public CSVRecord_getRecordNumber_139555750621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1345 = new HashMap();
        term1307 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1308 = (Object[]) newArray("java.lang.String", 3);
        setElement(term1308, 0, "hoicvmsovO");
        setElement(term1308, 1, "eqJfYWRaEL");
        setElement(term1308, 2, "fhkbdRViHi");
        setField(term1307, term1307.getClass(), "values", term1308);
        setField(term1307, term1307.getClass(), "mapping", term1345);
        setField(term1307, term1307.getClass(), "comment", "kBdSllIBVz");
        setLongField(term1307, term1307.getClass(), "recordNumber", 6967924379644551255L);
        HashMap term4246 = new HashMap();
        term4238 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4239 = (Object[]) newArray("java.lang.String", 3);
        setElement(term4239, 0, "hoicvmsovO");
        setElement(term4239, 1, "eqJfYWRaEL");
        setElement(term4239, 2, "fhkbdRViHi");
        setField(term4238, term4238.getClass(), "values", term4239);
        setField(term4238, term4238.getClass(), "mapping", term4246);
        setField(term4238, term4238.getClass(), "comment", "kBdSllIBVz");
        setLongField(term4238, term4238.getClass(), "recordNumber", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordNumber", argTypes, term1307, args);
        assertTrue(recursiveEquals(term1307, term4238));
        assertTrue(recursiveEquals(retValue, 6967924379644551255L));
    }

};


