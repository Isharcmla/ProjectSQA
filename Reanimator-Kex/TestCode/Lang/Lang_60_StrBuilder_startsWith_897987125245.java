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

public class StrBuilder_startsWith_897987125245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9102;
     Object term76478;

    public StrBuilder_startsWith_897987125245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9102 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9103 = (char[]) newCharArray(32);
        setField(term9102, term9102.getClass(), "buffer", term9103);
        setIntField(term9102, term9102.getClass(), "size", -1963464809);
        setField(term9102, term9102.getClass(), "newLine", "xtftXXMbem");
        setField(term9102, term9102.getClass(), "nullText", "cudZvLMQon");
        term76478 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76479 = (char[]) newCharArray(32);
        setField(term76478, term76478.getClass(), "buffer", term76479);
        setIntField(term76478, term76478.getClass(), "size", -1963464809);
        setField(term76478, term76478.getClass(), "newLine", "xtftXXMbem");
        setField(term76478, term76478.getClass(), "nullText", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        Object retValue = callMethod(klass, "startsWith", argTypes, term9102, args);
        assertTrue(recursiveEquals(term9102, term76478));
        assertTrue(recursiveEquals(retValue, false));
    }

};


