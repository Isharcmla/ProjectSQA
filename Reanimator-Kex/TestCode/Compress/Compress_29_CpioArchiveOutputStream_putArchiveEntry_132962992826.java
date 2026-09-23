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
import java.util.HashMap;

public class CpioArchiveOutputStream_putArchiveEntry_132962992826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;

    public CpioArchiveOutputStream_putArchiveEntry_132962992826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term170 = new HashMap();
        term138 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term139 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term199 = (byte[]) newByteArray(4);
        setShortField(term139, term139.getClass(), "fileFormat", (short) 30947);
        setIntField(term139, term139.getClass(), "headerSize", -2038273078);
        setIntField(term139, term139.getClass(), "alignmentBoundary", 1227103734);
        setLongField(term139, term139.getClass(), "chksum", 1967728129628047933L);
        setLongField(term139, term139.getClass(), "filesize", 2120084523938730454L);
        setLongField(term139, term139.getClass(), "gid", 6855071767938501807L);
        setLongField(term139, term139.getClass(), "inode", -5892135042702373494L);
        setLongField(term139, term139.getClass(), "maj", 5262507301787091109L);
        setLongField(term139, term139.getClass(), "min", -6823727938421990489L);
        setLongField(term139, term139.getClass(), "mode", -484994522244390100L);
        setLongField(term139, term139.getClass(), "mtime", 1233889271256172047L);
        setField(term139, term139.getClass(), "name", "EGtDIRbSSb");
        setLongField(term139, term139.getClass(), "nlink", 6617340557564669657L);
        setLongField(term139, term139.getClass(), "rmaj", 1439298019805881866L);
        setLongField(term139, term139.getClass(), "rmin", -8708192233349544946L);
        setLongField(term139, term139.getClass(), "uid", 5907001541142728739L);
        setField(term138, term138.getClass(), "entry", term139);
        setBooleanField(term138, term138.getClass(), "closed", false);
        setBooleanField(term138, term138.getClass(), "finished", false);
        setShortField(term138, term138.getClass(), "entryFormat", (short) 27594);
        setField(term138, term138.getClass(), "names", term170);
        setLongField(term138, term138.getClass(), "crc", -1154553077993834885L);
        setLongField(term138, term138.getClass(), "written", -2850532706972744550L);
        setField(term138, term138.getClass(), "out", null);
        setIntField(term138, term138.getClass(), "blockSize", -522618178);
        setLongField(term138, term138.getClass(), "nextArtificalDeviceAndInode", -2644215923136513282L);
        setField(term138, term138.getClass(), "zipEncoding", null);
        setByteElement(term199, 0, (byte) -58);
        setByteElement(term199, 1, (byte) -29);
        setByteElement(term199, 2, (byte) -54);
        setByteElement(term199, 3, (byte) -10);
        setField(term138, term138.getClass(), "oneByte", term199);
        setLongField(term138, term138.getClass(), "bytesWritten", -1468719814009985452L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term138, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


