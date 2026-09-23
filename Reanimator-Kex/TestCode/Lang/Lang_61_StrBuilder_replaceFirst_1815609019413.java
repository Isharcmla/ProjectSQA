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

public class StrBuilder_replaceFirst_1815609019413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284465;
     Object term284674;
     Object term284665;

    public StrBuilder_replaceFirst_1815609019413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284465 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term284319 = (char[]) newCharArray(4);
        setIntField(term284465, term284465.getClass(), "size", 4);
        setField(term284465, term284465.getClass(), "buffer", term284319);
        term284674 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term284675 = (char[]) newCharArray(4);
        setField(term284674, term284674.getClass(), "buffer", term284675);
        setIntField(term284674, term284674.getClass(), "size", 4);
        setField(term284674, term284674.getClass(), "newLine", null);
        setField(term284674, term284674.getClass(), "nullText", null);
        term284665 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term284666 = (char[]) newCharArray(4);
        setField(term284665, term284665.getClass(), "buffer", term284666);
        setIntField(term284665, term284665.getClass(), "size", 4);
        setField(term284665, term284665.getClass(), "newLine", null);
        setField(term284665, term284665.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term284465, args);
        assertTrue(recursiveEquals(term284465, term284674));
        assertTrue(recursiveEquals(retValue, term284665));
    }

};


