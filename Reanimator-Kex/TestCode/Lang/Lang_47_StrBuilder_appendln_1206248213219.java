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

public class StrBuilder_appendln_1206248213219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5480;
     Object term5539;
     Object term5598;
     Object term5600;

    public StrBuilder_appendln_1206248213219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5480 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5481 = (char[]) newCharArray(32);
        setField(term5480, term5480.getClass(), "buffer", term5481);
        setIntField(term5480, term5480.getClass(), "size", 1265463001);
        setField(term5480, term5480.getClass(), "newLine", "sEccwbJKYE");
        setField(term5480, term5480.getClass(), "nullText", "AWRooQKkdW");
        term5539 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5540 = (char[]) newCharArray(32);
        setField(term5539, term5539.getClass(), "buffer", term5540);
        setIntField(term5539, term5539.getClass(), "size", 335112684);
        setField(term5539, term5539.getClass(), "newLine", "vjxIhXHxGR");
        setField(term5539, term5539.getClass(), "nullText", "QXzGXbEXMu");
        term5598 = new Integer(1551099402);
        term5600 = new Integer(-2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5539;
        args[1] = term5598;
        args[2] = term5600;
        try {
            callMethod(klass, "appendln", argTypes, term5480, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


