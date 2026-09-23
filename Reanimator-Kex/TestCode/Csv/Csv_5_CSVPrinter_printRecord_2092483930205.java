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

public class CSVPrinter_printRecord_2092483930205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267077;
     Object term264625;

    public CSVPrinter_printRecord_2092483930205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term267199 = new Character((char) 16384);
        Class<? extends Object> term268143 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term268142 = ((Class) term268143).getDeclaredField((String) "NONE");
        ((Field) term268142).setAccessible(true);
        Object enum185 = ((Field) term268142).get((Object) null);
        term267077 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term267147 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term267077, term267077.getClass(), "newRecord", true);
        setField(term267147, term267147.getClass(), "quoteChar", term267199);
        setCharField(term267147, term267147.getClass(), "delimiter", (char) 49119);
        setField(term267147, term267147.getClass(), "quotePolicy", enum185);
        setField(term267077, term267077.getClass(), "format", term267147);
        Class<? extends Object> term268302 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term268301 = ((Class) term268302).getDeclaredField((String) "ALL");
        ((Field) term268301).setAccessible(true);
        Object enum186 = ((Field) term268301).get((Object) null);
        term264625 = (Object[]) newArray("java.lang.Object", 2);
        Object term267375 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term264625, 0, term267375);
        setElement(term264625, 1, enum186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term264625;
        try {
            callMethod(klass, "printRecord", argTypes, term267077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


