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

public class CSVPrinter_printRecord_209248393091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41744;
     Object term41252;

    public CSVPrinter_printRecord_209248393091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term41866 = new Character((char) 8192);
        Class<? extends Object> term42565 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term42564 = ((Class) term42565).getDeclaredField((String) "ALL");
        ((Field) term42564).setAccessible(true);
        Object enum62 = ((Field) term42564).get((Object) null);
        term41744 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term41814 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term41744, term41744.getClass(), "newRecord", true);
        setField(term41814, term41814.getClass(), "quoteChar", term41866);
        setCharField(term41814, term41814.getClass(), "delimiter", (char) 32);
        setField(term41814, term41814.getClass(), "quotePolicy", enum62);
        setField(term41744, term41744.getClass(), "format", term41814);
        term41252 = (Object[]) newArray("java.lang.Object", 2);
        Object term42042 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term41252, 0, term42042);
        setElement(term41252, 1, enum62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41252;
        try {
            callMethod(klass, "printRecord", argTypes, term41744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


