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

public class StrBuilder_validateIndex_1669317897280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13071;
     Object term13130;

    public StrBuilder_validateIndex_1669317897280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13071 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13072 = (char[]) newCharArray(32);
        setField(term13071, term13071.getClass(), "buffer", term13072);
        setIntField(term13071, term13071.getClass(), "size", -506958186);
        setField(term13071, term13071.getClass(), "newLine", "SIODFGaQhr");
        setField(term13071, term13071.getClass(), "nullText", "qYzsiuXOgS");
        term13130 = new Integer(-507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13130;
        try {
            callMethod(klass, "validateIndex", argTypes, term13071, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


