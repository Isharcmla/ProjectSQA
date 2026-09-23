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
import java.lang.Boolean;

public class StrBuilder_appendln_44704803228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5948;
     Object term6007;

    public StrBuilder_appendln_44704803228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5948 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5949 = (char[]) newCharArray(32);
        setField(term5948, term5948.getClass(), "buffer", term5949);
        setIntField(term5948, term5948.getClass(), "size", 1655935355);
        setField(term5948, term5948.getClass(), "newLine", "fztQhjqwdP");
        setField(term5948, term5948.getClass(), "nullText", "eVpkWxjuki");
        term6007 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6007;
        try {
            callMethod(klass, "appendln", argTypes, term5948, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


