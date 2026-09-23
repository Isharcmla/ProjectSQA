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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_readOldGNUSparse_51340877758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4977;

    public TarArchiveInputStream_readOldGNUSparse_51340877758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21652 = Class.forName((String) "java.io.File$PathStatus");
        Field term21651 = ((Class) term21652).getDeclaredField((String) "INVALID");
        ((Field) term21651).setAccessible(true);
        Object enum57 = ((Field) term21651).get((Object) null);
        HashMap term5056 = new HashMap();
        term4977 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4978 = (byte[]) newByteArray(4);
        Object term4988 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5027 = newInstance(Class.forName("java.io.File"));
        byte[] term5066 = (byte[]) newByteArray(0);
        setByteElement(term4978, 0, (byte) 103);
        setByteElement(term4978, 1, (byte) 23);
        setByteElement(term4978, 2, (byte) 96);
        setByteElement(term4978, 3, (byte) -70);
        setField(term4977, term4977.getClass(), "SMALL_BUF", term4978);
        setIntField(term4977, term4977.getClass(), "recordSize", -1476117762);
        setIntField(term4977, term4977.getClass(), "blockSize", -341962980);
        setBooleanField(term4977, term4977.getClass(), "hasHitEOF", false);
        setLongField(term4977, term4977.getClass(), "entrySize", 7495904023107549024L);
        setLongField(term4977, term4977.getClass(), "entryOffset", 8802866251294305945L);
        setField(term4977, term4977.getClass(), "is", null);
        setField(term4988, term4988.getClass(), "name", "");
        setBooleanField(term4988, term4988.getClass(), "preserveLeadingSlashes", false);
        setIntField(term4988, term4988.getClass(), "mode", 1532716628);
        setLongField(term4988, term4988.getClass(), "userId", 4513004407927379358L);
        setLongField(term4988, term4988.getClass(), "groupId", -7115418542247301000L);
        setLongField(term4988, term4988.getClass(), "size", 8034714140377562739L);
        setLongField(term4988, term4988.getClass(), "modTime", -2924531382671518368L);
        setBooleanField(term4988, term4988.getClass(), "checkSumOK", true);
        setByteField(term4988, term4988.getClass(), "linkFlag", (byte) -73);
        setField(term4988, term4988.getClass(), "linkName", "");
        setField(term4988, term4988.getClass(), "magic", "ustar ");
        setField(term4988, term4988.getClass(), "version", "00");
        setField(term4988, term4988.getClass(), "userName", "root");
        setField(term4988, term4988.getClass(), "groupName", "");
        setIntField(term4988, term4988.getClass(), "devMajor", -1801760683);
        setIntField(term4988, term4988.getClass(), "devMinor", 1141317871);
        setBooleanField(term4988, term4988.getClass(), "isExtended", true);
        setLongField(term4988, term4988.getClass(), "realSize", -3948863953565024517L);
        setBooleanField(term4988, term4988.getClass(), "paxGNUSparse", true);
        setBooleanField(term4988, term4988.getClass(), "starSparse", false);
        setField(term5027, term5027.getClass(), "path", "bWWfajKbEX");
        setField(term5027, term5027.getClass(), "status", enum57);
        setIntField(term5027, term5027.getClass(), "prefixLength", 890669485);
        setField(term5027, term5027.getClass(), "filePath", null);
        setField(term4988, term4988.getClass(), "file", term5027);
        setField(term4977, term4977.getClass(), "currEntry", term4988);
        setField(term4977, term4977.getClass(), "zipEncoding", null);
        setField(term4977, term4977.getClass(), "encoding", "cAPeiZHKGJ");
        setField(term4977, term4977.getClass(), "globalPaxHeaders", term5056);
        setField(term4977, term4977.getClass(), "SINGLE", term5066);
        setLongField(term4977, term4977.getClass(), "bytesRead", -6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readOldGNUSparse", argTypes, term4977, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


