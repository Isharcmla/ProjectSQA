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

public class CSVFormat_validate_725288942134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62931;

    public CSVFormat_validate_725288942134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term62983 = new Character((char) 132);
        Character term63035 = new Character((char) 132);
        term62931 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term62931, term62931.getClass(), "quoteChar", term62983);
        setCharField(term62931, term62931.getClass(), "delimiter", (char) 65371);
        setField(term62931, term62931.getClass(), "escape", term63035);
        setField(term62931, term62931.getClass(), "commentStart", term62983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term62931, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


