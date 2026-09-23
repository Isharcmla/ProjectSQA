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

public class TarArchiveOutputStream_putArchiveEntry_53641996442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;

    public TarArchiveOutputStream_putArchiveEntry_53641996442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term708 = (byte[]) newByteArray(2);
        byte[] term712 = (byte[]) newByteArray(5);
        Object term718 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term722 = (byte[]) newByteArray(3);
        byte[] term734 = (byte[]) newByteArray(5);
        setLongField(term693, term693.getClass(), "currSize", 2486810210675247493L);
        setField(term693, term693.getClass(), "currName", "uuaPigETmJ");
        setLongField(term693, term693.getClass(), "currBytes", 7009926388951271268L);
        setByteElement(term708, 0, (byte) -22);
        setByteElement(term708, 1, (byte) -5);
        setField(term693, term693.getClass(), "recordBuf", term708);
        setIntField(term693, term693.getClass(), "assemLen", -1772434990);
        setByteElement(term712, 0, (byte) -124);
        setByteElement(term712, 1, (byte) -105);
        setByteElement(term712, 2, (byte) 25);
        setByteElement(term712, 3, (byte) 16);
        setByteElement(term712, 4, (byte) 39);
        setField(term693, term693.getClass(), "assemBuf", term712);
        setField(term718, term718.getClass(), "inStream", null);
        setField(term718, term718.getClass(), "outStream", null);
        setIntField(term718, term718.getClass(), "blockSize", -1845499264);
        setIntField(term718, term718.getClass(), "recordSize", -505439934);
        setIntField(term718, term718.getClass(), "recsPerBlock", -344842608);
        setByteElement(term722, 0, (byte) 123);
        setByteElement(term722, 1, (byte) 16);
        setByteElement(term722, 2, (byte) 2);
        setField(term718, term718.getClass(), "blockBuffer", term722);
        setIntField(term718, term718.getClass(), "currBlkIdx", 941650513);
        setIntField(term718, term718.getClass(), "currRecIdx", 444029505);
        setField(term693, term693.getClass(), "buffer", term718);
        setIntField(term693, term693.getClass(), "longFileMode", -1034506028);
        setIntField(term693, term693.getClass(), "bigNumberMode", -1263114719);
        setBooleanField(term693, term693.getClass(), "closed", true);
        setBooleanField(term693, term693.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term693, term693.getClass(), "finished", true);
        setField(term693, term693.getClass(), "out", null);
        setField(term693, term693.getClass(), "encoding", null);
        setBooleanField(term693, term693.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term734, 0, (byte) -120);
        setByteElement(term734, 1, (byte) 96);
        setByteElement(term734, 2, (byte) -41);
        setByteElement(term734, 3, (byte) -88);
        setByteElement(term734, 4, (byte) 39);
        setField(term693, term693.getClass(), "oneByte", term734);
        setLongField(term693, term693.getClass(), "bytesWritten", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term693, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


