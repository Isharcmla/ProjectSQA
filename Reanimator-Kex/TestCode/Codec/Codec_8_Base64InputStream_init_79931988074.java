package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Object;

public class Base64InputStream_init_79931988074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640820;
     Object term1318514;
     Object term1980485;
     Object term1980491;
     Object term1980492;

    public Base64InputStream_init_79931988074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1640654 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1640722 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term1640654, term1640654.getClass(), "in", term1640722);
        setField(term1640654, term1640654.getClass(), "singleByte", null);
        setBooleanField(term1640654, term1640654.getClass(), "doEncode", false);
        term1640820 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        term1318514 = (byte[]) newByteArray(322);
        term1980485 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1980486 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1980487 = (byte[]) newByteArray(64);
        byte[] term1980488 = (byte[]) newByteArray(322);
        byte[] term1980489 = (byte[]) newByteArray(1);
        Object term1980490 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setBooleanField(term1980485, term1980485.getClass(), "doEncode", true);
        setByteElement(term1980487, 0, (byte) 65);
        setByteElement(term1980487, 1, (byte) 66);
        setByteElement(term1980487, 2, (byte) 67);
        setByteElement(term1980487, 3, (byte) 68);
        setByteElement(term1980487, 4, (byte) 69);
        setByteElement(term1980487, 5, (byte) 70);
        setByteElement(term1980487, 6, (byte) 71);
        setByteElement(term1980487, 7, (byte) 72);
        setByteElement(term1980487, 8, (byte) 73);
        setByteElement(term1980487, 9, (byte) 74);
        setByteElement(term1980487, 10, (byte) 75);
        setByteElement(term1980487, 11, (byte) 76);
        setByteElement(term1980487, 12, (byte) 77);
        setByteElement(term1980487, 13, (byte) 78);
        setByteElement(term1980487, 14, (byte) 79);
        setByteElement(term1980487, 15, (byte) 80);
        setByteElement(term1980487, 16, (byte) 81);
        setByteElement(term1980487, 17, (byte) 82);
        setByteElement(term1980487, 18, (byte) 83);
        setByteElement(term1980487, 19, (byte) 84);
        setByteElement(term1980487, 20, (byte) 85);
        setByteElement(term1980487, 21, (byte) 86);
        setByteElement(term1980487, 22, (byte) 87);
        setByteElement(term1980487, 23, (byte) 88);
        setByteElement(term1980487, 24, (byte) 89);
        setByteElement(term1980487, 25, (byte) 90);
        setByteElement(term1980487, 26, (byte) 97);
        setByteElement(term1980487, 27, (byte) 98);
        setByteElement(term1980487, 28, (byte) 99);
        setByteElement(term1980487, 29, (byte) 100);
        setByteElement(term1980487, 30, (byte) 101);
        setByteElement(term1980487, 31, (byte) 102);
        setByteElement(term1980487, 32, (byte) 103);
        setByteElement(term1980487, 33, (byte) 104);
        setByteElement(term1980487, 34, (byte) 105);
        setByteElement(term1980487, 35, (byte) 106);
        setByteElement(term1980487, 36, (byte) 107);
        setByteElement(term1980487, 37, (byte) 108);
        setByteElement(term1980487, 38, (byte) 109);
        setByteElement(term1980487, 39, (byte) 110);
        setByteElement(term1980487, 40, (byte) 111);
        setByteElement(term1980487, 41, (byte) 112);
        setByteElement(term1980487, 42, (byte) 113);
        setByteElement(term1980487, 43, (byte) 114);
        setByteElement(term1980487, 44, (byte) 115);
        setByteElement(term1980487, 45, (byte) 116);
        setByteElement(term1980487, 46, (byte) 117);
        setByteElement(term1980487, 47, (byte) 118);
        setByteElement(term1980487, 48, (byte) 119);
        setByteElement(term1980487, 49, (byte) 120);
        setByteElement(term1980487, 50, (byte) 121);
        setByteElement(term1980487, 51, (byte) 122);
        setByteElement(term1980487, 52, (byte) 48);
        setByteElement(term1980487, 53, (byte) 49);
        setByteElement(term1980487, 54, (byte) 50);
        setByteElement(term1980487, 55, (byte) 51);
        setByteElement(term1980487, 56, (byte) 52);
        setByteElement(term1980487, 57, (byte) 53);
        setByteElement(term1980487, 58, (byte) 54);
        setByteElement(term1980487, 59, (byte) 55);
        setByteElement(term1980487, 60, (byte) 56);
        setByteElement(term1980487, 61, (byte) 57);
        setByteElement(term1980487, 62, (byte) 43);
        setByteElement(term1980487, 63, (byte) 47);
        setField(term1980486, term1980486.getClass(), "encodeTable", term1980487);
        setIntField(term1980486, term1980486.getClass(), "lineLength", 0);
        setField(term1980486, term1980486.getClass(), "lineSeparator", term1980488);
        setIntField(term1980486, term1980486.getClass(), "decodeSize", 3);
        setIntField(term1980486, term1980486.getClass(), "encodeSize", 4);
        setField(term1980486, term1980486.getClass(), "buffer", null);
        setIntField(term1980486, term1980486.getClass(), "pos", 0);
        setIntField(term1980486, term1980486.getClass(), "readPos", 0);
        setIntField(term1980486, term1980486.getClass(), "currentLinePos", 0);
        setIntField(term1980486, term1980486.getClass(), "modulus", 0);
        setBooleanField(term1980486, term1980486.getClass(), "eof", false);
        setIntField(term1980486, term1980486.getClass(), "x", 0);
        setField(term1980485, term1980485.getClass(), "base64", term1980486);
        setField(term1980485, term1980485.getClass(), "singleByte", term1980489);
        setField(term1980490, term1980490.getClass(), "lock", null);
        setBooleanField(term1980490, term1980490.getClass(), "closePending", false);
        setIntField(term1980490, term1980490.getClass(), "useCount", 0);
        setField(term1980490, term1980490.getClass(), "streamToClose", null);
        setField(term1980490, term1980490.getClass(), "fd", null);
        setField(term1980490, term1980490.getClass(), "path", null);
        setField(term1980490, term1980490.getClass(), "channel", null);
        setField(term1980490, term1980490.getClass(), "closeLock", null);
        setBooleanField(term1980490, term1980490.getClass(), "closed", false);
        setField(term1980490, term1980490.getClass(), "altFinalizer", null);
        setField(term1980485, term1980485.getClass(), "in", term1980490);
        term1980491 = (byte[]) newByteArray(322);
        term1980492 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setField(term1980492, term1980492.getClass(), "lock", null);
        setBooleanField(term1980492, term1980492.getClass(), "closePending", false);
        setIntField(term1980492, term1980492.getClass(), "useCount", 0);
        setField(term1980492, term1980492.getClass(), "streamToClose", null);
        setField(term1980492, term1980492.getClass(), "fd", null);
        setField(term1980492, term1980492.getClass(), "path", null);
        setField(term1980492, term1980492.getClass(), "channel", null);
        setField(term1980492, term1980492.getClass(), "closeLock", null);
        setBooleanField(term1980492, term1980492.getClass(), "closed", false);
        setField(term1980492, term1980492.getClass(), "altFinalizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1640820;
        args[1] = true;
        args[2] = 0;
        args[3] = term1318514;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1980485));
        assertTrue(recursiveEquals(term1640820, 0));
        assertTrue(recursiveEquals(term1318514, true));
    }

};


