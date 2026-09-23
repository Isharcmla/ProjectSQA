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
import java.lang.Integer;

public class StrBuilder_ensureCapacity_89262521120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;
     Object term907;

    public StrBuilder_ensureCapacity_89262521120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term849 = (char[]) newCharArray(32);
        setField(term848, term848.getClass(), "buffer", term849);
        setIntField(term848, term848.getClass(), "size", -1339778481);
        setField(term848, term848.getClass(), "newLine", "tbcdzjIfER");
        setField(term848, term848.getClass(), "nullText", "HyxfbSQYBe");
        term907 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term907;
        try {
            callMethod(klass, "ensureCapacity", argTypes, term848, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


