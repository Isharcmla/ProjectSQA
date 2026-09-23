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

public class StrBuilder_trim_1228498113407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281465;
     Object term281552;
     Object term281519;

    public StrBuilder_trim_1228498113407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281465 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term281258 = (char[]) newCharArray(15);
        setIntField(term281465, term281465.getClass(), "size", 15);
        setCharElement(term281258, 13, (char) 48);
        setField(term281465, term281465.getClass(), "buffer", term281258);
        term281552 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term281553 = (char[]) newCharArray(15);
        setCharElement(term281553, 0, (char) 48);
        setCharElement(term281553, 13, (char) 48);
        setField(term281552, term281552.getClass(), "buffer", term281553);
        setIntField(term281552, term281552.getClass(), "size", 1);
        setField(term281552, term281552.getClass(), "newLine", null);
        setField(term281552, term281552.getClass(), "nullText", null);
        term281519 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term281520 = (char[]) newCharArray(15);
        setCharElement(term281520, 0, (char) 48);
        setCharElement(term281520, 13, (char) 48);
        setField(term281519, term281519.getClass(), "buffer", term281520);
        setIntField(term281519, term281519.getClass(), "size", 1);
        setField(term281519, term281519.getClass(), "newLine", null);
        setField(term281519, term281519.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term281465, args);
        assertTrue(recursiveEquals(term281465, term281552));
        assertTrue(recursiveEquals(retValue, term281519));
    }

};


