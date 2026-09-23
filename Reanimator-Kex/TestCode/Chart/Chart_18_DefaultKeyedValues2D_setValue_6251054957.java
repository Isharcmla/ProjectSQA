package org.jfree.data;

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
import java.lang.NullPointerException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DefaultKeyedValues2D_setValue_6251054957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6181;
     Object enum3;

    public DefaultKeyedValues2D_setValue_6251054957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6181 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        Class<? extends Object> term7723 = Class.forName((String) "java.nio.file.attribute.AclEntryPermission");
        Field term7722 = ((Class) term7723).getDeclaredField((String) "READ_DATA");
        ((Field) term7722).setAccessible(true);
        enum3 = ((Field) term7722).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum3;
        args[2] = null;
        try {
            callMethod(klass, "setValue", argTypes, term6181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


