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

public class CSVPrinter_printRecord_2092483930293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347779;
     Object term345227;

    public CSVPrinter_printRecord_2092483930293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term347901 = new Character((char) 128);
        Class<? extends Object> term348548 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term348547 = ((Class) term348548).getDeclaredField((String) "ALL");
        ((Field) term348547).setAccessible(true);
        Object enum253 = ((Field) term348547).get((Object) null);
        term347779 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term347849 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term347779, term347779.getClass(), "newRecord", true);
        setField(term347849, term347849.getClass(), "quoteChar", term347901);
        setCharField(term347849, term347849.getClass(), "delimiter", (char) 16);
        setField(term347849, term347849.getClass(), "quotePolicy", enum253);
        setField(term347779, term347779.getClass(), "format", term347849);
        term345227 = (Object[]) newArray("java.lang.Object", 1);
        Object term348073 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term345227, 0, term348073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term345227;
        try {
            callMethod(klass, "printRecord", argTypes, term347779, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


