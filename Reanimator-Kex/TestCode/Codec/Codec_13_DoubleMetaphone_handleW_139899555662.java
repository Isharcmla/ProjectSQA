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
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleW_139899555662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1664;
     Object term1678;
     Object term1720;
     Object term11314;
     Object term11317;

    public DoubleMetaphone_handleW_139899555662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1664 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1664, term1664.getClass(), "maxCodeLen", 4);
        term1678 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1679 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1680 = (byte[]) newByteArray(16);
        Object term1699 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1700 = (byte[]) newByteArray(16);
        setField(term1679, term1679.getClass(), "value", term1680);
        setByteField(term1679, term1679.getClass(), "coder", (byte) 106);
        setIntField(term1679, term1679.getClass(), "count", 97029295);
        setField(term1678, term1678.getClass(), "primary", term1679);
        setField(term1699, term1699.getClass(), "value", term1700);
        setByteField(term1699, term1699.getClass(), "coder", (byte) 98);
        setIntField(term1699, term1699.getClass(), "count", -1371869594);
        setField(term1678, term1678.getClass(), "alternate", term1699);
        setIntField(term1678, term1678.getClass(), "maxLength", -2095575670);
        setField(term1678, term1678.getClass(), "this$0", null);
        term1720 = new Integer(1225272962);
        term11314 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term11314, term11314.getClass(), "maxCodeLen", 4);
        term11317 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term11318 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11319 = (byte[]) newByteArray(16);
        Object term11320 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11321 = (byte[]) newByteArray(16);
        setField(term11318, term11318.getClass(), "value", term11319);
        setByteField(term11318, term11318.getClass(), "coder", (byte) 106);
        setIntField(term11318, term11318.getClass(), "count", 97029295);
        setField(term11317, term11317.getClass(), "primary", term11318);
        setField(term11320, term11320.getClass(), "value", term11321);
        setByteField(term11320, term11320.getClass(), "coder", (byte) 98);
        setIntField(term11320, term11320.getClass(), "count", -1371869594);
        setField(term11317, term11317.getClass(), "alternate", term11320);
        setIntField(term11317, term11317.getClass(), "maxLength", -2095575670);
        setField(term11317, term11317.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "RkybSrpybU";
        args[1] = term1678;
        args[2] = term1720;
        Object retValue = callMethod(klass, "handleW", argTypes, term1664, args);
        assertTrue(recursiveEquals(term1664, term11314));
        assertTrue(recursiveEquals(term1678, 1225272962));
        assertTrue(recursiveEquals(term1720, term11317));
        assertTrue(recursiveEquals(retValue, 1225272963));
    }

};


