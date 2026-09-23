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
import java.lang.Integer;

public class StrBuilder_appendSeparator_1444915921255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7374;
     Object term7445;
     Object term75832;

    public StrBuilder_appendSeparator_1444915921255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7375 = (char[]) newCharArray(32);
        setField(term7374, term7374.getClass(), "buffer", term7375);
        setIntField(term7374, term7374.getClass(), "size", -1034506028);
        setField(term7374, term7374.getClass(), "newLine", "LWyEaeIyAo");
        setField(term7374, term7374.getClass(), "nullText", "yVMkkQhvmN");
        term7445 = new Integer(-1263114719);
        term75832 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term75833 = (char[]) newCharArray(32);
        setField(term75832, term75832.getClass(), "buffer", term75833);
        setIntField(term75832, term75832.getClass(), "size", -1034506028);
        setField(term75832, term75832.getClass(), "newLine", "LWyEaeIyAo");
        setField(term75832, term75832.getClass(), "nullText", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "mvrkADEgpp";
        args[1] = term7445;
        callMethod(klass, "appendSeparator", argTypes, term7374, args);
        assertTrue(recursiveEquals(term7374, term75832));
        assertTrue(recursiveEquals(term7445, -1263114719));
    }

};


