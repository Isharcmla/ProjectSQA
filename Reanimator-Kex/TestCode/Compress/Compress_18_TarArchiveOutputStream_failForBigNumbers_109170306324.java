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
import java.lang.Object;
import java.lang.String;

public class TarArchiveOutputStream_failForBigNumbers_109170306324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179;
     Object term2226;

    public TarArchiveOutputStream_failForBigNumbers_109170306324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2179 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2194 = (byte[]) newByteArray(1);
        byte[] term2197 = (byte[]) newByteArray(6);
        Object term2204 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2208 = (byte[]) newByteArray(7);
        byte[] term2224 = (byte[]) newByteArray(0);
        setLongField(term2179, term2179.getClass(), "currSize", 3892018155439224435L);
        setField(term2179, term2179.getClass(), "currName", "aKnKipADSo");
        setLongField(term2179, term2179.getClass(), "currBytes", 5953383087795962419L);
        setByteElement(term2194, 0, (byte) 83);
        setField(term2179, term2179.getClass(), "recordBuf", term2194);
        setIntField(term2179, term2179.getClass(), "assemLen", -1667990367);
        setByteElement(term2197, 0, (byte) -57);
        setByteElement(term2197, 1, (byte) 103);
        setByteElement(term2197, 2, (byte) 40);
        setByteElement(term2197, 3, (byte) -106);
        setByteElement(term2197, 4, (byte) -95);
        setByteElement(term2197, 5, (byte) 69);
        setField(term2179, term2179.getClass(), "assemBuf", term2197);
        setField(term2204, term2204.getClass(), "inStream", null);
        setField(term2204, term2204.getClass(), "outStream", null);
        setIntField(term2204, term2204.getClass(), "blockSize", -1214628358);
        setIntField(term2204, term2204.getClass(), "recordSize", 1102721075);
        setIntField(term2204, term2204.getClass(), "recsPerBlock", -426764678);
        setByteElement(term2208, 0, (byte) 63);
        setByteElement(term2208, 1, (byte) -41);
        setByteElement(term2208, 2, (byte) -44);
        setByteElement(term2208, 3, (byte) -120);
        setByteElement(term2208, 4, (byte) -55);
        setByteElement(term2208, 5, (byte) 91);
        setByteElement(term2208, 6, (byte) 55);
        setField(term2204, term2204.getClass(), "blockBuffer", term2208);
        setIntField(term2204, term2204.getClass(), "currBlkIdx", -1222614956);
        setIntField(term2204, term2204.getClass(), "currRecIdx", -1870495012);
        setField(term2179, term2179.getClass(), "buffer", term2204);
        setIntField(term2179, term2179.getClass(), "longFileMode", -1310015129);
        setIntField(term2179, term2179.getClass(), "bigNumberMode", -2104981311);
        setBooleanField(term2179, term2179.getClass(), "closed", false);
        setBooleanField(term2179, term2179.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2179, term2179.getClass(), "finished", false);
        setField(term2179, term2179.getClass(), "out", null);
        setField(term2179, term2179.getClass(), "encoding", null);
        setBooleanField(term2179, term2179.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term2179, term2179.getClass(), "oneByte", term2224);
        setLongField(term2179, term2179.getClass(), "bytesWritten", 7994303628307559416L);
        Class<? extends Object> term2334 = Class.forName((String) "java.io.File$PathStatus");
        Field term2333 = ((Class) term2334).getDeclaredField((String) "INVALID");
        ((Field) term2333).setAccessible(true);
        Object enum2 = ((Field) term2333).get((Object) null);
        term2226 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2262 = newInstance(Class.forName("java.io.File"));
        setField(term2226, term2226.getClass(), "name", "");
        setIntField(term2226, term2226.getClass(), "mode", -571169753);
        setIntField(term2226, term2226.getClass(), "userId", 318591690);
        setIntField(term2226, term2226.getClass(), "groupId", -165587447);
        setLongField(term2226, term2226.getClass(), "size", 2443640364875054177L);
        setLongField(term2226, term2226.getClass(), "modTime", -1610676979013636850L);
        setBooleanField(term2226, term2226.getClass(), "checkSumOK", true);
        setByteField(term2226, term2226.getClass(), "linkFlag", (byte) -5);
        setField(term2226, term2226.getClass(), "linkName", "");
        setField(term2226, term2226.getClass(), "magic", "ustar ");
        setField(term2226, term2226.getClass(), "version", "00");
        setField(term2226, term2226.getClass(), "userName", "root");
        setField(term2226, term2226.getClass(), "groupName", "");
        setIntField(term2226, term2226.getClass(), "devMajor", -1347358701);
        setIntField(term2226, term2226.getClass(), "devMinor", 806595993);
        setBooleanField(term2226, term2226.getClass(), "isExtended", false);
        setLongField(term2226, term2226.getClass(), "realSize", 2062173786000223358L);
        setField(term2262, term2262.getClass(), "path", "wSQxaModmm");
        setField(term2262, term2262.getClass(), "status", enum2);
        setIntField(term2262, term2262.getClass(), "prefixLength", 548228925);
        setField(term2262, term2262.getClass(), "filePath", null);
        setField(term2226, term2226.getClass(), "file", term2262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term2226;
        callMethod(klass, "failForBigNumbers", argTypes, term2179, args);
    }

};


