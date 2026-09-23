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
import java.lang.Integer;

public class TarArchiveOutputStream_write_164325068022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;
     Object term489;
     Object term497;
     Object term499;

    public TarArchiveOutputStream_write_164325068022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term454 = (byte[]) newByteArray(5);
        byte[] term461 = (byte[]) newByteArray(6);
        Object term468 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term469 = (byte[]) newByteArray(5);
        byte[] term484 = (byte[]) newByteArray(3);
        setLongField(term439, term439.getClass(), "currSize", -6573104506744284592L);
        setField(term439, term439.getClass(), "currName", "SzjVpOQTyS");
        setLongField(term439, term439.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term454, 0, (byte) 66);
        setByteElement(term454, 1, (byte) -112);
        setByteElement(term454, 2, (byte) 81);
        setByteElement(term454, 3, (byte) 65);
        setByteElement(term454, 4, (byte) -44);
        setField(term439, term439.getClass(), "recordBuf", term454);
        setIntField(term439, term439.getClass(), "assemLen", 2055867847);
        setByteElement(term461, 0, (byte) 33);
        setByteElement(term461, 1, (byte) -74);
        setByteElement(term461, 2, (byte) -84);
        setByteElement(term461, 3, (byte) -53);
        setByteElement(term461, 4, (byte) -93);
        setByteElement(term461, 5, (byte) 82);
        setField(term439, term439.getClass(), "assemBuf", term461);
        setField(term468, term468.getClass(), "inStream", null);
        setField(term468, term468.getClass(), "outStream", null);
        setByteElement(term469, 0, (byte) -89);
        setByteElement(term469, 1, (byte) 24);
        setByteElement(term469, 2, (byte) 123);
        setByteElement(term469, 3, (byte) -101);
        setByteElement(term469, 4, (byte) -102);
        setField(term468, term468.getClass(), "blockBuffer", term469);
        setIntField(term468, term468.getClass(), "currBlkIdx", -1048298087);
        setIntField(term468, term468.getClass(), "currRecIdx", 292681826);
        setIntField(term468, term468.getClass(), "blockSize", 458147407);
        setIntField(term468, term468.getClass(), "recordSize", -184153539);
        setIntField(term468, term468.getClass(), "recsPerBlock", 493620644);
        setField(term439, term439.getClass(), "buffer", term468);
        setIntField(term439, term439.getClass(), "longFileMode", 1328271830);
        setBooleanField(term439, term439.getClass(), "closed", false);
        setBooleanField(term439, term439.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term439, term439.getClass(), "finished", true);
        setField(term439, term439.getClass(), "out", null);
        setByteElement(term484, 0, (byte) -95);
        setByteElement(term484, 1, (byte) -2);
        setByteElement(term484, 2, (byte) 28);
        setField(term439, term439.getClass(), "oneByte", term484);
        setLongField(term439, term439.getClass(), "bytesWritten", 8428634514691209827L);
        term489 = (byte[]) newByteArray(7);
        setByteElement(term489, 0, (byte) 84);
        setByteElement(term489, 1, (byte) 85);
        setByteElement(term489, 2, (byte) -17);
        setByteElement(term489, 3, (byte) -83);
        setByteElement(term489, 4, (byte) 48);
        setByteElement(term489, 5, (byte) -128);
        setByteElement(term489, 6, (byte) 70);
        term497 = new Integer(1596070772);
        term499 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term489;
        args[1] = term497;
        args[2] = term499;
        try {
            callMethod(klass, "write", argTypes, term439, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


