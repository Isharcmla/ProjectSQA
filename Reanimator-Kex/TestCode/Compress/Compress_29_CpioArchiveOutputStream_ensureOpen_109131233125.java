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

public class CpioArchiveOutputStream_ensureOpen_109131233125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term3683;

    public CpioArchiveOutputStream_ensureOpen_109131233125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term87 = new HashMap();
        term55 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term56 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term116 = (byte[]) newByteArray(5);
        setShortField(term56, term56.getClass(), "fileFormat", (short) 23627);
        setIntField(term56, term56.getClass(), "headerSize", 1484323161);
        setIntField(term56, term56.getClass(), "alignmentBoundary", 391863371);
        setLongField(term56, term56.getClass(), "chksum", 2442117782898005296L);
        setLongField(term56, term56.getClass(), "filesize", 6375119433582206027L);
        setLongField(term56, term56.getClass(), "gid", -8257434502486459194L);
        setLongField(term56, term56.getClass(), "inode", -8400487765614892086L);
        setLongField(term56, term56.getClass(), "maj", 5270370404989704783L);
        setLongField(term56, term56.getClass(), "min", 7411271909051562686L);
        setLongField(term56, term56.getClass(), "mode", 4872422362414183754L);
        setLongField(term56, term56.getClass(), "mtime", 6811161968424632369L);
        setField(term56, term56.getClass(), "name", "MuLcgQHgqz");
        setLongField(term56, term56.getClass(), "nlink", -7237588299778557629L);
        setLongField(term56, term56.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term56, term56.getClass(), "rmin", -2813493605142626659L);
        setLongField(term56, term56.getClass(), "uid", -8885298608300233488L);
        setField(term55, term55.getClass(), "entry", term56);
        setBooleanField(term55, term55.getClass(), "closed", false);
        setBooleanField(term55, term55.getClass(), "finished", false);
        setShortField(term55, term55.getClass(), "entryFormat", (short) -19694);
        setField(term55, term55.getClass(), "names", term87);
        setLongField(term55, term55.getClass(), "crc", 2486810210675247493L);
        setLongField(term55, term55.getClass(), "written", 7009926388951271268L);
        setField(term55, term55.getClass(), "out", null);
        setIntField(term55, term55.getClass(), "blockSize", -1955890973);
        setLongField(term55, term55.getClass(), "nextArtificalDeviceAndInode", -7672528020740371001L);
        setField(term55, term55.getClass(), "zipEncoding", null);
        setByteElement(term116, 0, (byte) 47);
        setByteElement(term116, 1, (byte) 48);
        setByteElement(term116, 2, (byte) 89);
        setByteElement(term116, 3, (byte) 75);
        setByteElement(term116, 4, (byte) 18);
        setField(term55, term55.getClass(), "oneByte", term116);
        setLongField(term55, term55.getClass(), "bytesWritten", -4502405999831680926L);
        HashMap term3687 = new HashMap();
        term3683 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term3684 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term3688 = (byte[]) newByteArray(5);
        setShortField(term3684, term3684.getClass(), "fileFormat", (short) 23627);
        setIntField(term3684, term3684.getClass(), "headerSize", 1484323161);
        setIntField(term3684, term3684.getClass(), "alignmentBoundary", 391863371);
        setLongField(term3684, term3684.getClass(), "chksum", 2442117782898005296L);
        setLongField(term3684, term3684.getClass(), "filesize", 6375119433582206027L);
        setLongField(term3684, term3684.getClass(), "gid", -8257434502486459194L);
        setLongField(term3684, term3684.getClass(), "inode", -8400487765614892086L);
        setLongField(term3684, term3684.getClass(), "maj", 5270370404989704783L);
        setLongField(term3684, term3684.getClass(), "min", 7411271909051562686L);
        setLongField(term3684, term3684.getClass(), "mode", 4872422362414183754L);
        setLongField(term3684, term3684.getClass(), "mtime", 6811161968424632369L);
        setField(term3684, term3684.getClass(), "name", "MuLcgQHgqz");
        setLongField(term3684, term3684.getClass(), "nlink", -7237588299778557629L);
        setLongField(term3684, term3684.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term3684, term3684.getClass(), "rmin", -2813493605142626659L);
        setLongField(term3684, term3684.getClass(), "uid", -8885298608300233488L);
        setField(term3683, term3683.getClass(), "entry", term3684);
        setBooleanField(term3683, term3683.getClass(), "closed", false);
        setBooleanField(term3683, term3683.getClass(), "finished", false);
        setShortField(term3683, term3683.getClass(), "entryFormat", (short) -19694);
        setField(term3683, term3683.getClass(), "names", term3687);
        setLongField(term3683, term3683.getClass(), "crc", 2486810210675247493L);
        setLongField(term3683, term3683.getClass(), "written", 7009926388951271268L);
        setField(term3683, term3683.getClass(), "out", null);
        setIntField(term3683, term3683.getClass(), "blockSize", -1955890973);
        setLongField(term3683, term3683.getClass(), "nextArtificalDeviceAndInode", -7672528020740371001L);
        setField(term3683, term3683.getClass(), "zipEncoding", null);
        setByteElement(term3688, 0, (byte) 47);
        setByteElement(term3688, 1, (byte) 48);
        setByteElement(term3688, 2, (byte) 89);
        setByteElement(term3688, 3, (byte) 75);
        setByteElement(term3688, 4, (byte) 18);
        setField(term3683, term3683.getClass(), "oneByte", term3688);
        setLongField(term3683, term3683.getClass(), "bytesWritten", -4502405999831680926L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ensureOpen", argTypes, term55, args);
        assertTrue(recursiveEquals(term55, term3683));
    }

};


