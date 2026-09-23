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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class CSVFormat_format_2070435827207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106188;
     Object term96877;

    public CSVFormat_format_2070435827207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term106240 = new Character((char) 60197);
        Character term106292 = new Character((char) 0);
        Character term106344 = new Character((char) 5202);
        Class<? extends Object> term107083 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term107082 = ((Class) term107083).getDeclaredField((String) "MINIMAL");
        ((Field) term107082).setAccessible(true);
        Object enum177 = ((Field) term107082).get((Object) null);
        term106188 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term97210 = (Object[]) newArray("java.lang.String", 0);
        setField(term106188, term106188.getClass(), "quoteChar", term106240);
        setCharField(term106188, term106188.getClass(), "delimiter", 'd');
        setField(term106188, term106188.getClass(), "escape", term106292);
        setField(term106188, term106188.getClass(), "commentStart", term106344);
        setField(term106188, term106188.getClass(), "header", term97210);
        setField(term106188, term106188.getClass(), "quotePolicy", enum177);
        StringBuilder term106550 = new StringBuilder();
        term96877 = (Object[]) newArray("java.lang.Object", 256);
        Object term106490 = newInstance(Class.forName("java.io.StringWriter"));
        int[] term96879 = (int[]) newIntArray(4);
        setElement(term96877, 0, term106490);
        setIntElement(term96879, 1, 4);
        setElement(term96877, 1, term96879);
        setElement(term96877, 2, term106550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96877;
        try {
            callMethod(klass, "format", argTypes, term106188, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


