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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class StrBuilder_insert_185816135286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9277;
     Object term9336;
     Object term9338;

    public StrBuilder_insert_185816135286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9277 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9278 = (char[]) newCharArray(32);
        setField(term9277, term9277.getClass(), "buffer", term9278);
        setIntField(term9277, term9277.getClass(), "size", -343325701);
        setField(term9277, term9277.getClass(), "newLine", "xtftXXMbem");
        setField(term9277, term9277.getClass(), "nullText", "cudZvLMQon");
        term9336 = new Integer(107945604);
        term9338 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term9336;
        args[1] = term9338;
        try {
            callMethod(klass, "insert", argTypes, term9277, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


