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
import java.lang.Object;

public class StrBuilder_asWriter_2102558325271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11956;
     Object term81998;
     Object term81935;

    public StrBuilder_asWriter_2102558325271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11956 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11957 = (char[]) newCharArray(32);
        setField(term11956, term11956.getClass(), "buffer", term11957);
        setIntField(term11956, term11956.getClass(), "size", 1041916673);
        setField(term11956, term11956.getClass(), "newLine", "EwQBhZjCIT");
        setField(term11956, term11956.getClass(), "nullText", "aSkmSwTnEw");
        term81998 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81999 = (char[]) newCharArray(32);
        setField(term81998, term81998.getClass(), "buffer", term81999);
        setIntField(term81998, term81998.getClass(), "size", 1041916673);
        setField(term81998, term81998.getClass(), "newLine", "EwQBhZjCIT");
        setField(term81998, term81998.getClass(), "nullText", "aSkmSwTnEw");
        term81935 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter"));
        Object term81936 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81937 = (char[]) newCharArray(32);
        setField(term81936, term81936.getClass(), "buffer", term81937);
        setIntField(term81936, term81936.getClass(), "size", 1041916673);
        setField(term81936, term81936.getClass(), "newLine", "EwQBhZjCIT");
        setField(term81936, term81936.getClass(), "nullText", "aSkmSwTnEw");
        setField(term81935, term81935.getClass(), "this$0", term81936);
        setField(term81935, term81935.getClass(), "writeBuffer", null);
        setField(term81935, term81935.getClass(), "lock", term81935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asWriter", argTypes, term11956, args);
        assertTrue(recursiveEquals(term11956, term81998));
        assertTrue(recursiveEquals(retValue, term81935));
    }

};


