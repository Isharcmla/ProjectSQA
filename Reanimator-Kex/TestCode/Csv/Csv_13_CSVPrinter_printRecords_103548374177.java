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

public class CSVPrinter_printRecords_103548374177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54645;
     Object term54047;

    public CSVPrinter_printRecords_103548374177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term54767 = new Character((char) 0);
        Class<? extends Object> term55513 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55512 = ((Class) term55513).getDeclaredField((String) "ALL");
        ((Field) term55512).setAccessible(true);
        Object enum66 = ((Field) term55512).get((Object) null);
        Character term54927 = new Character((char) 32768);
        term54645 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term54715 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term54645, term54645.getClass(), "newRecord", true);
        setField(term54715, term54715.getClass(), "quoteCharacter", term54767);
        setCharField(term54715, term54715.getClass(), "delimiter", (char) 512);
        setField(term54715, term54715.getClass(), "quoteMode", enum66);
        setField(term54715, term54715.getClass(), "escapeCharacter", term54927);
        setField(term54645, term54645.getClass(), "format", term54715);
        term54047 = (Object[]) newArray("java.lang.Object", 512);
        Object term54999 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term54047, 0, term54999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54047;
        try {
            callMethod(klass, "printRecords", argTypes, term54645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


