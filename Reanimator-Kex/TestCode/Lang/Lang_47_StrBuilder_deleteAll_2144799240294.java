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

public class StrBuilder_deleteAll_2144799240294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10116;
     Object term86069;
     Object term85887;

    public StrBuilder_deleteAll_2144799240294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10116 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10117 = (char[]) newCharArray(32);
        setField(term10116, term10116.getClass(), "buffer", term10117);
        setIntField(term10116, term10116.getClass(), "size", 1555897383);
        setField(term10116, term10116.getClass(), "newLine", "lFRJFUMVbx");
        setField(term10116, term10116.getClass(), "nullText", "sZdUNdggUW");
        term86069 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term86070 = (char[]) newCharArray(32);
        setField(term86069, term86069.getClass(), "buffer", term86070);
        setIntField(term86069, term86069.getClass(), "size", 1555897383);
        setField(term86069, term86069.getClass(), "newLine", "lFRJFUMVbx");
        setField(term86069, term86069.getClass(), "nullText", "sZdUNdggUW");
        term85887 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term85888 = (char[]) newCharArray(32);
        setField(term85887, term85887.getClass(), "buffer", term85888);
        setIntField(term85887, term85887.getClass(), "size", 1555897383);
        setField(term85887, term85887.getClass(), "newLine", "lFRJFUMVbx");
        setField(term85887, term85887.getClass(), "nullText", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "deleteAll", argTypes, term10116, args);
        assertTrue(recursiveEquals(term10116, term86069));
        assertTrue(recursiveEquals(retValue, term85887));
    }

};


