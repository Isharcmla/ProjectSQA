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

public class StrBuilder_replaceFirst_1815609019237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7911;
     Object term7970;
     Object term7972;

    public StrBuilder_replaceFirst_1815609019237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7911 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7912 = (char[]) newCharArray(32);
        setField(term7911, term7911.getClass(), "buffer", term7912);
        setIntField(term7911, term7911.getClass(), "size", 1386130016);
        setField(term7911, term7911.getClass(), "newLine", "WHcwFgsGFC");
        setField(term7911, term7911.getClass(), "nullText", "HzqpegHiRq");
        term7970 = new Character('D');
        term7972 = new Character('Y');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term7970;
        args[1] = term7972;
        try {
            callMethod(klass, "replaceFirst", argTypes, term7911, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


