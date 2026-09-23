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

public class StrBuilder_replace_1488202704234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7659;
     Object term7718;
     Object term7720;

    public StrBuilder_replace_1488202704234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7659 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7660 = (char[]) newCharArray(32);
        setField(term7659, term7659.getClass(), "buffer", term7660);
        setIntField(term7659, term7659.getClass(), "size", -893623680);
        setField(term7659, term7659.getClass(), "newLine", "pXOkjyeIRb");
        setField(term7659, term7659.getClass(), "nullText", "GgZWSjxjyE");
        term7718 = new Integer(-1963434938);
        term7720 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term7718;
        args[1] = term7720;
        args[2] = "EeBVbzjcCI";
        try {
            callMethod(klass, "replace", argTypes, term7659, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


