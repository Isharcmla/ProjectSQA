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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class CSVParser_initializeHeader_1763412551147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356461;

    public CSVParser_initializeHeader_1763412551147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term356583 = new ArrayList();
        term356461 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term356531 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term356333 = (Object[]) newArray("java.lang.String", 0);
        Object term356645 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        setField(term356531, term356531.getClass(), "header", term356333);
        setField(term356461, term356461.getClass(), "format", term356531);
        setField(term356461, term356461.getClass(), "record", term356583);
        setField(term356461, term356461.getClass(), "reusableToken", term356645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term356461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


