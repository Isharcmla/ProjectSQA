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

public class CSVPrinter_printRecords_112895269426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3700;

    public CSVPrinter_printRecords_112895269426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3703 = new Character('V');
        Class<? extends Object> term12167 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12166 = ((Class) term12167).getDeclaredField((String) "NONE");
        ((Field) term12166).setAccessible(true);
        Object enum28 = ((Field) term12166).get((Object) null);
        Character term3713 = new Character('m');
        Character term3715 = new Character('a');
        term3700 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3701 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3743 = (Object[]) newArray("java.lang.String", 5);
        setField(term3700, term3700.getClass(), "out", null);
        setCharField(term3701, term3701.getClass(), "delimiter", 'p');
        setField(term3701, term3701.getClass(), "quoteChar", term3703);
        setField(term3701, term3701.getClass(), "quotePolicy", enum28);
        setField(term3701, term3701.getClass(), "commentStart", term3713);
        setField(term3701, term3701.getClass(), "escape", term3715);
        setBooleanField(term3701, term3701.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3701, term3701.getClass(), "ignoreEmptyLines", false);
        setField(term3701, term3701.getClass(), "recordSeparator", "tPlsykYBqO");
        setField(term3701, term3701.getClass(), "nullString", "bLPjGVBhlX");
        setElement(term3743, 0, "whBvTVIIlC");
        setElement(term3743, 1, "IgRJUzaCwW");
        setElement(term3743, 2, "JUmudUmaaV");
        setElement(term3743, 3, "KoyGrUJeJW");
        setElement(term3743, 4, "HqBOwkVqjD");
        setField(term3701, term3701.getClass(), "header", term3743);
        setBooleanField(term3701, term3701.getClass(), "skipHeaderRecord", true);
        setField(term3700, term3700.getClass(), "format", term3701);
        setBooleanField(term3700, term3700.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecords", argTypes, term3700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


