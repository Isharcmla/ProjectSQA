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

public class CSVFormat_validate_725288942215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110071;

    public CSVFormat_validate_725288942215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term110123 = new Character((char) 0);
        Character term110175 = new Character((char) 48762);
        term110071 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term110071, term110071.getClass(), "quoteChar", term110123);
        setCharField(term110071, term110071.getClass(), "delimiter", (char) 48762);
        setField(term110071, term110071.getClass(), "escape", term110175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term110071, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


