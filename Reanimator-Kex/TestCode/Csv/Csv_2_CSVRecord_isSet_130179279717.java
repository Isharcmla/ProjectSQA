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

public class CSVRecord_isSet_130179279717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;
     Object term2964;

    public CSVRecord_isSet_130179279717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term657 = new HashMap();
        term547 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term548 = (Object[]) newArray("java.lang.String", 9);
        setElement(term548, 0, "flxyYxBRtu");
        setElement(term548, 1, "OclPbYPkcH");
        setElement(term548, 2, "IoAlmYsBwc");
        setElement(term548, 3, "TEParAifyi");
        setElement(term548, 4, "OWDIEULEFu");
        setElement(term548, 5, "dWRymuLBtr");
        setElement(term548, 6, "AijpHYOFuy");
        setElement(term548, 7, "SbAoxhfrkn");
        setElement(term548, 8, "kuTXqwMtDB");
        setField(term547, term547.getClass(), "values", term548);
        setField(term547, term547.getClass(), "mapping", term657);
        setField(term547, term547.getClass(), "comment", "xrwlQZdwCp");
        setLongField(term547, term547.getClass(), "recordNumber", 7411271909051562686L);
        HashMap term2984 = new HashMap();
        term2964 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2965 = (Object[]) newArray("java.lang.String", 9);
        setElement(term2965, 0, "flxyYxBRtu");
        setElement(term2965, 1, "OclPbYPkcH");
        setElement(term2965, 2, "IoAlmYsBwc");
        setElement(term2965, 3, "TEParAifyi");
        setElement(term2965, 4, "OWDIEULEFu");
        setElement(term2965, 5, "dWRymuLBtr");
        setElement(term2965, 6, "AijpHYOFuy");
        setElement(term2965, 7, "SbAoxhfrkn");
        setElement(term2965, 8, "kuTXqwMtDB");
        setField(term2964, term2964.getClass(), "values", term2965);
        setField(term2964, term2964.getClass(), "mapping", term2984);
        setField(term2964, term2964.getClass(), "comment", "xrwlQZdwCp");
        setLongField(term2964, term2964.getClass(), "recordNumber", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        Object retValue = callMethod(klass, "isSet", argTypes, term547, args);
        assertTrue(recursiveEquals(term547, term2964));
        assertTrue(recursiveEquals(retValue, false));
    }

};


