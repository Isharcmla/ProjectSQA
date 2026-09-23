package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.StringBuilder;
import java.lang.Object;

public class DoubleMetaphone_handleCC_523847861183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238337;
     Object term238523;
     Object term238711;
     Object term238714;

    public DoubleMetaphone_handleCC_523847861183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238337 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term238182 = (char[]) newCharArray(0);
        StringBuilder term238583 = new StringBuilder();
        ((StringBuilder) term238583).append(term238182);
        StringBuilder term238643 = new StringBuilder();
        term238523 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term238523, term238523.getClass(), "primary", term238583);
        setIntField(term238523, term238523.getClass(), "maxLength", 0);
        setField(term238523, term238523.getClass(), "alternate", term238643);
        term238711 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term238711, term238711.getClass(), "maxCodeLen", 0);
        term238714 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term238715 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term238716 = (byte[]) newByteArray(16);
        Object term238717 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term238718 = (byte[]) newByteArray(16);
        setField(term238715, term238715.getClass(), "value", term238716);
        setByteField(term238715, term238715.getClass(), "coder", (byte) 0);
        setIntField(term238715, term238715.getClass(), "count", 0);
        setField(term238714, term238714.getClass(), "primary", term238715);
        setField(term238717, term238717.getClass(), "value", term238718);
        setByteField(term238717, term238717.getClass(), "coder", (byte) 0);
        setIntField(term238717, term238717.getClass(), "count", 0);
        setField(term238714, term238714.getClass(), "alternate", term238717);
        setIntField(term238714, term238714.getClass(), "maxLength", 0);
        setField(term238714, term238714.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = term238523;
        args[2] = 1845475962;
        Object retValue = callMethod(klass, "handleCC", argTypes, term238337, args);
        assertTrue(recursiveEquals(term238337, term238711));
        assertTrue(recursiveEquals(term238523, term238714));
        assertTrue(recursiveEquals(retValue, 1845475964));
    }

};


