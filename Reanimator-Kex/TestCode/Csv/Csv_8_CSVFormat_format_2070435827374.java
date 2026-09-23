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

public class CSVFormat_format_2070435827374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283333;
     Object term282202;

    public CSVFormat_format_2070435827374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term283385 = new Character((char) 8);
        Character term283437 = new Character((char) 1024);
        Character term283489 = new Character((char) 0);
        Class<? extends Object> term283673 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term283672 = ((Class) term283673).getDeclaredField((String) "ALL");
        ((Field) term283672).setAccessible(true);
        Object enum428 = ((Field) term283672).get((Object) null);
        term283333 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term282402 = (Object[]) newArray("java.lang.String", 0);
        setField(term283333, term283333.getClass(), "quoteChar", term283385);
        setCharField(term283333, term283333.getClass(), "delimiter", (char) 65524);
        setField(term283333, term283333.getClass(), "escape", term283437);
        setField(term283333, term283333.getClass(), "commentStart", term283489);
        setField(term283333, term283333.getClass(), "header", term282402);
        setField(term283333, term283333.getClass(), "quotePolicy", enum428);
        term282202 = (Object[]) newArray("java.lang.String", 2);
        int[] term282203 = (int[]) newIntArray(0);
        Object term283671 = newInstance(Class.forName("java.util.concurrent.ThreadLocalRandom"));
        setElement(term282202, 0, term282203);
        setElement(term282202, 1, term283671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term282202;
        callMethod(klass, "format", argTypes, term283333, args);
    }

};


