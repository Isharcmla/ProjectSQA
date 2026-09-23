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

public class TarArchiveOutputStream_finish_37385763439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;

    public TarArchiveOutputStream_finish_37385763439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term469 = (byte[]) newByteArray(2);
        byte[] term473 = (byte[]) newByteArray(1);
        Object term475 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term479 = (byte[]) newByteArray(9);
        byte[] term497 = (byte[]) newByteArray(3);
        setLongField(term454, term454.getClass(), "currSize", -872011222785455006L);
        setField(term454, term454.getClass(), "currName", "hRNSzYYIrc");
        setLongField(term454, term454.getClass(), "currBytes", -316468845751588286L);
        setByteElement(term469, 0, (byte) 14);
        setByteElement(term469, 1, (byte) -101);
        setField(term454, term454.getClass(), "recordBuf", term469);
        setIntField(term454, term454.getClass(), "assemLen", 1596070772);
        setByteElement(term473, 0, (byte) 35);
        setField(term454, term454.getClass(), "assemBuf", term473);
        setField(term475, term475.getClass(), "inStream", null);
        setField(term475, term475.getClass(), "outStream", null);
        setIntField(term475, term475.getClass(), "blockSize", 97029295);
        setIntField(term475, term475.getClass(), "recordSize", -1371869594);
        setIntField(term475, term475.getClass(), "recsPerBlock", -2095575670);
        setByteElement(term479, 0, (byte) 66);
        setByteElement(term479, 1, (byte) 123);
        setByteElement(term479, 2, (byte) -5);
        setByteElement(term479, 3, (byte) 84);
        setByteElement(term479, 4, (byte) -97);
        setByteElement(term479, 5, (byte) -24);
        setByteElement(term479, 6, (byte) 88);
        setByteElement(term479, 7, (byte) 96);
        setByteElement(term479, 8, (byte) 70);
        setField(term475, term475.getClass(), "blockBuffer", term479);
        setIntField(term475, term475.getClass(), "currBlkIdx", 1225272962);
        setIntField(term475, term475.getClass(), "currRecIdx", 1324040357);
        setField(term454, term454.getClass(), "buffer", term475);
        setIntField(term454, term454.getClass(), "longFileMode", -1588772968);
        setIntField(term454, term454.getClass(), "bigNumberMode", -93135961);
        setBooleanField(term454, term454.getClass(), "closed", true);
        setBooleanField(term454, term454.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term454, term454.getClass(), "finished", true);
        setField(term454, term454.getClass(), "out", null);
        setField(term454, term454.getClass(), "encoding", null);
        setBooleanField(term454, term454.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term497, 0, (byte) 48);
        setByteElement(term497, 1, (byte) -46);
        setByteElement(term497, 2, (byte) -128);
        setField(term454, term454.getClass(), "oneByte", term497);
        setLongField(term454, term454.getClass(), "bytesWritten", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term454, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


