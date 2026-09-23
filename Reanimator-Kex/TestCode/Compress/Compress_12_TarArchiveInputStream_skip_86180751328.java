package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class TarArchiveInputStream_skip_86180751328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;
     Object term876;
     Object term104731;

    public TarArchiveInputStream_skip_86180751328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104783 = Class.forName((String) "java.io.File$PathStatus");
        Field term104782 = ((Class) term104783).getDeclaredField((String) "CHECKED");
        ((Field) term104782).setAccessible(true);
        Object enum25 = ((Field) term104782).get((Object) null);
        term802 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term806 = (byte[]) newByteArray(7);
        Object term814 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term815 = (byte[]) newByteArray(0);
        Object term821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term856 = newInstance(Class.forName("java.io.File"));
        byte[] term873 = (byte[]) newByteArray(1);
        setBooleanField(term802, term802.getClass(), "hasHitEOF", true);
        setLongField(term802, term802.getClass(), "entrySize", -6573104506744284592L);
        setLongField(term802, term802.getClass(), "entryOffset", -4920224193275732920L);
        setByteElement(term806, 0, (byte) -61);
        setByteElement(term806, 1, (byte) -85);
        setByteElement(term806, 2, (byte) -22);
        setByteElement(term806, 3, (byte) 93);
        setByteElement(term806, 4, (byte) 69);
        setByteElement(term806, 5, (byte) -74);
        setByteElement(term806, 6, (byte) -123);
        setField(term802, term802.getClass(), "readBuf", term806);
        setField(term814, term814.getClass(), "inStream", null);
        setField(term814, term814.getClass(), "outStream", null);
        setField(term814, term814.getClass(), "blockBuffer", term815);
        setIntField(term814, term814.getClass(), "currBlkIdx", -1530420153);
        setIntField(term814, term814.getClass(), "currRecIdx", -469968304);
        setIntField(term814, term814.getClass(), "blockSize", -1145578966);
        setIntField(term814, term814.getClass(), "recordSize", 679763016);
        setIntField(term814, term814.getClass(), "recsPerBlock", 1962444399);
        setField(term802, term802.getClass(), "buffer", term814);
        setField(term821, term821.getClass(), "name", "");
        setIntField(term821, term821.getClass(), "mode", 767834723);
        setIntField(term821, term821.getClass(), "userId", -602026508);
        setIntField(term821, term821.getClass(), "groupId", -157887805);
        setLongField(term821, term821.getClass(), "size", 8428634514691209827L);
        setLongField(term821, term821.getClass(), "modTime", -2585684163342970173L);
        setByteField(term821, term821.getClass(), "linkFlag", (byte) -23);
        setField(term821, term821.getClass(), "linkName", "");
        setField(term821, term821.getClass(), "magic", "ustar ");
        setField(term821, term821.getClass(), "version", "00");
        setField(term821, term821.getClass(), "userName", "root");
        setField(term821, term821.getClass(), "groupName", "");
        setIntField(term821, term821.getClass(), "devMajor", 1876565163);
        setIntField(term821, term821.getClass(), "devMinor", -817164822);
        setBooleanField(term821, term821.getClass(), "isExtended", true);
        setLongField(term821, term821.getClass(), "realSize", 8059786003080744426L);
        setField(term856, term856.getClass(), "path", "xxtlPwDYFs");
        setField(term856, term856.getClass(), "status", enum25);
        setIntField(term856, term856.getClass(), "prefixLength", -1016503459);
        setField(term856, term856.getClass(), "filePath", null);
        setField(term821, term821.getClass(), "file", term856);
        setField(term802, term802.getClass(), "currEntry", term821);
        setByteElement(term873, 0, (byte) 100);
        setField(term802, term802.getClass(), "SINGLE", term873);
        setLongField(term802, term802.getClass(), "bytesRead", -4365849114644724155L);
        term876 = new Long(2486810210675247493L);
        Class<? extends Object> term104956 = Class.forName((String) "java.io.File$PathStatus");
        Field term104955 = ((Class) term104956).getDeclaredField((String) "INVALID");
        ((Field) term104955).setAccessible(true);
        Object enum26 = ((Field) term104955).get((Object) null);
        term104731 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term104732 = (byte[]) newByteArray(7);
        Object term104733 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term104734 = (byte[]) newByteArray(0);
        Object term104735 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term104748 = newInstance(Class.forName("java.io.File"));
        byte[] term104753 = (byte[]) newByteArray(1);
        setBooleanField(term104731, term104731.getClass(), "hasHitEOF", true);
        setLongField(term104731, term104731.getClass(), "entrySize", -6573104506744284592L);
        setLongField(term104731, term104731.getClass(), "entryOffset", -4920224193275732920L);
        setByteElement(term104732, 0, (byte) -61);
        setByteElement(term104732, 1, (byte) -85);
        setByteElement(term104732, 2, (byte) -22);
        setByteElement(term104732, 3, (byte) 93);
        setByteElement(term104732, 4, (byte) 69);
        setByteElement(term104732, 5, (byte) -74);
        setByteElement(term104732, 6, (byte) -123);
        setField(term104731, term104731.getClass(), "readBuf", term104732);
        setField(term104733, term104733.getClass(), "inStream", null);
        setField(term104733, term104733.getClass(), "outStream", null);
        setField(term104733, term104733.getClass(), "blockBuffer", term104734);
        setIntField(term104733, term104733.getClass(), "currBlkIdx", -1530420153);
        setIntField(term104733, term104733.getClass(), "currRecIdx", -469968304);
        setIntField(term104733, term104733.getClass(), "blockSize", -1145578966);
        setIntField(term104733, term104733.getClass(), "recordSize", 679763016);
        setIntField(term104733, term104733.getClass(), "recsPerBlock", 1962444399);
        setField(term104731, term104731.getClass(), "buffer", term104733);
        setField(term104735, term104735.getClass(), "name", "");
        setIntField(term104735, term104735.getClass(), "mode", 767834723);
        setIntField(term104735, term104735.getClass(), "userId", -602026508);
        setIntField(term104735, term104735.getClass(), "groupId", -157887805);
        setLongField(term104735, term104735.getClass(), "size", 8428634514691209827L);
        setLongField(term104735, term104735.getClass(), "modTime", -2585684163342970173L);
        setByteField(term104735, term104735.getClass(), "linkFlag", (byte) -23);
        setField(term104735, term104735.getClass(), "linkName", "");
        setField(term104735, term104735.getClass(), "magic", "ustar ");
        setField(term104735, term104735.getClass(), "version", "00");
        setField(term104735, term104735.getClass(), "userName", "root");
        setField(term104735, term104735.getClass(), "groupName", "");
        setIntField(term104735, term104735.getClass(), "devMajor", 1876565163);
        setIntField(term104735, term104735.getClass(), "devMinor", -817164822);
        setBooleanField(term104735, term104735.getClass(), "isExtended", true);
        setLongField(term104735, term104735.getClass(), "realSize", 8059786003080744426L);
        setField(term104748, term104748.getClass(), "path", "xxtlPwDYFs");
        setField(term104748, term104748.getClass(), "status", enum26);
        setIntField(term104748, term104748.getClass(), "prefixLength", -1016503459);
        setField(term104748, term104748.getClass(), "filePath", null);
        setField(term104735, term104735.getClass(), "file", term104748);
        setField(term104731, term104731.getClass(), "currEntry", term104735);
        setByteElement(term104753, 0, (byte) 100);
        setField(term104731, term104731.getClass(), "SINGLE", term104753);
        setLongField(term104731, term104731.getClass(), "bytesRead", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term876;
        Object retValue = callMethod(klass, "skip", argTypes, term802, args);
        assertTrue(recursiveEquals(term802, term104731));
        assertTrue(recursiveEquals(term876, 2486810210675247493L));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


