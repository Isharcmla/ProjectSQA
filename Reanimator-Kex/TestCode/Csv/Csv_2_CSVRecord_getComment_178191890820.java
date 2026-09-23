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

public class CSVRecord_getComment_178191890820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073;
     Object term3948;

    public CSVRecord_getComment_178191890820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1183 = new HashMap();
        term1073 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1074 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1074, 0, "UiUYnPrcCi");
        setElement(term1074, 1, "UoYtihxVaS");
        setElement(term1074, 2, "JDswTTCZHV");
        setElement(term1074, 3, "onpbIeEKoi");
        setElement(term1074, 4, "YRHGsAkhxb");
        setElement(term1074, 5, "ffYhPOzlUs");
        setElement(term1074, 6, "MLqYREekMl");
        setElement(term1074, 7, "ytSBIKXogI");
        setElement(term1074, 8, "nHXjMycHlU");
        setField(term1073, term1073.getClass(), "values", term1074);
        setField(term1073, term1073.getClass(), "mapping", term1183);
        setField(term1073, term1073.getClass(), "comment", "dEnhdmILtU");
        setLongField(term1073, term1073.getClass(), "recordNumber", -7237588299778557629L);
        HashMap term3968 = new HashMap();
        term3948 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3949 = (Object[]) newArray("java.lang.String", 9);
        setElement(term3949, 0, "UiUYnPrcCi");
        setElement(term3949, 1, "UoYtihxVaS");
        setElement(term3949, 2, "JDswTTCZHV");
        setElement(term3949, 3, "onpbIeEKoi");
        setElement(term3949, 4, "YRHGsAkhxb");
        setElement(term3949, 5, "ffYhPOzlUs");
        setElement(term3949, 6, "MLqYREekMl");
        setElement(term3949, 7, "ytSBIKXogI");
        setElement(term3949, 8, "nHXjMycHlU");
        setField(term3948, term3948.getClass(), "values", term3949);
        setField(term3948, term3948.getClass(), "mapping", term3968);
        setField(term3948, term3948.getClass(), "comment", "dEnhdmILtU");
        setLongField(term3948, term3948.getClass(), "recordNumber", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getComment", argTypes, term1073, args);
        assertTrue(recursiveEquals(term1073, term3948));
        assertTrue(recursiveEquals(retValue, "dEnhdmILtU"));
    }

};


