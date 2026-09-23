package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuilder;

public class StringUtils_join_1313170632529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169809;
     Object term216006;

    public StringUtils_join_1313170632529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term170446 = new StringBuilder();
        term169809 = (Object[]) newArray("java.lang.Object", 512);
        setElement(term169809, 0, term170446);
        term216006 = (Object[]) newArray("java.lang.Object", 512);
        Object term216007 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term216008 = (byte[]) newByteArray(16);
        setField(term216007, term216007.getClass(), "value", term216008);
        setByteField(term216007, term216007.getClass(), "coder", (byte) 0);
        setIntField(term216007, term216007.getClass(), "count", 0);
        setElement(term216006, 0, term216007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term169809;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term169809, term216006));
        assertTrue(recursiveEquals(retValue, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "));
    }

};


