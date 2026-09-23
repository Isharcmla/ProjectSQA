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

public class CpioArchiveInputStream_closeEntry_115905960224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public CpioArchiveInputStream_closeEntry_115905960224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term183 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term213 = (byte[]) newByteArray(6);
        byte[] term221 = (byte[]) newByteArray(5);
        byte[] term227 = (byte[]) newByteArray(5);
        byte[] term233 = (byte[]) newByteArray(2);
        byte[] term237 = (byte[]) newByteArray(3);
        setBooleanField(term181, term181.getClass(), "closed", true);
        setShortField(term183, term183.getClass(), "fileFormat", (short) -1703);
        setIntField(term183, term183.getClass(), "headerSize", -2038273078);
        setIntField(term183, term183.getClass(), "alignmentBoundary", 1227103734);
        setLongField(term183, term183.getClass(), "chksum", 6855071767938501807L);
        setLongField(term183, term183.getClass(), "filesize", -5892135042702373494L);
        setLongField(term183, term183.getClass(), "gid", 5262507301787091109L);
        setLongField(term183, term183.getClass(), "inode", -6823727938421990489L);
        setLongField(term183, term183.getClass(), "maj", -484994522244390100L);
        setLongField(term183, term183.getClass(), "min", 1233889271256172047L);
        setLongField(term183, term183.getClass(), "mode", 6617340557564669657L);
        setLongField(term183, term183.getClass(), "mtime", 1439298019805881866L);
        setField(term183, term183.getClass(), "name", "MuLcgQHgqz");
        setLongField(term183, term183.getClass(), "nlink", -8708192233349544946L);
        setLongField(term183, term183.getClass(), "rmaj", 5907001541142728739L);
        setLongField(term183, term183.getClass(), "rmin", 4178434741742309755L);
        setLongField(term183, term183.getClass(), "uid", -2068172595987555756L);
        setField(term181, term181.getClass(), "entry", term183);
        setLongField(term181, term181.getClass(), "entryBytesRead", -6292278961887936280L);
        setBooleanField(term181, term181.getClass(), "entryEOF", true);
        setByteElement(term213, 0, (byte) 72);
        setByteElement(term213, 1, (byte) 111);
        setByteElement(term213, 2, (byte) 99);
        setByteElement(term213, 3, (byte) -12);
        setByteElement(term213, 4, (byte) -61);
        setByteElement(term213, 5, (byte) -85);
        setField(term181, term181.getClass(), "tmpbuf", term213);
        setLongField(term181, term181.getClass(), "crc", -6645965768855543712L);
        setField(term181, term181.getClass(), "in", null);
        setByteElement(term221, 0, (byte) -22);
        setByteElement(term221, 1, (byte) 93);
        setByteElement(term221, 2, (byte) 69);
        setByteElement(term221, 3, (byte) -74);
        setByteElement(term221, 4, (byte) -123);
        setField(term181, term181.getClass(), "TWO_BYTES_BUF", term221);
        setByteElement(term227, 0, (byte) -23);
        setByteElement(term227, 1, (byte) 100);
        setByteElement(term227, 2, (byte) 106);
        setByteElement(term227, 3, (byte) -57);
        setByteElement(term227, 4, (byte) -103);
        setField(term181, term181.getClass(), "FOUR_BYTES_BUF", term227);
        setByteElement(term233, 0, (byte) 98);
        setByteElement(term233, 1, (byte) 79);
        setField(term181, term181.getClass(), "SIX_BYTES_BUF", term233);
        setIntField(term181, term181.getClass(), "blockSize", -1339778481);
        setByteElement(term237, 0, (byte) 61);
        setByteElement(term237, 1, (byte) -92);
        setByteElement(term237, 2, (byte) -42);
        setField(term181, term181.getClass(), "SINGLE", term237);
        setLongField(term181, term181.getClass(), "bytesRead", 4784595517102746672L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeEntry", argTypes, term181, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


