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

public class TarArchiveInputStream_getNextEntry_36885160323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714;

    public TarArchiveInputStream_getNextEntry_36885160323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4830 = Class.forName((String) "java.io.File$PathStatus");
        Field term4829 = ((Class) term4830).getDeclaredField((String) "CHECKED");
        ((Field) term4829).setAccessible(true);
        Object enum17 = ((Field) term4829).get((Object) null);
        term4714 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4715 = (byte[]) newByteArray(8);
        Object term4729 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4765 = newInstance(Class.forName("java.io.File"));
        byte[] term4794 = (byte[]) newByteArray(3);
        setByteElement(term4715, 0, (byte) 122);
        setByteElement(term4715, 1, (byte) 83);
        setByteElement(term4715, 2, (byte) -123);
        setByteElement(term4715, 3, (byte) -76);
        setByteElement(term4715, 4, (byte) -115);
        setByteElement(term4715, 5, (byte) -48);
        setByteElement(term4715, 6, (byte) 126);
        setByteElement(term4715, 7, (byte) -2);
        setField(term4714, term4714.getClass(), "SMALL_BUF", term4715);
        setIntField(term4714, term4714.getClass(), "recordSize", -1476117762);
        setIntField(term4714, term4714.getClass(), "blockSize", -341962980);
        setBooleanField(term4714, term4714.getClass(), "hasHitEOF", false);
        setLongField(term4714, term4714.getClass(), "entrySize", 7495904023107549024L);
        setLongField(term4714, term4714.getClass(), "entryOffset", 8802866251294305945L);
        setField(term4714, term4714.getClass(), "is", null);
        setField(term4729, term4729.getClass(), "name", "");
        setIntField(term4729, term4729.getClass(), "mode", 1532716628);
        setLongField(term4729, term4729.getClass(), "userId", 4513004407927379358L);
        setLongField(term4729, term4729.getClass(), "groupId", -7115418542247301000L);
        setLongField(term4729, term4729.getClass(), "size", 8034714140377562739L);
        setLongField(term4729, term4729.getClass(), "modTime", -2924531382671518368L);
        setBooleanField(term4729, term4729.getClass(), "checkSumOK", true);
        setByteField(term4729, term4729.getClass(), "linkFlag", (byte) 103);
        setField(term4729, term4729.getClass(), "linkName", "");
        setField(term4729, term4729.getClass(), "magic", "ustar ");
        setField(term4729, term4729.getClass(), "version", "00");
        setField(term4729, term4729.getClass(), "userName", "root");
        setField(term4729, term4729.getClass(), "groupName", "");
        setIntField(term4729, term4729.getClass(), "devMajor", -1801760683);
        setIntField(term4729, term4729.getClass(), "devMinor", 1141317871);
        setBooleanField(term4729, term4729.getClass(), "isExtended", false);
        setLongField(term4729, term4729.getClass(), "realSize", -3948863953565024517L);
        setField(term4765, term4765.getClass(), "path", "LvtrsXUliU");
        setField(term4765, term4765.getClass(), "status", enum17);
        setIntField(term4765, term4765.getClass(), "prefixLength", 890669485);
        setField(term4765, term4765.getClass(), "filePath", null);
        setField(term4729, term4729.getClass(), "file", term4765);
        setField(term4714, term4714.getClass(), "currEntry", term4729);
        setField(term4714, term4714.getClass(), "zipEncoding", null);
        setField(term4714, term4714.getClass(), "encoding", "xLbjWUgOIL");
        setByteElement(term4794, 0, (byte) 23);
        setByteElement(term4794, 1, (byte) 96);
        setByteElement(term4794, 2, (byte) -70);
        setField(term4714, term4714.getClass(), "SINGLE", term4794);
        setLongField(term4714, term4714.getClass(), "bytesRead", -6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextEntry", argTypes, term4714, args);
    }

};


