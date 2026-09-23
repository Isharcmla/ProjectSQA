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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_close_166244153239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public TarArchiveInputStream_close_166244153239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11098 = Class.forName((String) "java.io.File$PathStatus");
        Field term11097 = ((Class) term11098).getDeclaredField((String) "CHECKED");
        ((Field) term11097).setAccessible(true);
        Object enum26 = ((Field) term11097).get((Object) null);
        term79 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term80 = (byte[]) newByteArray(5);
        Object term91 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term127 = newInstance(Class.forName("java.io.File"));
        byte[] term144 = (byte[]) newByteArray(4);
        setByteElement(term80, 0, (byte) 47);
        setByteElement(term80, 1, (byte) 48);
        setByteElement(term80, 2, (byte) 89);
        setByteElement(term80, 3, (byte) 75);
        setByteElement(term80, 4, (byte) 18);
        setField(term79, term79.getClass(), "SMALL_BUF", term80);
        setIntField(term79, term79.getClass(), "recordSize", -1955890973);
        setIntField(term79, term79.getClass(), "blockSize", -2038273078);
        setBooleanField(term79, term79.getClass(), "hasHitEOF", false);
        setLongField(term79, term79.getClass(), "entrySize", 2442117782898005296L);
        setLongField(term79, term79.getClass(), "entryOffset", 6375119433582206027L);
        setField(term79, term79.getClass(), "is", null);
        setField(term91, term91.getClass(), "name", "");
        setIntField(term91, term91.getClass(), "mode", 1227103734);
        setIntField(term91, term91.getClass(), "userId", -1339778481);
        setIntField(term91, term91.getClass(), "groupId", 1725571209);
        setLongField(term91, term91.getClass(), "size", -8257434502486459194L);
        setLongField(term91, term91.getClass(), "modTime", -8400487765614892086L);
        setBooleanField(term91, term91.getClass(), "checkSumOK", false);
        setByteField(term91, term91.getClass(), "linkFlag", (byte) -58);
        setField(term91, term91.getClass(), "linkName", "");
        setField(term91, term91.getClass(), "magic", "ustar ");
        setField(term91, term91.getClass(), "version", "00");
        setField(term91, term91.getClass(), "userName", "root");
        setField(term91, term91.getClass(), "groupName", "");
        setIntField(term91, term91.getClass(), "devMajor", -522618178);
        setIntField(term91, term91.getClass(), "devMinor", 1134449235);
        setBooleanField(term91, term91.getClass(), "isExtended", false);
        setLongField(term91, term91.getClass(), "realSize", 5270370404989704783L);
        setField(term127, term127.getClass(), "path", "xxtlPwDYFs");
        setField(term127, term127.getClass(), "status", enum26);
        setIntField(term127, term127.getClass(), "prefixLength", -883034806);
        setField(term127, term127.getClass(), "filePath", null);
        setField(term91, term91.getClass(), "file", term127);
        setField(term79, term79.getClass(), "currEntry", term91);
        setField(term79, term79.getClass(), "zipEncoding", null);
        setByteElement(term144, 0, (byte) -29);
        setByteElement(term144, 1, (byte) -54);
        setByteElement(term144, 2, (byte) -10);
        setByteElement(term144, 3, (byte) 79);
        setField(term79, term79.getClass(), "SINGLE", term144);
        setLongField(term79, term79.getClass(), "bytesRead", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term79, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


