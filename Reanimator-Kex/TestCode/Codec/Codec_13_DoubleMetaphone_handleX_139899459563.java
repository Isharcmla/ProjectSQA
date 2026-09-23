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

public class DoubleMetaphone_handleX_139899459563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764;
     Object term1778;
     Object term1820;

    public DoubleMetaphone_handleX_139899459563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1764 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1764, term1764.getClass(), "maxCodeLen", 4);
        term1778 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1779 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1780 = (byte[]) newByteArray(16);
        Object term1799 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1800 = (byte[]) newByteArray(16);
        setField(term1779, term1779.getClass(), "value", term1780);
        setByteField(term1779, term1779.getClass(), "coder", (byte) 67);
        setIntField(term1779, term1779.getClass(), "count", 1324040357);
        setField(term1778, term1778.getClass(), "primary", term1779);
        setField(term1799, term1799.getClass(), "value", term1800);
        setByteField(term1799, term1799.getClass(), "coder", (byte) 66);
        setIntField(term1799, term1799.getClass(), "count", -1588772968);
        setField(term1778, term1778.getClass(), "alternate", term1799);
        setIntField(term1778, term1778.getClass(), "maxLength", -93135961);
        setField(term1778, term1778.getClass(), "this$0", null);
        term1820 = new Integer(-112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "xOEqzGAmDU";
        args[1] = term1778;
        args[2] = term1820;
        try {
            callMethod(klass, "handleX", argTypes, term1764, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


