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

public class CSVPrinter_printRecord_209248393097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47975;
     Object term45918;

    public CSVPrinter_printRecord_209248393097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term48097 = new Character((char) 40959);
        Class<? extends Object> term48791 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term48790 = ((Class) term48791).getDeclaredField((String) "ALL");
        ((Field) term48790).setAccessible(true);
        Object enum68 = ((Field) term48790).get((Object) null);
        term47975 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term48045 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term47975, term47975.getClass(), "newRecord", true);
        setField(term48045, term48045.getClass(), "quoteChar", term48097);
        setCharField(term48045, term48045.getClass(), "delimiter", (char) 1);
        setField(term48045, term48045.getClass(), "quotePolicy", enum68);
        setField(term47975, term47975.getClass(), "format", term48045);
        term45918 = (Object[]) newArray("java.lang.Object", 2);
        Object term48273 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term45918, 0, term48273);
        setElement(term45918, 1, "MINIMAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45918;
        try {
            callMethod(klass, "printRecord", argTypes, term47975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


