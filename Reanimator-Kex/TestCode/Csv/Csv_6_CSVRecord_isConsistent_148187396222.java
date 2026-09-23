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

public class CSVRecord_isConsistent_148187396222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759;
     Object term3857;

    public CSVRecord_isConsistent_148187396222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term772 = new HashMap();
        term759 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term784 = (Object[]) newArray("java.lang.String", 0);
        setField(term759, term759.getClass(), "comment", "xrwlQZdwCp");
        setField(term759, term759.getClass(), "mapping", term772);
        setLongField(term759, term759.getClass(), "recordNumber", 4872422362414183754L);
        setField(term759, term759.getClass(), "values", term784);
        HashMap term3860 = new HashMap();
        term3857 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3861 = (Object[]) newArray("java.lang.String", 0);
        setField(term3857, term3857.getClass(), "comment", "xrwlQZdwCp");
        setField(term3857, term3857.getClass(), "mapping", term3860);
        setLongField(term3857, term3857.getClass(), "recordNumber", 4872422362414183754L);
        setField(term3857, term3857.getClass(), "values", term3861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term759, args);
        assertTrue(recursiveEquals(term759, term3857));
        assertTrue(recursiveEquals(retValue, true));
    }

};


