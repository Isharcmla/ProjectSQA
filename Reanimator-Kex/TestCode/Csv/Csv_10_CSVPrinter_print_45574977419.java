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
import java.lang.Integer;

public class CSVPrinter_print_45574977419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;
     Object term1374;
     Object term1375;
     Object term1377;

    public CSVPrinter_print_45574977419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1312 = new Character('R');
        Class<? extends Object> term7410 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term7409 = ((Class) term7410).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term7409).setAccessible(true);
        Object enum21 = ((Field) term7409).get((Object) null);
        Character term1329 = new Character('r');
        Character term1331 = new Character('b');
        term1309 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1310 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1359 = (Object[]) newArray("java.lang.String", 1);
        setField(term1309, term1309.getClass(), "out", null);
        setCharField(term1310, term1310.getClass(), "delimiter", 't');
        setField(term1310, term1310.getClass(), "quoteChar", term1312);
        setField(term1310, term1310.getClass(), "quotePolicy", enum21);
        setField(term1310, term1310.getClass(), "commentStart", term1329);
        setField(term1310, term1310.getClass(), "escape", term1331);
        setBooleanField(term1310, term1310.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1310, term1310.getClass(), "ignoreEmptyLines", true);
        setField(term1310, term1310.getClass(), "recordSeparator", "BYqFIqCKAV");
        setField(term1310, term1310.getClass(), "nullString", "vrQLuWIDJX");
        setElement(term1359, 0, "flxyYxBRtu");
        setField(term1310, term1310.getClass(), "header", term1359);
        setBooleanField(term1310, term1310.getClass(), "skipHeaderRecord", true);
        setField(term1309, term1309.getClass(), "format", term1310);
        setBooleanField(term1309, term1309.getClass(), "newRecord", false);
        term1374 = newInstance(Class.forName("java.lang.Object"));
        term1375 = new Integer(568599855);
        term1377 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1374;
        args[1] = null;
        args[2] = term1375;
        args[3] = term1377;
        try {
            callMethod(klass, "print", argTypes, term1309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


