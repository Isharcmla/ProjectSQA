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

public class CSVFormat_validate_725288942137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64263;

    public CSVFormat_validate_725288942137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term64315 = new Character((char) 768);
        Character term64367 = new Character((char) 32815);
        Character term64419 = new Character((char) 32815);
        term64263 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term64263, term64263.getClass(), "quoteChar", term64315);
        setCharField(term64263, term64263.getClass(), "delimiter", (char) 32471);
        setField(term64263, term64263.getClass(), "escape", term64367);
        setField(term64263, term64263.getClass(), "commentStart", term64419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term64263, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


