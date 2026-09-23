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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleL_139900612756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1060;
     Object term1074;
     Object term1116;

    public DoubleMetaphone_handleL_139900612756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1060 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1060, term1060.getClass(), "maxCodeLen", 4);
        term1074 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1075 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1076 = (byte[]) newByteArray(16);
        Object term1095 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1096 = (byte[]) newByteArray(16);
        setField(term1075, term1075.getClass(), "value", term1076);
        setByteField(term1075, term1075.getClass(), "coder", (byte) 78);
        setIntField(term1075, term1075.getClass(), "count", -469968304);
        setField(term1074, term1074.getClass(), "primary", term1075);
        setField(term1095, term1095.getClass(), "value", term1096);
        setByteField(term1095, term1095.getClass(), "coder", (byte) 87);
        setIntField(term1095, term1095.getClass(), "count", -1145578966);
        setField(term1074, term1074.getClass(), "alternate", term1095);
        setIntField(term1074, term1074.getClass(), "maxLength", 679763016);
        setField(term1074, term1074.getClass(), "this$0", null);
        term1116 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "aJlieCFVtF";
        args[1] = term1074;
        args[2] = term1116;
        try {
            callMethod(klass, "handleL", argTypes, term1060, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


