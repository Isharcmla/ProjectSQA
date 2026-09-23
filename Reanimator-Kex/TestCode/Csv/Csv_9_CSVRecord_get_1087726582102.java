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

public class CSVRecord_get_1087726582102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28333;
     Object enum30;

    public CSVRecord_get_1087726582102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term28203 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term28381 = new HashMap();
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)null, (Object)null);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)null, (Object)null);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        ((HashMap) term28381).put((Object)term28203, (Object)term28203);
        term28333 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term28333, term28333.getClass(), "mapping", term28381);
        Class<? extends Object> term29070 = Class.forName((String) "java.lang.Thread$State");
        Field term29069 = ((Class) term29070).getDeclaredField((String) "NEW");
        ((Field) term29069).setAccessible(true);
        enum30 = ((Field) term29069).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum30;
        try {
            callMethod(klass, "get", argTypes, term28333, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


