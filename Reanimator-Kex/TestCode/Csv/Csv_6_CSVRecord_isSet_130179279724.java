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

public class CSVRecord_isSet_130179279724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;
     Object term4415;

    public CSVRecord_isSet_130179279724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1064 = new HashMap();
        term1051 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1076 = (Object[]) newArray("java.lang.String", 9);
        setField(term1051, term1051.getClass(), "comment", "nGKItKLYNC");
        setField(term1051, term1051.getClass(), "mapping", term1064);
        setLongField(term1051, term1051.getClass(), "recordNumber", -7237588299778557629L);
        setElement(term1076, 0, "UoYtihxVaS");
        setElement(term1076, 1, "JDswTTCZHV");
        setElement(term1076, 2, "onpbIeEKoi");
        setElement(term1076, 3, "YRHGsAkhxb");
        setElement(term1076, 4, "ffYhPOzlUs");
        setElement(term1076, 5, "MLqYREekMl");
        setElement(term1076, 6, "ytSBIKXogI");
        setElement(term1076, 7, "nHXjMycHlU");
        setElement(term1076, 8, "ieCtQFdkii");
        setField(term1051, term1051.getClass(), "values", term1076);
        HashMap term4418 = new HashMap();
        term4415 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4419 = (Object[]) newArray("java.lang.String", 9);
        setField(term4415, term4415.getClass(), "comment", "nGKItKLYNC");
        setField(term4415, term4415.getClass(), "mapping", term4418);
        setLongField(term4415, term4415.getClass(), "recordNumber", -7237588299778557629L);
        setElement(term4419, 0, "UoYtihxVaS");
        setElement(term4419, 1, "JDswTTCZHV");
        setElement(term4419, 2, "onpbIeEKoi");
        setElement(term4419, 3, "YRHGsAkhxb");
        setElement(term4419, 4, "ffYhPOzlUs");
        setElement(term4419, 5, "MLqYREekMl");
        setElement(term4419, 6, "ytSBIKXogI");
        setElement(term4419, 7, "nHXjMycHlU");
        setElement(term4419, 8, "ieCtQFdkii");
        setField(term4415, term4415.getClass(), "values", term4419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        Object retValue = callMethod(klass, "isSet", argTypes, term1051, args);
        assertTrue(recursiveEquals(term1051, term4415));
        assertTrue(recursiveEquals(retValue, false));
    }

};


