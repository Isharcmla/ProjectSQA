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

public class StrBuilder_asWriter_2102558325269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11956;
     Object term82890;
     Object term82830;

    public StrBuilder_asWriter_2102558325269() {
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
        term82890 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82891 = (char[]) newCharArray(32);
        setField(term82890, term82890.getClass(), "buffer", term82891);
        setIntField(term82890, term82890.getClass(), "size", 1041916673);
        setField(term82890, term82890.getClass(), "newLine", "EwQBhZjCIT");
        setField(term82890, term82890.getClass(), "nullText", "aSkmSwTnEw");
        term82830 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter"));
        Object term82831 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82832 = (char[]) newCharArray(32);
        setField(term82831, term82831.getClass(), "buffer", term82832);
        setIntField(term82831, term82831.getClass(), "size", 1041916673);
        setField(term82831, term82831.getClass(), "newLine", "EwQBhZjCIT");
        setField(term82831, term82831.getClass(), "nullText", "aSkmSwTnEw");
        setField(term82830, term82830.getClass(), "this$0", term82831);
        setField(term82830, term82830.getClass(), "writeBuffer", null);
        setField(term82830, term82830.getClass(), "lock", term82830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asWriter", argTypes, term11956, args);
        assertTrue(recursiveEquals(term11956, term82890));
        assertTrue(recursiveEquals(retValue, term82830));
    }

};


