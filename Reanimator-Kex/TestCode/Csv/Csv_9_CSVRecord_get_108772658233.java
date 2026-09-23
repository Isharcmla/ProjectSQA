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
import java.lang.String;
import java.lang.Object;

public class CSVRecord_get_108772658233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5974;
     Object enum1;

    public CSVRecord_get_108772658233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5974 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Class<? extends Object> term6681 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term6680 = ((Class) term6681).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term6680).setAccessible(true);
        enum1 = ((Field) term6680).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum1;
        try {
            callMethod(klass, "get", argTypes, term5974, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


