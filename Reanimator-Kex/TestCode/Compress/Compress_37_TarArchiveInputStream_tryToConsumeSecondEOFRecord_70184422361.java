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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5819;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22967 = Class.forName((String) "java.io.File$PathStatus");
        Field term22966 = ((Class) term22967).getDeclaredField((String) "CHECKED");
        ((Field) term22966).setAccessible(true);
        Object enum59 = ((Field) term22966).get((Object) null);
        HashMap term5896 = new HashMap();
        term5819 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5820 = (byte[]) newByteArray(2);
        Object term5828 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5867 = newInstance(Class.forName("java.io.File"));
        byte[] term5906 = (byte[]) newByteArray(5);
        setByteElement(term5820, 0, (byte) 105);
        setByteElement(term5820, 1, (byte) -95);
        setField(term5819, term5819.getClass(), "SMALL_BUF", term5820);
        setIntField(term5819, term5819.getClass(), "recordSize", 1107176718);
        setIntField(term5819, term5819.getClass(), "blockSize", 480137250);
        setBooleanField(term5819, term5819.getClass(), "hasHitEOF", false);
        setLongField(term5819, term5819.getClass(), "entrySize", -2783999800714825789L);
        setLongField(term5819, term5819.getClass(), "entryOffset", 4266570509071948633L);
        setField(term5819, term5819.getClass(), "is", null);
        setField(term5828, term5828.getClass(), "name", "");
        setBooleanField(term5828, term5828.getClass(), "preserveLeadingSlashes", false);
        setIntField(term5828, term5828.getClass(), "mode", -341152642);
        setLongField(term5828, term5828.getClass(), "userId", -7291742736502427077L);
        setLongField(term5828, term5828.getClass(), "groupId", -8121849829073967555L);
        setLongField(term5828, term5828.getClass(), "size", 5219030281405653303L);
        setLongField(term5828, term5828.getClass(), "modTime", -8471550651709805183L);
        setBooleanField(term5828, term5828.getClass(), "checkSumOK", false);
        setByteField(term5828, term5828.getClass(), "linkFlag", (byte) -6);
        setField(term5828, term5828.getClass(), "linkName", "");
        setField(term5828, term5828.getClass(), "magic", "ustar ");
        setField(term5828, term5828.getClass(), "version", "00");
        setField(term5828, term5828.getClass(), "userName", "root");
        setField(term5828, term5828.getClass(), "groupName", "");
        setIntField(term5828, term5828.getClass(), "devMajor", -2015854073);
        setIntField(term5828, term5828.getClass(), "devMinor", 538259104);
        setBooleanField(term5828, term5828.getClass(), "isExtended", false);
        setLongField(term5828, term5828.getClass(), "realSize", -948292411727204525L);
        setBooleanField(term5828, term5828.getClass(), "paxGNUSparse", false);
        setBooleanField(term5828, term5828.getClass(), "starSparse", false);
        setField(term5867, term5867.getClass(), "path", "DfISiziTgG");
        setField(term5867, term5867.getClass(), "status", enum59);
        setIntField(term5867, term5867.getClass(), "prefixLength", 96566506);
        setField(term5867, term5867.getClass(), "filePath", null);
        setField(term5828, term5828.getClass(), "file", term5867);
        setField(term5819, term5819.getClass(), "currEntry", term5828);
        setField(term5819, term5819.getClass(), "zipEncoding", null);
        setField(term5819, term5819.getClass(), "encoding", "XqgfKFvPSD");
        setField(term5819, term5819.getClass(), "globalPaxHeaders", term5896);
        setByteElement(term5906, 0, (byte) 51);
        setByteElement(term5906, 1, (byte) 122);
        setByteElement(term5906, 2, (byte) 84);
        setByteElement(term5906, 3, (byte) -36);
        setByteElement(term5906, 4, (byte) 103);
        setField(term5819, term5819.getClass(), "SINGLE", term5906);
        setLongField(term5819, term5819.getClass(), "bytesRead", -8892586408602479513L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term5819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


