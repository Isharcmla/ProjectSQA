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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_append_157914966144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2993;
     Object term3052;
     Object term3084;
     Object term3086;

    public StrBuilder_append_157914966144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2993 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2994 = (char[]) newCharArray(32);
        setField(term2993, term2993.getClass(), "buffer", term2994);
        setIntField(term2993, term2993.getClass(), "size", 679763016);
        setField(term2993, term2993.getClass(), "newLine", "ffYhPOzlUs");
        setField(term2993, term2993.getClass(), "nullText", "MLqYREekMl");
        term3052 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3065 = (byte[]) newByteArray(16);
        setField(term3052, term3052.getClass(), "toStringCache", "ytSBIKXogI");
        setField(term3052, term3052.getClass(), "value", term3065);
        setByteField(term3052, term3052.getClass(), "coder", (byte) 48);
        setIntField(term3052, term3052.getClass(), "count", 1962444399);
        term3084 = new Integer(767834723);
        term3086 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3052;
        args[1] = term3084;
        args[2] = term3086;
        try {
            callMethod(klass, "append", argTypes, term2993, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


