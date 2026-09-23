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

public class CSVFormat_format_2070435827381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294008;
     Object term290906;

    public CSVFormat_format_2070435827381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term294060 = new Character((char) 32);
        Character term294328 = new Character((char) 2);
        Character term294164 = new Character((char) 0);
        Class<? extends Object> term294330 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term294329 = ((Class) term294330).getDeclaredField((String) "MINIMAL");
        ((Field) term294329).setAccessible(true);
        Object enum434 = ((Field) term294329).get((Object) null);
        term294008 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term291493 = (Object[]) newArray("java.lang.String", 0);
        setField(term294008, term294008.getClass(), "quoteChar", term294060);
        setCharField(term294008, term294008.getClass(), "delimiter", 'k');
        setField(term294008, term294008.getClass(), "escape", term294328);
        setField(term294008, term294008.getClass(), "commentStart", term294164);
        setField(term294008, term294008.getClass(), "header", term291493);
        setField(term294008, term294008.getClass(), "quotePolicy", enum434);
        term290906 = (Object[]) newArray("java.lang.String", 2);
        Object term294302 = newInstance(Class.forName("java.lang.Object"));
        setElement(term290906, 0, term294302);
        setElement(term290906, 1, term294328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term290906;
        callMethod(klass, "format", argTypes, term294008, args);
    }

};


