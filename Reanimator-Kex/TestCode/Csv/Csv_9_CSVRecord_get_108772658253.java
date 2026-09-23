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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CSVRecord_get_108772658253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10120;
     Object enum3;

    public CSVRecord_get_108772658253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10168 = new HashMap();
        term10120 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term10120, term10120.getClass(), "mapping", term10168);
        Class<? extends Object> term10777 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term10776 = ((Class) term10777).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term10776).setAccessible(true);
        enum3 = ((Field) term10776).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum3;
        try {
            callMethod(klass, "get", argTypes, term10120, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


