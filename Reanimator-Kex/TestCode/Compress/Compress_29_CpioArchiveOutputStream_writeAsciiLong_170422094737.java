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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;

public class CpioArchiveOutputStream_writeAsciiLong_170422094737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1208;
     Object term1273;
     Object term1275;
     Object term1277;

    public CpioArchiveOutputStream_writeAsciiLong_170422094737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1240 = new HashMap();
        term1208 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1209 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1269 = (byte[]) newByteArray(2);
        setShortField(term1209, term1209.getClass(), "fileFormat", (short) -11581);
        setIntField(term1209, term1209.getClass(), "headerSize", 335112684);
        setIntField(term1209, term1209.getClass(), "alignmentBoundary", 1551099402);
        setLongField(term1209, term1209.getClass(), "chksum", 1442167273909860961L);
        setLongField(term1209, term1209.getClass(), "filesize", 6895382576300001141L);
        setLongField(term1209, term1209.getClass(), "gid", 9062006526792682783L);
        setLongField(term1209, term1209.getClass(), "inode", -7400951017937830861L);
        setLongField(term1209, term1209.getClass(), "maj", -8993073054427011802L);
        setLongField(term1209, term1209.getClass(), "min", 2287785643837657068L);
        setLongField(term1209, term1209.getClass(), "mode", -7283193381993602128L);
        setLongField(term1209, term1209.getClass(), "mtime", 6351887424140565471L);
        setField(term1209, term1209.getClass(), "name", "gGSMzuGICf");
        setLongField(term1209, term1209.getClass(), "nlink", 6273670659288205855L);
        setLongField(term1209, term1209.getClass(), "rmaj", -4776514981294468834L);
        setLongField(term1209, term1209.getClass(), "rmin", -7273680182770718108L);
        setLongField(term1209, term1209.getClass(), "uid", -421166328269063791L);
        setField(term1208, term1208.getClass(), "entry", term1209);
        setBooleanField(term1208, term1208.getClass(), "closed", false);
        setBooleanField(term1208, term1208.getClass(), "finished", false);
        setShortField(term1208, term1208.getClass(), "entryFormat", (short) 7339);
        setField(term1208, term1208.getClass(), "names", term1240);
        setLongField(term1208, term1208.getClass(), "crc", -8211859616692114655L);
        setLongField(term1208, term1208.getClass(), "written", 7487838449539103993L);
        setField(term1208, term1208.getClass(), "out", null);
        setIntField(term1208, term1208.getClass(), "blockSize", 1375330971);
        setLongField(term1208, term1208.getClass(), "nextArtificalDeviceAndInode", 7010148136855890340L);
        setField(term1208, term1208.getClass(), "zipEncoding", null);
        setByteElement(term1269, 0, (byte) 98);
        setByteElement(term1269, 1, (byte) 79);
        setField(term1208, term1208.getClass(), "oneByte", term1269);
        setLongField(term1208, term1208.getClass(), "bytesWritten", -6771377873268167033L);
        term1273 = new Long(1278107327214302894L);
        term1275 = new Integer(-478195677);
        term1277 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1273;
        args[1] = term1275;
        args[2] = term1277;
        try {
            callMethod(klass, "writeAsciiLong", argTypes, term1208, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


