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

public class CSVRecord_values_187639538119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;
     Object term3495;
     Object term3258;

    public CSVRecord_values_187639538119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term949 = new HashMap();
        term839 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term840 = (Object[]) newArray("java.lang.String", 9);
        setElement(term840, 0, "wSQxaModmm");
        setElement(term840, 1, "UlajhuVLaP");
        setElement(term840, 2, "gGSMzuGICf");
        setElement(term840, 3, "hxCBltsObl");
        setElement(term840, 4, "BndsHwAFMv");
        setElement(term840, 5, "GzFkzHGYFt");
        setElement(term840, 6, "tShwQLRGNe");
        setElement(term840, 7, "LvtrsXUliU");
        setElement(term840, 8, "xLbjWUgOIL");
        setField(term839, term839.getClass(), "values", term840);
        setField(term839, term839.getClass(), "mapping", term949);
        setField(term839, term839.getClass(), "comment", "nGKItKLYNC");
        setLongField(term839, term839.getClass(), "recordNumber", 6811161968424632369L);
        HashMap term3515 = new HashMap();
        term3495 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term3496 = (Object[]) newArray("java.lang.String", 9);
        setElement(term3496, 0, "wSQxaModmm");
        setElement(term3496, 1, "UlajhuVLaP");
        setElement(term3496, 2, "gGSMzuGICf");
        setElement(term3496, 3, "hxCBltsObl");
        setElement(term3496, 4, "BndsHwAFMv");
        setElement(term3496, 5, "GzFkzHGYFt");
        setElement(term3496, 6, "tShwQLRGNe");
        setElement(term3496, 7, "LvtrsXUliU");
        setElement(term3496, 8, "xLbjWUgOIL");
        setField(term3495, term3495.getClass(), "values", term3496);
        setField(term3495, term3495.getClass(), "mapping", term3515);
        setField(term3495, term3495.getClass(), "comment", "nGKItKLYNC");
        setLongField(term3495, term3495.getClass(), "recordNumber", 6811161968424632369L);
        term3258 = (Object[]) newArray("java.lang.String", 9);
        setElement(term3258, 0, "wSQxaModmm");
        setElement(term3258, 1, "UlajhuVLaP");
        setElement(term3258, 2, "gGSMzuGICf");
        setElement(term3258, 3, "hxCBltsObl");
        setElement(term3258, 4, "BndsHwAFMv");
        setElement(term3258, 5, "GzFkzHGYFt");
        setElement(term3258, 6, "tShwQLRGNe");
        setElement(term3258, 7, "LvtrsXUliU");
        setElement(term3258, 8, "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term839, args);
        assertTrue(recursiveEquals(term839, term3495));
        assertTrue(recursiveEquals(retValue, term3258));
    }

};


