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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class DefaultKeyedValues_setValue_202456894189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16903;
     Object enum5;

    public DefaultKeyedValues_setValue_202456894189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16951 = new HashMap();
        term16903 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term16903, term16903.getClass(), "indexMap", term16951);
        Class<? extends Object> term17857 = Class.forName((String) "java.lang.StackWalker$ExtendedOption");
        Field term17856 = ((Class) term17857).getDeclaredField((String) "LOCALS_AND_OPERANDS");
        ((Field) term17856).setAccessible(true);
        enum5 = ((Field) term17856).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = enum5;
        args[1] = null;
        try {
            callMethod(klass, "setValue", argTypes, term16903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


