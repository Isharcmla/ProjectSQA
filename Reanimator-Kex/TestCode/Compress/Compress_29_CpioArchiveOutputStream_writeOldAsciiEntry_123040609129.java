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

public class CpioArchiveOutputStream_writeOldAsciiEntry_123040609129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object term519;

    public CpioArchiveOutputStream_writeOldAsciiEntry_123040609129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term487 = new HashMap();
        term455 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term456 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term516 = (byte[]) newByteArray(1);
        setShortField(term456, term456.getClass(), "fileFormat", (short) -1725);
        setIntField(term456, term456.getClass(), "headerSize", 590364439);
        setIntField(term456, term456.getClass(), "alignmentBoundary", 865208305);
        setLongField(term456, term456.getClass(), "chksum", -1616722610139554082L);
        setLongField(term456, term456.getClass(), "filesize", 7495904023107549024L);
        setLongField(term456, term456.getClass(), "gid", 8802866251294305945L);
        setLongField(term456, term456.getClass(), "inode", 4513004407927379358L);
        setLongField(term456, term456.getClass(), "maj", -7115418542247301000L);
        setLongField(term456, term456.getClass(), "min", 8034714140377562739L);
        setLongField(term456, term456.getClass(), "mode", -2924531382671518368L);
        setLongField(term456, term456.getClass(), "mtime", -3948863953565024517L);
        setField(term456, term456.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term456, term456.getClass(), "nlink", -6587807377747738663L);
        setLongField(term456, term456.getClass(), "rmaj", -6301101997917060727L);
        setLongField(term456, term456.getClass(), "rmin", 8166095254618543564L);
        setLongField(term456, term456.getClass(), "uid", -4598158870068953328L);
        setField(term455, term455.getClass(), "entry", term456);
        setBooleanField(term455, term455.getClass(), "closed", false);
        setBooleanField(term455, term455.getClass(), "finished", true);
        setShortField(term455, term455.getClass(), "entryFormat", (short) 2638);
        setField(term455, term455.getClass(), "names", term487);
        setLongField(term455, term455.getClass(), "crc", 1195529027276497124L);
        setLongField(term455, term455.getClass(), "written", -2783999800714825789L);
        setField(term455, term455.getClass(), "out", null);
        setIntField(term455, term455.getClass(), "blockSize", -203030934);
        setLongField(term455, term455.getClass(), "nextArtificalDeviceAndInode", 4266570509071948633L);
        setField(term455, term455.getClass(), "zipEncoding", null);
        setByteElement(term516, 0, (byte) -54);
        setField(term455, term455.getClass(), "oneByte", term516);
        setLongField(term455, term455.getClass(), "bytesWritten", -7291742736502427077L);
        term519 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term519, term519.getClass(), "fileFormat", (short) 30329);
        setIntField(term519, term519.getClass(), "headerSize", -1179120542);
        setIntField(term519, term519.getClass(), "alignmentBoundary", -73683645);
        setLongField(term519, term519.getClass(), "chksum", -8121849829073967555L);
        setLongField(term519, term519.getClass(), "filesize", 5219030281405653303L);
        setLongField(term519, term519.getClass(), "gid", -8471550651709805183L);
        setLongField(term519, term519.getClass(), "inode", -948292411727204525L);
        setLongField(term519, term519.getClass(), "maj", -8892586408602479513L);
        setLongField(term519, term519.getClass(), "min", 4616440478358528406L);
        setLongField(term519, term519.getClass(), "mode", 3427570961451840069L);
        setLongField(term519, term519.getClass(), "mtime", 4502292577098212311L);
        setField(term519, term519.getClass(), "name", "pCTimMblYc");
        setLongField(term519, term519.getClass(), "nlink", -3730936709704460408L);
        setLongField(term519, term519.getClass(), "rmaj", -8614778293741404325L);
        setLongField(term519, term519.getClass(), "rmin", -5447369594017685765L);
        setLongField(term519, term519.getClass(), "uid", -5724112525188606013L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term519;
        try {
            callMethod(klass, "writeOldAsciiEntry", argTypes, term455, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


