package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Integer;

public class StrBuilder_indexOf_1695911743261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10901;
     Object term10960;
     Object term79970;

    public StrBuilder_indexOf_1695911743261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10901 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10902 = (char[]) newCharArray(32);
        setField(term10901, term10901.getClass(), "buffer", term10902);
        setIntField(term10901, term10901.getClass(), "size", 1953277050);
        setField(term10901, term10901.getClass(), "newLine", "FwPbDZcHmB");
        setField(term10901, term10901.getClass(), "nullText", "hOncybyCAH");
        term10960 = new Integer(1283079251);
        term79970 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term79971 = (char[]) newCharArray(32);
        setField(term79970, term79970.getClass(), "buffer", term79971);
        setIntField(term79970, term79970.getClass(), "size", 1953277050);
        setField(term79970, term79970.getClass(), "newLine", "FwPbDZcHmB");
        setField(term79970, term79970.getClass(), "nullText", "hOncybyCAH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10960;
        Object retValue = callMethod(klass, "indexOf", argTypes, term10901, args);
        assertTrue(recursiveEquals(term10901, term79970));
        assertTrue(recursiveEquals(term10960, 1283079251));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


