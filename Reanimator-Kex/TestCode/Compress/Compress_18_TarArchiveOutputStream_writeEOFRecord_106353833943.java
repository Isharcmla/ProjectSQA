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

public class TarArchiveOutputStream_writeEOFRecord_106353833943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1270;

    public TarArchiveOutputStream_writeEOFRecord_106353833943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1270 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1285 = (byte[]) newByteArray(0);
        byte[] term1287 = (byte[]) newByteArray(2);
        Object term1290 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1294 = (byte[]) newByteArray(7);
        byte[] term1310 = (byte[]) newByteArray(2);
        setLongField(term1270, term1270.getClass(), "currSize", 5907001541142728739L);
        setField(term1270, term1270.getClass(), "currName", "OWDIEULEFu");
        setLongField(term1270, term1270.getClass(), "currBytes", 4178434741742309755L);
        setField(term1270, term1270.getClass(), "recordBuf", term1285);
        setIntField(term1270, term1270.getClass(), "assemLen", -1565502840);
        setByteElement(term1287, 0, (byte) 109);
        setByteElement(term1287, 1, (byte) -54);
        setField(term1270, term1270.getClass(), "assemBuf", term1287);
        setField(term1290, term1290.getClass(), "inStream", null);
        setField(term1290, term1290.getClass(), "outStream", null);
        setIntField(term1290, term1290.getClass(), "blockSize", 344323424);
        setIntField(term1290, term1290.getClass(), "recordSize", 9726679);
        setIntField(term1290, term1290.getClass(), "recsPerBlock", -25637976);
        setByteElement(term1294, 0, (byte) -85);
        setByteElement(term1294, 1, (byte) 81);
        setByteElement(term1294, 2, (byte) -113);
        setByteElement(term1294, 3, (byte) 90);
        setByteElement(term1294, 4, (byte) 10);
        setByteElement(term1294, 5, (byte) 87);
        setByteElement(term1294, 6, (byte) -35);
        setField(term1290, term1290.getClass(), "blockBuffer", term1294);
        setIntField(term1290, term1290.getClass(), "currBlkIdx", 1555897383);
        setIntField(term1290, term1290.getClass(), "currRecIdx", 202001407);
        setField(term1270, term1270.getClass(), "buffer", term1290);
        setIntField(term1270, term1270.getClass(), "longFileMode", 158873461);
        setIntField(term1270, term1270.getClass(), "bigNumberMode", -430151637);
        setBooleanField(term1270, term1270.getClass(), "closed", false);
        setBooleanField(term1270, term1270.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1270, term1270.getClass(), "finished", false);
        setField(term1270, term1270.getClass(), "out", null);
        setField(term1270, term1270.getClass(), "encoding", null);
        setBooleanField(term1270, term1270.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1310, 0, (byte) -14);
        setByteElement(term1310, 1, (byte) 10);
        setField(term1270, term1270.getClass(), "oneByte", term1310);
        setLongField(term1270, term1270.getClass(), "bytesWritten", -2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term1270, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


