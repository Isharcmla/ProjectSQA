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

public class CSVRecord_get_108772658298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27181;
     Object enum28;

    public CSVRecord_get_108772658298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27229 = new HashMap();
        term27181 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term27181, term27181.getClass(), "mapping", term27229);
        Class<? extends Object> term27704 = Class.forName((String) "java.lang.Thread$State");
        Field term27703 = ((Class) term27704).getDeclaredField((String) "NEW");
        ((Field) term27703).setAccessible(true);
        enum28 = ((Field) term27703).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum28;
        try {
            callMethod(klass, "get", argTypes, term27181, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


