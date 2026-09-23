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

public class CSVPrinter_printRecord_2092483930263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839389;
     Object term838401;

    public CSVPrinter_printRecord_2092483930263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term839511 = new Character((char) 0);
        Class<? extends Object> term840597 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term840596 = ((Class) term840597).getDeclaredField((String) "NONE");
        ((Field) term840596).setAccessible(true);
        Object enum250 = ((Field) term840596).get((Object) null);
        term839389 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term839459 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term839389, term839389.getClass(), "newRecord", true);
        setField(term839459, term839459.getClass(), "quoteChar", term839511);
        setCharField(term839459, term839459.getClass(), "delimiter", (char) 0);
        setField(term839459, term839459.getClass(), "quotePolicy", enum250);
        setField(term839389, term839389.getClass(), "format", term839459);
        Class<? extends Object> term840756 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term840755 = ((Class) term840756).getDeclaredField((String) "ALL");
        ((Field) term840755).setAccessible(true);
        Object enum251 = ((Field) term840755).get((Object) null);
        Class<? extends Object> term840912 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term840911 = ((Class) term840912).getDeclaredField((String) "ALL");
        ((Field) term840911).setAccessible(true);
        Object enum252 = ((Field) term840911).get((Object) null);
        term838401 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term838401, 0, enum251);
        setElement(term838401, 1, enum252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term838401;
        try {
            callMethod(klass, "printRecord", argTypes, term839389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


