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

public class CSVPrinter_printRecord_2092483930321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931832;
     Object term930331;

    public CSVPrinter_printRecord_2092483930321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term931954 = new Character((char) 0);
        Class<? extends Object> term932703 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term932702 = ((Class) term932703).getDeclaredField((String) "ALL");
        ((Field) term932702).setAccessible(true);
        Object enum313 = ((Field) term932702).get((Object) null);
        Character term932106 = new Character((char) 19368);
        term931832 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term931902 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term931832, term931832.getClass(), "newRecord", true);
        setField(term931902, term931902.getClass(), "quoteChar", term931954);
        setCharField(term931902, term931902.getClass(), "delimiter", (char) 19368);
        setField(term931902, term931902.getClass(), "quotePolicy", enum313);
        setField(term931902, term931902.getClass(), "escape", term932106);
        setField(term931832, term931832.getClass(), "format", term931902);
        term930331 = (Object[]) newArray("java.lang.Object", 2);
        Object term932182 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term932220 = newInstance(Class.forName("java.lang.Object"));
        setElement(term930331, 0, term932182);
        setElement(term930331, 1, term932220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term930331;
        try {
            callMethod(klass, "printRecord", argTypes, term931832, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


