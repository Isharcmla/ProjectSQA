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

public class StrBuilder_appendln_1342001368386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65910;
     Object term66006;
     Object term115680;
     Object term115683;
     Object term115643;

    public StrBuilder_appendln_1342001368386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65910 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term65910, term65910.getClass(), "newLine", "");
        term66006 = new StringBuffer();
        term115680 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term115680, term115680.getClass(), "buffer", null);
        setIntField(term115680, term115680.getClass(), "size", 0);
        setField(term115680, term115680.getClass(), "newLine", "");
        setField(term115680, term115680.getClass(), "nullText", null);
        term115683 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term115684 = (byte[]) newByteArray(16);
        setField(term115683, term115683.getClass(), "toStringCache", null);
        setField(term115683, term115683.getClass(), "value", term115684);
        setByteField(term115683, term115683.getClass(), "coder", (byte) 0);
        setIntField(term115683, term115683.getClass(), "count", 0);
        term115643 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term115643, term115643.getClass(), "buffer", null);
        setIntField(term115643, term115643.getClass(), "size", 0);
        setField(term115643, term115643.getClass(), "newLine", "");
        setField(term115643, term115643.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term66006;
        Object retValue = callMethod(klass, "appendln", argTypes, term65910, args);
        assertTrue(recursiveEquals(term65910, term115680));
        assertTrue(recursiveEquals(term66006, term115683));
        assertTrue(recursiveEquals(retValue, term115643));
    }

};


