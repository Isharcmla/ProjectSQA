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

public class CSVPrinter_printRecords_103548374127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4035;
     Object term4108;

    public CSVPrinter_printRecords_103548374127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4038 = new Character('W');
        Class<? extends Object> term12722 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12721 = ((Class) term12722).getDeclaredField((String) "MINIMAL");
        ((Field) term12721).setAccessible(true);
        Object enum29 = ((Field) term12721).get((Object) null);
        Character term4051 = new Character('E');
        Character term4053 = new Character('G');
        term4035 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term4036 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4081 = (Object[]) newArray("java.lang.String", 2);
        setField(term4035, term4035.getClass(), "out", null);
        setCharField(term4036, term4036.getClass(), "delimiter", 'n');
        setField(term4036, term4036.getClass(), "quoteChar", term4038);
        setField(term4036, term4036.getClass(), "quotePolicy", enum29);
        setField(term4036, term4036.getClass(), "commentStart", term4051);
        setField(term4036, term4036.getClass(), "escape", term4053);
        setBooleanField(term4036, term4036.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term4036, term4036.getClass(), "ignoreEmptyLines", false);
        setField(term4036, term4036.getClass(), "recordSeparator", "MAcUBcBckh");
        setField(term4036, term4036.getClass(), "nullString", "oVgzLbrsFr");
        setElement(term4081, 0, "vQVyKLdtaz");
        setElement(term4081, 1, "OWKQODBLzb");
        setField(term4036, term4036.getClass(), "header", term4081);
        setBooleanField(term4036, term4036.getClass(), "skipHeaderRecord", true);
        setField(term4035, term4035.getClass(), "format", term4036);
        setBooleanField(term4035, term4035.getClass(), "newRecord", false);
        term4108 = (Object[]) newArray("java.lang.Object", 3);
        Object term4109 = newInstance(Class.forName("java.lang.Object"));
        Object term4110 = newInstance(Class.forName("java.lang.Object"));
        Object term4111 = newInstance(Class.forName("java.lang.Object"));
        setElement(term4108, 0, term4109);
        setElement(term4108, 1, term4110);
        setElement(term4108, 2, term4111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4108;
        try {
            callMethod(klass, "printRecords", argTypes, term4035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


