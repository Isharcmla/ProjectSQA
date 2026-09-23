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
import java.lang.Boolean;

public class TarArchiveInputStream_setAtEOF_27463930742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4657;
     Object term4746;
     Object term153171;

    public TarArchiveInputStream_setAtEOF_27463930742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term153232 = Class.forName((String) "java.io.File$PathStatus");
        Field term153231 = ((Class) term153232).getDeclaredField((String) "INVALID");
        ((Field) term153231).setAccessible(true);
        Object enum52 = ((Field) term153231).get((Object) null);
        term4657 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4661 = (byte[]) newByteArray(7);
        Object term4669 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term4670 = (byte[]) newByteArray(9);
        Object term4685 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4720 = newInstance(Class.forName("java.io.File"));
        byte[] term4737 = (byte[]) newByteArray(7);
        setBooleanField(term4657, term4657.getClass(), "hasHitEOF", true);
        setLongField(term4657, term4657.getClass(), "entrySize", 2354625302846375590L);
        setLongField(term4657, term4657.getClass(), "entryOffset", 7276637106827860087L);
        setByteElement(term4661, 0, (byte) 77);
        setByteElement(term4661, 1, (byte) -1);
        setByteElement(term4661, 2, (byte) -83);
        setByteElement(term4661, 3, (byte) -63);
        setByteElement(term4661, 4, (byte) 108);
        setByteElement(term4661, 5, (byte) -105);
        setByteElement(term4661, 6, (byte) 33);
        setField(term4657, term4657.getClass(), "readBuf", term4661);
        setField(term4669, term4669.getClass(), "inStream", null);
        setField(term4669, term4669.getClass(), "outStream", null);
        setByteElement(term4670, 0, (byte) 109);
        setByteElement(term4670, 1, (byte) -54);
        setByteElement(term4670, 2, (byte) -85);
        setByteElement(term4670, 3, (byte) 81);
        setByteElement(term4670, 4, (byte) -113);
        setByteElement(term4670, 5, (byte) 90);
        setByteElement(term4670, 6, (byte) 10);
        setByteElement(term4670, 7, (byte) 87);
        setByteElement(term4670, 8, (byte) -35);
        setField(term4669, term4669.getClass(), "blockBuffer", term4670);
        setIntField(term4669, term4669.getClass(), "currBlkIdx", 1152356969);
        setIntField(term4669, term4669.getClass(), "currRecIdx", -1667990367);
        setIntField(term4669, term4669.getClass(), "blockSize", -1214628358);
        setIntField(term4669, term4669.getClass(), "recordSize", 1102721075);
        setIntField(term4669, term4669.getClass(), "recsPerBlock", -426764678);
        setField(term4657, term4657.getClass(), "buffer", term4669);
        setField(term4685, term4685.getClass(), "name", "");
        setIntField(term4685, term4685.getClass(), "mode", -1222614956);
        setIntField(term4685, term4685.getClass(), "userId", -1870495012);
        setIntField(term4685, term4685.getClass(), "groupId", -1310015129);
        setLongField(term4685, term4685.getClass(), "size", -3936701866695933852L);
        setLongField(term4685, term4685.getClass(), "modTime", 1215116475929634177L);
        setByteField(term4685, term4685.getClass(), "linkFlag", (byte) -14);
        setField(term4685, term4685.getClass(), "linkName", "");
        setField(term4685, term4685.getClass(), "magic", "ustar ");
        setField(term4685, term4685.getClass(), "version", "00");
        setField(term4685, term4685.getClass(), "userName", "root");
        setField(term4685, term4685.getClass(), "groupName", "");
        setIntField(term4685, term4685.getClass(), "devMajor", -2104981311);
        setIntField(term4685, term4685.getClass(), "devMinor", -571169753);
        setBooleanField(term4685, term4685.getClass(), "isExtended", true);
        setLongField(term4685, term4685.getClass(), "realSize", 1597484336218508869L);
        setField(term4720, term4720.getClass(), "path", "xOEqzGAmDU");
        setField(term4720, term4720.getClass(), "status", enum52);
        setIntField(term4720, term4720.getClass(), "prefixLength", 318591690);
        setField(term4720, term4720.getClass(), "filePath", null);
        setField(term4685, term4685.getClass(), "file", term4720);
        setField(term4657, term4657.getClass(), "currEntry", term4685);
        setByteElement(term4737, 0, (byte) 10);
        setByteElement(term4737, 1, (byte) 65);
        setByteElement(term4737, 2, (byte) -44);
        setByteElement(term4737, 3, (byte) 115);
        setByteElement(term4737, 4, (byte) -32);
        setByteElement(term4737, 5, (byte) -52);
        setByteElement(term4737, 6, (byte) 53);
        setField(term4657, term4657.getClass(), "SINGLE", term4737);
        setLongField(term4657, term4657.getClass(), "bytesRead", -685023850445639859L);
        term4746 = new Boolean(true);
        Class<? extends Object> term153420 = Class.forName((String) "java.io.File$PathStatus");
        Field term153419 = ((Class) term153420).getDeclaredField((String) "CHECKED");
        ((Field) term153419).setAccessible(true);
        Object enum53 = ((Field) term153419).get((Object) null);
        term153171 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term153172 = (byte[]) newByteArray(7);
        Object term153173 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term153174 = (byte[]) newByteArray(9);
        Object term153175 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term153188 = newInstance(Class.forName("java.io.File"));
        byte[] term153193 = (byte[]) newByteArray(7);
        setBooleanField(term153171, term153171.getClass(), "hasHitEOF", true);
        setLongField(term153171, term153171.getClass(), "entrySize", 2354625302846375590L);
        setLongField(term153171, term153171.getClass(), "entryOffset", 7276637106827860087L);
        setByteElement(term153172, 0, (byte) 77);
        setByteElement(term153172, 1, (byte) -1);
        setByteElement(term153172, 2, (byte) -83);
        setByteElement(term153172, 3, (byte) -63);
        setByteElement(term153172, 4, (byte) 108);
        setByteElement(term153172, 5, (byte) -105);
        setByteElement(term153172, 6, (byte) 33);
        setField(term153171, term153171.getClass(), "readBuf", term153172);
        setField(term153173, term153173.getClass(), "inStream", null);
        setField(term153173, term153173.getClass(), "outStream", null);
        setByteElement(term153174, 0, (byte) 109);
        setByteElement(term153174, 1, (byte) -54);
        setByteElement(term153174, 2, (byte) -85);
        setByteElement(term153174, 3, (byte) 81);
        setByteElement(term153174, 4, (byte) -113);
        setByteElement(term153174, 5, (byte) 90);
        setByteElement(term153174, 6, (byte) 10);
        setByteElement(term153174, 7, (byte) 87);
        setByteElement(term153174, 8, (byte) -35);
        setField(term153173, term153173.getClass(), "blockBuffer", term153174);
        setIntField(term153173, term153173.getClass(), "currBlkIdx", 1152356969);
        setIntField(term153173, term153173.getClass(), "currRecIdx", -1667990367);
        setIntField(term153173, term153173.getClass(), "blockSize", -1214628358);
        setIntField(term153173, term153173.getClass(), "recordSize", 1102721075);
        setIntField(term153173, term153173.getClass(), "recsPerBlock", -426764678);
        setField(term153171, term153171.getClass(), "buffer", term153173);
        setField(term153175, term153175.getClass(), "name", "");
        setIntField(term153175, term153175.getClass(), "mode", -1222614956);
        setIntField(term153175, term153175.getClass(), "userId", -1870495012);
        setIntField(term153175, term153175.getClass(), "groupId", -1310015129);
        setLongField(term153175, term153175.getClass(), "size", -3936701866695933852L);
        setLongField(term153175, term153175.getClass(), "modTime", 1215116475929634177L);
        setByteField(term153175, term153175.getClass(), "linkFlag", (byte) -14);
        setField(term153175, term153175.getClass(), "linkName", "");
        setField(term153175, term153175.getClass(), "magic", "ustar ");
        setField(term153175, term153175.getClass(), "version", "00");
        setField(term153175, term153175.getClass(), "userName", "root");
        setField(term153175, term153175.getClass(), "groupName", "");
        setIntField(term153175, term153175.getClass(), "devMajor", -2104981311);
        setIntField(term153175, term153175.getClass(), "devMinor", -571169753);
        setBooleanField(term153175, term153175.getClass(), "isExtended", true);
        setLongField(term153175, term153175.getClass(), "realSize", 1597484336218508869L);
        setField(term153188, term153188.getClass(), "path", "xOEqzGAmDU");
        setField(term153188, term153188.getClass(), "status", enum53);
        setIntField(term153188, term153188.getClass(), "prefixLength", 318591690);
        setField(term153188, term153188.getClass(), "filePath", null);
        setField(term153175, term153175.getClass(), "file", term153188);
        setField(term153171, term153171.getClass(), "currEntry", term153175);
        setByteElement(term153193, 0, (byte) 10);
        setByteElement(term153193, 1, (byte) 65);
        setByteElement(term153193, 2, (byte) -44);
        setByteElement(term153193, 3, (byte) 115);
        setByteElement(term153193, 4, (byte) -32);
        setByteElement(term153193, 5, (byte) -52);
        setByteElement(term153193, 6, (byte) 53);
        setField(term153171, term153171.getClass(), "SINGLE", term153193);
        setLongField(term153171, term153171.getClass(), "bytesRead", -685023850445639859L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4746;
        callMethod(klass, "setAtEOF", argTypes, term4657, args);
        assertTrue(recursiveEquals(term4657, term153171));
        assertTrue(recursiveEquals(term4746, true));
    }

};


