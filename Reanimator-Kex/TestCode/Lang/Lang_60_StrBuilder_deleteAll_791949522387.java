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

public class StrBuilder_deleteAll_791949522387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925127;
     Object term934445;
     Object term933416;

    public StrBuilder_deleteAll_791949522387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term925127 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term914024 = (char[]) newCharArray(511);
        setIntField(term925127, term925127.getClass(), "size", 530);
        setField(term925127, term925127.getClass(), "buffer", term914024);
        term934445 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term934446 = (char[]) newCharArray(511);
        setField(term934445, term934445.getClass(), "buffer", term934446);
        setIntField(term934445, term934445.getClass(), "size", 530);
        setField(term934445, term934445.getClass(), "newLine", null);
        setField(term934445, term934445.getClass(), "nullText", null);
        term933416 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term933417 = (char[]) newCharArray(511);
        setField(term933416, term933416.getClass(), "buffer", term933417);
        setIntField(term933416, term933416.getClass(), "size", 530);
        setField(term933416, term933416.getClass(), "newLine", null);
        setField(term933416, term933416.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term925127, args);
        assertTrue(recursiveEquals(term925127, term934445));
        assertTrue(recursiveEquals(retValue, term933416));
    }

};


