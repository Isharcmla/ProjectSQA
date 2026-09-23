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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_append_1027807909167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3614;
     Object term3673;

    public StrBuilder_append_1027807909167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3614 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3615 = (char[]) newCharArray(32);
        setField(term3614, term3614.getClass(), "buffer", term3615);
        setIntField(term3614, term3614.getClass(), "size", -14890619);
        setField(term3614, term3614.getClass(), "newLine", "TJmVBGfTML");
        setField(term3614, term3614.getClass(), "nullText", "tPlsykYBqO");
        term3673 = (char[]) newCharArray(3);
        setCharElement(term3673, 0, 's');
        setCharElement(term3673, 1, 'j');
        setCharElement(term3673, 2, 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3673;
        try {
            callMethod(klass, "append", argTypes, term3614, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


