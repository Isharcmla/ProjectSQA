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
     Object term421;
     Object term468;
     Object term476;
     Object term478;

    public TarArchiveOutputStream_write_164325068022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term436 = (byte[]) newByteArray(5);
        byte[] term443 = (byte[]) newByteArray(6);
        Object term450 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term451 = (byte[]) newByteArray(5);
        byte[] term464 = (byte[]) newByteArray(3);
        setLongField(term421, term421.getClass(), "currSize", -4325723315152823407L);
        setField(term421, term421.getClass(), "currName", "SzjVpOQTyS");
        setLongField(term421, term421.getClass(), "currBytes", 2535595959091595249L);
        setByteElement(term436, 0, (byte) 66);
        setByteElement(term436, 1, (byte) -112);
        setByteElement(term436, 2, (byte) 81);
        setByteElement(term436, 3, (byte) 65);
        setByteElement(term436, 4, (byte) -44);
        setField(term421, term421.getClass(), "recordBuf", term436);
        setIntField(term421, term421.getClass(), "assemLen", 2055867847);
        setByteElement(term443, 0, (byte) 33);
        setByteElement(term443, 1, (byte) -74);
        setByteElement(term443, 2, (byte) -84);
        setByteElement(term443, 3, (byte) -53);
        setByteElement(term443, 4, (byte) -93);
        setByteElement(term443, 5, (byte) 82);
        setField(term421, term421.getClass(), "assemBuf", term443);
        setField(term450, term450.getClass(), "inStream", null);
        setField(term450, term450.getClass(), "outStream", null);
        setByteElement(term451, 0, (byte) -89);
        setByteElement(term451, 1, (byte) 24);
        setByteElement(term451, 2, (byte) 123);
        setByteElement(term451, 3, (byte) -101);
        setByteElement(term451, 4, (byte) -102);
        setField(term450, term450.getClass(), "blockBuffer", term451);
        setIntField(term450, term450.getClass(), "currBlkIdx", -1048298087);
        setIntField(term450, term450.getClass(), "currRecIdx", 292681826);
        setIntField(term450, term450.getClass(), "blockSize", 458147407);
        setIntField(term450, term450.getClass(), "recordSize", -184153539);
        setIntField(term450, term450.getClass(), "recsPerBlock", 493620644);
        setField(term421, term421.getClass(), "buffer", term450);
        setIntField(term421, term421.getClass(), "longFileMode", 1328271830);
        setBooleanField(term421, term421.getClass(), "closed", true);
        setField(term421, term421.getClass(), "out", null);
        setByteElement(term464, 0, (byte) -95);
        setByteElement(term464, 1, (byte) -2);
        setByteElement(term464, 2, (byte) 28);
        setField(term421, term421.getClass(), "oneByte", term464);
        term468 = (byte[]) newByteArray(7);
        setByteElement(term468, 0, (byte) 84);
        setByteElement(term468, 1, (byte) 85);
        setByteElement(term468, 2, (byte) -17);
        setByteElement(term468, 3, (byte) -83);
        setByteElement(term468, 4, (byte) 48);
        setByteElement(term468, 5, (byte) -128);
        setByteElement(term468, 6, (byte) 70);
        term476 = new Integer(1596070772);
        term478 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term468;
        args[1] = term476;
        args[2] = term478;
        try {
            callMethod(klass, "write", argTypes, term421, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


