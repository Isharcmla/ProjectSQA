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
import java.util.LinkedHashMap;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2310;
     Object term2392;
     Object term149074;
     Object term149097;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149130 = Class.forName((String) "java.io.File$PathStatus");
        Field term149129 = ((Class) term149130).getDeclaredField((String) "INVALID");
        ((Field) term149129).setAccessible(true);
        Object enum35 = ((Field) term149129).get((Object) null);
        term2310 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2314 = (byte[]) newByteArray(1);
        Object term2316 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2317 = (byte[]) newByteArray(8);
        Object term2331 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2366 = newInstance(Class.forName("java.io.File"));
        byte[] term2383 = (byte[]) newByteArray(7);
        setBooleanField(term2310, term2310.getClass(), "hasHitEOF", false);
        setLongField(term2310, term2310.getClass(), "entrySize", -1468719814009985452L);
        setLongField(term2310, term2310.getClass(), "entryOffset", -7738503207562305297L);
        setByteElement(term2314, 0, (byte) -2);
        setField(term2310, term2310.getClass(), "readBuf", term2314);
        setField(term2316, term2316.getClass(), "inStream", null);
        setField(term2316, term2316.getClass(), "outStream", null);
        setByteElement(term2317, 0, (byte) 28);
        setByteElement(term2317, 1, (byte) 84);
        setByteElement(term2317, 2, (byte) 85);
        setByteElement(term2317, 3, (byte) -17);
        setByteElement(term2317, 4, (byte) -83);
        setByteElement(term2317, 5, (byte) 48);
        setByteElement(term2317, 6, (byte) -128);
        setByteElement(term2317, 7, (byte) 70);
        setField(term2316, term2316.getClass(), "blockBuffer", term2317);
        setIntField(term2316, term2316.getClass(), "currBlkIdx", 683666002);
        setIntField(term2316, term2316.getClass(), "currRecIdx", 1596213415);
        setIntField(term2316, term2316.getClass(), "blockSize", -268815336);
        setIntField(term2316, term2316.getClass(), "recordSize", -1210583429);
        setIntField(term2316, term2316.getClass(), "recsPerBlock", -663691365);
        setField(term2310, term2310.getClass(), "buffer", term2316);
        setField(term2331, term2331.getClass(), "name", "");
        setIntField(term2331, term2331.getClass(), "mode", 339854490);
        setIntField(term2331, term2331.getClass(), "userId", -615654495);
        setIntField(term2331, term2331.getClass(), "groupId", -1476117762);
        setLongField(term2331, term2331.getClass(), "size", 3825396310311739952L);
        setLongField(term2331, term2331.getClass(), "modTime", -3838084482494604218L);
        setByteField(term2331, term2331.getClass(), "linkFlag", (byte) -28);
        setField(term2331, term2331.getClass(), "linkName", "");
        setField(term2331, term2331.getClass(), "magic", "ustar ");
        setField(term2331, term2331.getClass(), "version", "00");
        setField(term2331, term2331.getClass(), "userName", "root");
        setField(term2331, term2331.getClass(), "groupName", "");
        setIntField(term2331, term2331.getClass(), "devMajor", -341962980);
        setIntField(term2331, term2331.getClass(), "devMinor", 1532716628);
        setBooleanField(term2331, term2331.getClass(), "isExtended", false);
        setLongField(term2331, term2331.getClass(), "realSize", 3892018155439224435L);
        setField(term2366, term2366.getClass(), "path", "RMFIsYGgne");
        setField(term2366, term2366.getClass(), "status", enum35);
        setIntField(term2366, term2366.getClass(), "prefixLength", -1801760683);
        setField(term2366, term2366.getClass(), "filePath", null);
        setField(term2331, term2331.getClass(), "file", term2366);
        setField(term2310, term2310.getClass(), "currEntry", term2331);
        setByteElement(term2383, 0, (byte) 115);
        setByteElement(term2383, 1, (byte) 96);
        setByteElement(term2383, 2, (byte) 51);
        setByteElement(term2383, 3, (byte) -53);
        setByteElement(term2383, 4, (byte) -8);
        setByteElement(term2383, 5, (byte) -9);
        setByteElement(term2383, 6, (byte) 97);
        setField(term2310, term2310.getClass(), "SINGLE", term2383);
        setLongField(term2310, term2310.getClass(), "bytesRead", 5953383087795962419L);
        term2392 = new LinkedHashMap();
        Class<? extends Object> term149311 = Class.forName((String) "java.io.File$PathStatus");
        Field term149310 = ((Class) term149311).getDeclaredField((String) "INVALID");
        ((Field) term149310).setAccessible(true);
        Object enum36 = ((Field) term149310).get((Object) null);
        term149074 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term149075 = (byte[]) newByteArray(1);
        Object term149076 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term149077 = (byte[]) newByteArray(8);
        Object term149078 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term149091 = newInstance(Class.forName("java.io.File"));
        byte[] term149096 = (byte[]) newByteArray(7);
        setBooleanField(term149074, term149074.getClass(), "hasHitEOF", false);
        setLongField(term149074, term149074.getClass(), "entrySize", -1468719814009985452L);
        setLongField(term149074, term149074.getClass(), "entryOffset", -7738503207562305297L);
        setByteElement(term149075, 0, (byte) -2);
        setField(term149074, term149074.getClass(), "readBuf", term149075);
        setField(term149076, term149076.getClass(), "inStream", null);
        setField(term149076, term149076.getClass(), "outStream", null);
        setByteElement(term149077, 0, (byte) 28);
        setByteElement(term149077, 1, (byte) 84);
        setByteElement(term149077, 2, (byte) 85);
        setByteElement(term149077, 3, (byte) -17);
        setByteElement(term149077, 4, (byte) -83);
        setByteElement(term149077, 5, (byte) 48);
        setByteElement(term149077, 6, (byte) -128);
        setByteElement(term149077, 7, (byte) 70);
        setField(term149076, term149076.getClass(), "blockBuffer", term149077);
        setIntField(term149076, term149076.getClass(), "currBlkIdx", 683666002);
        setIntField(term149076, term149076.getClass(), "currRecIdx", 1596213415);
        setIntField(term149076, term149076.getClass(), "blockSize", -268815336);
        setIntField(term149076, term149076.getClass(), "recordSize", -1210583429);
        setIntField(term149076, term149076.getClass(), "recsPerBlock", -663691365);
        setField(term149074, term149074.getClass(), "buffer", term149076);
        setField(term149078, term149078.getClass(), "name", "");
        setIntField(term149078, term149078.getClass(), "mode", 339854490);
        setIntField(term149078, term149078.getClass(), "userId", -615654495);
        setIntField(term149078, term149078.getClass(), "groupId", -1476117762);
        setLongField(term149078, term149078.getClass(), "size", 3825396310311739952L);
        setLongField(term149078, term149078.getClass(), "modTime", -3838084482494604218L);
        setByteField(term149078, term149078.getClass(), "linkFlag", (byte) -28);
        setField(term149078, term149078.getClass(), "linkName", "");
        setField(term149078, term149078.getClass(), "magic", "ustar ");
        setField(term149078, term149078.getClass(), "version", "00");
        setField(term149078, term149078.getClass(), "userName", "root");
        setField(term149078, term149078.getClass(), "groupName", "");
        setIntField(term149078, term149078.getClass(), "devMajor", -341962980);
        setIntField(term149078, term149078.getClass(), "devMinor", 1532716628);
        setBooleanField(term149078, term149078.getClass(), "isExtended", false);
        setLongField(term149078, term149078.getClass(), "realSize", 3892018155439224435L);
        setField(term149091, term149091.getClass(), "path", "RMFIsYGgne");
        setField(term149091, term149091.getClass(), "status", enum36);
        setIntField(term149091, term149091.getClass(), "prefixLength", -1801760683);
        setField(term149091, term149091.getClass(), "filePath", null);
        setField(term149078, term149078.getClass(), "file", term149091);
        setField(term149074, term149074.getClass(), "currEntry", term149078);
        setByteElement(term149096, 0, (byte) 115);
        setByteElement(term149096, 1, (byte) 96);
        setByteElement(term149096, 2, (byte) 51);
        setByteElement(term149096, 3, (byte) -53);
        setByteElement(term149096, 4, (byte) -8);
        setByteElement(term149096, 5, (byte) -9);
        setByteElement(term149096, 6, (byte) 97);
        setField(term149074, term149074.getClass(), "SINGLE", term149096);
        setLongField(term149074, term149074.getClass(), "bytesRead", 5953383087795962419L);
        term149097 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term2392;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term2310, args);
        assertTrue(recursiveEquals(term2310, term149074));
        assertTrue(recursiveEquals(term2392, term149097));
    }

};


