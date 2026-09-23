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

public class StrBuilder_setNullText_70591154138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term36968;
     Object term36897;

    public StrBuilder_setNullText_70591154138() {
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
        term36968 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36969 = (char[]) newCharArray(32);
        setField(term36968, term36968.getClass(), "buffer", term36969);
        setIntField(term36968, term36968.getClass(), "size", -1922583790);
        setField(term36968, term36968.getClass(), "newLine", "hRNSzYYIrc");
        setField(term36968, term36968.getClass(), "nullText", "NRdvgJlhkX");
        term36897 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term36898 = (char[]) newCharArray(32);
        setField(term36897, term36897.getClass(), "buffer", term36898);
        setIntField(term36897, term36897.getClass(), "size", -1922583790);
        setField(term36897, term36897.getClass(), "newLine", "hRNSzYYIrc");
        setField(term36897, term36897.getClass(), "nullText", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "setNullText", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term36968));
        assertTrue(recursiveEquals(retValue, term36897));
    }

};


