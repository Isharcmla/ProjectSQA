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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_writeNewEntry_186184398122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;
     Object term259;

    public CpioArchiveOutputStream_writeNewEntry_186184398122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term247 = new HashMap();
        term215 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term216 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term254 = (byte[]) newByteArray(4);
        setShortField(term216, term216.getClass(), "fileFormat", (short) 7670);
        setIntField(term216, term216.getClass(), "headerSize", 1227103734);
        setIntField(term216, term216.getClass(), "alignmentBoundary", -1339778481);
        setLongField(term216, term216.getClass(), "chksum", -2644215923136513282L);
        setLongField(term216, term216.getClass(), "filesize", -1468719814009985452L);
        setLongField(term216, term216.getClass(), "gid", -7738503207562305297L);
        setLongField(term216, term216.getClass(), "inode", 3825396310311739952L);
        setLongField(term216, term216.getClass(), "maj", -3838084482494604218L);
        setLongField(term216, term216.getClass(), "min", 3892018155439224435L);
        setLongField(term216, term216.getClass(), "mode", 5953383087795962419L);
        setLongField(term216, term216.getClass(), "mtime", 7994303628307559416L);
        setField(term216, term216.getClass(), "name", "jJCZpVmanW");
        setLongField(term216, term216.getClass(), "nlink", 2443640364875054177L);
        setLongField(term216, term216.getClass(), "rmaj", -1610676979013636850L);
        setLongField(term216, term216.getClass(), "rmin", 2062173786000223358L);
        setLongField(term216, term216.getClass(), "uid", -8658027316505137504L);
        setField(term215, term215.getClass(), "entry", term216);
        setBooleanField(term215, term215.getClass(), "closed", true);
        setBooleanField(term215, term215.getClass(), "finished", true);
        setShortField(term215, term215.getClass(), "entryFormat", (short) -26033);
        setField(term215, term215.getClass(), "names", term247);
        setLongField(term215, term215.getClass(), "crc", 414749984815662075L);
        setLongField(term215, term215.getClass(), "written", 463622836963501975L);
        setField(term215, term215.getClass(), "out", null);
        setByteElement(term254, 0, (byte) 83);
        setByteElement(term254, 1, (byte) 74);
        setByteElement(term254, 2, (byte) -71);
        setByteElement(term254, 3, (byte) 49);
        setField(term215, term215.getClass(), "oneByte", term254);
        term259 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term259, term259.getClass(), "fileFormat", (short) 8329);
        setIntField(term259, term259.getClass(), "headerSize", 1725571209);
        setIntField(term259, term259.getClass(), "alignmentBoundary", -522618178);
        setLongField(term259, term259.getClass(), "chksum", 305759998609888272L);
        setLongField(term259, term259.getClass(), "filesize", -8654565919063661957L);
        setLongField(term259, term259.getClass(), "gid", -5248475803419977214L);
        setLongField(term259, term259.getClass(), "inode", -6723783499250797216L);
        setLongField(term259, term259.getClass(), "maj", 41775768178052008L);
        setLongField(term259, term259.getClass(), "min", 6682528376118987775L);
        setLongField(term259, term259.getClass(), "mode", 682356318767179819L);
        setLongField(term259, term259.getClass(), "mtime", -7291743527973326814L);
        setField(term259, term259.getClass(), "name", "EGtDIRbSSb");
        setLongField(term259, term259.getClass(), "nlink", -5963439350418910964L);
        setLongField(term259, term259.getClass(), "rmaj", 9013624480170062917L);
        setLongField(term259, term259.getClass(), "rmin", 7862575738391801707L);
        setLongField(term259, term259.getClass(), "uid", 50358265865610362L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term259;
        try {
            callMethod(klass, "writeNewEntry", argTypes, term215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


