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

public class CSVPrinter_printRecord_2092483930311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368851;
     Object term367791;

    public CSVPrinter_printRecord_2092483930311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term368973 = new Character((char) 1);
        Class<? extends Object> term369708 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term369707 = ((Class) term369708).getDeclaredField((String) "ALL");
        ((Field) term369707).setAccessible(true);
        Object enum275 = ((Field) term369707).get((Object) null);
        term368851 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term368921 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term368851, term368851.getClass(), "newRecord", true);
        setField(term368921, term368921.getClass(), "quoteChar", term368973);
        setCharField(term368921, term368921.getClass(), "delimiter", (char) 65013);
        setField(term368921, term368921.getClass(), "quotePolicy", enum275);
        setField(term368851, term368851.getClass(), "format", term368921);
        term367791 = (Object[]) newArray("java.lang.Object", 32);
        Object term369145 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term369233 = newInstance(Class.forName("java.lang.Object"));
        setElement(term367791, 0, term369145);
        setElement(term367791, 2, enum275);
        setElement(term367791, 8, term369233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term367791;
        try {
            callMethod(klass, "printRecord", argTypes, term368851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


