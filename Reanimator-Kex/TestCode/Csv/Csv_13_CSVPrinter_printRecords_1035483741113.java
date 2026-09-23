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

public class CSVPrinter_printRecords_1035483741113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88663;
     Object term87669;

    public CSVPrinter_printRecords_1035483741113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term88785 = new Character((char) 4096);
        Class<? extends Object> term89508 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term89507 = ((Class) term89508).getDeclaredField((String) "MINIMAL");
        ((Field) term89507).setAccessible(true);
        Object enum96 = ((Field) term89507).get((Object) null);
        term88663 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term88733 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term88663, term88663.getClass(), "newRecord", true);
        setField(term88733, term88733.getClass(), "quoteCharacter", term88785);
        setCharField(term88733, term88733.getClass(), "delimiter", (char) 1);
        setField(term88733, term88733.getClass(), "quoteMode", enum96);
        setField(term88733, term88733.getClass(), "escapeCharacter", term88785);
        setField(term88663, term88663.getClass(), "format", term88733);
        term87669 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term87669, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term87669;
        try {
            callMethod(klass, "printRecords", argTypes, term88663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


