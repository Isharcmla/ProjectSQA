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

public class CSVPrinter_printRecord_209248393098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43030;
     Object term41268;

    public CSVPrinter_printRecord_209248393098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term43152 = new Character((char) 23682);
        Class<? extends Object> term44696 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term44695 = ((Class) term44696).getDeclaredField((String) "ALL");
        ((Field) term44695).setAccessible(true);
        Object enum66 = ((Field) term44695).get((Object) null);
        term43030 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term43100 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term43304 = newInstance(Class.forName("java.lang.StringBuilder"));
        setBooleanField(term43030, term43030.getClass(), "newRecord", true);
        setField(term43100, term43100.getClass(), "quoteChar", term43152);
        setCharField(term43100, term43100.getClass(), "delimiter", 'p');
        setField(term43100, term43100.getClass(), "quotePolicy", enum66);
        setField(term43030, term43030.getClass(), "format", term43100);
        setField(term43030, term43030.getClass(), "out", term43304);
        Class<? extends Object> term44852 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term44851 = ((Class) term44852).getDeclaredField((String) "ALL");
        ((Field) term44851).setAccessible(true);
        Object enum67 = ((Field) term44851).get((Object) null);
        term41268 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term41268, 0, enum67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41268;
        try {
            callMethod(klass, "printRecord", argTypes, term43030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


