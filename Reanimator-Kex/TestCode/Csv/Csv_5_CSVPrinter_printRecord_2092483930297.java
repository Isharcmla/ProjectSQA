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

public class CSVPrinter_printRecord_2092483930297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894123;
     Object term890717;

    public CSVPrinter_printRecord_2092483930297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term894245 = new Character((char) 13823);
        Class<? extends Object> term895636 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term895635 = ((Class) term895636).getDeclaredField((String) "ALL");
        ((Field) term895635).setAccessible(true);
        Object enum289 = ((Field) term895635).get((Object) null);
        term894123 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term894193 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term894123, term894123.getClass(), "newRecord", true);
        setField(term894193, term894193.getClass(), "quoteChar", term894245);
        setCharField(term894193, term894193.getClass(), "delimiter", (char) 18944);
        setField(term894193, term894193.getClass(), "quotePolicy", enum289);
        setField(term894123, term894123.getClass(), "format", term894193);
        term890717 = (Object[]) newArray("java.lang.Object", 16);
        Object term894421 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term890717, 0, term894421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term890717;
        try {
            callMethod(klass, "printRecord", argTypes, term894123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


