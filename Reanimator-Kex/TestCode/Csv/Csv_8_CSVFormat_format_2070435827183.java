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
import java.util.ArrayList;

public class CSVFormat_format_2070435827183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88593;
     Object term85047;

    public CSVFormat_format_2070435827183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term88645 = new Character((char) 55291);
        Character term88697 = new Character((char) 0);
        Character term88875 = new Character((char) 8192);
        Class<? extends Object> term89037 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term89036 = ((Class) term89037).getDeclaredField((String) "NONE");
        ((Field) term89036).setAccessible(true);
        Object enum165 = ((Field) term89036).get((Object) null);
        term88593 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term85370 = (Object[]) newArray("java.lang.String", 0);
        setField(term88593, term88593.getClass(), "quoteChar", term88645);
        setCharField(term88593, term88593.getClass(), "delimiter", 'c');
        setField(term88593, term88593.getClass(), "escape", term88697);
        setField(term88593, term88593.getClass(), "commentStart", term88875);
        setField(term88593, term88593.getClass(), "header", term85370);
        setField(term88593, term88593.getClass(), "quotePolicy", enum165);
        Class<? extends Object> term89196 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term89195 = ((Class) term89196).getDeclaredField((String) "ALL");
        ((Field) term89195).setAccessible(true);
        Object enum166 = ((Field) term89195).get((Object) null);
        ArrayList term89035 = new ArrayList();
        term85047 = (Object[]) newArray("java.lang.String", 512);
        Object term88921 = newInstance(Class.forName("java.io.StringWriter"));
        setElement(term85047, 0, term88875);
        setElement(term85047, 1, term88921);
        setElement(term85047, 2, enum166);
        setElement(term85047, 3, term89035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term85047;
        callMethod(klass, "format", argTypes, term88593, args);
    }

};


