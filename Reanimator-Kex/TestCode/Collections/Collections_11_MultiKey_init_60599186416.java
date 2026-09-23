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

public class MultiKey_init_60599186416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term11;
     Object term12;
     Object term13;
     Object term14;
     Object term184;
     Object term191;
     Object term192;
     Object term193;
     Object term194;
     Object term195;

    public MultiKey_init_60599186416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("java.lang.Object"));
        term11 = newInstance(Class.forName("java.lang.Object"));
        term12 = newInstance(Class.forName("java.lang.Object"));
        term13 = newInstance(Class.forName("java.lang.Object"));
        term14 = newInstance(Class.forName("java.lang.Object"));
        term184 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term185 = (Object[]) newArray("java.lang.Object", 5);
        Object term186 = newInstance(Class.forName("java.lang.Object"));
        Object term187 = newInstance(Class.forName("java.lang.Object"));
        Object term188 = newInstance(Class.forName("java.lang.Object"));
        Object term189 = newInstance(Class.forName("java.lang.Object"));
        Object term190 = newInstance(Class.forName("java.lang.Object"));
        setElement(term185, 0, term186);
        setElement(term185, 1, term187);
        setElement(term185, 2, term188);
        setElement(term185, 3, term189);
        setElement(term185, 4, term190);
        setField(term184, term184.getClass(), "keys", term185);
        term191 = newInstance(Class.forName("java.lang.Object"));
        term192 = newInstance(Class.forName("java.lang.Object"));
        term193 = newInstance(Class.forName("java.lang.Object"));
        term194 = newInstance(Class.forName("java.lang.Object"));
        term195 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = term10;
        args[1] = term11;
        args[2] = term12;
        args[3] = term13;
        args[4] = term14;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term184));
        assertTrue(recursiveEquals(term10, term191));
        assertTrue(recursiveEquals(term11, term192));
        assertTrue(recursiveEquals(term12, term193));
        assertTrue(recursiveEquals(term13, term194));
        assertTrue(recursiveEquals(term14, term195));
    }

};


