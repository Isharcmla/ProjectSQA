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

public class CpioArchiveOutputStream_writeHeader_102122619027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;
     Object term285;

    public CpioArchiveOutputStream_writeHeader_102122619027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term251 = new HashMap();
        term219 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term220 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term280 = (byte[]) newByteArray(3);
        setShortField(term220, term220.getClass(), "fileFormat", (short) -26033);
        setIntField(term220, term220.getClass(), "headerSize", 1134449235);
        setIntField(term220, term220.getClass(), "alignmentBoundary", -883034806);
        setLongField(term220, term220.getClass(), "chksum", -7738503207562305297L);
        setLongField(term220, term220.getClass(), "filesize", 3825396310311739952L);
        setLongField(term220, term220.getClass(), "gid", -3838084482494604218L);
        setLongField(term220, term220.getClass(), "inode", 3892018155439224435L);
        setLongField(term220, term220.getClass(), "maj", 5953383087795962419L);
        setLongField(term220, term220.getClass(), "min", 7994303628307559416L);
        setLongField(term220, term220.getClass(), "mode", 2443640364875054177L);
        setLongField(term220, term220.getClass(), "mtime", -1610676979013636850L);
        setField(term220, term220.getClass(), "name", "hRNSzYYIrc");
        setLongField(term220, term220.getClass(), "nlink", 2062173786000223358L);
        setLongField(term220, term220.getClass(), "rmaj", -8658027316505137504L);
        setLongField(term220, term220.getClass(), "rmin", 414749984815662075L);
        setLongField(term220, term220.getClass(), "uid", 463622836963501975L);
        setField(term219, term219.getClass(), "entry", term220);
        setBooleanField(term219, term219.getClass(), "closed", true);
        setBooleanField(term219, term219.getClass(), "finished", true);
        setShortField(term219, term219.getClass(), "entryFormat", (short) 8329);
        setField(term219, term219.getClass(), "names", term251);
        setLongField(term219, term219.getClass(), "crc", 5510783420697225605L);
        setLongField(term219, term219.getClass(), "written", 6005241913654469005L);
        setField(term219, term219.getClass(), "out", null);
        setIntField(term219, term219.getClass(), "blockSize", -1685132342);
        setLongField(term219, term219.getClass(), "nextArtificalDeviceAndInode", -1983291584002806658L);
        setField(term219, term219.getClass(), "zipEncoding", null);
        setByteElement(term280, 0, (byte) 79);
        setByteElement(term280, 1, (byte) -119);
        setByteElement(term280, 2, (byte) -66);
        setField(term219, term219.getClass(), "oneByte", term280);
        setLongField(term219, term219.getClass(), "bytesWritten", 5946780097489996391L);
        term285 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term285, term285.getClass(), "fileFormat", (short) 21075);
        setIntField(term285, term285.getClass(), "headerSize", -1456670397);
        setIntField(term285, term285.getClass(), "alignmentBoundary", 1622346318);
        setLongField(term285, term285.getClass(), "chksum", -8652538484981166496L);
        setLongField(term285, term285.getClass(), "filesize", 2701184207686293431L);
        setLongField(term285, term285.getClass(), "gid", 4474998035090263139L);
        setLongField(term285, term285.getClass(), "inode", 2848819812340321742L);
        setLongField(term285, term285.getClass(), "maj", -8876856890348836498L);
        setLongField(term285, term285.getClass(), "min", 846579494941632714L);
        setLongField(term285, term285.getClass(), "mode", 6689117472719450333L);
        setLongField(term285, term285.getClass(), "mtime", 5836128569274066678L);
        setField(term285, term285.getClass(), "name", "uuaPigETmJ");
        setLongField(term285, term285.getClass(), "nlink", -2177368829816872572L);
        setLongField(term285, term285.getClass(), "rmaj", -8463029266761149071L);
        setLongField(term285, term285.getClass(), "rmin", 3133860696238261492L);
        setLongField(term285, term285.getClass(), "uid", 7247160664318067468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term285;
        try {
            callMethod(klass, "writeHeader", argTypes, term219, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


