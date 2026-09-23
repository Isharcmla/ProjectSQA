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

public class CpioArchiveOutputStream_closeArchiveEntry_68001739731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term725 = new HashMap();
        term693 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term694 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term754 = (byte[]) newByteArray(2);
        setShortField(term694, term694.getClass(), "fileFormat", (short) -9327);
        setIntField(term694, term694.getClass(), "headerSize", 1962444399);
        setIntField(term694, term694.getClass(), "alignmentBoundary", 767834723);
        setLongField(term694, term694.getClass(), "chksum", 3230472384687362867L);
        setLongField(term694, term694.getClass(), "filesize", -1145146470850585022L);
        setLongField(term694, term694.getClass(), "gid", 1993646237353405740L);
        setLongField(term694, term694.getClass(), "inode", -4043093655001688454L);
        setLongField(term694, term694.getClass(), "maj", -419800263764810394L);
        setLongField(term694, term694.getClass(), "min", 5904678961906211249L);
        setLongField(term694, term694.getClass(), "mode", -1820639665251914495L);
        setLongField(term694, term694.getClass(), "mtime", 3238645206498300107L);
        setField(term694, term694.getClass(), "name", "BYqFIqCKAV");
        setLongField(term694, term694.getClass(), "nlink", -1592696983130738594L);
        setLongField(term694, term694.getClass(), "rmaj", 6902365338255307910L);
        setLongField(term694, term694.getClass(), "rmin", -8019730974733786399L);
        setLongField(term694, term694.getClass(), "uid", 394960377236392159L);
        setField(term693, term693.getClass(), "entry", term694);
        setBooleanField(term693, term693.getClass(), "closed", true);
        setBooleanField(term693, term693.getClass(), "finished", false);
        setShortField(term693, term693.getClass(), "entryFormat", (short) 16151);
        setField(term693, term693.getClass(), "names", term725);
        setLongField(term693, term693.getClass(), "crc", -3277773415369003529L);
        setLongField(term693, term693.getClass(), "written", 1253549421411622358L);
        setField(term693, term693.getClass(), "out", null);
        setIntField(term693, term693.getClass(), "blockSize", 1876565163);
        setLongField(term693, term693.getClass(), "nextArtificalDeviceAndInode", 3666226122807672448L);
        setField(term693, term693.getClass(), "zipEncoding", null);
        setByteElement(term754, 0, (byte) -16);
        setByteElement(term754, 1, (byte) -112);
        setField(term693, term693.getClass(), "oneByte", term754);
        setLongField(term693, term693.getClass(), "bytesWritten", 3108750145697087661L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term693, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


