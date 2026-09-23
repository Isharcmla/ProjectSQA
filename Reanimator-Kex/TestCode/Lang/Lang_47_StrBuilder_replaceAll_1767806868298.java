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

public class StrBuilder_replaceAll_1767806868298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10616;
     Object term10675;
     Object term10677;

    public StrBuilder_replaceAll_1767806868298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10616 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10617 = (char[]) newCharArray(32);
        setField(term10616, term10616.getClass(), "buffer", term10617);
        setIntField(term10616, term10616.getClass(), "size", 1830648570);
        setField(term10616, term10616.getClass(), "newLine", "iikZEapDlu");
        setField(term10616, term10616.getClass(), "nullText", "nhoHrZfnIN");
        term10675 = new Character('p');
        term10677 = new Character('V');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term10675;
        args[1] = term10677;
        try {
            callMethod(klass, "replaceAll", argTypes, term10616, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


