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
import java.lang.Integer;

public class TarArchiveInputStream_mark_68468501944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1458;
     Object term1533;
     Object term13844;

    public TarArchiveInputStream_mark_68468501944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13890 = Class.forName((String) "java.io.File$PathStatus");
        Field term13889 = ((Class) term13890).getDeclaredField((String) "INVALID");
        ((Field) term13889).setAccessible(true);
        Object enum34 = ((Field) term13889).get((Object) null);
        term1458 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1459 = (byte[]) newByteArray(1);
        Object term1466 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1502 = newInstance(Class.forName("java.io.File"));
        byte[] term1531 = (byte[]) newByteArray(0);
        setByteElement(term1459, 0, (byte) 116);
        setField(term1458, term1458.getClass(), "SMALL_BUF", term1459);
        setIntField(term1458, term1458.getClass(), "recordSize", -1530420153);
        setIntField(term1458, term1458.getClass(), "blockSize", -469968304);
        setBooleanField(term1458, term1458.getClass(), "hasHitEOF", false);
        setLongField(term1458, term1458.getClass(), "entrySize", -2068172595987555756L);
        setLongField(term1458, term1458.getClass(), "entryOffset", -6292278961887936280L);
        setField(term1458, term1458.getClass(), "is", null);
        setField(term1466, term1466.getClass(), "name", "");
        setIntField(term1466, term1466.getClass(), "mode", -1145578966);
        setLongField(term1466, term1466.getClass(), "userId", -6645965768855543712L);
        setLongField(term1466, term1466.getClass(), "groupId", 4784595517102746672L);
        setLongField(term1466, term1466.getClass(), "size", -7612550318181586304L);
        setLongField(term1466, term1466.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term1466, term1466.getClass(), "checkSumOK", true);
        setByteField(term1466, term1466.getClass(), "linkFlag", (byte) -81);
        setField(term1466, term1466.getClass(), "linkName", "");
        setField(term1466, term1466.getClass(), "magic", "ustar ");
        setField(term1466, term1466.getClass(), "version", "00");
        setField(term1466, term1466.getClass(), "userName", "root");
        setField(term1466, term1466.getClass(), "groupName", "");
        setIntField(term1466, term1466.getClass(), "devMajor", 679763016);
        setIntField(term1466, term1466.getClass(), "devMinor", 1962444399);
        setBooleanField(term1466, term1466.getClass(), "isExtended", true);
        setLongField(term1466, term1466.getClass(), "realSize", 4044358158040652353L);
        setField(term1502, term1502.getClass(), "path", "LQFpaHEwXR");
        setField(term1502, term1502.getClass(), "status", enum34);
        setIntField(term1502, term1502.getClass(), "prefixLength", 767834723);
        setField(term1502, term1502.getClass(), "filePath", null);
        setField(term1466, term1466.getClass(), "file", term1502);
        setField(term1458, term1458.getClass(), "currEntry", term1466);
        setField(term1458, term1458.getClass(), "zipEncoding", null);
        setField(term1458, term1458.getClass(), "encoding", "oVcInYnLWB");
        setField(term1458, term1458.getClass(), "SINGLE", term1531);
        setLongField(term1458, term1458.getClass(), "bytesRead", -4443169559037975007L);
        term1533 = new Integer(-602026508);
        Class<? extends Object> term14066 = Class.forName((String) "java.io.File$PathStatus");
        Field term14065 = ((Class) term14066).getDeclaredField((String) "INVALID");
        ((Field) term14065).setAccessible(true);
        Object enum35 = ((Field) term14065).get((Object) null);
        term13844 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13845 = (byte[]) newByteArray(1);
        Object term13846 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13859 = newInstance(Class.forName("java.io.File"));
        byte[] term13866 = (byte[]) newByteArray(0);
        setByteElement(term13845, 0, (byte) 116);
        setField(term13844, term13844.getClass(), "SMALL_BUF", term13845);
        setIntField(term13844, term13844.getClass(), "recordSize", -1530420153);
        setIntField(term13844, term13844.getClass(), "blockSize", -469968304);
        setBooleanField(term13844, term13844.getClass(), "hasHitEOF", false);
        setLongField(term13844, term13844.getClass(), "entrySize", -2068172595987555756L);
        setLongField(term13844, term13844.getClass(), "entryOffset", -6292278961887936280L);
        setField(term13844, term13844.getClass(), "is", null);
        setField(term13846, term13846.getClass(), "name", "");
        setIntField(term13846, term13846.getClass(), "mode", -1145578966);
        setLongField(term13846, term13846.getClass(), "userId", -6645965768855543712L);
        setLongField(term13846, term13846.getClass(), "groupId", 4784595517102746672L);
        setLongField(term13846, term13846.getClass(), "size", -7612550318181586304L);
        setLongField(term13846, term13846.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term13846, term13846.getClass(), "checkSumOK", true);
        setByteField(term13846, term13846.getClass(), "linkFlag", (byte) -81);
        setField(term13846, term13846.getClass(), "linkName", "");
        setField(term13846, term13846.getClass(), "magic", "ustar ");
        setField(term13846, term13846.getClass(), "version", "00");
        setField(term13846, term13846.getClass(), "userName", "root");
        setField(term13846, term13846.getClass(), "groupName", "");
        setIntField(term13846, term13846.getClass(), "devMajor", 679763016);
        setIntField(term13846, term13846.getClass(), "devMinor", 1962444399);
        setBooleanField(term13846, term13846.getClass(), "isExtended", true);
        setLongField(term13846, term13846.getClass(), "realSize", 4044358158040652353L);
        setField(term13859, term13859.getClass(), "path", "LQFpaHEwXR");
        setField(term13859, term13859.getClass(), "status", enum35);
        setIntField(term13859, term13859.getClass(), "prefixLength", 767834723);
        setField(term13859, term13859.getClass(), "filePath", null);
        setField(term13846, term13846.getClass(), "file", term13859);
        setField(term13844, term13844.getClass(), "currEntry", term13846);
        setField(term13844, term13844.getClass(), "zipEncoding", null);
        setField(term13844, term13844.getClass(), "encoding", "oVcInYnLWB");
        setField(term13844, term13844.getClass(), "SINGLE", term13866);
        setLongField(term13844, term13844.getClass(), "bytesRead", -4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1533;
        callMethod(klass, "mark", argTypes, term1458, args);
        assertTrue(recursiveEquals(term1458, term13844));
        assertTrue(recursiveEquals(term1533, -602026508));
    }

};


