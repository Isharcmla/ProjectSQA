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

public class StrBuilder_appendWithSeparators_701657066189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4671;
     Object term57647;

    public StrBuilder_appendWithSeparators_701657066189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4671 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4672 = (char[]) newCharArray(32);
        setField(term4671, term4671.getClass(), "buffer", term4672);
        setIntField(term4671, term4671.getClass(), "size", -1371869594);
        setField(term4671, term4671.getClass(), "newLine", "PkWMRdJcBb");
        setField(term4671, term4671.getClass(), "nullText", "jSpAteRute");
        term57647 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term57648 = (char[]) newCharArray(32);
        setField(term57647, term57647.getClass(), "buffer", term57648);
        setIntField(term57647, term57647.getClass(), "size", -1371869594);
        setField(term57647, term57647.getClass(), "newLine", "PkWMRdJcBb");
        setField(term57647, term57647.getClass(), "nullText", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "swZVeJAxjt";
        callMethod(klass, "appendWithSeparators", argTypes, term4671, args);
        assertTrue(recursiveEquals(term4671, term57647));
    }

};


