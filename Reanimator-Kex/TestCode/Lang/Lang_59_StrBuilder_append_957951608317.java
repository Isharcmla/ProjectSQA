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

public class StrBuilder_append_957951608317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57053;
     Object term99031;
     Object term99029;

    public StrBuilder_append_957951608317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57053 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term99031 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99031, term99031.getClass(), "buffer", null);
        setIntField(term99031, term99031.getClass(), "size", 0);
        setField(term99031, term99031.getClass(), "newLine", null);
        setField(term99031, term99031.getClass(), "nullText", null);
        term99029 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99029, term99029.getClass(), "buffer", null);
        setIntField(term99029, term99029.getClass(), "size", 0);
        setField(term99029, term99029.getClass(), "newLine", null);
        setField(term99029, term99029.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term57053, args);
        assertTrue(recursiveEquals(term57053, term99031));
        assertTrue(recursiveEquals(retValue, term99029));
    }

};


