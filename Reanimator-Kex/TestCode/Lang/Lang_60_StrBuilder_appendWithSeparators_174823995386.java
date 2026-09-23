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
import java.lang.Object;

public class StrBuilder_appendWithSeparators_174823995386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902797;
     Object term898084;

    public StrBuilder_appendWithSeparators_174823995386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term902797 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term902797, term902797.getClass(), "nullText", null);
        term898084 = (Object[]) newArray("java.lang.Object", 498);
        Object term902835 = newInstance(Class.forName("java.lang.Object"));
        setElement(term898084, 461, term902835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term898084;
        args[1] = null;
        try {
            callMethod(klass, "appendWithSeparators", argTypes, term902797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


