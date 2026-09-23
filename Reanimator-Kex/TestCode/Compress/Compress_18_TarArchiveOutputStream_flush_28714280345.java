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

public class TarArchiveOutputStream_flush_28714280345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1335;

    public TarArchiveOutputStream_flush_28714280345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1335 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1350 = (byte[]) newByteArray(9);
        byte[] term1361 = (byte[]) newByteArray(7);
        Object term1369 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1373 = (byte[]) newByteArray(6);
        byte[] term1388 = (byte[]) newByteArray(7);
        setLongField(term1335, term1335.getClass(), "currSize", -6292278961887936280L);
        setField(term1335, term1335.getClass(), "currName", "dWRymuLBtr");
        setLongField(term1335, term1335.getClass(), "currBytes", -6645965768855543712L);
        setByteElement(term1350, 0, (byte) 65);
        setByteElement(term1350, 1, (byte) -44);
        setByteElement(term1350, 2, (byte) 115);
        setByteElement(term1350, 3, (byte) -32);
        setByteElement(term1350, 4, (byte) -52);
        setByteElement(term1350, 5, (byte) 53);
        setByteElement(term1350, 6, (byte) 44);
        setByteElement(term1350, 7, (byte) 49);
        setByteElement(term1350, 8, (byte) 114);
        setField(term1335, term1335.getClass(), "recordBuf", term1350);
        setIntField(term1335, term1335.getClass(), "assemLen", -1388471422);
        setByteElement(term1361, 0, (byte) -81);
        setByteElement(term1361, 1, (byte) 127);
        setByteElement(term1361, 2, (byte) -24);
        setByteElement(term1361, 3, (byte) -89);
        setByteElement(term1361, 4, (byte) -35);
        setByteElement(term1361, 5, (byte) -59);
        setByteElement(term1361, 6, (byte) 73);
        setField(term1335, term1335.getClass(), "assemBuf", term1361);
        setField(term1369, term1369.getClass(), "inStream", null);
        setField(term1369, term1369.getClass(), "outStream", null);
        setIntField(term1369, term1369.getClass(), "blockSize", -1498296052);
        setIntField(term1369, term1369.getClass(), "recordSize", 2098647989);
        setIntField(term1369, term1369.getClass(), "recsPerBlock", 1598895173);
        setByteElement(term1373, 0, (byte) 94);
        setByteElement(term1373, 1, (byte) 114);
        setByteElement(term1373, 2, (byte) 110);
        setByteElement(term1373, 3, (byte) 70);
        setByteElement(term1373, 4, (byte) -46);
        setByteElement(term1373, 5, (byte) -78);
        setField(term1369, term1369.getClass(), "blockBuffer", term1373);
        setIntField(term1369, term1369.getClass(), "currBlkIdx", 1830648570);
        setIntField(term1369, term1369.getClass(), "currRecIdx", -227365013);
        setField(term1335, term1335.getClass(), "buffer", term1369);
        setIntField(term1335, term1335.getClass(), "longFileMode", 11724947);
        setIntField(term1335, term1335.getClass(), "bigNumberMode", 1953277050);
        setBooleanField(term1335, term1335.getClass(), "closed", true);
        setBooleanField(term1335, term1335.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1335, term1335.getClass(), "finished", false);
        setField(term1335, term1335.getClass(), "out", null);
        setField(term1335, term1335.getClass(), "encoding", null);
        setBooleanField(term1335, term1335.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1388, 0, (byte) 109);
        setByteElement(term1388, 1, (byte) 17);
        setByteElement(term1388, 2, (byte) -126);
        setByteElement(term1388, 3, (byte) 35);
        setByteElement(term1388, 4, (byte) -46);
        setByteElement(term1388, 5, (byte) -14);
        setByteElement(term1388, 6, (byte) 124);
        setField(term1335, term1335.getClass(), "oneByte", term1388);
        setLongField(term1335, term1335.getClass(), "bytesWritten", 4784595517102746672L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term1335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


