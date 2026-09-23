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
import java.util.HashMap;

public class TarArchiveInputStream_consumeRemainderOfLastBlock_93962847768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8049;
     Object term26709;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_93962847768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26764 = Class.forName((String) "java.io.File$PathStatus");
        Field term26763 = ((Class) term26764).getDeclaredField((String) "CHECKED");
        ((Field) term26763).setAccessible(true);
        Object enum75 = ((Field) term26763).get((Object) null);
        HashMap term8133 = new HashMap();
        term8049 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term8050 = (byte[]) newByteArray(9);
        Object term8065 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term8104 = newInstance(Class.forName("java.io.File"));
        byte[] term8143 = (byte[]) newByteArray(3);
        setByteElement(term8050, 0, (byte) 40);
        setByteElement(term8050, 1, (byte) -5);
        setByteElement(term8050, 2, (byte) 24);
        setByteElement(term8050, 3, (byte) -39);
        setByteElement(term8050, 4, (byte) 30);
        setByteElement(term8050, 5, (byte) -119);
        setByteElement(term8050, 6, (byte) 94);
        setByteElement(term8050, 7, (byte) -52);
        setByteElement(term8050, 8, (byte) -33);
        setField(term8049, term8049.getClass(), "SMALL_BUF", term8050);
        setIntField(term8049, term8049.getClass(), "recordSize", -1885090354);
        setIntField(term8049, term8049.getClass(), "blockSize", -2066804303);
        setBooleanField(term8049, term8049.getClass(), "hasHitEOF", true);
        setLongField(term8049, term8049.getClass(), "entrySize", -1820639665251914495L);
        setLongField(term8049, term8049.getClass(), "entryOffset", 3238645206498300107L);
        setField(term8049, term8049.getClass(), "is", null);
        setField(term8065, term8065.getClass(), "name", "");
        setBooleanField(term8065, term8065.getClass(), "preserveLeadingSlashes", false);
        setIntField(term8065, term8065.getClass(), "mode", -1731761810);
        setLongField(term8065, term8065.getClass(), "userId", -1592696983130738594L);
        setLongField(term8065, term8065.getClass(), "groupId", 6902365338255307910L);
        setLongField(term8065, term8065.getClass(), "size", -8019730974733786399L);
        setLongField(term8065, term8065.getClass(), "modTime", 394960377236392159L);
        setBooleanField(term8065, term8065.getClass(), "checkSumOK", false);
        setByteField(term8065, term8065.getClass(), "linkFlag", (byte) 16);
        setField(term8065, term8065.getClass(), "linkName", "");
        setField(term8065, term8065.getClass(), "magic", "ustar ");
        setField(term8065, term8065.getClass(), "version", "00");
        setField(term8065, term8065.getClass(), "userName", "root");
        setField(term8065, term8065.getClass(), "groupName", "");
        setIntField(term8065, term8065.getClass(), "devMajor", 197109649);
        setIntField(term8065, term8065.getClass(), "devMinor", -1239406390);
        setBooleanField(term8065, term8065.getClass(), "isExtended", true);
        setLongField(term8065, term8065.getClass(), "realSize", -2955854401507097864L);
        setBooleanField(term8065, term8065.getClass(), "paxGNUSparse", false);
        setBooleanField(term8065, term8065.getClass(), "starSparse", true);
        setField(term8104, term8104.getClass(), "path", "AdxvLJhNLe");
        setField(term8104, term8104.getClass(), "status", enum75);
        setIntField(term8104, term8104.getClass(), "prefixLength", 1557431527);
        setField(term8104, term8104.getClass(), "filePath", null);
        setField(term8065, term8065.getClass(), "file", term8104);
        setField(term8049, term8049.getClass(), "currEntry", term8065);
        setField(term8049, term8049.getClass(), "zipEncoding", null);
        setField(term8049, term8049.getClass(), "encoding", "lHfTrWKMPk");
        setField(term8049, term8049.getClass(), "globalPaxHeaders", term8133);
        setByteElement(term8143, 0, (byte) 20);
        setByteElement(term8143, 1, (byte) -114);
        setByteElement(term8143, 2, (byte) 93);
        setField(term8049, term8049.getClass(), "SINGLE", term8143);
        setLongField(term8049, term8049.getClass(), "bytesRead", 329213208496958131L);
        Class<? extends Object> term26951 = Class.forName((String) "java.io.File$PathStatus");
        Field term26950 = ((Class) term26951).getDeclaredField((String) "INVALID");
        ((Field) term26950).setAccessible(true);
        Object enum76 = ((Field) term26950).get((Object) null);
        HashMap term26731 = new HashMap();
        term26709 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term26710 = (byte[]) newByteArray(9);
        Object term26711 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term26724 = newInstance(Class.forName("java.io.File"));
        byte[] term26732 = (byte[]) newByteArray(3);
        setByteElement(term26710, 0, (byte) 40);
        setByteElement(term26710, 1, (byte) -5);
        setByteElement(term26710, 2, (byte) 24);
        setByteElement(term26710, 3, (byte) -39);
        setByteElement(term26710, 4, (byte) 30);
        setByteElement(term26710, 5, (byte) -119);
        setByteElement(term26710, 6, (byte) 94);
        setByteElement(term26710, 7, (byte) -52);
        setByteElement(term26710, 8, (byte) -33);
        setField(term26709, term26709.getClass(), "SMALL_BUF", term26710);
        setIntField(term26709, term26709.getClass(), "recordSize", -1885090354);
        setIntField(term26709, term26709.getClass(), "blockSize", -2066804303);
        setBooleanField(term26709, term26709.getClass(), "hasHitEOF", true);
        setLongField(term26709, term26709.getClass(), "entrySize", -1820639665251914495L);
        setLongField(term26709, term26709.getClass(), "entryOffset", 3238645206498300107L);
        setField(term26709, term26709.getClass(), "is", null);
        setField(term26711, term26711.getClass(), "name", "");
        setBooleanField(term26711, term26711.getClass(), "preserveLeadingSlashes", false);
        setIntField(term26711, term26711.getClass(), "mode", -1731761810);
        setLongField(term26711, term26711.getClass(), "userId", -1592696983130738594L);
        setLongField(term26711, term26711.getClass(), "groupId", 6902365338255307910L);
        setLongField(term26711, term26711.getClass(), "size", -8019730974733786399L);
        setLongField(term26711, term26711.getClass(), "modTime", 394960377236392159L);
        setBooleanField(term26711, term26711.getClass(), "checkSumOK", false);
        setByteField(term26711, term26711.getClass(), "linkFlag", (byte) 16);
        setField(term26711, term26711.getClass(), "linkName", "");
        setField(term26711, term26711.getClass(), "magic", "ustar ");
        setField(term26711, term26711.getClass(), "version", "00");
        setField(term26711, term26711.getClass(), "userName", "root");
        setField(term26711, term26711.getClass(), "groupName", "");
        setIntField(term26711, term26711.getClass(), "devMajor", 197109649);
        setIntField(term26711, term26711.getClass(), "devMinor", -1239406390);
        setBooleanField(term26711, term26711.getClass(), "isExtended", true);
        setLongField(term26711, term26711.getClass(), "realSize", -2955854401507097864L);
        setBooleanField(term26711, term26711.getClass(), "paxGNUSparse", false);
        setBooleanField(term26711, term26711.getClass(), "starSparse", true);
        setField(term26724, term26724.getClass(), "path", "AdxvLJhNLe");
        setField(term26724, term26724.getClass(), "status", enum76);
        setIntField(term26724, term26724.getClass(), "prefixLength", 1557431527);
        setField(term26724, term26724.getClass(), "filePath", null);
        setField(term26711, term26711.getClass(), "file", term26724);
        setField(term26709, term26709.getClass(), "currEntry", term26711);
        setField(term26709, term26709.getClass(), "zipEncoding", null);
        setField(term26709, term26709.getClass(), "encoding", "lHfTrWKMPk");
        setField(term26709, term26709.getClass(), "globalPaxHeaders", term26731);
        setByteElement(term26732, 0, (byte) 20);
        setByteElement(term26732, 1, (byte) -114);
        setByteElement(term26732, 2, (byte) 93);
        setField(term26709, term26709.getClass(), "SINGLE", term26732);
        setLongField(term26709, term26709.getClass(), "bytesRead", 329213208496958131L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term8049, args);
        assertTrue(recursiveEquals(term8049, term26709));
    }

};


