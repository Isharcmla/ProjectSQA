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

public class CSVPrinter_printRecords_103548374167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47630;
     Object term47234;

    public CSVPrinter_printRecords_103548374167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term47752 = new Character((char) 0);
        Class<? extends Object> term48553 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48552 = ((Class) term48553).getDeclaredField((String) "NONE");
        ((Field) term48552).setAccessible(true);
        Object enum58 = ((Field) term48552).get((Object) null);
        Character term47912 = new Character((char) 0);
        term47630 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term47700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term47630, term47630.getClass(), "newRecord", true);
        setField(term47700, term47700.getClass(), "quoteCharacter", term47752);
        setCharField(term47700, term47700.getClass(), "delimiter", (char) 0);
        setField(term47700, term47700.getClass(), "quoteMode", enum58);
        setField(term47700, term47700.getClass(), "escapeCharacter", term47912);
        setField(term47630, term47630.getClass(), "format", term47700);
        term47234 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term47234, 0, "MINIMAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term47234;
        try {
            callMethod(klass, "printRecords", argTypes, term47630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


