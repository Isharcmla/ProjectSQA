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

public class MultiKey_getKeys_2795960019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term267;
     Object term261;

    public MultiKey_getKeys_2795960019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term29 = (Object[]) newArray("java.lang.Object", 3);
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term32 = newInstance(Class.forName("java.lang.Object"));
        setElement(term29, 0, term30);
        setElement(term29, 1, term31);
        setElement(term29, 2, term32);
        setField(term28, term28.getClass(), "keys", term29);
        term267 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term268 = (Object[]) newArray("java.lang.Object", 3);
        Object term269 = newInstance(Class.forName("java.lang.Object"));
        Object term270 = newInstance(Class.forName("java.lang.Object"));
        Object term271 = newInstance(Class.forName("java.lang.Object"));
        setElement(term268, 0, term269);
        setElement(term268, 1, term270);
        setElement(term268, 2, term271);
        setField(term267, term267.getClass(), "keys", term268);
        term261 = (Object[]) newArray("java.lang.Object", 3);
        Object term262 = newInstance(Class.forName("java.lang.Object"));
        Object term263 = newInstance(Class.forName("java.lang.Object"));
        Object term264 = newInstance(Class.forName("java.lang.Object"));
        setElement(term261, 0, term262);
        setElement(term261, 1, term263);
        setElement(term261, 2, term264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term28, args);
        assertTrue(recursiveEquals(term28, term267));
        assertTrue(recursiveEquals(retValue, term261));
    }

};


