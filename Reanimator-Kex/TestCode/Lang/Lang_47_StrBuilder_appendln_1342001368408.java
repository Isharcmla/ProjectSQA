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
import java.lang.StringBuffer;

public class StrBuilder_appendln_1342001368408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79961;
     Object term80019;

    public StrBuilder_appendln_1342001368408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79961 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term79860 = (char[]) newCharArray(1);
        term80019 = new StringBuffer();
        ((StringBuffer) term80019).append(term79860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term80019;
        try {
            callMethod(klass, "appendln", argTypes, term79961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


