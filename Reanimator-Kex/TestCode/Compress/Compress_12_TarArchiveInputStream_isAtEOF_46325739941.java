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

public class TarArchiveInputStream_isAtEOF_46325739941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4418;
     Object term152096;

    public TarArchiveInputStream_isAtEOF_46325739941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152300 = Class.forName((String) "java.io.File$PathStatus");
        Field term152299 = ((Class) term152300).getDeclaredField((String) "INVALID");
        ((Field) term152299).setAccessible(true);
        Object enum48 = ((Field) term152299).get((Object) null);
        term4418 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4422 = (byte[]) newByteArray(0);
        Object term4423 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term4424 = (byte[]) newByteArray(4);
        Object term4434 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4469 = newInstance(Class.forName("java.io.File"));
        byte[] term4486 = (byte[]) newByteArray(0);
        setBooleanField(term4418, term4418.getClass(), "hasHitEOF", true);
        setLongField(term4418, term4418.getClass(), "entrySize", -5216789073301458893L);
        setLongField(term4418, term4418.getClass(), "entryOffset", -1832940336320585644L);
        setField(term4418, term4418.getClass(), "readBuf", term4422);
        setField(term4423, term4423.getClass(), "inStream", null);
        setField(term4423, term4423.getClass(), "outStream", null);
        setByteElement(term4424, 0, (byte) -1);
        setByteElement(term4424, 1, (byte) -127);
        setByteElement(term4424, 2, (byte) -118);
        setByteElement(term4424, 3, (byte) 69);
        setField(term4423, term4423.getClass(), "blockBuffer", term4424);
        setIntField(term4423, term4423.getClass(), "currBlkIdx", -1896376975);
        setIntField(term4423, term4423.getClass(), "currRecIdx", 729658803);
        setIntField(term4423, term4423.getClass(), "blockSize", 114754804);
        setIntField(term4423, term4423.getClass(), "recordSize", 1687361082);
        setIntField(term4423, term4423.getClass(), "recsPerBlock", 584893196);
        setField(term4418, term4418.getClass(), "buffer", term4423);
        setField(term4434, term4434.getClass(), "name", "");
        setIntField(term4434, term4434.getClass(), "mode", 497269071);
        setIntField(term4434, term4434.getClass(), "userId", -1899301124);
        setIntField(term4434, term4434.getClass(), "groupId", -1882480155);
        setLongField(term4434, term4434.getClass(), "size", -8033714905181142681L);
        setLongField(term4434, term4434.getClass(), "modTime", -9040825890007374809L);
        setByteField(term4434, term4434.getClass(), "linkFlag", (byte) 112);
        setField(term4434, term4434.getClass(), "linkName", "");
        setField(term4434, term4434.getClass(), "magic", "ustar ");
        setField(term4434, term4434.getClass(), "version", "00");
        setField(term4434, term4434.getClass(), "userName", "root");
        setField(term4434, term4434.getClass(), "groupName", "");
        setIntField(term4434, term4434.getClass(), "devMajor", -1410220680);
        setIntField(term4434, term4434.getClass(), "devMinor", 389427431);
        setBooleanField(term4434, term4434.getClass(), "isExtended", false);
        setLongField(term4434, term4434.getClass(), "realSize", 1368340889161782793L);
        setField(term4469, term4469.getClass(), "path", "RkybSrpybU");
        setField(term4469, term4469.getClass(), "status", enum48);
        setIntField(term4469, term4469.getClass(), "prefixLength", -1945706126);
        setField(term4469, term4469.getClass(), "filePath", null);
        setField(term4434, term4434.getClass(), "file", term4469);
        setField(term4418, term4418.getClass(), "currEntry", term4434);
        setField(term4418, term4418.getClass(), "SINGLE", term4486);
        setLongField(term4418, term4418.getClass(), "bytesRead", -5786861555969446503L);
        Class<? extends Object> term152593 = Class.forName((String) "java.io.File$PathStatus");
        Field term152592 = ((Class) term152593).getDeclaredField((String) "INVALID");
        ((Field) term152592).setAccessible(true);
        Object enum49 = ((Field) term152592).get((Object) null);
        term152096 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term152097 = (byte[]) newByteArray(0);
        Object term152098 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term152099 = (byte[]) newByteArray(4);
        Object term152100 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term152117 = newInstance(Class.forName("java.io.File"));
        byte[] term152122 = (byte[]) newByteArray(0);
        setBooleanField(term152096, term152096.getClass(), "hasHitEOF", true);
        setLongField(term152096, term152096.getClass(), "entrySize", -5216789073301458893L);
        setLongField(term152096, term152096.getClass(), "entryOffset", -1832940336320585644L);
        setField(term152096, term152096.getClass(), "readBuf", term152097);
        setField(term152098, term152098.getClass(), "inStream", null);
        setField(term152098, term152098.getClass(), "outStream", null);
        setByteElement(term152099, 0, (byte) -1);
        setByteElement(term152099, 1, (byte) -127);
        setByteElement(term152099, 2, (byte) -118);
        setByteElement(term152099, 3, (byte) 69);
        setField(term152098, term152098.getClass(), "blockBuffer", term152099);
        setIntField(term152098, term152098.getClass(), "currBlkIdx", -1896376975);
        setIntField(term152098, term152098.getClass(), "currRecIdx", 729658803);
        setIntField(term152098, term152098.getClass(), "blockSize", 114754804);
        setIntField(term152098, term152098.getClass(), "recordSize", 1687361082);
        setIntField(term152098, term152098.getClass(), "recsPerBlock", 584893196);
        setField(term152096, term152096.getClass(), "buffer", term152098);
        setField(term152100, term152100.getClass(), "name", "");
        setIntField(term152100, term152100.getClass(), "mode", 497269071);
        setIntField(term152100, term152100.getClass(), "userId", -1899301124);
        setIntField(term152100, term152100.getClass(), "groupId", -1882480155);
        setLongField(term152100, term152100.getClass(), "size", -8033714905181142681L);
        setLongField(term152100, term152100.getClass(), "modTime", -9040825890007374809L);
        setByteField(term152100, term152100.getClass(), "linkFlag", (byte) 112);
        setField(term152100, term152100.getClass(), "linkName", "");
        setField(term152100, term152100.getClass(), "magic", "ustar ");
        setField(term152100, term152100.getClass(), "version", "00");
        setField(term152100, term152100.getClass(), "userName", "root");
        setField(term152100, term152100.getClass(), "groupName", "");
        setIntField(term152100, term152100.getClass(), "devMajor", -1410220680);
        setIntField(term152100, term152100.getClass(), "devMinor", 389427431);
        setBooleanField(term152100, term152100.getClass(), "isExtended", false);
        setLongField(term152100, term152100.getClass(), "realSize", 1368340889161782793L);
        setField(term152117, term152117.getClass(), "path", "RkybSrpybU");
        setField(term152117, term152117.getClass(), "status", enum49);
        setIntField(term152117, term152117.getClass(), "prefixLength", -1945706126);
        setField(term152117, term152117.getClass(), "filePath", null);
        setField(term152100, term152100.getClass(), "file", term152117);
        setField(term152096, term152096.getClass(), "currEntry", term152100);
        setField(term152096, term152096.getClass(), "SINGLE", term152122);
        setLongField(term152096, term152096.getClass(), "bytesRead", -5786861555969446503L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAtEOF", argTypes, term4418, args);
        assertTrue(recursiveEquals(term4418, term152096));
    }

};


