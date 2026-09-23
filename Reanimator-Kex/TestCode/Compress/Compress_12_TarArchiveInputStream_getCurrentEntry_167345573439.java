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

public class TarArchiveInputStream_getCurrentEntry_167345573439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3683;
     Object term151119;
     Object term150940;

    public TarArchiveInputStream_getCurrentEntry_167345573439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152180 = Class.forName((String) "java.io.File$PathStatus");
        Field term152179 = ((Class) term152180).getDeclaredField((String) "INVALID");
        ((Field) term152179).setAccessible(true);
        Object enum47 = ((Field) term152179).get((Object) null);
        term3683 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3687 = (byte[]) newByteArray(1);
        Object term3689 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term3690 = (byte[]) newByteArray(7);
        Object term3703 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3738 = newInstance(Class.forName("java.io.File"));
        byte[] term3755 = (byte[]) newByteArray(7);
        setBooleanField(term3683, term3683.getClass(), "hasHitEOF", true);
        setLongField(term3683, term3683.getClass(), "entrySize", 2701184207686293431L);
        setLongField(term3683, term3683.getClass(), "entryOffset", 4474998035090263139L);
        setByteElement(term3687, 0, (byte) 12);
        setField(term3683, term3683.getClass(), "readBuf", term3687);
        setField(term3689, term3689.getClass(), "inStream", null);
        setField(term3689, term3689.getClass(), "outStream", null);
        setByteElement(term3690, 0, (byte) 79);
        setByteElement(term3690, 1, (byte) -4);
        setByteElement(term3690, 2, (byte) -27);
        setByteElement(term3690, 3, (byte) 120);
        setByteElement(term3690, 4, (byte) -25);
        setByteElement(term3690, 5, (byte) 114);
        setByteElement(term3690, 6, (byte) 105);
        setField(term3689, term3689.getClass(), "blockBuffer", term3690);
        setIntField(term3689, term3689.getClass(), "currBlkIdx", 1953277050);
        setIntField(term3689, term3689.getClass(), "currRecIdx", 1283079251);
        setIntField(term3689, term3689.getClass(), "blockSize", -523949691);
        setIntField(term3689, term3689.getClass(), "recordSize", 1398204340);
        setIntField(term3689, term3689.getClass(), "recsPerBlock", 229204365);
        setField(term3683, term3683.getClass(), "buffer", term3689);
        setField(term3703, term3703.getClass(), "name", "");
        setIntField(term3703, term3703.getClass(), "mode", -461771056);
        setIntField(term3703, term3703.getClass(), "userId", -243422082);
        setIntField(term3703, term3703.getClass(), "groupId", 1384592638);
        setLongField(term3703, term3703.getClass(), "size", 2848819812340321742L);
        setLongField(term3703, term3703.getClass(), "modTime", -8876856890348836498L);
        setByteField(term3703, term3703.getClass(), "linkFlag", (byte) -95);
        setField(term3703, term3703.getClass(), "linkName", "");
        setField(term3703, term3703.getClass(), "magic", "ustar ");
        setField(term3703, term3703.getClass(), "version", "00");
        setField(term3703, term3703.getClass(), "userName", "root");
        setField(term3703, term3703.getClass(), "groupName", "");
        setIntField(term3703, term3703.getClass(), "devMajor", -1002370457);
        setIntField(term3703, term3703.getClass(), "devMinor", -2014576105);
        setBooleanField(term3703, term3703.getClass(), "isExtended", true);
        setLongField(term3703, term3703.getClass(), "realSize", 846579494941632714L);
        setField(term3738, term3738.getClass(), "path", "HyxfbSQYBe");
        setField(term3738, term3738.getClass(), "status", enum47);
        setIntField(term3738, term3738.getClass(), "prefixLength", 1296895584);
        setField(term3738, term3738.getClass(), "filePath", null);
        setField(term3703, term3703.getClass(), "file", term3738);
        setField(term3683, term3683.getClass(), "currEntry", term3703);
        setByteElement(term3755, 0, (byte) -6);
        setByteElement(term3755, 1, (byte) 51);
        setByteElement(term3755, 2, (byte) 122);
        setByteElement(term3755, 3, (byte) 84);
        setByteElement(term3755, 4, (byte) -36);
        setByteElement(term3755, 5, (byte) 103);
        setByteElement(term3755, 6, (byte) -63);
        setField(term3683, term3683.getClass(), "SINGLE", term3755);
        setLongField(term3683, term3683.getClass(), "bytesRead", 6689117472719450333L);
        Class<? extends Object> term152610 = Class.forName((String) "java.io.File$PathStatus");
        Field term152607 = ((Class) term152610).getDeclaredField((String) "INVALID");
        ((Field) term152607).setAccessible(true);
        Object enum50 = ((Field) term152607).get((Object) null);
        term151119 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term151120 = (byte[]) newByteArray(1);
        Object term151121 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term151122 = (byte[]) newByteArray(7);
        Object term151123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term151136 = newInstance(Class.forName("java.io.File"));
        byte[] term151142 = (byte[]) newByteArray(7);
        setBooleanField(term151119, term151119.getClass(), "hasHitEOF", true);
        setLongField(term151119, term151119.getClass(), "entrySize", 2701184207686293431L);
        setLongField(term151119, term151119.getClass(), "entryOffset", 4474998035090263139L);
        setByteElement(term151120, 0, (byte) 12);
        setField(term151119, term151119.getClass(), "readBuf", term151120);
        setField(term151121, term151121.getClass(), "inStream", null);
        setField(term151121, term151121.getClass(), "outStream", null);
        setByteElement(term151122, 0, (byte) 79);
        setByteElement(term151122, 1, (byte) -4);
        setByteElement(term151122, 2, (byte) -27);
        setByteElement(term151122, 3, (byte) 120);
        setByteElement(term151122, 4, (byte) -25);
        setByteElement(term151122, 5, (byte) 114);
        setByteElement(term151122, 6, (byte) 105);
        setField(term151121, term151121.getClass(), "blockBuffer", term151122);
        setIntField(term151121, term151121.getClass(), "currBlkIdx", 1953277050);
        setIntField(term151121, term151121.getClass(), "currRecIdx", 1283079251);
        setIntField(term151121, term151121.getClass(), "blockSize", -523949691);
        setIntField(term151121, term151121.getClass(), "recordSize", 1398204340);
        setIntField(term151121, term151121.getClass(), "recsPerBlock", 229204365);
        setField(term151119, term151119.getClass(), "buffer", term151121);
        setField(term151123, term151123.getClass(), "name", "");
        setIntField(term151123, term151123.getClass(), "mode", -461771056);
        setIntField(term151123, term151123.getClass(), "userId", -243422082);
        setIntField(term151123, term151123.getClass(), "groupId", 1384592638);
        setLongField(term151123, term151123.getClass(), "size", 2848819812340321742L);
        setLongField(term151123, term151123.getClass(), "modTime", -8876856890348836498L);
        setByteField(term151123, term151123.getClass(), "linkFlag", (byte) -95);
        setField(term151123, term151123.getClass(), "linkName", "");
        setField(term151123, term151123.getClass(), "magic", "ustar ");
        setField(term151123, term151123.getClass(), "version", "00");
        setField(term151123, term151123.getClass(), "userName", "root");
        setField(term151123, term151123.getClass(), "groupName", "");
        setIntField(term151123, term151123.getClass(), "devMajor", -1002370457);
        setIntField(term151123, term151123.getClass(), "devMinor", -2014576105);
        setBooleanField(term151123, term151123.getClass(), "isExtended", true);
        setLongField(term151123, term151123.getClass(), "realSize", 846579494941632714L);
        setField(term151136, term151136.getClass(), "path", "HyxfbSQYBe");
        setField(term151136, term151136.getClass(), "status", enum50);
        setIntField(term151136, term151136.getClass(), "prefixLength", 1296895584);
        setField(term151136, term151136.getClass(), "filePath", null);
        setField(term151123, term151123.getClass(), "file", term151136);
        setField(term151119, term151119.getClass(), "currEntry", term151123);
        setByteElement(term151142, 0, (byte) -6);
        setByteElement(term151142, 1, (byte) 51);
        setByteElement(term151142, 2, (byte) 122);
        setByteElement(term151142, 3, (byte) 84);
        setByteElement(term151142, 4, (byte) -36);
        setByteElement(term151142, 5, (byte) 103);
        setByteElement(term151142, 6, (byte) -63);
        setField(term151119, term151119.getClass(), "SINGLE", term151142);
        setLongField(term151119, term151119.getClass(), "bytesRead", 6689117472719450333L);
        Class<? extends Object> term152996 = Class.forName((String) "java.io.File$PathStatus");
        Field term152995 = ((Class) term152996).getDeclaredField((String) "INVALID");
        ((Field) term152995).setAccessible(true);
        Object enum51 = ((Field) term152995).get((Object) null);
        term150940 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term150975 = newInstance(Class.forName("java.io.File"));
        setField(term150940, term150940.getClass(), "name", "");
        setIntField(term150940, term150940.getClass(), "mode", -461771056);
        setIntField(term150940, term150940.getClass(), "userId", -243422082);
        setIntField(term150940, term150940.getClass(), "groupId", 1384592638);
        setLongField(term150940, term150940.getClass(), "size", 2848819812340321742L);
        setLongField(term150940, term150940.getClass(), "modTime", -8876856890348836498L);
        setByteField(term150940, term150940.getClass(), "linkFlag", (byte) -95);
        setField(term150940, term150940.getClass(), "linkName", "");
        setField(term150940, term150940.getClass(), "magic", "ustar ");
        setField(term150940, term150940.getClass(), "version", "00");
        setField(term150940, term150940.getClass(), "userName", "root");
        setField(term150940, term150940.getClass(), "groupName", "");
        setIntField(term150940, term150940.getClass(), "devMajor", -1002370457);
        setIntField(term150940, term150940.getClass(), "devMinor", -2014576105);
        setBooleanField(term150940, term150940.getClass(), "isExtended", true);
        setLongField(term150940, term150940.getClass(), "realSize", 846579494941632714L);
        setField(term150975, term150975.getClass(), "path", "HyxfbSQYBe");
        setField(term150975, term150975.getClass(), "status", enum51);
        setIntField(term150975, term150975.getClass(), "prefixLength", 1296895584);
        setField(term150975, term150975.getClass(), "filePath", null);
        setField(term150940, term150940.getClass(), "file", term150975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentEntry", argTypes, term3683, args);
        assertTrue(recursiveEquals(term3683, term151119));
        assertTrue(recursiveEquals(retValue, term150940));
    }

};


