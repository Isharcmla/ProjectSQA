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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StrBuilder_appendWithSeparators_174823995187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4534;
     Object term4593;

    public StrBuilder_appendWithSeparators_174823995187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4534 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4535 = (char[]) newCharArray(32);
        setField(term4534, term4534.getClass(), "buffer", term4535);
        setIntField(term4534, term4534.getClass(), "size", 1596070772);
        setField(term4534, term4534.getClass(), "newLine", "bWWfajKbEX");
        setField(term4534, term4534.getClass(), "nullText", "cAPeiZHKGJ");
        term4593 = (Object[]) newArray("java.lang.Object", 1);
        Object term4594 = newInstance(Class.forName("java.lang.Object"));
        setElement(term4593, 0, term4594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4593;
        args[1] = "LvJFtLBaxj";
        try {
            callMethod(klass, "appendWithSeparators", argTypes, term4534, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


