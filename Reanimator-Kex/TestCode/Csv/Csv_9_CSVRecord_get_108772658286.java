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

public class CSVRecord_get_108772658286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21108;
     Object enum18;

    public CSVRecord_get_108772658286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21156 = new HashMap();
        term21108 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term21108, term21108.getClass(), "mapping", term21156);
        Class<? extends Object> term21795 = Class.forName((String) "java.nio.file.attribute.AclEntryPermission");
        Field term21794 = ((Class) term21795).getDeclaredField((String) "READ_DATA");
        ((Field) term21794).setAccessible(true);
        enum18 = ((Field) term21794).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum18;
        try {
            callMethod(klass, "get", argTypes, term21108, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


