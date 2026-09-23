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

public class StrBuilder_append_157914966364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54479;
     Object term54537;
     Object term106440;
     Object term106441;
     Object term105432;

    public StrBuilder_append_157914966364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54479 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term53376 = (char[]) newCharArray(1000);
        term54537 = new StringBuffer();
        ((StringBuffer) term54537).append(term53376);
        term106440 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term106440, term106440.getClass(), "buffer", null);
        setIntField(term106440, term106440.getClass(), "size", 0);
        setField(term106440, term106440.getClass(), "newLine", null);
        setField(term106440, term106440.getClass(), "nullText", null);
        term106441 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term106442 = (byte[]) newByteArray(1000);
        setField(term106441, term106441.getClass(), "toStringCache", null);
        setField(term106441, term106441.getClass(), "value", term106442);
        setByteField(term106441, term106441.getClass(), "coder", (byte) 0);
        setIntField(term106441, term106441.getClass(), "count", 1000);
        term105432 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105432, term105432.getClass(), "buffer", null);
        setIntField(term105432, term105432.getClass(), "size", 0);
        setField(term105432, term105432.getClass(), "newLine", null);
        setField(term105432, term105432.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term54537;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term54479, args);
        assertTrue(recursiveEquals(term54479, term106440));
        assertTrue(recursiveEquals(term54537, term106441));
        assertTrue(recursiveEquals(retValue, term105432));
    }

};


