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

public class CSVPrinter_printRecords_103548374179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56565;
     Object term55708;

    public CSVPrinter_printRecords_103548374179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term56908 = new Character((char) 0);
        Class<? extends Object> term57767 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57766 = ((Class) term57767).getDeclaredField((String) "MINIMAL");
        ((Field) term57766).setAccessible(true);
        Object enum68 = ((Field) term57766).get((Object) null);
        Character term56988 = new Character((char) 41419);
        term56565 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term56882 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term56565, term56565.getClass(), "newRecord", true);
        setField(term56882, term56882.getClass(), "quoteCharacter", term56908);
        setCharField(term56882, term56882.getClass(), "delimiter", (char) 8523);
        setField(term56882, term56882.getClass(), "quoteMode", enum68);
        setField(term56882, term56882.getClass(), "escapeCharacter", term56988);
        setField(term56565, term56565.getClass(), "format", term56882);
        term55708 = (Object[]) newArray("java.lang.Object", 114);
        setElement(term55708, 0, term56882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term55708;
        try {
            callMethod(klass, "printRecords", argTypes, term56565, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


