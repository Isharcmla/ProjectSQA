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

public class CSVPrinter_printRecord_2092483930173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132697;
     Object term132506;

    public CSVPrinter_printRecord_2092483930173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term132819 = new Character((char) 0);
        Class<? extends Object> term133482 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term133481 = ((Class) term133482).getDeclaredField((String) "ALL");
        ((Field) term133481).setAccessible(true);
        Object enum134 = ((Field) term133481).get((Object) null);
        term132697 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term132767 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term132697, term132697.getClass(), "newRecord", true);
        setField(term132767, term132767.getClass(), "quoteChar", term132819);
        setCharField(term132767, term132767.getClass(), "delimiter", (char) 0);
        setField(term132767, term132767.getClass(), "quotePolicy", enum134);
        setField(term132697, term132697.getClass(), "format", term132767);
        term132506 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term132506, 0, "");
        setElement(term132506, 1, enum134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term132506;
        try {
            callMethod(klass, "printRecord", argTypes, term132697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


