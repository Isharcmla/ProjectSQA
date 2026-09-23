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

public class CSVPrinter_printRecords_103548374192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65787;
     Object term65260;

    public CSVPrinter_printRecords_103548374192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term65909 = new Character((char) 0);
        Class<? extends Object> term67299 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term67298 = ((Class) term67299).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term67298).setAccessible(true);
        Object enum78 = ((Field) term67298).get((Object) null);
        Character term66069 = new Character((char) 1);
        term65787 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term65857 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term65787, term65787.getClass(), "newRecord", true);
        setField(term65857, term65857.getClass(), "quoteCharacter", term65909);
        setCharField(term65857, term65857.getClass(), "delimiter", (char) 0);
        setField(term65857, term65857.getClass(), "quoteMode", enum78);
        setField(term65857, term65857.getClass(), "escapeCharacter", term66069);
        setField(term65787, term65787.getClass(), "format", term65857);
        term65260 = (Object[]) newArray("java.lang.Object", 1);
        Object term66107 = newInstance(Class.forName("java.lang.Object"));
        setElement(term65260, 0, term66107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term65260;
        try {
            callMethod(klass, "printRecords", argTypes, term65787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


