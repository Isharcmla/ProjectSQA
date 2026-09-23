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

public class CSVPrinter_printRecord_2092483930197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235472;
     Object term234495;

    public CSVPrinter_printRecord_2092483930197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term235594 = new Character((char) 7383);
        Class<? extends Object> term236538 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236537 = ((Class) term236538).getDeclaredField((String) "NONE");
        ((Field) term236537).setAccessible(true);
        Object enum175 = ((Field) term236537).get((Object) null);
        term235472 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term235542 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term235472, term235472.getClass(), "newRecord", true);
        setField(term235542, term235542.getClass(), "quoteChar", term235594);
        setCharField(term235542, term235542.getClass(), "delimiter", (char) 58116);
        setField(term235542, term235542.getClass(), "quotePolicy", enum175);
        setField(term235472, term235472.getClass(), "format", term235542);
        Class<? extends Object> term236697 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236696 = ((Class) term236697).getDeclaredField((String) "ALL");
        ((Field) term236696).setAccessible(true);
        Object enum176 = ((Field) term236696).get((Object) null);
        term234495 = (Object[]) newArray("java.lang.Object", 2);
        Object term235770 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term234495, 0, term235770);
        setElement(term234495, 1, enum176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term234495;
        try {
            callMethod(klass, "printRecord", argTypes, term235472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


