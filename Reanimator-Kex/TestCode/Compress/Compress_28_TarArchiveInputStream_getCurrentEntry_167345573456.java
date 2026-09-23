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

public class TarArchiveInputStream_getCurrentEntry_167345573456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4883;
     Object term19939;
     Object term18941;

    public TarArchiveInputStream_getCurrentEntry_167345573456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19986 = Class.forName((String) "java.io.File$PathStatus");
        Field term19985 = ((Class) term19986).getDeclaredField((String) "INVALID");
        ((Field) term19985).setAccessible(true);
        Object enum57 = ((Field) term19985).get((Object) null);
        term4883 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4884 = (byte[]) newByteArray(3);
        Object term4893 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4929 = newInstance(Class.forName("java.io.File"));
        byte[] term4946 = (byte[]) newByteArray(4);
        setByteElement(term4884, 0, (byte) -50);
        setByteElement(term4884, 1, (byte) -79);
        setByteElement(term4884, 2, (byte) 110);
        setField(term4883, term4883.getClass(), "SMALL_BUF", term4884);
        setIntField(term4883, term4883.getClass(), "recordSize", 1283079251);
        setIntField(term4883, term4883.getClass(), "blockSize", -523949691);
        setBooleanField(term4883, term4883.getClass(), "hasHitEOF", true);
        setLongField(term4883, term4883.getClass(), "entrySize", -4924950707540628022L);
        setLongField(term4883, term4883.getClass(), "entryOffset", -4393710401270724527L);
        setField(term4883, term4883.getClass(), "is", null);
        setField(term4893, term4893.getClass(), "name", "");
        setIntField(term4893, term4893.getClass(), "mode", 1398204340);
        setIntField(term4893, term4893.getClass(), "userId", 229204365);
        setIntField(term4893, term4893.getClass(), "groupId", -461771056);
        setLongField(term4893, term4893.getClass(), "size", -4822736661741380518L);
        setLongField(term4893, term4893.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term4893, term4893.getClass(), "checkSumOK", false);
        setByteField(term4893, term4893.getClass(), "linkFlag", (byte) -111);
        setField(term4893, term4893.getClass(), "linkName", "");
        setField(term4893, term4893.getClass(), "magic", "ustar ");
        setField(term4893, term4893.getClass(), "version", "00");
        setField(term4893, term4893.getClass(), "userName", "root");
        setField(term4893, term4893.getClass(), "groupName", "");
        setIntField(term4893, term4893.getClass(), "devMajor", -243422082);
        setIntField(term4893, term4893.getClass(), "devMinor", 1384592638);
        setBooleanField(term4893, term4893.getClass(), "isExtended", false);
        setLongField(term4893, term4893.getClass(), "realSize", -7268507582722666254L);
        setField(term4929, term4929.getClass(), "path", "wSQxaModmm");
        setField(term4929, term4929.getClass(), "status", enum57);
        setIntField(term4929, term4929.getClass(), "prefixLength", -1002370457);
        setField(term4929, term4929.getClass(), "filePath", null);
        setField(term4893, term4893.getClass(), "file", term4929);
        setField(term4883, term4883.getClass(), "currEntry", term4893);
        setField(term4883, term4883.getClass(), "encoding", null);
        setByteElement(term4946, 0, (byte) -54);
        setByteElement(term4946, 1, (byte) -25);
        setByteElement(term4946, 2, (byte) -35);
        setByteElement(term4946, 3, (byte) 3);
        setField(term4883, term4883.getClass(), "SINGLE", term4946);
        setLongField(term4883, term4883.getClass(), "bytesRead", 5671808784468963649L);
        Class<? extends Object> term20158 = Class.forName((String) "java.io.File$PathStatus");
        Field term20157 = ((Class) term20158).getDeclaredField((String) "CHECKED");
        ((Field) term20157).setAccessible(true);
        Object enum58 = ((Field) term20157).get((Object) null);
        term19939 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19940 = (byte[]) newByteArray(3);
        Object term19941 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19954 = newInstance(Class.forName("java.io.File"));
        byte[] term19960 = (byte[]) newByteArray(4);
        setByteElement(term19940, 0, (byte) -50);
        setByteElement(term19940, 1, (byte) -79);
        setByteElement(term19940, 2, (byte) 110);
        setField(term19939, term19939.getClass(), "SMALL_BUF", term19940);
        setIntField(term19939, term19939.getClass(), "recordSize", 1283079251);
        setIntField(term19939, term19939.getClass(), "blockSize", -523949691);
        setBooleanField(term19939, term19939.getClass(), "hasHitEOF", true);
        setLongField(term19939, term19939.getClass(), "entrySize", -4924950707540628022L);
        setLongField(term19939, term19939.getClass(), "entryOffset", -4393710401270724527L);
        setField(term19939, term19939.getClass(), "is", null);
        setField(term19941, term19941.getClass(), "name", "");
        setIntField(term19941, term19941.getClass(), "mode", 1398204340);
        setIntField(term19941, term19941.getClass(), "userId", 229204365);
        setIntField(term19941, term19941.getClass(), "groupId", -461771056);
        setLongField(term19941, term19941.getClass(), "size", -4822736661741380518L);
        setLongField(term19941, term19941.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term19941, term19941.getClass(), "checkSumOK", false);
        setByteField(term19941, term19941.getClass(), "linkFlag", (byte) -111);
        setField(term19941, term19941.getClass(), "linkName", "");
        setField(term19941, term19941.getClass(), "magic", "ustar ");
        setField(term19941, term19941.getClass(), "version", "00");
        setField(term19941, term19941.getClass(), "userName", "root");
        setField(term19941, term19941.getClass(), "groupName", "");
        setIntField(term19941, term19941.getClass(), "devMajor", -243422082);
        setIntField(term19941, term19941.getClass(), "devMinor", 1384592638);
        setBooleanField(term19941, term19941.getClass(), "isExtended", false);
        setLongField(term19941, term19941.getClass(), "realSize", -7268507582722666254L);
        setField(term19954, term19954.getClass(), "path", "wSQxaModmm");
        setField(term19954, term19954.getClass(), "status", enum58);
        setIntField(term19954, term19954.getClass(), "prefixLength", -1002370457);
        setField(term19954, term19954.getClass(), "filePath", null);
        setField(term19941, term19941.getClass(), "file", term19954);
        setField(term19939, term19939.getClass(), "currEntry", term19941);
        setField(term19939, term19939.getClass(), "encoding", null);
        setByteElement(term19960, 0, (byte) -54);
        setByteElement(term19960, 1, (byte) -25);
        setByteElement(term19960, 2, (byte) -35);
        setByteElement(term19960, 3, (byte) 3);
        setField(term19939, term19939.getClass(), "SINGLE", term19960);
        setLongField(term19939, term19939.getClass(), "bytesRead", 5671808784468963649L);
        Class<? extends Object> term20327 = Class.forName((String) "java.io.File$PathStatus");
        Field term20326 = ((Class) term20327).getDeclaredField((String) "CHECKED");
        ((Field) term20326).setAccessible(true);
        Object enum59 = ((Field) term20326).get((Object) null);
        term18941 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18977 = newInstance(Class.forName("java.io.File"));
        setField(term18941, term18941.getClass(), "name", "");
        setIntField(term18941, term18941.getClass(), "mode", 1398204340);
        setIntField(term18941, term18941.getClass(), "userId", 229204365);
        setIntField(term18941, term18941.getClass(), "groupId", -461771056);
        setLongField(term18941, term18941.getClass(), "size", -4822736661741380518L);
        setLongField(term18941, term18941.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term18941, term18941.getClass(), "checkSumOK", false);
        setByteField(term18941, term18941.getClass(), "linkFlag", (byte) -111);
        setField(term18941, term18941.getClass(), "linkName", "");
        setField(term18941, term18941.getClass(), "magic", "ustar ");
        setField(term18941, term18941.getClass(), "version", "00");
        setField(term18941, term18941.getClass(), "userName", "root");
        setField(term18941, term18941.getClass(), "groupName", "");
        setIntField(term18941, term18941.getClass(), "devMajor", -243422082);
        setIntField(term18941, term18941.getClass(), "devMinor", 1384592638);
        setBooleanField(term18941, term18941.getClass(), "isExtended", false);
        setLongField(term18941, term18941.getClass(), "realSize", -7268507582722666254L);
        setField(term18977, term18977.getClass(), "path", "wSQxaModmm");
        setField(term18977, term18977.getClass(), "status", enum59);
        setIntField(term18977, term18977.getClass(), "prefixLength", -1002370457);
        setField(term18977, term18977.getClass(), "filePath", null);
        setField(term18941, term18941.getClass(), "file", term18977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentEntry", argTypes, term4883, args);
        assertTrue(recursiveEquals(term4883, term19939));
        assertTrue(recursiveEquals(retValue, term18941));
    }

};


