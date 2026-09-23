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

public class DoubleMetaphone_handleCC_52384786149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356;
     Object term370;
     Object term412;

    public DoubleMetaphone_handleCC_52384786149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term356, term356.getClass(), "maxCodeLen", 4);
        term370 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term371 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term372 = (byte[]) newByteArray(16);
        Object term391 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term392 = (byte[]) newByteArray(16);
        setField(term371, term371.getClass(), "value", term372);
        setByteField(term371, term371.getClass(), "coder", (byte) 18);
        setIntField(term371, term371.getClass(), "count", -1339778481);
        setField(term370, term370.getClass(), "primary", term371);
        setField(term391, term391.getClass(), "value", term392);
        setByteField(term391, term391.getClass(), "coder", (byte) -58);
        setIntField(term391, term391.getClass(), "count", 1725571209);
        setField(term370, term370.getClass(), "alternate", term391);
        setIntField(term370, term370.getClass(), "maxLength", -522618178);
        setField(term370, term370.getClass(), "this$0", null);
        term412 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "hRNSzYYIrc";
        args[1] = term370;
        args[2] = term412;
        try {
            callMethod(klass, "handleCC", argTypes, term356, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


