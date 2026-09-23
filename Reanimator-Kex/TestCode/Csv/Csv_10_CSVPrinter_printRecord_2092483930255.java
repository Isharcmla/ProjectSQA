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
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_2092483930255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291615;
     Object term290893;

    public CSVPrinter_printRecord_2092483930255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term291737 = new Character((char) 0);
        Class<? extends Object> term292312 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term292311 = ((Class) term292312).getDeclaredField((String) "ALL");
        ((Field) term292311).setAccessible(true);
        Object enum215 = ((Field) term292311).get((Object) null);
        term291615 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term291685 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term291615, term291615.getClass(), "newRecord", true);
        setField(term291685, term291685.getClass(), "quoteChar", term291737);
        setCharField(term291685, term291685.getClass(), "delimiter", (char) 0);
        setField(term291685, term291685.getClass(), "quotePolicy", enum215);
        setField(term291615, term291615.getClass(), "format", term291685);
        term290893 = (Object[]) newArray("java.lang.Object", 1);
        byte[] term290894 = (byte[]) newByteArray(0);
        setElement(term290893, 0, term290894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term290893;
        try {
            callMethod(klass, "printRecord", argTypes, term291615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


