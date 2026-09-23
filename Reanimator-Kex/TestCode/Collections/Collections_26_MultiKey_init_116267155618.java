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

public class MultiKey_init_116267155618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term245;
     Object term256;

    public MultiKey_init_116267155618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = (Object[]) newArray("java.lang.Object", 9);
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term17 = newInstance(Class.forName("java.lang.Object"));
        Object term18 = newInstance(Class.forName("java.lang.Object"));
        Object term19 = newInstance(Class.forName("java.lang.Object"));
        Object term20 = newInstance(Class.forName("java.lang.Object"));
        Object term21 = newInstance(Class.forName("java.lang.Object"));
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        Object term23 = newInstance(Class.forName("java.lang.Object"));
        Object term24 = newInstance(Class.forName("java.lang.Object"));
        setElement(term15, 0, term16);
        setElement(term15, 1, term17);
        setElement(term15, 2, term18);
        setElement(term15, 3, term19);
        setElement(term15, 4, term20);
        setElement(term15, 5, term21);
        setElement(term15, 6, term22);
        setElement(term15, 7, term23);
        setElement(term15, 8, term24);
        term245 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term246 = (Object[]) newArray("java.lang.Object", 9);
        Object term247 = newInstance(Class.forName("java.lang.Object"));
        Object term248 = newInstance(Class.forName("java.lang.Object"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        Object term250 = newInstance(Class.forName("java.lang.Object"));
        Object term251 = newInstance(Class.forName("java.lang.Object"));
        Object term252 = newInstance(Class.forName("java.lang.Object"));
        Object term253 = newInstance(Class.forName("java.lang.Object"));
        Object term254 = newInstance(Class.forName("java.lang.Object"));
        Object term255 = newInstance(Class.forName("java.lang.Object"));
        setElement(term246, 0, term247);
        setElement(term246, 1, term248);
        setElement(term246, 2, term249);
        setElement(term246, 3, term250);
        setElement(term246, 4, term251);
        setElement(term246, 5, term252);
        setElement(term246, 6, term253);
        setElement(term246, 7, term254);
        setElement(term246, 8, term255);
        setField(term245, term245.getClass(), "keys", term246);
        term256 = (Object[]) newArray("java.lang.Object", 9);
        Object term257 = newInstance(Class.forName("java.lang.Object"));
        Object term258 = newInstance(Class.forName("java.lang.Object"));
        Object term259 = newInstance(Class.forName("java.lang.Object"));
        Object term260 = newInstance(Class.forName("java.lang.Object"));
        Object term261 = newInstance(Class.forName("java.lang.Object"));
        Object term262 = newInstance(Class.forName("java.lang.Object"));
        Object term263 = newInstance(Class.forName("java.lang.Object"));
        Object term264 = newInstance(Class.forName("java.lang.Object"));
        Object term265 = newInstance(Class.forName("java.lang.Object"));
        setElement(term256, 0, term257);
        setElement(term256, 1, term258);
        setElement(term256, 2, term259);
        setElement(term256, 3, term260);
        setElement(term256, 4, term261);
        setElement(term256, 5, term262);
        setElement(term256, 6, term263);
        setElement(term256, 7, term264);
        setElement(term256, 8, term265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term245));
        assertTrue(recursiveEquals(term15, term256));
    }

};


