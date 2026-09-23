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
import java.lang.String;

public class CpioArchiveOutputStream_createArchiveEntry_607161039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;
     Object term1456;

    public CpioArchiveOutputStream_createArchiveEntry_607161039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1424 = new HashMap();
        term1392 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1393 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1453 = (byte[]) newByteArray(1);
        setShortField(term1393, term1393.getClass(), "fileFormat", (short) -13947);
        setIntField(term1393, term1393.getClass(), "headerSize", -1547384488);
        setIntField(term1393, term1393.getClass(), "alignmentBoundary", 1442160736);
        setLongField(term1393, term1393.getClass(), "chksum", 1193381106528373019L);
        setLongField(term1393, term1393.getClass(), "filesize", -1365372122034008688L);
        setLongField(term1393, term1393.getClass(), "gid", -6108006981756732593L);
        setLongField(term1393, term1393.getClass(), "inode", -3565554762799701668L);
        setLongField(term1393, term1393.getClass(), "maj", -6837989212848250735L);
        setLongField(term1393, term1393.getClass(), "min", -4231979631084175364L);
        setLongField(term1393, term1393.getClass(), "mode", 1634166935474035772L);
        setLongField(term1393, term1393.getClass(), "mtime", -2614906266506360948L);
        setField(term1393, term1393.getClass(), "name", "jDtqGUpnZN");
        setLongField(term1393, term1393.getClass(), "nlink", 1133267598258375793L);
        setLongField(term1393, term1393.getClass(), "rmaj", 2990264647913003810L);
        setLongField(term1393, term1393.getClass(), "rmin", -2195794659127490022L);
        setLongField(term1393, term1393.getClass(), "uid", 6142089107139955834L);
        setField(term1392, term1392.getClass(), "entry", term1393);
        setBooleanField(term1392, term1392.getClass(), "closed", true);
        setBooleanField(term1392, term1392.getClass(), "finished", true);
        setShortField(term1392, term1392.getClass(), "entryFormat", (short) 17129);
        setField(term1392, term1392.getClass(), "names", term1424);
        setLongField(term1392, term1392.getClass(), "crc", 8527367353497875781L);
        setLongField(term1392, term1392.getClass(), "written", -6489405551733780896L);
        setField(term1392, term1392.getClass(), "out", null);
        setIntField(term1392, term1392.getClass(), "blockSize", -1772434990);
        setLongField(term1392, term1392.getClass(), "nextArtificalDeviceAndInode", 5818741986224130131L);
        setField(term1392, term1392.getClass(), "zipEncoding", null);
        setByteElement(term1453, 0, (byte) 116);
        setField(term1392, term1392.getClass(), "oneByte", term1453);
        setLongField(term1392, term1392.getClass(), "bytesWritten", 370847120687610747L);
        Class<? extends Object> term8058 = Class.forName((String) "java.io.File$PathStatus");
        Field term8057 = ((Class) term8058).getDeclaredField((String) "INVALID");
        ((Field) term8057).setAccessible(true);
        Object enum1 = ((Field) term8057).get((Object) null);
        term1456 = newInstance(Class.forName("java.io.File"));
        setField(term1456, term1456.getClass(), "path", "UoYtihxVaS");
        setField(term1456, term1456.getClass(), "status", enum1);
        setIntField(term1456, term1456.getClass(), "prefixLength", -1845499264);
        setField(term1456, term1456.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1456;
        args[1] = "JDswTTCZHV";
        try {
            callMethod(klass, "createArchiveEntry", argTypes, term1392, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


