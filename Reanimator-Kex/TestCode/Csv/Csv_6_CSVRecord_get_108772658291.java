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

public class CSVRecord_get_108772658291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24343;
     Object enum25;

    public CSVRecord_get_108772658291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term24213 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term24391 = new HashMap();
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)null, (Object)null);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)null, (Object)null);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        ((HashMap) term24391).put((Object)term24213, (Object)term24213);
        term24343 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term24343, term24343.getClass(), "mapping", term24391);
        Class<? extends Object> term25311 = Class.forName((String) "java.lang.module.ModuleDescriptor$Requires$Modifier");
        Field term25310 = ((Class) term25311).getDeclaredField((String) "TRANSITIVE");
        ((Field) term25310).setAccessible(true);
        enum25 = ((Field) term25310).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum25;
        try {
            callMethod(klass, "get", argTypes, term24343, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


