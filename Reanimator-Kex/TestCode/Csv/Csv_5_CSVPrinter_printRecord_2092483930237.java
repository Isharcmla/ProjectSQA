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

public class CSVPrinter_printRecord_2092483930237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338497;
     Object term336981;

    public CSVPrinter_printRecord_2092483930237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term338619 = new Character((char) 8192);
        Class<? extends Object> term339327 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term339326 = ((Class) term339327).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term339326).setAccessible(true);
        Object enum218 = ((Field) term339326).get((Object) null);
        term338497 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term338567 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term338497, term338497.getClass(), "newRecord", true);
        setField(term338567, term338567.getClass(), "quoteChar", term338619);
        setCharField(term338567, term338567.getClass(), "delimiter", (char) 4);
        setField(term338567, term338567.getClass(), "quotePolicy", enum218);
        setField(term338497, term338497.getClass(), "format", term338567);
        term336981 = (Object[]) newArray("java.lang.Object", 1);
        Object term338795 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term336981, 0, term338795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term336981;
        try {
            callMethod(klass, "printRecord", argTypes, term338497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


