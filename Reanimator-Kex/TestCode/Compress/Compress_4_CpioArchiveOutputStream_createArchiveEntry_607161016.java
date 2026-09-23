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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class CpioArchiveOutputStream_createArchiveEntry_607161016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;
     Object term1059;

    public CpioArchiveOutputStream_createArchiveEntry_607161016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1050 = new HashMap();
        term1018 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1019 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1057 = (byte[]) newByteArray(1);
        setShortField(term1019, term1019.getClass(), "fileFormat", (short) -21950);
        setIntField(term1019, term1019.getClass(), "headerSize", -602026508);
        setIntField(term1019, term1019.getClass(), "alignmentBoundary", -157887805);
        setLongField(term1019, term1019.getClass(), "chksum", -7456852906235966771L);
        setLongField(term1019, term1019.getClass(), "filesize", -67485388932970712L);
        setLongField(term1019, term1019.getClass(), "gid", 5806367330808555223L);
        setLongField(term1019, term1019.getClass(), "inode", 4576699120365923235L);
        setLongField(term1019, term1019.getClass(), "maj", -1635471392209071620L);
        setLongField(term1019, term1019.getClass(), "min", -4714000263923324167L);
        setLongField(term1019, term1019.getClass(), "mode", 6906379511067694917L);
        setLongField(term1019, term1019.getClass(), "mtime", -9204303423581447271L);
        setField(term1019, term1019.getClass(), "name", "pCTimMblYc");
        setLongField(term1019, term1019.getClass(), "nlink", 6248239231585852341L);
        setLongField(term1019, term1019.getClass(), "rmaj", -88538481937688851L);
        setLongField(term1019, term1019.getClass(), "rmin", 4069264186851023313L);
        setLongField(term1019, term1019.getClass(), "uid", 5184635470881147510L);
        setField(term1018, term1018.getClass(), "entry", term1019);
        setBooleanField(term1018, term1018.getClass(), "closed", true);
        setBooleanField(term1018, term1018.getClass(), "finished", true);
        setShortField(term1018, term1018.getClass(), "entryFormat", (short) 10887);
        setField(term1018, term1018.getClass(), "names", term1050);
        setLongField(term1018, term1018.getClass(), "crc", 918397384129253729L);
        setLongField(term1018, term1018.getClass(), "written", -2187638136407967948L);
        setField(term1018, term1018.getClass(), "out", null);
        setByteElement(term1057, 0, (byte) 116);
        setField(term1018, term1018.getClass(), "oneByte", term1057);
        Class<? extends Object> term1140 = Class.forName((String) "java.io.File$PathStatus");
        Field term1139 = ((Class) term1140).getDeclaredField((String) "INVALID");
        ((Field) term1139).setAccessible(true);
        Object enum0 = ((Field) term1139).get((Object) null);
        term1059 = newInstance(Class.forName("java.io.File"));
        setField(term1059, term1059.getClass(), "path", "hNxWaHcfhY");
        setField(term1059, term1059.getClass(), "status", enum0);
        setIntField(term1059, term1059.getClass(), "prefixLength", 1876565163);
        setField(term1059, term1059.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1059;
        args[1] = "RkybSrpybU";
        callMethod(klass, "createArchiveEntry", argTypes, term1018, args);
    }

};


