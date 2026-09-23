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

public class TarArchiveOutputStream_writeEOFRecord_106353833923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;

    public TarArchiveOutputStream_writeEOFRecord_106353833923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term552 = (byte[]) newByteArray(2);
        byte[] term556 = (byte[]) newByteArray(6);
        Object term563 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term564 = (byte[]) newByteArray(6);
        byte[] term580 = (byte[]) newByteArray(2);
        setLongField(term537, term537.getClass(), "currSize", -2585684163342970173L);
        setField(term537, term537.getClass(), "currName", "MjGYSRKTNF");
        setLongField(term537, term537.getClass(), "currBytes", 8059786003080744426L);
        setByteElement(term552, 0, (byte) -28);
        setByteElement(term552, 1, (byte) 115);
        setField(term537, term537.getClass(), "recordBuf", term552);
        setIntField(term537, term537.getClass(), "assemLen", -2095575670);
        setByteElement(term556, 0, (byte) 96);
        setByteElement(term556, 1, (byte) 51);
        setByteElement(term556, 2, (byte) -53);
        setByteElement(term556, 3, (byte) -8);
        setByteElement(term556, 4, (byte) -9);
        setByteElement(term556, 5, (byte) 97);
        setField(term537, term537.getClass(), "assemBuf", term556);
        setField(term563, term563.getClass(), "inStream", null);
        setField(term563, term563.getClass(), "outStream", null);
        setByteElement(term564, 0, (byte) -46);
        setByteElement(term564, 1, (byte) 14);
        setByteElement(term564, 2, (byte) 34);
        setByteElement(term564, 3, (byte) 126);
        setByteElement(term564, 4, (byte) 7);
        setByteElement(term564, 5, (byte) -96);
        setField(term563, term563.getClass(), "blockBuffer", term564);
        setIntField(term563, term563.getClass(), "currBlkIdx", 1225272962);
        setIntField(term563, term563.getClass(), "currRecIdx", 1324040357);
        setIntField(term563, term563.getClass(), "blockSize", -1588772968);
        setIntField(term563, term563.getClass(), "recordSize", -93135961);
        setIntField(term563, term563.getClass(), "recsPerBlock", -112921587);
        setField(term537, term537.getClass(), "buffer", term563);
        setIntField(term537, term537.getClass(), "longFileMode", 933028652);
        setBooleanField(term537, term537.getClass(), "closed", true);
        setBooleanField(term537, term537.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term537, term537.getClass(), "finished", true);
        setField(term537, term537.getClass(), "out", null);
        setByteElement(term580, 0, (byte) -22);
        setByteElement(term580, 1, (byte) -5);
        setField(term537, term537.getClass(), "oneByte", term580);
        setLongField(term537, term537.getClass(), "bytesWritten", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term537, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


