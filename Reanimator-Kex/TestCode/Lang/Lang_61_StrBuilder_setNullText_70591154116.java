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

public class StrBuilder_setNullText_70591154116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term34148;
     Object term34077;

    public StrBuilder_setNullText_70591154116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term381 = (char[]) newCharArray(32);
        setField(term380, term380.getClass(), "buffer", term381);
        setIntField(term380, term380.getClass(), "size", -1922583790);
        setField(term380, term380.getClass(), "newLine", "hRNSzYYIrc");
        setField(term380, term380.getClass(), "nullText", "RMFIsYGgne");
        term34148 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term34149 = (char[]) newCharArray(32);
        setField(term34148, term34148.getClass(), "buffer", term34149);
        setIntField(term34148, term34148.getClass(), "size", -1922583790);
        setField(term34148, term34148.getClass(), "newLine", "hRNSzYYIrc");
        setField(term34148, term34148.getClass(), "nullText", "NRdvgJlhkX");
        term34077 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term34078 = (char[]) newCharArray(32);
        setField(term34077, term34077.getClass(), "buffer", term34078);
        setIntField(term34077, term34077.getClass(), "size", -1922583790);
        setField(term34077, term34077.getClass(), "newLine", "hRNSzYYIrc");
        setField(term34077, term34077.getClass(), "nullText", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "setNullText", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term34148));
        assertTrue(recursiveEquals(retValue, term34077));
    }

};


