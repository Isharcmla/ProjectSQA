package org.apache.commons.collections4.keyvalue;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MultiKey_getKey_168971905321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;
     Object term46;

    public MultiKey_getKey_168971905321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term41 = (Object[]) newArray("java.lang.Object", 4);
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        Object term45 = newInstance(Class.forName("java.lang.Object"));
        setElement(term41, 0, term42);
        setElement(term41, 1, term43);
        setElement(term41, 2, term44);
        setElement(term41, 3, term45);
        setField(term40, term40.getClass(), "keys", term41);
        term46 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46;
        try {
            callMethod(klass, "getKey", argTypes, term40, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


