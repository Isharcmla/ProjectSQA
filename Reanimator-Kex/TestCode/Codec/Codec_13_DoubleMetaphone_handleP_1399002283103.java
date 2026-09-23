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

public class DoubleMetaphone_handleP_1399002283103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75740;
     Object term75926;
     Object term78162;
     Object term78165;

    public DoubleMetaphone_handleP_1399002283103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75740 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term73511 = (char[]) newCharArray(699);
        StringBuilder term75986 = new StringBuilder();
        ((StringBuilder) term75986).append(term73511);
        char[] term74912 = (char[]) newCharArray(340);
        StringBuilder term76046 = new StringBuilder();
        ((StringBuilder) term76046).append(term74912);
        term75926 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term75926, term75926.getClass(), "primary", term75986);
        setIntField(term75926, term75926.getClass(), "maxLength", 257);
        setField(term75926, term75926.getClass(), "alternate", term76046);
        term78162 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term78162, term78162.getClass(), "maxCodeLen", 0);
        term78165 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term78166 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term78167 = (byte[]) newByteArray(699);
        Object term78168 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term78169 = (byte[]) newByteArray(340);
        setField(term78166, term78166.getClass(), "value", term78167);
        setByteField(term78166, term78166.getClass(), "coder", (byte) 0);
        setIntField(term78166, term78166.getClass(), "count", 699);
        setField(term78165, term78165.getClass(), "primary", term78166);
        setField(term78168, term78168.getClass(), "value", term78169);
        setByteField(term78168, term78168.getClass(), "coder", (byte) 0);
        setIntField(term78168, term78168.getClass(), "count", 340);
        setField(term78165, term78165.getClass(), "alternate", term78168);
        setIntField(term78165, term78165.getClass(), "maxLength", 257);
        setField(term78165, term78165.getClass(), "this$0", null);
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
        args[1] = term75926;
        args[2] = 1021;
        Object retValue = callMethod(klass, "handleP", argTypes, term75740, args);
        assertTrue(recursiveEquals(term75740, term78162));
        assertTrue(recursiveEquals(term75926, term78165));
        assertTrue(recursiveEquals(retValue, 1022));
    }

};


