package org.apache.commons.codec.net;

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
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.net.EqualityUtils.*;

public class QuotedPrintableCodec_encode_1092762296217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132635;
     Object term131010;
     Object term155954;
     Object term155955;
     Object term155914;

    public QuotedPrintableCodec_encode_1092762296217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132635 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term131010 = (byte[]) newByteArray(32);
        setByteElement(term131010, 1, (byte) -117);
        setByteElement(term131010, 3, (byte) 56);
        setByteElement(term131010, 4, (byte) 56);
        setByteElement(term131010, 5, (byte) 56);
        setByteElement(term131010, 6, (byte) 56);
        setByteElement(term131010, 7, (byte) 56);
        setByteElement(term131010, 8, (byte) 56);
        setByteElement(term131010, 9, (byte) 56);
        setByteElement(term131010, 10, (byte) 56);
        setByteElement(term131010, 11, (byte) 56);
        setByteElement(term131010, 12, (byte) 56);
        setByteElement(term131010, 13, (byte) 56);
        setByteElement(term131010, 14, (byte) 56);
        setByteElement(term131010, 15, (byte) 56);
        setByteElement(term131010, 16, (byte) 56);
        setByteElement(term131010, 17, (byte) 56);
        setByteElement(term131010, 18, (byte) 56);
        setByteElement(term131010, 19, (byte) 56);
        setByteElement(term131010, 20, (byte) 56);
        setByteElement(term131010, 21, (byte) 56);
        setByteElement(term131010, 22, (byte) 56);
        setByteElement(term131010, 23, (byte) 56);
        setByteElement(term131010, 24, (byte) 56);
        setByteElement(term131010, 25, (byte) 56);
        setByteElement(term131010, 26, (byte) 56);
        setByteElement(term131010, 27, (byte) 56);
        setByteElement(term131010, 28, (byte) 56);
        setByteElement(term131010, 29, (byte) 56);
        setByteElement(term131010, 30, (byte) 56);
        setByteElement(term131010, 31, (byte) 56);
        term155954 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term155954, term155954.getClass(), "charset", null);
        term155955 = (byte[]) newByteArray(32);
        setByteElement(term155955, 1, (byte) -117);
        setByteElement(term155955, 3, (byte) 56);
        setByteElement(term155955, 4, (byte) 56);
        setByteElement(term155955, 5, (byte) 56);
        setByteElement(term155955, 6, (byte) 56);
        setByteElement(term155955, 7, (byte) 56);
        setByteElement(term155955, 8, (byte) 56);
        setByteElement(term155955, 9, (byte) 56);
        setByteElement(term155955, 10, (byte) 56);
        setByteElement(term155955, 11, (byte) 56);
        setByteElement(term155955, 12, (byte) 56);
        setByteElement(term155955, 13, (byte) 56);
        setByteElement(term155955, 14, (byte) 56);
        setByteElement(term155955, 15, (byte) 56);
        setByteElement(term155955, 16, (byte) 56);
        setByteElement(term155955, 17, (byte) 56);
        setByteElement(term155955, 18, (byte) 56);
        setByteElement(term155955, 19, (byte) 56);
        setByteElement(term155955, 20, (byte) 56);
        setByteElement(term155955, 21, (byte) 56);
        setByteElement(term155955, 22, (byte) 56);
        setByteElement(term155955, 23, (byte) 56);
        setByteElement(term155955, 24, (byte) 56);
        setByteElement(term155955, 25, (byte) 56);
        setByteElement(term155955, 26, (byte) 56);
        setByteElement(term155955, 27, (byte) 56);
        setByteElement(term155955, 28, (byte) 56);
        setByteElement(term155955, 29, (byte) 56);
        setByteElement(term155955, 30, (byte) 56);
        setByteElement(term155955, 31, (byte) 56);
        term155914 = (byte[]) newByteArray(38);
        setByteElement(term155914, 0, (byte) 61);
        setByteElement(term155914, 1, (byte) 48);
        setByteElement(term155914, 2, (byte) 48);
        setByteElement(term155914, 3, (byte) 61);
        setByteElement(term155914, 4, (byte) 56);
        setByteElement(term155914, 5, (byte) 66);
        setByteElement(term155914, 6, (byte) 61);
        setByteElement(term155914, 7, (byte) 48);
        setByteElement(term155914, 8, (byte) 48);
        setByteElement(term155914, 9, (byte) 56);
        setByteElement(term155914, 10, (byte) 56);
        setByteElement(term155914, 11, (byte) 56);
        setByteElement(term155914, 12, (byte) 56);
        setByteElement(term155914, 13, (byte) 56);
        setByteElement(term155914, 14, (byte) 56);
        setByteElement(term155914, 15, (byte) 56);
        setByteElement(term155914, 16, (byte) 56);
        setByteElement(term155914, 17, (byte) 56);
        setByteElement(term155914, 18, (byte) 56);
        setByteElement(term155914, 19, (byte) 56);
        setByteElement(term155914, 20, (byte) 56);
        setByteElement(term155914, 21, (byte) 56);
        setByteElement(term155914, 22, (byte) 56);
        setByteElement(term155914, 23, (byte) 56);
        setByteElement(term155914, 24, (byte) 56);
        setByteElement(term155914, 25, (byte) 56);
        setByteElement(term155914, 26, (byte) 56);
        setByteElement(term155914, 27, (byte) 56);
        setByteElement(term155914, 28, (byte) 56);
        setByteElement(term155914, 29, (byte) 56);
        setByteElement(term155914, 30, (byte) 56);
        setByteElement(term155914, 31, (byte) 56);
        setByteElement(term155914, 32, (byte) 56);
        setByteElement(term155914, 33, (byte) 56);
        setByteElement(term155914, 34, (byte) 56);
        setByteElement(term155914, 35, (byte) 56);
        setByteElement(term155914, 36, (byte) 56);
        setByteElement(term155914, 37, (byte) 56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term131010;
        Object retValue = callMethod(klass, "encode", argTypes, term132635, args);
        assertTrue(recursiveEquals(term132635, term155954));
        assertTrue(recursiveEquals(term131010, term155955));
        assertTrue(recursiveEquals(retValue, term155914));
    }

};


