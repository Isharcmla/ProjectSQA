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

public class CSVFormat_format_2070435827370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278493;
     Object term276832;

    public CSVFormat_format_2070435827370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term278545 = new Character((char) 16384);
        Character term278597 = new Character((char) 32768);
        Character term278649 = new Character((char) 0);
        Class<? extends Object> term278789 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term278788 = ((Class) term278789).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term278788).setAccessible(true);
        Object enum422 = ((Field) term278788).get((Object) null);
        term278493 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term277160 = (Object[]) newArray("java.lang.String", 0);
        setField(term278493, term278493.getClass(), "quoteChar", term278545);
        setCharField(term278493, term278493.getClass(), "delimiter", (char) 65532);
        setField(term278493, term278493.getClass(), "escape", term278597);
        setField(term278493, term278493.getClass(), "commentStart", term278649);
        setField(term278493, term278493.getClass(), "header", term277160);
        setField(term278493, term278493.getClass(), "quotePolicy", enum422);
        term276832 = (Object[]) newArray("java.lang.String", 2);
        Object[] term276833 = (Object[]) newArray("java.lang.String", 0);
        setElement(term276832, 0, term276833);
        setElement(term276832, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term276832;
        callMethod(klass, "format", argTypes, term278493, args);
    }

};


