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

public class CSVFormat_format_2070435827354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249424;
     Object term247575;

    public CSVFormat_format_2070435827354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term249476 = new Character((char) 0);
        Character term249528 = new Character((char) 0);
        Character term249580 = new Character((char) 20852);
        Class<? extends Object> term249720 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term249719 = ((Class) term249720).getDeclaredField((String) "ALL");
        ((Field) term249719).setAccessible(true);
        Object enum395 = ((Field) term249719).get((Object) null);
        term249424 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term247691 = (Object[]) newArray("java.lang.String", 0);
        setField(term249424, term249424.getClass(), "quoteChar", term249476);
        setCharField(term249424, term249424.getClass(), "delimiter", (char) 45000);
        setField(term249424, term249424.getClass(), "escape", term249528);
        setField(term249424, term249424.getClass(), "commentStart", term249580);
        setField(term249424, term249424.getClass(), "header", term247691);
        setField(term249424, term249424.getClass(), "quotePolicy", enum395);
        term247575 = (Object[]) newArray("java.lang.String", 2);
        Object[] term247576 = (Object[]) newArray("java.lang.String", 0);
        setElement(term247575, 0, term247576);
        setElement(term247575, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term247575;
        callMethod(klass, "format", argTypes, term249424, args);
    }

};


