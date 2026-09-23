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
import java.util.HashMap;

public class TarArchiveInputStream_readGlobalPaxHeaders_40336598819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3738;

    public TarArchiveInputStream_readGlobalPaxHeaders_40336598819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3864 = Class.forName((String) "java.io.File$PathStatus");
        Field term3863 = ((Class) term3864).getDeclaredField((String) "INVALID");
        ((Field) term3863).setAccessible(true);
        Object enum13 = ((Field) term3863).get((Object) null);
        HashMap term3820 = new HashMap();
        term3738 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3739 = (byte[]) newByteArray(7);
        Object term3752 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3791 = newInstance(Class.forName("java.io.File"));
        byte[] term3830 = (byte[]) newByteArray(2);
        setByteElement(term3739, 0, (byte) -46);
        setByteElement(term3739, 1, (byte) 14);
        setByteElement(term3739, 2, (byte) 34);
        setByteElement(term3739, 3, (byte) 126);
        setByteElement(term3739, 4, (byte) 7);
        setByteElement(term3739, 5, (byte) -96);
        setByteElement(term3739, 6, (byte) -22);
        setField(term3738, term3738.getClass(), "SMALL_BUF", term3739);
        setIntField(term3738, term3738.getClass(), "recordSize", 1090617576);
        setIntField(term3738, term3738.getClass(), "blockSize", -1547384488);
        setBooleanField(term3738, term3738.getClass(), "hasHitEOF", false);
        setLongField(term3738, term3738.getClass(), "entrySize", -5786861555969446503L);
        setLongField(term3738, term3738.getClass(), "entryOffset", 2354625302846375590L);
        setField(term3738, term3738.getClass(), "is", null);
        setField(term3752, term3752.getClass(), "name", "");
        setBooleanField(term3752, term3752.getClass(), "preserveLeadingSlashes", true);
        setIntField(term3752, term3752.getClass(), "mode", 1442160736);
        setLongField(term3752, term3752.getClass(), "userId", 7276637106827860087L);
        setLongField(term3752, term3752.getClass(), "groupId", -3936701866695933852L);
        setLongField(term3752, term3752.getClass(), "size", 1215116475929634177L);
        setLongField(term3752, term3752.getClass(), "modTime", 1597484336218508869L);
        setBooleanField(term3752, term3752.getClass(), "checkSumOK", false);
        setByteField(term3752, term3752.getClass(), "linkFlag", (byte) -5);
        setField(term3752, term3752.getClass(), "linkName", "");
        setField(term3752, term3752.getClass(), "magic", "ustar ");
        setField(term3752, term3752.getClass(), "version", "00");
        setField(term3752, term3752.getClass(), "userName", "root");
        setField(term3752, term3752.getClass(), "groupName", "");
        setIntField(term3752, term3752.getClass(), "devMajor", 1114000454);
        setIntField(term3752, term3752.getClass(), "devMinor", -556405712);
        setBooleanField(term3752, term3752.getClass(), "isExtended", false);
        setLongField(term3752, term3752.getClass(), "realSize", -685023850445639859L);
        setBooleanField(term3752, term3752.getClass(), "paxGNUSparse", true);
        setBooleanField(term3752, term3752.getClass(), "starSparse", false);
        setField(term3791, term3791.getClass(), "path", "YRHGsAkhxb");
        setField(term3791, term3791.getClass(), "status", enum13);
        setIntField(term3791, term3791.getClass(), "prefixLength", -1772434990);
        setField(term3791, term3791.getClass(), "filePath", null);
        setField(term3752, term3752.getClass(), "file", term3791);
        setField(term3738, term3738.getClass(), "currEntry", term3752);
        setField(term3738, term3738.getClass(), "zipEncoding", null);
        setField(term3738, term3738.getClass(), "encoding", "ffYhPOzlUs");
        setField(term3738, term3738.getClass(), "globalPaxHeaders", term3820);
        setByteElement(term3830, 0, (byte) -124);
        setByteElement(term3830, 1, (byte) -105);
        setField(term3738, term3738.getClass(), "SINGLE", term3830);
        setLongField(term3738, term3738.getClass(), "bytesRead", -6950146046121430355L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGlobalPaxHeaders", argTypes, term3738, args);
    }

};


