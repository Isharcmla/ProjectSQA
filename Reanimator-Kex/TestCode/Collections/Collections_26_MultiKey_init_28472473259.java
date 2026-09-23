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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_28472473259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10660;
     Object term10698;
     Object term10395;
     Object term10736;
     Object term12845;
     Object term12851;
     Object term12852;
     Object term12853;
     Object term12854;

    public MultiKey_init_28472473259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10556 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term10556, term10556.getClass(), "keys", null);
        term10660 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term10698 = newInstance(Class.forName("java.lang.Object"));
        term10395 = (Object[]) newArray("java.lang.Object", 0);
        term10736 = newInstance(Class.forName("java.lang.Object"));
        term12845 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term12846 = (Object[]) newArray("java.lang.Object", 5);
        Object term12847 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object term12848 = newInstance(Class.forName("java.lang.Object"));
        Object[] term12849 = (Object[]) newArray("java.lang.Object", 0);
        Object term12850 = newInstance(Class.forName("java.lang.Object"));
        setField(term12847, term12847.getClass(), "keys", null);
        setElement(term12846, 0, term12847);
        setElement(term12846, 1, term12848);
        setElement(term12846, 2, term12849);
        setElement(term12846, 3, term12850);
        setField(term12845, term12845.getClass(), "keys", term12846);
        term12851 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term12851, term12851.getClass(), "keys", null);
        term12852 = newInstance(Class.forName("java.lang.Object"));
        term12853 = (Object[]) newArray("java.lang.Object", 0);
        term12854 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = term10660;
        args[1] = term10698;
        args[2] = term10395;
        args[3] = term10736;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12845));
        assertTrue(recursiveEquals(term10660, term12851));
        assertTrue(recursiveEquals(term10698, term12852));
        assertTrue(recursiveEquals(term10395, term12853));
        assertTrue(recursiveEquals(term10736, term12854));
    }

};


