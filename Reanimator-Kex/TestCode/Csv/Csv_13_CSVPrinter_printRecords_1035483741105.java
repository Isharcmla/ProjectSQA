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

public class CSVPrinter_printRecords_1035483741105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81417;
     Object term80320;

    public CSVPrinter_printRecords_1035483741105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term81539 = new Character((char) 0);
        Class<? extends Object> term82266 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term82265 = ((Class) term82266).getDeclaredField((String) "ALL");
        ((Field) term82265).setAccessible(true);
        Object enum90 = ((Field) term82265).get((Object) null);
        Character term81699 = new Character((char) 2);
        term81417 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term81487 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term81417, term81417.getClass(), "newRecord", true);
        setField(term81487, term81487.getClass(), "quoteCharacter", term81539);
        setCharField(term81487, term81487.getClass(), "delimiter", (char) 128);
        setField(term81487, term81487.getClass(), "quoteMode", enum90);
        setField(term81487, term81487.getClass(), "escapeCharacter", term81699);
        setField(term81417, term81417.getClass(), "format", term81487);
        Character term81751 = new Character((char) 0);
        term80320 = (Object[]) newArray("java.lang.Object", 32);
        setElement(term80320, 0, term81751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80320;
        try {
            callMethod(klass, "printRecords", argTypes, term81417, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


