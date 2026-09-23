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

public class TarArchiveOutputStream_createArchiveEntry_79928157425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term702;
     Object term78123;
     Object term78131;
     Object term78000;

    public TarArchiveOutputStream_createArchiveEntry_79928157425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term675 = (byte[]) newByteArray(1);
        byte[] term678 = (byte[]) newByteArray(0);
        Object term679 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term680 = (byte[]) newByteArray(9);
        byte[] term697 = (byte[]) newByteArray(4);
        setLongField(term660, term660.getClass(), "currSize", -6573104506744284592L);
        setField(term660, term660.getClass(), "currName", "RMFIsYGgne");
        setLongField(term660, term660.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term675, 0, (byte) -126);
        setField(term660, term660.getClass(), "recordBuf", term675);
        setIntField(term660, term660.getClass(), "assemLen", -478195677);
        setField(term660, term660.getClass(), "assemBuf", term678);
        setField(term679, term679.getClass(), "inStream", null);
        setField(term679, term679.getClass(), "outStream", null);
        setByteElement(term680, 0, (byte) 12);
        setByteElement(term680, 1, (byte) -75);
        setByteElement(term680, 2, (byte) 69);
        setByteElement(term680, 3, (byte) -6);
        setByteElement(term680, 4, (byte) 107);
        setByteElement(term680, 5, (byte) -109);
        setByteElement(term680, 6, (byte) 122);
        setByteElement(term680, 7, (byte) 83);
        setByteElement(term680, 8, (byte) -123);
        setField(term679, term679.getClass(), "blockBuffer", term680);
        setIntField(term679, term679.getClass(), "currBlkIdx", 972867650);
        setIntField(term679, term679.getClass(), "currRecIdx", 1655935355);
        setIntField(term679, term679.getClass(), "blockSize", -481533957);
        setIntField(term679, term679.getClass(), "recordSize", 1240914516);
        setIntField(term679, term679.getClass(), "recsPerBlock", -1465035361);
        setField(term660, term660.getClass(), "buffer", term679);
        setIntField(term660, term660.getClass(), "longFileMode", 1090617576);
        setBooleanField(term660, term660.getClass(), "closed", true);
        setField(term660, term660.getClass(), "out", null);
        setByteElement(term697, 0, (byte) -76);
        setByteElement(term697, 1, (byte) -115);
        setByteElement(term697, 2, (byte) -48);
        setByteElement(term697, 3, (byte) 126);
        setField(term660, term660.getClass(), "oneByte", term697);
        Class<? extends Object> term78174 = Class.forName((String) "java.io.File$PathStatus");
        Field term78173 = ((Class) term78174).getDeclaredField((String) "INVALID");
        ((Field) term78173).setAccessible(true);
        Object enum1 = ((Field) term78173).get((Object) null);
        term702 = newInstance(Class.forName("java.io.File"));
        setField(term702, term702.getClass(), "path", "NRdvgJlhkX");
        setField(term702, term702.getClass(), "status", enum1);
        setIntField(term702, term702.getClass(), "prefixLength", -1547384488);
        setField(term702, term702.getClass(), "filePath", null);
        term78123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term78126 = (byte[]) newByteArray(1);
        byte[] term78127 = (byte[]) newByteArray(0);
        Object term78128 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term78129 = (byte[]) newByteArray(9);
        byte[] term78130 = (byte[]) newByteArray(4);
        setLongField(term78123, term78123.getClass(), "currSize", -6573104506744284592L);
        setField(term78123, term78123.getClass(), "currName", "RMFIsYGgne");
        setLongField(term78123, term78123.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term78126, 0, (byte) -126);
        setField(term78123, term78123.getClass(), "recordBuf", term78126);
        setIntField(term78123, term78123.getClass(), "assemLen", -478195677);
        setField(term78123, term78123.getClass(), "assemBuf", term78127);
        setField(term78128, term78128.getClass(), "inStream", null);
        setField(term78128, term78128.getClass(), "outStream", null);
        setByteElement(term78129, 0, (byte) 12);
        setByteElement(term78129, 1, (byte) -75);
        setByteElement(term78129, 2, (byte) 69);
        setByteElement(term78129, 3, (byte) -6);
        setByteElement(term78129, 4, (byte) 107);
        setByteElement(term78129, 5, (byte) -109);
        setByteElement(term78129, 6, (byte) 122);
        setByteElement(term78129, 7, (byte) 83);
        setByteElement(term78129, 8, (byte) -123);
        setField(term78128, term78128.getClass(), "blockBuffer", term78129);
        setIntField(term78128, term78128.getClass(), "currBlkIdx", 972867650);
        setIntField(term78128, term78128.getClass(), "currRecIdx", 1655935355);
        setIntField(term78128, term78128.getClass(), "blockSize", -481533957);
        setIntField(term78128, term78128.getClass(), "recordSize", 1240914516);
        setIntField(term78128, term78128.getClass(), "recsPerBlock", -1465035361);
        setField(term78123, term78123.getClass(), "buffer", term78128);
        setIntField(term78123, term78123.getClass(), "longFileMode", 1090617576);
        setBooleanField(term78123, term78123.getClass(), "closed", true);
        setField(term78123, term78123.getClass(), "out", null);
        setByteElement(term78130, 0, (byte) -76);
        setByteElement(term78130, 1, (byte) -115);
        setByteElement(term78130, 2, (byte) -48);
        setByteElement(term78130, 3, (byte) 126);
        setField(term78123, term78123.getClass(), "oneByte", term78130);
        Class<? extends Object> term78361 = Class.forName((String) "java.io.File$PathStatus");
        Field term78360 = ((Class) term78361).getDeclaredField((String) "INVALID");
        ((Field) term78360).setAccessible(true);
        Object enum2 = ((Field) term78360).get((Object) null);
        term78131 = newInstance(Class.forName("java.io.File"));
        setField(term78131, term78131.getClass(), "path", "NRdvgJlhkX");
        setField(term78131, term78131.getClass(), "status", enum2);
        setIntField(term78131, term78131.getClass(), "prefixLength", -1547384488);
        setField(term78131, term78131.getClass(), "filePath", null);
        Class<? extends Object> term78546 = Class.forName((String) "java.io.File$PathStatus");
        Field term78545 = ((Class) term78546).getDeclaredField((String) "INVALID");
        ((Field) term78545).setAccessible(true);
        Object enum3 = ((Field) term78545).get((Object) null);
        term78000 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term78043 = newInstance(Class.forName("java.io.File"));
        setField(term78000, term78000.getClass(), "name", "uuaPigETmJ");
        setIntField(term78000, term78000.getClass(), "mode", 33188);
        setIntField(term78000, term78000.getClass(), "userId", 0);
        setIntField(term78000, term78000.getClass(), "groupId", 0);
        setLongField(term78000, term78000.getClass(), "size", 0L);
        setLongField(term78000, term78000.getClass(), "modTime", 0L);
        setByteField(term78000, term78000.getClass(), "linkFlag", (byte) 48);
        setField(term78000, term78000.getClass(), "linkName", "");
        setField(term78000, term78000.getClass(), "magic", "ustar ");
        setField(term78000, term78000.getClass(), "version", "00");
        setField(term78000, term78000.getClass(), "userName", "root");
        setField(term78000, term78000.getClass(), "groupName", "");
        setIntField(term78000, term78000.getClass(), "devMajor", 0);
        setIntField(term78000, term78000.getClass(), "devMinor", 0);
        setField(term78043, term78043.getClass(), "path", "NRdvgJlhkX");
        setField(term78043, term78043.getClass(), "status", enum3);
        setIntField(term78043, term78043.getClass(), "prefixLength", -1547384488);
        setField(term78043, term78043.getClass(), "filePath", null);
        setField(term78000, term78000.getClass(), "file", term78043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term702;
        args[1] = "uuaPigETmJ";
        Object retValue = callMethod(klass, "createArchiveEntry", argTypes, term660, args);
        assertTrue(recursiveEquals(term660, term78123));
        assertTrue(recursiveEquals(term702, term78131));
        assertTrue(recursiveEquals(retValue, term78000));
    }

};


