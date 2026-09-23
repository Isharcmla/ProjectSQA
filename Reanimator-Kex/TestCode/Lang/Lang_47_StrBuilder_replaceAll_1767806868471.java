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

public class StrBuilder_replaceAll_1767806868471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262884;
     Object term264596;
     Object term264560;

    public StrBuilder_replaceAll_1767806868471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262884 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term261550 = (char[]) newCharArray(31);
        setIntField(term262884, term262884.getClass(), "size", 31);
        setField(term262884, term262884.getClass(), "buffer", term261550);
        term264596 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term264597 = (char[]) newCharArray(31);
        setField(term264596, term264596.getClass(), "buffer", term264597);
        setIntField(term264596, term264596.getClass(), "size", 31);
        setField(term264596, term264596.getClass(), "newLine", null);
        setField(term264596, term264596.getClass(), "nullText", null);
        term264560 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term264561 = (char[]) newCharArray(31);
        setField(term264560, term264560.getClass(), "buffer", term264561);
        setIntField(term264560, term264560.getClass(), "size", 31);
        setField(term264560, term264560.getClass(), "newLine", null);
        setField(term264560, term264560.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceAll", argTypes, term262884, args);
        assertTrue(recursiveEquals(term262884, term264596));
        assertTrue(recursiveEquals(retValue, term264560));
    }

};


