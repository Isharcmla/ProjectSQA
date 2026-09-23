package org.apache.commons.lang3.builder;

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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ToStringStyle_appendSummary_1193420759161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;
     Object term3799;

    public ToStringStyle_appendSummary_1193420759161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3768 = (byte[]) newByteArray(16);
        setField(term3755, term3755.getClass(), "toStringCache", "jSpAteRute");
        setField(term3755, term3755.getClass(), "value", term3768);
        setByteField(term3755, term3755.getClass(), "coder", (byte) 100);
        setIntField(term3755, term3755.getClass(), "count", -1588772968);
        term3799 = (char[]) newCharArray(5);
        setCharElement(term3799, 0, 's');
        setCharElement(term3799, 1, 'j');
        setCharElement(term3799, 2, 'l');
        setCharElement(term3799, 3, 'J');
        setCharElement(term3799, 4, 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3755;
        args[1] = "swZVeJAxjt";
        args[2] = term3799;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


