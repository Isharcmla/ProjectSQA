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

public class CSVFormat_format_2070435827324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204355;
     Object term202636;

    public CSVFormat_format_2070435827324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term204407 = new Character((char) 63103);
        Character term204459 = new Character((char) 0);
        Character term204511 = new Character((char) 63423);
        Class<? extends Object> term204701 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term204700 = ((Class) term204701).getDeclaredField((String) "ALL");
        ((Field) term204700).setAccessible(true);
        Object enum342 = ((Field) term204700).get((Object) null);
        term204355 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term202961 = (Object[]) newArray("java.lang.String", 0);
        setField(term204355, term204355.getClass(), "quoteChar", term204407);
        setCharField(term204355, term204355.getClass(), "delimiter", (char) 2048);
        setField(term204355, term204355.getClass(), "escape", term204459);
        setField(term204355, term204355.getClass(), "commentStart", term204511);
        setField(term204355, term204355.getClass(), "header", term202961);
        setField(term204355, term204355.getClass(), "quotePolicy", enum342);
        Class<? extends Object> term204951 = Class.forName((String) "java.math.RoundingMode");
        Field term204950 = ((Class) term204951).getDeclaredField((String) "UP");
        ((Field) term204950).setAccessible(true);
        Object enum343 = ((Field) term204950).get((Object) null);
        term202636 = (Object[]) newArray("java.lang.String", 4);
        int[] term202637 = (int[]) newIntArray(0);
        setElement(term202636, 0, term202637);
        setElement(term202636, 1, "");
        setElement(term202636, 2, enum343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term202636;
        callMethod(klass, "format", argTypes, term204355, args);
    }

};


