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

public class CSVPrinter_printRecords_1035483741117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91159;
     Object term89879;

    public CSVPrinter_printRecords_1035483741117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term91281 = new Character((char) 0);
        Class<? extends Object> term92527 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92526 = ((Class) term92527).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term92526).setAccessible(true);
        Object enum99 = ((Field) term92526).get((Object) null);
        Character term91441 = new Character((char) 64);
        term91159 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term91229 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term91159, term91159.getClass(), "newRecord", true);
        setField(term91229, term91229.getClass(), "quoteCharacter", term91281);
        setCharField(term91229, term91229.getClass(), "delimiter", (char) 64);
        setField(term91229, term91229.getClass(), "quoteMode", enum99);
        setField(term91229, term91229.getClass(), "escapeCharacter", term91441);
        setField(term91159, term91159.getClass(), "format", term91229);
        Class<? extends Object> term92727 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92726 = ((Class) term92727).getDeclaredField((String) "ALL");
        ((Field) term92726).setAccessible(true);
        Object enum100 = ((Field) term92726).get((Object) null);
        term89879 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term89879, 0, enum100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term89879;
        try {
            callMethod(klass, "printRecords", argTypes, term91159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


