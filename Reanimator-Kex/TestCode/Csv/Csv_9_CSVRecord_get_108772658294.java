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
import java.lang.Object;
import java.lang.String;

public class CSVRecord_get_108772658294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24645;
     Object enum24;

    public CSVRecord_get_108772658294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term24515 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term24693 = new HashMap();
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)null, (Object)null);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)null, (Object)null);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        ((HashMap) term24693).put((Object)term24515, (Object)term24515);
        term24645 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term24645, term24645.getClass(), "mapping", term24693);
        Class<? extends Object> term25545 = Class.forName((String) "java.nio.file.attribute.AclEntryPermission");
        Field term25544 = ((Class) term25545).getDeclaredField((String) "READ_DATA");
        ((Field) term25544).setAccessible(true);
        enum24 = ((Field) term25544).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum24;
        try {
            callMethod(klass, "get", argTypes, term24645, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


