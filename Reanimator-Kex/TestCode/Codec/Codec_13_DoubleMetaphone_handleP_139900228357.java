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

public class DoubleMetaphone_handleP_139900228357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;
     Object term1174;
     Object term1216;

    public DoubleMetaphone_handleP_139900228357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1160, term1160.getClass(), "maxCodeLen", 4);
        term1174 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1175 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1176 = (byte[]) newByteArray(16);
        Object term1195 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1196 = (byte[]) newByteArray(16);
        setField(term1175, term1175.getClass(), "value", term1176);
        setByteField(term1175, term1175.getClass(), "coder", (byte) 121);
        setIntField(term1175, term1175.getClass(), "count", 767834723);
        setField(term1174, term1174.getClass(), "primary", term1175);
        setField(term1195, term1195.getClass(), "value", term1196);
        setByteField(term1195, term1195.getClass(), "coder", (byte) -99);
        setIntField(term1195, term1195.getClass(), "count", -602026508);
        setField(term1174, term1174.getClass(), "alternate", term1195);
        setIntField(term1174, term1174.getClass(), "maxLength", -157887805);
        setField(term1174, term1174.getClass(), "this$0", null);
        term1216 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "ZiaGIbnzTs";
        args[1] = term1174;
        args[2] = term1216;
        try {
            callMethod(klass, "handleP", argTypes, term1160, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


