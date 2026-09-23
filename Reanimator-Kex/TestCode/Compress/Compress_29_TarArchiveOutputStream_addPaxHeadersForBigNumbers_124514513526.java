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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;

public class TarArchiveOutputStream_addPaxHeadersForBigNumbers_124514513526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921;
     Object term1963;
     Object term2028;

    public TarArchiveOutputStream_addPaxHeadersForBigNumbers_124514513526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1936 = (byte[]) newByteArray(0);
        byte[] term1938 = (byte[]) newByteArray(9);
        byte[] term1957 = (byte[]) newByteArray(4);
        setLongField(term1921, term1921.getClass(), "currSize", -1610676979013636850L);
        setField(term1921, term1921.getClass(), "currName", "xrwlQZdwCp");
        setLongField(term1921, term1921.getClass(), "currBytes", 2062173786000223358L);
        setField(term1921, term1921.getClass(), "recordBuf", term1936);
        setIntField(term1921, term1921.getClass(), "assemLen", 1557431527);
        setByteElement(term1938, 0, (byte) -52);
        setByteElement(term1938, 1, (byte) 53);
        setByteElement(term1938, 2, (byte) 44);
        setByteElement(term1938, 3, (byte) 49);
        setByteElement(term1938, 4, (byte) 114);
        setByteElement(term1938, 5, (byte) -81);
        setByteElement(term1938, 6, (byte) 127);
        setByteElement(term1938, 7, (byte) -24);
        setByteElement(term1938, 8, (byte) -89);
        setField(term1921, term1921.getClass(), "assemBuf", term1938);
        setIntField(term1921, term1921.getClass(), "longFileMode", -1504890659);
        setIntField(term1921, term1921.getClass(), "bigNumberMode", 1358829571);
        setIntField(term1921, term1921.getClass(), "recordsWritten", 991356662);
        setIntField(term1921, term1921.getClass(), "recordsPerBlock", -506958186);
        setIntField(term1921, term1921.getClass(), "recordSize", -507387516);
        setBooleanField(term1921, term1921.getClass(), "closed", false);
        setBooleanField(term1921, term1921.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1921, term1921.getClass(), "finished", false);
        setField(term1921, term1921.getClass(), "out", null);
        setField(term1921, term1921.getClass(), "zipEncoding", null);
        setBooleanField(term1921, term1921.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term1957, 0, (byte) -35);
        setByteElement(term1957, 1, (byte) -59);
        setByteElement(term1957, 2, (byte) 73);
        setByteElement(term1957, 3, (byte) 94);
        setField(term1921, term1921.getClass(), "oneByte", term1957);
        setLongField(term1921, term1921.getClass(), "bytesWritten", -8658027316505137504L);
        term1963 = new LinkedHashMap();
        Class<? extends Object> term2135 = Class.forName((String) "java.io.File$PathStatus");
        Field term2134 = ((Class) term2135).getDeclaredField((String) "INVALID");
        ((Field) term2134).setAccessible(true);
        Object enum2 = ((Field) term2134).get((Object) null);
        term2028 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2064 = newInstance(Class.forName("java.io.File"));
        setField(term2028, term2028.getClass(), "name", "");
        setIntField(term2028, term2028.getClass(), "mode", -1970452551);
        setIntField(term2028, term2028.getClass(), "userId", -1896376975);
        setIntField(term2028, term2028.getClass(), "groupId", 729658803);
        setLongField(term2028, term2028.getClass(), "size", 414749984815662075L);
        setLongField(term2028, term2028.getClass(), "modTime", 463622836963501975L);
        setBooleanField(term2028, term2028.getClass(), "checkSumOK", false);
        setByteField(term2028, term2028.getClass(), "linkFlag", (byte) 114);
        setField(term2028, term2028.getClass(), "linkName", "");
        setField(term2028, term2028.getClass(), "magic", "ustar ");
        setField(term2028, term2028.getClass(), "version", "00");
        setField(term2028, term2028.getClass(), "userName", "root");
        setField(term2028, term2028.getClass(), "groupName", "");
        setIntField(term2028, term2028.getClass(), "devMajor", 114754804);
        setIntField(term2028, term2028.getClass(), "devMinor", 1687361082);
        setBooleanField(term2028, term2028.getClass(), "isExtended", false);
        setLongField(term2028, term2028.getClass(), "realSize", 305759998609888272L);
        setField(term2064, term2064.getClass(), "path", "GzFkzHGYFt");
        setField(term2064, term2064.getClass(), "status", enum2);
        setIntField(term2064, term2064.getClass(), "prefixLength", 584893196);
        setField(term2064, term2064.getClass(), "filePath", null);
        setField(term2028, term2028.getClass(), "file", term2064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term1963;
        args[1] = term2028;
        callMethod(klass, "addPaxHeadersForBigNumbers", argTypes, term1921, args);
    }

};


