package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class MultiKey_init_135784501218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term26;
     Object term250;
     Object term256;

    public MultiKey_init_135784501218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = (Object[]) newArray("java.lang.Object", 4);
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        Object term23 = newInstance(Class.forName("java.lang.Object"));
        Object term24 = newInstance(Class.forName("java.lang.Object"));
        Object term25 = newInstance(Class.forName("java.lang.Object"));
        setElement(term21, 0, term22);
        setElement(term21, 1, term23);
        setElement(term21, 2, term24);
        setElement(term21, 3, term25);
        term26 = new Boolean(false);
        term250 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term251 = (Object[]) newArray("java.lang.Object", 4);
        Object term252 = newInstance(Class.forName("java.lang.Object"));
        Object term253 = newInstance(Class.forName("java.lang.Object"));
        Object term254 = newInstance(Class.forName("java.lang.Object"));
        Object term255 = newInstance(Class.forName("java.lang.Object"));
        setElement(term251, 0, term252);
        setElement(term251, 1, term253);
        setElement(term251, 2, term254);
        setElement(term251, 3, term255);
        setField(term250, term250.getClass(), "keys", term251);
        term256 = (Object[]) newArray("java.lang.Object", 4);
        Object term257 = newInstance(Class.forName("java.lang.Object"));
        Object term258 = newInstance(Class.forName("java.lang.Object"));
        Object term259 = newInstance(Class.forName("java.lang.Object"));
        Object term260 = newInstance(Class.forName("java.lang.Object"));
        setElement(term256, 0, term257);
        setElement(term256, 1, term258);
        setElement(term256, 2, term259);
        setElement(term256, 3, term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term21;
        args[1] = term26;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term250));
        assertTrue(recursiveEquals(term21, term256));
        assertTrue(recursiveEquals(term26, false));
    }

};


