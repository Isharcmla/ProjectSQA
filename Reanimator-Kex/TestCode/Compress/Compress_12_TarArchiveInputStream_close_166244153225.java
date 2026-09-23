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

public class TarArchiveInputStream_close_166244153225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term95144;

    public TarArchiveInputStream_close_166244153225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95198 = Class.forName((String) "java.io.File$PathStatus");
        Field term95197 = ((Class) term95198).getDeclaredField((String) "INVALID");
        ((Field) term95197).setAccessible(true);
        Object enum19 = ((Field) term95197).get((Object) null);
        term7 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11 = (byte[]) newByteArray(5);
        Object term17 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term18 = (byte[]) newByteArray(4);
        Object term28 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term63 = newInstance(Class.forName("java.io.File"));
        byte[] term80 = (byte[]) newByteArray(3);
        setBooleanField(term7, term7.getClass(), "hasHitEOF", false);
        setLongField(term7, term7.getClass(), "entrySize", 2442117782898005296L);
        setLongField(term7, term7.getClass(), "entryOffset", 6375119433582206027L);
        setByteElement(term11, 0, (byte) 47);
        setByteElement(term11, 1, (byte) 48);
        setByteElement(term11, 2, (byte) 89);
        setByteElement(term11, 3, (byte) 75);
        setByteElement(term11, 4, (byte) 18);
        setField(term7, term7.getClass(), "readBuf", term11);
        setField(term17, term17.getClass(), "inStream", null);
        setField(term17, term17.getClass(), "outStream", null);
        setByteElement(term18, 0, (byte) -58);
        setByteElement(term18, 1, (byte) -29);
        setByteElement(term18, 2, (byte) -54);
        setByteElement(term18, 3, (byte) -10);
        setField(term17, term17.getClass(), "blockBuffer", term18);
        setIntField(term17, term17.getClass(), "currBlkIdx", 391863371);
        setIntField(term17, term17.getClass(), "currRecIdx", -1922583790);
        setIntField(term17, term17.getClass(), "blockSize", -616727354);
        setIntField(term17, term17.getClass(), "recordSize", -1955890973);
        setIntField(term17, term17.getClass(), "recsPerBlock", -2038273078);
        setField(term7, term7.getClass(), "buffer", term17);
        setField(term28, term28.getClass(), "name", "");
        setIntField(term28, term28.getClass(), "mode", 1227103734);
        setIntField(term28, term28.getClass(), "userId", -1339778481);
        setIntField(term28, term28.getClass(), "groupId", 1725571209);
        setLongField(term28, term28.getClass(), "size", -8257434502486459194L);
        setLongField(term28, term28.getClass(), "modTime", -8400487765614892086L);
        setByteField(term28, term28.getClass(), "linkFlag", (byte) 79);
        setField(term28, term28.getClass(), "linkName", "");
        setField(term28, term28.getClass(), "magic", "ustar ");
        setField(term28, term28.getClass(), "version", "00");
        setField(term28, term28.getClass(), "userName", "root");
        setField(term28, term28.getClass(), "groupName", "");
        setIntField(term28, term28.getClass(), "devMajor", -522618178);
        setIntField(term28, term28.getClass(), "devMinor", 1134449235);
        setBooleanField(term28, term28.getClass(), "isExtended", false);
        setLongField(term28, term28.getClass(), "realSize", 5270370404989704783L);
        setField(term63, term63.getClass(), "path", "PAEBtnZtTD");
        setField(term63, term63.getClass(), "status", enum19);
        setIntField(term63, term63.getClass(), "prefixLength", -883034806);
        setField(term63, term63.getClass(), "filePath", null);
        setField(term28, term28.getClass(), "file", term63);
        setField(term7, term7.getClass(), "currEntry", term28);
        setByteElement(term80, 0, (byte) -119);
        setByteElement(term80, 1, (byte) -66);
        setByteElement(term80, 2, (byte) 83);
        setField(term7, term7.getClass(), "SINGLE", term80);
        setLongField(term7, term7.getClass(), "bytesRead", 7411271909051562686L);
        Class<? extends Object> term95375 = Class.forName((String) "java.io.File$PathStatus");
        Field term95374 = ((Class) term95375).getDeclaredField((String) "CHECKED");
        ((Field) term95374).setAccessible(true);
        Object enum20 = ((Field) term95374).get((Object) null);
        term95144 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term95145 = (byte[]) newByteArray(5);
        Object term95146 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term95147 = (byte[]) newByteArray(4);
        Object term95148 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term95161 = newInstance(Class.forName("java.io.File"));
        byte[] term95166 = (byte[]) newByteArray(3);
        setBooleanField(term95144, term95144.getClass(), "hasHitEOF", false);
        setLongField(term95144, term95144.getClass(), "entrySize", 2442117782898005296L);
        setLongField(term95144, term95144.getClass(), "entryOffset", 6375119433582206027L);
        setByteElement(term95145, 0, (byte) 47);
        setByteElement(term95145, 1, (byte) 48);
        setByteElement(term95145, 2, (byte) 89);
        setByteElement(term95145, 3, (byte) 75);
        setByteElement(term95145, 4, (byte) 18);
        setField(term95144, term95144.getClass(), "readBuf", term95145);
        setField(term95146, term95146.getClass(), "inStream", null);
        setField(term95146, term95146.getClass(), "outStream", null);
        setByteElement(term95147, 0, (byte) -58);
        setByteElement(term95147, 1, (byte) -29);
        setByteElement(term95147, 2, (byte) -54);
        setByteElement(term95147, 3, (byte) -10);
        setField(term95146, term95146.getClass(), "blockBuffer", term95147);
        setIntField(term95146, term95146.getClass(), "currBlkIdx", 391863371);
        setIntField(term95146, term95146.getClass(), "currRecIdx", -1922583790);
        setIntField(term95146, term95146.getClass(), "blockSize", -616727354);
        setIntField(term95146, term95146.getClass(), "recordSize", -1955890973);
        setIntField(term95146, term95146.getClass(), "recsPerBlock", -2038273078);
        setField(term95144, term95144.getClass(), "buffer", term95146);
        setField(term95148, term95148.getClass(), "name", "");
        setIntField(term95148, term95148.getClass(), "mode", 1227103734);
        setIntField(term95148, term95148.getClass(), "userId", -1339778481);
        setIntField(term95148, term95148.getClass(), "groupId", 1725571209);
        setLongField(term95148, term95148.getClass(), "size", -8257434502486459194L);
        setLongField(term95148, term95148.getClass(), "modTime", -8400487765614892086L);
        setByteField(term95148, term95148.getClass(), "linkFlag", (byte) 79);
        setField(term95148, term95148.getClass(), "linkName", "");
        setField(term95148, term95148.getClass(), "magic", "ustar ");
        setField(term95148, term95148.getClass(), "version", "00");
        setField(term95148, term95148.getClass(), "userName", "root");
        setField(term95148, term95148.getClass(), "groupName", "");
        setIntField(term95148, term95148.getClass(), "devMajor", -522618178);
        setIntField(term95148, term95148.getClass(), "devMinor", 1134449235);
        setBooleanField(term95148, term95148.getClass(), "isExtended", false);
        setLongField(term95148, term95148.getClass(), "realSize", 5270370404989704783L);
        setField(term95161, term95161.getClass(), "path", "PAEBtnZtTD");
        setField(term95161, term95161.getClass(), "status", enum20);
        setIntField(term95161, term95161.getClass(), "prefixLength", -883034806);
        setField(term95161, term95161.getClass(), "filePath", null);
        setField(term95148, term95148.getClass(), "file", term95161);
        setField(term95144, term95144.getClass(), "currEntry", term95148);
        setByteElement(term95166, 0, (byte) -119);
        setByteElement(term95166, 1, (byte) -66);
        setByteElement(term95166, 2, (byte) 83);
        setField(term95144, term95144.getClass(), "SINGLE", term95166);
        setLongField(term95144, term95144.getClass(), "bytesRead", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term95144));
    }

};


