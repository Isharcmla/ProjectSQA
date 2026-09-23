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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class CpioArchiveOutputStream_writeBinaryLong_128537516936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1119;
     Object term1187;
     Object term1189;
     Object term1191;

    public CpioArchiveOutputStream_writeBinaryLong_128537516936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1151 = new HashMap();
        term1119 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1120 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1180 = (byte[]) newByteArray(5);
        setShortField(term1120, term1120.getClass(), "fileFormat", (short) -31121);
        setIntField(term1120, term1120.getClass(), "headerSize", -112921587);
        setIntField(term1120, term1120.getClass(), "alignmentBoundary", 933028652);
        setLongField(term1120, term1120.getClass(), "chksum", 8765880103547975810L);
        setLongField(term1120, term1120.getClass(), "filesize", 4552367707739103094L);
        setLongField(term1120, term1120.getClass(), "gid", -6001151456088965547L);
        setLongField(term1120, term1120.getClass(), "inode", 1740732617708040141L);
        setLongField(term1120, term1120.getClass(), "maj", 3472971833455746664L);
        setLongField(term1120, term1120.getClass(), "min", 3731931947533293029L);
        setLongField(term1120, term1120.getClass(), "mode", 9214973322210954344L);
        setLongField(term1120, term1120.getClass(), "mtime", 3662777917800385964L);
        setField(term1120, term1120.getClass(), "name", "aKnKipADSo");
        setLongField(term1120, term1120.getClass(), "nlink", -7005300544167632229L);
        setLongField(term1120, term1120.getClass(), "rmaj", -278716491237139968L);
        setLongField(term1120, term1120.getClass(), "rmin", -629491722907628764L);
        setLongField(term1120, term1120.getClass(), "uid", -5552123402871285352L);
        setField(term1119, term1119.getClass(), "entry", term1120);
        setBooleanField(term1119, term1119.getClass(), "closed", true);
        setBooleanField(term1119, term1119.getClass(), "finished", true);
        setShortField(term1119, term1119.getClass(), "entryFormat", (short) 14947);
        setField(term1119, term1119.getClass(), "names", term1151);
        setLongField(term1119, term1119.getClass(), "crc", -3806202176947356197L);
        setLongField(term1119, term1119.getClass(), "written", -5534222035915952617L);
        setField(term1119, term1119.getClass(), "out", null);
        setIntField(term1119, term1119.getClass(), "blockSize", 1540719661);
        setLongField(term1119, term1119.getClass(), "nextArtificalDeviceAndInode", 8073378116544724166L);
        setField(term1119, term1119.getClass(), "zipEncoding", null);
        setByteElement(term1180, 0, (byte) -23);
        setByteElement(term1180, 1, (byte) 100);
        setByteElement(term1180, 2, (byte) 106);
        setByteElement(term1180, 3, (byte) -57);
        setByteElement(term1180, 4, (byte) -103);
        setField(term1119, term1119.getClass(), "oneByte", term1180);
        setLongField(term1119, term1119.getClass(), "bytesWritten", -8303973304709662279L);
        term1187 = new Long(6853972830905120647L);
        term1189 = new Integer(1265463001);
        term1191 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1187;
        args[1] = term1189;
        args[2] = term1191;
        try {
            callMethod(klass, "writeBinaryLong", argTypes, term1119, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


