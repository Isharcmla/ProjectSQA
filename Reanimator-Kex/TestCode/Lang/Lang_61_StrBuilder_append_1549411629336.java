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
import java.lang.NullPointerException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_append_1549411629336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63835;
     Object term63919;

    public StrBuilder_append_1549411629336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63835 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term62816 = (char[]) newCharArray(912);
        setIntField(term63835, term63835.getClass(), "size", -1023411076);
        setField(term63835, term63835.getClass(), "buffer", term62816);
        term63919 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term63919, term63919.getClass(), "size", 1006634004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term63919;
        try {
            callMethod(klass, "append", argTypes, term63835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


