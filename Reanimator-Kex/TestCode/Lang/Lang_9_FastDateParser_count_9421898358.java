package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.lang.Object;

public class FastDateParser_count_9421898358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8249;
     Object term15448;

    public FastDateParser_count_9421898358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8249 = (Object[]) newArray("java.lang.String", 6);
        setElement(term8249, 0, "DbiCVtPPCT");
        setElement(term8249, 1, "WzFopsaDuG");
        setElement(term8249, 2, "PapWxkhEWe");
        setElement(term8249, 3, "smnHEqRFRx");
        setElement(term8249, 4, "XYtryyobou");
        setElement(term8249, 5, "OYbzXylRWW");
        term15448 = (Object[]) newArray("java.lang.String", 6);
        setElement(term15448, 0, "DbiCVtPPCT");
        setElement(term15448, 1, "WzFopsaDuG");
        setElement(term15448, 2, "PapWxkhEWe");
        setElement(term15448, 3, "smnHEqRFRx");
        setElement(term15448, 4, "XYtryyobou");
        setElement(term15448, 5, "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8249;
        Object retValue = callMethod(klass, "count", argTypes, null, args);
        assertTrue(recursiveEquals(term8249, term15448));
        assertTrue(recursiveEquals(retValue, 6));
    }

};


