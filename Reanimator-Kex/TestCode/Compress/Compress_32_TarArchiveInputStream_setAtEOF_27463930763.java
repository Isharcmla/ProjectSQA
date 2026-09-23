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
import java.lang.Boolean;

public class TarArchiveInputStream_setAtEOF_27463930763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6670;
     Object term6752;
     Object term23863;

    public TarArchiveInputStream_setAtEOF_27463930763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23916 = Class.forName((String) "java.io.File$PathStatus");
        Field term23915 = ((Class) term23916).getDeclaredField((String) "INVALID");
        ((Field) term23915).setAccessible(true);
        Object enum66 = ((Field) term23915).get((Object) null);
        term6670 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6671 = (byte[]) newByteArray(8);
        Object term6685 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6721 = newInstance(Class.forName("java.io.File"));
        byte[] term6750 = (byte[]) newByteArray(0);
        setByteElement(term6671, 0, (byte) 90);
        setByteElement(term6671, 1, (byte) 10);
        setByteElement(term6671, 2, (byte) 87);
        setByteElement(term6671, 3, (byte) -35);
        setByteElement(term6671, 4, (byte) -14);
        setByteElement(term6671, 5, (byte) 10);
        setByteElement(term6671, 6, (byte) 65);
        setByteElement(term6671, 7, (byte) -44);
        setField(term6670, term6670.getClass(), "SMALL_BUF", term6671);
        setIntField(term6670, term6670.getClass(), "recordSize", -227365013);
        setIntField(term6670, term6670.getClass(), "blockSize", 11724947);
        setBooleanField(term6670, term6670.getClass(), "hasHitEOF", false);
        setLongField(term6670, term6670.getClass(), "entrySize", 4199886998224701110L);
        setLongField(term6670, term6670.getClass(), "entryOffset", 8540994973773607992L);
        setField(term6670, term6670.getClass(), "is", null);
        setField(term6685, term6685.getClass(), "name", "");
        setIntField(term6685, term6685.getClass(), "mode", 1953277050);
        setLongField(term6685, term6685.getClass(), "userId", -2338103433822116635L);
        setLongField(term6685, term6685.getClass(), "groupId", -1885698929232124806L);
        setLongField(term6685, term6685.getClass(), "size", 5731563613239387113L);
        setLongField(term6685, term6685.getClass(), "modTime", 3381333711768010594L);
        setBooleanField(term6685, term6685.getClass(), "checkSumOK", false);
        setByteField(term6685, term6685.getClass(), "linkFlag", (byte) 115);
        setField(term6685, term6685.getClass(), "linkName", "");
        setField(term6685, term6685.getClass(), "magic", "ustar ");
        setField(term6685, term6685.getClass(), "version", "00");
        setField(term6685, term6685.getClass(), "userName", "root");
        setField(term6685, term6685.getClass(), "groupName", "");
        setIntField(term6685, term6685.getClass(), "devMajor", 1283079251);
        setIntField(term6685, term6685.getClass(), "devMinor", -523949691);
        setBooleanField(term6685, term6685.getClass(), "isExtended", true);
        setLongField(term6685, term6685.getClass(), "realSize", 3580984732036213717L);
        setField(term6721, term6721.getClass(), "path", "hoicvmsovO");
        setField(term6721, term6721.getClass(), "status", enum66);
        setIntField(term6721, term6721.getClass(), "prefixLength", 1398204340);
        setField(term6721, term6721.getClass(), "filePath", null);
        setField(term6685, term6685.getClass(), "file", term6721);
        setField(term6670, term6670.getClass(), "currEntry", term6685);
        setField(term6670, term6670.getClass(), "zipEncoding", null);
        setField(term6670, term6670.getClass(), "encoding", "eqJfYWRaEL");
        setField(term6670, term6670.getClass(), "SINGLE", term6750);
        setLongField(term6670, term6670.getClass(), "bytesRead", 5330761990446327930L);
        term6752 = new Boolean(false);
        Class<? extends Object> term24099 = Class.forName((String) "java.io.File$PathStatus");
        Field term24098 = ((Class) term24099).getDeclaredField((String) "INVALID");
        ((Field) term24098).setAccessible(true);
        Object enum67 = ((Field) term24098).get((Object) null);
        term23863 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23864 = (byte[]) newByteArray(8);
        Object term23865 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23878 = newInstance(Class.forName("java.io.File"));
        byte[] term23885 = (byte[]) newByteArray(0);
        setByteElement(term23864, 0, (byte) 90);
        setByteElement(term23864, 1, (byte) 10);
        setByteElement(term23864, 2, (byte) 87);
        setByteElement(term23864, 3, (byte) -35);
        setByteElement(term23864, 4, (byte) -14);
        setByteElement(term23864, 5, (byte) 10);
        setByteElement(term23864, 6, (byte) 65);
        setByteElement(term23864, 7, (byte) -44);
        setField(term23863, term23863.getClass(), "SMALL_BUF", term23864);
        setIntField(term23863, term23863.getClass(), "recordSize", -227365013);
        setIntField(term23863, term23863.getClass(), "blockSize", 11724947);
        setBooleanField(term23863, term23863.getClass(), "hasHitEOF", false);
        setLongField(term23863, term23863.getClass(), "entrySize", 4199886998224701110L);
        setLongField(term23863, term23863.getClass(), "entryOffset", 8540994973773607992L);
        setField(term23863, term23863.getClass(), "is", null);
        setField(term23865, term23865.getClass(), "name", "");
        setIntField(term23865, term23865.getClass(), "mode", 1953277050);
        setLongField(term23865, term23865.getClass(), "userId", -2338103433822116635L);
        setLongField(term23865, term23865.getClass(), "groupId", -1885698929232124806L);
        setLongField(term23865, term23865.getClass(), "size", 5731563613239387113L);
        setLongField(term23865, term23865.getClass(), "modTime", 3381333711768010594L);
        setBooleanField(term23865, term23865.getClass(), "checkSumOK", false);
        setByteField(term23865, term23865.getClass(), "linkFlag", (byte) 115);
        setField(term23865, term23865.getClass(), "linkName", "");
        setField(term23865, term23865.getClass(), "magic", "ustar ");
        setField(term23865, term23865.getClass(), "version", "00");
        setField(term23865, term23865.getClass(), "userName", "root");
        setField(term23865, term23865.getClass(), "groupName", "");
        setIntField(term23865, term23865.getClass(), "devMajor", 1283079251);
        setIntField(term23865, term23865.getClass(), "devMinor", -523949691);
        setBooleanField(term23865, term23865.getClass(), "isExtended", true);
        setLongField(term23865, term23865.getClass(), "realSize", 3580984732036213717L);
        setField(term23878, term23878.getClass(), "path", "hoicvmsovO");
        setField(term23878, term23878.getClass(), "status", enum67);
        setIntField(term23878, term23878.getClass(), "prefixLength", 1398204340);
        setField(term23878, term23878.getClass(), "filePath", null);
        setField(term23865, term23865.getClass(), "file", term23878);
        setField(term23863, term23863.getClass(), "currEntry", term23865);
        setField(term23863, term23863.getClass(), "zipEncoding", null);
        setField(term23863, term23863.getClass(), "encoding", "eqJfYWRaEL");
        setField(term23863, term23863.getClass(), "SINGLE", term23885);
        setLongField(term23863, term23863.getClass(), "bytesRead", 5330761990446327930L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6752;
        callMethod(klass, "setAtEOF", argTypes, term6670, args);
        assertTrue(recursiveEquals(term6670, term23863));
        assertTrue(recursiveEquals(term6752, false));
    }

};


