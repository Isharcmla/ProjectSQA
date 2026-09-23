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
import java.lang.StringBuffer;

public class StrBuilder_append_157914966316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55135;
     Object term55193;
     Object term93629;
     Object term93630;
     Object term92621;

    public StrBuilder_append_157914966316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55135 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term54032 = (char[]) newCharArray(1000);
        term55193 = new StringBuffer();
        ((StringBuffer) term55193).append(term54032);
        term93629 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93629, term93629.getClass(), "buffer", null);
        setIntField(term93629, term93629.getClass(), "size", 0);
        setField(term93629, term93629.getClass(), "newLine", null);
        setField(term93629, term93629.getClass(), "nullText", null);
        term93630 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term93631 = (byte[]) newByteArray(1000);
        setField(term93630, term93630.getClass(), "toStringCache", null);
        setField(term93630, term93630.getClass(), "value", term93631);
        setByteField(term93630, term93630.getClass(), "coder", (byte) 0);
        setIntField(term93630, term93630.getClass(), "count", 1000);
        term92621 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92621, term92621.getClass(), "buffer", null);
        setIntField(term92621, term92621.getClass(), "size", 0);
        setField(term92621, term92621.getClass(), "newLine", null);
        setField(term92621, term92621.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term55193;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term55135, args);
        assertTrue(recursiveEquals(term55135, term93629));
        assertTrue(recursiveEquals(term55193, term93630));
        assertTrue(recursiveEquals(retValue, term92621));
    }

};


