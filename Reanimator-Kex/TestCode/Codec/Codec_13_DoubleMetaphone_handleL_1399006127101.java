package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class DoubleMetaphone_handleL_1399006127101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71576;
     Object term71762;

    public DoubleMetaphone_handleL_1399006127101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71576 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term71436 = (char[]) newCharArray(0);
        StringBuilder term71822 = new StringBuilder();
        ((StringBuilder) term71822).append(term71436);
        term71762 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term71762, term71762.getClass(), "primary", term71822);
        setIntField(term71762, term71762.getClass(), "maxLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = term71762;
        args[2] = 1021;
        try {
            callMethod(klass, "handleL", argTypes, term71576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


