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

public class CSVPrinter_printRecord_209248393038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15717;
     Object term15526;

    public CSVPrinter_printRecord_209248393038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15839 = new Character((char) 0);
        Class<? extends Object> term16615 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term16614 = ((Class) term16615).getDeclaredField((String) "ALL");
        ((Field) term16614).setAccessible(true);
        Object enum34 = ((Field) term16614).get((Object) null);
        term15717 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term15787 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term15717, term15717.getClass(), "newRecord", true);
        setField(term15787, term15787.getClass(), "quoteChar", term15839);
        setCharField(term15787, term15787.getClass(), "delimiter", (char) 0);
        setField(term15787, term15787.getClass(), "quotePolicy", enum34);
        setField(term15717, term15717.getClass(), "format", term15787);
        term15526 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term15526, 0, "");
        setElement(term15526, 1, enum34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15526;
        try {
            callMethod(klass, "printRecord", argTypes, term15717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


