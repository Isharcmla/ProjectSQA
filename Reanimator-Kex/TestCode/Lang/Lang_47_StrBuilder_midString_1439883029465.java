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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_midString_1439883029465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230492;
     Object term250466;

    public StrBuilder_midString_1439883029465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230492 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term250466 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term250466, term250466.getClass(), "buffer", null);
        setIntField(term250466, term250466.getClass(), "size", 0);
        setField(term250466, term250466.getClass(), "newLine", null);
        setField(term250466, term250466.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        Object retValue = callMethod(klass, "midString", argTypes, term230492, args);
        assertTrue(recursiveEquals(term230492, term250466));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


