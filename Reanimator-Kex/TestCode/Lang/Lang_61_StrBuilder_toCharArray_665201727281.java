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

public class StrBuilder_toCharArray_665201727281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38308;
     Object term84891;
     Object term84890;

    public StrBuilder_toCharArray_665201727281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38308 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term84891 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term84891, term84891.getClass(), "buffer", null);
        setIntField(term84891, term84891.getClass(), "size", 0);
        setField(term84891, term84891.getClass(), "newLine", null);
        setField(term84891, term84891.getClass(), "nullText", null);
        term84890 = (char[]) newCharArray(0);
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
        Object retValue = callMethod(klass, "toCharArray", argTypes, term38308, args);
        assertTrue(recursiveEquals(term38308, term84891));
        assertTrue(recursiveEquals(retValue, term84890));
    }

};


