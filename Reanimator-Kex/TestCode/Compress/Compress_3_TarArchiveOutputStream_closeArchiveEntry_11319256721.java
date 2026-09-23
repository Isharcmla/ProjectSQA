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
     Object term353;

    public TarArchiveOutputStream_closeArchiveEntry_11319256721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term368 = (byte[]) newByteArray(2);
        byte[] term372 = (byte[]) newByteArray(1);
        Object term374 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term375 = (byte[]) newByteArray(9);
        byte[] term392 = (byte[]) newByteArray(3);
        setLongField(term353, term353.getClass(), "currSize", -2813493605142626659L);
        setField(term353, term353.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term353, term353.getClass(), "currBytes", -8885298608300233488L);
        setByteElement(term368, 0, (byte) 14);
        setByteElement(term368, 1, (byte) -101);
        setField(term353, term353.getClass(), "recordBuf", term368);
        setIntField(term353, term353.getClass(), "assemLen", -817164822);
        setByteElement(term372, 0, (byte) 35);
        setField(term353, term353.getClass(), "assemBuf", term372);
        setField(term374, term374.getClass(), "inStream", null);
        setField(term374, term374.getClass(), "outStream", null);
        setByteElement(term375, 0, (byte) 66);
        setByteElement(term375, 1, (byte) 123);
        setByteElement(term375, 2, (byte) -5);
        setByteElement(term375, 3, (byte) 84);
        setByteElement(term375, 4, (byte) -97);
        setByteElement(term375, 5, (byte) -24);
        setByteElement(term375, 6, (byte) 88);
        setByteElement(term375, 7, (byte) 96);
        setByteElement(term375, 8, (byte) 70);
        setField(term374, term374.getClass(), "blockBuffer", term375);
        setIntField(term374, term374.getClass(), "currBlkIdx", -1016503459);
        setIntField(term374, term374.getClass(), "currRecIdx", -1968847291);
        setIntField(term374, term374.getClass(), "blockSize", 579005622);
        setIntField(term374, term374.getClass(), "recordSize", -14890619);
        setIntField(term374, term374.getClass(), "recsPerBlock", 1632125673);
        setField(term353, term353.getClass(), "buffer", term374);
        setIntField(term353, term353.getClass(), "longFileMode", 454281060);
        setBooleanField(term353, term353.getClass(), "closed", true);
        setField(term353, term353.getClass(), "out", null);
        setByteElement(term392, 0, (byte) 48);
        setByteElement(term392, 1, (byte) -46);
        setByteElement(term392, 2, (byte) -128);
        setField(term353, term353.getClass(), "oneByte", term392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term353, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


