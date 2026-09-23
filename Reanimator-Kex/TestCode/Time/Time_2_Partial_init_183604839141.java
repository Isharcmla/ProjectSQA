package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_init_183604839141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term217;
     Object term8219;
     Object term8222;
     Object term8223;

    public Partial_init_183604839141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        term217 = (int[]) newIntArray(6);
        setIntElement(term217, 0, -1456670397);
        setIntElement(term217, 1, 1622346318);
        setIntElement(term217, 2, 1048535127);
        setIntElement(term217, 3, -655067527);
        setIntElement(term217, 4, -6029667);
        setIntElement(term217, 5, -2068769794);
        term8219 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term8220 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        int[] term8221 = (int[]) newIntArray(6);
        setField(term8219, term8219.getClass(), "iChronology", null);
        setField(term8219, term8219.getClass(), "iTypes", term8220);
        setIntElement(term8221, 0, -1456670397);
        setIntElement(term8221, 1, 1622346318);
        setIntElement(term8221, 2, 1048535127);
        setIntElement(term8221, 3, -655067527);
        setIntElement(term8221, 4, -6029667);
        setIntElement(term8221, 5, -2068769794);
        setField(term8219, term8219.getClass(), "iValues", term8221);
        setField(term8219, term8219.getClass(), "iFormatter", null);
        term8222 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        term8223 = (int[]) newIntArray(6);
        setIntElement(term8223, 0, -1456670397);
        setIntElement(term8223, 1, 1622346318);
        setIntElement(term8223, 2, 1048535127);
        setIntElement(term8223, 3, -655067527);
        setIntElement(term8223, 4, -6029667);
        setIntElement(term8223, 5, -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.DateTimeFieldType"), 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term216;
        args[2] = term217;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8219));
        assertTrue(recursiveEquals(term216, term8222));
        assertTrue(recursiveEquals(term217, term8223));
    }

};


