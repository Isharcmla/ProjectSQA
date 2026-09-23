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
import java.lang.Boolean;

public class CpioArchiveOutputStream_writeOldBinaryEntry_129138715130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term637;
     Object term665;

    public CpioArchiveOutputStream_writeOldBinaryEntry_129138715130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term600 = new HashMap();
        term568 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term569 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term629 = (byte[]) newByteArray(6);
        setShortField(term569, term569.getClass(), "fileFormat", (short) -355);
        setIntField(term569, term569.getClass(), "headerSize", -226514366);
        setIntField(term569, term569.getClass(), "alignmentBoundary", 1193880199);
        setLongField(term569, term569.getClass(), "chksum", -6100012593724108983L);
        setLongField(term569, term569.getClass(), "filesize", 5465527210299101732L);
        setLongField(term569, term569.getClass(), "gid", 4699157009689333952L);
        setLongField(term569, term569.getClass(), "inode", -78240609295693193L);
        setLongField(term569, term569.getClass(), "maj", 3090901538358721367L);
        setLongField(term569, term569.getClass(), "min", -1677189124507026637L);
        setLongField(term569, term569.getClass(), "mode", 4795660804170399986L);
        setLongField(term569, term569.getClass(), "mtime", -4030863184426321096L);
        setField(term569, term569.getClass(), "name", "hNxWaHcfhY");
        setLongField(term569, term569.getClass(), "nlink", -8010214112439224349L);
        setLongField(term569, term569.getClass(), "rmaj", -6673920710396545553L);
        setLongField(term569, term569.getClass(), "rmin", 3412644969878030772L);
        setLongField(term569, term569.getClass(), "uid", 6698455537431331246L);
        setField(term568, term568.getClass(), "entry", term569);
        setBooleanField(term568, term568.getClass(), "closed", false);
        setBooleanField(term568, term568.getClass(), "finished", true);
        setShortField(term568, term568.getClass(), "entryFormat", (short) 5118);
        setField(term568, term568.getClass(), "names", term600);
        setLongField(term568, term568.getClass(), "crc", -2338103433822116635L);
        setLongField(term568, term568.getClass(), "written", -1885698929232124806L);
        setField(term568, term568.getClass(), "out", null);
        setIntField(term568, term568.getClass(), "blockSize", -469968304);
        setLongField(term568, term568.getClass(), "nextArtificalDeviceAndInode", 5731563613239387113L);
        setField(term568, term568.getClass(), "zipEncoding", null);
        setByteElement(term629, 0, (byte) 67);
        setByteElement(term629, 1, (byte) 78);
        setByteElement(term629, 2, (byte) 87);
        setByteElement(term629, 3, (byte) 121);
        setByteElement(term629, 4, (byte) -99);
        setByteElement(term629, 5, (byte) -2);
        setField(term568, term568.getClass(), "oneByte", term629);
        setLongField(term568, term568.getClass(), "bytesWritten", 3381333711768010594L);
        term637 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term637, term637.getClass(), "fileFormat", (short) -3696);
        setIntField(term637, term637.getClass(), "headerSize", -1145578966);
        setIntField(term637, term637.getClass(), "alignmentBoundary", 679763016);
        setLongField(term637, term637.getClass(), "chksum", 3580984732036213717L);
        setLongField(term637, term637.getClass(), "filesize", 5330761990446327930L);
        setLongField(term637, term637.getClass(), "gid", -3954795081650780841L);
        setLongField(term637, term637.getClass(), "inode", 3288791194263207397L);
        setLongField(term637, term637.getClass(), "maj", 3288941170644426558L);
        setLongField(term637, term637.getClass(), "min", -8338004844694486146L);
        setLongField(term637, term637.getClass(), "mode", 6426732259596412988L);
        setLongField(term637, term637.getClass(), "mtime", 185793058502220865L);
        setField(term637, term637.getClass(), "name", "eZFUvlxvGV");
        setLongField(term637, term637.getClass(), "nlink", -7698746988132548371L);
        setLongField(term637, term637.getClass(), "rmaj", 2145420811068634601L);
        setLongField(term637, term637.getClass(), "rmin", 2191130532479601175L);
        setLongField(term637, term637.getClass(), "uid", 860079646007397083L);
        term665 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term637;
        args[1] = term665;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term568, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


