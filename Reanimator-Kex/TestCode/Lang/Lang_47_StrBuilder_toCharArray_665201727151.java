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

public class StrBuilder_toCharArray_665201727151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1857;
     Object term1916;
     Object term1918;

    public StrBuilder_toCharArray_665201727151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1857 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1858 = (char[]) newCharArray(32);
        setField(term1857, term1857.getClass(), "buffer", term1858);
        setIntField(term1857, term1857.getClass(), "size", -2068769794);
        setField(term1857, term1857.getClass(), "newLine", "Ghbwtircqb");
        setField(term1857, term1857.getClass(), "nullText", "xrwlQZdwCp");
        term1916 = new Integer(-117576464);
        term1918 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1916;
        args[1] = term1918;
        try {
            callMethod(klass, "toCharArray", argTypes, term1857, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


