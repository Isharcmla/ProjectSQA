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
import java.lang.Character;

public class StrBuilder_append_1027807909156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3969;
     Object term4028;

    public StrBuilder_append_1027807909156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3969 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3970 = (char[]) newCharArray(32);
        setField(term3969, term3969.getClass(), "buffer", term3970);
        setIntField(term3969, term3969.getClass(), "size", -1048298087);
        setField(term3969, term3969.getClass(), "newLine", "KoyGrUJeJW");
        setField(term3969, term3969.getClass(), "nullText", "HqBOwkVqjD");
        term4028 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term4028;
        try {
            callMethod(klass, "append", argTypes, term3969, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


