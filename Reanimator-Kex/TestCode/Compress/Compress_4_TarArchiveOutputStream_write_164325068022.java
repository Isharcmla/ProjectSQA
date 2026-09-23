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
     Object term427;
     Object term475;
     Object term483;
     Object term485;

    public TarArchiveOutputStream_write_164325068022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term442 = (byte[]) newByteArray(5);
        byte[] term449 = (byte[]) newByteArray(6);
        Object term456 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term457 = (byte[]) newByteArray(5);
        byte[] term471 = (byte[]) newByteArray(3);
        setLongField(term427, term427.getClass(), "currSize", -4325723315152823407L);
        setField(term427, term427.getClass(), "currName", "SzjVpOQTyS");
        setLongField(term427, term427.getClass(), "currBytes", 2535595959091595249L);
        setByteElement(term442, 0, (byte) 66);
        setByteElement(term442, 1, (byte) -112);
        setByteElement(term442, 2, (byte) 81);
        setByteElement(term442, 3, (byte) 65);
        setByteElement(term442, 4, (byte) -44);
        setField(term427, term427.getClass(), "recordBuf", term442);
        setIntField(term427, term427.getClass(), "assemLen", 2055867847);
        setByteElement(term449, 0, (byte) 33);
        setByteElement(term449, 1, (byte) -74);
        setByteElement(term449, 2, (byte) -84);
        setByteElement(term449, 3, (byte) -53);
        setByteElement(term449, 4, (byte) -93);
        setByteElement(term449, 5, (byte) 82);
        setField(term427, term427.getClass(), "assemBuf", term449);
        setField(term456, term456.getClass(), "inStream", null);
        setField(term456, term456.getClass(), "outStream", null);
        setByteElement(term457, 0, (byte) -89);
        setByteElement(term457, 1, (byte) 24);
        setByteElement(term457, 2, (byte) 123);
        setByteElement(term457, 3, (byte) -101);
        setByteElement(term457, 4, (byte) -102);
        setField(term456, term456.getClass(), "blockBuffer", term457);
        setIntField(term456, term456.getClass(), "currBlkIdx", -1048298087);
        setIntField(term456, term456.getClass(), "currRecIdx", 292681826);
        setIntField(term456, term456.getClass(), "blockSize", 458147407);
        setIntField(term456, term456.getClass(), "recordSize", -184153539);
        setIntField(term456, term456.getClass(), "recsPerBlock", 493620644);
        setField(term427, term427.getClass(), "buffer", term456);
        setIntField(term427, term427.getClass(), "longFileMode", 1328271830);
        setBooleanField(term427, term427.getClass(), "closed", false);
        setBooleanField(term427, term427.getClass(), "haveUnclosedEntry", true);
        setField(term427, term427.getClass(), "out", null);
        setByteElement(term471, 0, (byte) -95);
        setByteElement(term471, 1, (byte) -2);
        setByteElement(term471, 2, (byte) 28);
        setField(term427, term427.getClass(), "oneByte", term471);
        term475 = (byte[]) newByteArray(7);
        setByteElement(term475, 0, (byte) 84);
        setByteElement(term475, 1, (byte) 85);
        setByteElement(term475, 2, (byte) -17);
        setByteElement(term475, 3, (byte) -83);
        setByteElement(term475, 4, (byte) 48);
        setByteElement(term475, 5, (byte) -128);
        setByteElement(term475, 6, (byte) 70);
        term483 = new Integer(1596070772);
        term485 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term475;
        args[1] = term483;
        args[2] = term485;
        try {
            callMethod(klass, "write", argTypes, term427, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


