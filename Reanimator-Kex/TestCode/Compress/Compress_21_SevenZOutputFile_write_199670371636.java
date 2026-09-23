package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SevenZOutputFile_write_199670371636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3555;
     Object term3647;

    public SevenZOutputFile_write_199670371636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3560 = new ArrayList();
        ((ArrayList) term3560).add((Object)null);
        ((ArrayList) term3560).add((Object)null);
        ((ArrayList) term3560).add((Object)null);
        ((ArrayList) term3560).add((Object)null);
        ((ArrayList) term3560).add((Object)null);
        Object term3583 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3583, term3583.getClass(), "name", "");
        setBooleanField(term3583, term3583.getClass(), "hasStream", true);
        setBooleanField(term3583, term3583.getClass(), "isDirectory", false);
        setBooleanField(term3583, term3583.getClass(), "isAntiItem", false);
        setBooleanField(term3583, term3583.getClass(), "hasCreationDate", true);
        setBooleanField(term3583, term3583.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term3583, term3583.getClass(), "hasAccessDate", false);
        setLongField(term3583, term3583.getClass(), "creationDate", 4394651392080968777L);
        setLongField(term3583, term3583.getClass(), "lastModifiedDate", -7310273014364148916L);
        setLongField(term3583, term3583.getClass(), "accessDate", 8863790908271299748L);
        setBooleanField(term3583, term3583.getClass(), "hasWindowsAttributes", false);
        setIntField(term3583, term3583.getClass(), "windowsAttributes", -1048298087);
        setBooleanField(term3583, term3583.getClass(), "hasCrc", false);
        setLongField(term3583, term3583.getClass(), "crc", 9205327385733285058L);
        setLongField(term3583, term3583.getClass(), "compressedCrc", 4199886998224701110L);
        setLongField(term3583, term3583.getClass(), "size", 8540994973773607992L);
        setLongField(term3583, term3583.getClass(), "compressedSize", -2338103433822116635L);
        Object term3601 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3601, term3601.getClass(), "name", "");
        setBooleanField(term3601, term3601.getClass(), "hasStream", false);
        setBooleanField(term3601, term3601.getClass(), "isDirectory", false);
        setBooleanField(term3601, term3601.getClass(), "isAntiItem", false);
        setBooleanField(term3601, term3601.getClass(), "hasCreationDate", false);
        setBooleanField(term3601, term3601.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term3601, term3601.getClass(), "hasAccessDate", true);
        setLongField(term3601, term3601.getClass(), "creationDate", -1885698929232124806L);
        setLongField(term3601, term3601.getClass(), "lastModifiedDate", 5731563613239387113L);
        setLongField(term3601, term3601.getClass(), "accessDate", 3381333711768010594L);
        setBooleanField(term3601, term3601.getClass(), "hasWindowsAttributes", true);
        setIntField(term3601, term3601.getClass(), "windowsAttributes", 292681826);
        setBooleanField(term3601, term3601.getClass(), "hasCrc", true);
        setLongField(term3601, term3601.getClass(), "crc", 3580984732036213717L);
        setLongField(term3601, term3601.getClass(), "compressedCrc", 5330761990446327930L);
        setLongField(term3601, term3601.getClass(), "size", -3954795081650780841L);
        setLongField(term3601, term3601.getClass(), "compressedSize", 3288791194263207397L);
        ArrayList term3581 = new ArrayList();
        ((ArrayList) term3581).add(term3583);
        ((ArrayList) term3581).add(term3601);
        Class<? extends Object> term20095 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term20094 = ((Class) term20095).getDeclaredField((String) "DEFLATE");
        ((Field) term20094).setAccessible(true);
        Object enum46 = ((Field) term20094).get((Object) null);
        term3555 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term3556 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term3557 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term3579 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term3622 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3624 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3628 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term3631 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3557, term3557.getClass(), "fd", -1);
        setLongField(term3557, term3557.getClass(), "handle", -1L);
        setField(term3557, term3557.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "otherParents", term3560);
        setBooleanField(term3557, term3557.getClass(), "closed", true);
        setBooleanField(term3557, term3557.getClass(), "append", false);
        setField(term3557, term3557.getClass(), "cleanup", null);
        setField(term3556, term3556.getClass(), "fd", term3557);
        setField(term3556, term3556.getClass(), "channel", null);
        setBooleanField(term3556, term3556.getClass(), "rw", false);
        setField(term3556, term3556.getClass(), "path", "Ghbwtircqb");
        setIntField(term3579, term3579.getClass(), "value", 2055867847);
        setField(term3556, term3556.getClass(), "closed", term3579);
        setField(term3555, term3555.getClass(), "file", term3556);
        setField(term3555, term3555.getClass(), "files", term3581);
        setIntField(term3555, term3555.getClass(), "numNonEmptyStreams", 458147407);
        setIntField(term3622, term3622.getClass(), "crc", -184153539);
        setField(term3555, term3555.getClass(), "crc32", term3622);
        setIntField(term3624, term3624.getClass(), "crc", 493620644);
        setField(term3555, term3555.getClass(), "compressedCrc32", term3624);
        setLongField(term3555, term3555.getClass(), "fileBytesWritten", 3288941170644426558L);
        setBooleanField(term3555, term3555.getClass(), "finished", false);
        setLongField(term3628, term3628.getClass(), "bytesWritten", -8338004844694486146L);
        setField(term3628, term3628.getClass(), "out", null);
        setBooleanField(term3628, term3628.getClass(), "closed", true);
        setField(term3628, term3628.getClass(), "closeLock", term3631);
        setField(term3555, term3555.getClass(), "currentOutputStream", term3628);
        setField(term3555, term3555.getClass(), "contentCompression", enum46);
        term3647 = (byte[]) newByteArray(3);
        setByteElement(term3647, 0, (byte) 47);
        setByteElement(term3647, 1, (byte) 48);
        setByteElement(term3647, 2, (byte) 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3647;
        try {
            callMethod(klass, "write", argTypes, term3555, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


