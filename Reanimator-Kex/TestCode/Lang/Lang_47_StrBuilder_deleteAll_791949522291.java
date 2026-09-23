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

public class StrBuilder_deleteAll_791949522291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9850;

    public StrBuilder_deleteAll_791949522291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9850 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9851 = (char[]) newCharArray(32);
        setField(term9850, term9850.getClass(), "buffer", term9851);
        setIntField(term9850, term9850.getClass(), "size", 9726679);
        setField(term9850, term9850.getClass(), "newLine", "RbVQXSpxXy");
        setField(term9850, term9850.getClass(), "nullText", "YpJbIgJWWv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        try {
            callMethod(klass, "deleteAll", argTypes, term9850, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


