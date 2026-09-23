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
     Object term669;
     Object term712;
     Object term77940;
     Object term77948;
     Object term77816;

    public TarArchiveOutputStream_createArchiveEntry_79928157425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term684 = (byte[]) newByteArray(1);
        byte[] term687 = (byte[]) newByteArray(0);
        Object term688 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term689 = (byte[]) newByteArray(9);
        byte[] term707 = (byte[]) newByteArray(4);
        setLongField(term669, term669.getClass(), "currSize", -6573104506744284592L);
        setField(term669, term669.getClass(), "currName", "RMFIsYGgne");
        setLongField(term669, term669.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term684, 0, (byte) -126);
        setField(term669, term669.getClass(), "recordBuf", term684);
        setIntField(term669, term669.getClass(), "assemLen", -478195677);
        setField(term669, term669.getClass(), "assemBuf", term687);
        setField(term688, term688.getClass(), "inStream", null);
        setField(term688, term688.getClass(), "outStream", null);
        setByteElement(term689, 0, (byte) 12);
        setByteElement(term689, 1, (byte) -75);
        setByteElement(term689, 2, (byte) 69);
        setByteElement(term689, 3, (byte) -6);
        setByteElement(term689, 4, (byte) 107);
        setByteElement(term689, 5, (byte) -109);
        setByteElement(term689, 6, (byte) 122);
        setByteElement(term689, 7, (byte) 83);
        setByteElement(term689, 8, (byte) -123);
        setField(term688, term688.getClass(), "blockBuffer", term689);
        setIntField(term688, term688.getClass(), "currBlkIdx", 972867650);
        setIntField(term688, term688.getClass(), "currRecIdx", 1655935355);
        setIntField(term688, term688.getClass(), "blockSize", -481533957);
        setIntField(term688, term688.getClass(), "recordSize", 1240914516);
        setIntField(term688, term688.getClass(), "recsPerBlock", -1465035361);
        setField(term669, term669.getClass(), "buffer", term688);
        setIntField(term669, term669.getClass(), "longFileMode", 1090617576);
        setBooleanField(term669, term669.getClass(), "closed", false);
        setBooleanField(term669, term669.getClass(), "haveUnclosedEntry", false);
        setField(term669, term669.getClass(), "out", null);
        setByteElement(term707, 0, (byte) -76);
        setByteElement(term707, 1, (byte) -115);
        setByteElement(term707, 2, (byte) -48);
        setByteElement(term707, 3, (byte) 126);
        setField(term669, term669.getClass(), "oneByte", term707);
        Class<? extends Object> term77991 = Class.forName((String) "java.io.File$PathStatus");
        Field term77990 = ((Class) term77991).getDeclaredField((String) "INVALID");
        ((Field) term77990).setAccessible(true);
        Object enum1 = ((Field) term77990).get((Object) null);
        term712 = newInstance(Class.forName("java.io.File"));
        setField(term712, term712.getClass(), "path", "NRdvgJlhkX");
        setField(term712, term712.getClass(), "status", enum1);
        setIntField(term712, term712.getClass(), "prefixLength", -1547384488);
        setField(term712, term712.getClass(), "filePath", null);
        term77940 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term77943 = (byte[]) newByteArray(1);
        byte[] term77944 = (byte[]) newByteArray(0);
        Object term77945 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term77946 = (byte[]) newByteArray(9);
        byte[] term77947 = (byte[]) newByteArray(4);
        setLongField(term77940, term77940.getClass(), "currSize", -6573104506744284592L);
        setField(term77940, term77940.getClass(), "currName", "RMFIsYGgne");
        setLongField(term77940, term77940.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term77943, 0, (byte) -126);
        setField(term77940, term77940.getClass(), "recordBuf", term77943);
        setIntField(term77940, term77940.getClass(), "assemLen", -478195677);
        setField(term77940, term77940.getClass(), "assemBuf", term77944);
        setField(term77945, term77945.getClass(), "inStream", null);
        setField(term77945, term77945.getClass(), "outStream", null);
        setByteElement(term77946, 0, (byte) 12);
        setByteElement(term77946, 1, (byte) -75);
        setByteElement(term77946, 2, (byte) 69);
        setByteElement(term77946, 3, (byte) -6);
        setByteElement(term77946, 4, (byte) 107);
        setByteElement(term77946, 5, (byte) -109);
        setByteElement(term77946, 6, (byte) 122);
        setByteElement(term77946, 7, (byte) 83);
        setByteElement(term77946, 8, (byte) -123);
        setField(term77945, term77945.getClass(), "blockBuffer", term77946);
        setIntField(term77945, term77945.getClass(), "currBlkIdx", 972867650);
        setIntField(term77945, term77945.getClass(), "currRecIdx", 1655935355);
        setIntField(term77945, term77945.getClass(), "blockSize", -481533957);
        setIntField(term77945, term77945.getClass(), "recordSize", 1240914516);
        setIntField(term77945, term77945.getClass(), "recsPerBlock", -1465035361);
        setField(term77940, term77940.getClass(), "buffer", term77945);
        setIntField(term77940, term77940.getClass(), "longFileMode", 1090617576);
        setBooleanField(term77940, term77940.getClass(), "closed", false);
        setBooleanField(term77940, term77940.getClass(), "haveUnclosedEntry", false);
        setField(term77940, term77940.getClass(), "out", null);
        setByteElement(term77947, 0, (byte) -76);
        setByteElement(term77947, 1, (byte) -115);
        setByteElement(term77947, 2, (byte) -48);
        setByteElement(term77947, 3, (byte) 126);
        setField(term77940, term77940.getClass(), "oneByte", term77947);
        Class<? extends Object> term78178 = Class.forName((String) "java.io.File$PathStatus");
        Field term78177 = ((Class) term78178).getDeclaredField((String) "INVALID");
        ((Field) term78177).setAccessible(true);
        Object enum2 = ((Field) term78177).get((Object) null);
        term77948 = newInstance(Class.forName("java.io.File"));
        setField(term77948, term77948.getClass(), "path", "NRdvgJlhkX");
        setField(term77948, term77948.getClass(), "status", enum2);
        setIntField(term77948, term77948.getClass(), "prefixLength", -1547384488);
        setField(term77948, term77948.getClass(), "filePath", null);
        Class<? extends Object> term78363 = Class.forName((String) "java.io.File$PathStatus");
        Field term78362 = ((Class) term78363).getDeclaredField((String) "INVALID");
        ((Field) term78362).setAccessible(true);
        Object enum3 = ((Field) term78362).get((Object) null);
        term77816 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term77859 = newInstance(Class.forName("java.io.File"));
        setField(term77816, term77816.getClass(), "name", "uuaPigETmJ");
        setIntField(term77816, term77816.getClass(), "mode", 33188);
        setIntField(term77816, term77816.getClass(), "userId", 0);
        setIntField(term77816, term77816.getClass(), "groupId", 0);
        setLongField(term77816, term77816.getClass(), "size", 0L);
        setLongField(term77816, term77816.getClass(), "modTime", 0L);
        setByteField(term77816, term77816.getClass(), "linkFlag", (byte) 48);
        setField(term77816, term77816.getClass(), "linkName", "");
        setField(term77816, term77816.getClass(), "magic", "ustar ");
        setField(term77816, term77816.getClass(), "version", "00");
        setField(term77816, term77816.getClass(), "userName", "root");
        setField(term77816, term77816.getClass(), "groupName", "");
        setIntField(term77816, term77816.getClass(), "devMajor", 0);
        setIntField(term77816, term77816.getClass(), "devMinor", 0);
        setField(term77859, term77859.getClass(), "path", "NRdvgJlhkX");
        setField(term77859, term77859.getClass(), "status", enum3);
        setIntField(term77859, term77859.getClass(), "prefixLength", -1547384488);
        setField(term77859, term77859.getClass(), "filePath", null);
        setField(term77816, term77816.getClass(), "file", term77859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term712;
        args[1] = "uuaPigETmJ";
        Object retValue = callMethod(klass, "createArchiveEntry", argTypes, term669, args);
        assertTrue(recursiveEquals(term669, term77940));
        assertTrue(recursiveEquals(term712, term77948));
        assertTrue(recursiveEquals(retValue, term77816));
    }

};


