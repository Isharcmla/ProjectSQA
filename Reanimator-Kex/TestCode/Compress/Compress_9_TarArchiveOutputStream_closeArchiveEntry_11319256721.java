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
     Object term368;

    public TarArchiveOutputStream_closeArchiveEntry_11319256721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term383 = (byte[]) newByteArray(2);
        byte[] term387 = (byte[]) newByteArray(1);
        Object term389 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term390 = (byte[]) newByteArray(9);
        byte[] term409 = (byte[]) newByteArray(3);
        setLongField(term368, term368.getClass(), "currSize", -872011222785455006L);
        setField(term368, term368.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term368, term368.getClass(), "currBytes", -316468845751588286L);
        setByteElement(term383, 0, (byte) 14);
        setByteElement(term383, 1, (byte) -101);
        setField(term368, term368.getClass(), "recordBuf", term383);
        setIntField(term368, term368.getClass(), "assemLen", -817164822);
        setByteElement(term387, 0, (byte) 35);
        setField(term368, term368.getClass(), "assemBuf", term387);
        setField(term389, term389.getClass(), "inStream", null);
        setField(term389, term389.getClass(), "outStream", null);
        setByteElement(term390, 0, (byte) 66);
        setByteElement(term390, 1, (byte) 123);
        setByteElement(term390, 2, (byte) -5);
        setByteElement(term390, 3, (byte) 84);
        setByteElement(term390, 4, (byte) -97);
        setByteElement(term390, 5, (byte) -24);
        setByteElement(term390, 6, (byte) 88);
        setByteElement(term390, 7, (byte) 96);
        setByteElement(term390, 8, (byte) 70);
        setField(term389, term389.getClass(), "blockBuffer", term390);
        setIntField(term389, term389.getClass(), "currBlkIdx", -1016503459);
        setIntField(term389, term389.getClass(), "currRecIdx", -1968847291);
        setIntField(term389, term389.getClass(), "blockSize", 579005622);
        setIntField(term389, term389.getClass(), "recordSize", -14890619);
        setIntField(term389, term389.getClass(), "recsPerBlock", 1632125673);
        setField(term368, term368.getClass(), "buffer", term389);
        setIntField(term368, term368.getClass(), "longFileMode", 454281060);
        setBooleanField(term368, term368.getClass(), "closed", false);
        setBooleanField(term368, term368.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term368, term368.getClass(), "finished", true);
        setField(term368, term368.getClass(), "out", null);
        setByteElement(term409, 0, (byte) 48);
        setByteElement(term409, 1, (byte) -46);
        setByteElement(term409, 2, (byte) -128);
        setField(term368, term368.getClass(), "oneByte", term409);
        setLongField(term368, term368.getClass(), "bytesWritten", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term368, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


