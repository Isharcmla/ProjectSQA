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

public class CSVRecord_isMapped_32348666416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term2772;

    public CSVRecord_isMapped_32348666416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term491 = new HashMap();
        term489 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term490 = (Object[]) newArray("java.lang.String", 0);
        setField(term489, term489.getClass(), "values", term490);
        setField(term489, term489.getClass(), "mapping", term491);
        setField(term489, term489.getClass(), "comment", "BYqFIqCKAV");
        setLongField(term489, term489.getClass(), "recordNumber", 5270370404989704783L);
        HashMap term2774 = new HashMap();
        term2772 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2773 = (Object[]) newArray("java.lang.String", 0);
        setField(term2772, term2772.getClass(), "values", term2773);
        setField(term2772, term2772.getClass(), "mapping", term2774);
        setField(term2772, term2772.getClass(), "comment", "BYqFIqCKAV");
        setLongField(term2772, term2772.getClass(), "recordNumber", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "isMapped", argTypes, term489, args);
        assertTrue(recursiveEquals(term489, term2772));
        assertTrue(recursiveEquals(retValue, false));
    }

};


