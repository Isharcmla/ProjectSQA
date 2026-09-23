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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289645;
     Object term288395;

    public CSVFormat_format_2070435827380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term289697 = new Character((char) 1024);
        Character term289749 = new Character((char) 8192);
        Character term289801 = new Character((char) 0);
        Class<? extends Object> term289979 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term289978 = ((Class) term289979).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term289978).setAccessible(true);
        Object enum433 = ((Field) term289978).get((Object) null);
        term289645 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term288719 = (Object[]) newArray("java.lang.String", 0);
        setField(term289645, term289645.getClass(), "quoteChar", term289697);
        setCharField(term289645, term289645.getClass(), "delimiter", (char) 64508);
        setField(term289645, term289645.getClass(), "escape", term289749);
        setField(term289645, term289645.getClass(), "commentStart", term289801);
        setField(term289645, term289645.getClass(), "header", term288719);
        setField(term289645, term289645.getClass(), "quotePolicy", enum433);
        term288395 = (Object[]) newArray("java.lang.String", 2);
        int[] term288396 = (int[]) newIntArray(0);
        Object term289977 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term288395, 0, term288396);
        setElement(term288395, 1, term289977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term288395;
        callMethod(klass, "format", argTypes, term289645, args);
    }

};


