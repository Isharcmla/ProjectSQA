package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UTF8JsonGenerator_handleLongCustomEscape_1148723838134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614;
     Object term616;
     Object term618;
     Object term620;
     Object term621;

    public UTF8JsonGenerator_handleLongCustomEscape_1148723838134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614 = (byte[]) newByteArray(1);
        setByteElement(term614, 0, (byte) 106);
        term616 = new Integer(-817164822);
        term618 = new Integer(-1016503459);
        term620 = (byte[]) newByteArray(0);
        term621 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term614;
        args[1] = term616;
        args[2] = term618;
        args[3] = term620;
        args[4] = term621;
        try {
            callMethod(klass, "_handleLongCustomEscape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


