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
import java.util.LinkedHashMap;
import java.lang.String;

public class TarArchiveOutputStream_addPaxHeadersForBigNumbers_124514513522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757;
     Object term1802;
     Object term1808;

    public TarArchiveOutputStream_addPaxHeadersForBigNumbers_124514513522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1757 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1772 = (byte[]) newByteArray(0);
        byte[] term1774 = (byte[]) newByteArray(6);
        Object term1781 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1785 = (byte[]) newByteArray(5);
        byte[] term1799 = (byte[]) newByteArray(1);
        setLongField(term1757, term1757.getClass(), "currSize", -4443169559037975007L);
        setField(term1757, term1757.getClass(), "currName", "Ghbwtircqb");
        setLongField(term1757, term1757.getClass(), "currBytes", -3842548265506930260L);
        setField(term1757, term1757.getClass(), "recordBuf", term1772);
        setIntField(term1757, term1757.getClass(), "assemLen", -601863069);
        setByteElement(term1774, 0, (byte) 93);
        setByteElement(term1774, 1, (byte) -60);
        setByteElement(term1774, 2, (byte) -4);
        setByteElement(term1774, 3, (byte) 28);
        setByteElement(term1774, 4, (byte) 94);
        setField(term1757, term1757.getClass(), "assemBuf", term1774);
        setField(term1781, term1781.getClass(), "inStream", null);
        setField(term1781, term1781.getClass(), "outStream", null);
        setIntField(term1781, term1781.getClass(), "blockSize", 663292551);
        setIntField(term1781, term1781.getClass(), "recordSize", -1885090354);
        setIntField(term1781, term1781.getClass(), "recsPerBlock", -2066804303);
        setByteElement(term1785, 0, (byte) -96);
        setByteElement(term1785, 1, (byte) -88);
        setByteElement(term1785, 2, (byte) -73);
        setByteElement(term1785, 3, (byte) 105);
        setByteElement(term1785, 4, (byte) -86);
        setField(term1781, term1781.getClass(), "blockBuffer", term1785);
        setIntField(term1781, term1781.getClass(), "currBlkIdx", -1731761810);
        setIntField(term1781, term1781.getClass(), "currRecIdx", 197109649);
        setField(term1757, term1757.getClass(), "buffer", term1781);
        setIntField(term1757, term1757.getClass(), "longFileMode", -1239406390);
        setIntField(term1757, term1757.getClass(), "bigNumberMode", 1557431527);
        setBooleanField(term1757, term1757.getClass(), "closed", false);
        setBooleanField(term1757, term1757.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1757, term1757.getClass(), "finished", true);
        setField(term1757, term1757.getClass(), "out", null);
        setField(term1757, term1757.getClass(), "encoding", null);
        setBooleanField(term1757, term1757.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term1799, 0, (byte) 84);
        setField(term1757, term1757.getClass(), "oneByte", term1799);
        setLongField(term1757, term1757.getClass(), "bytesWritten", -5788180182343976541L);
        term1802 = new LinkedHashMap();
        Class<? extends Object> term1914 = Class.forName((String) "java.io.File$PathStatus");
        Field term1913 = ((Class) term1914).getDeclaredField((String) "INVALID");
        ((Field) term1913).setAccessible(true);
        Object enum1 = ((Field) term1913).get((Object) null);
        term1808 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1844 = newInstance(Class.forName("java.io.File"));
        setField(term1808, term1808.getClass(), "name", "");
        setIntField(term1808, term1808.getClass(), "mode", -1504890659);
        setIntField(term1808, term1808.getClass(), "userId", 1358829571);
        setIntField(term1808, term1808.getClass(), "groupId", 991356662);
        setLongField(term1808, term1808.getClass(), "size", 2936323121573284007L);
        setLongField(term1808, term1808.getClass(), "modTime", -1154553077993834885L);
        setBooleanField(term1808, term1808.getClass(), "checkSumOK", false);
        setByteField(term1808, term1808.getClass(), "linkFlag", (byte) -70);
        setField(term1808, term1808.getClass(), "linkName", "");
        setField(term1808, term1808.getClass(), "magic", "ustar ");
        setField(term1808, term1808.getClass(), "version", "00");
        setField(term1808, term1808.getClass(), "userName", "root");
        setField(term1808, term1808.getClass(), "groupName", "");
        setIntField(term1808, term1808.getClass(), "devMajor", -506958186);
        setIntField(term1808, term1808.getClass(), "devMinor", -507387516);
        setBooleanField(term1808, term1808.getClass(), "isExtended", false);
        setLongField(term1808, term1808.getClass(), "realSize", -2850532706972744550L);
        setField(term1844, term1844.getClass(), "path", "xrwlQZdwCp");
        setField(term1844, term1844.getClass(), "status", enum1);
        setIntField(term1844, term1844.getClass(), "prefixLength", -1970452551);
        setField(term1844, term1844.getClass(), "filePath", null);
        setField(term1808, term1808.getClass(), "file", term1844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term1802;
        args[1] = term1808;
        callMethod(klass, "addPaxHeadersForBigNumbers", argTypes, term1757, args);
    }

};


