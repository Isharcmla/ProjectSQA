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

public class CSVRecord_getRecordNumber_139555750621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525;
     Object term3611;

    public CSVRecord_getRecordNumber_139555750621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term538 = new HashMap();
        term525 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term550 = (Object[]) newArray("java.lang.String", 9);
        setField(term525, term525.getClass(), "comment", "vrQLuWIDJX");
        setField(term525, term525.getClass(), "mapping", term538);
        setLongField(term525, term525.getClass(), "recordNumber", 7411271909051562686L);
        setElement(term550, 0, "OclPbYPkcH");
        setElement(term550, 1, "IoAlmYsBwc");
        setElement(term550, 2, "TEParAifyi");
        setElement(term550, 3, "OWDIEULEFu");
        setElement(term550, 4, "dWRymuLBtr");
        setElement(term550, 5, "AijpHYOFuy");
        setElement(term550, 6, "SbAoxhfrkn");
        setElement(term550, 7, "kuTXqwMtDB");
        setElement(term550, 8, "Ghbwtircqb");
        setField(term525, term525.getClass(), "values", term550);
        HashMap term3614 = new HashMap();
        term3611 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3615 = (Object[]) newArray("java.lang.String", 9);
        setField(term3611, term3611.getClass(), "comment", "vrQLuWIDJX");
        setField(term3611, term3611.getClass(), "mapping", term3614);
        setLongField(term3611, term3611.getClass(), "recordNumber", 7411271909051562686L);
        setElement(term3615, 0, "OclPbYPkcH");
        setElement(term3615, 1, "IoAlmYsBwc");
        setElement(term3615, 2, "TEParAifyi");
        setElement(term3615, 3, "OWDIEULEFu");
        setElement(term3615, 4, "dWRymuLBtr");
        setElement(term3615, 5, "AijpHYOFuy");
        setElement(term3615, 6, "SbAoxhfrkn");
        setElement(term3615, 7, "kuTXqwMtDB");
        setElement(term3615, 8, "Ghbwtircqb");
        setField(term3611, term3611.getClass(), "values", term3615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordNumber", argTypes, term525, args);
        assertTrue(recursiveEquals(term525, term3611));
        assertTrue(recursiveEquals(retValue, 7411271909051562686L));
    }

};


