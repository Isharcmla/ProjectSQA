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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_indexOf_1754157147258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10655;
     Object term10726;

    public StrBuilder_indexOf_1754157147258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10655 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10656 = (char[]) newCharArray(32);
        setField(term10655, term10655.getClass(), "buffer", term10656);
        setIntField(term10655, term10655.getClass(), "size", 1830648570);
        setField(term10655, term10655.getClass(), "newLine", "BjugTaMcxJ");
        setField(term10655, term10655.getClass(), "nullText", "vGiuZVPJNH");
        term10726 = new Integer(-227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "tlzpzIjMib";
        args[1] = term10726;
        try {
            callMethod(klass, "indexOf", argTypes, term10655, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


