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

public class CSVPrinter_printRecord_2092483930187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207374;
     Object term204812;

    public CSVPrinter_printRecord_2092483930187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term207496 = new Character((char) 20504);
        Class<? extends Object> term208147 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term208146 = ((Class) term208147).getDeclaredField((String) "ALL");
        ((Field) term208146).setAccessible(true);
        Object enum164 = ((Field) term208146).get((Object) null);
        term207374 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term207444 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term207374, term207374.getClass(), "newRecord", true);
        setField(term207444, term207444.getClass(), "quoteChar", term207496);
        setCharField(term207444, term207444.getClass(), "delimiter", (char) 20504);
        setField(term207444, term207444.getClass(), "quotePolicy", enum164);
        setField(term207374, term207374.getClass(), "format", term207444);
        term204812 = (Object[]) newArray("java.lang.Object", 1);
        Object term207672 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term204812, 0, term207672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term204812;
        try {
            callMethod(klass, "printRecord", argTypes, term207374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


