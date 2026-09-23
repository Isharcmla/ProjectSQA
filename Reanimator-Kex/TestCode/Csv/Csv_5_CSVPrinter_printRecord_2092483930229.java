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

public class CSVPrinter_printRecord_2092483930229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328744;
     Object term317304;

    public CSVPrinter_printRecord_2092483930229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term328866 = new Character((char) 44539);
        Class<? extends Object> term329823 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term329822 = ((Class) term329823).getDeclaredField((String) "MINIMAL");
        ((Field) term329822).setAccessible(true);
        Object enum210 = ((Field) term329822).get((Object) null);
        term328744 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term328814 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term328744, term328744.getClass(), "newRecord", true);
        setField(term328814, term328814.getClass(), "quoteChar", term328866);
        setCharField(term328814, term328814.getClass(), "delimiter", (char) 1);
        setField(term328814, term328814.getClass(), "quotePolicy", enum210);
        setField(term328744, term328744.getClass(), "format", term328814);
        term317304 = (Object[]) newArray("java.lang.Object", 2);
        Object term329042 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term329080 = newInstance(Class.forName("java.lang.Object"));
        setElement(term317304, 0, term329042);
        setElement(term317304, 1, term329080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term317304;
        try {
            callMethod(klass, "printRecord", argTypes, term328744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


