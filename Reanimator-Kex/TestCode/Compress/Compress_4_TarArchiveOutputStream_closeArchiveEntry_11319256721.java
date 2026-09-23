package org.apache.commons.compress.archivers.tar;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_closeArchiveEntry_11319256721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;

    public TarArchiveOutputStream_closeArchiveEntry_11319256721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term373 = (byte[]) newByteArray(2);
        byte[] term377 = (byte[]) newByteArray(1);
        Object term379 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term380 = (byte[]) newByteArray(9);
        byte[] term398 = (byte[]) newByteArray(3);
        setLongField(term358, term358.getClass(), "currSize", -2813493605142626659L);
        setField(term358, term358.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term358, term358.getClass(), "currBytes", -8885298608300233488L);
        setByteElement(term373, 0, (byte) 14);
        setByteElement(term373, 1, (byte) -101);
        setField(term358, term358.getClass(), "recordBuf", term373);
        setIntField(term358, term358.getClass(), "assemLen", -817164822);
        setByteElement(term377, 0, (byte) 35);
        setField(term358, term358.getClass(), "assemBuf", term377);
        setField(term379, term379.getClass(), "inStream", null);
        setField(term379, term379.getClass(), "outStream", null);
        setByteElement(term380, 0, (byte) 66);
        setByteElement(term380, 1, (byte) 123);
        setByteElement(term380, 2, (byte) -5);
        setByteElement(term380, 3, (byte) 84);
        setByteElement(term380, 4, (byte) -97);
        setByteElement(term380, 5, (byte) -24);
        setByteElement(term380, 6, (byte) 88);
        setByteElement(term380, 7, (byte) 96);
        setByteElement(term380, 8, (byte) 70);
        setField(term379, term379.getClass(), "blockBuffer", term380);
        setIntField(term379, term379.getClass(), "currBlkIdx", -1016503459);
        setIntField(term379, term379.getClass(), "currRecIdx", -1968847291);
        setIntField(term379, term379.getClass(), "blockSize", 579005622);
        setIntField(term379, term379.getClass(), "recordSize", -14890619);
        setIntField(term379, term379.getClass(), "recsPerBlock", 1632125673);
        setField(term358, term358.getClass(), "buffer", term379);
        setIntField(term358, term358.getClass(), "longFileMode", 454281060);
        setBooleanField(term358, term358.getClass(), "closed", false);
        setBooleanField(term358, term358.getClass(), "haveUnclosedEntry", true);
        setField(term358, term358.getClass(), "out", null);
        setByteElement(term398, 0, (byte) 48);
        setByteElement(term398, 1, (byte) -46);
        setByteElement(term398, 2, (byte) -128);
        setField(term358, term358.getClass(), "oneByte", term398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term358, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


