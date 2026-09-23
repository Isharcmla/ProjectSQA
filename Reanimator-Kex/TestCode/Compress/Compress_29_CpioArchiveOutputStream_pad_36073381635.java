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
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class CpioArchiveOutputStream_pad_36073381635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034;
     Object term1102;
     Object term6853;

    public CpioArchiveOutputStream_pad_36073381635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1066 = new HashMap();
        term1034 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1035 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1095 = (byte[]) newByteArray(5);
        setShortField(term1035, term1035.getClass(), "fileFormat", (short) -9648);
        setIntField(term1035, term1035.getClass(), "headerSize", -1371869594);
        setIntField(term1035, term1035.getClass(), "alignmentBoundary", -2095575670);
        setLongField(term1035, term1035.getClass(), "chksum", -136372844051852955L);
        setLongField(term1035, term1035.getClass(), "filesize", -7632759764262745126L);
        setLongField(term1035, term1035.getClass(), "gid", 3746481521207337771L);
        setLongField(term1035, term1035.getClass(), "inode", 4341016500855678917L);
        setLongField(term1035, term1035.getClass(), "maj", -5871746020807491998L);
        setLongField(term1035, term1035.getClass(), "min", 4742108233936970770L);
        setLongField(term1035, term1035.getClass(), "mode", 2722004046017350471L);
        setLongField(term1035, term1035.getClass(), "mtime", 6636235983121346803L);
        setField(term1035, term1035.getClass(), "name", "xrwlQZdwCp");
        setLongField(term1035, term1035.getClass(), "nlink", 146749226579788091L);
        setLongField(term1035, term1035.getClass(), "rmaj", -1279670138064751276L);
        setLongField(term1035, term1035.getClass(), "rmin", -7205236974351118210L);
        setLongField(term1035, term1035.getClass(), "uid", -2136893352275781569L);
        setField(term1034, term1034.getClass(), "entry", term1035);
        setBooleanField(term1034, term1034.getClass(), "closed", true);
        setBooleanField(term1034, term1034.getClass(), "finished", true);
        setShortField(term1034, term1034.getClass(), "entryFormat", (short) -9686);
        setField(term1034, term1034.getClass(), "names", term1066);
        setLongField(term1034, term1034.getClass(), "crc", -432424084523104253L);
        setLongField(term1034, term1034.getClass(), "written", 6150186973473930616L);
        setField(term1034, term1034.getClass(), "out", null);
        setIntField(term1034, term1034.getClass(), "blockSize", -1588772968);
        setLongField(term1034, term1034.getClass(), "nextArtificalDeviceAndInode", -3850323135468805420L);
        setField(term1034, term1034.getClass(), "zipEncoding", null);
        setByteElement(term1095, 0, (byte) -22);
        setByteElement(term1095, 1, (byte) 93);
        setByteElement(term1095, 2, (byte) 69);
        setByteElement(term1095, 3, (byte) -74);
        setByteElement(term1095, 4, (byte) -123);
        setField(term1034, term1034.getClass(), "oneByte", term1095);
        setLongField(term1034, term1034.getClass(), "bytesWritten", -5207216109884759743L);
        term1102 = new Integer(-93135961);
        HashMap term6857 = new HashMap();
        term6853 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term6854 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term6858 = (byte[]) newByteArray(5);
        setShortField(term6854, term6854.getClass(), "fileFormat", (short) -9648);
        setIntField(term6854, term6854.getClass(), "headerSize", -1371869594);
        setIntField(term6854, term6854.getClass(), "alignmentBoundary", -2095575670);
        setLongField(term6854, term6854.getClass(), "chksum", -136372844051852955L);
        setLongField(term6854, term6854.getClass(), "filesize", -7632759764262745126L);
        setLongField(term6854, term6854.getClass(), "gid", 3746481521207337771L);
        setLongField(term6854, term6854.getClass(), "inode", 4341016500855678917L);
        setLongField(term6854, term6854.getClass(), "maj", -5871746020807491998L);
        setLongField(term6854, term6854.getClass(), "min", 4742108233936970770L);
        setLongField(term6854, term6854.getClass(), "mode", 2722004046017350471L);
        setLongField(term6854, term6854.getClass(), "mtime", 6636235983121346803L);
        setField(term6854, term6854.getClass(), "name", "xrwlQZdwCp");
        setLongField(term6854, term6854.getClass(), "nlink", 146749226579788091L);
        setLongField(term6854, term6854.getClass(), "rmaj", -1279670138064751276L);
        setLongField(term6854, term6854.getClass(), "rmin", -7205236974351118210L);
        setLongField(term6854, term6854.getClass(), "uid", -2136893352275781569L);
        setField(term6853, term6853.getClass(), "entry", term6854);
        setBooleanField(term6853, term6853.getClass(), "closed", true);
        setBooleanField(term6853, term6853.getClass(), "finished", true);
        setShortField(term6853, term6853.getClass(), "entryFormat", (short) -9686);
        setField(term6853, term6853.getClass(), "names", term6857);
        setLongField(term6853, term6853.getClass(), "crc", -432424084523104253L);
        setLongField(term6853, term6853.getClass(), "written", 6150186973473930616L);
        setField(term6853, term6853.getClass(), "out", null);
        setIntField(term6853, term6853.getClass(), "blockSize", -1588772968);
        setLongField(term6853, term6853.getClass(), "nextArtificalDeviceAndInode", -3850323135468805420L);
        setField(term6853, term6853.getClass(), "zipEncoding", null);
        setByteElement(term6858, 0, (byte) -22);
        setByteElement(term6858, 1, (byte) 93);
        setByteElement(term6858, 2, (byte) 69);
        setByteElement(term6858, 3, (byte) -74);
        setByteElement(term6858, 4, (byte) -123);
        setField(term6853, term6853.getClass(), "oneByte", term6858);
        setLongField(term6853, term6853.getClass(), "bytesWritten", -5207216109884759743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1102;
        callMethod(klass, "pad", argTypes, term1034, args);
        assertTrue(recursiveEquals(term1034, term6853));
        assertTrue(recursiveEquals(term1102, -93135961));
    }

};


