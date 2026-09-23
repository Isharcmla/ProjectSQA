package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveInputStream_getNextEntry_196086562541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497;

    public CpioArchiveInputStream_getNextEntry_196086562541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1497 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1499 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1529 = (byte[]) newByteArray(6);
        byte[] term1537 = (byte[]) newByteArray(7);
        byte[] term1545 = (byte[]) newByteArray(0);
        byte[] term1546 = (byte[]) newByteArray(7);
        byte[] term1555 = (byte[]) newByteArray(1);
        setBooleanField(term1497, term1497.getClass(), "closed", true);
        setShortField(term1499, term1499.getClass(), "fileFormat", (short) -16335);
        setIntField(term1499, term1499.getClass(), "headerSize", 458147407);
        setIntField(term1499, term1499.getClass(), "alignmentBoundary", -184153539);
        setLongField(term1499, term1499.getClass(), "chksum", -8019730974733786399L);
        setLongField(term1499, term1499.getClass(), "filesize", 394960377236392159L);
        setLongField(term1499, term1499.getClass(), "gid", -2955854401507097864L);
        setLongField(term1499, term1499.getClass(), "inode", 329213208496958131L);
        setLongField(term1499, term1499.getClass(), "maj", 8107921244631636572L);
        setLongField(term1499, term1499.getClass(), "min", -7904053112604879960L);
        setLongField(term1499, term1499.getClass(), "mode", -6602460430714339690L);
        setLongField(term1499, term1499.getClass(), "mtime", 21047099434645581L);
        setField(term1499, term1499.getClass(), "name", "tbcdzjIfER");
        setLongField(term1499, term1499.getClass(), "nlink", -8862087040734407227L);
        setLongField(term1499, term1499.getClass(), "rmaj", -6394943900800506753L);
        setLongField(term1499, term1499.getClass(), "rmin", -4867941246533901410L);
        setLongField(term1499, term1499.getClass(), "uid", 1044883697493326351L);
        setField(term1497, term1497.getClass(), "entry", term1499);
        setLongField(term1497, term1497.getClass(), "entryBytesRead", -7406618974062419277L);
        setBooleanField(term1497, term1497.getClass(), "entryEOF", false);
        setByteElement(term1529, 0, (byte) 83);
        setByteElement(term1529, 1, (byte) -57);
        setByteElement(term1529, 2, (byte) 103);
        setByteElement(term1529, 3, (byte) 40);
        setByteElement(term1529, 4, (byte) -106);
        setByteElement(term1529, 5, (byte) -95);
        setField(term1497, term1497.getClass(), "tmpbuf", term1529);
        setLongField(term1497, term1497.getClass(), "crc", 868503089567085985L);
        setField(term1497, term1497.getClass(), "in", null);
        setByteElement(term1537, 0, (byte) 69);
        setByteElement(term1537, 1, (byte) 63);
        setByteElement(term1537, 2, (byte) -41);
        setByteElement(term1537, 3, (byte) -44);
        setByteElement(term1537, 4, (byte) -120);
        setByteElement(term1537, 5, (byte) -55);
        setByteElement(term1537, 6, (byte) 91);
        setField(term1497, term1497.getClass(), "TWO_BYTES_BUF", term1537);
        setField(term1497, term1497.getClass(), "FOUR_BYTES_BUF", term1545);
        setByteElement(term1546, 0, (byte) 55);
        setByteElement(term1546, 1, (byte) -5);
        setByteElement(term1546, 2, (byte) -4);
        setByteElement(term1546, 3, (byte) -61);
        setByteElement(term1546, 4, (byte) -34);
        setByteElement(term1546, 5, (byte) 73);
        setByteElement(term1546, 6, (byte) 10);
        setField(term1497, term1497.getClass(), "SIX_BYTES_BUF", term1546);
        setIntField(term1497, term1497.getClass(), "blockSize", 493620644);
        setField(term1497, term1497.getClass(), "zipEncoding", null);
        setByteElement(term1555, 0, (byte) 36);
        setField(term1497, term1497.getClass(), "SINGLE", term1555);
        setLongField(term1497, term1497.getClass(), "bytesRead", -3277773415369003529L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextEntry", argTypes, term1497, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


