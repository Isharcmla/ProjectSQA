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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_getBytesWritten_207770530938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;

    public TarArchiveOutputStream_getBytesWritten_207770530938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term394 = (byte[]) newByteArray(0);
        byte[] term396 = (byte[]) newByteArray(2);
        Object term399 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term403 = (byte[]) newByteArray(8);
        byte[] term420 = (byte[]) newByteArray(6);
        setLongField(term379, term379.getClass(), "currSize", -4325723315152823407L);
        setField(term379, term379.getClass(), "currName", "MjGYSRKTNF");
        setLongField(term379, term379.getClass(), "currBytes", 2535595959091595249L);
        setField(term379, term379.getClass(), "recordBuf", term394);
        setIntField(term379, term379.getClass(), "assemLen", 1632125673);
        setByteElement(term396, 0, (byte) -81);
        setByteElement(term396, 1, (byte) 102);
        setField(term379, term379.getClass(), "assemBuf", term396);
        setField(term399, term399.getClass(), "inStream", null);
        setField(term399, term399.getClass(), "outStream", null);
        setIntField(term399, term399.getClass(), "blockSize", 454281060);
        setIntField(term399, term399.getClass(), "recordSize", -1786399638);
        setIntField(term399, term399.getClass(), "recsPerBlock", 2055867847);
        setByteElement(term403, 0, (byte) -118);
        setByteElement(term403, 1, (byte) -126);
        setByteElement(term403, 2, (byte) -91);
        setByteElement(term403, 3, (byte) -104);
        setByteElement(term403, 4, (byte) -89);
        setByteElement(term403, 5, (byte) 13);
        setByteElement(term403, 6, (byte) 44);
        setByteElement(term403, 7, (byte) -63);
        setField(term399, term399.getClass(), "blockBuffer", term403);
        setIntField(term399, term399.getClass(), "currBlkIdx", -1048298087);
        setIntField(term399, term399.getClass(), "currRecIdx", 292681826);
        setField(term379, term379.getClass(), "buffer", term399);
        setIntField(term379, term379.getClass(), "longFileMode", 458147407);
        setIntField(term379, term379.getClass(), "bigNumberMode", -184153539);
        setBooleanField(term379, term379.getClass(), "closed", true);
        setBooleanField(term379, term379.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term379, term379.getClass(), "finished", false);
        setField(term379, term379.getClass(), "out", null);
        setField(term379, term379.getClass(), "encoding", null);
        setBooleanField(term379, term379.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term420, 0, (byte) 15);
        setByteElement(term420, 1, (byte) 45);
        setByteElement(term420, 2, (byte) -39);
        setByteElement(term420, 3, (byte) -20);
        setByteElement(term420, 4, (byte) 10);
        setByteElement(term420, 5, (byte) 77);
        setField(term379, term379.getClass(), "oneByte", term420);
        setLongField(term379, term379.getClass(), "bytesWritten", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getBytesWritten", argTypes, term379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


