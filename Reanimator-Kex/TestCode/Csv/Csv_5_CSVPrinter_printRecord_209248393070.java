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

public class CSVPrinter_printRecord_209248393070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28487;
     Object term28223;

    public CSVPrinter_printRecord_209248393070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28609 = new Character((char) 0);
        Class<? extends Object> term29656 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term29655 = ((Class) term29656).getDeclaredField((String) "MINIMAL");
        ((Field) term29655).setAccessible(true);
        Object enum48 = ((Field) term29655).get((Object) null);
        term28487 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term28557 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term28487, term28487.getClass(), "newRecord", true);
        setField(term28557, term28557.getClass(), "quoteChar", term28609);
        setCharField(term28557, term28557.getClass(), "delimiter", (char) 0);
        setField(term28557, term28557.getClass(), "quotePolicy", enum48);
        setField(term28487, term28487.getClass(), "format", term28557);
        term28223 = (Object[]) newArray("java.lang.Object", 1);
        Object term28785 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term28223, 0, term28785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28223;
        try {
            callMethod(klass, "printRecord", argTypes, term28487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


