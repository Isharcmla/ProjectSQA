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

public class CSVRecord_get_108772658293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25813;
     Object enum27;

    public CSVRecord_get_108772658293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term25683 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term25861 = new HashMap();
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)null, (Object)null);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)null, (Object)null);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        ((HashMap) term25861).put((Object)term25683, (Object)term25683);
        term25813 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term25813, term25813.getClass(), "mapping", term25861);
        Class<? extends Object> term26643 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term26642 = ((Class) term26643).getDeclaredField((String) "INVALID");
        ((Field) term26642).setAccessible(true);
        enum27 = ((Field) term26642).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum27;
        try {
            callMethod(klass, "get", argTypes, term25813, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


