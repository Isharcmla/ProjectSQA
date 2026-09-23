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

public class TarArchiveInputStream_readGNUSparse_157335578035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2632;
     Object term149541;

    public TarArchiveInputStream_readGNUSparse_157335578035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149571 = Class.forName((String) "java.io.File$PathStatus");
        Field term149570 = ((Class) term149571).getDeclaredField((String) "CHECKED");
        ((Field) term149570).setAccessible(true);
        Object enum37 = ((Field) term149570).get((Object) null);
        term2632 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2636 = (byte[]) newByteArray(2);
        Object term2639 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2640 = (byte[]) newByteArray(1);
        Object term2647 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2682 = newInstance(Class.forName("java.io.File"));
        byte[] term2699 = (byte[]) newByteArray(0);
        setBooleanField(term2632, term2632.getClass(), "hasHitEOF", true);
        setLongField(term2632, term2632.getClass(), "entrySize", 7994303628307559416L);
        setLongField(term2632, term2632.getClass(), "entryOffset", 2443640364875054177L);
        setByteElement(term2636, 0, (byte) -46);
        setByteElement(term2636, 1, (byte) 14);
        setField(term2632, term2632.getClass(), "readBuf", term2636);
        setField(term2639, term2639.getClass(), "inStream", null);
        setField(term2639, term2639.getClass(), "outStream", null);
        setByteElement(term2640, 0, (byte) 34);
        setField(term2639, term2639.getClass(), "blockBuffer", term2640);
        setIntField(term2639, term2639.getClass(), "currBlkIdx", 1141317871);
        setIntField(term2639, term2639.getClass(), "currRecIdx", 890669485);
        setIntField(term2639, term2639.getClass(), "blockSize", 691577392);
        setIntField(term2639, term2639.getClass(), "recordSize", -893623680);
        setIntField(term2639, term2639.getClass(), "recsPerBlock", -1963434938);
        setField(term2632, term2632.getClass(), "buffer", term2639);
        setField(term2647, term2647.getClass(), "name", "");
        setIntField(term2647, term2647.getClass(), "mode", 906181092);
        setIntField(term2647, term2647.getClass(), "userId", 1045657203);
        setIntField(term2647, term2647.getClass(), "groupId", 1386130016);
        setLongField(term2647, term2647.getClass(), "size", -1610676979013636850L);
        setLongField(term2647, term2647.getClass(), "modTime", 2062173786000223358L);
        setByteField(term2647, term2647.getClass(), "linkFlag", (byte) 126);
        setField(term2647, term2647.getClass(), "linkName", "");
        setField(term2647, term2647.getClass(), "magic", "ustar ");
        setField(term2647, term2647.getClass(), "version", "00");
        setField(term2647, term2647.getClass(), "userName", "root");
        setField(term2647, term2647.getClass(), "groupName", "");
        setIntField(term2647, term2647.getClass(), "devMajor", 1072005683);
        setIntField(term2647, term2647.getClass(), "devMinor", 1861318859);
        setBooleanField(term2647, term2647.getClass(), "isExtended", true);
        setLongField(term2647, term2647.getClass(), "realSize", -8658027316505137504L);
        setField(term2682, term2682.getClass(), "path", "oVcInYnLWB");
        setField(term2682, term2682.getClass(), "status", enum37);
        setIntField(term2682, term2682.getClass(), "prefixLength", 1474524152);
        setField(term2682, term2682.getClass(), "filePath", null);
        setField(term2647, term2647.getClass(), "file", term2682);
        setField(term2632, term2632.getClass(), "currEntry", term2647);
        setField(term2632, term2632.getClass(), "SINGLE", term2699);
        setLongField(term2632, term2632.getClass(), "bytesRead", 414749984815662075L);
        term149541 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term149542 = (byte[]) newByteArray(2);
        Object term149543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term149544 = (byte[]) newByteArray(1);
        byte[] term149545 = (byte[]) newByteArray(0);
        setBooleanField(term149541, term149541.getClass(), "hasHitEOF", true);
        setLongField(term149541, term149541.getClass(), "entrySize", 7994303628307559416L);
        setLongField(term149541, term149541.getClass(), "entryOffset", 2443640364875054177L);
        setByteElement(term149542, 0, (byte) -46);
        setByteElement(term149542, 1, (byte) 14);
        setField(term149541, term149541.getClass(), "readBuf", term149542);
        setField(term149543, term149543.getClass(), "inStream", null);
        setField(term149543, term149543.getClass(), "outStream", null);
        setByteElement(term149544, 0, (byte) 34);
        setField(term149543, term149543.getClass(), "blockBuffer", term149544);
        setIntField(term149543, term149543.getClass(), "currBlkIdx", 1141317871);
        setIntField(term149543, term149543.getClass(), "currRecIdx", 890669485);
        setIntField(term149543, term149543.getClass(), "blockSize", 691577392);
        setIntField(term149543, term149543.getClass(), "recordSize", -893623680);
        setIntField(term149543, term149543.getClass(), "recsPerBlock", -1963434938);
        setField(term149541, term149541.getClass(), "buffer", term149543);
        setField(term149541, term149541.getClass(), "currEntry", null);
        setField(term149541, term149541.getClass(), "SINGLE", term149545);
        setLongField(term149541, term149541.getClass(), "bytesRead", 414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term2632, args);
        assertTrue(recursiveEquals(term2632, term149541));
    }

};


