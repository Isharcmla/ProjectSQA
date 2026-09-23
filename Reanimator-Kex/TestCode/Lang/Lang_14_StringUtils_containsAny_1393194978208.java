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

public class StringUtils_containsAny_1393194978208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term7741;

    public StringUtils_containsAny_1393194978208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568 = (char[]) newCharArray(4);
        setCharElement(term568, 0, 'B');
        setCharElement(term568, 1, 't');
        setCharElement(term568, 2, 'n');
        setCharElement(term568, 3, 'Z');
        term7741 = (char[]) newCharArray(4);
        setCharElement(term7741, 0, 'B');
        setCharElement(term7741, 1, 't');
        setCharElement(term7741, 2, 'n');
        setCharElement(term7741, 3, 'Z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term568;
        Object retValue = callMethod(klass, "containsAny", argTypes, null, args);
        assertTrue(recursiveEquals(term568, term7741));
        assertTrue(recursiveEquals(retValue, false));
    }

};


