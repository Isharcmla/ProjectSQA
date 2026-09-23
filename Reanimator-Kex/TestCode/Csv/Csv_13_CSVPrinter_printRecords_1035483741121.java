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

public class CSVPrinter_printRecords_1035483741121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94160;
     Object term93355;

    public CSVPrinter_printRecords_1035483741121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term94282 = new Character((char) 0);
        Class<? extends Object> term94994 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94993 = ((Class) term94994).getDeclaredField((String) "ALL");
        ((Field) term94993).setAccessible(true);
        Object enum102 = ((Field) term94993).get((Object) null);
        Character term94442 = new Character((char) 32);
        term94160 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term94230 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term94160, term94160.getClass(), "newRecord", true);
        setField(term94230, term94230.getClass(), "quoteCharacter", term94282);
        setCharField(term94230, term94230.getClass(), "delimiter", (char) 128);
        setField(term94230, term94230.getClass(), "quoteMode", enum102);
        setField(term94230, term94230.getClass(), "escapeCharacter", term94442);
        setField(term94160, term94160.getClass(), "format", term94230);
        term93355 = (Object[]) newArray("java.lang.Object", 12);
        setElement(term93355, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term93355;
        try {
            callMethod(klass, "printRecords", argTypes, term94160, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


