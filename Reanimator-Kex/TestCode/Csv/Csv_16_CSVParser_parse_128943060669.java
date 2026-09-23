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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;

public class CSVParser_parse_128943060669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237038;
     Object term237117;

    public CSVParser_parse_128943060669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237038 = Mockito.mock(Class.forName("java.nio.file.Path"));
        term237117 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = term237038;
        args[1] = null;
        args[2] = term237117;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


