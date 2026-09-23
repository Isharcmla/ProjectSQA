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

public class StrBuilder_setNullText_70591154355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51997;
     Object term103833;
     Object term103831;

    public StrBuilder_setNullText_70591154355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51997 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term103833 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term103833, term103833.getClass(), "buffer", null);
        setIntField(term103833, term103833.getClass(), "size", 0);
        setField(term103833, term103833.getClass(), "newLine", null);
        setField(term103833, term103833.getClass(), "nullText", null);
        term103831 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term103831, term103831.getClass(), "buffer", null);
        setIntField(term103831, term103831.getClass(), "size", 0);
        setField(term103831, term103831.getClass(), "newLine", null);
        setField(term103831, term103831.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setNullText", argTypes, term51997, args);
        assertTrue(recursiveEquals(term51997, term103833));
        assertTrue(recursiveEquals(retValue, term103831));
    }

};


