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

public class CSVFormat_validate_725288942203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95899;

    public CSVFormat_validate_725288942203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term95951 = new Character((char) 256);
        Character term96003 = new Character((char) 16);
        Character term96055 = new Character((char) 0);
        term95899 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term95732 = (Object[]) newArray("java.lang.String", 2);
        setField(term95899, term95899.getClass(), "quoteChar", term95951);
        setCharField(term95899, term95899.getClass(), "delimiter", (char) 16127);
        setField(term95899, term95899.getClass(), "escape", term96003);
        setField(term95899, term95899.getClass(), "commentStart", term96055);
        setField(term95899, term95899.getClass(), "header", term95732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term95899, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


