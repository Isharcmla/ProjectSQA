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

public class CSVRecord_get_1087726582107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31997;
     Object enum35;

    public CSVRecord_get_1087726582107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term31867 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term32045 = new HashMap();
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)null, (Object)null);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)null, (Object)null);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        ((HashMap) term32045).put((Object)term31867, (Object)term31867);
        term31997 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term31997, term31997.getClass(), "mapping", term32045);
        Class<? extends Object> term32904 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term32903 = ((Class) term32904).getDeclaredField((String) "CONCURRENT");
        ((Field) term32903).setAccessible(true);
        enum35 = ((Field) term32903).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum35;
        try {
            callMethod(klass, "get", argTypes, term31997, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


