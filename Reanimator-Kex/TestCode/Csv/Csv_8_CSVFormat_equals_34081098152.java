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
import static org.apache.commons.csv.EqualityUtils.*;

public class CSVFormat_equals_34081098152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71569;
     Object term71679;
     Object term72054;
     Object term72055;

    public CSVFormat_equals_34081098152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71569 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term71679 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$AsVarargsCollector"));
        term72054 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term72054, term72054.getClass(), "delimiter", (char) 0);
        setField(term72054, term72054.getClass(), "quoteChar", null);
        setField(term72054, term72054.getClass(), "quotePolicy", null);
        setField(term72054, term72054.getClass(), "commentStart", null);
        setField(term72054, term72054.getClass(), "escape", null);
        setBooleanField(term72054, term72054.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term72054, term72054.getClass(), "ignoreEmptyLines", false);
        setField(term72054, term72054.getClass(), "recordSeparator", null);
        setField(term72054, term72054.getClass(), "nullString", null);
        setField(term72054, term72054.getClass(), "header", null);
        setBooleanField(term72054, term72054.getClass(), "skipHeaderRecord", false);
        term72055 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$AsVarargsCollector"));
        setField(term72055, term72055.getClass(), "target", null);
        setField(term72055, term72055.getClass(), "arrayType", null);
        setField(term72055, term72055.getClass(), "asCollectorCache", null);
        setField(term72055, term72055.getClass(), "type", null);
        setField(term72055, term72055.getClass(), "form", null);
        setField(term72055, term72055.getClass(), "asTypeCache", null);
        setByteField(term72055, term72055.getClass(), "customizationCount", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71679;
        Object retValue = callMethod(klass, "equals", argTypes, term71569, args);
        assertTrue(recursiveEquals(term71569, term72054));
        assertTrue(recursiveEquals(term71679, term72055));
        assertTrue(recursiveEquals(retValue, false));
    }

};


