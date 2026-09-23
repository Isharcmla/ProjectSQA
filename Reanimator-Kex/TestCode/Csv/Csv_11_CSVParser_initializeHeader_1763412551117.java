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

public class CSVParser_initializeHeader_1763412551117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308528;

    public CSVParser_initializeHeader_1763412551117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term308650 = new ArrayList();
        term308528 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term308598 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term308409 = (Object[]) newArray("java.lang.String", 0);
        setField(term308598, term308598.getClass(), "header", term308409);
        setField(term308528, term308528.getClass(), "format", term308598);
        setField(term308528, term308528.getClass(), "record", term308650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term308528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


