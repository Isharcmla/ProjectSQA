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

public class CSVPrinter_printRecord_2092483930123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69161;
     Object term59878;

    public CSVPrinter_printRecord_2092483930123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term69283 = new Character((char) 272);
        Class<? extends Object> term70267 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term70266 = ((Class) term70267).getDeclaredField((String) "MINIMAL");
        ((Field) term70266).setAccessible(true);
        Object enum86 = ((Field) term70266).get((Object) null);
        term69161 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term69231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term69161, term69161.getClass(), "newRecord", true);
        setField(term69231, term69231.getClass(), "quoteChar", term69283);
        setCharField(term69231, term69231.getClass(), "delimiter", (char) 65263);
        setField(term69231, term69231.getClass(), "quotePolicy", enum86);
        setField(term69161, term69161.getClass(), "format", term69231);
        term59878 = (Object[]) newArray("java.lang.Object", 2);
        Object term69455 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term69493 = newInstance(Class.forName("java.lang.Object"));
        setElement(term59878, 0, term69455);
        setElement(term59878, 1, term69493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term59878;
        try {
            callMethod(klass, "printRecord", argTypes, term69161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


