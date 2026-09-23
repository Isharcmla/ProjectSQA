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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_stripTo7Bits_65758611918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177;

    public TarArchiveOutputStream_stripTo7Bits_65758611918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1177 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1192 = (byte[]) newByteArray(3);
        byte[] term1197 = (byte[]) newByteArray(4);
        Object term1202 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1206 = (byte[]) newByteArray(2);
        byte[] term1217 = (byte[]) newByteArray(5);
        setLongField(term1177, term1177.getClass(), "currSize", 6617340557564669657L);
        setField(term1177, term1177.getClass(), "currName", "IoAlmYsBwc");
        setLongField(term1177, term1177.getClass(), "currBytes", 1439298019805881866L);
        setByteElement(term1192, 0, (byte) -125);
        setByteElement(term1192, 1, (byte) 100);
        setByteElement(term1192, 2, (byte) -1);
        setField(term1177, term1177.getClass(), "recordBuf", term1192);
        setIntField(term1177, term1177.getClass(), "assemLen", 96566506);
        setByteElement(term1197, 0, (byte) -127);
        setByteElement(term1197, 1, (byte) -118);
        setByteElement(term1197, 2, (byte) 69);
        setByteElement(term1197, 3, (byte) 112);
        setField(term1177, term1177.getClass(), "assemBuf", term1197);
        setField(term1202, term1202.getClass(), "inStream", null);
        setField(term1202, term1202.getClass(), "outStream", null);
        setIntField(term1202, term1202.getClass(), "blockSize", -343325701);
        setIntField(term1202, term1202.getClass(), "recordSize", 107945604);
        setIntField(term1202, term1202.getClass(), "recsPerBlock", -1963464809);
        setByteElement(term1206, 0, (byte) 77);
        setByteElement(term1206, 1, (byte) -1);
        setField(term1202, term1202.getClass(), "blockBuffer", term1206);
        setIntField(term1202, term1202.getClass(), "currBlkIdx", 71190297);
        setIntField(term1202, term1202.getClass(), "currRecIdx", 1202361360);
        setField(term1177, term1177.getClass(), "buffer", term1202);
        setIntField(term1177, term1177.getClass(), "longFileMode", -2015048153);
        setIntField(term1177, term1177.getClass(), "bigNumberMode", -2063457669);
        setBooleanField(term1177, term1177.getClass(), "closed", true);
        setBooleanField(term1177, term1177.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1177, term1177.getClass(), "finished", false);
        setField(term1177, term1177.getClass(), "out", null);
        setField(term1177, term1177.getClass(), "encoding", null);
        setBooleanField(term1177, term1177.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term1217, 0, (byte) -83);
        setByteElement(term1217, 1, (byte) -63);
        setByteElement(term1217, 2, (byte) 108);
        setByteElement(term1217, 3, (byte) -105);
        setByteElement(term1217, 4, (byte) 33);
        setField(term1177, term1177.getClass(), "oneByte", term1217);
        setLongField(term1177, term1177.getClass(), "bytesWritten", -8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "stripTo7Bits", argTypes, term1177, args);
    }

};


