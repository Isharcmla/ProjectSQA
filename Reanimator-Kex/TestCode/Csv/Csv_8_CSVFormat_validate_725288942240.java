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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_validate_725288942240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122021;

    public CSVFormat_validate_725288942240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term122073 = new Character((char) 1);
        Class<? extends Object> term123080 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term123079 = ((Class) term123080).getDeclaredField((String) "NONE");
        ((Field) term123079).setAccessible(true);
        Object enum217 = ((Field) term123079).get((Object) null);
        term122021 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term122021, term122021.getClass(), "quoteChar", term122073);
        setCharField(term122021, term122021.getClass(), "delimiter", (char) 0);
        setField(term122021, term122021.getClass(), "escape", null);
        setField(term122021, term122021.getClass(), "commentStart", null);
        setField(term122021, term122021.getClass(), "quotePolicy", enum217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term122021, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


