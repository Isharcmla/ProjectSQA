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

public class CpioArchiveInputStream_closeEntry_115905960228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public CpioArchiveInputStream_closeEntry_115905960228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term229 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term259 = (byte[]) newByteArray(6);
        byte[] term267 = (byte[]) newByteArray(5);
        byte[] term273 = (byte[]) newByteArray(5);
        byte[] term279 = (byte[]) newByteArray(2);
        byte[] term283 = (byte[]) newByteArray(3);
        setBooleanField(term227, term227.getClass(), "closed", true);
        setShortField(term229, term229.getClass(), "fileFormat", (short) -1703);
        setIntField(term229, term229.getClass(), "headerSize", 1227103734);
        setIntField(term229, term229.getClass(), "alignmentBoundary", -1339778481);
        setLongField(term229, term229.getClass(), "chksum", 6855071767938501807L);
        setLongField(term229, term229.getClass(), "filesize", -5892135042702373494L);
        setLongField(term229, term229.getClass(), "gid", 5262507301787091109L);
        setLongField(term229, term229.getClass(), "inode", -6823727938421990489L);
        setLongField(term229, term229.getClass(), "maj", -484994522244390100L);
        setLongField(term229, term229.getClass(), "min", 1233889271256172047L);
        setLongField(term229, term229.getClass(), "mode", 6617340557564669657L);
        setLongField(term229, term229.getClass(), "mtime", 1439298019805881866L);
        setField(term229, term229.getClass(), "name", "jJCZpVmanW");
        setLongField(term229, term229.getClass(), "nlink", -8708192233349544946L);
        setLongField(term229, term229.getClass(), "rmaj", 5907001541142728739L);
        setLongField(term229, term229.getClass(), "rmin", 4178434741742309755L);
        setLongField(term229, term229.getClass(), "uid", -2068172595987555756L);
        setField(term227, term227.getClass(), "entry", term229);
        setLongField(term227, term227.getClass(), "entryBytesRead", -6292278961887936280L);
        setBooleanField(term227, term227.getClass(), "entryEOF", true);
        setByteElement(term259, 0, (byte) 72);
        setByteElement(term259, 1, (byte) 111);
        setByteElement(term259, 2, (byte) 99);
        setByteElement(term259, 3, (byte) -12);
        setByteElement(term259, 4, (byte) -61);
        setByteElement(term259, 5, (byte) -85);
        setField(term227, term227.getClass(), "tmpbuf", term259);
        setLongField(term227, term227.getClass(), "crc", -6645965768855543712L);
        setField(term227, term227.getClass(), "in", null);
        setByteElement(term267, 0, (byte) -22);
        setByteElement(term267, 1, (byte) 93);
        setByteElement(term267, 2, (byte) 69);
        setByteElement(term267, 3, (byte) -74);
        setByteElement(term267, 4, (byte) -123);
        setField(term227, term227.getClass(), "TWO_BYTES_BUF", term267);
        setByteElement(term273, 0, (byte) -23);
        setByteElement(term273, 1, (byte) 100);
        setByteElement(term273, 2, (byte) 106);
        setByteElement(term273, 3, (byte) -57);
        setByteElement(term273, 4, (byte) -103);
        setField(term227, term227.getClass(), "FOUR_BYTES_BUF", term273);
        setByteElement(term279, 0, (byte) 98);
        setByteElement(term279, 1, (byte) 79);
        setField(term227, term227.getClass(), "SIX_BYTES_BUF", term279);
        setIntField(term227, term227.getClass(), "blockSize", 1725571209);
        setField(term227, term227.getClass(), "zipEncoding", null);
        setByteElement(term283, 0, (byte) 61);
        setByteElement(term283, 1, (byte) -92);
        setByteElement(term283, 2, (byte) -42);
        setField(term227, term227.getClass(), "SINGLE", term283);
        setLongField(term227, term227.getClass(), "bytesRead", 4784595517102746672L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeEntry", argTypes, term227, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


