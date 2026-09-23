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

public class TarArchiveInputStream_available_85705187341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;
     Object term12457;

    public TarArchiveInputStream_available_85705187341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12508 = Class.forName((String) "java.io.File$PathStatus");
        Field term12507 = ((Class) term12508).getDeclaredField((String) "INVALID");
        ((Field) term12507).setAccessible(true);
        Object enum29 = ((Field) term12507).get((Object) null);
        term635 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term636 = (byte[]) newByteArray(6);
        Object term648 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term684 = newInstance(Class.forName("java.io.File"));
        byte[] term713 = (byte[]) newByteArray(2);
        setByteElement(term636, 0, (byte) 121);
        setByteElement(term636, 1, (byte) -99);
        setByteElement(term636, 2, (byte) -2);
        setByteElement(term636, 3, (byte) -16);
        setByteElement(term636, 4, (byte) -112);
        setByteElement(term636, 5, (byte) -111);
        setField(term635, term635.getClass(), "SMALL_BUF", term636);
        setIntField(term635, term635.getClass(), "recordSize", 1622346318);
        setIntField(term635, term635.getClass(), "blockSize", 1048535127);
        setBooleanField(term635, term635.getClass(), "hasHitEOF", true);
        setLongField(term635, term635.getClass(), "entrySize", -316468845751588286L);
        setLongField(term635, term635.getClass(), "entryOffset", 5127676408959197577L);
        setField(term635, term635.getClass(), "is", null);
        setField(term648, term648.getClass(), "name", "");
        setIntField(term648, term648.getClass(), "mode", -655067527);
        setLongField(term648, term648.getClass(), "userId", -6573104506744284592L);
        setLongField(term648, term648.getClass(), "groupId", -4920224193275732920L);
        setLongField(term648, term648.getClass(), "size", 8428634514691209827L);
        setLongField(term648, term648.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term648, term648.getClass(), "checkSumOK", true);
        setByteField(term648, term648.getClass(), "linkFlag", (byte) 23);
        setField(term648, term648.getClass(), "linkName", "");
        setField(term648, term648.getClass(), "magic", "ustar ");
        setField(term648, term648.getClass(), "version", "00");
        setField(term648, term648.getClass(), "userName", "root");
        setField(term648, term648.getClass(), "groupName", "");
        setIntField(term648, term648.getClass(), "devMajor", -6029667);
        setIntField(term648, term648.getClass(), "devMinor", -2068769794);
        setBooleanField(term648, term648.getClass(), "isExtended", false);
        setLongField(term648, term648.getClass(), "realSize", 8059786003080744426L);
        setField(term684, term684.getClass(), "path", "MjGYSRKTNF");
        setField(term684, term684.getClass(), "status", enum29);
        setIntField(term684, term684.getClass(), "prefixLength", -117576464);
        setField(term684, term684.getClass(), "filePath", null);
        setField(term648, term648.getClass(), "file", term684);
        setField(term635, term635.getClass(), "currEntry", term648);
        setField(term635, term635.getClass(), "zipEncoding", null);
        setField(term635, term635.getClass(), "encoding", "hRNSzYYIrc");
        setByteElement(term713, 0, (byte) -15);
        setByteElement(term713, 1, (byte) 36);
        setField(term635, term635.getClass(), "SINGLE", term713);
        setLongField(term635, term635.getClass(), "bytesRead", -4365849114644724155L);
        Class<? extends Object> term12691 = Class.forName((String) "java.io.File$PathStatus");
        Field term12690 = ((Class) term12691).getDeclaredField((String) "INVALID");
        ((Field) term12690).setAccessible(true);
        Object enum30 = ((Field) term12690).get((Object) null);
        term12457 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12458 = (byte[]) newByteArray(6);
        Object term12459 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12472 = newInstance(Class.forName("java.io.File"));
        byte[] term12479 = (byte[]) newByteArray(2);
        setByteElement(term12458, 0, (byte) 121);
        setByteElement(term12458, 1, (byte) -99);
        setByteElement(term12458, 2, (byte) -2);
        setByteElement(term12458, 3, (byte) -16);
        setByteElement(term12458, 4, (byte) -112);
        setByteElement(term12458, 5, (byte) -111);
        setField(term12457, term12457.getClass(), "SMALL_BUF", term12458);
        setIntField(term12457, term12457.getClass(), "recordSize", 1622346318);
        setIntField(term12457, term12457.getClass(), "blockSize", 1048535127);
        setBooleanField(term12457, term12457.getClass(), "hasHitEOF", true);
        setLongField(term12457, term12457.getClass(), "entrySize", -316468845751588286L);
        setLongField(term12457, term12457.getClass(), "entryOffset", 5127676408959197577L);
        setField(term12457, term12457.getClass(), "is", null);
        setField(term12459, term12459.getClass(), "name", "");
        setIntField(term12459, term12459.getClass(), "mode", -655067527);
        setLongField(term12459, term12459.getClass(), "userId", -6573104506744284592L);
        setLongField(term12459, term12459.getClass(), "groupId", -4920224193275732920L);
        setLongField(term12459, term12459.getClass(), "size", 8428634514691209827L);
        setLongField(term12459, term12459.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term12459, term12459.getClass(), "checkSumOK", true);
        setByteField(term12459, term12459.getClass(), "linkFlag", (byte) 23);
        setField(term12459, term12459.getClass(), "linkName", "");
        setField(term12459, term12459.getClass(), "magic", "ustar ");
        setField(term12459, term12459.getClass(), "version", "00");
        setField(term12459, term12459.getClass(), "userName", "root");
        setField(term12459, term12459.getClass(), "groupName", "");
        setIntField(term12459, term12459.getClass(), "devMajor", -6029667);
        setIntField(term12459, term12459.getClass(), "devMinor", -2068769794);
        setBooleanField(term12459, term12459.getClass(), "isExtended", false);
        setLongField(term12459, term12459.getClass(), "realSize", 8059786003080744426L);
        setField(term12472, term12472.getClass(), "path", "MjGYSRKTNF");
        setField(term12472, term12472.getClass(), "status", enum30);
        setIntField(term12472, term12472.getClass(), "prefixLength", -117576464);
        setField(term12472, term12472.getClass(), "filePath", null);
        setField(term12459, term12459.getClass(), "file", term12472);
        setField(term12457, term12457.getClass(), "currEntry", term12459);
        setField(term12457, term12457.getClass(), "zipEncoding", null);
        setField(term12457, term12457.getClass(), "encoding", "hRNSzYYIrc");
        setByteElement(term12479, 0, (byte) -15);
        setByteElement(term12479, 1, (byte) 36);
        setField(term12457, term12457.getClass(), "SINGLE", term12479);
        setLongField(term12457, term12457.getClass(), "bytesRead", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term635, args);
        assertTrue(recursiveEquals(term635, term12457));
        assertTrue(recursiveEquals(retValue, 861259961));
    }

};


