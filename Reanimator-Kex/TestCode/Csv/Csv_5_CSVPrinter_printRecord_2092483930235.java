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

public class CSVPrinter_printRecord_2092483930235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336051;
     Object term334419;

    public CSVPrinter_printRecord_2092483930235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term336173 = new Character((char) 40924);
        Class<? extends Object> term336824 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term336823 = ((Class) term336824).getDeclaredField((String) "ALL");
        ((Field) term336823).setAccessible(true);
        Object enum216 = ((Field) term336823).get((Object) null);
        term336051 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term336121 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term336051, term336051.getClass(), "newRecord", true);
        setField(term336121, term336121.getClass(), "quoteChar", term336173);
        setCharField(term336121, term336121.getClass(), "delimiter", (char) 24610);
        setField(term336121, term336121.getClass(), "quotePolicy", enum216);
        setField(term336051, term336051.getClass(), "format", term336121);
        term334419 = (Object[]) newArray("java.lang.Object", 1);
        Object term336349 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term334419, 0, term336349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term334419;
        try {
            callMethod(klass, "printRecord", argTypes, term336051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


