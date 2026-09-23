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

public class StrBuilder_append_957951608302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50666;
     Object term50550;
     Object term92807;
     Object term92809;
     Object term92766;

    public StrBuilder_append_957951608302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50666 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term50555 = (char[]) newCharArray(0);
        setIntField(term50666, term50666.getClass(), "size", 0);
        setField(term50666, term50666.getClass(), "buffer", term50555);
        term50550 = (byte[]) newByteArray(0);
        term92807 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term92808 = (char[]) newCharArray(10);
        setCharElement(term92808, 0, (char) 91);
        setCharElement(term92808, 1, 'B');
        setCharElement(term92808, 2, (char) 64);
        setCharElement(term92808, 3, (char) 53);
        setCharElement(term92808, 4, 'd');
        setCharElement(term92808, 5, (char) 48);
        setCharElement(term92808, 6, (char) 56);
        setCharElement(term92808, 7, (char) 51);
        setCharElement(term92808, 8, (char) 54);
        setCharElement(term92808, 9, 'd');
        setField(term92807, term92807.getClass(), "buffer", term92808);
        setIntField(term92807, term92807.getClass(), "size", 10);
        setField(term92807, term92807.getClass(), "newLine", null);
        setField(term92807, term92807.getClass(), "nullText", null);
        term92809 = (byte[]) newByteArray(0);
        term92766 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term92767 = (char[]) newCharArray(10);
        setCharElement(term92767, 0, (char) 91);
        setCharElement(term92767, 1, 'B');
        setCharElement(term92767, 2, (char) 64);
        setCharElement(term92767, 3, (char) 53);
        setCharElement(term92767, 4, 'd');
        setCharElement(term92767, 5, (char) 48);
        setCharElement(term92767, 6, (char) 56);
        setCharElement(term92767, 7, (char) 51);
        setCharElement(term92767, 8, (char) 54);
        setCharElement(term92767, 9, 'd');
        setField(term92766, term92766.getClass(), "buffer", term92767);
        setIntField(term92766, term92766.getClass(), "size", 10);
        setField(term92766, term92766.getClass(), "newLine", null);
        setField(term92766, term92766.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50550;
        Object retValue = callMethod(klass, "append", argTypes, term50666, args);
        assertTrue(recursiveEquals(term50666, term92807));
        assertTrue(recursiveEquals(term50550, term92809));
        assertTrue(recursiveEquals(retValue, term92766));
    }

};


