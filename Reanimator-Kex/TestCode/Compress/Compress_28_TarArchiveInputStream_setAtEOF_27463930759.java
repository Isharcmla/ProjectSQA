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

public class TarArchiveInputStream_setAtEOF_27463930759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5684;
     Object term5750;
     Object term21057;

    public TarArchiveInputStream_setAtEOF_27463930759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21100 = Class.forName((String) "java.io.File$PathStatus");
        Field term21099 = ((Class) term21100).getDeclaredField((String) "CHECKED");
        ((Field) term21099).setAccessible(true);
        Object enum63 = ((Field) term21099).get((Object) null);
        term5684 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5685 = (byte[]) newByteArray(0);
        Object term5691 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5727 = newInstance(Class.forName("java.io.File"));
        byte[] term5744 = (byte[]) newByteArray(4);
        setField(term5684, term5684.getClass(), "SMALL_BUF", term5685);
        setIntField(term5684, term5684.getClass(), "recordSize", 1687361082);
        setIntField(term5684, term5684.getClass(), "blockSize", 584893196);
        setBooleanField(term5684, term5684.getClass(), "hasHitEOF", true);
        setLongField(term5684, term5684.getClass(), "entrySize", -1616722610139554082L);
        setLongField(term5684, term5684.getClass(), "entryOffset", 7495904023107549024L);
        setField(term5684, term5684.getClass(), "is", null);
        setField(term5691, term5691.getClass(), "name", "");
        setIntField(term5691, term5691.getClass(), "mode", 497269071);
        setIntField(term5691, term5691.getClass(), "userId", -1899301124);
        setIntField(term5691, term5691.getClass(), "groupId", -1882480155);
        setLongField(term5691, term5691.getClass(), "size", 8802866251294305945L);
        setLongField(term5691, term5691.getClass(), "modTime", 4513004407927379358L);
        setBooleanField(term5691, term5691.getClass(), "checkSumOK", false);
        setByteField(term5691, term5691.getClass(), "linkFlag", (byte) 84);
        setField(term5691, term5691.getClass(), "linkName", "");
        setField(term5691, term5691.getClass(), "magic", "ustar ");
        setField(term5691, term5691.getClass(), "version", "00");
        setField(term5691, term5691.getClass(), "userName", "root");
        setField(term5691, term5691.getClass(), "groupName", "");
        setIntField(term5691, term5691.getClass(), "devMajor", -1410220680);
        setIntField(term5691, term5691.getClass(), "devMinor", 389427431);
        setBooleanField(term5691, term5691.getClass(), "isExtended", false);
        setLongField(term5691, term5691.getClass(), "realSize", -7115418542247301000L);
        setField(term5727, term5727.getClass(), "path", "BndsHwAFMv");
        setField(term5727, term5727.getClass(), "status", enum63);
        setIntField(term5727, term5727.getClass(), "prefixLength", -1945706126);
        setField(term5727, term5727.getClass(), "filePath", null);
        setField(term5691, term5691.getClass(), "file", term5727);
        setField(term5684, term5684.getClass(), "currEntry", term5691);
        setField(term5684, term5684.getClass(), "encoding", null);
        setByteElement(term5744, 0, (byte) -36);
        setByteElement(term5744, 1, (byte) 103);
        setByteElement(term5744, 2, (byte) -63);
        setByteElement(term5744, 3, (byte) 39);
        setField(term5684, term5684.getClass(), "SINGLE", term5744);
        setLongField(term5684, term5684.getClass(), "bytesRead", 8034714140377562739L);
        term5750 = new Boolean(false);
        Class<? extends Object> term21269 = Class.forName((String) "java.io.File$PathStatus");
        Field term21268 = ((Class) term21269).getDeclaredField((String) "INVALID");
        ((Field) term21268).setAccessible(true);
        Object enum64 = ((Field) term21268).get((Object) null);
        term21057 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term21058 = (byte[]) newByteArray(0);
        Object term21059 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21072 = newInstance(Class.forName("java.io.File"));
        byte[] term21077 = (byte[]) newByteArray(4);
        setField(term21057, term21057.getClass(), "SMALL_BUF", term21058);
        setIntField(term21057, term21057.getClass(), "recordSize", 1687361082);
        setIntField(term21057, term21057.getClass(), "blockSize", 584893196);
        setBooleanField(term21057, term21057.getClass(), "hasHitEOF", false);
        setLongField(term21057, term21057.getClass(), "entrySize", -1616722610139554082L);
        setLongField(term21057, term21057.getClass(), "entryOffset", 7495904023107549024L);
        setField(term21057, term21057.getClass(), "is", null);
        setField(term21059, term21059.getClass(), "name", "");
        setIntField(term21059, term21059.getClass(), "mode", 497269071);
        setIntField(term21059, term21059.getClass(), "userId", -1899301124);
        setIntField(term21059, term21059.getClass(), "groupId", -1882480155);
        setLongField(term21059, term21059.getClass(), "size", 8802866251294305945L);
        setLongField(term21059, term21059.getClass(), "modTime", 4513004407927379358L);
        setBooleanField(term21059, term21059.getClass(), "checkSumOK", false);
        setByteField(term21059, term21059.getClass(), "linkFlag", (byte) 84);
        setField(term21059, term21059.getClass(), "linkName", "");
        setField(term21059, term21059.getClass(), "magic", "ustar ");
        setField(term21059, term21059.getClass(), "version", "00");
        setField(term21059, term21059.getClass(), "userName", "root");
        setField(term21059, term21059.getClass(), "groupName", "");
        setIntField(term21059, term21059.getClass(), "devMajor", -1410220680);
        setIntField(term21059, term21059.getClass(), "devMinor", 389427431);
        setBooleanField(term21059, term21059.getClass(), "isExtended", false);
        setLongField(term21059, term21059.getClass(), "realSize", -7115418542247301000L);
        setField(term21072, term21072.getClass(), "path", "BndsHwAFMv");
        setField(term21072, term21072.getClass(), "status", enum64);
        setIntField(term21072, term21072.getClass(), "prefixLength", -1945706126);
        setField(term21072, term21072.getClass(), "filePath", null);
        setField(term21059, term21059.getClass(), "file", term21072);
        setField(term21057, term21057.getClass(), "currEntry", term21059);
        setField(term21057, term21057.getClass(), "encoding", null);
        setByteElement(term21077, 0, (byte) -36);
        setByteElement(term21077, 1, (byte) 103);
        setByteElement(term21077, 2, (byte) -63);
        setByteElement(term21077, 3, (byte) 39);
        setField(term21057, term21057.getClass(), "SINGLE", term21077);
        setLongField(term21057, term21057.getClass(), "bytesRead", 8034714140377562739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5750;
        callMethod(klass, "setAtEOF", argTypes, term5684, args);
        assertTrue(recursiveEquals(term5684, term21057));
        assertTrue(recursiveEquals(term5750, false));
    }

};


