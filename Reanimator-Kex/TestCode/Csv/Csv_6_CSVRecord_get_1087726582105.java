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

public class CSVRecord_get_1087726582105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30686;
     Object enum33;

    public CSVRecord_get_1087726582105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term30556 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term30734 = new HashMap();
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)null, (Object)null);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)null, (Object)null);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        ((HashMap) term30734).put((Object)term30556, (Object)term30556);
        term30686 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term30686, term30686.getClass(), "mapping", term30734);
        Class<? extends Object> term31585 = Class.forName((String) "java.nio.file.FileTreeWalker$EventType");
        Field term31584 = ((Class) term31585).getDeclaredField((String) "START_DIRECTORY");
        ((Field) term31584).setAccessible(true);
        enum33 = ((Field) term31584).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum33;
        try {
            callMethod(klass, "get", argTypes, term30686, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


