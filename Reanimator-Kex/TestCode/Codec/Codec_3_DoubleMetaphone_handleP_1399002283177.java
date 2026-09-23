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

public class DoubleMetaphone_handleP_1399002283177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165914;

    public DoubleMetaphone_handleP_1399002283177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165914 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = " ";
        args[1] = null;
        args[2] = -1;
        try {
            callMethod(klass, "handleP", argTypes, term165914, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


