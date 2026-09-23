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

public class CSVRecord_get_108772658296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25931;
     Object enum26;

    public CSVRecord_get_108772658296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term25801 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term25979 = new HashMap();
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)null, (Object)null);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)null, (Object)null);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        ((HashMap) term25979).put((Object)term25801, (Object)term25801);
        term25931 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term25931, term25931.getClass(), "mapping", term25979);
        Class<? extends Object> term26836 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term26835 = ((Class) term26836).getDeclaredField((String) "CONCURRENT");
        ((Field) term26835).setAccessible(true);
        enum26 = ((Field) term26835).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum26;
        try {
            callMethod(klass, "get", argTypes, term25931, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


